public class ServerBuild {
   final int id;
   static final ServerBuild an = new ServerBuild("BUILDLIVE", 3);
   static final ServerBuild aw = new ServerBuild("RC", 1);
   public final String name;
   static Archive archive1;
   static final ServerBuild ac = new ServerBuild("WIP", 2);
   static final ServerBuild af = new ServerBuild("LIVE", 0);

   static final int as_renamed(int var0, int var1, int var2) {
      if (var2 > 179) {
         var1 /= 2;
      }

      if (var2 > 192) {
         var1 /= 2;
      }

      if (var2 > 217) {
         var1 /= 2;
      }

      if (var2 > 243) {
         var1 /= 2;
      }

      int var4 = (var0 / 4 << 10) + (var1 / 32 << 7) + var2 / 2;
      return var4;
   }

   ServerBuild(String var1, int var2) {
      this.name = var1;
      this.id = -1294558747 * var2;
   }

   public static sm an_renamed(int var0) {
      sm var2 = (sm)sm.an.get((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = sm.af.takeFile(39, var0);
         var2 = new sm();
         if (var3 != null) {
            var2.aw(new Packet(var3));
         }

         var2.au();
         sm.an.put(var2, (long)var0);
         return var2;
      }
   }
}
