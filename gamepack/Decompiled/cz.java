import java.text.DecimalFormat;

public class cz {
   static boolean cd;
   static boolean ch;
   static boolean cj;
   static boolean di;
   static int ad;
   static int ak;
   static int ar;
   static int aw = 0;
   static int ba;
   static int bp;
   static int ce;
   static int cq;
   static int de;
   static int dh;
   static int dm;
   static int dp;
   static String ae;
   static String ca;
   static String cc;
   static String ci;
   static String cn;
   static String cs;
   static String cu;
   static String cy;
   static String dc;
   static String dw;
   static String[] cm;
   static String[] dd;
   static String[] dj;
   static String[] dq;
   static long db;
   static long df;
   static Packet as;
   static IndexedSprite ah;
   static IndexedSprite ai;
   static IndexedSprite au;
   static IndexedSprite ax;

   static {
      ak = 2036160930 + 794898887 * aw;
      ad = -2126902070;
      ae = "";
      ba = 1919975363;
      bp = -1552230487;
      ce = 0;
      ci = "";
      cs = "";
      cc = "";
      cn = "";
      ca = "";
      cu = "";
      cq = 0;
      cm = new String[8];
      cy = "";
      cj = false;
      ch = false;
      cd = true;
      dm = 0;
      dw = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
      dc = "1234567890";
      di = false;
      de = 848889613;
      dh = 0;
      dp = 0;
      new DecimalFormat("##0.00");
      new ee();
      db = 8298737133189264243L;
      df = 1178331881283680817L;
      dq = new String[]{"title.jpg"};
      dd = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
      dj = new String[]{"logo_speedrunning"};
   }

   cz() throws Throwable {
      throw new Error();
   }

   static void ay_renamed(boolean var0) {
      byte var2 = 0;
      if (!fl.oi_renamed()) {
         var2 = 12;
      } else if (ClientScriptFrame.bc.gn() || ClientScriptFrame.bc.gx() || ClientScriptFrame.bc.gv()) {
         var2 = 10;
      }

      ee.ak_renamed(var2);
      if (var0) {
         ca = "";
         cu = "";
         hp.ct = 0;
         Messages.cp = "";
      }

      WallDecoration.ac_renamed();
      if (Client.hb && null != ca && ca.length() > 0) {
         dm = 1153152795;
      } else {
         dm = 0;
      }

   }

   static void ar_renamed() {
      if (ds.loadWorlds()) {
         di = true;
         dh = 0;
         dp = 0;
      }

   }

   static final void nd_renamed() {
      eh.at_renamed();
      if (null != es.sb) {
         es.sb.ag();
      }

   }
}
