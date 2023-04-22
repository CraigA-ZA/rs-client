import java.text.DecimalFormat;

public class cz {
   static String Login_response3;
   static boolean cj;
   static String dc;
   static IndexedSprite ax;
   static IndexedSprite ai;
   static long db;
   static int ak;
   static int ad;
   static int ce;
   static int ba;
   static String Login_loadingText;
   static boolean ch;
   static String Login_response0;
   static String Login_response1;
   static String Login_response2;
   static int aw = 0;
   static IndexedSprite ah;
   static String cu;
   static int cq;
   static String[] cm;
   static String cy;
   static IndexedSprite au;
   static boolean cd;
   static int bp;
   static String dw;
   static boolean di;
   static int de;
   static int dh;
   static int dp;
   static int dm;
   static long df;
   static String[] dq;
   static String[] dd;
   static String[] dj;
   static int ar;
   static Packet NetCache_reference;
   static String ca;

   static {
      ak = 2036160930 + 794898887 * aw;
      ad = -2126902070;
      Login_loadingText = "";
      ba = 1919975363;
      bp = -1552230487;
      ce = 0;
      Login_response0 = "";
      Login_response1 = "";
      Login_response2 = "";
      Login_response3 = "";
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
      } else if (ClientScriptFrame.client.gn() || ClientScriptFrame.client.gx() || ClientScriptFrame.client.gv()) {
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

   static final void nd_renamed() {
      eh.at_renamed();
      if (null != es.clanChat) {
         es.clanChat.ag();
      }

   }

   static void ar_renamed() {
      if (ds.loadWorlds()) {
         di = true;
         dh = 0;
         dp = 0;
      }

   }
}
