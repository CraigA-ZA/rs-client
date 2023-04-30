import java.util.concurrent.ScheduledExecutorService;

public class SoundSystem implements Runnable {
   static ScheduledExecutorService soundSystemExecutor;
   static Component ag;
   volatile PcmPlayer[] players = new PcmPlayer[2];

   SoundSystem() {
   }

   public void run() {
      try {
         for(int var1 = 0; var1 < 2; ++var1) {
            PcmPlayer var2 = this.players[var1];
            if (null != var2) {
               var2.ak();
            }
         }
      } catch (Exception var3) {
         ob.af_renamed((String)null, var3);
      }

   }

   public static Component getComponentChild(int var0, int var1) {
      Component var3 = gh.getInterfaceComponent(var0);
      if (var1 == -1) {
         return var3;
      } else {
         return var3 != null && null != var3.children && var1 < var3.children.length ? var3.children[var1] : null;
      }
   }

   public static boolean loadInterface(int var0) {
      if (kt.loadedInterfaces[var0]) {
         return true;
      } else if (!UserComparator3.Component_archive.tryLoadGroup(var0)) {
         return false;
      } else {
         int var2 = UserComparator3.Component_archive.cq(var0);
         if (0 == var2) {
            kt.loadedInterfaces[var0] = true;
            return true;
         } else {
            if (hn.interfaceComponents[var0] == null) {
               hn.interfaceComponents[var0] = new Component[var2];
            }

            for(int var3 = 0; var3 < var2; ++var3) {
               if (hn.interfaceComponents[var0][var3] == null) {
                  byte[] var4 = UserComparator3.Component_archive.takeFile(var0, var3);
                  if (var4 != null) {
                     hn.interfaceComponents[var0][var3] = new Component();
                     hn.interfaceComponents[var0][var3].id = (var3 + (var0 << 16)) * 346484955;
                     if (var4[0] == -1) {
                        hn.interfaceComponents[var0][var3].decode(new Packet(var4));
                     } else {
                        hn.interfaceComponents[var0][var3].decodeLegacy(new Packet(var4));
                     }
                  }
               }
            }

            kt.loadedInterfaces[var0] = true;
            return true;
         }
      }
   }

   static int br_renamed(int var0) {
      return (int)((Math.log((double)var0) / Interpreter.bi - 7.0) * 256.0);
   }

   static int bl_renamed(int var0, ClientScript var1, boolean var2) {
      return 2;
   }
}
