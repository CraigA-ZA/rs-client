import java.io.IOException;

public abstract class gn {
   String ac;
   // $FF: synthetic field
   final gy this$0;

   public static void an_renamed(boolean var0) {
      if (null != NetCache.af) {
         try {
            Packet var2 = new Packet(4);
            var2.bu(var0 ? 2 : 3);
            var2.bq(0);
            NetCache.af.ab(var2.array, 0, 4);
         } catch (IOException var5) {
            try {
               NetCache.af.aq();
            } catch (Exception var4) {
            }

            NetCache.NetCache_ioExceptions += -161323731;
            NetCache.af = null;
         }

      }
   }

   gn(gy var1, String var2) {
      this.this$0 = var1;
      this.ac = var2;
   }

   public String ao() {
      return this.ac;
   }

   public String an() {
      return null;
   }

   public int al() {
      return -1;
   }

   public abstract int af();
}
