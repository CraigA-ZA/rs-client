import java.net.URL;

public class ds {
   static byte[] aw = new byte[2048];
   static int ab = 0;
   static int al = 0;
   static int ax = 0;
   static int un;
   static int[] aa = new int[2048];
   static int[] ai = new int[2048];
   static int[] ao = new int[2048];
   static int[] aq = new int[2048];
   static int[] at = new int[2048];
   static int[] ay = new int[2048];
   static iu[] ac = new iu[2048];
   static qt rx;
   static Packet ag = new Packet(new byte[5000]);
   static Packet[] au = new Packet[2048];
   static Rasterizer3D[] kd;

   static boolean loadWorlds() {
      try {
         if (ao.aa == null) {
            ao.aa = ag.iq.request(new URL(GrandExchangeOffer.cq));
         } else if (ao.aa.isDone()) {
            byte[] var1 = ao.aa.getResponse();
            Packet var2 = new Packet(var1);
            var2.g4s();
            World.ab = var2.cl() * -2068054227;
            bx.au = new World[World.ab * -734287707];

            for(int var3 = 0; var3 < World.ab * -734287707; ++var3) {
               World var4 = bx.au[var3] = new World();
               var4.ay = var2.cl() * -2098511939;
               var4.ao = var2.g4s() * 1038974297;
               var4.ai = var2.cw();
               var4.ag = var2.cw();
               var4.ah = var2.g1() * 421437753;
               var4.ax = var2.cg() * 1838744807;
               var4.av = var3 * -484564273;
            }

            ex.aw_renamed(bx.au, 0, bx.au.length - 1, World.at, World.al);
            ao.aa = null;
            return true;
         }
      } catch (Exception var5) {
         var5.printStackTrace();
         ao.aa = null;
      }

      return false;
   }

   ds() throws Throwable {
      throw new Error();
   }
}
