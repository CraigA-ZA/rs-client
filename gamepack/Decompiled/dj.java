import java.net.MalformedURLException;
import java.net.URL;

public class dj implements Enumerated {
   static final dj ac = new dj(3);
   static final dj af = new dj(0);
   static final dj an = new dj(1);
   static final dj au = new dj(4);
   static final dj aw = new dj(2);
   final int ab;

   public static int aw_renamed(int var0) {
      return qo.au[var0 & 16383];
   }

   static boolean an_renamed(String var0) {
      if (var0 == null) {
         return false;
      } else {
         try {
            new URL(var0);
            return true;
         } catch (MalformedURLException var3) {
            return false;
         }
      }
   }

   static final InterfaceParent openInterface(int var0, int var1, int var2) {
      InterfaceParent var4 = new InterfaceParent();
      var4.af = var1 * 111476425;
      var4.an = 100799 * var2;
      Client.interfaceParents.put(var4, (long)var0);
      lm.mj_renamed(var1);
      Component var5 = gh.an_renamed(var0);
      fw.ma_renamed(var5);
      if (Client.pg != null) {
         fw.ma_renamed(Client.pg);
         Client.pg = null;
      }

      WallDecoration.lz_renamed(hn.interfaceComponents[var0 >> 16], var5, false);
      ax.ci_renamed(var1);
      if (-1 != Client.or * -896157613) {
         ec.mu_renamed(-896157613 * Client.or, 1);
      }

      return var4;
   }

   dj(int var1) {
      this.ab = 1138059331 * var1;
   }

   public int ordinal() {
      return 1074537579 * this.ab;
   }
}
