import java.io.IOException;
import java.net.Socket;

public class hu {
   static short[][][] ac;

   public static AbstractSocket af_renamed(Socket var0, int var1, int var2) throws IOException {
      return new BufferedNetSocket(var0, var1, var2);
   }

   static final boolean ju_renamed(int var0, int var1, int var2, int var3, int var4) {
      dg var6 = null;

      for(dg var7 = (dg)Client.nn.last(); var7 != null; var7 = (dg)Client.nn.previous()) {
         if (var0 == 593068225 * var7.af && var1 == 68300005 * var7.aw && var2 == 800888185 * var7.ac && var7.an * -1586499579 == var3) {
            var6 = var7;
            break;
         }
      }

      if (var6 != null) {
         var6.ay = var4 * -620279391;
         return true;
      } else {
         return false;
      }
   }

   hu() throws Throwable {
      throw new Error();
   }
}
