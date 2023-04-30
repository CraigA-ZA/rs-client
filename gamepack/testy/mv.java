public class mv {
   static final int ar = 131072;
   static me af;
   static tc dv;
   static final int di = 2;

   public static int ab(sg var0, String var1) {
      int var2 = -1633313603 * var0.at;
      byte[] var3 = ia.ac(var1, 267322236);
      var0.ck(var3.length, (byte)12);
      var0.at += af.af(var3, 0, var3.length, var0.al, -716945086 * var0.at, -398271447) * 1468828654;
      return var0.at * -136922163 - var2;
   }

   public static int ac(sg var0, String var1) {
      int var2 = -1633313603 * var0.at;
      byte[] var3 = ia.ac(var1, 267322236);
      var0.ck(var3.length, (byte)16);
      var0.at += af.af(var3, 0, var3.length, var0.al, -1633313603 * var0.at, -172605880) * -1516355947;
      return var0.at * -1633313603 - var2;
   }

   mv() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "mv.<init>(" + ')');
      }
   }

   public static int au(sg var0, String var1) {
      int var2 = -1633313603 * var0.at;
      byte[] var3 = ia.ac(var1, 267322236);
      var0.ck(var3.length, (byte)64);
      var0.at += af.af(var3, 0, var3.length, var0.al, 2108197801 * var0.at, -1705985934) * -1516355947;
      return var0.at * -1633313603 - var2;
   }

   public static String aq(sg var0) {
      String var1;
      try {
         int var2 = var0.cd(-1594122234);
         if (var2 > 189116693) {
            var2 = 32767;
         }

         byte[] var3 = new byte[var2];
         var0.at += af.an(var0.al, -1592123250 * var0.at, var3, 0, var2, -716999849) * -1516355947;
         String var4 = sg.ab(var3, 0, var2, 534402924);
         var1 = var4;
      } catch (Exception var5) {
         var1 = "Cabbage";
      }

      return var1;
   }
}
