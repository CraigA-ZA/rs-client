import java.security.SecureRandom;
import java.util.Arrays;
import java.util.concurrent.Callable;

public class SecureRandomCallable implements Callable {
   static int Interpreter_stringStackSize;

   public static void bv_renamed(Component var0, PlayerAppearance var1, boolean var2) {
      var0.modelType = 883531787;
      var0.dd = new PlayerAppearance(var1);
      if (!var2) {
         var0.dd.an = Arrays.copyOf(var0.dd.af, var0.dd.af.length);
         var0.dd.ax();
      }

   }

   public Object call() {
      SecureRandom var2 = new SecureRandom();
      var2.nextInt();
      return var2;
   }

   SecureRandomCallable() {
   }
}
