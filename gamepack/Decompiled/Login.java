import java.text.DecimalFormat;

public class Login {
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
   static String Login_loadingText;
   static String Login_username;
   static String Login_response2;
   static String Login_response0;
   static String Login_response3;
   static String Login_response1;
   static String Login_password;
   static String cy;
   static String dc;
   static String dw;
   static String[] cm;
   static String[] dd;
   static String[] dj;
   static String[] dq;
   static long db;
   static long df;
   static Packet NetCache_reference;
   static IndexedSprite ah;
   static IndexedSprite ai;
   static IndexedSprite au;
   static IndexedSprite ax;

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
      Login_username = "";
      Login_password = "";
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

   Login() throws Throwable {
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
         Login_username = "";
         Login_password = "";
         hp.ct = 0;
         Messages.cp = "";
      }

      WallDecoration.ac_renamed();
      if (Client.hb && null != Login_username && Login_username.length() > 0) {
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
      if (null != UserComparator5.clanChat) {
         UserComparator5.clanChat.ag();
      }

   }
}
