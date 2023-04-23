import java.util.Iterator;
import java.util.concurrent.Callable;

public class an implements Callable {
   static Task is;
   static Iterator wa;
   static Component ai;
   final ac an;
   // $FF: synthetic field
   final al this$0;
   final Packet af;

   an(al var1, Packet var2, ac var3) {
      this.this$0 = var1;
      this.af = var2;
      this.an = var3;
   }

   public Object call() {
      return this.an.af(this.af);
   }

   public static void ay_renamed(int[] var0, int var1, int var2, float[] var3) {
      if (null == var3 && Rasterizer3D.at == Rasterizer3D.aq) {
         Rasterizer3D.aq = Rasterizer3D.al;
      }

      Rasterizer3D.aq.af(var0, var1, var2, var3);
   }

   static void hf_renamed(int var0) {
      if (var0 == -1 && !Client.tf) {
         FloorUnderlayType.au_renamed();
      } else if (-1 != var0 && 1976903761 * Client.tz != var0 && aj.clientPreferences.am() != 0 && !Client.tf) {
         Actor.aq_renamed(2, pj.archive6, var0, 0, aj.clientPreferences.am(), false);
      }

      Client.tz = 1225072817 * var0;
   }

   static final void ih_renamed() {
      fh.il_renamed(-621320819 * ju.uh, ds.un * -1852915743, -760417651 * IDKType.ur);
      GraphicsObject.is_renamed(ClientScriptEvent.uw * -1829847369, dt.uf * -1642659271);
      if (-2100544359 * bt.kx == -621320819 * ju.uh && 1772923873 * gk.kv == -1852915743 * ds.un && ly.ke * -91399205 == -760417651 * IDKType.ur && ClientScriptEvent.uw * -1829847369 == WorldMapSectionType.ky * 1897923909 && -1010818347 * ek.kh == dt.uf * -1642659271) {
         Client.uk = false;
         Client.uj = false;
         Client.ub = false;
         Client.uc = false;
         FontName.um = 0;
         MilliClock.ux = 0;
         ClientScriptFrame.ug = 0;
         Archive.up = 0;
         MapElementType.uv = 0;
         fd.uu = 0;
         KeyHandler.ul = 0;
         gx.ut = 0;
         ex.uo = 0;
         av.uq = 0;
         Client.ui = null;
         Client.uz = null;
         Client.ua = null;
      }

   }

   static void io_renamed() {
      PacketBitNode var1 = mi.an_renamed(ClientProt.av, Client.packetWriter.au);
      var1.bit.bu(na.iv_renamed());
      var1.bit.p2(Client.aj * -1687260435);
      var1.bit.p2(kd.ak * 1658005443);
      Client.packetWriter.aw(var1);
   }
}
