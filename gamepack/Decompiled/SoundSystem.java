import java.util.concurrent.ScheduledExecutorService;

public class SoundSystem implements Runnable {
   static ScheduledExecutorService al;
   static Component ag;
   volatile PcmPlayer[] af = new PcmPlayer[2];

   SoundSystem() {
   }

   public void run() {
      try {
         for(int var1 = 0; var1 < 2; ++var1) {
            PcmPlayer var2 = this.af[var1];
            if (null != var2) {
               var2.ak();
            }
         }
      } catch (Exception var3) {
         ob.af_renamed((String)null, var3);
      }

   }

   public static Component getComponentChild(int var0, int var1) {
      Component var3 = gh.an_renamed(var0);
      if (var1 == -1) {
         return var3;
      } else {
         return var3 != null && null != var3.gz && var1 < var3.gz.length ? var3.gz[var1] : null;
      }
   }

   public static boolean loadInterface(int var0) {
      if (kt.by[var0]) {
         return true;
      } else if (!eb.bb.tryLoadGroup(var0)) {
         return false;
      } else {
         int var2 = eb.bb.cq(var0);
         if (0 == var2) {
            kt.by[var0] = true;
            return true;
         } else {
            if (hn.ap[var0] == null) {
               hn.ap[var0] = new Component[var2];
            }

            for(int var3 = 0; var3 < var2; ++var3) {
               if (hn.ap[var0][var3] == null) {
                  byte[] var4 = eb.bb.takeFile(var0, var3);
                  if (var4 != null) {
                     hn.ap[var0][var3] = new Component();
                     hn.ap[var0][var3].bs = (var3 + (var0 << 16)) * 346484955;
                     if (var4[0] == -1) {
                        hn.ap[var0][var3].decode(new Packet(var4));
                     } else {
                        hn.ap[var0][var3].decodeLegacy(new Packet(var4));
                     }
                  }
               }
            }

            kt.by[var0] = true;
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
