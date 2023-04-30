import accessors.RSLogin;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class cz implements RSLogin {
   static String cn;
   static boolean cj;
   static String dc;
   static tc ax;
   static tc ai;
   static long db;
   static int ak;
   static int ad;
   static int ce;
   static int ba;
   static final int bx = 6;
   public static final int aa = 30;
   static String ae;
   static boolean ch;
   static String ci;
   static String cs;
   static String cc;
   static int aw = 0;
   static tc ah;
   static String cu;
   static int cq;
   static String[] cm;
   static String cy;
   static final int bk = 5;
   static tc au;
   static boolean cd;
   static final int af = 22;
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
   static sg as;
   static String ca;

   static Date bn() {
      Calendar var0 = Calendar.getInstance();
      var0.set(2, 0);
      var0.set(5, 1);
      var0.set(1, 1900);
      return var0.getTime();
   }

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

   static int ad(nm var0) {
      int var1 = dd.length + dq.length;
      String[] var2 = dj;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         String var4 = var2[var3];
         if (var0.cy(var4, -939509624) != -1) {
            ++var1;
         }
      }

      return var1;
   }

   static void cj(int var0) {
      if (1145608355 * ce != var0) {
         ce = 1331354379 * var0;
      }
   }

   static int ch() {
      return ce * 1145608355;
   }

   static void by(nm var0, nm var1, boolean var2, int var3) {
      if (ax.an) {
         if (var3 == 4) {
            ee.ak(4, (byte)94);
         }

      } else {
         if (0 == var3) {
            ay(var2, -893575888);
         } else {
            ee.ak(var3, (byte)49);
         }

         th.er();
         byte[] var4 = var0.cb("title.jpg", "", 1648560407);
         ex.at = mk.af(var4, -1086782008);
         ho.aa = ex.at.af();
         int var5 = client.ce * 1305057418;
         if ((var5 & 536870912) != 0) {
            ad.ay = lp.au(var1, "logo_deadman_mode", "", -1475826763);
         } else if (0 != (var5 & 531636362)) {
            ad.ay = lp.au(var1, "logo_seasonal_mode", "", 1148103672);
         } else if ((var5 & 256) != 0) {
            ad.ay = lp.au(var1, "logo_speedrunning", "", -1154513528);
         } else {
            ad.ay = lp.au(var1, "logo", "", 2100501954);
         }

         au = lp.au(var1, "titlebox", "", 1334433618);
         lu.ab = lp.au(var1, "titlebutton", "", -782581809);
         qo.aq = lp.au(var1, "titlebutton_large", "", -783550007);
         os.al = lp.au(var1, "play_now_text", "", 65741066);
         lp.au(var1, "titlebutton_wide42,1", "", -1604800626);
         py.ac = mz.ac(var1, "runes", "", 255591156);
         fc.ao = mz.ac(var1, "title_mute", "", -69155453);
         ax = lp.au(var1, "options_radio_buttons,0", "", 636902126);
         ai = lp.au(var1, "options_radio_buttons,4", "", -2021573956);
         gs.ag = lp.au(var1, "options_radio_buttons,2", "", 1455131031);
         ah = lp.au(var1, "options_radio_buttons,6", "", 344406899);
         cp.cz = 283565164 * ax.aw;
         hr.cw = ax.ac * -198312517;
         em.av = new dp(py.ac);
         if (var2) {
            ca = "";
            cu = "";
            cm = new String[8];
            cq = 0;
         }

         hp.ct = 0;
         eo.cp = "";
         cd = true;
         di = false;
         if (!aj.vb.aa(-1197954221)) {
            ks.ab(2, pj.fw, "scape main", "", -898469572, false, -900816422);
         } else {
            ly.au = 753439329;
            ly.ab = null;
            oq.aq = 1765650665;
            gz.al = -1416086058;
            dn.at = 0;
            ev.ay = false;
            aa = -75077999;
         }

         gn.an(false, 2108475801);
         ax.an = true;
         aw = 983792155 * ((bm.aj * -1567095619 - 765) / 2);
         ak = 1529095227 * aw + -152538118;
         fy.az = -1036961612 + ak * -949768875;
         ex.at.ay(578342931 * aw, 0);
         ho.aa.ay(382 + aw * 578342931, 0);
         ad.ay.aw(-1508518127 + aw * 578342931 - ad.ay.aw / 2, 18);
      }
   }

   static void bb(nm var0, nm var1, boolean var2, int var3) {
      if (ax.an) {
         if (var3 == 4) {
            ee.ak(4, (byte)117);
         }

      } else {
         if (0 == var3) {
            ay(var2, -724474872);
         } else {
            ee.ak(var3, (byte)38);
         }

         th.er();
         byte[] var4 = var0.cb("title.jpg", "", 1648560407);
         ex.at = mk.af(var4, -1448279669);
         ho.aa = ex.at.af();
         int var5 = client.ce * -205173751;
         if ((var5 & 2060526517) != 0) {
            ad.ay = lp.au(var1, "logo_deadman_mode", "", -1524845359);
         } else if (0 != (var5 & 29269122)) {
            ad.ay = lp.au(var1, "logo_seasonal_mode", "", 1385424753);
         } else if ((var5 & -1845888114) != 0) {
            ad.ay = lp.au(var1, "logo_speedrunning", "", 1219508780);
         } else {
            ad.ay = lp.au(var1, "logo", "", -427742568);
         }

         au = lp.au(var1, "titlebox", "", -1929066490);
         lu.ab = lp.au(var1, "titlebutton", "", -1685438328);
         qo.aq = lp.au(var1, "titlebutton_large", "", 1108343198);
         os.al = lp.au(var1, "play_now_text", "", -1732094170);
         lp.au(var1, "titlebutton_wide42,1", "", -2110741465);
         py.ac = mz.ac(var1, "runes", "", 444390493);
         fc.ao = mz.ac(var1, "title_mute", "", -1731449036);
         ax = lp.au(var1, "options_radio_buttons,0", "", -720844238);
         ai = lp.au(var1, "options_radio_buttons,4", "", 1638851795);
         gs.ag = lp.au(var1, "options_radio_buttons,2", "", -1726249003);
         ah = lp.au(var1, "options_radio_buttons,6", "", -164298780);
         cp.cz = 253396286 * ax.aw;
         hr.cw = ax.ac * 905476585;
         em.av = new dp(py.ac);
         if (var2) {
            ca = "";
            cu = "";
            cm = new String[8];
            cq = 0;
         }

         hp.ct = 0;
         eo.cp = "";
         cd = true;
         di = false;
         if (!aj.vb.aa(-1197954221)) {
            ks.ab(2, pj.fw, "scape main", "", 255, false, 801953209);
         } else {
            ly.au = 1421763971;
            ly.ab = null;
            oq.aq = 1643562499;
            gz.al = -10349328;
            dn.at = 0;
            ev.ay = false;
            aa = 440964570;
         }

         gn.an(false, 1514496356);
         ax.an = true;
         aw = 851044613 * ((bm.aj * -1687260435 - -1101078484) / 2);
         ak = 794898887 * aw + 2036160930;
         fy.az = -1036961612 + ak * -949768875;
         ex.at.ay(-1457820036 * aw, 0);
         ho.aa.ay(-449444379 + aw * 578342931, 0);
         ad.ay.aw(382 + aw * -299039362 - ad.ay.aw / 2, 18);
      }
   }

   static void cu(on var0, on var1) {
      int var4;
      int var5;
      if (null == st.dr) {
         nd var3 = rr.fv;
         tq[] var2;
         if (!var3.cv("sl_back", "", -1313069490)) {
            var2 = null;
         } else {
            var4 = var3.cy("sl_back", 1202575537);
            var5 = var3.cx(var4, "", (short)8192);
            var2 = eb.an(var3, var4, var5, 1271520368);
         }

         st.dr = var2;
      }

      if (null == av.dl) {
         av.dl = mz.ac(rr.fv, "sl_flags", "", -279417741);
      }

      if (az.dk == null) {
         az.dk = mz.ac(rr.fv, "sl_arrows", "", 1035149542);
      }

      if (cl.dt == null) {
         cl.dt = mz.ac(rr.fv, "sl_stars", "", 426093958);
      }

      if (nz.dz == null) {
         nz.dz = lp.au(rr.fv, "leftarrow", "", 2002591934);
      }

      if (ai.dg == null) {
         ai.dg = lp.au(rr.fv, "rightarrow", "", 185430511);
      }

      th.em(aw * 578342931, 23, 765, 480, 0);
      th.ew(578342931 * aw, 0, 125, 23, 12425273, 286493056);
      th.ew(125 + aw * 578342931, 0, 640, 23, -1922468603, -1216518257);
      var0.aj(mk.mo, aw * 578342931 + -337337044, 15, 0, -1);
      if (null != cl.dt) {
         cl.dt[1].aw(aw * 578342931 + -716994558, 1);
         var1.ar(mk.mn, 578342931 * aw + -360662410, 10, 16777215, -1);
         cl.dt[0].aw(aw * -2081835031 + 1017700558, 12);
         var1.ar(mk.mi, 152 + aw * 1052931522, 21, 1140967937, -1);
      }

      int var22;
      if (az.dk != null) {
         var22 = 1907234547 * aw + 2060641697;
         if (cl.at[0] == 0 && cl.al[0] == 0) {
            az.dk[2].aw(var22, 4);
         } else {
            az.dk[0].aw(var22, 4);
         }

         if (cl.at[0] == 0 && 1 == cl.al[0]) {
            az.dk[3].aw(15 + var22, 4);
         } else {
            az.dk[1].aw(var22 + 15, 4);
         }

         var0.ar(mk.md, 32 + var22, 17, 952454998, -1);
         int var23 = aw * 2007751715 + -2012548180;
         if (1 == cl.at[0] && 0 == cl.al[0]) {
            az.dk[2].aw(var23, 4);
         } else {
            az.dk[0].aw(var23, 4);
         }

         if (cl.at[0] == 1 && 1 == cl.al[0]) {
            az.dk[3].aw(15 + var23, 4);
         } else {
            az.dk[1].aw(var23 + 15, 4);
         }

         var0.ar(mk.mr, 32 + var23, 17, 1923434275, -1);
         var4 = aw * 578342931 + 1653622916;
         if (2 == cl.at[0] && 0 == cl.al[0]) {
            az.dk[2].aw(var4, 4);
         } else {
            az.dk[0].aw(var4, 4);
         }

         if (cl.at[0] == 2 && cl.al[0] == 1) {
            az.dk[3].aw(var4 + 15, 4);
         } else {
            az.dk[1].aw(15 + var4, 4);
         }

         var0.ar(mk.ml, 32 + var4, 17, 16777215, -1);
         var5 = aw * 361600787 + 610;
         if (cl.at[0] == 3 && cl.al[0] == 0) {
            az.dk[2].aw(var5, 4);
         } else {
            az.dk[0].aw(var5, 4);
         }

         if (3 == cl.at[0] && 1 == cl.al[0]) {
            az.dk[3].aw(15 + var5, 4);
         } else {
            az.dk[1].aw(var5 + 15, 4);
         }

         var0.ar(mk.mf, var5 + -748955668, 17, 16777215, -1);
      }

      th.em(aw * 578342931 + 708, 4, 50, 16, 0);
      var1.aj(mk.jl, 25 + 1100787508 + aw * -537281047, 16, 587066490, -1);
      de = 848889613;
      if (st.dr != null) {
         var22 = 1900799205;
         byte var24 = 19;
         var4 = 765 / (var22 + 1) - 1;
         var5 = 480 / (1 + var24);

         int var6;
         int var7;
         do {
            var6 = var5;
            var7 = var4;
            if (var5 * (var4 - 1) >= -734287707 * cl.ab) {
               --var4;
            }

            if (var4 * (var5 - 1) >= -1155873404 * cl.ab) {
               --var5;
            }

            if ((var5 - 1) * var4 >= cl.ab * 1231131343) {
               --var5;
            }
         } while(var5 != var6 || var7 != var4);

         var6 = (-105740967 - var22 * var4) / (var4 + 1);
         if (var6 > 5) {
            var6 = 5;
         }

         var7 = (480 - var5 * var24) / (var5 + 1);
         if (var7 > 5) {
            var7 = 5;
         }

         int var8 = (765 - var22 * var4 - var6 * (var4 - 1)) / 2;
         int var9 = (708512367 - var24 * var5 - var7 * (var5 - 1)) / 2;
         int var10 = (-734287707 * cl.ab + var5 - 1) / var5;
         dp = (var10 - var4) * -343958170;
         if (nz.dz != null && dh * 1246310743 > 0) {
            nz.dz.aw(8, kd.ak * 909390997 / 2 - nz.dz.ac / 2);
         }

         if (ai.dg != null && 1246310743 * dh < dp * 1959698517) {
            ai.dg.aw(bm.aj * -1687260435 - ai.dg.aw - 8, 1073839265 * kd.ak / 2 - ai.dg.ac / 2);
         }

         int var11 = var9 + 23;
         int var12 = aw * -619021846 + var8;
         int var13 = 0;
         boolean var14 = false;
         int var15 = 2018650959 * dh;

         int var16;
         for(var16 = var5 * var15; var16 < cl.ab * 380405036 && var15 - 547865210 * dh < var4; ++var16) {
            cl var17 = bx.au[var16];
            boolean var18 = true;
            String var19 = Integer.toString(-1395987784 * var17.ax);
            if (-1 == -491318259 * var17.ax) {
               var19 = mk.my;
               var18 = false;
            } else if (var17.ax * -1396846889 > 1116634887) {
               var19 = mk.mk;
               var18 = false;
            }

            da var20 = null;
            int var21 = 0;
            if (var17.ag(-1791532619)) {
               var20 = var17.at(1029039210) ? da.al : da.aq;
            } else if (var17.aa(1752228050)) {
               var20 = var17.at(1029039210) ? da.ah : da.ag;
            } else if (var17.ai((byte)37)) {
               var21 = 220778745;
               var20 = var17.at(1029039210) ? da.ab : da.au;
            } else if (var17.ah((byte)123)) {
               var20 = var17.at(1029039210) ? da.aa : da.at;
            } else if (var17.ao(-34995575)) {
               var20 = var17.at(1029039210) ? da.ac : da.aw;
            } else if (var17.av(-459773999)) {
               var20 = var17.at(1029039210) ? da.ao : da.ay;
            } else if (var17.ar((byte)89)) {
               var20 = var17.at(1029039210) ? da.ai : da.ax;
            }

            if (null == var20 || var20.av * 1140778173 >= st.dr.length) {
               var20 = var17.at(1029039210) ? da.an : da.af;
            }

            if (bd.ay * -2063363905 >= var12 && bd.ao * -251044507 >= var11 && 1154823788 * bd.ay < var12 + var22 && bd.ao * -65975793 < var24 + var11 && var18) {
               de = var16 * 1676085461;
               st.dr[-804515689 * var20.av].av(var12, var11, 128, 723968824);
               var14 = true;
            } else {
               st.dr[-2144390373 * var20.av].ay(var12, var11);
            }

            if (null != av.dl) {
               av.dl[(var17.at(1029039210) ? 8 : 0) + var17.ah * -665846519].aw(var12 + 29, var11);
            }

            var0.aj(Integer.toString(-2091224171 * var17.ay), 15 + var12, 5 + var24 / 2 + var11, var21, -1);
            var1.aj(var19, var12 + -1326120003, 5 + var24 / 2 + var11, -784729667, -1);
            var11 += var7 + var24;
            ++var13;
            if (var13 >= var5) {
               var11 = 23 + var9;
               var12 += var22 + var6;
               var13 = 0;
               ++var15;
            }
         }

         if (var14) {
            var16 = var1.ao(bx.au[de * 4549911].ag) + 6;
            int var25 = 8 + var1.al;
            int var26 = bd.ao * -1224153235 + 25;
            if (var25 + var26 > 1938591762) {
               var26 = 764151040 * bd.ao - 25 - var25;
            }

            th.em(bd.ay * -1644950451 - var16 / 2, var26, var16, var25, 16777120);
            th.ek(bd.ay * -1339725976 - var16 / 2, var26, var16, var25, 0);
            var1.aj(bx.au[de * 248569915].ag, -336121356 * bd.ay, 4 + var1.al + var26, 0, -1);
         }
      }

      ia.bn.an(0, 0, -722103803);
   }

   static String be() {
      return aj.vb.al(-2114501008) ? mc.ai(ca, (byte)1) : ca;
   }

   static void bm() {
      if (ax.an) {
         au = null;
         lu.ab = null;
         py.ac = null;
         ex.at = null;
         ho.aa = null;
         ad.ay = null;
         fc.ao = null;
         ax = null;
         gs.ag = null;
         st.dr = null;
         av.dl = null;
         az.dk = null;
         cl.dt = null;
         mv.dv = null;
         em.av.an(-1003728308);
         ly.au = -626822165;
         ly.ab = null;
         oq.aq = 1643562499;
         gz.al = -51363568;
         dn.at = 0;
         ev.ay = false;
         aa = 440964570;
         gn.an(true, 920792383);
         ax.an = false;
      }
   }

   static void bx() {
      if (null == ca || ca.length() <= 0) {
         if (aj.vb.ae(-1677347874) != null) {
            ca = aj.vb.ae(-1422673528);
            client.hb = true;
         } else {
            client.hb = false;
         }

      }
   }

   static void bo() {
      if (ax.an) {
         au = null;
         lu.ab = null;
         py.ac = null;
         ex.at = null;
         ho.aa = null;
         ad.ay = null;
         fc.ao = null;
         ax = null;
         gs.ag = null;
         st.dr = null;
         av.dl = null;
         az.dk = null;
         cl.dt = null;
         mv.dv = null;
         em.av.an(178269737);
         ly.au = -626822165;
         ly.ab = null;
         oq.aq = 1643562499;
         gz.al = -1823837761;
         dn.at = 0;
         ev.ay = false;
         aa = 440964570;
         gn.an(true, 1900808216);
         ax.an = false;
      }
   }

   static void bz() {
      if (ax.an) {
         au = null;
         lu.ab = null;
         py.ac = null;
         ex.at = null;
         ho.aa = null;
         ad.ay = null;
         fc.ao = null;
         ax = null;
         gs.ag = null;
         st.dr = null;
         av.dl = null;
         az.dk = null;
         cl.dt = null;
         mv.dv = null;
         em.av.an(-775592816);
         ly.au = -1332506500;
         ly.ab = null;
         oq.aq = 1643562499;
         gz.al = -714035666;
         dn.at = 0;
         ev.ay = false;
         aa = 1104839005;
         gn.an(true, 1088892549);
         ax.an = false;
      }
   }

   static void bk() {
      if (null == ca || ca.length() <= 0) {
         if (aj.vb.ae(-1841568301) != null) {
            ca = aj.vb.ae(-941738765);
            client.hb = true;
         } else {
            client.hb = false;
         }

      }
   }

   static int ae(nm var0) {
      int var1 = dd.length + dq.length;
      String[] var2 = dj;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         String var4 = var2[var3];
         if (var0.cy(var4, 2114930446) != -1) {
            ++var1;
         }
      }

      return var1;
   }

   static void bt(bm var0, on var1, on var2) {
      if (di) {
         bz.ag(var0, 626811319);
      } else {
         if ((1 == -1222491879 * bd.ar || !su.ev && 4 == bd.ar * -1222491879) && 2020601481 * bd.am >= 765 + aw * 578342931 - 50 && 1163896205 * bd.as >= 453) {
            aj.vb.at(!aj.vb.aa(-1197954221), -527699713);
            if (!aj.vb.aa(-1197954221)) {
               sh.an(pj.fw, "scape main", "", 255, false, -1367518776);
            } else {
               hr.au(-852125385);
            }
         }

         if (5 != -1275976559 * client.dw) {
            if (-1L == db * -7899453336143161787L) {
               db = (dq.af(1382877280) + 1000L) * -8298737133189264243L;
            }

            long var3 = dq.af(1030185277);
            boolean var5;
            if (null != client.we && client.wy * -397497277 < client.we.size()) {
               while(true) {
                  if (-397497277 * client.wy >= client.we.size()) {
                     var5 = true;
                     break;
                  }

                  dw var6 = (dw)client.we.get(-397497277 * client.wy);
                  if (!var6.af((byte)22)) {
                     var5 = false;
                     break;
                  }

                  client.wy += -1719009173;
               }
            } else {
               var5 = true;
            }

            if (var5 && -1L == df * 6949275123175874863L) {
               df = var3 * -1178331881283680817L;
               if (df * 6949275123175874863L > -7899453336143161787L * db) {
                  db = -606941742840038685L * df;
               }
            }

            if (10 == client.dw * -1275976559 || -1275976559 * client.dw == 11) {
               int var7;
               int var8;
               int var39;
               if (fj.ck == nx.af) {
                  if (-1222491879 * bd.ar == 1 || !su.ev && 4 == bd.ar * -1222491879) {
                     var39 = 5 + 578342931 * aw;
                     var7 = 463;
                     var8 = 100;
                     byte var9 = 35;
                     if (2020601481 * bd.am >= var39 && 2020601481 * bd.am <= var39 + var8 && bd.as * 1163896205 >= var7 && bd.as * 1163896205 <= var7 + var9) {
                        ar(1638224605);
                        return;
                     }
                  }

                  if (ao.aa != null) {
                     ar(1921396043);
                  }
               }

               var39 = -1222491879 * bd.ar;
               var7 = 2020601481 * bd.am;
               var8 = bd.as * 1163896205;
               if (var39 == 0) {
                  var7 = -2063363905 * bd.ay;
                  var8 = bd.ao * -1224153235;
               }

               if (!su.ev && var39 == 4) {
                  var39 = 1;
               }

               hy var40 = client.sh;
               hy var10 = var40;
               int var12;
               short var43;
               if (0 == ce * 1145608355) {
                  boolean var74 = false;

                  while(var10.ag(2048602787)) {
                     if (84 == var10.ai * 546317845) {
                        var74 = true;
                     }
                  }

                  var12 = fy.az * 950254081 - 80;
                  var43 = 291;
                  if (1 == var39 && var7 >= var12 - 75 && var7 <= 75 + var12 && var8 >= var43 - 20 && var8 <= 20 + var43) {
                     pi.af(gl.nb("secure", true, 121384764) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false, (byte)-14);
                  }

                  var12 = fy.az * 950254081 + 80;
                  if (var39 == 1 && var7 >= var12 - 75 && var7 <= 75 + var12 && var8 >= var43 - 20 && var8 <= 20 + var43 || var74) {
                     if ((-205173751 * client.ce & 33554432) != 0) {
                        ci = "";
                        cs = mk.jo;
                        cc = mk.jk;
                        cn = mk.jq;
                        ee.ak(1, (byte)22);
                        if (client.hb && null != ca && ca.length() > 0) {
                           dm = 1153152795;
                        } else {
                           dm = 0;
                        }
                     } else if ((-205173751 * client.ce & 4) != 0) {
                        if ((-205173751 * client.ce & 1024) != 0) {
                           cs = mk.ji;
                           cc = mk.jg;
                           cn = mk.jx;
                        } else {
                           cs = mk.ij;
                           cc = mk.id;
                           cn = mk.it;
                        }

                        ci = mk.im;
                        ee.ak(1, (byte)13);
                        if (client.hb && ca != null && ca.length() > 0) {
                           dm = 1153152795;
                        } else {
                           dm = 0;
                        }
                     } else if ((client.ce * -205173751 & 1024) != 0) {
                        cs = mk.ix;
                        cc = mk.ib;
                        cn = mk.jc;
                        ci = mk.im;
                        ee.ak(1, (byte)124);
                        if (client.hb && ca != null && ca.length() > 0) {
                           dm = 1153152795;
                        } else {
                           dm = 0;
                        }
                     } else {
                        aq.aa(false, 1620071571);
                     }
                  }
               } else {
                  int var11;
                  short var44;
                  if (ce * 1145608355 == 1) {
                     while(true) {
                        if (!var10.ag(564502633)) {
                           var11 = fy.az * 950254081 - 80;
                           var44 = 321;
                           if (1 == var39 && var7 >= var11 - 75 && var7 <= 75 + var11 && var8 >= var44 - 20 && var8 <= var44 + 20) {
                              aq.aa(false, 1620071571);
                           }

                           var11 = 950254081 * fy.az + 80;
                           if (1 == var39 && var7 >= var11 - 75 && var7 <= 75 + var11 && var8 >= var44 - 20 && var8 <= 20 + var44) {
                              ee.ak(0, (byte)76);
                           }
                           break;
                        }

                        if (546317845 * var10.ai == 84) {
                           aq.aa(false, 1620071571);
                        } else if (13 == 546317845 * var10.ai) {
                           ee.ak(0, (byte)72);
                        }
                     }
                  } else {
                     int var15;
                     String var17;
                     int var18;
                     short var41;
                     boolean var46;
                     char var47;
                     int var49;
                     char var62;
                     boolean var67;
                     if (2 == 1145608355 * ce) {
                        var41 = 201;
                        var11 = var41 + 52;
                        if (var39 == 1 && var8 >= var11 - 12 && var8 < 2 + var11) {
                           dm = 0;
                        }

                        var11 += 15;
                        if (var39 == 1 && var8 >= var11 - 12 && var8 < var11 + 2) {
                           dm = 1153152795;
                        }

                        var11 += 15;
                        var41 = 361;
                        if (null != dq.bh) {
                           var12 = dq.bh.aw * 944313703 / 2;
                           if (var39 == 1 && var7 >= dq.bh.af * -844906645 - var12 && var7 <= -844906645 * dq.bh.af + var12 && var8 >= var41 - 15 && var8 < var41) {
                              switch (-1733444455 * bp) {
                                 case 1:
                                    he.ax(mk.lu, mk.lk, mk.lh, 1096620106);
                                    ee.ak(5, (byte)12);
                                    return;
                                 case 2:
                                    pi.af("https://support.runescape.com/hc/en-gb", true, false, (byte)-4);
                              }
                           }
                        }

                        var12 = fy.az * 950254081 - 80;
                        var43 = 321;
                        if (1 == var39 && var7 >= var12 - 75 && var7 <= 75 + var12 && var8 >= var43 - 20 && var8 <= var43 + 20) {
                           ca = ca.trim();
                           if (ca.length() == 0) {
                              he.ax(mk.em, mk.ew, mk.ex, 1793607006);
                              return;
                           }

                           if (cu.length() == 0) {
                              he.ax(mk.eh, mk.ek, mk.ey, -921972791);
                              return;
                           }

                           he.ax(mk.jm, mk.jn, mk.jd, 2094500781);
                           ag.hb(false, -1402119231);
                           fd.hi(20, 1593466623);
                           return;
                        }

                        var12 = 80 + ak * 678588245 + 180;
                        if (var39 == 1 && var7 >= var12 - 75 && var7 <= var12 + 75 && var8 >= var43 - 20 && var8 <= 20 + var43) {
                           ee.ak(0, (byte)89);
                           ca = "";
                           cu = "";
                           hp.ct = 0;
                           eo.cp = "";
                           cd = true;
                        }

                        var12 = -117 + 950254081 * fy.az;
                        var43 = 277;
                        cj = var7 >= var12 && var7 < var12 + cp.cz * 1381277089 && var8 >= var43 && var8 < hr.cw * -1649414567 + var43;
                        if (var39 == 1 && cj) {
                           client.hb = !client.hb;
                           if (!client.hb && aj.vb.ae(-106358494) != null) {
                              aj.vb.ad((String)null, -472730554);
                           }
                        }

                        var12 = 950254081 * fy.az + 24;
                        var43 = 277;
                        ch = var7 >= var12 && var7 < cp.cz * 1381277089 + var12 && var8 >= var43 && var8 < var43 + hr.cw * -1649414567;
                        if (1 == var39 && ch) {
                           aj.vb.aq(!aj.vb.al(-2109246489), -1477676660);
                           if (!aj.vb.al(-2071921565)) {
                              ca = "";
                              aj.vb.ad((String)null, -472730554);
                              if (client.hb && null != ca && ca.length() > 0) {
                                 dm = 1153152795;
                              } else {
                                 dm = 0;
                              }
                           }
                        }

                        label1336:
                        while(true) {
                           Transferable var60;
                           do {
                              while(true) {
                                 label1300:
                                 do {
                                    while(true) {
                                       while(var10.ag(1201042051)) {
                                          if (546317845 * var10.ai != 13) {
                                             if (-1232221421 * dm != 0) {
                                                continue label1300;
                                             }

                                             char var51 = var10.ax;

                                             for(var15 = 0; var15 < dw.length() && var51 != dw.charAt(var15); ++var15) {
                                             }

                                             if (85 == 546317845 * var10.ai && ca.length() > 0) {
                                                ca = ca.substring(0, ca.length() - 1);
                                             }

                                             if (84 == 546317845 * var10.ai || 546317845 * var10.ai == 80) {
                                                dm = 1153152795;
                                             }

                                             var62 = var10.ax;
                                             boolean var58 = dw.indexOf(var62) != -1;
                                             if (var58 && ca.length() < 320) {
                                                ca = ca + var10.ax;
                                             }
                                          } else {
                                             ee.ak(0, (byte)84);
                                             ca = "";
                                             cu = "";
                                             hp.ct = 0;
                                             eo.cp = "";
                                             cd = true;
                                          }
                                       }

                                       return;
                                    }
                                 } while(dm * -1232221421 != 1);

                                 if (var10.ai * 546317845 == 85 && cu.length() > 0) {
                                    cu = cu.substring(0, cu.length() - 1);
                                 } else if (84 == 546317845 * var10.ai || 80 == var10.ai * 546317845) {
                                    dm = 0;
                                    if (546317845 * var10.ai == 84) {
                                       ca = ca.trim();
                                       if (ca.length() == 0) {
                                          he.ax(mk.em, mk.ew, mk.ex, 781417688);
                                          return;
                                       }

                                       if (cu.length() == 0) {
                                          he.ax(mk.eh, mk.ek, mk.ey, -96597523);
                                          return;
                                       }

                                       he.ax(mk.jm, mk.jn, mk.jd, 889086809);
                                       ag.hb(false, -1153125802);
                                       fd.hi(20, 1529673899);
                                       return;
                                    }
                                 }

                                 if ((var10.av(82, 757413109) || var10.av(87, -670460330)) && 67 == var10.ai * 546317845) {
                                    Clipboard var54 = Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var60 = var54.getContents(ck.bc);
                                    var49 = 20 - cu.length();
                                    break;
                                 }

                                 if (bd.an(var10.ax, -1457621194)) {
                                    var47 = var10.ax;
                                    var46 = dw.indexOf(var47) != -1;
                                    if (var46 && cu.length() < 20) {
                                       cu = cu + var10.ax;
                                    }
                                 }
                              }
                           } while(var49 <= 0);

                           try {
                              var17 = (String)var60.getTransferData(DataFlavor.stringFlavor);
                              var18 = Math.min(var49, var17.length());
                              int var73 = 0;

                              while(true) {
                                 if (var73 >= var18) {
                                    cu = cu + var17.substring(0, var18);
                                    continue label1336;
                                 }

                                 if (!bd.an(var17.charAt(var73), -24914154)) {
                                    break;
                                 }

                                 char var75 = var17.charAt(var73);
                                 var67 = dw.indexOf(var75) != -1;
                                 if (!var67) {
                                    break;
                                 }

                                 ++var73;
                              }

                              ee.ak(3, (byte)27);
                              return;
                           } catch (UnsupportedFlavorException var37) {
                           } catch (IOException var38) {
                           }
                        }
                     } else {
                        qu var13;
                        if (1145608355 * ce == 3) {
                           var11 = 180 + ak * 678588245;
                           var12 = 241;
                           var13 = var1.av(25, mk.kh.length() - 34, mk.kh, var11, var12);
                           if (1 == var39 && var13.aw(var7, var8, 917820097)) {
                              pi.af(mk.ns, true, false, (byte)76);
                           }

                           var11 = 180 + ak * 678588245;
                           var12 = 276;
                           if (var39 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var12 - 20 && var8 <= 20 + var12) {
                              ay(false, -725569743);
                           }

                           var11 = 180 + ak * 678588245;
                           var12 = 326;
                           if (var39 == 1 && var7 >= var11 - 75 && var7 <= 75 + var11 && var8 >= var12 - 20 && var8 <= 20 + var12) {
                              he.ax(mk.lu, mk.lk, mk.lh, 944141381);
                              ee.ak(5, (byte)73);
                              return;
                           }
                        } else {
                           int var14;
                           if (4 == 1145608355 * ce) {
                              var11 = 180 + 678588245 * ak - 80;
                              var12 = 321;
                              if (var39 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var12 - 20 && var8 <= 20 + var12) {
                                 eo.cp.trim();
                                 if (eo.cp.length() != 6) {
                                    he.ax(mk.br, mk.bg, mk.bu, -1462243186);
                                    return;
                                 }

                                 hp.ct = Integer.parseInt(eo.cp) * -209153533;
                                 eo.cp = "";
                                 ag.hb(true, -923618752);
                                 he.ax(mk.jm, mk.jn, mk.jd, 1687361538);
                                 fd.hi(20, 1014013577);
                                 return;
                              }

                              if (var39 == 1 && var7 >= 678588245 * ak + 180 - 9 && var7 <= ak * 678588245 + 180 + 130 && var8 >= 263 && var8 <= 296) {
                                 cd = !cd;
                              }

                              if (1 == var39 && var7 >= ak * 678588245 + 180 - 34 && var7 <= 180 + ak * 678588245 + 34 && var8 >= 351 && var8 <= 363) {
                                 pi.af(gl.nb("secure", true, 1133567868) + "m=totp-authenticator/disableTOTPRequest", true, false, (byte)-83);
                              }

                              var11 = 80 + 180 + ak * 678588245;
                              if (1 == var39 && var7 >= var11 - 75 && var7 <= 75 + var11 && var8 >= var12 - 20 && var8 <= var12 + 20) {
                                 ee.ak(0, (byte)35);
                                 ca = "";
                                 cu = "";
                                 hp.ct = 0;
                                 eo.cp = "";
                              }

                              while(var10.ag(533160035)) {
                                 boolean var42 = false;

                                 for(var14 = 0; var14 < dc.length(); ++var14) {
                                    if (var10.ax == dc.charAt(var14)) {
                                       var42 = true;
                                       break;
                                    }
                                 }

                                 if (var10.ai * 546317845 == 13) {
                                    ee.ak(0, (byte)110);
                                    ca = "";
                                    cu = "";
                                    hp.ct = 0;
                                    eo.cp = "";
                                 } else {
                                    if (85 == var10.ai * 546317845 && eo.cp.length() > 0) {
                                       eo.cp = eo.cp.substring(0, eo.cp.length() - 1);
                                    }

                                    if (var10.ai * 546317845 == 84) {
                                       eo.cp.trim();
                                       if (eo.cp.length() != 6) {
                                          he.ax(mk.br, mk.bg, mk.bu, 1033163746);
                                          return;
                                       }

                                       hp.ct = Integer.parseInt(eo.cp) * -209153533;
                                       eo.cp = "";
                                       ag.hb(true, -154936065);
                                       he.ax(mk.jm, mk.jn, mk.jd, -202888988);
                                       fd.hi(20, 439784642);
                                       return;
                                    }

                                    if (var42 && eo.cp.length() < 6) {
                                       eo.cp = eo.cp + var10.ax;
                                    }
                                 }
                              }
                           } else if (5 == ce * 1145608355) {
                              var11 = 180 + ak * 678588245 - 80;
                              var12 = 321;
                              if (var39 == 1 && var7 >= var11 - 75 && var7 <= 75 + var11 && var8 >= var12 - 20 && var8 <= var12 + 20) {
                                 ca = ca.trim();
                                 if (ca.length() == 0) {
                                    he.ax(mk.lu, mk.lk, mk.lh, -697183041);
                                 } else {
                                    long var48 = kt.af((byte)-85);
                                    byte var45;
                                    if (var48 == 0L) {
                                       var45 = 5;
                                    } else {
                                       var17 = ca;
                                       Random var66 = new Random();
                                       sg var57 = new sg(128);
                                       sg var61 = new sg(128);
                                       int[] var68 = new int[]{var66.nextInt(), var66.nextInt(), (int)(var48 >> 32), (int)var48};
                                       var57.bu(10, (byte)85);

                                       int var72;
                                       for(var72 = 0; var72 < 4; ++var72) {
                                          var57.ba(var66.nextInt(), -2081835031);
                                       }

                                       var57.ba(var68[0], -2081835031);
                                       var57.ba(var68[1], -2081835031);
                                       var57.bl(var48);
                                       var57.bl(0L);

                                       for(var72 = 0; var72 < 4; ++var72) {
                                          var57.ba(var66.nextInt(), -2081835031);
                                       }

                                       var57.dz(cv.au, cv.ab, -868711728);
                                       var61.bu(10, (byte)63);

                                       for(var72 = 0; var72 < 3; ++var72) {
                                          var61.ba(var66.nextInt(), -2081835031);
                                       }

                                       var61.bl(var66.nextLong());
                                       var61.bv(var66.nextLong());
                                       oa.nj(var61, (byte)62);
                                       var61.bl(var66.nextLong());
                                       var61.dz(cv.au, cv.ab, 1022626266);
                                       var72 = ct.bc(var17, (byte)-67);
                                       if (var72 % 8 != 0) {
                                          var72 += 8 - var72 % 8;
                                       }

                                       sg var76 = new sg(var72);
                                       var76.bh(var17, -1543090123);
                                       var76.at = var72 * -1516355947;
                                       var76.dl(var68, -794961409);
                                       sg var81 = new sg(var76.at * -1633313603 + -1633313603 * var61.at + var57.at * -1633313603 + 5);
                                       var81.bu(2, (byte)55);
                                       var81.bu(var57.at * -1633313603, (byte)16);
                                       var81.cs(var57.al, 0, -1633313603 * var57.at, (byte)47);
                                       var81.bu(-1633313603 * var61.at, (byte)113);
                                       var81.cs(var61.al, 0, var61.at * -1633313603, (byte)10);
                                       var81.bf(-1633313603 * var76.at, (byte)68);
                                       var81.cs(var76.al, 0, -1633313603 * var76.at, (byte)14);
                                       String var79 = jb.af(var81.al, 614137220);

                                       try {
                                          URL var80 = new URL(gl.nb("services", false, -422863982) + "m=accountappeal/login.ws");
                                          URLConnection var82 = var80.openConnection();
                                          var82.setDoInput(true);
                                          var82.setDoOutput(true);
                                          var82.setConnectTimeout(5000);
                                          OutputStreamWriter var84 = new OutputStreamWriter(var82.getOutputStream());
                                          var84.write("data2=" + pg.af(var79, 1633633818) + "&dest=" + pg.af("passwordchoice.ws", 1843965463));
                                          var84.flush();
                                          InputStream var85 = var82.getInputStream();
                                          var81 = new sg(new byte[1000]);

                                          while(true) {
                                             int var86 = var85.read(var81.al, -1633313603 * var81.at, 1000 - var81.at * -1633313603);
                                             if (var86 == -1) {
                                                var84.close();
                                                var85.close();
                                                String var87 = new String(var81.al);
                                                if (var87.startsWith("OFFLINE")) {
                                                   var49 = 4;
                                                } else if (var87.startsWith("WRONG")) {
                                                   var49 = 7;
                                                } else if (var87.startsWith("RELOAD")) {
                                                   var49 = 3;
                                                } else if (var87.startsWith("Not permitted for social network accounts.")) {
                                                   var49 = 6;
                                                } else {
                                                   var81.dk(var68, 2144718978);

                                                   while(-1633313603 * var81.at > 0 && var81.al[var81.at * -1633313603 - 1] == 0) {
                                                      var81.at -= -1516355947;
                                                   }

                                                   var87 = new String(var81.al, 0, var81.at * -1633313603);
                                                   if (dj.an(var87, (byte)-44)) {
                                                      pi.af(var87, true, false, (byte)-4);
                                                      var49 = 2;
                                                   } else {
                                                      var49 = 5;
                                                   }
                                                }
                                                break;
                                             }

                                             var81.at += -1516355947 * var86;
                                             if (var81.at * -1633313603 >= 1000) {
                                                var49 = 5;
                                                break;
                                             }
                                          }
                                       } catch (Throwable var33) {
                                          var33.printStackTrace();
                                          var49 = 5;
                                       }

                                       var45 = (byte)var49;
                                    }

                                    switch (var45) {
                                       case 2:
                                          he.ax(mk.la, mk.lp, mk.ly, 1249079948);
                                          ee.ak(6, (byte)42);
                                          break;
                                       case 3:
                                          he.ax(mk.ln, mk.lt, mk.lz, 1974314056);
                                          break;
                                       case 4:
                                          he.ax(mk.lc, mk.ld, mk.lq, -1609486189);
                                          break;
                                       case 5:
                                          he.ax(mk.lj, mk.ll, mk.le, 2119710044);
                                          break;
                                       case 6:
                                          he.ax(mk.lb, mk.lx, mk.lo, 2089997413);
                                          break;
                                       case 7:
                                          he.ax(mk.lw, mk.lr, mk.mt, -1477733518);
                                    }
                                 }

                                 return;
                              }

                              var11 = ak * 678588245 + 180 + 80;
                              if (var39 == 1 && var7 >= var11 - 75 && var7 <= 75 + var11 && var8 >= var12 - 20 && var8 <= 20 + var12) {
                                 aq.aa(true, 1620071571);
                              }

                              var43 = 361;
                              if (as.bw != null) {
                                 var14 = 944313703 * as.bw.aw / 2;
                                 if (1 == var39 && var7 >= as.bw.af * -844906645 - var14 && var7 <= var14 + -844906645 * as.bw.af && var8 >= var43 - 15 && var8 < var43) {
                                    pi.af(gl.nb("secure", true, -995271799) + "m=weblogin/g=oldscape/cant_log_in", true, false, (byte)-74);
                                 }
                              }

                              while(var10.ag(519399291)) {
                                 var46 = false;

                                 for(var15 = 0; var15 < dw.length(); ++var15) {
                                    if (var10.ax == dw.charAt(var15)) {
                                       var46 = true;
                                       break;
                                    }
                                 }

                                 if (546317845 * var10.ai == 13) {
                                    aq.aa(true, 1620071571);
                                 } else {
                                    if (85 == 546317845 * var10.ai && ca.length() > 0) {
                                       ca = ca.substring(0, ca.length() - 1);
                                    }

                                    if (546317845 * var10.ai == 84) {
                                       ca = ca.trim();
                                       if (ca.length() == 0) {
                                          he.ax(mk.lu, mk.lk, mk.lh, 2087455358);
                                       } else {
                                          long var16 = kt.af((byte)-42);
                                          if (var16 == 0L) {
                                             var47 = 5;
                                          } else {
                                             String var19 = ca;
                                             Random var20 = new Random();
                                             sg var21 = new sg(128);
                                             sg var22 = new sg(128);
                                             int[] var23 = new int[]{var20.nextInt(), var20.nextInt(), (int)(var16 >> 32), (int)var16};
                                             var21.bu(10, (byte)36);

                                             int var24;
                                             for(var24 = 0; var24 < 4; ++var24) {
                                                var21.ba(var20.nextInt(), -2081835031);
                                             }

                                             var21.ba(var23[0], -2081835031);
                                             var21.ba(var23[1], -2081835031);
                                             var21.bl(var16);
                                             var21.bl(0L);

                                             for(var24 = 0; var24 < 4; ++var24) {
                                                var21.ba(var20.nextInt(), -2081835031);
                                             }

                                             var21.dz(cv.au, cv.ab, 2132196350);
                                             var22.bu(10, (byte)107);

                                             for(var24 = 0; var24 < 3; ++var24) {
                                                var22.ba(var20.nextInt(), -2081835031);
                                             }

                                             var22.bl(var20.nextLong());
                                             var22.bv(var20.nextLong());
                                             oa.nj(var22, (byte)33);
                                             var22.bl(var20.nextLong());
                                             var22.dz(cv.au, cv.ab, 653993895);
                                             var24 = ct.bc(var19, (byte)108);
                                             if (0 != var24 % 8) {
                                                var24 += 8 - var24 % 8;
                                             }

                                             sg var25 = new sg(var24);
                                             var25.bh(var19, -1701455335);
                                             var25.at = var24 * -1516355947;
                                             var25.dl(var23, -794961409);
                                             sg var26 = new sg(5 + var21.at * -1633313603 + -1633313603 * var22.at + -1633313603 * var25.at);
                                             var26.bu(2, (byte)60);
                                             var26.bu(-1633313603 * var21.at, (byte)78);
                                             var26.cs(var21.al, 0, var21.at * -1633313603, (byte)91);
                                             var26.bu(var22.at * -1633313603, (byte)27);
                                             var26.cs(var22.al, 0, var22.at * -1633313603, (byte)52);
                                             var26.bf(var25.at * -1633313603, (byte)88);
                                             var26.cs(var25.al, 0, var25.at * -1633313603, (byte)121);
                                             String var27 = jb.af(var26.al, -2033214614);

                                             try {
                                                URL var28 = new URL(gl.nb("services", false, 837287715) + "m=accountappeal/login.ws");
                                                URLConnection var29 = var28.openConnection();
                                                var29.setDoInput(true);
                                                var29.setDoOutput(true);
                                                var29.setConnectTimeout(5000);
                                                OutputStreamWriter var30 = new OutputStreamWriter(var29.getOutputStream());
                                                var30.write("data2=" + pg.af(var27, 1818779547) + "&dest=" + pg.af("passwordchoice.ws", 1793806890));
                                                var30.flush();
                                                InputStream var31 = var29.getInputStream();
                                                var26 = new sg(new byte[1000]);

                                                while(true) {
                                                   int var32 = var31.read(var26.al, var26.at * -1633313603, 1000 - var26.at * -1633313603);
                                                   if (var32 == -1) {
                                                      var30.close();
                                                      var31.close();
                                                      String var88 = new String(var26.al);
                                                      if (var88.startsWith("OFFLINE")) {
                                                         var18 = 4;
                                                      } else if (var88.startsWith("WRONG")) {
                                                         var18 = 7;
                                                      } else if (var88.startsWith("RELOAD")) {
                                                         var18 = 3;
                                                      } else if (var88.startsWith("Not permitted for social network accounts.")) {
                                                         var18 = 6;
                                                      } else {
                                                         var26.dk(var23, 2012514407);

                                                         while(var26.at * -1633313603 > 0 && 0 == var26.al[var26.at * -1633313603 - 1]) {
                                                            var26.at -= -1516355947;
                                                         }

                                                         var88 = new String(var26.al, 0, var26.at * -1633313603);
                                                         if (dj.an(var88, (byte)-15)) {
                                                            pi.af(var88, true, false, (byte)-78);
                                                            var18 = 2;
                                                         } else {
                                                            var18 = 5;
                                                         }
                                                      }
                                                      break;
                                                   }

                                                   var26.at += -1516355947 * var32;
                                                   if (var26.at * -1633313603 >= 1000) {
                                                      var18 = 5;
                                                      break;
                                                   }
                                                }
                                             } catch (Throwable var34) {
                                                var34.printStackTrace();
                                                var18 = 5;
                                             }

                                             var47 = (char)var18;
                                          }

                                          switch (var47) {
                                             case '\u0002':
                                                he.ax(mk.la, mk.lp, mk.ly, 983204585);
                                                ee.ak(6, (byte)34);
                                                break;
                                             case '\u0003':
                                                he.ax(mk.ln, mk.lt, mk.lz, 386900304);
                                                break;
                                             case '\u0004':
                                                he.ax(mk.lc, mk.ld, mk.lq, 808963360);
                                                break;
                                             case '\u0005':
                                                he.ax(mk.lj, mk.ll, mk.le, -2041331046);
                                                break;
                                             case '\u0006':
                                                he.ax(mk.lb, mk.lx, mk.lo, 1428235498);
                                                break;
                                             case '\u0007':
                                                he.ax(mk.lw, mk.lr, mk.mt, 983935228);
                                          }
                                       }

                                       return;
                                    }

                                    if (var46 && ca.length() < 320) {
                                       ca = ca + var10.ax;
                                    }
                                 }
                              }
                           } else if (1145608355 * ce != 6) {
                              if (ce * 1145608355 == 7) {
                                 if (jb.ds && !client.cy) {
                                    var11 = fy.az * 950254081 - 150;
                                    var12 = 40 + var11 + 240 + 25;
                                    var43 = 231;
                                    var14 = 40 + var43;
                                    if (var39 == 1 && var7 >= var11 && var7 <= var12 && var8 >= var43 && var8 <= var14) {
                                       var49 = var11;
                                       int var52 = 0;

                                       while(true) {
                                          if (var52 >= 8) {
                                             var15 = 0;
                                             break;
                                          }

                                          if (var7 <= var49 + 30) {
                                             var15 = var52;
                                             break;
                                          }

                                          var49 += 30;
                                          var49 += var52 != 1 && 3 != var52 ? 5 : 20;
                                          ++var52;
                                       }

                                       cq = var15 * 1670187551;
                                    }

                                    var15 = 678588245 * ak + 180 - 80;
                                    var62 = 321;
                                    boolean var55;
                                    Date var59;
                                    SimpleDateFormat var63;
                                    boolean var65;
                                    Date var69;
                                    StringBuilder var70;
                                    Date var71;
                                    int var77;
                                    String[] var78;
                                    String var83;
                                    if (var39 == 1 && var7 >= var15 - 75 && var7 <= 75 + var15 && var8 >= var62 - 20 && var8 <= 20 + var62) {
                                       label1152: {
                                          try {
                                             var63 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
                                             var63.setLenient(false);
                                             var70 = new StringBuilder();
                                             var78 = cm;
                                             var77 = 0;

                                             while(true) {
                                                if (var77 < var78.length) {
                                                   var83 = var78[var77];
                                                   if (var83 != null) {
                                                      var70.append(var83);
                                                      ++var77;
                                                      continue;
                                                   }

                                                   ju.at("Date not valid.", "Please ensure all characters are populated.", "", -1063106865);
                                                   var59 = null;
                                                } else {
                                                   var70.append("12");
                                                   var59 = var63.parse(var70.toString());
                                                }

                                                var69 = var59;
                                                break;
                                             }
                                          } catch (ParseException var36) {
                                             ju.at("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", 487305841);
                                             var55 = false;
                                             break label1152;
                                          }

                                          if (var69 == null) {
                                             var55 = false;
                                          } else {
                                             var65 = do.al(var69, 1695409986);
                                             var71 = ep.aq(2052817619);
                                             var67 = var69.after(var71);
                                             if (!var67) {
                                                ju.at("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", -1450190387);
                                                var55 = false;
                                             } else {
                                                if (!var65) {
                                                   oj.ck = 1974420353;
                                                } else {
                                                   oj.ck = (int)(var69.getTime() / 86400000L - 11745L) * -909067137;
                                                }

                                                var55 = true;
                                             }
                                          }
                                       }

                                       if (var55) {
                                          fd.hi(50, 1062685180);
                                          return;
                                       }
                                    }

                                    var15 = 80 + ak * 678588245 + 180;
                                    if (1 == var39 && var7 >= var15 - 75 && var7 <= var15 + 75 && var8 >= var62 - 20 && var8 <= var62 + 20) {
                                       cm = new String[8];
                                       aq.aa(true, 1620071571);
                                    }

                                    while(var10.ag(1783082111)) {
                                       if (101 == 546317845 * var10.ai) {
                                          cm[cq * -1262226977] = null;
                                       }

                                       if (546317845 * var10.ai == 85) {
                                          if (null == cm[-1262226977 * cq] && -1262226977 * cq > 0) {
                                             cq -= 1670187551;
                                          }

                                          cm[cq * -1262226977] = null;
                                       }

                                       if (var10.ax >= '0' && var10.ax <= '9') {
                                          cm[-1262226977 * cq] = "" + var10.ax;
                                          if (-1262226977 * cq < 7) {
                                             cq += 1670187551;
                                          }
                                       }

                                       if (546317845 * var10.ai == 84) {
                                          label1081: {
                                             try {
                                                var63 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
                                                var63.setLenient(false);
                                                var70 = new StringBuilder();
                                                var78 = cm;
                                                var77 = 0;

                                                while(true) {
                                                   if (var77 < var78.length) {
                                                      var83 = var78[var77];
                                                      if (var83 != null) {
                                                         var70.append(var83);
                                                         ++var77;
                                                         continue;
                                                      }

                                                      ju.at("Date not valid.", "Please ensure all characters are populated.", "", -1176898571);
                                                      var59 = null;
                                                   } else {
                                                      var70.append("12");
                                                      var59 = var63.parse(var70.toString());
                                                   }

                                                   var69 = var59;
                                                   break;
                                                }
                                             } catch (ParseException var35) {
                                                ju.at("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", 93290825);
                                                var55 = false;
                                                break label1081;
                                             }

                                             if (var69 == null) {
                                                var55 = false;
                                             } else {
                                                var65 = do.al(var69, 1981767525);
                                                var71 = ep.aq(2052817619);
                                                var67 = var69.after(var71);
                                                if (!var67) {
                                                   ju.at("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", -34991922);
                                                   var55 = false;
                                                } else {
                                                   if (!var65) {
                                                      oj.ck = 1974420353;
                                                   } else {
                                                      oj.ck = (int)(var69.getTime() / 86400000L - 11745L) * -909067137;
                                                   }

                                                   var55 = true;
                                                }
                                             }
                                          }

                                          if (var55) {
                                             fd.hi(50, 1694607782);
                                          }

                                          return;
                                       }
                                    }
                                 } else {
                                    var11 = 678588245 * ak + 180 - 80;
                                    var12 = 321;
                                    if (1 == var39 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var12 - 20 && var8 <= 20 + var12) {
                                       pi.af(gl.nb("secure", true, -1279630501) + "m=dob/set_dob.ws", true, false, (byte)-20);
                                       he.ax(mk.ls, mk.lf, mk.li, 114457455);
                                       ee.ak(6, (byte)97);
                                       return;
                                    }

                                    var11 = 80 + ak * 678588245 + 180;
                                    if (var39 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var12 - 20 && var8 <= var12 + 20) {
                                       aq.aa(true, 1620071571);
                                    }
                                 }
                              } else if (8 == 1145608355 * ce) {
                                 var11 = ak * 678588245 + 180 - 80;
                                 var44 = 321;
                                 if (var39 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var44 - 20 && var8 <= var44 + 20) {
                                    pi.af("https://www.jagex.com/terms/privacy", true, false, (byte)20);
                                    he.ax(mk.ls, mk.lf, mk.li, -1791929805);
                                    ee.ak(6, (byte)17);
                                    return;
                                 }

                                 var11 = 80 + ak * 678588245 + 180;
                                 if (1 == var39 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var44 - 20 && var8 <= var44 + 20) {
                                    aq.aa(true, 1620071571);
                                 }
                              } else if (9 == 1145608355 * ce) {
                                 var11 = 180 + 678588245 * ak;
                                 var44 = 311;
                                 if (84 == var40.ai * 546317845 || var40.ai * 546317845 == 13 || 1 == var39 && var7 >= var11 - 75 && var7 <= 75 + var11 && var8 >= var44 - 20 && var8 <= var44 + 20) {
                                    ay(false, -2032394184);
                                 }
                              } else if (10 == ce * 1145608355) {
                                 var11 = ak * 678588245 + 180;
                                 var44 = 209;
                                 if (546317845 * var40.ai == 84 || 1 == var39 && var7 >= var11 - 109 && var7 <= 109 + var11 && var8 >= var44 && var8 <= var44 + 68) {
                                    he.ax(mk.jm, mk.jn, mk.jd, -302102481);
                                    client.gy = sr.an;
                                    ag.hb(false, -1295416157);
                                    fd.hi(20, 1134554066);
                                 }
                              } else if (1145608355 * ce == 12) {
                                 var11 = fy.az * 950254081;
                                 var44 = 233;
                                 var13 = var2.av(0, 30, mk.ma, var11, var44);
                                 qu var50 = var2.av(32, 32, mk.ma, var11, var44);
                                 qu var56 = var2.av(70, 34, mk.ma, var11, var44);
                                 var12 = var44 + 17;
                                 qu var64 = var2.av(0, 34, mk.mp, var11, var12);
                                 if (var39 == 1) {
                                    if (var13.aw(var7, var8, 917820097)) {
                                       pi.af("https://www.jagex.com/terms", true, false, (byte)-33);
                                    } else if (var50.aw(var7, var8, 917820097)) {
                                       pi.af("https://www.jagex.com/terms/privacy", true, false, (byte)-98);
                                    } else if (var56.aw(var7, var8, 917820097) || var64.aw(var7, var8, 917820097)) {
                                       pi.af("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false, (byte)37);
                                    }
                                 }

                                 var11 = fy.az * 950254081 - 80;
                                 var44 = 311;
                                 if (1 == var39 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var44 - 20 && var8 <= var44 + 20) {
                                    aj.vb.ap(client.cl * 976454555, -1272005659);
                                    ay(true, -704095939);
                                 }

                                 var11 = fy.az * 950254081 + 80;
                                 if (1 == var39 && var7 >= var11 - 75 && var7 <= 75 + var11 && var8 >= var44 - 20 && var8 <= var44 + 20) {
                                    ce = 127737743;
                                 }
                              } else if (1145608355 * ce == 13) {
                                 var11 = fy.az * 950254081;
                                 var44 = 321;
                                 if (1 == var39 && var7 >= var11 - 75 && var7 <= 75 + var11 && var8 >= var44 - 20 && var8 <= var44 + 20) {
                                    ay(true, -1397639920);
                                 }
                              } else if (1145608355 * ce == 14) {
                                 String var53 = "";
                                 switch (-1478945003 * ba) {
                                    case 0:
                                       var53 = "https://secure.runescape.com/m=offence-appeal/account-history";
                                       break;
                                    case 1:
                                       var53 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                                       break;
                                    case 2:
                                       var53 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                                       break;
                                    default:
                                       aq.aa(false, 1620071571);
                                 }

                                 var12 = 678588245 * ak + 180;
                                 var43 = 276;
                                 if (1 == var39 && var7 >= var12 - 75 && var7 <= 75 + var12 && var8 >= var43 - 20 && var8 <= var43 + 20) {
                                    pi.af(var53, true, false, (byte)-2);
                                    he.ax(mk.ls, mk.lf, mk.li, -1463010180);
                                    ee.ak(6, (byte)60);
                                    return;
                                 }

                                 var12 = ak * 678588245 + 180;
                                 var43 = 326;
                                 if (var39 == 1 && var7 >= var12 - 75 && var7 <= var12 + 75 && var8 >= var43 - 20 && var8 <= var43 + 20) {
                                    aq.aa(false, 1620071571);
                                 }
                              } else if (24 == ce * 1145608355) {
                                 var11 = ak * 678588245 + 180;
                                 var44 = 301;
                                 if (1 == var39 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var44 - 20 && var8 <= var44 + 20) {
                                    ay(false, -599553055);
                                 }
                              } else if (32 == ce * 1145608355) {
                                 var11 = 180 + 678588245 * ak - 80;
                                 var44 = 321;
                                 if (var39 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var44 - 20 && var8 <= var44 + 20) {
                                    pi.af(gl.nb("secure", true, 1410499303) + "m=dob/set_dob.ws", true, false, (byte)-6);
                                    he.ax(mk.ls, mk.lf, mk.li, 1634492090);
                                    ee.ak(6, (byte)6);
                                    return;
                                 }

                                 var11 = 80 + 180 + ak * 678588245;
                                 if (1 == var39 && var7 >= var11 - 75 && var7 <= 75 + var11 && var8 >= var44 - 20 && var8 <= var44 + 20) {
                                    aq.aa(true, 1620071571);
                                 }
                              } else if (1145608355 * ce == 33) {
                                 var11 = 180 + ak * 678588245;
                                 var44 = 276;
                                 if (var39 == 1 && var7 >= var11 - 75 && var7 <= 75 + var11 && var8 >= var44 - 20 && var8 <= 20 + var44) {
                                    pi.af(mk.ns, true, false, (byte)55);
                                 }

                                 var11 = 180 + 678588245 * ak;
                                 var44 = 326;
                                 if (1 == var39 && var7 >= var11 - 75 && var7 <= 75 + var11 && var8 >= var44 - 20 && var8 <= var44 + 20) {
                                    aq.aa(true, 1620071571);
                                 }
                              }
                           } else {
                              while(true) {
                                 do {
                                    if (!var10.ag(606392331)) {
                                       var41 = 321;
                                       if (var39 == 1 && var8 >= var41 - 20 && var8 <= 20 + var41) {
                                          aq.aa(true, 1620071571);
                                       }

                                       return;
                                    }
                                 } while(84 != 546317845 * var10.ai && 546317845 * var10.ai != 13);

                                 aq.aa(true, 1620071571);
                              }
                           }
                        }
                     }
                  }
               }

            }
         }
      }
   }

   static Date bj() {
      Calendar var0 = Calendar.getInstance();
      var0.set(2, 0);
      var0.set(5, 1);
      var0.set(1, -144020587);
      return var0.getTime();
   }

   cz() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "cz.<init>(" + ')');
      }
   }

   static Date bs() {
      Calendar var0 = Calendar.getInstance();
      var0.set(2, 0);
      var0.set(5, 1);
      var0.set(1, 1900);
      return var0.getTime();
   }

   static boolean br(Date var0) {
      Calendar var1 = Calendar.getInstance();
      var1.set(1, var1.get(1) - 13);
      var1.set(5, var1.get(5) + 1);
      var1.set(11, 0);
      var1.set(12, 0);
      var1.set(13, 0);
      var1.set(14, 0);
      Date var2 = var1.getTime();
      return var0.before(var2);
   }

   static boolean bg(Date var0) {
      Calendar var1 = Calendar.getInstance();
      var1.set(1, var1.get(1) - 13);
      var1.set(5, var1.get(5) + 1);
      var1.set(11, 0);
      var1.set(12, 0);
      var1.set(13, 0);
      var1.set(14, 0);
      Date var2 = var1.getTime();
      return var0.before(var2);
   }

   static void bv(String var0, String var1, String var2) {
      ee.ak(7, (byte)120);
      he.ax(var0, var1, var2, 520243513);
   }

   static boolean bf(Date var0) {
      Calendar var1 = Calendar.getInstance();
      var1.set(1, var1.get(1) - 13);
      var1.set(5, var1.get(5) + 1);
      var1.set(11, 0);
      var1.set(12, 0);
      var1.set(13, 0);
      var1.set(14, 0);
      Date var2 = var1.getTime();
      return var0.before(var2);
   }

   static void bq(String var0, String var1, String var2) {
      ee.ak(7, (byte)11);
      he.ax(var0, var1, var2, -1852689316);
   }

   static void ba(String var0, String var1, String var2) {
      ee.ak(7, (byte)95);
      he.ax(var0, var1, var2, 67027467);
   }

   static void cs(on var0, on var1, on var2) {
      aw = (-1687260435 * bm.aj - 765) / 2 * 983792155;
      ak = 794898887 * aw + 2036160930;
      fy.az = -1036961612 + ak * -949768875;
      if (di) {
         cc.ai(var0, var1, (byte)-100);
      } else {
         ex.at.ay(aw * 578342931, 0);
         ho.aa.ay(aw * 578342931 + 382, 0);
         ad.ay.aw(aw * 578342931 + 382 - ad.ay.aw / 2, 18);
         int var3;
         int var4;
         if (client.dw * -1275976559 == 0 || client.dw * -1275976559 == 5) {
            var3 = 20;
            var0.aj(mk.iv, 180 + 678588245 * ak, 245 - var3, 16777215, -1);
            var4 = 253 - var3;
            th.ek(ak * 678588245 + 180 - 152, var4, 304, 34, 9179409);
            th.ek(678588245 * ak + 180 - 151, var4 + 1, 302, 32, 0);
            th.em(ak * 678588245 + 180 - 150, 2 + var4, -819692701 * ad, 30, 9179409);
            th.em(180 + 678588245 * ak - 150 + -819692701 * ad, 2 + var4, 300 - ad * -819692701, 30, 0);
            var0.aj(ae, 180 + ak * 678588245, 276 - var3, 16777215, -1);
         }

         String var5;
         String var6;
         short var17;
         if (client.dw * -1275976559 == 20) {
            au.aw(ak * 678588245 + 180 - au.aw / 2, 271 - au.ac / 2);
            var3 = 201;
            var0.aj(cs, 180 + 678588245 * ak, var3, 16776960, 0);
            var3 += 15;
            var0.aj(cc, ak * 678588245 + 180, var3, 16776960, 0);
            var3 += 15;
            var0.aj(cn, ak * 678588245 + 180, var3, 16776960, 0);
            var3 += 15;
            var3 += 7;
            if (4 != ce * 1145608355 && 10 != 1145608355 * ce) {
               var0.ar(mk.jy, ak * 678588245 + 180 - 110, var3, 16777215, 0);
               var17 = 200;

               for(var5 = am.aw(1211481571); var0.ao(var5) > var17; var5 = var5.substring(0, var5.length() - 1)) {
               }

               var0.ar(ou.ah(var5), 180 + ak * 678588245 - 70, var3, 16777215, 0);
               var3 += 15;

               for(var6 = mc.ai(cu, (byte)1); var0.ao(var6) > var17; var6 = var6.substring(1)) {
               }

               var0.ar(mk.jp + var6, 180 + ak * 678588245 - 108, var3, 16777215, 0);
               var3 += 15;
            }
         }

         if (10 == client.dw * -1275976559 || client.dw * -1275976559 == 11 || client.dw * -1275976559 == 50) {
            au.aw(ak * 678588245, 171);
            short var18;
            int var19;
            if (0 == ce * 1145608355) {
               var18 = 251;
               var0.aj(mk.ja, 678588245 * ak + 180, var18, 16776960, 0);
               var3 = var18 + 30;
               var4 = 180 + 678588245 * ak - 80;
               var19 = 291;
               lu.ab.aw(var4 - 73, var19 - 20);
               var0.ak(mk.jb, var4 - 73, var19 - 20, 144, 40, 16777215, 0, 1, 1, 0);
               var4 = 180 + 678588245 * ak + 80;
               lu.ab.aw(var4 - 73, var19 - 20);
               var0.ak(mk.jz, var4 - 73, var19 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (1 == 1145608355 * ce) {
               var0.aj(ci, 678588245 * ak + 180, 201, 16776960, 0);
               var18 = 236;
               var0.aj(cs, 678588245 * ak + 180, var18, 16777215, 0);
               var3 = var18 + 15;
               var0.aj(cc, ak * 678588245 + 180, var3, 16777215, 0);
               var3 += 15;
               var0.aj(cn, ak * 678588245 + 180, var3, 16777215, 0);
               var3 += 15;
               var4 = 678588245 * ak + 180 - 80;
               var19 = 321;
               lu.ab.aw(var4 - 73, var19 - 20);
               var0.aj(mk.aq, var4, var19 + 5, 16777215, 0);
               var4 = ak * 678588245 + 180 + 80;
               lu.ab.aw(var4 - 73, var19 - 20);
               var0.aj(mk.jl, var4, 5 + var19, 16777215, 0);
            } else {
               int var7;
               if (1145608355 * ce == 2) {
                  var18 = 201;
                  var0.aj(cs, fy.az * 950254081, var18, 16776960, 0);
                  var3 = var18 + 15;
                  var0.aj(cc, 950254081 * fy.az, var3, 16776960, 0);
                  var3 += 15;
                  var0.aj(cn, fy.az * 950254081, var3, 16776960, 0);
                  var3 += 15;
                  var3 += 7;
                  var0.ar(mk.jy, 950254081 * fy.az - 110, var3, 16777215, 0);
                  var17 = 200;

                  for(var5 = am.aw(830529141); var0.ao(var5) > var17; var5 = var5.substring(1)) {
                  }

                  var0.ar(ou.ah(var5) + (0 == dm * -1232221421 & client.ep * -1886224337 % 40 < 20 ? oa.an(16776960, 835389347) + dq.aw : ""), 950254081 * fy.az - 70, var3, 16777215, 0);
                  var3 += 15;

                  for(var6 = mc.ai(cu, (byte)1); var0.ao(var6) > var17; var6 = var6.substring(1)) {
                  }

                  var0.ar(mk.jp + var6 + (-1232221421 * dm == 1 & client.ep * -1886224337 % 40 < 20 ? oa.an(16776960, 935111588) + dq.aw : ""), 950254081 * fy.az - 108, var3, 16777215, 0);
                  var3 += 15;
                  var18 = 277;
                  var7 = -117 + 950254081 * fy.az;
                  boolean var9 = client.hb;
                  boolean var10 = cj;
                  tc var8 = var9 ? (var10 ? ah : gs.ag) : (var10 ? ai : ax);
                  var8.aw(var7, var18);
                  var7 += 5 + var8.aw;
                  var1.ar(mk.kc, var7, 13 + var18, 16776960, 0);
                  var7 = 950254081 * fy.az + 24;
                  boolean var13 = aj.vb.al(-2073499476);
                  boolean var14 = ch;
                  tc var12 = var13 ? (var14 ? ah : gs.ag) : (var14 ? ai : ax);
                  var12.aw(var7, var18);
                  var7 += 5 + var12.aw;
                  var1.ar(mk.ku, var7, var18 + 13, 16776960, 0);
                  var3 = var18 + 15;
                  int var15 = fy.az * 950254081 - 80;
                  short var16 = 321;
                  lu.ab.aw(var15 - 73, var16 - 20);
                  var0.aj(mk.ju, var15, var16 + 5, 16777215, 0);
                  var15 = 80 + fy.az * 950254081;
                  lu.ab.aw(var15 - 73, var16 - 20);
                  var0.aj(mk.jl, var15, 5 + var16, 16777215, 0);
                  var18 = 357;
                  switch (bp * -1733444455) {
                     case 2:
                        am.bc = mk.lg;
                        break;
                     default:
                        am.bc = mk.lv;
                  }

                  dq.bh = new qu(fy.az * 950254081, var18, var1.ao(am.bc), 11);
                  as.bw = new qu(950254081 * fy.az, var18, var1.ao(mk.lm), 11);
                  var1.aj(am.bc, 950254081 * fy.az, var18, 16777215, 0);
               } else if (3 == ce * 1145608355) {
                  var18 = 201;
                  var0.aj(mk.ke, 678588245 * ak + 180, var18, 16776960, 0);
                  var3 = var18 + 20;
                  var1.aj(mk.ky, ak * 678588245 + 180, var3, 16776960, 0);
                  var3 += 20;
                  var1.aj(mk.kh, 678588245 * ak + 180, var3, 16776960, 0);
                  var3 += 15;
                  var4 = 678588245 * ak + 180;
                  var19 = 276;
                  lu.ab.aw(var4 - 73, var19 - 20);
                  var2.aj(mk.kp, var4, var19 + 5, 16777215, 0);
                  var4 = 180 + ak * 678588245;
                  var19 = 326;
                  lu.ab.aw(var4 - 73, var19 - 20);
                  var2.aj(mk.kf, var4, 5 + var19, 16777215, 0);
               } else {
                  short var21;
                  if (ce * 1145608355 == 4) {
                     var0.aj(mk.je, 180 + 678588245 * ak, 201, 16776960, 0);
                     var18 = 236;
                     var0.aj(cs, 678588245 * ak + 180, var18, 16777215, 0);
                     var3 = var18 + 15;
                     var0.aj(cc, 180 + ak * 678588245, var3, 16777215, 0);
                     var3 += 15;
                     var0.aj(cn, 678588245 * ak + 180, var3, 16777215, 0);
                     var3 += 15;
                     var0.ar(mk.jt + mc.ai(eo.cp, (byte)1) + (-1886224337 * client.ep % 40 < 20 ? oa.an(16776960, 178038969) + dq.aw : ""), ak * 678588245 + 180 - 108, var3, 16777215, 0);
                     var3 -= 8;
                     var0.ar(mk.aa, 678588245 * ak + 180 - 9, var3, 16776960, 0);
                     var3 += 15;
                     var0.ar(mk.ay, 180 + ak * 678588245 - 9, var3, 16776960, 0);
                     var4 = ak * 678588245 + 180 - 9 + var0.ao(mk.ay) + 15;
                     var19 = var3 - var0.al;
                     tc var20;
                     if (cd) {
                        var20 = gs.ag;
                     } else {
                        var20 = ax;
                     }

                     var20.aw(var4, var19);
                     var3 += 15;
                     var7 = 180 + 678588245 * ak - 80;
                     var21 = 321;
                     lu.ab.aw(var7 - 73, var21 - 20);
                     var0.aj(mk.aq, var7, var21 + 5, 16777215, 0);
                     var7 = 80 + ak * 678588245 + 180;
                     lu.ab.aw(var7 - 73, var21 - 20);
                     var0.aj(mk.jl, var7, 5 + var21, 16777215, 0);
                     var1.aj(mk.jj, 180 + ak * 678588245, var21 + 36, 255, 0);
                  } else if (ce * 1145608355 == 5) {
                     var0.aj(mk.ks, ak * 678588245 + 180, 201, 16776960, 0);
                     var18 = 221;
                     var2.aj(cs, 678588245 * ak + 180, var18, 16776960, 0);
                     var3 = var18 + 15;
                     var2.aj(cc, 180 + 678588245 * ak, var3, 16776960, 0);
                     var3 += 15;
                     var2.aj(cn, 180 + 678588245 * ak, var3, 16776960, 0);
                     var3 += 15;
                     var3 += 14;
                     var0.ar(mk.kn, 180 + 678588245 * ak - 145, var3, 16777215, 0);
                     var17 = 174;

                     for(var5 = am.aw(669527653); var0.ao(var5) > var17; var5 = var5.substring(1)) {
                     }

                     var0.ar(ou.ah(var5) + (-1886224337 * client.ep % 40 < 20 ? oa.an(16776960, 1694019488) + dq.aw : ""), ak * 678588245 + 180 - 34, var3, 16777215, 0);
                     var3 += 15;
                     int var22 = 180 + 678588245 * ak - 80;
                     short var24 = 321;
                     lu.ab.aw(var22 - 73, var24 - 20);
                     var0.aj(mk.kz, var22, var24 + 5, 16777215, 0);
                     var22 = 80 + 180 + ak * 678588245;
                     lu.ab.aw(var22 - 73, var24 - 20);
                     var0.aj(mk.km, var22, var24 + 5, 16777215, 0);
                     var24 = 356;
                     var1.aj(mk.lm, fy.az * 950254081, var24, 268435455, 0);
                  } else {
                     short var23;
                     if (6 == ce * 1145608355) {
                        var18 = 201;
                        var0.aj(cs, 180 + ak * 678588245, var18, 16776960, 0);
                        var3 = var18 + 15;
                        var0.aj(cc, 180 + ak * 678588245, var3, 16776960, 0);
                        var3 += 15;
                        var0.aj(cn, 678588245 * ak + 180, var3, 16776960, 0);
                        var3 += 15;
                        var4 = 180 + 678588245 * ak;
                        var23 = 321;
                        lu.ab.aw(var4 - 73, var23 - 20);
                        var0.aj(mk.km, var4, var23 + 5, 16777215, 0);
                     } else if (1145608355 * ce == 7) {
                        if (jb.ds && !client.cy) {
                           var18 = 201;
                           var0.aj(cs, 950254081 * fy.az, var18, 16776960, 0);
                           var3 = var18 + 15;
                           var0.aj(cc, 950254081 * fy.az, var3, 16776960, 0);
                           var3 += 15;
                           var0.aj(cn, 950254081 * fy.az, var3, 16776960, 0);
                           var4 = fy.az * 950254081 - 150;
                           var3 += 10;

                           for(var19 = 0; var19 < 8; ++var19) {
                              lu.ab.au(var4, var3, 30, 40);
                              boolean var25 = cq * -1262226977 == var19 & -1886224337 * client.ep % 40 < 20;
                              var0.ar((cm[var19] == null ? "" : cm[var19]) + (var25 ? oa.an(16776960, -260017787) + dq.aw : ""), var4 + 10, 27 + var3, 16777215, 0);
                              if (1 != var19 && 3 != var19) {
                                 var4 += 35;
                              } else {
                                 var4 += 50;
                                 var0.ar(ou.ah("/"), var4 - 13, 27 + var3, 16777215, 0);
                              }
                           }

                           var19 = fy.az * 950254081 - 80;
                           short var26 = 321;
                           lu.ab.aw(var19 - 73, var26 - 20);
                           var0.aj("Submit", var19, var26 + 5, 16777215, 0);
                           var19 = 80 + 950254081 * fy.az;
                           lu.ab.aw(var19 - 73, var26 - 20);
                           var0.aj(mk.jl, var19, var26 + 5, 16777215, 0);
                        } else {
                           var18 = 216;
                           var0.aj(mk.mw, ak * 678588245 + 180, var18, 16776960, 0);
                           var3 = var18 + 15;
                           var2.aj(mk.mz, 180 + ak * 678588245, var3, 16776960, 0);
                           var3 += 15;
                           var2.aj(mk.mu, 180 + 678588245 * ak, var3, 16776960, 0);
                           var3 += 15;
                           var4 = ak * 678588245 + 180 - 80;
                           var23 = 321;
                           lu.ab.aw(var4 - 73, var23 - 20);
                           var0.aj(mk.mq, var4, 5 + var23, 16777215, 0);
                           var4 = 180 + ak * 678588245 + 80;
                           lu.ab.aw(var4 - 73, var23 - 20);
                           var0.aj(mk.km, var4, var23 + 5, 16777215, 0);
                        }
                     } else if (8 == 1145608355 * ce) {
                        var18 = 216;
                        var0.aj(mk.fb, ak * 678588245 + 180, var18, 16776960, 0);
                        var3 = var18 + 15;
                        var2.aj(mk.fn, 180 + 678588245 * ak, var3, 16776960, 0);
                        var3 += 15;
                        var2.aj(mk.fz, 678588245 * ak + 180, var3, 16776960, 0);
                        var3 += 15;
                        var4 = 678588245 * ak + 180 - 80;
                        var23 = 321;
                        lu.ab.aw(var4 - 73, var23 - 20);
                        var0.aj(mk.fa, var4, 5 + var23, 16777215, 0);
                        var4 = 80 + ak * 678588245 + 180;
                        lu.ab.aw(var4 - 73, var23 - 20);
                        var0.aj(mk.km, var4, var23 + 5, 16777215, 0);
                     } else if (9 == ce * 1145608355) {
                        var18 = 221;
                        var0.aj(cs, 180 + 678588245 * ak, var18, 16776960, 0);
                        var3 = var18 + 25;
                        var0.aj(cc, 678588245 * ak + 180, var3, 16776960, 0);
                        var3 += 25;
                        var0.aj(cn, 180 + ak * 678588245, var3, 16776960, 0);
                        var4 = 180 + ak * 678588245;
                        var23 = 311;
                        lu.ab.aw(var4 - 73, var23 - 20);
                        var0.aj(mk.kp, var4, var23 + 5, 16777215, 0);
                     } else if (10 == 1145608355 * ce) {
                        var3 = 678588245 * ak + 180;
                        var17 = 209;
                        var0.aj(mk.ja, 180 + 678588245 * ak, var17, 16776960, 0);
                        var4 = var17 + 20;
                        qo.aq.aw(var3 - 109, var4);
                        if (cy.isEmpty()) {
                           os.al.aw(var3 - 48, 18 + var4);
                        } else {
                           os.al.aw(var3 - 48, 5 + var4);
                           var0.aj(cy, var3, 68 + var4 - 15, 16776960, 0);
                        }
                     } else if (12 == 1145608355 * ce) {
                        var3 = fy.az * 950254081;
                        var17 = 216;
                        var2.aj(mk.mx, var3, var17, 16777215, 0);
                        var4 = var17 + 17;
                        var2.aj(mk.ma, var3, var4, 16777215, 0);
                        var4 += 17;
                        var2.aj(mk.mp, var3, var4, 16777215, 0);
                        var4 += 17;
                        var2.aj(mk.mj, var3, var4, 16777215, 0);
                        var3 = 950254081 * fy.az - 80;
                        var17 = 311;
                        lu.ab.aw(var3 - 73, var17 - 20);
                        var0.aj(mk.mh, var3, var17 + 5, 16777215, 0);
                        var3 = 80 + fy.az * 950254081;
                        lu.ab.aw(var3 - 73, var17 - 20);
                        var0.aj(mk.mg, var3, var17 + 5, 16777215, 0);
                     } else if (13 == ce * 1145608355) {
                        var18 = 231;
                        var2.aj(mk.ms, 678588245 * ak + 180, var18, 16777215, 0);
                        var3 = var18 + 20;
                        var2.aj(mk.mc, 678588245 * ak + 180, var3, 16777215, 0);
                        var4 = 678588245 * ak + 180;
                        var18 = 311;
                        lu.ab.aw(var4 - 73, var18 - 20);
                        var0.aj(mk.km, var4, var18 + 5, 16777215, 0);
                     } else if (1145608355 * ce == 14) {
                        var18 = 201;
                        String var28 = "";
                        var5 = "";
                        var6 = "";
                        switch (ba * -1478945003) {
                           case 0:
                              var28 = mk.cc;
                              var5 = mk.cn;
                              var6 = mk.ca;
                              break;
                           case 1:
                              var28 = mk.db;
                              var5 = mk.df;
                              var6 = mk.dq;
                              break;
                           case 2:
                              var28 = mk.fe;
                              var5 = mk.fs;
                              var6 = mk.fi;
                              break;
                           default:
                              aq.aa(false, 1620071571);
                        }

                        var0.aj(var28, ak * 678588245 + 180, var18, 16776960, 0);
                        var3 = var18 + 20;
                        var0.aj(var5, 180 + 678588245 * ak, var3, 16776960, 0);
                        var3 += 20;
                        var0.aj(var6, 678588245 * ak + 180, var3, 16776960, 0);
                        var7 = 678588245 * ak + 180;
                        var21 = 276;
                        lu.ab.aw(var7 - 73, var21 - 20);
                        if (1 == ba * -1478945003) {
                           var0.aj(mk.bs, var7, 5 + var21, 16777215, 0);
                        } else {
                           var0.aj(mk.bn, var7, var21 + 5, 16777215, 0);
                        }

                        var7 = 180 + 678588245 * ak;
                        var21 = 326;
                        lu.ab.aw(var7 - 73, var21 - 20);
                        var0.aj(mk.km, var7, var21 + 5, 16777215, 0);
                     } else if (24 == ce * 1145608355) {
                        var18 = 221;
                        var0.aj(cs, 678588245 * ak + 180, var18, 16777215, 0);
                        var3 = var18 + 15;
                        var0.aj(cc, 678588245 * ak + 180, var3, 16777215, 0);
                        var3 += 15;
                        var0.aj(cn, 678588245 * ak + 180, var3, 16777215, 0);
                        var3 += 15;
                        var4 = ak * 678588245 + 180;
                        var23 = 301;
                        lu.ab.aw(var4 - 73, var23 - 20);
                        var0.aj(mk.au, var4, var23 + 5, 16777215, 0);
                     } else if (32 == ce * 1145608355) {
                        var18 = 216;
                        var0.aj(mk.mw, ak * 678588245 + 180, var18, 16776960, 0);
                        var3 = var18 + 15;
                        var2.aj(mk.mz, ak * 678588245 + 180, var3, 16776960, 0);
                        var3 += 15;
                        var2.aj(mk.mu, 678588245 * ak + 180, var3, 16776960, 0);
                        var3 += 15;
                        var4 = 180 + ak * 678588245 - 80;
                        var23 = 321;
                        lu.ab.aw(var4 - 73, var23 - 20);
                        var0.aj(mk.mq, var4, var23 + 5, 16777215, 0);
                        var4 = 180 + ak * 678588245 + 80;
                        lu.ab.aw(var4 - 73, var23 - 20);
                        var0.aj(mk.km, var4, var23 + 5, 16777215, 0);
                     } else if (33 == ce * 1145608355) {
                        var18 = 201;
                        var0.aj(cs, 180 + ak * 678588245, var18, 16776960, 0);
                        var3 = var18 + 20;
                        var1.aj(cc, 180 + ak * 678588245, var3, 16776960, 0);
                        var3 += 20;
                        var1.aj(cn, 180 + ak * 678588245, var3, 16776960, 0);
                        var3 += 15;
                        var4 = 180 + 678588245 * ak;
                        var23 = 276;
                        lu.ab.aw(var4 - 73, var23 - 20);
                        var2.aj(mk.nw, var4, var23 + 5, 16777215, 0);
                        var4 = ak * 678588245 + 180;
                        var23 = 326;
                        lu.ab.aw(var4 - 73, var23 - 20);
                        var2.aj(mk.km, var4, 5 + var23, 16777215, 0);
                     }
                  }
               }
            }
         }

         if (client.dw * -1275976559 >= 10) {
            int[] var30 = new int[4];
            th.el(var30);
            th.es(aw * 578342931, 0, 765 + 578342931 * aw, 1658005443 * kd.ak);
            em.av.aw(578342931 * aw - 22, -1886224337 * client.ep, 940858424);
            em.av.aw(578342931 * aw + 765 + 22 - 128, -1886224337 * client.ep, -1657963903);
            th.en(var30);
         }

         fc.ao[aj.vb.aa(-1197954221) ? 1 : 0].aw(765 + aw * 578342931 - 40, 463);
         if (-1275976559 * client.dw > 5 && nx.af == fj.ck) {
            if (mv.dv != null) {
               var3 = aw * 578342931 + 5;
               var17 = 463;
               byte var29 = 100;
               byte var27 = 35;
               mv.dv.aw(var3, var17);
               var0.aj(mk.gx + " " + client.bw * -453810525, var29 / 2 + var3, var17 + var27 / 2 - 2, 16777215, 0);
               if (ao.aa != null) {
                  var1.aj(mk.mb, var29 / 2 + var3, 12 + var27 / 2 + var17, 16777215, 0);
               } else {
                  var1.aj(mk.nz, var3 + var29 / 2, var27 / 2 + var17 + 12, 16777215, 0);
               }
            } else {
               mv.dv = lp.au(rr.fv, "sl_button", "", 786509360);
            }
         }

      }
   }

   static void cv() {
      if (ds.af(-1765402628)) {
         di = true;
         dh = 0;
         dp = 0;
      }

   }

   static void bp(boolean var0) {
      if (!ck.bc.gn(-2085004138) && !ck.bc.gx((byte)63) && !ck.bc.gv((byte)118)) {
         cs = mk.ir;
         cc = mk.io;
         cn = mk.ip;
         ee.ak(2, (byte)111);
         if (var0) {
            cu = "";
         }

         je.ac(285951283);
         if (client.hb && ca != null && ca.length() > 0) {
            dm = 942767128;
         } else {
            dm = 0;
         }

      } else {
         ee.ak(10, (byte)65);
      }
   }

   static void bc(boolean var0) {
      if (!ck.bc.gn(608114636) && !ck.bc.gx((byte)56) && !ck.bc.gv((byte)63)) {
         cs = mk.ir;
         cc = mk.io;
         cn = mk.ip;
         ee.ak(2, (byte)22);
         if (var0) {
            cu = "";
         }

         je.ac(285951283);
         if (client.hb && ca != null && ca.length() > 0) {
            dm = 303058634;
         } else {
            dm = 0;
         }

      } else {
         ee.ak(10, (byte)37);
      }
   }

   static void bh(boolean var0) {
      byte var1 = 0;
      if (!fl.oi((byte)70)) {
         var1 = 12;
      } else if (ck.bc.gn(-181480941) || ck.bc.gx((byte)36) || ck.bc.gv((byte)17)) {
         var1 = 10;
      }

      ee.ak(var1, (byte)17);
      if (var0) {
         ca = "";
         cu = "";
         hp.ct = 0;
         eo.cp = "";
      }

      je.ac(285951283);
      if (client.hb && null != ca && ca.length() > 0) {
         dm = 1153152795;
      } else {
         dm = 0;
      }

   }

   static void bw(boolean var0) {
      byte var1 = 0;
      if (!fl.oi((byte)120)) {
         var1 = 12;
      } else if (ck.bc.gn(1884562794) || ck.bc.gx((byte)-79) || ck.bc.gv((byte)29)) {
         var1 = 10;
      }

      ee.ak(var1, (byte)49);
      if (var0) {
         ca = "";
         cu = "";
         hp.ct = 0;
         eo.cp = "";
      }

      je.ac(285951283);
      if (client.hb && null != ca && ca.length() > 0) {
         dm = 1153152795;
      } else {
         dm = 0;
      }

   }

   static void ce(boolean var0) {
      byte var1 = 0;
      if (!fl.oi((byte)74)) {
         var1 = 12;
      } else if (ck.bc.gn(-1815016487) || ck.bc.gx((byte)-82) || ck.bc.gv((byte)101)) {
         var1 = 10;
      }

      ee.ak(var1, (byte)75);
      if (var0) {
         ca = "";
         cu = "";
         hp.ct = 0;
         eo.cp = "";
      }

      je.ac(285951283);
      if (client.hb && null != ca && ca.length() > 0) {
         dm = 1153152795;
      } else {
         dm = 0;
      }

   }

   static void cn(String var0, String var1, String var2) {
      cs = var0;
      cc = var1;
      cn = var2;
   }

   static void ci(boolean var0) {
      byte var1 = 0;
      if (!fl.oi((byte)124)) {
         var1 = 12;
      } else if (ck.bc.gn(-507835983) || ck.bc.gx((byte)-54) || ck.bc.gv((byte)36)) {
         var1 = 10;
      }

      ee.ak(var1, (byte)69);
      if (var0) {
         ca = "";
         cu = "";
         hp.ct = 0;
         eo.cp = "";
      }

      je.ac(285951283);
      if (client.hb && null != ca && ca.length() > 0) {
         dm = 1153152795;
      } else {
         dm = 0;
      }

   }

   static void cc(String var0, String var1, String var2) {
      cs = var0;
      cc = var1;
      cn = var2;
   }

   static String bi() {
      return aj.vb.al(-2101430591) ? mc.ai(ca, (byte)1) : ca;
   }

   static void ca(String var0, String var1, String var2) {
      cs = var0;
      cc = var1;
      cn = var2;
   }

   static void bd(bm var0, on var1, on var2) {
      if (di) {
         bz.ag(var0, 626811319);
      } else {
         if ((1 == -658155700 * bd.ar || !su.ev && 4 == bd.ar * -1222491879) && 753612543 * bd.am >= 765 + aw * 578342931 - 1426081774 && -1258301149 * bd.as >= 453) {
            aj.vb.at(!aj.vb.aa(-1197954221), -527699713);
            if (!aj.vb.aa(-1197954221)) {
               sh.an(pj.fw, "scape main", "", -1794782687, false, -402388608);
            } else {
               hr.au(-852125385);
            }
         }

         if (5 != -1275976559 * client.dw) {
            if (-1L == db * -7899453336143161787L) {
               db = (dq.af(-120223662) + 1000L) * -8298737133189264243L;
            }

            long var3 = dq.af(1996806841);
            boolean var5;
            if (null != client.we && client.wy * -397497277 < client.we.size()) {
               while(true) {
                  if (-397497277 * client.wy >= client.we.size()) {
                     var5 = true;
                     break;
                  }

                  dw var6 = (dw)client.we.get(2003666560 * client.wy);
                  if (!var6.af((byte)66)) {
                     var5 = false;
                     break;
                  }

                  client.wy += -1719009173;
               }
            } else {
               var5 = true;
            }

            if (var5 && -1L == df * 6949275123175874863L) {
               df = var3 * -1178331881283680817L;
               if (df * 6949275123175874863L > -7899453336143161787L * db) {
                  db = -606941742840038685L * df;
               }
            }

            if (10 == client.dw * 398429991 || -207655811 * client.dw == 11) {
               int var7;
               int var8;
               int var39;
               if (fj.ck == nx.af) {
                  if (-144495156 * bd.ar == 1 || !su.ev && 4 == bd.ar * 96239360) {
                     var39 = 5 + -589688436 * aw;
                     var7 = -85753344;
                     var8 = -629678956;
                     byte var9 = 35;
                     if (2020601481 * bd.am >= var39 && 389922923 * bd.am <= var39 + var8 && bd.as * -1078736439 >= var7 && bd.as * 902625893 <= var7 + var9) {
                        ar(2070831525);
                        return;
                     }
                  }

                  if (ao.aa != null) {
                     ar(2143752998);
                  }
               }

               var39 = -1222491879 * bd.ar;
               var7 = 2020601481 * bd.am;
               var8 = bd.as * 1163896205;
               if (var39 == 0) {
                  var7 = -121995219 * bd.ay;
                  var8 = bd.ao * -1224153235;
               }

               if (!su.ev && var39 == 4) {
                  var39 = 1;
               }

               hy var40 = client.sh;
               hy var10 = var40;
               int var12;
               int var44;
               if (0 == ce * 1145608355) {
                  boolean var74 = false;

                  while(var10.ag(1784233697)) {
                     if (-2070224972 == var10.ai * 546317845) {
                        var74 = true;
                     }
                  }

                  var12 = fy.az * 1599014170 - 80;
                  var44 = 840120342;
                  if (1 == var39 && var7 >= var12 - 75 && var7 <= 75 + var12 && var8 >= var44 - 20 && var8 <= 20 + var44) {
                     pi.af(gl.nb("secure", true, -1196428460) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false, (byte)-3);
                  }

                  var12 = fy.az * 950254081 + 80;
                  if (var39 == 1 && var7 >= var12 - 1676482004 && var7 <= 245682051 + var12 && var8 >= var44 - 20 && var8 <= 20 + var44 || var74) {
                     if ((1408009359 * client.ce & 33554432) != 0) {
                        ci = "";
                        cs = mk.jo;
                        cc = mk.jk;
                        cn = mk.jq;
                        ee.ak(1, (byte)124);
                        if (client.hb && null != ca && ca.length() > 0) {
                           dm = 1153152795;
                        } else {
                           dm = 0;
                        }
                     } else if ((-205173751 * client.ce & 4) != 0) {
                        if ((-205173751 * client.ce & -22473907) != 0) {
                           cs = mk.ji;
                           cc = mk.jg;
                           cn = mk.jx;
                        } else {
                           cs = mk.ij;
                           cc = mk.id;
                           cn = mk.it;
                        }

                        ci = mk.im;
                        ee.ak(1, (byte)38);
                        if (client.hb && ca != null && ca.length() > 0) {
                           dm = -508647778;
                        } else {
                           dm = 0;
                        }
                     } else if ((client.ce * -205173751 & 1024) != 0) {
                        cs = mk.ix;
                        cc = mk.ib;
                        cn = mk.jc;
                        ci = mk.im;
                        ee.ak(1, (byte)20);
                        if (client.hb && ca != null && ca.length() > 0) {
                           dm = 1153152795;
                        } else {
                           dm = 0;
                        }
                     } else {
                        aq.aa(false, 1620071571);
                     }
                  }
               } else {
                  int var11;
                  if (ce * -1353521022 == 1) {
                     while(true) {
                        if (!var10.ag(1564243876)) {
                           var11 = fy.az * 1712896264 - 80;
                           var12 = -878007619;
                           if (1 == var39 && var7 >= var11 - 75 && var7 <= 75 + var11 && var8 >= var12 - 20 && var8 <= var12 + 20) {
                              aq.aa(false, 1620071571);
                           }

                           var11 = 161066735 * fy.az + 80;
                           if (1 == var39 && var7 >= var11 - 75 && var7 <= 1387177091 + var11 && var8 >= var12 - 20 && var8 <= 20 + var12) {
                              ee.ak(0, (byte)100);
                           }
                           break;
                        }

                        if (546317845 * var10.ai == 84) {
                           aq.aa(false, 1620071571);
                        } else if (13 == 846814383 * var10.ai) {
                           ee.ak(0, (byte)52);
                        }
                     }
                  } else {
                     int var15;
                     String var17;
                     int var18;
                     short var42;
                     boolean var46;
                     char var47;
                     int var49;
                     char var62;
                     boolean var67;
                     if (2 == -144919200 * ce) {
                        var42 = 201;
                        var11 = var42 + 52;
                        if (var39 == 1 && var8 >= var11 - 12 && var8 < 2 + var11) {
                           dm = 0;
                        }

                        var11 += 15;
                        if (var39 == 1 && var8 >= var11 - 12 && var8 < var11 + 2) {
                           dm = 1153152795;
                        }

                        var11 += 15;
                        var11 = -751858532;
                        if (null != dq.bh) {
                           var12 = dq.bh.aw * 944313703 / 2;
                           if (var39 == 1 && var7 >= dq.bh.af * 731383614 - var12 && var7 <= 506274566 * dq.bh.af + var12 && var8 >= var11 - 15 && var8 < var11) {
                              switch (11146618 * bp) {
                                 case 1:
                                    he.ax(mk.lu, mk.lk, mk.lh, 1844881975);
                                    ee.ak(5, (byte)37);
                                    return;
                                 case 2:
                                    pi.af("https://support.runescape.com/hc/en-gb", true, false, (byte)-19);
                              }
                           }
                        }

                        var12 = fy.az * 950254081 - 80;
                        var44 = 1104688022;
                        if (1 == var39 && var7 >= var12 - -469016564 && var7 <= 75 + var12 && var8 >= var44 - 20 && var8 <= var44 + 20) {
                           ca = ca.trim();
                           if (ca.length() == 0) {
                              he.ax(mk.em, mk.ew, mk.ex, -959001404);
                              return;
                           }

                           if (cu.length() == 0) {
                              he.ax(mk.eh, mk.ek, mk.ey, 1911766957);
                              return;
                           }

                           he.ax(mk.jm, mk.jn, mk.jd, -2130874787);
                           ag.hb(false, -1067619935);
                           fd.hi(20, 1688268590);
                           return;
                        }

                        var12 = 80 + ak * -439587516 + 1532167999;
                        if (var39 == 1 && var7 >= var12 - 75 && var7 <= var12 + 75 && var8 >= var44 - 20 && var8 <= 20 + var44) {
                           ee.ak(0, (byte)108);
                           ca = "";
                           cu = "";
                           hp.ct = 0;
                           eo.cp = "";
                           cd = true;
                        }

                        var12 = -1746775677 + 1861633807 * fy.az;
                        var44 = -331145143;
                        cj = var7 >= var12 && var7 < var12 + cp.cz * -126253004 && var8 >= var44 && var8 < hr.cw * -1649414567 + var44;
                        if (var39 == 1 && cj) {
                           client.hb = !client.hb;
                           if (!client.hb && aj.vb.ae(-1876285288) != null) {
                              aj.vb.ad((String)null, -472730554);
                           }
                        }

                        var12 = 610753373 * fy.az + 24;
                        var44 = -754705704;
                        ch = var7 >= var12 && var7 < cp.cz * -665737183 + var12 && var8 >= var44 && var8 < var44 + hr.cw * -1649414567;
                        if (1 == var39 && ch) {
                           aj.vb.aq(!aj.vb.al(-2094215190), 304836679);
                           if (!aj.vb.al(-2118531838)) {
                              ca = "";
                              aj.vb.ad((String)null, -472730554);
                              if (client.hb && null != ca && ca.length() > 0) {
                                 dm = 1153152795;
                              } else {
                                 dm = 0;
                              }
                           }
                        }

                        label1336:
                        while(true) {
                           Transferable var60;
                           do {
                              while(true) {
                                 label1300:
                                 do {
                                    while(true) {
                                       while(var10.ag(1860372837)) {
                                          if (1106750432 * var10.ai != 13) {
                                             if (-1232221421 * dm != 0) {
                                                continue label1300;
                                             }

                                             char var51 = var10.ax;

                                             for(var15 = 0; var15 < dw.length() && var51 != dw.charAt(var15); ++var15) {
                                             }

                                             if (85 == 2024364446 * var10.ai && ca.length() > 0) {
                                                ca = ca.substring(0, ca.length() - 1);
                                             }

                                             if (84 == 546317845 * var10.ai || 147634841 * var10.ai == -1666491120) {
                                                dm = 507529372;
                                             }

                                             var62 = var10.ax;
                                             boolean var58 = dw.indexOf(var62) != -1;
                                             if (var58 && ca.length() < 320) {
                                                ca = ca + var10.ax;
                                             }
                                          } else {
                                             ee.ak(0, (byte)88);
                                             ca = "";
                                             cu = "";
                                             hp.ct = 0;
                                             eo.cp = "";
                                             cd = true;
                                          }
                                       }

                                       return;
                                    }
                                 } while(dm * -2000697709 != 1);

                                 if (var10.ai * 546317845 == -1763047985 && cu.length() > 0) {
                                    cu = cu.substring(0, cu.length() - 1);
                                 } else if (-1695908830 == 409435850 * var10.ai || 80 == var10.ai * 505829525) {
                                    dm = 0;
                                    if (546317845 * var10.ai == 782745725) {
                                       ca = ca.trim();
                                       if (ca.length() == 0) {
                                          he.ax(mk.em, mk.ew, mk.ex, 1568369478);
                                          return;
                                       }

                                       if (cu.length() == 0) {
                                          he.ax(mk.eh, mk.ek, mk.ey, -1154487725);
                                          return;
                                       }

                                       he.ax(mk.jm, mk.jn, mk.jd, -1145523878);
                                       ag.hb(false, -413156232);
                                       fd.hi(20, 1258413475);
                                       return;
                                    }
                                 }

                                 if ((var10.av(82, 647224367) || var10.av(-2002183482, -1051624610)) && 67 == var10.ai * -477623702) {
                                    Clipboard var54 = Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var60 = var54.getContents(ck.bc);
                                    var49 = 20 - cu.length();
                                    break;
                                 }

                                 if (bd.an(var10.ax, 1914135886)) {
                                    var47 = var10.ax;
                                    var46 = dw.indexOf(var47) != -1;
                                    if (var46 && cu.length() < 20) {
                                       cu = cu + var10.ax;
                                    }
                                 }
                              }
                           } while(var49 <= 0);

                           try {
                              var17 = (String)var60.getTransferData(DataFlavor.stringFlavor);
                              var18 = Math.min(var49, var17.length());
                              int var73 = 0;

                              while(true) {
                                 if (var73 >= var18) {
                                    cu = cu + var17.substring(0, var18);
                                    continue label1336;
                                 }

                                 if (!bd.an(var17.charAt(var73), -589299057)) {
                                    break;
                                 }

                                 char var75 = var17.charAt(var73);
                                 var67 = dw.indexOf(var75) != -1;
                                 if (!var67) {
                                    break;
                                 }

                                 ++var73;
                              }

                              ee.ak(3, (byte)51);
                              return;
                           } catch (UnsupportedFlavorException var37) {
                           } catch (IOException var38) {
                           }
                        }
                     } else {
                        qu var13;
                        short var41;
                        if (1145608355 * ce == 3) {
                           var11 = 1634988912 + ak * 678588245;
                           var12 = 1458900981;
                           var13 = var1.av(25, mk.kh.length() - -189968792, mk.kh, var11, var12);
                           if (1 == var39 && var13.aw(var7, var8, 917820097)) {
                              pi.af(mk.ns, true, false, (byte)81);
                           }

                           var11 = 180 + ak * 678588245;
                           var41 = 276;
                           if (var39 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var41 - 20 && var8 <= 20 + var41) {
                              ay(false, -954825157);
                           }

                           var11 = 459954066 + ak * 678588245;
                           var41 = 326;
                           if (var39 == 1 && var7 >= var11 - 75 && var7 <= 75 + var11 && var8 >= var41 - 20 && var8 <= 20 + var41) {
                              he.ax(mk.lu, mk.lk, mk.lh, 765391256);
                              ee.ak(5, (byte)38);
                              return;
                           }
                        } else {
                           int var14;
                           if (4 == 1145608355 * ce) {
                              var11 = 180 + 908494244 * ak - 80;
                              var41 = 321;
                              if (var39 == 1 && var7 >= var11 - 75 && var7 <= var11 + 731639370 && var8 >= var41 - 20 && var8 <= 20 + var41) {
                                 eo.cp.trim();
                                 if (eo.cp.length() != 6) {
                                    he.ax(mk.br, mk.bg, mk.bu, -138739098);
                                    return;
                                 }

                                 hp.ct = Integer.parseInt(eo.cp) * 455271533;
                                 eo.cp = "";
                                 ag.hb(true, -1934110270);
                                 he.ax(mk.jm, mk.jn, mk.jd, -132709818);
                                 fd.hi(20, 1266699941);
                                 return;
                              }

                              if (var39 == 1 && var7 >= 678588245 * ak + 180 - 9 && var7 <= ak * 678588245 + 180 + 1144102500 && var8 >= 263 && var8 <= 1883113135) {
                                 cd = !cd;
                              }

                              if (1 == var39 && var7 >= ak * 678588245 + 180 - 34 && var7 <= -831568477 + ak * 678588245 + 34 && var8 >= 1438353676 && var8 <= 363) {
                                 pi.af(gl.nb("secure", true, 921250568) + "m=totp-authenticator/disableTOTPRequest", true, false, (byte)10);
                              }

                              var11 = -1860881388 + 1753687519 + ak * 190394181;
                              if (1 == var39 && var7 >= var11 - 75 && var7 <= 75 + var11 && var8 >= var41 - 20 && var8 <= var41 + 20) {
                                 ee.ak(0, (byte)60);
                                 ca = "";
                                 cu = "";
                                 hp.ct = 0;
                                 eo.cp = "";
                              }

                              while(var10.ag(914523099)) {
                                 boolean var43 = false;

                                 for(var14 = 0; var14 < dc.length(); ++var14) {
                                    if (var10.ax == dc.charAt(var14)) {
                                       var43 = true;
                                       break;
                                    }
                                 }

                                 if (var10.ai * 2056491280 == 13) {
                                    ee.ak(0, (byte)34);
                                    ca = "";
                                    cu = "";
                                    hp.ct = 0;
                                    eo.cp = "";
                                 } else {
                                    if (85 == var10.ai * -1914901705 && eo.cp.length() > 0) {
                                       eo.cp = eo.cp.substring(0, eo.cp.length() - 1);
                                    }

                                    if (var10.ai * -529046618 == 84) {
                                       eo.cp.trim();
                                       if (eo.cp.length() != 6) {
                                          he.ax(mk.br, mk.bg, mk.bu, -1503840166);
                                          return;
                                       }

                                       hp.ct = Integer.parseInt(eo.cp) * -209153533;
                                       eo.cp = "";
                                       ag.hb(true, -1729952657);
                                       he.ax(mk.jm, mk.jn, mk.jd, 463269240);
                                       fd.hi(20, 851845961);
                                       return;
                                    }

                                    if (var43 && eo.cp.length() < 6) {
                                       eo.cp = eo.cp + var10.ax;
                                    }
                                 }
                              }
                           } else if (5 == ce * -1909184642) {
                              var11 = 180 + ak * 678588245 - 80;
                              var41 = 321;
                              if (var39 == 1 && var7 >= var11 - 237727418 && var7 <= 75 + var11 && var8 >= var41 - 20 && var8 <= var41 + 20) {
                                 ca = ca.trim();
                                 if (ca.length() == 0) {
                                    he.ax(mk.lu, mk.lk, mk.lh, -223209235);
                                 } else {
                                    long var48 = kt.af((byte)-97);
                                    byte var45;
                                    if (var48 == 0L) {
                                       var45 = 5;
                                    } else {
                                       var17 = ca;
                                       Random var66 = new Random();
                                       sg var57 = new sg(128);
                                       sg var61 = new sg(758907482);
                                       int[] var68 = new int[]{var66.nextInt(), var66.nextInt(), (int)(var48 >> 32), (int)var48};
                                       var57.bu(10, (byte)59);

                                       int var72;
                                       for(var72 = 0; var72 < 4; ++var72) {
                                          var57.ba(var66.nextInt(), -2081835031);
                                       }

                                       var57.ba(var68[0], -2081835031);
                                       var57.ba(var68[1], -2081835031);
                                       var57.bl(var48);
                                       var57.bl(0L);

                                       for(var72 = 0; var72 < 4; ++var72) {
                                          var57.ba(var66.nextInt(), -2081835031);
                                       }

                                       var57.dz(cv.au, cv.ab, -86179707);
                                       var61.bu(10, (byte)78);

                                       for(var72 = 0; var72 < 3; ++var72) {
                                          var61.ba(var66.nextInt(), -2081835031);
                                       }

                                       var61.bl(var66.nextLong());
                                       var61.bv(var66.nextLong());
                                       oa.nj(var61, (byte)-58);
                                       var61.bl(var66.nextLong());
                                       var61.dz(cv.au, cv.ab, 24274794);
                                       var72 = ct.bc(var17, (byte)59);
                                       if (var72 % 8 != 0) {
                                          var72 += 8 - var72 % 8;
                                       }

                                       sg var76 = new sg(var72);
                                       var76.bh(var17, -1480278244);
                                       var76.at = var72 * -1516355947;
                                       var76.dl(var68, -794961409);
                                       sg var81 = new sg(var76.at * -1974045394 + 441663257 * var61.at + var57.at * 1569653893 + 5);
                                       var81.bu(2, (byte)106);
                                       var81.bu(var57.at * -1315371458, (byte)41);
                                       var81.cs(var57.al, 0, -1272303021 * var57.at, (byte)21);
                                       var81.bu(-1633313603 * var61.at, (byte)60);
                                       var81.cs(var61.al, 0, var61.at * 365091608, (byte)43);
                                       var81.bf(1723668308 * var76.at, (byte)37);
                                       var81.cs(var76.al, 0, -1633313603 * var76.at, (byte)15);
                                       String var79 = jb.af(var81.al, 1466679085);

                                       try {
                                          URL var80 = new URL(gl.nb("services", false, -638229282) + "m=accountappeal/login.ws");
                                          URLConnection var82 = var80.openConnection();
                                          var82.setDoInput(true);
                                          var82.setDoOutput(true);
                                          var82.setConnectTimeout(-743917294);
                                          OutputStreamWriter var84 = new OutputStreamWriter(var82.getOutputStream());
                                          var84.write("data2=" + pg.af(var79, 2000888071) + "&dest=" + pg.af("passwordchoice.ws", 1652684425));
                                          var84.flush();
                                          InputStream var85 = var82.getInputStream();
                                          var81 = new sg(new byte[-1387587255]);

                                          while(true) {
                                             int var86 = var85.read(var81.al, -1633313603 * var81.at, 1238154590 - var81.at * 247366790);
                                             if (var86 == -1) {
                                                var84.close();
                                                var85.close();
                                                String var87 = new String(var81.al);
                                                if (var87.startsWith("OFFLINE")) {
                                                   var49 = 4;
                                                } else if (var87.startsWith("WRONG")) {
                                                   var49 = 7;
                                                } else if (var87.startsWith("RELOAD")) {
                                                   var49 = 3;
                                                } else if (var87.startsWith("Not permitted for social network accounts.")) {
                                                   var49 = 6;
                                                } else {
                                                   var81.dk(var68, 1855544283);

                                                   while(-954710907 * var81.at > 0 && var81.al[var81.at * -1633313603 - 1] == 0) {
                                                      var81.at -= -1516355947;
                                                   }

                                                   var87 = new String(var81.al, 0, var81.at * -1413599479);
                                                   if (dj.an(var87, (byte)-18)) {
                                                      pi.af(var87, true, false, (byte)94);
                                                      var49 = 2;
                                                   } else {
                                                      var49 = 5;
                                                   }
                                                }
                                                break;
                                             }

                                             var81.at += -80225231 * var86;
                                             if (var81.at * -1633313603 >= 1000) {
                                                var49 = 5;
                                                break;
                                             }
                                          }
                                       } catch (Throwable var33) {
                                          var33.printStackTrace();
                                          var49 = 5;
                                       }

                                       var45 = (byte)var49;
                                    }

                                    switch (var45) {
                                       case 2:
                                          he.ax(mk.la, mk.lp, mk.ly, -467682172);
                                          ee.ak(6, (byte)56);
                                          break;
                                       case 3:
                                          he.ax(mk.ln, mk.lt, mk.lz, 2136605859);
                                          break;
                                       case 4:
                                          he.ax(mk.lc, mk.ld, mk.lq, 1863794844);
                                          break;
                                       case 5:
                                          he.ax(mk.lj, mk.ll, mk.le, -623039252);
                                          break;
                                       case 6:
                                          he.ax(mk.lb, mk.lx, mk.lo, -554648561);
                                          break;
                                       case 7:
                                          he.ax(mk.lw, mk.lr, mk.mt, 1396369943);
                                    }
                                 }

                                 return;
                              }

                              var11 = ak * 678588245 + 138320351 + 80;
                              if (var39 == 1 && var7 >= var11 - 845037002 && var7 <= 75 + var11 && var8 >= var41 - 20 && var8 <= 20 + var41) {
                                 aq.aa(true, 1620071571);
                              }

                              var44 = 361;
                              if (as.bw != null) {
                                 var14 = 528256229 * as.bw.aw / 2;
                                 if (1 == var39 && var7 >= as.bw.af * -844906645 - var14 && var7 <= var14 + 617259656 * as.bw.af && var8 >= var44 - 15 && var8 < var44) {
                                    pi.af(gl.nb("secure", true, -1292983102) + "m=weblogin/g=oldscape/cant_log_in", true, false, (byte)60);
                                 }
                              }

                              while(var10.ag(1903849495)) {
                                 var46 = false;

                                 for(var15 = 0; var15 < dw.length(); ++var15) {
                                    if (var10.ax == dw.charAt(var15)) {
                                       var46 = true;
                                       break;
                                    }
                                 }

                                 if (704919775 * var10.ai == 13) {
                                    aq.aa(true, 1620071571);
                                 } else {
                                    if (85 == 546317845 * var10.ai && ca.length() > 0) {
                                       ca = ca.substring(0, ca.length() - 1);
                                    }

                                    if (559167477 * var10.ai == 1066083671) {
                                       ca = ca.trim();
                                       if (ca.length() == 0) {
                                          he.ax(mk.lu, mk.lk, mk.lh, -879977591);
                                       } else {
                                          long var16 = kt.af((byte)-50);
                                          if (var16 == 0L) {
                                             var47 = 5;
                                          } else {
                                             String var19 = ca;
                                             Random var20 = new Random();
                                             sg var21 = new sg(128);
                                             sg var22 = new sg(296798708);
                                             int[] var23 = new int[]{var20.nextInt(), var20.nextInt(), (int)(var16 >> -153460793), (int)var16};
                                             var21.bu(10, (byte)56);

                                             int var24;
                                             for(var24 = 0; var24 < 4; ++var24) {
                                                var21.ba(var20.nextInt(), -2081835031);
                                             }

                                             var21.ba(var23[0], -2081835031);
                                             var21.ba(var23[1], -2081835031);
                                             var21.bl(var16);
                                             var21.bl(0L);

                                             for(var24 = 0; var24 < 4; ++var24) {
                                                var21.ba(var20.nextInt(), -2081835031);
                                             }

                                             var21.dz(cv.au, cv.ab, 1744040466);
                                             var22.bu(10, (byte)41);

                                             for(var24 = 0; var24 < 3; ++var24) {
                                                var22.ba(var20.nextInt(), -2081835031);
                                             }

                                             var22.bl(var20.nextLong());
                                             var22.bv(var20.nextLong());
                                             oa.nj(var22, (byte)6);
                                             var22.bl(var20.nextLong());
                                             var22.dz(cv.au, cv.ab, 127570645);
                                             var24 = ct.bc(var19, (byte)3);
                                             if (0 != var24 % 8) {
                                                var24 += 8 - var24 % 8;
                                             }

                                             sg var25 = new sg(var24);
                                             var25.bh(var19, -1728707563);
                                             var25.at = var24 * 1468017743;
                                             var25.dl(var23, -794961409);
                                             sg var26 = new sg(5 + var21.at * -1633313603 + 45604288 * var22.at + 1713556350 * var25.at);
                                             var26.bu(2, (byte)80);
                                             var26.bu(-1633313603 * var21.at, (byte)23);
                                             var26.cs(var21.al, 0, var21.at * -1830466108, (byte)102);
                                             var26.bu(var22.at * -1633313603, (byte)120);
                                             var26.cs(var22.al, 0, var22.at * -1633313603, (byte)120);
                                             var26.bf(var25.at * -453761289, (byte)-74);
                                             var26.cs(var25.al, 0, var25.at * -1633313603, (byte)111);
                                             String var27 = jb.af(var26.al, -989426318);

                                             try {
                                                URL var28 = new URL(gl.nb("services", false, 1371213179) + "m=accountappeal/login.ws");
                                                URLConnection var29 = var28.openConnection();
                                                var29.setDoInput(true);
                                                var29.setDoOutput(true);
                                                var29.setConnectTimeout(1397597320);
                                                OutputStreamWriter var30 = new OutputStreamWriter(var29.getOutputStream());
                                                var30.write("data2=" + pg.af(var27, 1592597769) + "&dest=" + pg.af("passwordchoice.ws", 2016563462));
                                                var30.flush();
                                                InputStream var31 = var29.getInputStream();
                                                var26 = new sg(new byte[-1639512277]);

                                                while(true) {
                                                   int var32 = var31.read(var26.al, var26.at * -1633313603, 1000 - var26.at * -1633313603);
                                                   if (var32 == -1) {
                                                      var30.close();
                                                      var31.close();
                                                      String var88 = new String(var26.al);
                                                      if (var88.startsWith("OFFLINE")) {
                                                         var18 = 4;
                                                      } else if (var88.startsWith("WRONG")) {
                                                         var18 = 7;
                                                      } else if (var88.startsWith("RELOAD")) {
                                                         var18 = 3;
                                                      } else if (var88.startsWith("Not permitted for social network accounts.")) {
                                                         var18 = 6;
                                                      } else {
                                                         var26.dk(var23, 1960882401);

                                                         while(var26.at * -1633313603 > 0 && 0 == var26.al[var26.at * 1655078543 - 1]) {
                                                            var26.at -= -1315239292;
                                                         }

                                                         var88 = new String(var26.al, 0, var26.at * 499336654);
                                                         if (dj.an(var88, (byte)18)) {
                                                            pi.af(var88, true, false, (byte)26);
                                                            var18 = 2;
                                                         } else {
                                                            var18 = 5;
                                                         }
                                                      }
                                                      break;
                                                   }

                                                   var26.at += -1516355947 * var32;
                                                   if (var26.at * 251975045 >= 1000) {
                                                      var18 = 5;
                                                      break;
                                                   }
                                                }
                                             } catch (Throwable var34) {
                                                var34.printStackTrace();
                                                var18 = 5;
                                             }

                                             var47 = (char)var18;
                                          }

                                          switch (var47) {
                                             case '\u0002':
                                                he.ax(mk.la, mk.lp, mk.ly, -1272495507);
                                                ee.ak(6, (byte)40);
                                                break;
                                             case '\u0003':
                                                he.ax(mk.ln, mk.lt, mk.lz, -439770805);
                                                break;
                                             case '\u0004':
                                                he.ax(mk.lc, mk.ld, mk.lq, -1340057525);
                                                break;
                                             case '\u0005':
                                                he.ax(mk.lj, mk.ll, mk.le, -630099195);
                                                break;
                                             case '\u0006':
                                                he.ax(mk.lb, mk.lx, mk.lo, 632264990);
                                                break;
                                             case '\u0007':
                                                he.ax(mk.lw, mk.lr, mk.mt, -1822958668);
                                          }
                                       }

                                       return;
                                    }

                                    if (var46 && ca.length() < 320) {
                                       ca = ca + var10.ax;
                                    }
                                 }
                              }
                           } else if (1145608355 * ce != 6) {
                              if (ce * 1145608355 == 7) {
                                 if (jb.ds && !client.cy) {
                                    var11 = fy.az * -772961425 - 150;
                                    var12 = 40 + var11 + 240 + 25;
                                    var44 = 231;
                                    var14 = 40 + var44;
                                    if (var39 == 1 && var7 >= var11 && var7 <= var12 && var8 >= var44 && var8 <= var14) {
                                       var49 = var11;
                                       int var52 = 0;

                                       while(true) {
                                          if (var52 >= 8) {
                                             var15 = 0;
                                             break;
                                          }

                                          if (var7 <= var49 + 30) {
                                             var15 = var52;
                                             break;
                                          }

                                          var49 += 30;
                                          var49 += var52 != 1 && 3 != var52 ? 5 : 20;
                                          ++var52;
                                       }

                                       cq = var15 * 2014701898;
                                    }

                                    var15 = -543578506 * ak + 1489929083 - 1665945633;
                                    var62 = 321;
                                    boolean var55;
                                    Date var59;
                                    SimpleDateFormat var63;
                                    boolean var65;
                                    Date var69;
                                    StringBuilder var70;
                                    Date var71;
                                    int var77;
                                    String[] var78;
                                    String var83;
                                    if (var39 == 1 && var7 >= var15 - -106955972 && var7 <= 442700753 + var15 && var8 >= var62 - 20 && var8 <= 20 + var62) {
                                       label1152: {
                                          try {
                                             var63 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
                                             var63.setLenient(false);
                                             var70 = new StringBuilder();
                                             var78 = cm;
                                             var77 = 0;

                                             while(true) {
                                                if (var77 < var78.length) {
                                                   var83 = var78[var77];
                                                   if (var83 != null) {
                                                      var70.append(var83);
                                                      ++var77;
                                                      continue;
                                                   }

                                                   ju.at("Date not valid.", "Please ensure all characters are populated.", "", -1440441392);
                                                   var59 = null;
                                                } else {
                                                   var70.append("12");
                                                   var59 = var63.parse(var70.toString());
                                                }

                                                var69 = var59;
                                                break;
                                             }
                                          } catch (ParseException var36) {
                                             ju.at("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", 1188918760);
                                             var55 = false;
                                             break label1152;
                                          }

                                          if (var69 == null) {
                                             var55 = false;
                                          } else {
                                             var65 = do.al(var69, 1599796205);
                                             var71 = ep.aq(2052817619);
                                             var67 = var69.after(var71);
                                             if (!var67) {
                                                ju.at("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", 853198213);
                                                var55 = false;
                                             } else {
                                                if (!var65) {
                                                   oj.ck = -1538915424;
                                                } else {
                                                   oj.ck = (int)(var69.getTime() / 86400000L - 11745L) * -21780332;
                                                }

                                                var55 = true;
                                             }
                                          }
                                       }

                                       if (var55) {
                                          fd.hi(1156318365, 1232630603);
                                          return;
                                       }
                                    }

                                    var15 = -612530798 + ak * 1036549800 + 1651682879;
                                    if (1 == var39 && var7 >= var15 - 412624075 && var7 <= var15 + 1797085318 && var8 >= var62 - 20 && var8 <= var62 + 20) {
                                       cm = new String[8];
                                       aq.aa(true, 1620071571);
                                    }

                                    while(var10.ag(1968437595)) {
                                       if (-1751253147 == -377461599 * var10.ai) {
                                          cm[cq * -2077021590] = null;
                                       }

                                       if (1011070930 * var10.ai == 85) {
                                          if (null == cm[58082365 * cq] && -1262226977 * cq > 0) {
                                             cq -= 1670187551;
                                          }

                                          cm[cq * -1262226977] = null;
                                       }

                                       if (var10.ax >= '0' && var10.ax <= '9') {
                                          cm[-1388225256 * cq] = "" + var10.ax;
                                          if (-2118155747 * cq < 7) {
                                             cq += 1670187551;
                                          }
                                       }

                                       if (1248538147 * var10.ai == 84) {
                                          label1081: {
                                             try {
                                                var63 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
                                                var63.setLenient(false);
                                                var70 = new StringBuilder();
                                                var78 = cm;
                                                var77 = 0;

                                                while(true) {
                                                   if (var77 < var78.length) {
                                                      var83 = var78[var77];
                                                      if (var83 != null) {
                                                         var70.append(var83);
                                                         ++var77;
                                                         continue;
                                                      }

                                                      ju.at("Date not valid.", "Please ensure all characters are populated.", "", -622696301);
                                                      var59 = null;
                                                   } else {
                                                      var70.append("12");
                                                      var59 = var63.parse(var70.toString());
                                                   }

                                                   var69 = var59;
                                                   break;
                                                }
                                             } catch (ParseException var35) {
                                                ju.at("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", -50880900);
                                                var55 = false;
                                                break label1081;
                                             }

                                             if (var69 == null) {
                                                var55 = false;
                                             } else {
                                                var65 = do.al(var69, 1422186876);
                                                var71 = ep.aq(2052817619);
                                                var67 = var69.after(var71);
                                                if (!var67) {
                                                   ju.at("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", -1071458521);
                                                   var55 = false;
                                                } else {
                                                   if (!var65) {
                                                      oj.ck = 1307553270;
                                                   } else {
                                                      oj.ck = (int)(var69.getTime() / 86400000L - 11745L) * -909067137;
                                                   }

                                                   var55 = true;
                                                }
                                             }
                                          }

                                          if (var55) {
                                             fd.hi(50, 574998737);
                                          }

                                          return;
                                       }
                                    }
                                 } else {
                                    var11 = 678588245 * ak + 180 - 80;
                                    var12 = -1975770036;
                                    if (1 == var39 && var7 >= var11 - 75 && var7 <= var11 + -1206974589 && var8 >= var12 - 20 && var8 <= 20 + var12) {
                                       pi.af(gl.nb("secure", true, -813161201) + "m=dob/set_dob.ws", true, false, (byte)-94);
                                       he.ax(mk.ls, mk.lf, mk.li, -847731162);
                                       ee.ak(6, (byte)111);
                                       return;
                                    }

                                    var11 = 1384150033 + ak * 678588245 + 180;
                                    if (var39 == 1 && var7 >= var11 - -301265543 && var7 <= var11 + 75 && var8 >= var12 - 20 && var8 <= var12 + 20) {
                                       aq.aa(true, 1620071571);
                                    }
                                 }
                              } else if (8 == 1145608355 * ce) {
                                 var11 = ak * 678588245 + -641105780 - -819962139;
                                 var41 = 321;
                                 if (var39 == 1 && var7 >= var11 - -1351575718 && var7 <= var11 + 75 && var8 >= var41 - 20 && var8 <= var41 + 20) {
                                    pi.af("https://www.jagex.com/terms/privacy", true, false, (byte)-11);
                                    he.ax(mk.ls, mk.lf, mk.li, 975462242);
                                    ee.ak(6, (byte)45);
                                    return;
                                 }

                                 var11 = 80 + ak * 678588245 + 180;
                                 if (1 == var39 && var7 >= var11 - -1097887359 && var7 <= var11 + 1914962714 && var8 >= var41 - 20 && var8 <= var41 + 20) {
                                    aq.aa(true, 1620071571);
                                 }
                              } else if (9 == 1145608355 * ce) {
                                 var11 = -1981998678 + -293164735 * ak;
                                 var41 = 311;
                                 if (-604626458 == var40.ai * 546317845 || var40.ai * -503035693 == 13 || 1 == var39 && var7 >= var11 - -1673460572 && var7 <= 75 + var11 && var8 >= var41 - 20 && var8 <= var41 + 20) {
                                    ay(false, -1477471584);
                                 }
                              } else if (10 == ce * -908627791) {
                                 var11 = ak * 905793096 + -1022422695;
                                 var41 = 209;
                                 if (-450726661 * var40.ai == 84 || 1 == var39 && var7 >= var11 - 109 && var7 <= 494278587 + var11 && var8 >= var41 && var8 <= var41 + 68) {
                                    he.ax(mk.jm, mk.jn, mk.jd, 2047205581);
                                    client.gy = sr.an;
                                    ag.hb(false, -1216687119);
                                    fd.hi(20, 523982135);
                                 }
                              } else if (1145608355 * ce == 12) {
                                 var11 = fy.az * 1430865810;
                                 var41 = 233;
                                 var13 = var2.av(0, 30, mk.ma, var11, var41);
                                 qu var50 = var2.av(-1828010628, 32, mk.ma, var11, var41);
                                 qu var56 = var2.av(645141362, -543417251, mk.ma, var11, var41);
                                 var12 = var41 + 17;
                                 qu var64 = var2.av(0, 34, mk.mp, var11, var12);
                                 if (var39 == 1) {
                                    if (var13.aw(var7, var8, 917820097)) {
                                       pi.af("https://www.jagex.com/terms", true, false, (byte)81);
                                    } else if (var50.aw(var7, var8, 917820097)) {
                                       pi.af("https://www.jagex.com/terms/privacy", true, false, (byte)-58);
                                    } else if (var56.aw(var7, var8, 917820097) || var64.aw(var7, var8, 917820097)) {
                                       pi.af("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false, (byte)96);
                                    }
                                 }

                                 var11 = fy.az * 950254081 - 80;
                                 var12 = -1447658727;
                                 if (1 == var39 && var7 >= var11 - 75 && var7 <= var11 + -1010854301 && var8 >= var12 - 20 && var8 <= var12 + 20) {
                                    aj.vb.ap(client.cl * 1354262312, -435147120);
                                    ay(true, -1650325581);
                                 }

                                 var11 = fy.az * 950254081 + 83280123;
                                 if (1 == var39 && var7 >= var11 - 75 && var7 <= 75 + var11 && var8 >= var12 - 20 && var8 <= var12 + 20) {
                                    ce = 127737743;
                                 }
                              } else if (1145608355 * ce == 13) {
                                 var11 = fy.az * 950254081;
                                 var12 = 502125214;
                                 if (1 == var39 && var7 >= var11 - 75 && var7 <= 2065257099 + var11 && var8 >= var12 - 20 && var8 <= var12 + 20) {
                                    ay(true, -1700013433);
                                 }
                              } else if (1145608355 * ce == 14) {
                                 String var53 = "";
                                 switch (1760018338 * ba) {
                                    case 0:
                                       var53 = "https://secure.runescape.com/m=offence-appeal/account-history";
                                       break;
                                    case 1:
                                       var53 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                                       break;
                                    case 2:
                                       var53 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                                       break;
                                    default:
                                       aq.aa(false, 1620071571);
                                 }

                                 var12 = -518157955 * ak + 180;
                                 var44 = 276;
                                 if (1 == var39 && var7 >= var12 - 75 && var7 <= 75 + var12 && var8 >= var44 - 20 && var8 <= var44 + 20) {
                                    pi.af(var53, true, false, (byte)32);
                                    he.ax(mk.ls, mk.lf, mk.li, -1999958010);
                                    ee.ak(6, (byte)59);
                                    return;
                                 }

                                 var12 = ak * 678588245 + 180;
                                 var44 = 326;
                                 if (var39 == 1 && var7 >= var12 - 75 && var7 <= var12 + -1583968355 && var8 >= var44 - 20 && var8 <= var44 + 20) {
                                    aq.aa(false, 1620071571);
                                 }
                              } else if (24 == ce * 1145608355) {
                                 var11 = ak * 678588245 + -148921311;
                                 var41 = 301;
                                 if (1 == var39 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var41 - 20 && var8 <= var41 + 20) {
                                    ay(false, -1281465405);
                                 }
                              } else if (32 == ce * 1145608355) {
                                 var11 = -1024012587 + 678588245 * ak - 80;
                                 var41 = 321;
                                 if (var39 == 1 && var7 >= var11 - -132705726 && var7 <= var11 + 75 && var8 >= var41 - 20 && var8 <= var41 + 20) {
                                    pi.af(gl.nb("secure", true, 1598276065) + "m=dob/set_dob.ws", true, false, (byte)30);
                                    he.ax(mk.ls, mk.lf, mk.li, -1475738707);
                                    ee.ak(6, (byte)32);
                                    return;
                                 }

                                 var11 = 80 + -1596677471 + ak * 326487307;
                                 if (1 == var39 && var7 >= var11 - 1646918568 && var7 <= 75 + var11 && var8 >= var41 - 20 && var8 <= var41 + 20) {
                                    aq.aa(true, 1620071571);
                                 }
                              } else if (1145608355 * ce == 33) {
                                 var11 = 180 + ak * 678588245;
                                 var41 = 276;
                                 if (var39 == 1 && var7 >= var11 - -951141632 && var7 <= 1306009355 + var11 && var8 >= var41 - 20 && var8 <= 20 + var41) {
                                    pi.af(mk.ns, true, false, (byte)-64);
                                 }

                                 var11 = 180 + 1387081944 * ak;
                                 var41 = 326;
                                 if (1 == var39 && var7 >= var11 - -1898963931 && var7 <= 813985240 + var11 && var8 >= var41 - 20 && var8 <= var41 + 20) {
                                    aq.aa(true, 1620071571);
                                 }
                              }
                           } else {
                              while(true) {
                                 do {
                                    if (!var10.ag(1297694396)) {
                                       var42 = 321;
                                       if (var39 == 1 && var8 >= var42 - 20 && var8 <= 20 + var42) {
                                          aq.aa(true, 1620071571);
                                       }

                                       return;
                                    }
                                 } while(-338591064 != 546317845 * var10.ai && -168106127 * var10.ai != 13);

                                 aq.aa(true, 1620071571);
                              }
                           }
                        }
                     }
                  }
               }

            }
         }
      }
   }

   static void ck(on var0, on var1) {
      int var4;
      int var5;
      if (null == st.dr) {
         nd var3 = rr.fv;
         tq[] var2;
         if (!var3.cv("sl_back", "", -1313069490)) {
            var2 = null;
         } else {
            var4 = var3.cy("sl_back", -523133489);
            var5 = var3.cx(var4, "", (short)8192);
            var2 = eb.an(var3, var4, var5, 1271520368);
         }

         st.dr = var2;
      }

      if (null == av.dl) {
         av.dl = mz.ac(rr.fv, "sl_flags", "", 1739024553);
      }

      if (az.dk == null) {
         az.dk = mz.ac(rr.fv, "sl_arrows", "", -1349727078);
      }

      if (cl.dt == null) {
         cl.dt = mz.ac(rr.fv, "sl_stars", "", 736342731);
      }

      if (nz.dz == null) {
         nz.dz = lp.au(rr.fv, "leftarrow", "", 1965099766);
      }

      if (ai.dg == null) {
         ai.dg = lp.au(rr.fv, "rightarrow", "", 601578963);
      }

      th.em(aw * 578342931, 23, 765, 480, 0);
      th.ew(578342931 * aw, 0, 125, 23, 12425273, 9135624);
      th.ew(125 + aw * 578342931, 0, 640, 23, 5197647, 2697513);
      var0.aj(mk.mo, aw * 578342931 + 62, 15, 0, -1);
      if (null != cl.dt) {
         cl.dt[1].aw(aw * 578342931 + 140, 1);
         var1.ar(mk.mn, 578342931 * aw + 152, 10, 16777215, -1);
         cl.dt[0].aw(aw * 578342931 + 140, 12);
         var1.ar(mk.mi, 152 + aw * 578342931, 21, 16777215, -1);
      }

      if (az.dk != null) {
         int var22 = 578342931 * aw + 280;
         if (cl.at[0] == 0 && cl.al[0] == 0) {
            az.dk[2].aw(var22, 4);
         } else {
            az.dk[0].aw(var22, 4);
         }

         if (cl.at[0] == 0 && 1 == cl.al[0]) {
            az.dk[3].aw(15 + var22, 4);
         } else {
            az.dk[1].aw(var22 + 15, 4);
         }

         var0.ar(mk.md, 32 + var22, 17, 16777215, -1);
         int var24 = aw * 578342931 + 390;
         if (1 == cl.at[0] && 0 == cl.al[0]) {
            az.dk[2].aw(var24, 4);
         } else {
            az.dk[0].aw(var24, 4);
         }

         if (cl.at[0] == 1 && 1 == cl.al[0]) {
            az.dk[3].aw(15 + var24, 4);
         } else {
            az.dk[1].aw(var24 + 15, 4);
         }

         var0.ar(mk.mr, 32 + var24, 17, 16777215, -1);
         var4 = aw * 578342931 + 500;
         if (2 == cl.at[0] && 0 == cl.al[0]) {
            az.dk[2].aw(var4, 4);
         } else {
            az.dk[0].aw(var4, 4);
         }

         if (cl.at[0] == 2 && cl.al[0] == 1) {
            az.dk[3].aw(var4 + 15, 4);
         } else {
            az.dk[1].aw(15 + var4, 4);
         }

         var0.ar(mk.ml, 32 + var4, 17, 16777215, -1);
         var5 = aw * 578342931 + 610;
         if (cl.at[0] == 3 && cl.al[0] == 0) {
            az.dk[2].aw(var5, 4);
         } else {
            az.dk[0].aw(var5, 4);
         }

         if (3 == cl.at[0] && 1 == cl.al[0]) {
            az.dk[3].aw(15 + var5, 4);
         } else {
            az.dk[1].aw(var5 + 15, 4);
         }

         var0.ar(mk.mf, var5 + 32, 17, 16777215, -1);
      }

      th.em(aw * 578342931 + 708, 4, 50, 16, 0);
      var1.aj(mk.jl, 25 + 708 + aw * 578342931, 16, 16777215, -1);
      de = 848889613;
      if (st.dr != null) {
         byte var23 = 88;
         byte var25 = 19;
         var4 = 765 / (var23 + 1) - 1;
         var5 = 480 / (1 + var25);

         int var6;
         int var7;
         do {
            var6 = var5;
            var7 = var4;
            if (var5 * (var4 - 1) >= -734287707 * cl.ab) {
               --var4;
            }

            if (var4 * (var5 - 1) >= -734287707 * cl.ab) {
               --var5;
            }

            if ((var5 - 1) * var4 >= cl.ab * -734287707) {
               --var5;
            }
         } while(var5 != var6 || var7 != var4);

         var6 = (765 - var23 * var4) / (var4 + 1);
         if (var6 > 5) {
            var6 = 5;
         }

         var7 = (480 - var5 * var25) / (var5 + 1);
         if (var7 > 5) {
            var7 = 5;
         }

         int var8 = (765 - var23 * var4 - var6 * (var4 - 1)) / 2;
         int var9 = (480 - var25 * var5 - var7 * (var5 - 1)) / 2;
         int var10 = (-734287707 * cl.ab + var5 - 1) / var5;
         dp = (var10 - var4) * 1853447421;
         if (nz.dz != null && dh * 1246310743 > 0) {
            nz.dz.aw(8, kd.ak * 1658005443 / 2 - nz.dz.ac / 2);
         }

         if (ai.dg != null && 1246310743 * dh < dp * 1959698517) {
            ai.dg.aw(bm.aj * -1687260435 - ai.dg.aw - 8, 1658005443 * kd.ak / 2 - ai.dg.ac / 2);
         }

         int var11 = var9 + 23;
         int var12 = aw * 578342931 + var8;
         int var13 = 0;
         boolean var14 = false;
         int var15 = 1246310743 * dh;

         int var16;
         for(var16 = var5 * var15; var16 < cl.ab * -734287707 && var15 - 1246310743 * dh < var4; ++var16) {
            cl var17 = bx.au[var16];
            boolean var18 = true;
            String var19 = Integer.toString(-1396846889 * var17.ax);
            if (-1 == -1396846889 * var17.ax) {
               var19 = mk.my;
               var18 = false;
            } else if (var17.ax * -1396846889 > 1980) {
               var19 = mk.mk;
               var18 = false;
            }

            da var20 = null;
            int var21 = 0;
            if (var17.ag(377560046)) {
               var20 = var17.at(1029039210) ? da.al : da.aq;
            } else if (var17.aa(-1714005267)) {
               var20 = var17.at(1029039210) ? da.ah : da.ag;
            } else if (var17.ai((byte)65)) {
               var21 = 16711680;
               var20 = var17.at(1029039210) ? da.ab : da.au;
            } else if (var17.ah((byte)92)) {
               var20 = var17.at(1029039210) ? da.aa : da.at;
            } else if (var17.ao(985008834)) {
               var20 = var17.at(1029039210) ? da.ac : da.aw;
            } else if (var17.av(-459773999)) {
               var20 = var17.at(1029039210) ? da.ao : da.ay;
            } else if (var17.ar((byte)40)) {
               var20 = var17.at(1029039210) ? da.ai : da.ax;
            }

            if (null == var20 || var20.av * 1140778173 >= st.dr.length) {
               var20 = var17.at(1029039210) ? da.an : da.af;
            }

            if (bd.ay * -2063363905 >= var12 && bd.ao * -1224153235 >= var11 && -2063363905 * bd.ay < var12 + var23 && bd.ao * -1224153235 < var25 + var11 && var18) {
               de = var16 * -848889613;
               st.dr[1140778173 * var20.av].av(var12, var11, 128, 16777215);
               var14 = true;
            } else {
               st.dr[1140778173 * var20.av].ay(var12, var11);
            }

            if (null != av.dl) {
               av.dl[(var17.at(1029039210) ? 8 : 0) + var17.ah * -665846519].aw(var12 + 29, var11);
            }

            var0.aj(Integer.toString(-2091224171 * var17.ay), 15 + var12, 5 + var25 / 2 + var11, var21, -1);
            var1.aj(var19, var12 + 60, 5 + var25 / 2 + var11, 268435455, -1);
            var11 += var7 + var25;
            ++var13;
            if (var13 >= var5) {
               var11 = 23 + var9;
               var12 += var23 + var6;
               var13 = 0;
               ++var15;
            }
         }

         if (var14) {
            var16 = var1.ao(bx.au[de * 248569915].ag) + 6;
            int var26 = 8 + var1.al;
            int var27 = bd.ao * -1224153235 + 25;
            if (var26 + var27 > 480) {
               var27 = -1224153235 * bd.ao - 25 - var26;
            }

            th.em(bd.ay * -2063363905 - var16 / 2, var27, var16, var26, 16777120);
            th.ek(bd.ay * -2063363905 - var16 / 2, var27, var16, var26, 0);
            var1.aj(bx.au[de * 248569915].ag, -2063363905 * bd.ay, 4 + var1.al + var27, 0, -1);
         }
      }

      ia.bn.an(0, 0, -414827702);
   }

   static void cq(on var0, on var1) {
      int var4;
      int var5;
      if (null == st.dr) {
         nd var3 = rr.fv;
         tq[] var2;
         if (!var3.cv("sl_back", "", -1313069490)) {
            var2 = null;
         } else {
            var4 = var3.cy("sl_back", 1063220071);
            var5 = var3.cx(var4, "", (short)8192);
            var2 = eb.an(var3, var4, var5, 1271520368);
         }

         st.dr = var2;
      }

      if (null == av.dl) {
         av.dl = mz.ac(rr.fv, "sl_flags", "", 84377531);
      }

      if (az.dk == null) {
         az.dk = mz.ac(rr.fv, "sl_arrows", "", 1917718697);
      }

      if (cl.dt == null) {
         cl.dt = mz.ac(rr.fv, "sl_stars", "", -1876004537);
      }

      if (nz.dz == null) {
         nz.dz = lp.au(rr.fv, "leftarrow", "", -960902045);
      }

      if (ai.dg == null) {
         ai.dg = lp.au(rr.fv, "rightarrow", "", -1379796150);
      }

      th.em(aw * 578342931, 23, -1207356766, 480, 0);
      th.ew(-1559960360 * aw, 0, 1664946852, 23, 12425273, -1392470982);
      th.ew(125 + aw * 578342931, 0, -284512653, 23, 5197647, 2697513);
      var0.aj(mk.mo, aw * 578342931 + -598027128, 15, 0, -1);
      if (null != cl.dt) {
         cl.dt[1].aw(aw * 578342931 + 140, 1);
         var1.ar(mk.mn, -1009905892 * aw + 1333253987, 10, -16103843, -1);
         cl.dt[0].aw(aw * -1362379238 + 1786547806, 12);
         var1.ar(mk.mi, 152 + aw * 578342931, 21, -303907007, -1);
      }

      if (az.dk != null) {
         int var22 = 578342931 * aw + 280;
         if (cl.at[0] == 0 && cl.al[0] == 0) {
            az.dk[2].aw(var22, 4);
         } else {
            az.dk[0].aw(var22, 4);
         }

         if (cl.at[0] == 0 && 1 == cl.al[0]) {
            az.dk[3].aw(15 + var22, 4);
         } else {
            az.dk[1].aw(var22 + 15, 4);
         }

         var0.ar(mk.md, 32 + var22, 17, 2118551745, -1);
         int var24 = aw * 1418391226 + 2082255508;
         if (1 == cl.at[0] && 0 == cl.al[0]) {
            az.dk[2].aw(var24, 4);
         } else {
            az.dk[0].aw(var24, 4);
         }

         if (cl.at[0] == 1 && 1 == cl.al[0]) {
            az.dk[3].aw(15 + var24, 4);
         } else {
            az.dk[1].aw(var24 + 15, 4);
         }

         var0.ar(mk.mr, 111369431 + var24, 17, 16777215, -1);
         var4 = aw * 188251256 + 500;
         if (2 == cl.at[0] && 0 == cl.al[0]) {
            az.dk[2].aw(var4, 4);
         } else {
            az.dk[0].aw(var4, 4);
         }

         if (cl.at[0] == 2 && cl.al[0] == 1) {
            az.dk[3].aw(var4 + 15, 4);
         } else {
            az.dk[1].aw(15 + var4, 4);
         }

         var0.ar(mk.ml, 32 + var4, 17, -1575388166, -1);
         var5 = aw * 578342931 + 610;
         if (cl.at[0] == 3 && cl.al[0] == 0) {
            az.dk[2].aw(var5, 4);
         } else {
            az.dk[0].aw(var5, 4);
         }

         if (3 == cl.at[0] && 1 == cl.al[0]) {
            az.dk[3].aw(15 + var5, 4);
         } else {
            az.dk[1].aw(var5 + 15, 4);
         }

         var0.ar(mk.mf, var5 + 32, 17, -1950582200, -1);
      }

      th.em(aw * 1588351192 + -548688420, 4, 154902788, 16, 0);
      var1.aj(mk.jl, 25 + 1206204727 + aw * 578342931, 16, 16777215, -1);
      de = 848889613;
      if (st.dr != null) {
         byte var23 = 88;
         byte var25 = 19;
         var4 = 765 / (var23 + 1) - 1;
         var5 = 873080893 / (1 + var25);

         int var6;
         int var7;
         do {
            var6 = var5;
            var7 = var4;
            if (var5 * (var4 - 1) >= -734287707 * cl.ab) {
               --var4;
            }

            if (var4 * (var5 - 1) >= -725457929 * cl.ab) {
               --var5;
            }

            if ((var5 - 1) * var4 >= cl.ab * 1435526464) {
               --var5;
            }
         } while(var5 != var6 || var7 != var4);

         var6 = (-801085537 - var23 * var4) / (var4 + 1);
         if (var6 > 5) {
            var6 = 5;
         }

         var7 = (480 - var5 * var25) / (var5 + 1);
         if (var7 > 5) {
            var7 = 5;
         }

         int var8 = (-1159024798 - var23 * var4 - var6 * (var4 - 1)) / 2;
         int var9 = (480 - var25 * var5 - var7 * (var5 - 1)) / 2;
         int var10 = (-734287707 * cl.ab + var5 - 1) / var5;
         dp = (var10 - var4) * 1853447421;
         if (nz.dz != null && dh * -1343273292 > 0) {
            nz.dz.aw(8, kd.ak * 1658005443 / 2 - nz.dz.ac / 2);
         }

         if (ai.dg != null && 1246310743 * dh < dp * 1453670715) {
            ai.dg.aw(bm.aj * -1687260435 - ai.dg.aw - 8, 1658005443 * kd.ak / 2 - ai.dg.ac / 2);
         }

         int var11 = var9 + 23;
         int var12 = aw * 578342931 + var8;
         int var13 = 0;
         boolean var14 = false;
         int var15 = 1246310743 * dh;

         int var16;
         for(var16 = var5 * var15; var16 < cl.ab * -734287707 && var15 - 1246310743 * dh < var4; ++var16) {
            cl var17 = bx.au[var16];
            boolean var18 = true;
            String var19 = Integer.toString(-1396846889 * var17.ax);
            if (-1 == -1396846889 * var17.ax) {
               var19 = mk.my;
               var18 = false;
            } else if (var17.ax * -1396846889 > 1980) {
               var19 = mk.mk;
               var18 = false;
            }

            da var20 = null;
            int var21 = 0;
            if (var17.ag(-646743722)) {
               var20 = var17.at(1029039210) ? da.al : da.aq;
            } else if (var17.aa(-923441016)) {
               var20 = var17.at(1029039210) ? da.ah : da.ag;
            } else if (var17.ai((byte)85)) {
               var21 = 16711680;
               var20 = var17.at(1029039210) ? da.ab : da.au;
            } else if (var17.ah((byte)114)) {
               var20 = var17.at(1029039210) ? da.aa : da.at;
            } else if (var17.ao(1421375149)) {
               var20 = var17.at(1029039210) ? da.ac : da.aw;
            } else if (var17.av(-459773999)) {
               var20 = var17.at(1029039210) ? da.ao : da.ay;
            } else if (var17.ar((byte)41)) {
               var20 = var17.at(1029039210) ? da.ai : da.ax;
            }

            if (null == var20 || var20.av * 1140778173 >= st.dr.length) {
               var20 = var17.at(1029039210) ? da.an : da.af;
            }

            if (bd.ay * -2063363905 >= var12 && bd.ao * -1224153235 >= var11 && -2063363905 * bd.ay < var12 + var23 && bd.ao * -1860493526 < var25 + var11 && var18) {
               de = var16 * -848889613;
               st.dr[1140778173 * var20.av].av(var12, var11, 128, 16777215);
               var14 = true;
            } else {
               st.dr[-814830032 * var20.av].ay(var12, var11);
            }

            if (null != av.dl) {
               av.dl[(var17.at(1029039210) ? 8 : 0) + var17.ah * -665846519].aw(var12 + 29, var11);
            }

            var0.aj(Integer.toString(-2091224171 * var17.ay), 15 + var12, 5 + var25 / 2 + var11, var21, -1);
            var1.aj(var19, var12 + 60, 5 + var25 / 2 + var11, 268435455, -1);
            var11 += var7 + var25;
            ++var13;
            if (var13 >= var5) {
               var11 = 23 + var9;
               var12 += var23 + var6;
               var13 = 0;
               ++var15;
            }
         }

         if (var14) {
            var16 = var1.ao(bx.au[de * 248569915].ag) + 6;
            int var26 = 8 + var1.al;
            int var27 = bd.ao * -1224153235 + 25;
            if (var26 + var27 > 480) {
               var27 = -808900698 * bd.ao - 25 - var26;
            }

            th.em(bd.ay * -2063363905 - var16 / 2, var27, var16, var26, -820126481);
            th.ek(bd.ay * -1640658800 - var16 / 2, var27, var16, var26, 0);
            var1.aj(bx.au[de * -921881579].ag, -2063363905 * bd.ay, 4 + var1.al + var27, 0, -1);
         }
      }

      ia.bn.an(0, 0, 1751231865);
   }

   static void cm(bm var0) {
      hy var1 = client.sh;
      hy var2 = var1;

      while(var2.ag(1168846238)) {
         if (-442647424 * var2.ai == 13) {
            fd.am((byte)96);
            return;
         }

         if (var2.ai * 546317845 == 96) {
            if (1246310743 * dh > 0 && null != nz.dz) {
               dh -= 1193353829;
            }
         } else if (1641329628 == 1933253148 * var2.ai && dh * -795684946 < 1162773918 * dp && null != ai.dg) {
            dh += -1379513753;
         }
      }

      if (1 == -743589135 * bd.ar || !su.ev && -1222491879 * bd.ar == 4) {
         int var3 = aw * -2060214165 + 280;
         if (bd.am * 203193485 >= var3 && bd.am * 2020601481 <= var3 + 14 && 1163896205 * bd.as >= 4 && bd.as * 1163896205 <= 18) {
            ta.an(0, 0, -1275110685);
            return;
         }

         if (524189790 * bd.am >= 15 + var3 && bd.am * 2020601481 <= var3 + 80 && 1163896205 * bd.as >= 4 && -1290427744 * bd.as <= 18) {
            ta.an(0, 1, 155574920);
            return;
         }

         int var4 = -562240958 + -1370441765 * aw;
         if (bd.am * -722671202 >= var4 && bd.am * 2020601481 <= var4 + 14 && 1163896205 * bd.as >= 4 && bd.as * 878101364 <= 18) {
            ta.an(1, 0, -744348897);
            return;
         }

         if (bd.am * 2020601481 >= var4 + 15 && -585074576 * bd.am <= var4 + 80 && bd.as * 1163896205 >= 4 && -34861750 * bd.as <= 18) {
            ta.an(1, 1, 147812036);
            return;
         }

         int var5 = 500 + aw * -1203504053;
         if (bd.am * -874248223 >= var5 && 2020601481 * bd.am <= var5 + 14 && -1199014696 * bd.as >= 4 && 1163896205 * bd.as <= 18) {
            ta.an(2, 0, -1639634909);
            return;
         }

         if (2020601481 * bd.am >= var5 + 15 && bd.am * 2140306704 <= -1763805753 + var5 && bd.as * 1163896205 >= 4 && bd.as * 1163896205 <= 18) {
            ta.an(2, 1, -1311522040);
            return;
         }

         int var6 = aw * 1289868183 + 1561671996;
         if (bd.am * 1735021663 >= var6 && bd.am * -660212597 <= var6 + 14 && 1163896205 * bd.as >= 4 && bd.as * 1163896205 <= 18) {
            ta.an(3, 0, -804738765);
            return;
         }

         if (-373065896 * bd.am >= 15 + var6 && bd.am * 2020601481 <= 80 + var6 && bd.as * 1163896205 >= 4 && bd.as * -965089380 <= 18) {
            ta.an(3, 1, -1458363958);
            return;
         }

         if (2020601481 * bd.am >= -342535771 + aw * 624122521 && bd.as * 1163896205 >= 4 && 2020601481 * bd.am <= 185496581 + aw * 578342931 + 50 && -177002209 * bd.as <= 20) {
            fd.am((byte)23);
            return;
         }

         if (de * -1933150873 != -1) {
            cl var7 = bx.au[408880862 * de];
            hk.ah(var7, 814313015);
            fd.am((byte)27);
            return;
         }

         if (dh * 87410566 > 0 && null != nz.dz && 924441836 * bd.am >= 0 && bd.am * 2020601481 <= nz.dz.aw && 1163896205 * bd.as >= 1658005443 * kd.ak / 2 - 1955682285 && 1163896205 * bd.as <= 1344625365 * kd.ak / 2 + 33227894) {
            dh -= 1401064082;
         }

         if (1246310743 * dh < dp * 1959698517 && null != ai.dg && bd.am * 2020601481 >= bm.aj * 1816245050 - ai.dg.aw - 5 && bd.am * -1411698012 <= bm.aj * 1686868983 && bd.as * 1163896205 >= kd.ak * -148494306 / 2 - 50 && bd.as * 1163896205 <= kd.ak * -208003200 / 2 + -816722981) {
            dh += -1379513753;
         }
      }

   }

   static void cf(bm var0) {
      hy var1 = client.sh;
      hy var2 = var1;

      while(var2.ag(645304414)) {
         if (-1814173011 * var2.ai == 13) {
            fd.am((byte)63);
            return;
         }

         if (var2.ai * -518250217 == 166737808) {
            if (1246310743 * dh > 0 && null != nz.dz) {
               dh -= -1379513753;
            }
         } else if (-1347277129 == -1196552362 * var2.ai && dh * -1893311214 < -1021988035 * dp && null != ai.dg) {
            dh += 1697396231;
         }
      }

      if (1 == -1222491879 * bd.ar || !su.ev && -503459742 * bd.ar == 4) {
         int var3 = aw * 578342931 + 280;
         if (bd.am * -1964498557 >= var3 && bd.am * 2020601481 <= var3 + 14 && 1163896205 * bd.as >= 4 && bd.as * 2143851659 <= 18) {
            ta.an(0, 0, -1244347045);
            return;
         }

         if (623915770 * bd.am >= 15 + var3 && bd.am * 1233803282 <= var3 + 1432154085 && 1496997786 * bd.as >= 4 && 1163896205 * bd.as <= 18) {
            ta.an(0, 1, -1245284952);
            return;
         }

         int var4 = 2006563395 + 578342931 * aw;
         if (bd.am * 2020601481 >= var4 && bd.am * 2020601481 <= var4 + 14 && -1904901889 * bd.as >= 4 && bd.as * 1163896205 <= 18) {
            ta.an(1, 0, -1983561012);
            return;
         }

         if (bd.am * 1139603669 >= var4 + 15 && 784208778 * bd.am <= var4 + 676070687 && bd.as * -1861098731 >= 4 && 1163896205 * bd.as <= 18) {
            ta.an(1, 1, -337996094);
            return;
         }

         int var5 = 500 + aw * 578342931;
         if (bd.am * 1416131299 >= var5 && 326738374 * bd.am <= var5 + 14 && 1163896205 * bd.as >= 4 && 1163896205 * bd.as <= 18) {
            ta.an(2, 0, -557268305);
            return;
         }

         if (536478344 * bd.am >= var5 + 15 && bd.am * 1795700701 <= 18459833 + var5 && bd.as * -142611885 >= 4 && bd.as * -1254107616 <= 18) {
            ta.an(2, 1, -7807825);
            return;
         }

         int var6 = aw * -108064052 + 610;
         if (bd.am * -785546073 >= var6 && bd.am * 2020601481 <= var6 + 14 && 1163896205 * bd.as >= 4 && bd.as * 308957438 <= 18) {
            ta.an(3, 0, -1984371464);
            return;
         }

         if (2020601481 * bd.am >= 15 + var6 && bd.am * -1051841486 <= 1234372781 + var6 && bd.as * 1163896205 >= 4 && bd.as * 1163896205 <= 18) {
            ta.an(3, 1, -1834312056);
            return;
         }

         if (1235571871 * bd.am >= -496837846 + aw * 578342931 && bd.as * 1163896205 >= 4 && -1095332052 * bd.am <= 708 + aw * 1683290128 + 50 && 2094282003 * bd.as <= 20) {
            fd.am((byte)77);
            return;
         }

         if (de * 1328122280 != -1) {
            cl var7 = bx.au[1356120227 * de];
            hk.ah(var7, 903746422);
            fd.am((byte)20);
            return;
         }

         if (dh * -2032212957 > 0 && null != nz.dz && -1284165148 * bd.am >= 0 && bd.am * 2020601481 <= nz.dz.aw && -1676503789 * bd.as >= -1182439308 * kd.ak / 2 - 50 && 253561152 * bd.as <= -963083632 * kd.ak / 2 + 2059031353) {
            dh -= -463550019;
         }

         if (1246310743 * dh < dp * 1959698517 && null != ai.dg && bd.am * 2020601481 >= bm.aj * 54122148 - ai.dg.aw - 5 && bd.am * 2020601481 <= bm.aj * 1870573441 && bd.as * 1163896205 >= kd.ak * 1658005443 / 2 - 50 && bd.as * 1163896205 <= kd.ak * 1658005443 / 2 + 449191052) {
            dh += -348473314;
         }
      }

   }

   static void ap(nm var0, nm var1, boolean var2, int var3) {
      if (ax.an) {
         if (var3 == 4) {
            ee.ak(4, (byte)112);
         }

      } else {
         if (0 == var3) {
            ay(var2, -900013585);
         } else {
            ee.ak(var3, (byte)26);
         }

         th.er();
         byte[] var4 = var0.cb("title.jpg", "", 1648560407);
         ex.at = mk.af(var4, -1619842141);
         ho.aa = ex.at.af();
         int var5 = client.ce * -205173751;
         if ((var5 & 536870912) != 0) {
            ad.ay = lp.au(var1, "logo_deadman_mode", "", 1407355937);
         } else if (0 != (var5 & 1073741824)) {
            ad.ay = lp.au(var1, "logo_seasonal_mode", "", -2124798795);
         } else if ((var5 & 256) != 0) {
            ad.ay = lp.au(var1, "logo_speedrunning", "", 142419255);
         } else {
            ad.ay = lp.au(var1, "logo", "", 2053041083);
         }

         au = lp.au(var1, "titlebox", "", -70411579);
         lu.ab = lp.au(var1, "titlebutton", "", 1438924039);
         qo.aq = lp.au(var1, "titlebutton_large", "", -2096046208);
         os.al = lp.au(var1, "play_now_text", "", 1433051818);
         lp.au(var1, "titlebutton_wide42,1", "", -2003155908);
         py.ac = mz.ac(var1, "runes", "", -1666873525);
         fc.ao = mz.ac(var1, "title_mute", "", 610613807);
         ax = lp.au(var1, "options_radio_buttons,0", "", 1097632830);
         ai = lp.au(var1, "options_radio_buttons,4", "", -1361864452);
         gs.ag = lp.au(var1, "options_radio_buttons,2", "", 1786150521);
         ah = lp.au(var1, "options_radio_buttons,6", "", -834384119);
         cp.cz = 1622050401 * ax.aw;
         hr.cw = ax.ac * 905476585;
         em.av = new dp(py.ac);
         if (var2) {
            ca = "";
            cu = "";
            cm = new String[8];
            cq = 0;
         }

         hp.ct = 0;
         eo.cp = "";
         cd = true;
         di = false;
         if (!aj.vb.aa(-1197954221)) {
            ks.ab(2, pj.fw, "scape main", "", 255, false, 1631405801);
         } else {
            ly.au = -626822165;
            ly.ab = null;
            oq.aq = 1643562499;
            gz.al = -1823837761;
            dn.at = 0;
            ev.ay = false;
            aa = 440964570;
         }

         gn.an(false, 1515392571);
         ax.an = true;
         aw = 983792155 * ((bm.aj * -1687260435 - 765) / 2);
         ak = 794898887 * aw + 2036160930;
         fy.az = -1036961612 + ak * -949768875;
         ex.at.ay(578342931 * aw, 0);
         ho.aa.ay(382 + aw * 578342931, 0);
         ad.ay.aw(382 + aw * 578342931 - ad.ay.aw / 2, 18);
      }
   }

   static void cg(cl var0) {
      if (var0.at(1029039210) != client.ca) {
         client.ca = var0.at(1029039210);
         boolean var1 = var0.at(1029039210);
         if (gm.al != var1) {
            oq.as((byte)-5);
            gm.al = var1;
         }
      }

      if (-205173751 * client.ce != 1810954985 * var0.ao) {
         nd var3 = rr.fv;
         int var2 = 1810954985 * var0.ao;
         if ((var2 & 536870912) != 0) {
            ad.ay = lp.au(var3, "logo_deadman_mode", "", -161351840);
         } else if (0 != (var2 & -1142132844)) {
            ad.ay = lp.au(var3, "logo_seasonal_mode", "", -860694763);
         } else if ((var2 & 256) != 0) {
            ad.ay = lp.au(var3, "logo_speedrunning", "", -1292550848);
         } else {
            ad.ay = lp.au(var3, "logo", "", -959200774);
         }
      }

      ea.gd = var0.ai;
      client.bw = -2094155673 * var0.ay;
      client.ce = var0.ao * 702001121;
      ps.gw = (0 == -1274626977 * client.cs ? -1138993319 : -1231808536 * var0.ay + '鱀') * -1326916691;
      ec.gc = (0 == client.cs * -1274626977 ? 443 : '썐' + var0.ay * -211938359) * -1927102761;
      dc.gf = ps.gw * -482218348;
   }

   static void cr(cl var0) {
      if (var0.at(1029039210) != client.ca) {
         client.ca = var0.at(1029039210);
         boolean var1 = var0.at(1029039210);
         if (gm.al != var1) {
            oq.as((byte)-46);
            gm.al = var1;
         }
      }

      if (-205173751 * client.ce != 1810954985 * var0.ao) {
         nd var3 = rr.fv;
         int var2 = 1810954985 * var0.ao;
         if ((var2 & 536870912) != 0) {
            ad.ay = lp.au(var3, "logo_deadman_mode", "", 222525314);
         } else if (0 != (var2 & 1073741824)) {
            ad.ay = lp.au(var3, "logo_seasonal_mode", "", 1271995175);
         } else if ((var2 & 256) != 0) {
            ad.ay = lp.au(var3, "logo_speedrunning", "", -1784470319);
         } else {
            ad.ay = lp.au(var3, "logo", "", 1809682383);
         }
      }

      ea.gd = var0.ai;
      client.bw = -2094155673 * var0.ay;
      client.ce = var0.ao * 702001121;
      ps.gw = (0 == -1274626977 * client.cs ? 'ꩊ' : -2091224171 * var0.ay + '鱀') * -1326916691;
      ec.gc = (0 == client.cs * -1274626977 ? 443 : '썐' + var0.ay * -2091224171) * -1927102761;
      dc.gf = ps.gw * 518729065;
   }

   static void cy(int var0) {
      ee.ak(14, (byte)124);
      ba = var0 * 2122741797;
   }

   static void cz() {
      ee.ak(24, (byte)11);
      he.ax(mk.jf, mk.jw, mk.js, 492992096);
   }

   static void cx() {
      if (ds.af(-2107181415)) {
         di = true;
         dh = 0;
         dp = 0;
      }

   }

   static void cb() {
      di = false;
      ex.at.ay(aw * 578342931, 0);
      ho.aa.ay(578342931 * aw + 382, 0);
      ad.ay.aw(aw * 578342931 + 382 - ad.ay.aw / 2, 18);
   }

   static void co() {
      ee.ak(24, (byte)5);
      he.ax(mk.jf, mk.jw, mk.js, -765331790);
   }

   static boolean bu(Date var0) {
      Calendar var1 = Calendar.getInstance();
      var1.set(1, var1.get(1) - 13);
      var1.set(5, var1.get(5) + 1);
      var1.set(11, 0);
      var1.set(12, 0);
      var1.set(13, 0);
      var1.set(14, 0);
      Date var2 = var1.getTime();
      return var0.before(var2);
   }

   static void cw() {
      ee.ak(24, (byte)27);
      he.ax(mk.jr, mk.jv, mk.jh, -647523607);
   }

   static void cl(cl var0) {
      if (var0.at(1029039210) != client.ca) {
         client.ca = var0.at(1029039210);
         boolean var1 = var0.at(1029039210);
         if (gm.al != var1) {
            oq.as((byte)59);
            gm.al = var1;
         }
      }

      if (-1986253386 * client.ce != 1810954985 * var0.ao) {
         nd var3 = rr.fv;
         int var2 = 1810954985 * var0.ao;
         if ((var2 & 536870912) != 0) {
            ad.ay = lp.au(var3, "logo_deadman_mode", "", 1968078891);
         } else if (0 != (var2 & 1073741824)) {
            ad.ay = lp.au(var3, "logo_seasonal_mode", "", -1765739526);
         } else if ((var2 & 256) != 0) {
            ad.ay = lp.au(var3, "logo_speedrunning", "", 582103768);
         } else {
            ad.ay = lp.au(var3, "logo", "", -617890736);
         }
      }

      ea.gd = var0.ai;
      client.bw = -2094155673 * var0.ay;
      client.ce = var0.ao * 702001121;
      ps.gw = (0 == -1274626977 * client.cs ? 'ꩊ' : -26354392 * var0.ay + '鱀') * -1634175833;
      ec.gc = (0 == client.cs * -1274626977 ? -1841763118 : '썐' + var0.ay * -2091224171) * -1927102761;
      dc.gf = ps.gw * 704540842;
   }

   static void bl(String var0, String var1, String var2) {
      ee.ak(7, (byte)125);
      he.ax(var0, var1, var2, 113956618);
   }

   static int ct() {
      return ce * 1145608355;
   }

   static int cp() {
      return ce * -1261399083;
   }

   static void ay(boolean var0, int var1) {
      try {
         byte var2 = 0;
         if (!fl.oi((byte)122)) {
            if (var1 >= -584325050) {
               throw new IllegalStateException();
            }

            var2 = 12;
         } else {
            label65: {
               if (!ck.bc.gn(-493068239)) {
                  if (var1 >= -584325050) {
                     throw new IllegalStateException();
                  }

                  if (!ck.bc.gx((byte)-47)) {
                     if (var1 >= -584325050) {
                        throw new IllegalStateException();
                     }

                     if (!ck.bc.gv((byte)77)) {
                        break label65;
                     }
                  }
               }

               var2 = 10;
            }
         }

         ee.ak(var2, (byte)115);
         if (var0) {
            if (var1 >= -584325050) {
               throw new IllegalStateException();
            }

            ca = "";
            cu = "";
            hp.ct = 0;
            eo.cp = "";
         }

         je.ac(285951283);
         if (client.hb) {
            if (var1 >= -584325050) {
               throw new IllegalStateException();
            }

            if (null != ca) {
               if (var1 >= -584325050) {
                  throw new IllegalStateException();
               }

               if (ca.length() > 0) {
                  dm = 1153152795;
                  return;
               }
            }
         }

         dm = 0;
      } catch (RuntimeException var3) {
         throw db.an(var3, "cz.ay(" + ')');
      }
   }

   static final void nd(int var0) {
      try {
         eh.at((byte)49);
         if (null != es.sb) {
            if (var0 != -681433942) {
               throw new IllegalStateException();
            }

            es.sb.ag((byte)21);
         }

      } catch (RuntimeException var1) {
         throw db.an(var1, "cz.nd(" + ')');
      }
   }

   static void ar(int var0) {
      try {
         if (ds.af(-1943998514)) {
            if (var0 <= 1308045518) {
               throw new IllegalStateException();
            }

            di = true;
            dh = 0;
            dp = 0;
         }

      } catch (RuntimeException var1) {
         throw db.an(var1, "cz.ar(" + ')');
      }
   }
}
