import accessors.RSSecureRandomCallable;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.concurrent.Callable;

public class dm implements Callable, RSSecureRandomCallable {
   static int ay;

   public static void bv(mq var0, mw var1, boolean var2, short var3) {
      try {
         var0.dr = 883531787;
         var0.dd = new mw(var1);
         if (!var2) {
            if (var3 == 233) {
               throw new IllegalStateException();
            }

            var0.dd.an = Arrays.copyOf(var0.dd.af, var0.dd.af.length);
            var0.dd.ax(-469114674);
         }

      } catch (RuntimeException var4) {
         throw db.an(var4, "dm.bv(" + ')');
      }
   }

   public Object call() {
      try {
         SecureRandom var2 = new SecureRandom();
         var2.nextInt();
         return var2;
      } catch (RuntimeException var3) {
         throw db.an(var3, "dm.call(" + ')');
      }
   }

   public Object af() {
      SecureRandom var2 = new SecureRandom();
      var2.nextInt();
      return var2;
   }

   public Object an() {
      SecureRandom var2 = new SecureRandom();
      var2.nextInt();
      return var2;
   }

   public Object aw() {
      SecureRandom var2 = new SecureRandom();
      var2.nextInt();
      return var2;
   }

   dm() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw db.an(var1, "dm.<init>(" + ')');
      }
   }
}
