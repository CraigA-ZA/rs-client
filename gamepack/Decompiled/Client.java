import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import com.jagex.oldscape.pub.RefreshAccessTokenRequester;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

public final class Client extends GameShell implements Usernamed, OAuthApi {
   public static boolean ca = false;
   public static hy sh;
   public static int bw = -1381008117;
   public static int ly;
   public static int pu;
   public static int wn;
   public static final PacketWriter in;
   static boolean bh = true;
   static boolean cu = false;
   static boolean cy = false;
   static boolean da = true;
   static boolean ej = true;
   static boolean ex;
   static boolean hb;
   static boolean ik;
   static boolean jv;
   static boolean ki;
   static boolean ln;
   static boolean lz;
   static boolean md;
   static boolean mj;
   static boolean mx;
   static boolean nb;
   static boolean nt;
   static boolean ol;
   static boolean om;
   static boolean ov;
   static boolean oz;
   static boolean pn;
   static boolean po;
   static boolean pq;
   static boolean px;
   static boolean ro;
   static boolean tf;
   static boolean ub;
   static boolean uc;
   static boolean ud;
   static boolean uj;
   static boolean uk;
   static boolean[] no;
   static boolean[] ox;
   static boolean[] rf;
   static boolean[] rm;
   static boolean[] rw;
   static boolean[] ue;
   static SoundEffect[] ti;
   static byte[] hf;
   static cf wg;
   static SecureRandomFuture hq;
   static Npc[] iu;
   static dj em;
   static dj ew;
   static Player[] mc;
   static fj[] sg;
   static fp gh;
   static gj[] so;
   static he si;
   static CollisionMap[] jr;
   static int ce = 0;
   static int cg = 240023661;
   static int cl = 1581503853;
   static int cr = -2133726699;
   static int cs = 0;
   static int cx = 322247329;
   static int dw = 0;
   static int ea = 0;
   static int eb = 0;
   static int ed = 0;
   static int ef = -824333519;
   static int eg = 0;
   static int el = 0;
   static int en = 0;
   static int ep = 0;
   static int er = 0;
   static int es = 0;
   static int et = 791348693;
   static int eu = 0;
   static int fi;
   static int fo;
   static int fp;
   static int ga;
   static int ge;
   static int gj;
   static int gt;
   static int gu;
   static int ig;
   static int ii;
   static int iw;
   static int ja;
   static int je;
   static int jk;
   static int jo;
   static int jq;
   static int jx;
   static int kf;
   static int kj;
   static int kk;
   static int km;
   static int kn;
   static int ko;
   static int kp;
   static int kq;
   static int ks;
   static int kw;
   static int kz;
   static int la;
   static int lc;
   static int ld;
   static int li;
   static int lk;
   static int lm;
   static int lp;
   static int lq;
   static int lt;
   static int lu;
   static int lv;
   static int ma;
   static int mb;
   static int me;
   static int mg;
   static int mk;
   static int mm;
   static int mo;
   static int mq;
   static int mu;
   static int mv;
   static int mw;
   static int mz;
   static int ne;
   static int nl;
   static int oa;
   static int oe;
   static int of;
   static int on;
   static int op;
   static int oq;
   static int or;
   static int oy;
   static int pb;
   static int pc;
   static int pd;
   static int ph;
   static int pi;
   static int pj;
   static int pk;
   static int pp;
   static int pt;
   static int pv;
   static int pw;
   static int py;
   static int qa;
   static int qb;
   static int qc;
   static int qd;
   static int qf;
   static int qg;
   static int qn;
   static int qq;
   static int qu;
   static int qv;
   static int qx;
   static int qy;
   static int qz;
   static int rd;
   static int rg;
   static int rr;
   static int rs;
   static int sf;
   static int sj;
   static int sm;
   static int sp;
   static int sr;
   static int su;
   static int te;
   static int th;
   static int tl;
   static int tp;
   static int tz;
   static int vd;
   static int vi;
   static int vp;
   static int vr;
   static int vu;
   static int vx;
   static int vy;
   static int wi;
   static int ws;
   static int wy;
   static int[] ih;
   static int[] iy;
   static int[] lb;
   static int[] le;
   static int[] lj;
   static int[] ll;
   static int[] lo;
   static int[] lw;
   static int[] lx;
   static int[] ng;
   static int[] nh;
   static int[] ni;
   static int[] nk;
   static int[] nm;
   static int[] nq;
   static int[] nu;
   static int[] ny;
   static int[] nz;
   static int[] oi;
   static int[] qj;
   static int[] qr;
   static int[] qs;
   static int[] qt;
   static int[] ra;
   static int[] rb;
   static int[] rh;
   static int[] ri;
   static int[] sk;
   static int[] sy;
   static int[] sz;
   static int[] tb;
   static int[] tg;
   static int[] tr;
   static int[] tu;
   static int[] tw;
   static int[] ty;
   static int[] vf;
   static int[] vg;
   static int[] vq;
   static int[] vw;
   static int[] xm;
   static int[] xn;
   static int[][] mt;
   static int[][][] jh;
   static String it;
   static String ob;
   static String oj;
   static String ss;
   static String[] lr;
   static String[] nd;
   static String[] og;
   static String[] ok;
   static ArrayList we;
   static HashMap im;
   static List wz;
   static EvictingDualNodeHashTable wq;
   static EvictingDualNodeHashTable ww;
   static long eo = 3648848592458615261L;
   static long ez = -2560228884295272563L;
   static long mn;
   static long rj;
   static long sc;
   static long[] st;
   static Component pf;
   static Component pg;
   static Component pr;
   static Component ps;
   static Component pz;
   static StudioGame cc;
   static PlayerAppearance vh;
   static GrandExchangeOffer[] vs;
   static NodeDeque na;
   static NodeDeque nn;
   static NodeDeque np;
   static NodeDeque re;
   static NodeDeque rp;
   static NodeDeque rq;
   static NodeDeque rt;
   static NodeDeque[][][] nr;
   static Timer ie;
   static pk wx;
   static NodeHashTable oc;
   static NodeHashTable rv;
   static rf ua;
   static rf uz;
   static rm ui;
   static PlatformInfoProvider vc;
   static short va;
   static short ve;
   static short vk;
   static short vl;
   static short vm;
   static short vn;
   static short vo;
   static short vv;
   static sr gy;
   static Rasterizer3D[] ts;
   static tz rl;
   static final cm xr;
   static final int[] jy;
   static final int[] ns;
   static final String hd;
   ag gl;
   al hp;
   am gz;
   am hm;
   boolean hj = false;
   OtlTokenRequester hw;
   RefreshAccessTokenRequester hu;
   String gx;
   Future hi;
   Future hx;
   long he = -714003291813872507L;
   Packet ha;

   public static void af_renamed(AbstractArchive var0, AbstractArchive var1) {
      IDKType.af = var0;
      IDKType.an = var1;
      IDKType.aw = IDKType.af.cq(3) * 1501460151;
   }

   static {
      em = dj.ac;
      ew = dj.ac;
      ex = false;
      fi = 0;
      fp = 0;
      fo = 0;
      gj = 0;
      ge = 0;
      ga = 0;
      gt = 0;
      gu = 0;
      gh = fp.aw;
      gy = sr.af;
      hd = WorldMapSectionType.af_renamed(PlayerAppearance.af_renamed("com_jagex_auth_desktop_osrs:public", (byte)-35));
      hb = false;
      hq = new SecureRandomFuture();
      hf = null;
      iu = new Npc[65536];
      iw = 0;
      iy = new int[65536];
      ig = 0;
      ih = new int[250];
      in = new PacketWriter();
      ii = 0;
      ik = false;
      ie = new Timer();
      im = new HashMap();
      jx = 0;
      jo = -1903772507;
      jk = 0;
      jq = -1711800473;
      je = 0;
      jr = new CollisionMap[4];
      jv = false;
      jh = new int[4][13][13];
      jy = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
      ja = 0;
      kq = 914788991;
      kw = -384526119;
      kk = -33923405;
      kj = -2102998740;
      ki = false;
      ko = 0;
      kp = 64984960;
      kf = 0;
      ks = 0;
      kn = 0;
      kz = 0;
      km = 0;
      lv = 0;
      lm = -666725754;
      li = 0;
      lu = 0;
      lk = 0;
      la = 682934636;
      lp = -793681942;
      ly = 0;
      ln = false;
      lt = 0;
      lz = false;
      lc = 0;
      ld = 0;
      lq = -763960690;
      lj = new int[lq * 1025553311];
      ll = new int[lq * 1025553311];
      le = new int[1025553311 * lq];
      lb = new int[1025553311 * lq];
      lx = new int[1025553311 * lq];
      lo = new int[lq * 1025553311];
      lw = new int[1025553311 * lq];
      lr = new String[lq * 1025553311];
      mt = new int[104][104];
      mw = 0;
      mz = 846498395;
      mu = 1610031701;
      mq = 0;
      mm = 0;
      me = 0;
      mv = 0;
      mx = true;
      ma = 0;
      mj = true;
      mc = new Player[2048];
      mg = -255869677;
      mo = 0;
      mn = -1369385558963036297L;
      md = true;
      mk = 0;
      mb = 0;
      nz = new int[1000];
      ns = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
      nd = new String[8];
      no = new boolean[8];
      nm = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
      nl = -1035820595;
      nr = new NodeDeque[4][104][104];
      nn = new NodeDeque();
      na = new NodeDeque();
      np = new NodeDeque();
      ng = new int[25];
      ny = new int[25];
      nu = new int[25];
      nb = false;
      nt = false;
      ne = 0;
      nk = new int[500];
      ni = new int[500];
      nh = new int[500];
      nq = new int[500];
      oi = new int[500];
      og = new String[500];
      ok = new String[500];
      ox = new boolean[500];
      ov = false;
      ol = false;
      oz = true;
      of = -563689483;
      oy = -2111961447;
      oe = 0;
      on = -315612066;
      oq = 0;
      it = null;
      om = false;
      oa = 1204907975;
      op = -35668549;
      oj = null;
      ob = null;
      or = 32945189;
      oc = new NodeHashTable(8);
      pc = 0;
      pp = 757532791;
      py = 0;
      pg = null;
      pk = 0;
      pj = 0;
      pu = 0;
      pt = 1296642255;
      po = false;
      ps = null;
      pr = null;
      pf = null;
      pd = 0;
      pw = 0;
      pz = null;
      pq = false;
      pi = 1150287901;
      pb = -68006725;
      px = false;
      ph = -463567197;
      pv = -551918419;
      pn = false;
      qu = -1340429835;
      qr = new int[32];
      qx = 0;
      qj = new int[32];
      qc = 0;
      qs = new int[32];
      qf = 0;
      qt = new int[32];
      qn = 0;
      qb = 0;
      qg = 0;
      qd = 0;
      qy = 0;
      qz = 0;
      qq = 0;
      qv = 0;
      qa = 0;
      rd = 0;
      rl = new tz();
      rq = new NodeDeque();
      rt = new NodeDeque();
      rp = new NodeDeque();
      re = new NodeDeque();
      rv = new NodeHashTable(512);
      rr = 0;
      rs = -769599022;
      rf = new boolean[100];
      rm = new boolean[100];
      rw = new boolean[100];
      rh = new int[100];
      rb = new int[100];
      ra = new int[100];
      ri = new int[100];
      rg = 0;
      rj = 0L;
      ro = true;
      sy = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
      sj = 0;
      su = 0;
      ss = "";
      st = new long[100];
      sf = 0;
      sh = new hy();
      si = new he();
      sm = 0;
      sk = new int[128];
      sz = new int[128];
      sc = -4061967902176514943L;
      sg = new fj[4];
      so = new gj[4];
      sp = 1715437485;
      sr = 0;
      tw = new int[1000];
      ty = new int[1000];
      ts = new Rasterizer3D[1000];
      te = 0;
      th = 0;
      tp = 0;
      tz = -1225072817;
      tf = false;
      tl = 0;
      tu = new int[50];
      tr = new int[50];
      tg = new int[50];
      tb = new int[50];
      ti = new SoundEffect[50];
      uj = false;
      ub = false;
      uc = false;
      ud = false;
      ui = null;
      ua = null;
      uz = null;
      uk = false;
      ue = new boolean[5];
      vq = new int[5];
      vw = new int[5];
      vf = new int[5];
      vg = new int[5];
      vv = 256;
      va = 205;
      vl = 256;
      ve = 320;
      vm = 1;
      vn = 32767;
      vo = 1;
      vk = 32767;
      vd = 0;
      vx = 0;
      vp = 0;
      vy = 0;
      vi = 0;
      vh = new PlayerAppearance();
      vr = 962307691;
      vu = 929779017;
      vc = new DesktopPlatformInfoProvider();
      vs = new GrandExchangeOffer[8];
      wg = new cf();
      wx = new pk(8, py.af);
      wq = new EvictingDualNodeHashTable(64);
      ww = new EvictingDualNodeHashTable(64);
      wi = -978308099;
      wn = -595673725;
      wz = new ArrayList();
      we = new ArrayList(10);
      wy = 0;
      ws = 0;
      xr = new cm();
      xm = new int[50];
      xn = new int[50];
   }

   protected final void ba() {
   }

   public final void init() {
      if (this.checkHost()) {
         int var3;
         for(int var1 = 0; var1 <= 28; ++var1) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (null != var2) {
               switch (var1) {
                  case 3:
                     if (var2.equalsIgnoreCase(Formatting.af)) {
                        ca = true;
                     } else {
                        ca = false;
                     }
                     break;
                  case 4:
                     if (cg * -749752677 == -1) {
                        cg = Integer.parseInt(var2) * -240023661;
                     }
                     break;
                  case 5:
                     ce = Integer.parseInt(var2) * 1294598713;
                     break;
                  case 6:
                     fj.ck = Language.aq_renamed(Integer.parseInt(var2), (byte)-1);
                     break;
                  case 7:
                     iq.ci = fv.af_renamed(Integer.parseInt(var2));
                     break;
                  case 8:
                     if (var2.equalsIgnoreCase(Formatting.af)) {
                     }
                     break;
                  case 9:
                     ef.cm = var2;
                     break;
                  case 10:
                     cc = (StudioGame)StructType.findEnumerated(TaskHandler.au_renamed(), Integer.parseInt(var2));
                     if (cc == StudioGame.ab) {
                        co.cn = LoginType.af;
                     } else {
                        co.cn = LoginType.at;
                     }
                     break;
                  case 11:
                     ix.hv = var2;
                     break;
                  case 12:
                     bw = Integer.parseInt(var2) * -1381008117;
                  case 13:
                  case 16:
                  case 18:
                  case 19:
                  case 20:
                  case 22:
                  case 23:
                  case 24:
                  default:
                     break;
                  case 14:
                     TriBool.cf = Integer.parseInt(var2) * -447901147;
                     break;
                  case 15:
                     cs = Integer.parseInt(var2) * -261185633;
                     break;
                  case 17:
                     GrandExchangeOffer.cq = var2;
                     break;
                  case 21:
                     cl = Integer.parseInt(var2) * -1581503853;
                     break;
                  case 25:
                     var3 = var2.indexOf(".");
                     if (var3 == -1) {
                        cx = Integer.parseInt(var2) * -1712441187;
                     } else {
                        cx = Integer.parseInt(var2.substring(0, var3)) * -1712441187;
                        Integer.parseInt(var2.substring(1 + var3));
                     }
               }
            }
         }

         Scene.af = false;
         cu = false;
         ea.gd = this.getCodeBase().getHost();
         String var16 = iq.ci.au;
         byte var17 = 0;

         try {
            gc.ab = -327637298;
            gc.ah = var17 * 261077081;

            try {
               ne.ak = System.getProperty("os.name");
            } catch (Exception var14) {
               ne.ak = "Unknown";
            }

            WorldMapSectionType.aj = ne.ak.toLowerCase();

            try {
               hd.az = System.getProperty("user.home");
               if (null != hd.az) {
                  hd.az = hd.az + "/";
               }
            } catch (Exception var13) {
            }

            try {
               if (WorldMapSectionType.aj.startsWith("win")) {
                  if (hd.az == null) {
                     hd.az = System.getenv("USERPROFILE");
                  }
               } else if (hd.az == null) {
                  hd.az = System.getenv("HOME");
               }

               if (null != hd.az) {
                  hd.az = hd.az + "/";
               }
            } catch (Exception var12) {
            }

            if (hd.az == null) {
               hd.az = "~/";
            }

            fe.av = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", hd.az, "/tmp/", ""};
            Formatting.ar = new String[]{".jagex_cache_" + -1325133847 * gc.ah, ".file_store_" + -1325133847 * gc.ah};

            label154:
            for(var3 = 0; var3 < 4; ++var3) {
               my.au = fj.af_renamed("oldschool", var16, var3);
               if (!my.au.exists()) {
                  my.au.mkdirs();
               }

               File[] var4 = my.au.listFiles();
               if (null == var4) {
                  break;
               }

               File[] var5 = var4;
               int var6 = 0;

               while(true) {
                  if (var6 >= var5.length) {
                     break label154;
                  }

                  File var7 = var5[var6];

                  boolean var8;
                  try {
                     RandomAccessFile var9 = new RandomAccessFile(var7, "rw");
                     int var10 = var9.read();
                     var9.seek(0L);
                     var9.write(var10);
                     var9.seek(0L);
                     var9.close();
                     var8 = true;
                  } catch (Exception var11) {
                     var8 = false;
                  }

                  if (!var8) {
                     break;
                  }

                  ++var6;
               }
            }

            File var18 = my.au;
            tl.an = var18;
            if (!tl.an.exists()) {
               throw new RuntimeException("");
            }

            gm.af = true;
            Tiles.aw_renamed();
            gc.ax = new BufferedFile(new AccessFile(fd.af_renamed("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            gc.ai = new BufferedFile(new AccessFile(fd.af_renamed("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            ol.ag = new BufferedFile[gc.ab * 1064766397];

            for(int var20 = 0; var20 < 1064766397 * gc.ab; ++var20) {
               ol.ag[var20] = new BufferedFile(new AccessFile(fd.af_renamed("main_file_cache.idx" + var20), "rw", 1048576L), 6000, 0);
            }
         } catch (Exception var15) {
            ob.af_renamed((String)null, var15);
         }

         ClientScriptFrame.bc = this;
         ClientError.au = cg * 1056936977;
         ne.gb = System.getenv("JX_ACCESS_TOKEN");
         Obj.gp = System.getenv("JX_REFRESH_TOKEN");
         SpriteMask.gn = System.getenv("JX_SESSION_ID");
         em.gv = System.getenv("JX_CHARACTER_ID");
         String var19 = System.getenv("JX_DISPLAY_NAME");
         cz.cy = bx.ac_renamed(var19);
         if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
            this.hj = true;
         }

         if (-1 == 838232771 * cr) {
            if (!this.gn() && !this.gv()) {
               cr = 0;
            } else {
               cr = 2078698903;
            }
         }

         this.ak(765, 503, 213, 1);
      }
   }

   public void setOtlTokenRequester(OtlTokenRequester var1) {
      if (null != var1) {
         this.hw = var1;
         ee.ak_renamed(10);
      }
   }

   public void oq(OtlTokenRequester var1) {
      if (null != var1) {
         this.hw = var1;
         ee.ak_renamed(10);
      }
   }

   public void on(OtlTokenRequester var1) {
      if (null != var1) {
         this.hw = var1;
         ee.ak_renamed(10);
      }
   }

   public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
      if (var1 != null) {
         this.hu = var1;
      }
   }

   public void om(RefreshAccessTokenRequester var1) {
      if (var1 != null) {
         this.hu = var1;
      }
   }

   public void ow(RefreshAccessTokenRequester var1) {
      if (var1 != null) {
         this.hu = var1;
      }
   }

   public boolean isOnLoginScreen() {
      return dw * -1275976559 == 10;
   }

   public boolean oa() {
      return dw * -1275976559 == 10;
   }

   public boolean ou() {
      return dw * 162401290 == 10;
   }

   public long getAccountHash() {
      return -7932717541542796365L * this.he;
   }

   public long op() {
      return -7932717541542796365L * this.he;
   }

   public long oj() {
      return -7932717541542796365L * this.he;
   }

   public long oo() {
      return -7932717541542796365L * this.he;
   }

   boolean gn() {
      return null != ne.gb && !ne.gb.trim().isEmpty() && Obj.gp != null && !Obj.gp.trim().isEmpty();
   }

   boolean gv() {
      return null != SpriteMask.gn && !SpriteMask.gn.trim().isEmpty() && null != em.gv && !em.gv.trim().isEmpty();
   }

   boolean gx() {
      return null != this.hw;
   }

   void gl(String var1) throws IOException {
      HashMap var3 = new HashMap();
      var3.put("grant_type", "refresh_token");
      var3.put("scope", "gamesso.token.create");
      var3.put("refresh_token", var1);
      URL var4 = new URL(ix.hv + "shield/oauth/token" + (new qa(var3)).au());
      pc var5 = new pc();
      var5.ab(hd);
      var5.aw("Host", (new URL(ix.hv)).getHost());
      var5.aa(qz.af);
      aa var6 = aa.af;
      RefreshAccessTokenRequester var7 = this.hu;
      if (null != var7) {
         this.hx = var7.request(var6.ab(), var4, var5.an(), "");
      } else {
         ay var8 = new ay(var4, var6, var5, this.hj);
         this.hm = this.gl.an(var8);
      }
   }

   void gz(String var1) throws IOException {
      URL var3 = new URL(ix.hv + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
      pc var4 = new pc();
      var4.aq(var1);
      aa var5 = aa.an;
      OtlTokenRequester var6 = this.hw;
      if (null != var6) {
         this.hi = var6.request(var5.ab(), var3, var4.an(), "");
      } else {
         ay var7 = new ay(var3, var5, var4, this.hj);
         this.gz = this.gl.an(var7);
      }
   }

   void hw(String var1, String var2) throws IOException, JSONException {
      URL var4 = new URL(ix.hv + "/game-session/v1/tokens");
      ay var5 = new ay(var4, aa.af, this.hj);
      var5.af().aq(var1);
      var5.af().aa(qz.af);
      JSONObject var6 = new JSONObject();
      var6.put("accountId", (Object)var2);
      var5.an(new qv(var6));
      this.gz = this.gl.an(var5);
   }

   protected final void bm() {
      fl.af_renamed(new int[]{20, 260, 10000}, new int[]{1000, 100, 500});
      ClanChat.gw = (0 == -1274626977 * cs ? 'ꩊ' : '鱀' + -453810525 * bw) * -1326916691;
      ec.gc = -1927102761 * (0 == cs * -1274626977 ? 443 : '썐' + -453810525 * bw);
      Inventory.gf = 518729065 * ClanChat.gw;
      PlayerAppearance.ay = mu.af;
      PlayerAppearance.ao = mu.an;
      WorldMapIcon1.ax = mu.aw;
      qv.ai = mu.ac;
      ag.iq = new ef(this.hj, 213);
      this.ai();
      this.av();
      ex.rk = this.mouseWheel();
      this.ah(si, 0);
      this.ah(sh, 1);
      kb.wh = new ArchiveDisk(255, gc.ax, gc.ai, 500000);
      aj.vb = he.readClientPreferences();
      this.setUpClipboard();
      String var3 = ReflectionCheck.bj;
      bx.af = this;
      if (var3 != null) {
         bx.an = var3;
      }

      Decimator.ir_renamed(aj.vb.bi());
      World.vt = new FriendSystem(co.cn);
      this.gl = new ag("tokenRequest", 1, 1);
   }

   protected final void bd() {
      ep += -310720817;
      this.hj();

      while(true) {
         ArchiveDiskAction var2;
         synchronized(ArchiveDiskActionHandler.af) {
            var2 = (ArchiveDiskAction)ArchiveDiskActionHandler.an.removeLast();
         }

         if (null == var2) {
            int var9;
            try {
               if (1 == ly.au * 926096579) {
                  var9 = sa.ac.size();
                  if (var9 > 0 && sa.ac.isReady()) {
                     var9 -= -1128553755 * ga.aa;
                     if (var9 < 0) {
                        var9 = 0;
                     }

                     sa.ac.advance(var9);
                  } else {
                     sa.ac.ao();
                     sa.ac.removeAll();
                     if (ly.ab != null) {
                        ly.au = -1253644330;
                     } else {
                        ly.au = 0;
                     }

                     ia.ao = null;
                     ly.ax = null;
                  }
               }
            } catch (Exception var8) {
               var8.printStackTrace();
               sa.ac.ao();
               ly.au = 0;
               ia.ao = null;
               ly.ax = null;
               ly.ab = null;
            }

            mj.hz_renamed();
            sh.ai();
            this.ag();
            synchronized(MouseHandler.ac) {
               MouseHandler.aa = MouseHandler.ab * 908499211;
               MouseHandler.ay = 1068258211 * MouseHandler.aq;
               MouseHandler.ao = -1918688485 * MouseHandler.al;
               MouseHandler.ax = MouseHandler.at * -4029881570118555541L;
               MouseHandler.ar = MouseHandler.ai * 199219569;
               MouseHandler.am = MouseHandler.ag * -1850432819;
               MouseHandler.as = MouseHandler.ah * -1699120075;
               MouseHandler.aj = 3548908311918388543L * MouseHandler.av;
               MouseHandler.ai = 0;
            }

            if (ex.rk != null) {
               var9 = ex.rk.useRotation();
               rd = var9 * 1644925127;
            }

            if (dw * -1275976559 == 0) {
               DevicePcmPlayerProvider.hs_renamed();
               Npc.bz_renamed();
            } else if (dw * -1275976559 == 5) {
               EnumType.ab_renamed(this, Language.ir, WallDecoration.io);
               DevicePcmPlayerProvider.hs_renamed();
               Npc.bz_renamed();
            } else if (10 != -1275976559 * dw && 11 != -1275976559 * dw) {
               if (-1275976559 * dw == 20) {
                  EnumType.ab_renamed(this, Language.ir, WallDecoration.io);
                  this.doCycleLoggedOut();
               } else if (dw * -1275976559 == 50) {
                  EnumType.ab_renamed(this, Language.ir, WallDecoration.io);
                  this.doCycleLoggedOut();
               } else if (dw * -1275976559 == 25) {
                  bb.jh_renamed();
               }
            } else {
               EnumType.ab_renamed(this, Language.ir, WallDecoration.io);
            }

            if (-1275976559 * dw == 30) {
               this.hq();
            } else if (40 == dw * -1275976559 || -1275976559 * dw == 45) {
               this.doCycleLoggedOut();
            }

            return;
         }

         var2.ac.load(var2.aw, (int)var2.hr, var2.an, false);
      }
   }

   protected final void draw(boolean var1) {
      boolean var3;
      label176: {
         try {
            if (926096579 * ly.au == 2) {
               if (ia.ao == null) {
                  ia.ao = MusicTrack.readTrack(ly.ab, oq.aq * -747672747, gz.al * 1412530625);
                  if (ia.ao == null) {
                     var3 = false;
                     break label176;
                  }
               }

               if (null == ly.ax) {
                  ly.ax = new SoundCache(ly.aw, ly.an);
               }

               if (sa.ac.loadMusicTrack(ia.ao, ly.af, ly.ax, 22050)) {
                  sa.ac.clearAll();
                  sa.ac.advance(-280777997 * dn.at);
                  sa.ac.setMusicTrack(ia.ao, ev.ay);
                  ly.au = 0;
                  ia.ao = null;
                  ly.ax = null;
                  ly.ab = null;
                  var3 = true;
                  break label176;
               }
            }
         } catch (Exception var6) {
            var6.printStackTrace();
            sa.ac.ao();
            ly.au = 0;
            ia.ao = null;
            ly.ax = null;
            ly.ab = null;
         }

         var3 = false;
      }

      if (var3 && tf && null != bi.to) {
         bi.to.ad();
      }

      if ((-1275976559 * dw == 10 || -1275976559 * dw == 20 || 30 == dw * -1275976559) && -3223439394100928671L * rj != 0L && Formatting.af_renamed() > -3223439394100928671L * rj) {
         Decimator.ir_renamed(na.iv_renamed());
      }

      int var5;
      if (var1) {
         for(var5 = 0; var5 < 100; ++var5) {
            rf[var5] = true;
         }
      }

      if (-1275976559 * dw == 0) {
         this.drawInitial(1158424865 * cz.ad, cz.ae, var1);
      } else if (5 == dw * -1275976559) {
         aq.drawTitle(fx.ip, Language.ir, WallDecoration.io);
      } else if (dw * -1275976559 != 10 && -1275976559 * dw != 11) {
         if (-1275976559 * dw == 20) {
            aq.drawTitle(fx.ip, Language.ir, WallDecoration.io);
         } else if (dw * -1275976559 == 50) {
            aq.drawTitle(fx.ip, Language.ir, WallDecoration.io);
         } else if (25 == dw * -1275976559) {
            if (1 == je * -2139010133) {
               if (jx * -215929647 > jo * 817023789) {
                  jo = jx * 1957781173;
               }

               var5 = (jo * -2098483510 - jx * 2088419538) / (jo * 817023789);
               jl.ij_renamed(Strings.ao + Formatting.aq + Formatting.ac + var5 + "%" + Formatting.au, false);
            } else if (-2139010133 * je == 2) {
               if (jk * 1372828241 > jq * 1233759319) {
                  jq = 1072852375 * jk;
               }

               var5 = (jq * 1558423806 - -78064686 * jk) / (jq * 1233759319) + 50;
               jl.ij_renamed(Strings.ao + Formatting.aq + Formatting.ac + var5 + "%" + Formatting.au, false);
            } else {
               jl.ij_renamed(Strings.ao, false);
            }
         } else if (dw * -1275976559 == 30) {
            this.drawLoggedIn();
         } else if (40 == dw * -1275976559) {
            jl.ij_renamed(Strings.ax + Formatting.aq + Strings.ai, false);
         } else if (45 == dw * -1275976559) {
            jl.ij_renamed(Strings.gi, false);
         }
      } else {
         aq.drawTitle(fx.ip, Language.ir, WallDecoration.io);
      }

      if (-1275976559 * dw == 30 && 0 == rg * -1928160607 && !var1 && !ro) {
         for(var5 = 0; var5 < -356793645 * rr; ++var5) {
            if (rm[var5]) {
               ia.bn.draw(rh[var5], rb[var5], ra[var5], ri[var5]);
               rm[var5] = false;
            }
         }
      } else if (dw * -1275976559 > 0) {
         ia.bn.drawFull(0, 0);

         for(var5 = 0; var5 < rr * -356793645; ++var5) {
            rm[var5] = false;
         }
      }

   }

   protected final void kill0() {
      if (oy.qo.hasUnwrittenChanges()) {
         oy.qo.at();
      }

      if (null != eg.eq) {
         eg.eq.af = false;
      }

      eg.eq = null;
      in.au();
      GraphicsObject.an_renamed();
      ex.rk = null;
      if (bi.to != null) {
         bi.to.ae((byte)-1);
      }

      if (hd.tt != null) {
         hd.tt.ae((byte)-1);
      }

      la.ab_renamed();
      fw.ac_renamed();
      if (ag.iq != null) {
         ag.iq.ab();
         ag.iq = null;
      }

      try {
         gc.ax.close();

         for(int var2 = 0; var2 < gc.ab * 1064766397; ++var2) {
            ol.ag[var2].close();
         }

         gc.ai.close();
         gc.ao.close();
      } catch (Exception var3) {
      }

      this.gl.aw();
   }

   void hj() {
      if (1000 != -1275976559 * dw) {
         boolean var2 = Tile.af_renamed();
         if (!var2) {
            this.doCycleJs5Connect();
         }

      }
   }

   void doCycleJs5Connect() {
      if (1551453085 * NetCache.ae >= 4) {
         this.error("js5crc");
         fd.hi_renamed(1000);
      } else {
         if (-1386597723 * NetCache.ap >= 4) {
            if (dw * -1275976559 <= 5) {
               this.error("js5io");
               fd.hi_renamed(1000);
               return;
            }

            fo = 1891795480;
            NetCache.ap = -483971193;
         }

         if ((fo -= -185484651) * -95141699 + 1 <= 0) {
            try {
               if (fp * -1348062367 == 0) {
                  WorldMapSection0.fh = af.newSocketTask(ea.gd, Inventory.gf * -1275160227);
                  fp += 1300738209;
               }

               if (-1348062367 * fp == 1) {
                  if (2 == WorldMapSection0.fh.ac) {
                     this.js5Error(-1);
                     return;
                  }

                  if (WorldMapSection0.fh.ac == 1) {
                     fp += 1300738209;
                  }
               }

               if (2 == -1348062367 * fp) {
                  IDKType.fl = hu.af_renamed((Socket)WorldMapSection0.fh.al, 40000, 5000);
                  Packet var2 = new Packet(5);
                  var2.bu(15);
                  var2.ba(213);
                  IDKType.fl.ab(var2.al, 0, 5);
                  fp += 1300738209;
                  fi.fx = Formatting.af_renamed() * -51531514477814883L;
               }

               if (fp * -1348062367 == 3) {
                  if (IDKType.fl.aw() > 0) {
                     int var10 = IDKType.fl.ac();
                     if (var10 != 0) {
                        this.js5Error(var10);
                        return;
                     }

                     fp += 1300738209;
                  } else if (Formatting.af_renamed() - fi.fx * 4041510135797154485L > 30000L) {
                     this.js5Error(-2);
                     return;
                  }
               }

               if (-1348062367 * fp == 4) {
                  AbstractSocket var11 = IDKType.fl;
                  boolean var3 = dw * -1275976559 > 20;
                  if (NetCache.af != null) {
                     try {
                        NetCache.af.aq();
                     } catch (Exception var8) {
                     }

                     NetCache.af = null;
                  }

                  NetCache.af = var11;
                  gn.an_renamed(var3);
                  NetCache.ag.at = 0;
                  ClientScript.ai = null;
                  NetCache.ah = null;
                  NetCache.av = 0;

                  while(true) {
                     NetFileRequest var4 = (NetFileRequest)NetCache.ab.first();
                     if (var4 == null) {
                        while(true) {
                           var4 = (NetFileRequest)NetCache.ay.first();
                           if (var4 == null) {
                              if (NetCache.ad != 0) {
                                 try {
                                    Packet var12 = new Packet(4);
                                    var12.bu(4);
                                    var12.bu(NetCache.ad);
                                    var12.p2(0);
                                    NetCache.af.ab(var12.al, 0, 4);
                                 } catch (IOException var7) {
                                    try {
                                       NetCache.af.aq();
                                    } catch (Exception var6) {
                                    }

                                    NetCache.ap += -161323731;
                                    NetCache.af = null;
                                 }
                              }

                              NetCache.an = 0;
                              NetCache.aw = Formatting.af_renamed() * -6047020038529116697L;
                              WorldMapSection0.fh = null;
                              IDKType.fl = null;
                              fp = 0;
                              gj = 0;
                              return;
                           }

                           NetCache.al.addLast(var4);
                           NetCache.at.put(var4, var4.hr);
                           NetCache.aa += -2069940741;
                           NetCache.ao -= -979537415;
                        }
                     }

                     NetCache.ac.put(var4, var4.hr);
                     NetCache.au += -1320339335;
                     NetCache.aq -= -1677618233;
                  }
               }
            } catch (IOException var9) {
               this.js5Error(-3);
            }

         }
      }
   }

   void js5Error(int var1) {
      WorldMapSection0.fh = null;
      IDKType.fl = null;
      fp = 0;
      if (1119961125 * ClanChat.gw == -1275160227 * Inventory.gf) {
         Inventory.gf = 293228307 * ec.gc;
      } else {
         Inventory.gf = 518729065 * ClanChat.gw;
      }

      gj += 1159129441;
      if (-1027638623 * gj < 2 || 7 != var1 && var1 != 9) {
         if (gj * -1027638623 >= 2 && 6 == var1) {
            this.error("js5connect_outofdate");
            fd.hi_renamed(1000);
         } else if (-1027638623 * gj >= 4) {
            if (dw * -1275976559 <= 5) {
               this.error("js5connect");
               fd.hi_renamed(1000);
            } else {
               fo = 1891795480;
            }
         }
      } else if (-1275976559 * dw <= 5) {
         this.error("js5connect_full");
         fd.hi_renamed(1000);
      } else {
         fo = 1891795480;
      }

   }

   final void doCycleLoggedOut() {
      AbstractSocket var2 = in.getSocket();
      PacketBit var3 = in.ab;

      try {
         if (0 == ge * 572310033) {
            if (gk.hz == null && (hq.isDone() || -1687986373 * ga > 250)) {
               gk.hz = hq.get();
               hq.shutdown();
               hq = null;
            }

            if (gk.hz != null) {
               if (var2 != null) {
                  var2.aq();
                  var2 = null;
               }

               an.is = null;
               ik = false;
               ga = 0;
               if (gy.au()) {
                  if (this.gn()) {
                     try {
                        this.gl(Obj.gp);
                        kz.og_renamed(21);
                     } catch (Throwable var20) {
                        ob.af_renamed((String)null, var20);
                        mu.hr_renamed(65);
                        return;
                     }
                  } else {
                     if (!this.gv()) {
                        mu.hr_renamed(65);
                        return;
                     }

                     try {
                        this.hw(SpriteMask.gn, em.gv);
                        kz.og_renamed(20);
                     } catch (Exception var19) {
                        ob.af_renamed((String)null, var19);
                        mu.hr_renamed(65);
                        return;
                     }
                  }
               } else {
                  kz.og_renamed(1);
               }
            }
         }

         aj var22;
         if (ge * 572310033 == 21) {
            if (this.hx != null) {
               if (!this.hx.isDone()) {
                  return;
               }

               if (this.hx.isCancelled()) {
                  mu.hr_renamed(65);
                  this.hx = null;
                  return;
               }

               try {
                  RefreshAccessTokenResponse var4 = (RefreshAccessTokenResponse)this.hx.get();
                  if (!var4.isSuccess()) {
                     mu.hr_renamed(65);
                     this.hx = null;
                     return;
                  }

                  ne.gb = var4.getAccessToken();
                  Obj.gp = var4.getRefreshToken();
                  this.hx = null;
               } catch (Exception var18) {
                  ob.af_renamed((String)null, var18);
                  mu.hr_renamed(65);
                  this.hx = null;
                  return;
               }
            } else {
               if (this.hm == null) {
                  mu.hr_renamed(65);
                  return;
               }

               if (!this.hm.ac()) {
                  return;
               }

               if (this.hm.aw()) {
                  ob.af_renamed(this.hm.an(), (Throwable)null);
                  mu.hr_renamed(65);
                  this.hm = null;
                  return;
               }

               var22 = this.hm.au();
               if (var22.af() != 200) {
                  mu.hr_renamed(65);
                  this.hm = null;
                  return;
               }

               ga = 0;
               qv var5 = new qv(var22.aw());

               try {
                  ne.gb = var5.aq().getString("access_token");
                  Obj.gp = var5.aq().getString("refresh_token");
               } catch (Exception var17) {
                  ob.af_renamed("Error parsing tokens", var17);
                  mu.hr_renamed(65);
                  this.hm = null;
                  return;
               }
            }

            this.gz(ne.gb);
            kz.og_renamed(20);
         }

         if (20 == ge * 572310033) {
            if (null != this.hi) {
               if (!this.hi.isDone()) {
                  return;
               }

               if (this.hi.isCancelled()) {
                  mu.hr_renamed(65);
                  this.hi = null;
                  return;
               }

               try {
                  OtlTokenResponse var23 = (OtlTokenResponse)this.hi.get();
                  if (!var23.isSuccess()) {
                     mu.hr_renamed(65);
                     this.hi = null;
                     return;
                  }

                  this.gx = var23.getToken();
                  this.hi = null;
               } catch (Exception var16) {
                  ob.af_renamed((String)null, var16);
                  mu.hr_renamed(65);
                  this.hi = null;
                  return;
               }
            } else {
               if (null == this.gz) {
                  mu.hr_renamed(65);
                  return;
               }

               if (!this.gz.ac()) {
                  return;
               }

               if (this.gz.aw()) {
                  ob.af_renamed(this.gz.an(), (Throwable)null);
                  mu.hr_renamed(65);
                  this.gz = null;
                  return;
               }

               var22 = this.gz.au();
               if (var22.af() != 200) {
                  ob.af_renamed("Response code: " + var22.af() + "Response body: " + var22.aw(), (Throwable)null);
                  mu.hr_renamed(65);
                  this.gz = null;
                  return;
               }

               List var25 = (List)var22.an().get("Content-Type");
               if (null != var25 && var25.contains(qz.af.af())) {
                  try {
                     JSONObject var6 = new JSONObject(var22.aw());
                     this.gx = var6.getString("token");
                  } catch (JSONException var15) {
                     ob.af_renamed((String)null, var15);
                     mu.hr_renamed(65);
                     this.gz = null;
                     return;
                  }
               } else {
                  this.gx = var22.aw();
               }

               this.gz = null;
            }

            ga = 0;
            kz.og_renamed(1);
         }

         if (572310033 * ge == 1) {
            if (null == an.is) {
               an.is = af.newSocketTask(ea.gd, Inventory.gf * -1275160227);
            }

            if (an.is.ac == 2) {
               throw new IOException();
            }

            if (1 == an.is.ac) {
               var2 = hu.af_renamed((Socket)an.is.al, 40000, 5000);
               in.setSocket(var2);
               an.is = null;
               kz.og_renamed(2);
            }
         }

         PacketBitNode var24;
         if (ge * 572310033 == 2) {
            in.af();
            var24 = sh.aw_renamed();
            var24.aw.bu(537668749 * LoginProt.af.aq);
            in.aw(var24);
            in.an();
            var3.at = 0;
            kz.og_renamed(3);
         }

         int var27;
         if (3 == ge * 572310033) {
            if (null != bi.to) {
               bi.to.az();
            }

            if (null != hd.tt) {
               hd.tt.az();
            }

            if (var2.an(1)) {
               var27 = var2.ac();
               if (null != bi.to) {
                  bi.to.az();
               }

               if (null != hd.tt) {
                  hd.tt.az();
               }

               if (var27 != 0) {
                  mu.hr_renamed(var27);
                  return;
               }

               var3.at = 0;
               kz.og_renamed(4);
            }
         }

         if (572310033 * ge == 4) {
            if (var3.at * -1633313603 < 8) {
               var27 = var2.aw();
               if (var27 > 8 - var3.at * -1633313603) {
                  var27 = 8 - var3.at * -1633313603;
               }

               if (var27 > 0) {
                  var2.au(var3.al, -1633313603 * var3.at, var27);
                  var3.at += var27 * -1516355947;
               }
            }

            if (8 == var3.at * -1633313603) {
               var3.at = 0;
               GrandExchangeEvent.il = var3.g8s() * 6538327643922962445L;
               kz.og_renamed(5);
            }
         }

         int var7;
         if (5 == 572310033 * ge) {
            in.ab.at = 0;
            in.af();
            PacketBit var33 = new PacketBit(500);
            int[] var26 = new int[]{gk.hz.nextInt(), gk.hz.nextInt(), gk.hz.nextInt(), gk.hz.nextInt()};
            var33.at = 0;
            var33.bu(1);
            var33.ba(var26[0]);
            var33.ba(var26[1]);
            var33.ba(var26[2]);
            var33.ba(var26[3]);
            var33.p8s(7290179413469624005L * GrandExchangeEvent.il);
            if (dw * -1275976559 == 40) {
               var33.ba(Huffman.hk[0]);
               var33.ba(Huffman.hk[1]);
               var33.ba(Huffman.hk[2]);
               var33.ba(Huffman.hk[3]);
            } else {
               if (50 == dw * -1275976559) {
                  var33.bu(fp.au.ordinal());
                  var33.ba(ByteArrayPool.ck * -431815809);
               } else {
                  var33.bu(gh.ordinal());
                  switch (gh.ab * 1915854149) {
                     case 0:
                        var33.at += -1770456492;
                        break;
                     case 1:
                     case 3:
                        var33.bq(1750214827 * hp.ct);
                        var33.at += -1516355947;
                        break;
                     case 2:
                        var33.ba(aj.vb.bx(cz.ca));
                  }
               }

               if (gy.au()) {
                  var33.bu(sr.an.ordinal());
                  var33.bh(this.gx);
               } else {
                  var33.bu(sr.af.ordinal());
                  var33.bh(cz.cu);
               }
            }

            var33.rsaEncrypt(co.af, co.an);
            Huffman.hk = var26;
            PacketBitNode var29 = sh.aw_renamed();
            var29.aw.at = 0;
            if (40 == dw * -1275976559) {
               var29.aw.bu(537668749 * LoginProt.ac.aq);
            } else {
               var29.aw.bu(537668749 * LoginProt.aw.aq);
            }

            var29.aw.p2(0);
            var7 = var29.aw.at * -1633313603;
            var29.aw.ba(213);
            var29.aw.ba(1);
            var29.aw.bu(cg * -749752677);
            var29.aw.bu(cr * 838232771);
            byte var8 = 0;
            var29.aw.bu(var8);
            var29.aw.cs(var33.al, 0, var33.at * -1633313603);
            int var9 = var29.aw.at * -1633313603;
            var29.aw.bh(cz.ca);
            var29.aw.bu((ro ? 1 : 0) << 1 | (cu ? 1 : 0));
            var29.aw.p2(aj * -1687260435);
            var29.aw.p2(1658005443 * kd.ak);
            oa.nj_renamed(var29.aw);
            var29.aw.bh(ef.cm);
            var29.aw.ba(1640118701 * TriBool.cf);
            Packet var10 = new Packet(en.vz.size());
            en.vz.write(var10);
            var29.aw.cs(var10.al, 0, var10.al.length);
            var29.aw.bu(cg * -749752677);
            var29.aw.ba(0);
            var29.aw.el(DevicePcmPlayerProvider.fd.bk * -159523507);
            var29.aw.el(-159523507 * nt.fu.bk);
            var29.aw.p4ME(nn.fy.bk * -159523507);
            var29.aw.p4LE16(rr.fv.bk * -159523507);
            var29.aw.p4ME(-159523507 * ey.fm.bk);
            var29.aw.p4LE16(-159523507 * NetFileRequest.fc.bk);
            var29.aw.ba(pj.fw.bk * -159523507);
            var29.aw.p4LE16(dk.fn.bk * -159523507);
            var29.aw.p4LE16(dk.fz.bk * -159523507);
            var29.aw.p4ME(-159523507 * bi.ft.bk);
            var29.aw.p4LE16(-159523507 * id.fk.bk);
            var29.aw.el(ei.fg.bk * -159523507);
            var29.aw.el(WorldMapLabelSize.fq.bk * -159523507);
            var29.aw.p4LE16(-159523507 * FloorUnderlayType.fr.bk);
            var29.aw.p4ME(-159523507 * gw.go.bk);
            var29.aw.p4LE16(-159523507 * hc.ff.bk);
            var29.aw.p4LE16(-159523507 * ServerBuild.fb.bk);
            var29.aw.el(-159523507 * he.gr.bk);
            var29.aw.el(0);
            var29.aw.p4ME(-159523507 * qc.fa.bk);
            var29.aw.el(ey.fj.bk * -159523507);
            var29.aw.tinyKeyEncrypt(var26, var9, -1633313603 * var29.aw.at);
            var29.aw.ca(var29.aw.at * -1633313603 - var7);
            in.aw(var29);
            in.an();
            in.au = new Isaac(var26);
            int[] var11 = new int[4];

            for(int var12 = 0; var12 < 4; ++var12) {
               var11[var12] = 50 + var26[var12];
            }

            var3.newIsaac(var11);
            kz.og_renamed(6);
         }

         int var28;
         if (6 == ge * 572310033 && var2.aw() > 0) {
            var27 = var2.ac();
            if (var27 == 61) {
               var28 = var2.aw();
               WorldMapSectionType.ds = 1 == var28 && var2.ac() == 1;
               kz.og_renamed(5);
            }

            if (var27 == 21 && 20 == -1275976559 * dw) {
               kz.og_renamed(12);
            } else if (var27 == 2) {
               kz.og_renamed(14);
            } else if (15 == var27 && dw * -1275976559 == 40) {
               in.al = -1873812295;
               kz.og_renamed(19);
            } else if (64 == var27) {
               kz.og_renamed(10);
            } else if (23 == var27 && gt * -858790111 < 1) {
               gt += 494296289;
               kz.og_renamed(0);
            } else if (29 == var27) {
               kz.og_renamed(17);
            } else {
               if (69 != var27) {
                  mu.hr_renamed(var27);
                  return;
               }

               kz.og_renamed(7);
            }
         }

         if (572310033 * ge == 7 && var2.aw() >= 2) {
            var2.au(var3.al, 0, 2);
            var3.at = 0;
            ai.gk = var3.cl() * -1251228575;
            kz.og_renamed(8);
         }

         if (572310033 * ge == 8 && var2.aw() >= 935976865 * ai.gk) {
            var3.at = 0;
            var2.au(var3.al, var3.at * -1633313603, ai.gk * 935976865);
            aq[] var36 = new aq[]{aq.af};
            aq var30 = var36[var3.g1()];

            try {
               ac var31 = ej.af_renamed(var30);
               this.hp = new al(var3, var31);
               kz.og_renamed(9);
            } catch (Exception var14) {
               mu.hr_renamed(22);
               return;
            }
         }

         if (ge * 572310033 == 9 && this.hp.af()) {
            this.ha = this.hp.aw();
            this.hp.an();
            this.hp = null;
            if (null == this.ha) {
               mu.hr_renamed(22);
               return;
            }

            in.af();
            var24 = sh.aw_renamed();
            var24.aw.bu(LoginProt.au.aq * 537668749);
            var24.aw.p2(-1633313603 * this.ha.at);
            var24.aw.cc(this.ha);
            in.aw(var24);
            in.an();
            this.ha = null;
            kz.og_renamed(6);
         }

         if (10 == 572310033 * ge && var2.aw() > 0) {
            DevicePcmPlayerProvider.gi = var2.ac() * 1844861787;
            kz.og_renamed(11);
         }

         if (ge * 572310033 == 11 && var2.aw() >= 1874484435 * DevicePcmPlayerProvider.gi) {
            var2.au(var3.al, 0, DevicePcmPlayerProvider.gi * 1874484435);
            var3.at = 0;
            kz.og_renamed(6);
         }

         if (12 == ge * 572310033 && var2.aw() > 0) {
            gu = (var2.ac() + 3) * -956596276;
            kz.og_renamed(13);
         }

         if (ge * 572310033 == 13) {
            ga = 0;
            he.ax_renamed(Strings.bf, Strings.bq, gu * 1922908789 / 60 + Strings.ba);
            if ((gu -= -2091844131) * 1922908789 <= 0) {
               kz.og_renamed(0);
            }

         } else {
            if (ge * 572310033 == 14 && var2.aw() >= 1) {
               al.gm = var2.ac() * 296961217;
               kz.og_renamed(15);
            }

            if (15 == 572310033 * ge && var2.aw() >= al.gm * -1894298815) {
               boolean var38 = var2.ac() == 1;
               var2.au(var3.al, 0, 4);
               var3.at = 0;
               boolean var32 = false;
               if (var38) {
                  var28 = var3.gIsaac1() << 24;
                  var28 |= var3.gIsaac1() << 16;
                  var28 |= var3.gIsaac1() << 8;
                  var28 |= var3.gIsaac1();
                  aj.vb.be(cz.ca, var28);
               }

               if (hb) {
                  aj.vb.ad(cz.ca);
               } else {
                  aj.vb.ad((String)null);
               }

               dn.ac_renamed();
               pu = var2.ac() * -345023019;
               po = var2.ac() == 1;
               mg = var2.ac() * 255869677;
               mg = 255869677 * (mg * -549033243 << 8);
               mg += var2.ac() * 255869677;
               mo = var2.ac() * 361347949;
               var2.au(var3.al, 0, 8);
               var3.at = 0;
               this.he = var3.g8s() * 714003291813872507L;
               if (-1894298815 * al.gm >= 29) {
                  var2.au(var3.al, 0, 8);
                  var3.at = 0;
                  mn = var3.g8s() * 1369385558963036297L;
               }

               var2.au(var3.al, 0, 1);
               var3.at = 0;
               ServerProt[] var34 = PacketBitNode.af_renamed();
               var7 = var3.gIsaacSmart1or2();
               if (var7 < 0 || var7 >= var34.length) {
                  throw new IOException(var7 + " " + var3.at * -1633313603);
               }

               in.aq = var34[var7];
               in.al = in.aq.ev * -1975731211;
               var2.au(var3.al, 0, 2);
               var3.at = 0;
               in.al = var3.cl() * 1873812295;

               try {
                  by.an_renamed(ClientScriptFrame.bc, "zap");
               } catch (Throwable var13) {
               }

               kz.og_renamed(16);
            }

            if (572310033 * ge != 16) {
               if (572310033 * ge == 17 && var2.aw() >= 2) {
                  var3.at = 0;
                  var2.au(var3.al, 0, 2);
                  var3.at = 0;
                  au.gq = var3.cl() * -76488733;
                  kz.og_renamed(18);
               }

               if (572310033 * ge == 18 && var2.aw() >= au.gq * -1182573109) {
                  var3.at = 0;
                  var2.au(var3.al, 0, au.gq * -1182573109);
                  var3.at = 0;
                  String var42 = var3.cw();
                  String var40 = var3.cw();
                  String var37 = var3.cw();
                  he.ax_renamed(var42, var40, var37);
                  fd.hi_renamed(10);
                  if (gy.au()) {
                     ee.ak_renamed(9);
                  }
               }

               if (19 == ge * 572310033) {
                  if (889658999 * in.al == -1) {
                     if (var2.aw() < 2) {
                        return;
                     }

                     var2.au(var3.al, 0, 2);
                     var3.at = 0;
                     in.al = var3.cl() * 1873812295;
                  }

                  if (var2.aw() >= in.al * 889658999) {
                     var2.au(var3.al, 0, 889658999 * in.al);
                     var3.at = 0;
                     var27 = in.al * 889658999;
                     ie.ab();
                     em.hh_renamed();
                     qi.updatePlayer(var3);
                     if (var3.at * -1633313603 != var27) {
                        throw new RuntimeException();
                     }
                  }
               } else {
                  ga += -1982717453;
                  if (ga * -1687986373 > 2000) {
                     if (-858790111 * gt < 1) {
                        if (ClanChat.gw * 1119961125 == Inventory.gf * -1275160227) {
                           Inventory.gf = ec.gc * 293228307;
                        } else {
                           Inventory.gf = 518729065 * ClanChat.gw;
                        }

                        gt += 494296289;
                        kz.og_renamed(0);
                     } else {
                        mu.hr_renamed(-3);
                     }
                  }
               }
            } else {
               if (var2.aw() >= 889658999 * in.al) {
                  var3.at = 0;
                  var2.au(var3.al, 0, 889658999 * in.al);
                  ie.ac();
                  eo = 3648848592458615261L;
                  eg.eq.aw = 0;
                  AbstractByteArrayCopier.bf = true;
                  ej = true;
                  sc = -4061967902176514943L;
                  bt.af = new IterableNodeDeque();
                  in.af();
                  in.ab.at = 0;
                  in.aq = null;
                  in.ao = null;
                  in.ax = null;
                  in.ai = null;
                  in.al = 0;
                  in.aa = 0;
                  ea = 0;
                  ii = 0;
                  eu = 0;
                  ne = 0;
                  nt = false;
                  MouseHandler.au = 0;
                  ga.aq_renamed();
                  oq = 0;
                  om = false;
                  tl = 0;
                  kf = 0;
                  lv = 0;
                  fi.wc = null;
                  tp = 0;
                  sp = 1715437485;
                  te = 0;
                  th = 0;
                  em = dj.ac;
                  ew = dj.ac;
                  iw = 0;
                  ds.ab = 0;

                  for(var27 = 0; var27 < 2048; ++var27) {
                     ds.au[var27] = null;
                     ds.ac[var27] = iu.aw;
                  }

                  for(var27 = 0; var27 < 2048; ++var27) {
                     mc[var27] = null;
                  }

                  for(var27 = 0; var27 < 65536; ++var27) {
                     iu[var27] = null;
                  }

                  nl = -1035820595;
                  na.af();
                  np.af();

                  for(var27 = 0; var27 < 4; ++var27) {
                     for(var28 = 0; var28 < 104; ++var28) {
                        for(int var35 = 0; var35 < 104; ++var35) {
                           nr[var27][var28][var35] = null;
                        }
                     }
                  }

                  nn = new NodeDeque();
                  World.vt.clear();

                  for(var27 = 0; var27 < gz.an * -774485467; ++var27) {
                     gz var39 = GraphicsDefaults.af_renamed(var27);
                     if (var39 != null) {
                        Varps.an[var27] = 0;
                        Varps.aw[var27] = 0;
                     }
                  }

                  oy.qo.aq();
                  pt = 1296642255;
                  if (or * -896157613 != -1) {
                     var27 = or * -896157613;
                     if (var27 != -1 && kt.by[var27]) {
                        eb.bb.cl(var27);
                        if (hn.ap[var27] != null) {
                           for(var28 = 0; var28 < hn.ap[var27].length; ++var28) {
                              if (hn.ap[var27][var28] != null) {
                                 hn.ap[var27][var28] = null;
                              }
                           }

                           hn.ap[var27] = null;
                           kt.by[var27] = false;
                        }
                     }
                  }

                  for(InterfaceParent var41 = (InterfaceParent)oc.first(); null != var41; var41 = (InterfaceParent)oc.next()) {
                     nv.closeInterface(var41, true);
                  }

                  or = 32945189;
                  oc = new NodeHashTable(8);
                  pg = null;
                  ne = 0;
                  nt = false;
                  vh.an((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1);

                  for(var27 = 0; var27 < 8; ++var27) {
                     nd[var27] = null;
                     no[var27] = false;
                  }

                  Inventory.af = new NodeHashTable(32);
                  da = true;

                  for(var27 = 0; var27 < 100; ++var27) {
                     rf[var27] = true;
                  }

                  an.io_renamed();
                  es.sb = null;
                  ObjType.sq = null;
                  Arrays.fill(sg, (Object)null);
                  MouseHandler.sx = null;
                  Arrays.fill(so, (Object)null);

                  for(var27 = 0; var27 < 8; ++var27) {
                     vs[var27] = new GrandExchangeOffer();
                  }

                  oh.vj = null;
                  qi.updatePlayer(var3);
                  bi.ji = -1006050753;
                  ec.loadRegions(false, var3);
                  in.aq = null;
               }

            }
         }
      } catch (IOException var21) {
         if (gt * -858790111 < 1) {
            if (1119961125 * ClanChat.gw == Inventory.gf * -1275160227) {
               Inventory.gf = 293228307 * ec.gc;
            } else {
               Inventory.gf = 518729065 * ClanChat.gw;
            }

            gt += 494296289;
            kz.og_renamed(0);
         } else {
            mu.hr_renamed(-2);
         }
      }
   }

   final void hq() {
      if (ea * -1496573241 > 1) {
         ea -= 1317177079;
      }

      if (ii * 1705142349 > 0) {
         ii -= -100200315;
      }

      if (ik) {
         ik = false;
         ng.ht_renamed();
      } else {
         if (!nt) {
            gr.kw_renamed();
         }

         int var2;
         for(var2 = 0; var2 < 100 && this.ja(in); ++var2) {
         }

         if (30 == -1275976559 * dw) {
            while(true) {
               ReflectionCheck var3 = (ReflectionCheck)bt.af.last();
               boolean var17;
               if (null == var3) {
                  var17 = false;
               } else {
                  var17 = true;
               }

               int var4;
               PacketBitNode var18;
               if (!var17) {
                  PacketBitNode var19;
                  int var20;
                  if (ie.aw) {
                     var19 = mi.an_renamed(ClientProt.dz, in.au);
                     var19.aw.bu(0);
                     var20 = -1633313603 * var19.aw.at;
                     ie.write(var19.aw);
                     var19.aw.cu(-1633313603 * var19.aw.at - var20);
                     in.aw(var19);
                     ie.au();
                  }

                  int var5;
                  int var6;
                  int var7;
                  int var8;
                  int var9;
                  int var10;
                  int var11;
                  int var12;
                  int var13;
                  synchronized(eg.eq.an) {
                     if (!bh) {
                        eg.eq.aw = 0;
                     } else if (0 != -1222491879 * MouseHandler.ar || 535437747 * eg.eq.aw >= 40) {
                        var18 = null;
                        var4 = 0;
                        var5 = 0;
                        var6 = 0;
                        var7 = 0;

                        for(var8 = 0; var8 < 535437747 * eg.eq.aw && (var18 == null || -1633313603 * var18.aw.at - var4 < 246); ++var8) {
                           var5 = var8;
                           var9 = eg.eq.au[var8];
                           if (var9 < -1) {
                              var9 = -1;
                           } else if (var9 > 65534) {
                              var9 = 65534;
                           }

                           var10 = eg.eq.ac[var8];
                           if (var10 < -1) {
                              var10 = -1;
                           } else if (var10 > 65534) {
                              var10 = 65534;
                           }

                           if (et * -751176573 != var10 || ef * -2076298705 != var9) {
                              if (var18 == null) {
                                 var18 = mi.an_renamed(ClientProt.df, in.au);
                                 var18.aw.bu(0);
                                 var4 = var18.aw.at * -1633313603;
                                 PacketBit var10000 = var18.aw;
                                 var10000.at += 1262255402;
                                 var6 = 0;
                                 var7 = 0;
                              }

                              if (-1L != ez * 8511124946921102523L) {
                                 var11 = var10 - -751176573 * et;
                                 var12 = var9 - -2076298705 * ef;
                                 var13 = (int)((eg.eq.ab[var8] - ez * 8511124946921102523L) / 20L);
                                 var6 = (int)((long)var6 + (eg.eq.ab[var8] - ez * 8511124946921102523L) % 20L);
                              } else {
                                 var11 = var10;
                                 var12 = var9;
                                 var13 = Integer.MAX_VALUE;
                              }

                              et = -791348693 * var10;
                              ef = 824333519 * var9;
                              if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                                 var11 += 32;
                                 var12 += 32;
                                 var18.aw.p2((var13 << 12) + (var11 << 6) + var12);
                              } else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
                                 var11 += 128;
                                 var12 += 128;
                                 var18.aw.bu(var13 + 128);
                                 var18.aw.p2((var11 << 8) + var12);
                              } else if (var13 < 32) {
                                 var18.aw.bu(var13 + 192);
                                 if (var10 != -1 && var9 != -1) {
                                    var18.aw.ba(var10 | var9 << 16);
                                 } else {
                                    var18.aw.ba(Integer.MIN_VALUE);
                                 }
                              } else {
                                 var18.aw.p2((var13 & 8191) + '\ue000');
                                 if (var10 != -1 && var9 != -1) {
                                    var18.aw.ba(var10 | var9 << 16);
                                 } else {
                                    var18.aw.ba(Integer.MIN_VALUE);
                                 }
                              }

                              ++var7;
                              ez = 2560228884295272563L * eg.eq.ab[var8];
                           }
                        }

                        if (null != var18) {
                           var18.aw.cu(var18.aw.at * -1633313603 - var4);
                           var8 = var18.aw.at * -1633313603;
                           var18.aw.at = -1516355947 * var4;
                           var18.aw.bu(var6 / var7);
                           var18.aw.bu(var6 % var7);
                           var18.aw.at = -1516355947 * var8;
                           in.aw(var18);
                        }

                        if (var5 >= eg.eq.aw * 535437747) {
                           eg.eq.aw = 0;
                        } else {
                           MouseRecorder var46 = eg.eq;
                           var46.aw -= -1762036357 * var5;
                           System.arraycopy(eg.eq.ac, var5, eg.eq.ac, 0, eg.eq.aw * 535437747);
                           System.arraycopy(eg.eq.au, var5, eg.eq.au, 0, 535437747 * eg.eq.aw);
                           System.arraycopy(eg.eq.ab, var5, eg.eq.ab, 0, eg.eq.aw * 535437747);
                        }
                     }
                  }

                  PacketBitNode var29;
                  if (1 == -1222491879 * MouseHandler.ar || !su.ev && 4 == MouseHandler.ar * -1222491879 || MouseHandler.ar * -1222491879 == 2) {
                     long var21 = MouseHandler.aj * -1442809844282041895L - 2243792022961482123L * eo;
                     if (var21 > 32767L) {
                        var21 = 32767L;
                     }

                     eo = 5332065808650620587L * MouseHandler.aj;
                     var4 = 1163896205 * MouseHandler.as;
                     if (var4 < 0) {
                        var4 = 0;
                     } else if (var4 > 1658005443 * kd.ak) {
                        var4 = kd.ak * 1658005443;
                     }

                     var5 = 2020601481 * MouseHandler.am;
                     if (var5 < 0) {
                        var5 = 0;
                     } else if (var5 > -1687260435 * aj) {
                        var5 = -1687260435 * aj;
                     }

                     var6 = (int)var21;
                     var29 = mi.an_renamed(ClientProt.ai, in.au);
                     var29.aw.p2((2 == MouseHandler.ar * -1222491879 ? 1 : 0) + (var6 << 1));
                     var29.aw.p2(var5);
                     var29.aw.p2(var4);
                     in.aw(var29);
                  }

                  if (sh.ac * 1888573011 > 0) {
                     var19 = mi.an_renamed(ClientProt.ab, in.au);
                     var19.aw.p2(0);
                     var20 = -1633313603 * var19.aw.at;
                     long var22 = Formatting.af_renamed();

                     for(var6 = 0; var6 < 1888573011 * sh.ac; ++var6) {
                        long var32 = var22 - 8736327498043665535L * sc;
                        if (var32 > 16777215L) {
                           var32 = 16777215L;
                        }

                        sc = var22 * 4061967902176514943L;
                        var19.aw.ez((int)var32);
                        var19.aw.bu(sh.aw[var6]);
                     }

                     var19.aw.ca(var19.aw.at * -1633313603 - var20);
                     in.aw(var19);
                  }

                  if (lt * -1504372859 > 0) {
                     lt -= 1691830605;
                  }

                  if (sh.av(96) || sh.av(97) || sh.av(98) || sh.av(99)) {
                     lz = true;
                  }

                  if (lz && lt * -1504372859 <= 0) {
                     lt = -523126268;
                     lz = false;
                     var19 = mi.an_renamed(ClientProt.cd, in.au);
                     var19.aw.p2(kf * 704283033);
                     var19.aw.p2(-954734641 * kp);
                     in.aw(var19);
                  }

                  if (AbstractByteArrayCopier.bf && !ej) {
                     ej = true;
                     var19 = mi.an_renamed(ClientProt.cy, in.au);
                     var19.aw.bu(1);
                     in.aw(var19);
                  }

                  if (!AbstractByteArrayCopier.bf && ej) {
                     ej = false;
                     var19 = mi.an_renamed(ClientProt.cy, in.au);
                     var19.aw.bu(0);
                     in.aw(var19);
                  }

                  if (null != ey.wt) {
                     ey.wt.an();
                  }

                  Coord.if_renamed();
                  MapElementType.ia_renamed();
                  ea.iu_renamed();
                  if (30 != dw * -1275976559) {
                     return;
                  }

                  for(dg var23 = (dg)nn.last(); null != var23; var23 = (dg)nn.previous()) {
                     if (var23.ag * 1457211081 > 0) {
                        var23.ag -= 376812409;
                     }

                     if (0 == var23.ag * 1457211081) {
                        if (var23.au * 637177597 < 0 || hc.aj_renamed(637177597 * var23.au, var23.aq * 1599541283)) {
                           do.ku_renamed(var23.af * 593068225, -1586499579 * var23.an, 68300005 * var23.aw, 800888185 * var23.ac, var23.au * 637177597, -1665966001 * var23.ab, var23.aq * 1599541283, var23.ay * 1699404385);
                           var23.remove();
                        }
                     } else {
                        if (-536117851 * var23.ai > 0) {
                           var23.ai -= 237969965;
                        }

                        if (-536117851 * var23.ai == 0 && 68300005 * var23.aw >= 1 && 800888185 * var23.ac >= 1 && var23.aw * 68300005 <= 102 && 800888185 * var23.ac <= 102 && (var23.al * 552715177 < 0 || hc.aj_renamed(var23.al * 552715177, var23.aa * -1966402261))) {
                           do.ku_renamed(var23.af * 593068225, -1586499579 * var23.an, var23.aw * 68300005, var23.ac * 800888185, 552715177 * var23.al, 120493739 * var23.at, var23.aa * -1966402261, 1699404385 * var23.ay);
                           var23.ai = -237969965;
                           if (var23.au * 637177597 == 552715177 * var23.al && -1 == var23.au * 637177597) {
                              var23.remove();
                           } else if (637177597 * var23.au == var23.al * 552715177 && -1665966001 * var23.ab == var23.at * 120493739 && -1966402261 * var23.aa == var23.aq * 1599541283) {
                              var23.remove();
                           }
                        }
                     }
                  }

                  int var10002;
                  for(var2 = 0; var2 < tl * -297150195; ++var2) {
                     var10002 = tg[var2]--;
                     if (tg[var2] >= -10) {
                        SoundEffect var24 = ti[var2];
                        if (null == var24) {
                           SoundEffect var47 = (SoundEffect)null;
                           var24 = SoundEffect.readSoundEffect(qc.fa, tu[var2], 0);
                           if (var24 == null) {
                              continue;
                           }

                           int[] var48 = tg;
                           var48[var2] += var24.aw();
                           ti[var2] = var24;
                        }

                        if (tg[var2] < 0) {
                           if (tb[var2] != 0) {
                              var5 = (tb[var2] & 255) * 128;
                              var6 = tb[var2] >> 16 & 255;
                              var7 = 128 * var6 + 64 - MusicPatchNode.mi.bx * 1144428983;
                              if (var7 < 0) {
                                 var7 = -var7;
                              }

                              var8 = tb[var2] >> 8 & 255;
                              var9 = 64 + var8 * 128 - -411750205 * MusicPatchNode.mi.bo;
                              if (var9 < 0) {
                                 var9 = -var9;
                              }

                              var10 = var7 + var9 - 128;
                              if (var10 > var5) {
                                 tg[var2] = -100;
                                 continue;
                              }

                              if (var10 < 0) {
                                 var10 = 0;
                              }

                              var4 = (var5 - var10) * aj.vb.az() / var5;
                           } else {
                              var4 = aj.vb.aj();
                           }

                           if (var4 > 0) {
                              RawSound var25 = var24.toRawSound().resample(WorldMapSectionType.tj);
                              RawPcmStream var33 = RawPcmStream.aw_renamed(var25, 100, var4);
                              var33.aa(tr[var2] - 1);
                              fe.td.addSubStream(var33);
                           }

                           tg[var2] = -100;
                        }
                     } else {
                        tl -= 831233477;

                        for(var20 = var2; var20 < tl * -297150195; ++var20) {
                           tu[var20] = tu[1 + var20];
                           ti[var20] = ti[var20 + 1];
                           tr[var20] = tr[1 + var20];
                           tg[var20] = tg[var20 + 1];
                           tb[var20] = tb[var20 + 1];
                        }

                        --var2;
                     }
                  }

                  if (tf && !au.al_renamed()) {
                     if (aj.vb.am() != 0 && -1 != tz * 1976903761) {
                        Message.aw_renamed(pj.fw, 1976903761 * tz, 0, aj.vb.am(), false);
                     }

                     tf = false;
                  }

                  PacketWriter var49 = in;
                  var49.aa += -18974871;
                  if (997558489 * in.aa > 750) {
                     ng.ht_renamed();
                     return;
                  }

                  hy.in_renamed();
                  EnumType.ic_renamed();
                  int[] var30 = ds.aq;

                  for(var20 = 0; var20 < -2010934433 * ds.ab; ++var20) {
                     Player var26 = mc[var30[var20]];
                     if (null != var26 && var26.cs * -536830723 > 0) {
                        var26.cs -= 1655791701;
                        if (var26.cs * -536830723 == 0) {
                           var26.bw = null;
                        }
                     }
                  }

                  for(var20 = 0; var20 < 265474485 * iw; ++var20) {
                     var4 = iy[var20];
                     Npc var27 = iu[var4];
                     if (var27 != null && -536830723 * var27.cs > 0) {
                        var27.cs -= 1655791701;
                        if (var27.cs * -536830723 == 0) {
                           var27.bw = null;
                        }
                     }
                  }

                  ja += -603147329;
                  if (-1306273505 * mv != 0) {
                     me += 2130385748;
                     if (me * 1513573489 >= 400) {
                        mv = 0;
                     }
                  }

                  Component var34 = MidiPcmStream.oh;
                  Component var37 = fe.os;
                  MidiPcmStream.oh = null;
                  fe.os = null;
                  pz = null;
                  px = false;
                  pq = false;
                  sm = 0;

                  while(sh.ag() && sm * -1685179677 < 128) {
                     if (324465533 * pu >= 2 && sh.av(82) && 66 == 546317845 * sh.ai) {
                        StringBuilder var28 = new StringBuilder();

                        Message var41;
                        for(Iterator var36 = Messages.an.iterator(); var36.hasNext(); var28.append(var41.at).append('\n')) {
                           var41 = (Message)var36.next();
                           if (null != var41.ac && !var41.ac.isEmpty()) {
                              var28.append(var41.ac).append(':');
                           }
                        }

                        String var31 = var28.toString();
                        ClientScriptFrame.bc.clipboardSetString(var31);
                     } else if (lv * 986256295 != 1 || sh.ax <= 0) {
                        sz[sm * -1685179677] = sh.ai * 546317845;
                        sk[sm * -1685179677] = sh.ax;
                        sm += 703505099;
                     }
                  }

                  boolean var35 = pu * 324465533 >= 2;
                  PacketBitNode var38;
                  if (var35 && sh.av(82) && sh.av(81) && -121753353 * rd != 0) {
                     var5 = -1900490645 * MusicPatchNode.mi.ad - rd * -121753353;
                     if (var5 < 0) {
                        var5 = 0;
                     } else if (var5 > 3) {
                        var5 = 3;
                     }

                     if (MusicPatchNode.mi.ad * -1900490645 != var5) {
                        var6 = jm.ib * -1232093375 + MusicPatchNode.mi.dy[0];
                        var7 = 827352769 * Scenery.jc + MusicPatchNode.mi.ds[0];
                        var38 = mi.an_renamed(ClientProt.cq, in.au);
                        var38.aw.p4ME(0);
                        var38.aw.dy(var6);
                        var38.aw.dh(var5);
                        var38.aw.ds(var7);
                        in.aw(var38);
                     }

                     rd = 0;
                  }

                  if (1 == MouseHandler.ar * -1222491879) {
                     si.ag();
                  }

                  if (-896157613 * or != -1) {
                     ReflectionCheck.mt_renamed(or * -896157613, 0, 0, aj * -1687260435, 1658005443 * kd.ak, 0, 0);
                  }

                  qu += -1340429835;

                  while(true) {
                     ClientScriptEvent var39;
                     Component var40;
                     Component var43;
                     do {
                        var39 = (ClientScriptEvent)rt.removeLast();
                        if (var39 == null) {
                           while(true) {
                              do {
                                 var39 = (ClientScriptEvent)rp.removeLast();
                                 if (var39 == null) {
                                    while(true) {
                                       do {
                                          var39 = (ClientScriptEvent)rq.removeLast();
                                          if (null == var39) {
                                             while(true) {
                                                hf var42 = (hf)re.removeLast();
                                                if (var42 == null) {
                                                   this.ko();
                                                   bt.ie_renamed();
                                                   if (pr != null) {
                                                      this.me();
                                                   }

                                                   if (Scene.bs()) {
                                                      var5 = Scene.bd;
                                                      var6 = Scene.bt;
                                                      var29 = mi.an_renamed(ClientProt.ck, in.au);
                                                      var29.aw.bu(5);
                                                      var29.aw.ds(Scenery.jc * 827352769 + var6);
                                                      var29.aw.p2LE(-1232093375 * jm.ib + var5);
                                                      var29.aw.du(sh.av(82) ? (sh.av(81) ? 2 : 1) : 0);
                                                      in.aw(var29);
                                                      Scene.br();
                                                      mq = MouseHandler.am * -1884483333;
                                                      mm = 2130738719 * MouseHandler.as;
                                                      mv = -1453825313;
                                                      me = 0;
                                                      te = -1970850269 * var5;
                                                      th = 875414437 * var6;
                                                   }

                                                   if (var34 != MidiPcmStream.oh) {
                                                      if (var34 != null) {
                                                         fw.ma_renamed(var34);
                                                      }

                                                      if (null != MidiPcmStream.oh) {
                                                         fw.ma_renamed(MidiPcmStream.oh);
                                                      }
                                                   }

                                                   if (fe.os != var37 && 1239377975 * on == 215597333 * oe) {
                                                      if (null != var37) {
                                                         fw.ma_renamed(var37);
                                                      }

                                                      if (fe.os != null) {
                                                         fw.ma_renamed(fe.os);
                                                      }
                                                   }

                                                   if (null != fe.os) {
                                                      if (215597333 * oe < 1239377975 * on) {
                                                         oe += -1411611075;
                                                         if (oe * 215597333 == on * 1239377975) {
                                                            fw.ma_renamed(fe.os);
                                                         }
                                                      }
                                                   } else if (oe * 215597333 > 0) {
                                                      oe -= -1411611075;
                                                   }

                                                   if (lv * 986256295 == 0) {
                                                      var5 = 1144428983 * MusicPatchNode.mi.bx;
                                                      var6 = MusicPatchNode.mi.bo * -411750205;
                                                      if (-1958669353 * bz.lg - var5 < -500 || bz.lg * -1958669353 - var5 > 500 || fw.lf * -365969735 - var6 < -500 || -365969735 * fw.lf - var6 > 500) {
                                                         bz.lg = var5 * 1293848551;
                                                         fw.lf = 892004233 * var6;
                                                      }

                                                      if (var5 != bz.lg * -1958669353) {
                                                         bz.lg += 1293848551 * ((var5 - bz.lg * -1958669353) / 16);
                                                      }

                                                      if (fw.lf * -365969735 != var6) {
                                                         fw.lf += 892004233 * ((var6 - fw.lf * -365969735) / 16);
                                                      }

                                                      var7 = bz.lg * -1958669353 >> 7;
                                                      var8 = fw.lf * -365969735 >> 7;
                                                      var9 = fq.getTileHeight(bz.lg * -1958669353, -365969735 * fw.lf, -1727408401 * GameShell.mh);
                                                      var10 = 0;
                                                      if (var7 > 3 && var8 > 3 && var7 < 100 && var8 < 100) {
                                                         for(var11 = var7 - 4; var11 <= var7 + 4; ++var11) {
                                                            for(var12 = var8 - 4; var12 <= 4 + var8; ++var12) {
                                                               var13 = -1727408401 * GameShell.mh;
                                                               if (var13 < 3 && 2 == (Tiles.an[1][var11][var12] & 2)) {
                                                                  ++var13;
                                                               }

                                                               int var14 = var9 - Tiles.af[var13][var11][var12];
                                                               if (var14 > var10) {
                                                                  var10 = var14;
                                                               }
                                                            }
                                                         }
                                                      }

                                                      var11 = var10 * 192;
                                                      if (var11 > 98048) {
                                                         var11 = 98048;
                                                      }

                                                      if (var11 < 32768) {
                                                         var11 = 32768;
                                                      }

                                                      if (var11 > 205350563 * lc) {
                                                         lc += (var11 - lc * 205350563) / 24 * 800423179;
                                                      } else if (var11 < 205350563 * lc) {
                                                         lc += 800423179 * ((var11 - 205350563 * lc) / 80);
                                                      }

                                                      Formatting.ls = (fq.getTileHeight(MusicPatchNode.mi.bx * 1144428983, MusicPatchNode.mi.bo * -411750205, -1727408401 * GameShell.mh) - lm * 394960243) * -1138369095;
                                                   } else if (1 == lv * 986256295) {
                                                      ms.ni_renamed();
                                                      short var45 = -1;
                                                      if (sh.av(33)) {
                                                         var45 = 0;
                                                      } else if (sh.av(49)) {
                                                         var45 = 1024;
                                                      }

                                                      if (sh.av(48)) {
                                                         if (var45 == 0) {
                                                            var45 = 1792;
                                                         } else if (1024 == var45) {
                                                            var45 = 1280;
                                                         } else {
                                                            var45 = 1536;
                                                         }
                                                      } else if (sh.av(50)) {
                                                         if (0 == var45) {
                                                            var45 = 256;
                                                         } else if (1024 == var45) {
                                                            var45 = 768;
                                                         } else {
                                                            var45 = 512;
                                                         }
                                                      }

                                                      byte var44 = 0;
                                                      if (sh.av(35)) {
                                                         var44 = -1;
                                                      } else if (sh.av(51)) {
                                                         var44 = 1;
                                                      }

                                                      var7 = 0;
                                                      if (var45 >= 0 || var44 != 0) {
                                                         var7 = sh.av(81) ? lp * 519949591 : la * 1101365113;
                                                         var7 *= 16;
                                                         lu = var45 * -1988002169;
                                                         lk = 818868517 * var44;
                                                      }

                                                      if (li * -1277774705 < var7) {
                                                         li += var7 / 8 * 1574169199;
                                                         if (li * -1277774705 > var7) {
                                                            li = var7 * 1574169199;
                                                         }
                                                      } else if (li * -1277774705 > var7) {
                                                         li = 1384929543 * li / 10 * 1574169199;
                                                      }

                                                      if (li * -1277774705 > 0) {
                                                         var8 = li * -1277774705 / 16;
                                                         if (1382999863 * lu >= 0) {
                                                            var5 = lu * 1382999863 - ek.kh * -1010818347 & 2047;
                                                            var9 = in.ac[var5];
                                                            var10 = in.au[var5];
                                                            bz.lg += var8 * var9 / 65536 * 1293848551;
                                                            fw.lf += 892004233 * (var10 * var8 / 65536);
                                                         }

                                                         if (-168443219 * lk != 0) {
                                                            Formatting.ls += lk * -168443219 * var8 * -1138369095;
                                                            if (470489225 * Formatting.ls > 0) {
                                                               Formatting.ls = 0;
                                                            }
                                                         }
                                                      } else {
                                                         lu = 1988002169;
                                                         lk = -818868517;
                                                      }

                                                      if (sh.av(13)) {
                                                         Canvas.ne_renamed();
                                                      }
                                                   }

                                                   if (MouseHandler.aa * 114417019 == 4 && su.ev) {
                                                      var5 = MouseHandler.ao * -1224153235 - 332197605 * km;
                                                      kn = 1932462086 * var5;
                                                      km = (var5 != -1 && var5 != 1 ? (332197605 * km + -1224153235 * MouseHandler.ao) / 2 : MouseHandler.ao * -1224153235) * 1302863597;
                                                      var6 = kz * -1491948821 - -2063363905 * MouseHandler.ay;
                                                      ks = var6 * -503524914;
                                                      kz = (-1 != var6 && var6 != 1 ? (-1491948821 * kz + MouseHandler.ay * -2063363905) / 2 : MouseHandler.ay * -2063363905) * -837440061;
                                                   } else {
                                                      if (sh.av(96)) {
                                                         ks += 1895721191 * ((-24 - 1977625303 * ks) / 2);
                                                      } else if (sh.av(97)) {
                                                         ks += 1895721191 * ((24 - 1977625303 * ks) / 2);
                                                      } else {
                                                         ks = 1895721191 * (1977625303 * ks / 2);
                                                      }

                                                      if (sh.av(98)) {
                                                         kn += (12 - kn * 1441154731) / 2 * -1181252605;
                                                      } else if (sh.av(99)) {
                                                         kn += (-12 - kn * 1441154731) / 2 * -1181252605;
                                                      } else {
                                                         kn = 1441154731 * kn / 2 * -1181252605;
                                                      }

                                                      km = MouseHandler.ao * 652543465;
                                                      kz = 1278432381 * MouseHandler.ay;
                                                   }

                                                   kf = 642728617 * (ks * 1977625303 / 2 + 704283033 * kf & 2047);
                                                   kp += -637026513 * (kn * 1441154731 / 2);
                                                   if (kp * -954734641 < 128) {
                                                      kp = 64984960;
                                                   }

                                                   if (kp * -954734641 > 383) {
                                                      kp = 831981393;
                                                   }

                                                   if (uk) {
                                                      an.ih_renamed();
                                                   } else if (uj) {
                                                      if (!ub) {
                                                         var5 = 64 + gx.ut * 957080960;
                                                         var6 = 958794368 * ex.uo + 64;
                                                         var7 = fq.getTileHeight(var5, var6, GameShell.mh * -1727408401) - av.uq * -887836823;
                                                         fh.il_renamed(var5, var7, var6);
                                                      } else if (null != ui) {
                                                         bt.kx = ui.af() * -1682679895;
                                                         ly.ke = ui.an() * 46344275;
                                                         if (ud) {
                                                            gk.kv = ui.aw() * -424093663;
                                                         } else {
                                                            gk.kv = (fq.getTileHeight(bt.kx * -2100544359, -91399205 * ly.ke, GameShell.mh * -1727408401) - ui.aw()) * -424093663;
                                                         }

                                                         ui.aa();
                                                      }

                                                      if (!uc) {
                                                         var5 = FontName.um * 332584320 + 64;
                                                         var6 = -1804719232 * MilliClock.ux + 64;
                                                         var7 = fq.getTileHeight(var5, var6, GameShell.mh * -1727408401) - ClientScriptFrame.ug * 1496735347;
                                                         var8 = var5 - -2100544359 * bt.kx;
                                                         var9 = var7 - 1772923873 * gk.kv;
                                                         var10 = var6 - -91399205 * ly.ke;
                                                         var11 = (int)Math.sqrt((double)(var8 * var8 + var10 * var10));
                                                         var12 = (int)(Math.atan2((double)var9, (double)var11) * 325.9490051269531) & 2047;
                                                         var13 = (int)(Math.atan2((double)var8, (double)var10) * -325.9490051269531) & 2047;
                                                         GraphicsObject.is_renamed(var12, var13);
                                                      } else {
                                                         if (null != uz) {
                                                            WorldMapSectionType.ky = uz.af() * 528729485;
                                                            WorldMapSectionType.ky = Math.min(Math.max(WorldMapSectionType.ky * 1897923909, 128), 383) * 528729485;
                                                            uz.aa();
                                                         }

                                                         if (ua != null) {
                                                            ek.kh = (ua.af() & 2047) * -1545206147;
                                                            ua.aa();
                                                         }
                                                      }
                                                   }

                                                   for(var5 = 0; var5 < 5; ++var5) {
                                                      var10002 = vg[var5]++;
                                                   }

                                                   oy.qo.ay();
                                                   var5 = SecureRandomFuture.aw_renamed();
                                                   var6 = bq.an();
                                                   if (var5 > 15000 && var6 > 15000) {
                                                      ii = 719725026;
                                                      MouseHandler.au = 1393311740;
                                                      var38 = mi.an_renamed(ClientProt.aw, in.au);
                                                      in.aw(var38);
                                                   }

                                                   World.vt.ac();

                                                   for(var8 = 0; var8 < wz.size(); ++var8) {
                                                      if (aj.ag_renamed((Integer)wz.get(var8)) != 2) {
                                                         wz.remove(var8);
                                                         --var8;
                                                      }
                                                   }

                                                   var49 = in;
                                                   var49.ay += -1313905755;
                                                   if (1383386157 * in.ay > 50) {
                                                      var38 = mi.an_renamed(ClientProt.by, in.au);
                                                      in.aw(var38);
                                                   }

                                                   try {
                                                      in.an();
                                                   } catch (IOException var15) {
                                                      ng.ht_renamed();
                                                   }

                                                   return;
                                                }

                                                FriendsList.je_renamed(var42);
                                             }
                                          }

                                          var40 = var39.aw;
                                          if (var40.br * 55577617 < 0) {
                                             break;
                                          }

                                          var43 = gh.an_renamed(var40.cu * 913615679);
                                       } while(var43 == null || var43.gz == null || var40.br * 55577617 >= var43.gz.length || var40 != var43.gz[var40.br * 55577617]);

                                       HeadbarUpdate.af_renamed(var39);
                                    }
                                 }

                                 var40 = var39.aw;
                                 if (55577617 * var40.br < 0) {
                                    break;
                                 }

                                 var43 = gh.an_renamed(var40.cu * 913615679);
                              } while(var43 == null || var43.gz == null || 55577617 * var40.br >= var43.gz.length || var40 != var43.gz[var40.br * 55577617]);

                              HeadbarUpdate.af_renamed(var39);
                           }
                        }

                        var40 = var39.aw;
                        if (55577617 * var40.br < 0) {
                           break;
                        }

                        var43 = gh.an_renamed(var40.cu * 913615679);
                     } while(null == var43 || null == var43.gz || var40.br * 55577617 >= var43.gz.length || var40 != var43.gz[var40.br * 55577617]);

                     HeadbarUpdate.af_renamed(var39);
                  }
               }

               var18 = mi.an_renamed(ClientProt.dk, in.au);
               var18.aw.bu(0);
               var4 = var18.aw.at * -1633313603;
               qg.af_renamed(var18.aw);
               var18.aw.cu(-1633313603 * var18.aw.at - var4);
               in.aw(var18);
            }
         }
      }
   }

   protected final void am() {
      rj = (Formatting.af_renamed() + 500L) * -1343645632282639199L;
      this.ip();
      if (-1 != or * -896157613) {
         this.ln(true);
      }

   }

   void ip() {
      int var2 = -1687260435 * aj;
      int var3 = kd.ak * 1658005443;
      if (-927540391 * this.av < var2) {
         var2 = this.av * -927540391;
      }

      if (this.ar * -1747234661 < var3) {
         var3 = this.ar * -1747234661;
      }

      if (aj.vb != null) {
         try {
            by.aw_renamed(ClientScriptFrame.bc, "resize", new Object[]{na.iv_renamed()});
         } catch (Throwable var5) {
         }
      }

   }

   final void drawLoggedIn() {
      int var2;
      if (-1 != or * -896157613) {
         var2 = or * -896157613;
         if (SoundSystem.loadInterface(var2)) {
            Obj.ms_renamed(hn.ap[var2], -1);
         }
      }

      for(var2 = 0; var2 < rr * -356793645; ++var2) {
         if (rf[var2]) {
            rm[var2] = true;
         }

         rw[var2] = rf[var2];
         rf[var2] = false;
      }

      rs = ep * -1146781383;
      of = -563689483;
      oy = -2111961447;
      if (-1 != or * -896157613) {
         rr = 0;
         ai.lk_renamed(or * -896157613, 0, 0, aj * -1687260435, kd.ak * 1658005443, 0, 0, -1);
      }

      Rasterizer2D.Rasterizer2D_resetClip();
      if (mx) {
         if (-1306273505 * mv == 1) {
            gq.kb[1513573489 * me / 100].ax(-902574261 * mq - 8, 682495699 * mm - 8);
         }

         if (-1306273505 * mv == 2) {
            gq.kb[4 + 1513573489 * me / 100].ax(-902574261 * mq - 8, 682495699 * mm - 8);
         }
      }

      if (!nt) {
         if (-1 != of * -2086038621) {
            dk.kk_renamed(-2086038621 * of, oy * -870509993);
         }
      } else {
         var2 = -1141903185 * hl.nf;
         int var3 = ArchiveLoader.nc * -115281635;
         int var4 = -960964385 * DesktopPlatformInfoProvider.nj;
         int var5 = 245252327 * fq.nv;
         int var6 = 6116423;
         Rasterizer2D.Rasterizer2D_fillRectangle(var2, var3, var4, var5, var6);
         Rasterizer2D.Rasterizer2D_fillRectangle(1 + var2, 1 + var3, var4 - 2, 16, 0);
         Rasterizer2D.Rasterizer2D_drawRectangle(1 + var2, var3 + 18, var4 - 2, var5 - 19, 0);
         fx.ip.draw(Strings.gd, 3 + var2, 14 + var3, var6, -1);
         int var7 = -2063363905 * MouseHandler.ay;
         int var8 = MouseHandler.ao * -1224153235;

         for(int var9 = 0; var9 < 730065501 * ne; ++var9) {
            int var10 = var3 + 31 + 15 * (ne * 730065501 - 1 - var9);
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
               var11 = 16776960;
            }

            fx.ip.draw(Friend.lg_renamed(var9), 3 + var2, var10, var11, 0);
         }

         ClanChat.ki_renamed(-1141903185 * hl.nf, -115281635 * ArchiveLoader.nc, -960964385 * DesktopPlatformInfoProvider.nj, fq.nv * 245252327);
      }

      if (3 == -1928160607 * rg) {
         for(var2 = 0; var2 < rr * -356793645; ++var2) {
            if (rw[var2]) {
               Rasterizer2D.ev_renamed(rh[var2], rb[var2], ra[var2], ri[var2], 16711935, 128);
            } else if (rm[var2]) {
               Rasterizer2D.ev_renamed(rh[var2], rb[var2], ra[var2], ri[var2], 16711680, 128);
            }
         }
      }

      ms.au_renamed(GameShell.mh * -1727408401, MusicPatchNode.mi.bx * 1144428983, MusicPatchNode.mi.bo * -411750205, ja * -1795081153);
      ja = 0;
   }

   static int bn_renamed(int var0, ClientScript var1, boolean var2) {
      if (var0 == 5630) {
         ii = 719725026;
         return 1;
      } else {
         return 2;
      }
   }

   boolean jp(PacketWriter var1, int var2) {
      if (0 == var1.al * 889658999) {
         es.sb = null;
      } else {
         if (null == es.sb) {
            es.sb = new ClanChat(co.cn, ClientScriptFrame.bc);
         }

         es.sb.readUpdate(var1.ab, var2);
      }

      qd = qu * 235003969;
      GraphicsObject.sl = true;
      var1.aq = null;
      return true;
   }

   boolean jt(PacketWriter var1) {
      if (es.sb != null) {
         es.sb.ax(var1.ab);
      }

      qd = qu * 235003969;
      GraphicsObject.sl = true;
      var1.aq = null;
      return true;
   }

   final boolean ja(PacketWriter var1) {
      AbstractSocket var3 = var1.getSocket();
      PacketBit var4 = var1.ab;
      if (null == var3) {
         return false;
      } else {
         String var6;
         int var7;
         try {
            int var25;
            if (var1.aq == null) {
               if (var1.at) {
                  if (!var3.an(1)) {
                     return false;
                  }

                  var3.au(var1.ab.al, 0, 1);
                  var1.aa = 0;
                  var1.at = false;
               }

               var4.at = 0;
               if (var4.au((byte)55)) {
                  if (!var3.an(1)) {
                     return false;
                  }

                  var3.au(var1.ab.al, 1, 1);
                  var1.aa = 0;
               }

               var1.at = true;
               ServerProt[] var5 = PacketBitNode.af_renamed();
               var25 = var4.gIsaacSmart1or2();
               if (var25 < 0 || var25 >= var5.length) {
                  throw new IOException(var25 + " " + -1633313603 * var4.at);
               }

               var1.aq = var5[var25];
               var1.al = -1975731211 * var1.aq.ev;
            }

            if (889658999 * var1.al == -1) {
               if (!var3.an(1)) {
                  return false;
               }

               var1.getSocket().au(var4.al, 0, 1);
               var1.al = (var4.al[0] & 255) * 1873812295;
            }

            if (889658999 * var1.al == -2) {
               if (!var3.an(2)) {
                  return false;
               }

               var1.getSocket().au(var4.al, 0, 2);
               var4.at = 0;
               var1.al = var4.cl() * 1873812295;
            }

            if (!var3.an(var1.al * 889658999)) {
               return false;
            }

            var4.at = 0;
            var3.au(var4.al, 0, var1.al * 889658999);
            var1.aa = 0;
            ie.af();
            var1.ai = var1.ax;
            var1.ax = var1.ao;
            var1.ao = var1.aq;
            int var23;
            if (var1.aq == ServerProt.al) {
               var23 = var4.g4s();
               var25 = var4.g4s();
               var7 = NetCache.bq_renamed();
               PacketBitNode var85 = mi.an_renamed(ClientProt.cx, in.au);
               var85.aw.dh(1913114939 * aa);
               var85.aw.dp(var7);
               var85.aw.el(var23);
               var85.aw.el(var25);
               in.aw(var85);
               var1.aq = null;
               return true;
            }

            int var14;
            byte var27;
            long var28;
            long var30;
            long var34;
            boolean var42;
            String var49;
            int var61;
            if (ServerProt.aj == var1.aq) {
               var27 = var4.g1s();
               var28 = (long)var4.cl();
               var30 = (long)var4.cr();
               var34 = var30 + (var28 << 32);
               var42 = false;
               gj var67 = var27 >= 0 ? so[var27] : MouseHandler.sx;
               if (var67 == null) {
                  var42 = true;
               } else {
                  for(var14 = 0; var14 < 100; ++var14) {
                     if (st[var14] == var34) {
                        var42 = true;
                        break;
                     }
                  }
               }

               if (!var42) {
                  st[1960529059 * sf] = var34;
                  sf = 1561052939 * ((1 + 1960529059 * sf) % 100);
                  var49 = TilePaint.aw_renamed(var4);
                  var61 = var27 >= 0 ? 43 : 46;
                  fo.addMessage(var61, "", var49, var67.ab);
               }

               var1.aq = null;
               return true;
            }

            int var8;
            int var9;
            if (var1.aq == ServerProt.an) {
               var23 = var4.er();
               var25 = var4.eg();
               var7 = var4.eo();
               if (65535 == var7) {
                  var7 = -1;
               }

               var8 = var4.ep();
               if (var8 == 65535) {
                  var8 = -1;
               }

               for(var9 = var8; var9 <= var7; ++var9) {
                  var34 = ((long)var23 << 32) + (long)var9;
                  Node var59 = rv.get(var34);
                  if (var59 != null) {
                     var59.remove();
                  }

                  rv.put(new IntegerNode(var25), var34);
               }

               var1.aq = null;
               return true;
            }

            Component var51;
            if (ServerProt.bc == var1.aq) {
               var23 = var4.et();
               var25 = var4.en();
               var7 = var4.eq();
               var51 = gh.an_renamed(var25);
               if (var23 != var51.bp * -115015413 || var7 != 1651158159 * var51.bc || 0 != -1596536121 * var51.bq || 0 != 1484444061 * var51.ba) {
                  var51.bp = var23 * 1806877347;
                  var51.bc = var7 * 1231090287;
                  var51.bq = 0;
                  var51.ba = 0;
                  fw.ma_renamed(var51);
                  this.alignComponent(var51);
                  if (883712245 * var51.bg == 0) {
                     WallDecoration.lz_renamed(hn.ap[var25 >> 16], var51, false);
                  }
               }

               var1.aq = null;
               return true;
            }

            if (ServerProt.el == var1.aq) {
               var23 = var4.db();
               var25 = var4.g1n();
               var7 = var4.g4s();
               var51 = gh.an_renamed(var7);
               ChatChannel.bq_renamed(var51, var23, var25);
               fw.ma_renamed(var51);
               var1.aq = null;
               return true;
            }

            if (ServerProt.cb == var1.aq) {
               var23 = var4.g1();
               lk.hg_renamed(var23);
               var1.aq = null;
               return false;
            }

            if (ServerProt.et == var1.aq) {
               var23 = var4.eo();
               var25 = var4.cl();
               var7 = var4.er();
               var51 = gh.an_renamed(var7);
               var51.dq = (var25 + (var23 << 16)) * -1510822541;
               var1.aq = null;
               return true;
            }

            Npc var56;
            if (ServerProt.dx == var1.aq) {
               var23 = var4.cl();
               var56 = iu[var23];
               var7 = var4.cl();
               var25 = var4.g4s();
               if (null != var56) {
                  var56.cj(0, var7, var25 >> 16, var25 & '\uffff');
               }

               var1.aq = null;
               return true;
            }

            if (var1.aq == ServerProt.cc) {
               EnumType.jb_renamed(lm.aq);
               var1.aq = null;
               return true;
            }

            if (ServerProt.dl == var1.aq) {
               var1.aq = null;
               return true;
            }

            Npc var44;
            if (var1.aq == ServerProt.dy) {
               var23 = var4.en();
               var25 = var4.ep();
               short var87 = (short)var4.eq();
               var8 = var4.g1n();
               var44 = iu[var25];
               if (null != var44) {
                  var44.ai(var8, var23, var87);
               }

               var1.aq = null;
               return true;
            }

            if (var1.aq == ServerProt.ab) {
               var23 = var4.cl();
               Player var80;
               if (var23 == mg * -549033243) {
                  var80 = MusicPatchNode.mi;
               } else {
                  var80 = mc[var23];
               }

               var25 = var4.cl();
               var7 = var4.g4s();
               if (var80 != null) {
                  var80.cj(0, var25, var7 >> 16, var7 & '\uffff');
               }

               var1.aq = null;
               return true;
            }

            String var66;
            boolean var90;
            if (ServerProt.bp == var1.aq) {
               var23 = var4.cd();
               var90 = var4.g1() == 1;
               var66 = "";
               boolean var76 = false;
               if (var90) {
                  var66 = var4.cw();
                  if (World.vt.aq(new Username(var66, co.cn))) {
                     var76 = true;
                  }
               }

               String var68 = var4.cw();
               if (!var76) {
                  es.an_renamed(var23, var66, var68);
               }

               var1.aq = null;
               return true;
            }

            Component var26;
            if (var1.aq == ServerProt.eb) {
               var23 = var4.eg();
               var25 = var4.eg();
               var26 = gh.an_renamed(var23);
               ks.ba_renamed(var26, var25);
               fw.ma_renamed(var26);
               var1.aq = null;
               return true;
            }

            if (ServerProt.az == var1.aq) {
               var23 = var4.g4s();
               var90 = var4.dq() == 1;
               var26 = gh.an_renamed(var23);
               if (var26.ck != var90) {
                  var26.ck = var90;
                  fw.ma_renamed(var26);
               }

               var1.aq = null;
               return true;
            }

            if (ServerProt.cf == var1.aq) {
               return this.jt(var1);
            }

            if (var1.aq == ServerProt.dt) {
               EnumType.jb_renamed(lm.ab);
               var1.aq = null;
               return true;
            }

            if (var1.aq == ServerProt.br) {
               var23 = var4.en();
               var25 = var4.cl();
               var26 = gh.an_renamed(var23);
               if (1 != -123768459 * var26.dr || -168077555 * var26.dl != var25) {
                  var26.dr = -1714481443;
                  var26.dl = 509431749 * var25;
                  fw.ma_renamed(var26);
               }

               var1.aq = null;
               return true;
            }

            int var10;
            int var11;
            if (ServerProt.ea == var1.aq) {
               uj = true;
               uk = false;
               ub = true;
               gx.ut = var4.g1() * -436480541;
               ex.uo = var4.g1() * 2032739133;
               var23 = var4.cl();
               var25 = var4.cl();
               ud = var4.gbool();
               var7 = var4.g1();
               var8 = gx.ut * 957080960 + 64;
               var9 = 64 + 958794368 * ex.uo;
               boolean var62 = false;
               boolean var73 = false;
               if (ud) {
                  var10 = gk.kv * 1772923873;
                  var11 = fq.getTileHeight(var8, var9, -1727408401 * GameShell.mh) - var23;
               } else {
                  var10 = fq.getTileHeight(bt.kx * -2100544359, ly.ke * -91399205, GameShell.mh * -1727408401) - gk.kv * 1772923873;
                  var11 = var23;
               }

               ui = new rs(-2100544359 * bt.kx, ly.ke * -91399205, var10, var8, var9, var11, var25, var7);
               var1.aq = null;
               return true;
            }

            if (ServerProt.bm == var1.aq) {
               return this.jp(var1, 2);
            }

            if (var1.aq == ServerProt.dp) {
               FontName.jt = var4.g1n() * -522523151;
               aa.jp = var4.g1() * 671253333;

               while(-1633313603 * var4.at < 889658999 * var1.al) {
                  var23 = var4.g1();
                  lm var89 = Varcs.af_renamed()[var23];
                  EnumType.jb_renamed(var89);
               }

               var1.aq = null;
               return true;
            }

            Component var47;
            if (ServerProt.aw == var1.aq) {
               var23 = var4.en();
               var47 = gh.an_renamed(var23);
               var47.dr = -848477033;
               var47.dl = MusicPatchNode.mi.aw.getChatHeadId() * 509431749;
               fw.ma_renamed(var47);
               var1.aq = null;
               return true;
            }

            if (ServerProt.eo == var1.aq) {
               var23 = var4.cl();
               if (65535 == var23) {
                  var23 = -1;
               }

               or = var23 * -32945189;
               this.ln(false);
               lm.mj_renamed(var23);
               ax.ci_renamed(-896157613 * or);

               for(var25 = 0; var25 < 100; ++var25) {
                  rf[var25] = true;
               }

               var1.aq = null;
               return true;
            }

            if (ServerProt.de == var1.aq) {
               World.vt.aw(var4, var1.al * 889658999);
               qg = 1831095645 * qu;
               var1.aq = null;
               return true;
            }

            if (var1.aq == ServerProt.bl) {
               tp = var4.g1() * -690225493;
               var1.aq = null;
               return true;
            }

            if (var1.aq == ServerProt.aa) {
               EnumType.jb_renamed(lm.af);
               var1.aq = null;
               return true;
            }

            if (var1.aq == ServerProt.co) {
               ds.rx = null;
               var1.aq = null;
               return true;
            }

            if (ServerProt.bs == var1.aq) {
               EnumType.jb_renamed(lm.aa);
               var1.aq = null;
               return true;
            }

            String var24;
            if (ServerProt.ai == var1.aq) {
               var24 = var4.cw();
               Object[] var88 = new Object[var24.length() + 1];

               for(var7 = var24.length() - 1; var7 >= 0; --var7) {
                  if (var24.charAt(var7) == 's') {
                     var88[1 + var7] = var4.cw();
                  } else {
                     var88[1 + var7] = new Integer(var4.g4s());
                  }
               }

               var88[0] = new Integer(var4.g4s());
               ClientScriptEvent var86 = new ClientScriptEvent();
               var86.af = var88;
               HeadbarUpdate.af_renamed(var86);
               var1.aq = null;
               return true;
            }

            if (ServerProt.ae == var1.aq) {
               GrandExchangeEvents.an_renamed(var4, var1.al * 889658999);
               dk.nq_renamed();
               var1.aq = null;
               return true;
            }

            int var16;
            int var17;
            String var63;
            Scenery var69;
            if (ServerProt.dn == var1.aq) {
               var27 = var4.g1s();
               var6 = var4.cw();
               long var83 = (long)var4.cl();
               long var65 = (long)var4.cr();
               PlayerType var71 = (PlayerType)StructType.findEnumerated(StudioGame.au_renamed(), var4.g1());
               long var58 = var65 + (var83 << 32);
               boolean var57 = false;
               var69 = null;
               gj var78 = var27 >= 0 ? so[var27] : MouseHandler.sx;
               if (var78 == null) {
                  var57 = true;
               } else {
                  var16 = 0;

                  while(true) {
                     if (var16 >= 100) {
                        if (var71.aj && World.vt.aq(new Username(var6, co.cn))) {
                           var57 = true;
                        }
                        break;
                     }

                     if (st[var16] == var58) {
                        var57 = true;
                        break;
                     }

                     ++var16;
                  }
               }

               if (!var57) {
                  st[sf * 1960529059] = var58;
                  sf = 1561052939 * ((sf * 1960529059 + 1) % 100);
                  var63 = AbstractFont.escapeBrackets(TilePaint.aw_renamed(var4));
                  var17 = var27 >= 0 ? 41 : 44;
                  if (2138745227 * var71.am != -1) {
                     fo.addMessage(var17, ArchiveDiskActionHandler.af_renamed(var71.am * 2138745227) + var6, var63, var78.ab);
                  } else {
                     fo.addMessage(var17, var6, var63, var78.ab);
                  }
               }

               var1.aq = null;
               return true;
            }

            if (var1.aq == ServerProt.ax) {
               var4.at += 491706444;
               if (var4.de()) {
                  ej.nc_renamed(var4, -1633313603 * var4.at - 28);
               }

               var1.aq = null;
               return true;
            }

            if (var1.aq == ServerProt.af) {
               ec.loadRegions(false, var1.ab);
               var1.aq = null;
               return true;
            }

            if (ServerProt.am == var1.aq) {
               var23 = var4.g1();
               if (var4.g1() == 0) {
                  vs[var23] = new GrandExchangeOffer();
                  var4.at += -1524603270;
               } else {
                  var4.at -= -1516355947;
                  vs[var23] = new GrandExchangeOffer(var4, false);
               }

               qq = -1209118871 * qu;
               var1.aq = null;
               return true;
            }

            if (var1.aq == ServerProt.cu) {
               var23 = var4.ef();
               var25 = var4.eg();
               var26 = gh.an_renamed(var25);
               if (var23 != var26.dv * -1526544909 || var23 == -1) {
                  var26.dv = -1195025605 * var23;
                  var26.gx = 0;
                  var26.gl = 0;
                  fw.ma_renamed(var26);
               }

               var1.aq = null;
               return true;
            }

            boolean var36;
            if (var1.aq == ServerProt.es) {
               var36 = var4.g1() == 1;
               var25 = var4.g4s();
               var26 = gh.an_renamed(var25);
               SecureRandomCallable.bv_renamed(var26, MusicPatchNode.mi.aw, var36);
               fw.ma_renamed(var26);
               var1.aq = null;
               return true;
            }

            if (ServerProt.cs == var1.aq) {
               var23 = var4.da();
               var25 = var4.eg();
               var7 = var23 >> 10 & 31;
               var8 = var23 >> 5 & 31;
               var9 = var23 & 31;
               var10 = (var7 << 19) + (var8 << 11) + (var9 << 3);
               Component var70 = gh.an_renamed(var25);
               if (1409091639 * var70.cg != var10) {
                  var70.cg = var10 * -1604768377;
                  fw.ma_renamed(var70);
               }

               var1.aq = null;
               return true;
            }

            int var12;
            int var54;
            if (var1.aq == ServerProt.bk) {
               var16 = var4.cl();
               var61 = var4.g1n() * 4;
               int var19 = var4.dq();
               byte var55 = var4.dx();
               var14 = var4.dq() * 4;
               var54 = var4.cl();
               var17 = var4.eo();
               var12 = var4.eu();
               int var18 = var4.g1();
               var7 = var4.ea();
               var23 = var7 >> 16;
               var25 = var7 >> 8 & 255;
               var8 = var23 + (var7 >> 4 & 7);
               var9 = var25 + (var7 & 7);
               byte var64 = var4.g1s();
               var10 = var55 + var8;
               var11 = var64 + var9;
               if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104 && var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104 && 65535 != var54) {
                  var8 = 128 * var8 + 64;
                  var9 = 128 * var9 + 64;
                  var10 = 128 * var10 + 64;
                  var11 = 128 * var11 + 64;
                  Projectile var20 = new Projectile(var54, GameShell.mh * -1727408401, var8, var9, fq.getTileHeight(var8, var9, -1727408401 * GameShell.mh) - var14, var16 + ep * -1886224337, ep * -1886224337 + var17, var18, var19, var12, var61);
                  var20.setDestination(var10, var11, fq.getTileHeight(var10, var11, -1727408401 * GameShell.mh) - var61, var16 + -1886224337 * ep);
                  na.addFirst(var20);
               }

               var1.aq = null;
               return true;
            }

            if (var1.aq == ServerProt.cd) {
               EnumType.jb_renamed(lm.ac);
               var1.aq = null;
               return true;
            }

            if (ServerProt.ce == var1.aq) {
               World.vt.an();
               qg = qu * 1831095645;
               var1.aq = null;
               return true;
            }

            InterfaceParent var29;
            long var43;
            if (ServerProt.dm == var1.aq) {
               var23 = -1633313603 * var4.at + var1.al * 889658999;
               var25 = var4.cl();
               if (65535 == var25) {
                  var25 = -1;
               }

               var7 = var4.cl();
               if (-896157613 * or != var25) {
                  or = -32945189 * var25;
                  this.ln(false);
                  lm.mj_renamed(or * -896157613);
                  ax.ci_renamed(-896157613 * or);

                  for(var8 = 0; var8 < 100; ++var8) {
                     rf[var8] = true;
                  }
               }

               InterfaceParent var50;
               for(; var7-- > 0; var50.aw = true) {
                  var8 = var4.g4s();
                  var9 = var4.cl();
                  var10 = var4.g1();
                  var50 = (InterfaceParent)oc.get((long)var8);
                  if (var50 != null && var9 != 944864121 * var50.af) {
                     nv.closeInterface(var50, true);
                     var50 = null;
                  }

                  if (null == var50) {
                     var50 = dj.openInterface(var8, var9, var10);
                  }
               }

               for(var29 = (InterfaceParent)oc.first(); var29 != null; var29 = (InterfaceParent)oc.next()) {
                  if (var29.aw) {
                     var29.aw = false;
                  } else {
                     nv.closeInterface(var29, true);
                  }
               }

               rv = new NodeHashTable(512);

               while(-1633313603 * var4.at < var23) {
                  var8 = var4.g4s();
                  var9 = var4.cl();
                  var10 = var4.cl();
                  var11 = var4.g4s();

                  for(var12 = var9; var12 <= var10; ++var12) {
                     var43 = ((long)var8 << 32) + (long)var12;
                     rv.put(new IntegerNode(var11), var43);
                  }
               }

               var1.aq = null;
               return true;
            }

            if (var1.aq == ServerProt.cz) {
               var23 = var4.g1();
               var25 = var4.g1();
               var7 = var4.g1();
               var8 = var4.g1();
               ue[var23] = true;
               vq[var23] = var25;
               vw[var23] = var7;
               vf[var23] = var8;
               vg[var23] = 0;
               var1.aq = null;
               return true;
            }

            if (ServerProt.dg == var1.aq) {
               var23 = var4.ep();
               var7 = var4.db();
               var25 = var4.ep();
               if (var25 == 65535) {
                  var25 = -1;
               }

               var56 = iu[var23];
               if (null != var56) {
                  if (var25 == var56.ct * -1372355773 && var25 != -1) {
                     var9 = Inventory.getSeqType(var25, (byte)28).be * 789159225;
                     if (1 == var9) {
                        var56.cp = 0;
                        var56.cd = 0;
                        var56.dm = -401806131 * var7;
                        var56.dw = 0;
                     } else if (var9 == 2) {
                        var56.dw = 0;
                     }
                  } else if (var25 == -1 || -1 == -1372355773 * var56.ct || Inventory.getSeqType(var25, (byte)38).az * -1932560049 >= Inventory.getSeqType(var56.ct * -1372355773, (byte)25).az * -1932560049) {
                     var56.ct = var25 * -1690721941;
                     var56.cp = 0;
                     var56.cd = 0;
                     var56.dm = var7 * -401806131;
                     var56.dw = 0;
                     var56.eo = -1718989897 * var56.dn;
                  }
               }

               var1.aq = null;
               return true;
            }

            if (ServerProt.cj == var1.aq) {
               eb.an_renamed(var4, 889658999 * var1.al);
               var1.aq = null;
               return true;
            }

            if (ServerProt.ci == var1.aq) {
               for(var23 = 0; var23 < mc.length; ++var23) {
                  if (mc[var23] != null) {
                     mc[var23].ct = 1690721941;
                  }
               }

               for(var23 = 0; var23 < iu.length; ++var23) {
                  if (null != iu[var23]) {
                     iu[var23].ct = 1690721941;
                  }
               }

               var1.aq = null;
               return true;
            }

            if (var1.aq == ServerProt.by) {
               FontName.jt = var4.dq() * -522523151;
               aa.jp = var4.g1n() * 671253333;
               var1.aq = null;
               return true;
            }

            if (ServerProt.ep == var1.aq) {
               EnumType.jb_renamed(lm.al);
               var1.aq = null;
               return true;
            }

            if (var1.aq == ServerProt.dv) {
               var36 = var4.gbool();
               if (var36) {
                  if (null == fi.wc) {
                     fi.wc = new nf();
                  }
               } else {
                  fi.wc = null;
               }

               var1.aq = null;
               return true;
            }

            if (var1.aq == ServerProt.ds) {
               qz = 1358928753 * qu;
               var27 = var4.g1s();
               gr var84 = new gr(var4);
               gj var79;
               if (var27 >= 0) {
                  var79 = so[var27];
               } else {
                  var79 = MouseHandler.sx;
               }

               var84.an(var79);
               var1.aq = null;
               return true;
            }

            if (var1.aq == ServerProt.ar) {
               var23 = var4.g4s();
               var25 = var4.ep();
               Varps.an[var25] = var23;
               if (var23 != Varps.aw[var25]) {
                  Varps.aw[var25] = var23;
               }

               al.md_renamed(var25);
               qr[(qx += 165304329) * -261310919 - 1 & 31] = var25;
               var1.aq = null;
               return true;
            }

            if (var1.aq == ServerProt.en) {
               var23 = var4.g4s();
               var25 = var4.dq();
               var26 = gh.an_renamed(var23);
               ga.bf_renamed(var26, 1693987821 * MusicPatchNode.mi.aw.au, var25);
               fw.ma_renamed(var26);
               var1.aq = null;
               return true;
            }

            if (ServerProt.bo == var1.aq) {
               uk = false;
               uj = false;
               ub = false;
               uc = false;
               FontName.um = 0;
               MilliClock.ux = 0;
               ClientScriptFrame.ug = 0;
               ud = false;
               Archive.up = 0;
               MapElementType.uv = 0;
               fd.uu = 0;
               KeyHandler.ul = 0;
               gx.ut = 0;
               ex.uo = 0;
               av.uq = 0;
               ui = null;
               uz = null;
               ua = null;

               for(var23 = 0; var23 < 5; ++var23) {
                  ue[var23] = false;
               }

               var1.aq = null;
               return true;
            }

            if (ServerProt.at == var1.aq) {
               var23 = var4.da();
               if (65535 == var23) {
                  var23 = -1;
               }

               an.hf_renamed(var23);
               var1.aq = null;
               return true;
            }

            if (var1.aq == ServerProt.dh) {
               var23 = var4.cr();
               var25 = var4.da();
               if (var25 == 65535) {
                  var25 = -1;
               }

               CollisionMap.hy_renamed(var25, var23);
               var1.aq = null;
               return true;
            }

            if (ServerProt.dc == var1.aq) {
               var23 = var4.eg();
               var25 = var4.en();
               var7 = var4.eo();
               if (var7 == 65535) {
                  var7 = -1;
               }

               var51 = gh.an_renamed(var23);
               ObjType var48;
               if (!var51.bn) {
                  if (-1 == var7) {
                     var51.dr = 0;
                     var1.aq = null;
                     return true;
                  }

                  var48 = HeadbarUpdate.getObjType(var7);
                  var51.dr = 1732008820;
                  var51.dl = var7 * 509431749;
                  var51.dh = 874786355 * var48.ak;
                  var51.dp = var48.az * -2065246853;
                  var51.db = -1582059804 * var48.aj / var25 * -467727501;
                  fw.ma_renamed(var51);
               } else {
                  var51.gn = -1852876811 * var7;
                  var51.gv = var25 * -568259577;
                  var48 = HeadbarUpdate.getObjType(var7);
                  var51.dh = 874786355 * var48.ak;
                  var51.dp = -2065246853 * var48.az;
                  var51.du = 745454881 * var48.ad;
                  var51.dg = -183088313 * var48.ae;
                  var51.de = var48.ap * -347855449;
                  var51.db = var48.aj * 1614948179;
                  if (var48.bi * 1552863327 == 1) {
                     var51.dn = -761533221;
                  } else {
                     var51.dn = -1523066442;
                  }

                  if (-289037969 * var51.df > 0) {
                     var51.db = -467727501 * (100808544 * var51.db / (-289037969 * var51.df));
                  } else if (var51.bh * -1960603747 > 0) {
                     var51.db = 100808544 * var51.db / (-1960603747 * var51.bh) * -467727501;
                  }

                  fw.ma_renamed(var51);
               }

               var1.aq = null;
               return true;
            }

            boolean var46;
            if (var1.aq == ServerProt.eu) {
               uj = true;
               uk = false;
               ub = true;
               gx.ut = var4.g1() * -436480541;
               ex.uo = var4.g1() * 2032739133;
               var23 = var4.cl();
               var25 = var4.g1() * 128 + 64;
               var7 = var4.g1() * 128 + 64;
               var8 = var4.cl();
               ud = var4.gbool();
               var9 = var4.g1();
               var10 = 64 + 957080960 * gx.ut;
               var11 = 64 + 958794368 * ex.uo;
               var42 = false;
               var46 = false;
               if (ud) {
                  var12 = gk.kv * 1772923873;
                  var54 = fq.getTileHeight(var10, var11, -1727408401 * GameShell.mh) - var23;
               } else {
                  var12 = fq.getTileHeight(-2100544359 * bt.kx, ly.ke * -91399205, GameShell.mh * -1727408401) - 1772923873 * gk.kv;
                  var54 = var23;
               }

               ui = new rr(bt.kx * -2100544359, ly.ke * -91399205, var12, var10, var11, var54, var25, var7, var8, var9);
               var1.aq = null;
               return true;
            }

            if (ServerProt.bt == var1.aq) {
               if (-1 != -896157613 * or) {
                  ec.mu_renamed(-896157613 * or, 0);
               }

               var1.aq = null;
               return true;
            }

            if (ServerProt.dz == var1.aq && uj) {
               uk = true;
               uc = false;
               ub = false;

               for(var23 = 0; var23 < 5; ++var23) {
                  ue[var23] = false;
               }

               var1.aq = null;
               return true;
            }

            if (var1.aq == ServerProt.ap) {
               te = var4.g1() * -1970850269;
               if (1494100363 * te == 255) {
                  te = 0;
               }

               th = var4.g1() * 875414437;
               if (255 == th * -1748014035) {
                  th = 0;
               }

               var1.aq = null;
               return true;
            }

            if (ServerProt.ez == var1.aq) {
               uj = true;
               uk = false;
               uc = true;
               var23 = var4.cg();
               var25 = var4.cg();
               var7 = am.iz_renamed(WorldMapSectionType.ky * 1897923909 + var25 & 2027);
               var8 = var23 + ek.kh * -1010818347;
               var9 = var4.cl();
               var10 = var4.g1();
               uz = new rf(WorldMapSectionType.ky * 1897923909, var7, var9, var10);
               ua = new rf(-1010818347 * ek.kh, var8, var9, var10);
               var1.aq = null;
               return true;
            }

            if (var1.aq == ServerProt.ak) {
               ds.rx = new qt(MiniMenuEntry.qh);
               var1.aq = null;
               return true;
            }

            if (var1.aq == ServerProt.cq) {
               byte[] var77 = new byte[889658999 * var1.al];
               var4.aq(var77, 0, var77.length);
               Packet var82 = new Packet(var77);
               var66 = var82.cw();
               Ignored.af_renamed(var66, true, false);
               var1.aq = null;
               return true;
            }

            if (ServerProt.dj == var1.aq) {
               uj = true;
               uk = false;
               ub = false;
               gx.ut = var4.g1() * -436480541;
               ex.uo = var4.g1() * 2032739133;
               av.uq = var4.cl() * -1725771559;
               KeyHandler.ul = var4.g1() * -2052337259;
               fd.uu = var4.g1() * -449391195;
               if (fd.uu * -1514927571 >= 100) {
                  bt.kx = gx.ut * -1848049280 + -317330880;
                  ly.ke = ex.uo * 2021222272 + -1328933696;
                  gk.kv = (fq.getTileHeight(bt.kx * -2100544359, ly.ke * -91399205, GameShell.mh * -1727408401) - av.uq * -887836823) * -424093663;
               }

               var1.aq = null;
               return true;
            }

            if (ServerProt.cx == var1.aq) {
               bt.no_renamed();
               var27 = var4.g1s();
               fa var81 = new fa(var4);
               fj var60;
               if (var27 >= 0) {
                  var60 = sg[var27];
               } else {
                  var60 = ObjType.sq;
               }

               var81.an(var60);
               var1.aq = null;
               return true;
            }

            if (var1.aq == ServerProt.ad) {
               var23 = var4.cl();
               var25 = var4.g1();
               var7 = var4.cl();
               fh.he_renamed(var23, var25, var7);
               var1.aq = null;
               return true;
            }

            if (ServerProt.cp == var1.aq) {
               var23 = var4.g4s();
               if (var23 != 1263827259 * ly) {
                  ly = var23 * 1409021939;
                  gq.nk_renamed();
               }

               var1.aq = null;
               return true;
            }

            if (var1.aq == ServerProt.cn) {
               ClientProt.mp_renamed();
               pk = var4.cl() * 440508051;
               qa = -235455367 * qu;
               var1.aq = null;
               return true;
            }

            if (ServerProt.dd == var1.aq) {
               var23 = var4.eg();
               var25 = var4.eo();
               var26 = gh.an_renamed(var23);
               if (null != var26 && 0 == var26.bg * 883712245) {
                  if (var25 > -1273374131 * var26.cl - var26.cc * 1473950221) {
                     var25 = -1273374131 * var26.cl - 1473950221 * var26.cc;
                  }

                  if (var25 < 0) {
                     var25 = 0;
                  }

                  if (var25 != var26.cm * 1223232735) {
                     var26.cm = 946188063 * var25;
                     fw.ma_renamed(var26);
                  }
               }

               var1.aq = null;
               return true;
            }

            if (ServerProt.ca == var1.aq) {
               var24 = var4.cw();
               var25 = var4.eg();
               var26 = gh.an_renamed(var25);
               if (!var24.equals(var26.ds)) {
                  var26.ds = var24;
                  fw.ma_renamed(var26);
               }

               var1.aq = null;
               return true;
            }

            if (ServerProt.db == var1.aq) {
               bt.no_renamed();
               var27 = var4.g1s();
               if (1 == var1.al * 889658999) {
                  if (var27 >= 0) {
                     sg[var27] = null;
                  } else {
                     ObjType.sq = null;
                  }

                  var1.aq = null;
                  return true;
               }

               if (var27 >= 0) {
                  sg[var27] = new fj(var4);
               } else {
                  ObjType.sq = new fj(var4);
               }

               var1.aq = null;
               return true;
            }

            if (var1.aq == ServerProt.er) {
               var8 = var4.g1();
               var23 = var4.cl();
               var44 = iu[var23];
               var7 = var4.cl();
               var25 = var4.g4s();
               if (null != var44) {
                  var44.cj(var8, var7, var25 >> 16, var25 & '\uffff');
               }

               var1.aq = null;
               return true;
            }

            if (var1.aq == ServerProt.bv) {
               for(var23 = 0; var23 < Varps.aw.length; ++var23) {
                  if (Varps.an[var23] != Varps.aw[var23]) {
                     Varps.aw[var23] = Varps.an[var23];
                     al.md_renamed(var23);
                     qr[(qx += 165304329) * -261310919 - 1 & 31] = var23;
                  }
               }

               var1.aq = null;
               return true;
            }

            if (ServerProt.du == var1.aq) {
               var23 = var4.g4s();
               var25 = var4.cl();
               if (var23 < -70000) {
                  var25 += 32768;
               }

               if (var23 >= 0) {
                  var26 = gh.an_renamed(var23);
               } else {
                  var26 = null;
               }

               for(; -1633313603 * var4.at < var1.al * 889658999; oy.itemContainerSetItem(var25, var8, var9 - 1, var10, (byte)96)) {
                  var8 = var4.cd();
                  var9 = var4.cl();
                  var10 = 0;
                  if (0 != var9) {
                     var10 = var4.g1();
                     if (255 == var10) {
                        var10 = var4.g4s();
                     }
                  }

                  if (null != var26 && var8 >= 0 && var8 < var26.gb.length) {
                     var26.gb[var8] = var9;
                     var26.gp[var8] = var10;
                  }
               }

               if (null != var26) {
                  fw.ma_renamed(var26);
               }

               ClientProt.mp_renamed();
               qj[(qc += -565562765) * -710491461 - 1 & 31] = var25 & 32767;
               var1.aq = null;
               return true;
            }

            if (ServerProt.ac == var1.aq) {
               bx.hc_renamed();
               var1.aq = null;
               return false;
            }

            if (var1.aq == ServerProt.cl) {
               return this.jp(var1, 1);
            }

            if (ServerProt.ej == var1.aq) {
               uj = true;
               uk = false;
               uc = true;
               var23 = qj.ig_renamed(var4.cg() & 2027);
               var25 = am.iz_renamed(var4.cg() & 2027);
               var7 = var4.cl();
               var8 = var4.g1();
               uz = new rf(1897923909 * WorldMapSectionType.ky, var25, var7, var8);
               ua = new rf(-1010818347 * ek.kh, var23, var7, var8);
               var1.aq = null;
               return true;
            }

            if (ServerProt.di == var1.aq) {
               ClientProt.mp_renamed();
               pj = var4.cg() * 717110291;
               qa = qu * -235455367;
               var1.aq = null;
               return true;
            }

            if (var1.aq == ServerProt.bn) {
               EnumType.jb_renamed(lm.at);
               var1.aq = null;
               return true;
            }

            if (var1.aq == ServerProt.dq) {
               FontName.jt = var4.g1() * -522523151;
               aa.jp = var4.db() * 671253333;

               for(var23 = 1555915261 * aa.jp; var23 < 8 + aa.jp * 1555915261; ++var23) {
                  for(var25 = FontName.jt * -191732975; var25 < FontName.jt * -191732975 + 8; ++var25) {
                     if (null != nr[GameShell.mh * -1727408401][var23][var25]) {
                        nr[GameShell.mh * -1727408401][var23][var25] = null;
                        em.kd_renamed(var23, var25);
                     }
                  }
               }

               for(dg var52 = (dg)nn.last(); null != var52; var52 = (dg)nn.previous()) {
                  if (68300005 * var52.aw >= 1555915261 * aa.jp && var52.aw * 68300005 < 8 + 1555915261 * aa.jp && var52.ac * 800888185 >= -191732975 * FontName.jt && 800888185 * var52.ac < 8 + -191732975 * FontName.jt && var52.af * 593068225 == -1727408401 * GameShell.mh) {
                     var52.ag = 0;
                  }
               }

               var1.aq = null;
               return true;
            }

            Component var35;
            if (ServerProt.bh == var1.aq) {
               var23 = var4.eg();
               var25 = var4.eg();
               InterfaceParent var41 = (InterfaceParent)oc.get((long)var23);
               var29 = (InterfaceParent)oc.get((long)var25);
               if (var29 != null) {
                  nv.closeInterface(var29, var41 == null || var29.af * 944864121 != var41.af * 944864121);
               }

               if (var41 != null) {
                  var41.remove();
                  oc.put(var41, (long)var25);
               }

               var35 = gh.an_renamed(var23);
               if (var35 != null) {
                  fw.ma_renamed(var35);
               }

               var35 = gh.an_renamed(var25);
               if (var35 != null) {
                  fw.ma_renamed(var35);
                  WallDecoration.lz_renamed(hn.ap[1713081171 * var35.bs >>> 16], var35, true);
               }

               if (-1 != or * -896157613) {
                  ec.mu_renamed(or * -896157613, 1);
               }

               var1.aq = null;
               return true;
            }

            if (var1.aq == ServerProt.cr) {
               World var45 = new World();
               var45.ai = var4.cw();
               var45.ay = var4.cl() * -2098511939;
               var25 = var4.g4s();
               var45.ao = var25 * 1038974297;
               fd.hi_renamed(45);
               var3.aq();
               var3 = null;
               FloorOverlayType.ah_renamed(var45);
               var1.aq = null;
               return false;
            }

            if (ServerProt.cm == var1.aq) {
               fv.kb_renamed(true, var4);
               var1.aq = null;
               return true;
            }

            if (ServerProt.aq == var1.aq) {
               EnumType.jb_renamed(lm.ay);
               var1.aq = null;
               return true;
            }

            if (var1.aq == ServerProt.do) {
               var23 = var4.g4s();
               var47 = gh.an_renamed(var23);

               for(var7 = 0; var7 < var47.gb.length; ++var7) {
                  var47.gb[var7] = -1;
                  var47.gb[var7] = 0;
               }

               fw.ma_renamed(var47);
               var1.aq = null;
               return true;
            }

            if (ServerProt.da == var1.aq) {
               uj = true;
               uk = false;
               uc = false;
               FontName.um = var4.g1() * 775826691;
               MilliClock.ux = var4.g1() * 732155751;
               ClientScriptFrame.ug = var4.cl() * -213879109;
               Archive.up = var4.g1() * -1982200011;
               MapElementType.uv = var4.g1() * -2025357;
               if (942361787 * MapElementType.uv >= 100) {
                  var23 = 64 + 332584320 * FontName.um;
                  var25 = 64 + MilliClock.ux * -1804719232;
                  var7 = fq.getTileHeight(var23, var25, GameShell.mh * -1727408401) - ClientScriptFrame.ug * 1496735347;
                  var8 = var23 - -2100544359 * bt.kx;
                  var9 = var7 - gk.kv * 1772923873;
                  var10 = var25 - -91399205 * ly.ke;
                  var11 = (int)Math.sqrt((double)(var8 * var8 + var10 * var10));
                  WorldMapSectionType.ky = ((int)(Math.atan2((double)var9, (double)var11) * 325.9490051269531) & 2047) * 528729485;
                  ek.kh = ((int)(Math.atan2((double)var8, (double)var10) * -325.9490051269531) & 2047) * -1545206147;
                  if (1897923909 * WorldMapSectionType.ky < 128) {
                     WorldMapSectionType.ky = -1042102656;
                  }

                  if (1897923909 * WorldMapSectionType.ky > 383) {
                     WorldMapSectionType.ky = 639929843;
                  }
               }

               var1.aq = null;
               return true;
            }

            if (ServerProt.bf == var1.aq) {
               ClientScriptFrame.nt_renamed(var4.cw());
               var1.aq = null;
               return true;
            }

            if (ServerProt.eg == var1.aq) {
               var8 = var4.g1();
               var23 = var4.cl();
               Player var38;
               if (var23 == -549033243 * mg) {
                  var38 = MusicPatchNode.mi;
               } else {
                  var38 = mc[var23];
               }

               var25 = var4.cl();
               var7 = var4.g4s();
               if (var38 != null) {
                  var38.cj(var8, var25, var7 >> 16, var7 & '\uffff');
               }

               var1.aq = null;
               return true;
            }

            if (var1.aq == ServerProt.ao) {
               EnumType.jb_renamed(lm.au);
               var1.aq = null;
               return true;
            }

            if (ServerProt.ag == var1.aq) {
               ClientProt.mp_renamed();
               var23 = var4.dq();
               var25 = var4.dq();
               var7 = var4.en();
               nu[var23] = var7;
               ng[var23] = var25;
               ny[var23] = 1;

               for(var8 = 0; var8 < 98; ++var8) {
                  if (var7 >= Skills.aw[var8]) {
                     ny[var23] = 2 + var8;
                  }
               }

               qs[(qf += 1059665337) * -744210295 - 1 & 31] = var23;
               var1.aq = null;
               return true;
            }

            if (var1.aq == ServerProt.bu) {
               ec.loadRegions(true, var1.ab);
               var1.aq = null;
               return true;
            }

            if (ServerProt.ba == var1.aq) {
               var23 = var4.eo();
               var25 = var4.ep();
               var7 = var4.er();
               var8 = var4.cl();
               var35 = gh.an_renamed(var7);
               if (var25 != 797932055 * var35.dh || var35.dp * -480949115 != var23 || var8 != 942674363 * var35.db) {
                  var35.dh = var25 * -142910041;
                  var35.dp = -230241203 * var23;
                  var35.db = var8 * -467727501;
                  fw.ma_renamed(var35);
               }

               var1.aq = null;
               return true;
            }

            if (ServerProt.cy == var1.aq) {
               var10 = var4.g1();
               var11 = var10 >> 2;
               var12 = var10 & 3;
               var54 = jy[var11];
               var7 = var4.ej();
               var23 = var7 >> 16;
               var25 = var7 >> 8 & 255;
               var8 = var23 + (var7 >> 4 & 7);
               var9 = (var7 & 7) + var25;
               var14 = var4.da();
               if (var8 >= 0 && var9 >= 0 && var8 < 103 && var9 < 103) {
                  if (var54 == 0) {
                     Wall var75 = bx.js.az(GameShell.mh * -1727408401, var8, var9);
                     if (null != var75) {
                        var16 = InterfaceParent.at(var75.al * -4009183385476919801L);
                        if (var11 == 2) {
                           var75.ab = new DynamicObject(var16, 2, 4 + var12, GameShell.mh * -1727408401, var8, var9, var14, false, var75.ab);
                           var75.aq = new DynamicObject(var16, 2, var12 + 1 & 3, -1727408401 * GameShell.mh, var8, var9, var14, false, var75.aq);
                        } else {
                           var75.ab = new DynamicObject(var16, var11, var12, -1727408401 * GameShell.mh, var8, var9, var14, false, var75.ab);
                        }
                     }
                  } else if (var54 == 1) {
                     WallDecoration var74 = bx.js.ad(GameShell.mh * -1727408401, var8, var9);
                     if (var74 != null) {
                        var16 = InterfaceParent.at(var74.aa * -4691380879163567243L);
                        if (var11 != 4 && var11 != 5) {
                           if (6 == var11) {
                              var74.al = new DynamicObject(var16, 4, 4 + var12, GameShell.mh * -1727408401, var8, var9, var14, false, var74.al);
                           } else if (7 == var11) {
                              var74.al = new DynamicObject(var16, 4, 4 + (var12 + 2 & 3), -1727408401 * GameShell.mh, var8, var9, var14, false, var74.al);
                           } else if (8 == var11) {
                              var74.al = new DynamicObject(var16, 4, var12 + 4, GameShell.mh * -1727408401, var8, var9, var14, false, var74.al);
                              var74.at = new DynamicObject(var16, 4, (var12 + 2 & 3) + 4, GameShell.mh * -1727408401, var8, var9, var14, false, var74.at);
                           }
                        } else {
                           var74.al = new DynamicObject(var16, 4, var12, GameShell.mh * -1727408401, var8, var9, var14, false, var74.al);
                        }
                     }
                  } else if (var54 == 2) {
                     var69 = bx.js.ae(-1727408401 * GameShell.mh, var8, var9);
                     if (var11 == 11) {
                        var11 = 10;
                     }

                     if (null != var69) {
                        var69.ab = new DynamicObject(InterfaceParent.at(var69.ax * 5016412888503339625L), var11, var12, GameShell.mh * -1727408401, var8, var9, var14, false, var69.ab);
                     }
                  } else if (var54 == 3) {
                     FloorDecoration var72 = bx.js.ap(GameShell.mh * -1727408401, var8, var9);
                     if (var72 != null) {
                        var72.ac = new DynamicObject(InterfaceParent.at(var72.au * 3423223696102332293L), 22, var12, GameShell.mh * -1727408401, var8, var9, var14, false, var72.ac);
                     }
                  }
               }

               var1.aq = null;
               return true;
            }

            if (var1.aq == ServerProt.bg) {
               EnumType.jb_renamed(lm.aw);
               var1.aq = null;
               return true;
            }

            if (ServerProt.cg == var1.aq) {
               var23 = var4.g1();
               jn.nx_renamed(var23);
               var1.aq = null;
               return true;
            }

            if (ServerProt.ck == var1.aq) {
               var36 = var4.g1() == 1;
               if (var36) {
                  mj.wd = (Formatting.af_renamed() - var4.g8s()) * 9023382677616235961L;
                  oh.vj = new GrandExchangeEvents(var4, true);
               } else {
                  oh.vj = null;
               }

               qv = qu * -707539581;
               var1.aq = null;
               return true;
            }

            if (var1.aq == ServerProt.ef) {
               uj = true;
               uk = false;
               uc = true;
               FontName.um = var4.g1() * 775826691;
               MilliClock.ux = var4.g1() * 732155751;
               ClientScriptFrame.ug = var4.cl() * -213879109;
               var23 = var4.cl();
               var25 = var4.g1();
               var7 = 64 + 332584320 * FontName.um;
               var8 = -1804719232 * MilliClock.ux + 64;
               var9 = fq.getTileHeight(var7, var8, GameShell.mh * -1727408401) - ClientScriptFrame.ug * 1496735347;
               var10 = var7 - -2100544359 * bt.kx;
               var11 = var9 - gk.kv * 1772923873;
               var12 = var8 - ly.ke * -91399205;
               double var53 = Math.sqrt((double)(var12 * var12 + var10 * var10));
               var61 = am.iz_renamed((int)(Math.atan2((double)var11, var53) * 325.9490051269531) & 2047);
               var16 = qj.ig_renamed((int)(Math.atan2((double)var10, (double)var12) * -325.9490051269531) & 2047);
               uz = new rf(1897923909 * WorldMapSectionType.ky, var61, var23, var25);
               ua = new rf(-1010818347 * ek.kh, var16, var23, var25);
               var1.aq = null;
               return true;
            }

            if (var1.aq == ServerProt.au) {
               FloorUnderlayType.sn = pj.af_renamed(var4.g1());
               var1.aq = null;
               return true;
            }

            if (var1.aq == ServerProt.ch) {
               World.vt.ab.read(var4, 889658999 * var1.al);
               cz.nd_renamed();
               qg = 1831095645 * qu;
               var1.aq = null;
               return true;
            }

            if (var1.aq == ServerProt.bj) {
               fv.kb_renamed(false, var4);
               var1.aq = null;
               return true;
            }

            if (ServerProt.bb == var1.aq) {
               if (ds.rx == null) {
                  ds.rx = new qt(MiniMenuEntry.qh);
               }

               te var31 = MiniMenuEntry.qh.ac(var4);
               ds.rx.af.an(-52705447 * var31.af, var31.an);
               qt[(qn += -2007914853) * 2106773395 - 1 & 31] = var31.af * -52705447;
               var1.aq = null;
               return true;
            }

            if (var1.aq == ServerProt.dk) {
               var27 = var4.dj();
               var25 = var4.cl();
               Varps.an[var25] = var27;
               if (Varps.aw[var25] != var27) {
                  Varps.aw[var25] = var27;
               }

               al.md_renamed(var25);
               qr[(qx += 165304329) * -261310919 - 1 & 31] = var25;
               var1.aq = null;
               return true;
            }

            if (var1.aq == ServerProt.ah) {
               var23 = var4.ep();
               User.ab_renamed(var23);
               qj[(qc += -565562765) * -710491461 - 1 & 31] = var23 & 32767;
               var1.aq = null;
               return true;
            }

            if (ServerProt.bz == var1.aq) {
               var23 = var4.eo();
               var25 = var4.en();
               var26 = gh.an_renamed(var25);
               if (var26.dr * -123768459 != 6 || var26.dl * -168077555 != var23) {
                  var26.dr = -1696954066;
                  var26.dl = 509431749 * var23;
                  fw.ma_renamed(var26);
               }

               var1.aq = null;
               return true;
            }

            if (var1.aq == ServerProt.bi) {
               var24 = var4.cw();
               var28 = (long)var4.cl();
               var30 = (long)var4.cr();
               PlayerType var37 = (PlayerType)StructType.findEnumerated(StudioGame.au_renamed(), var4.g1());
               long var40 = var30 + (var28 << 32);
               var46 = false;

               for(var14 = 0; var14 < 100; ++var14) {
                  if (st[var14] == var40) {
                     var46 = true;
                     break;
                  }
               }

               if (World.vt.aq(new Username(var24, co.cn))) {
                  var46 = true;
               }

               if (!var46 && 0 == 43311027 * ma) {
                  st[1960529059 * sf] = var40;
                  sf = (1 + sf * 1960529059) % 100 * 1561052939;
                  var49 = AbstractFont.escapeBrackets(er.ao_renamed(TilePaint.aw_renamed(var4)));
                  if (var37.as) {
                     var61 = 7;
                  } else {
                     var61 = 3;
                  }

                  if (2138745227 * var37.am != -1) {
                     es.an_renamed(var61, ArchiveDiskActionHandler.af_renamed(var37.am * 2138745227) + var24, var49);
                  } else {
                     es.an_renamed(var61, var24, var49);
                  }
               }

               var1.aq = null;
               return true;
            }

            if (ServerProt.bw == var1.aq) {
               var23 = var4.eo();
               var25 = var4.er();
               var26 = gh.an_renamed(var25);
               if (-123768459 * var26.dr != 2 || var23 != var26.dl * -168077555) {
                  var26.dr = 866004410;
                  var26.dl = 509431749 * var23;
                  fw.ma_renamed(var26);
               }

               var1.aq = null;
               return true;
            }

            if (ServerProt.dw == var1.aq) {
               qz = qu * 1358928753;
               var27 = var4.g1s();
               if (1 == 889658999 * var1.al) {
                  if (var27 >= 0) {
                     so[var27] = null;
                  } else {
                     MouseHandler.sx = null;
                  }

                  var1.aq = null;
                  return true;
               }

               if (var27 >= 0) {
                  so[var27] = new gj(var4);
               } else {
                  MouseHandler.sx = new gj(var4);
               }

               var1.aq = null;
               return true;
            }

            if (ServerProt.bq == var1.aq) {
               for(var23 = 0; var23 < gz.an * -774485467; ++var23) {
                  gz var33 = GraphicsDefaults.af_renamed(var23);
                  if (null != var33) {
                     Varps.an[var23] = 0;
                     Varps.aw[var23] = 0;
                  }
               }

               ClientProt.mp_renamed();
               qx += 994771232;
               var1.aq = null;
               return true;
            }

            if (var1.aq == ServerProt.av) {
               var23 = var4.g4s();
               InterfaceParent var32 = (InterfaceParent)oc.get((long)var23);
               if (var32 != null) {
                  nv.closeInterface(var32, true);
               }

               if (pg != null) {
                  fw.ma_renamed(pg);
                  pg = null;
               }

               var1.aq = null;
               return true;
            }

            if (var1.aq == ServerProt.ay) {
               var23 = var4.dq();
               var6 = var4.cw();
               var7 = var4.dq();
               if (var23 >= 1 && var23 <= 8) {
                  if (var6.equalsIgnoreCase(Strings.at)) {
                     var6 = null;
                  }

                  nd[var23 - 1] = var6;
                  no[var23 - 1] = var7 == 0;
               }

               var1.aq = null;
               return true;
            }

            if (var1.aq == ServerProt.dr) {
               var24 = var4.cw();
               var6 = AbstractFont.escapeBrackets(er.ao_renamed(TilePaint.aw_renamed(var4)));
               es.an_renamed(6, var24, var6);
               var1.aq = null;
               return true;
            }

            if (ServerProt.cv == var1.aq) {
               var24 = var4.cw();
               var28 = var4.g8s();
               var30 = (long)var4.cl();
               var34 = (long)var4.cr();
               PlayerType var39 = (PlayerType)StructType.findEnumerated(StudioGame.au_renamed(), var4.g1());
               var43 = var34 + (var30 << 32);
               boolean var15 = false;

               for(var16 = 0; var16 < 100; ++var16) {
                  if (st[var16] == var43) {
                     var15 = true;
                     break;
                  }
               }

               if (var39.aj && World.vt.aq(new Username(var24, co.cn))) {
                  var15 = true;
               }

               if (!var15 && ma * 43311027 == 0) {
                  st[1960529059 * sf] = var43;
                  sf = 1561052939 * ((1 + 1960529059 * sf) % 100);
                  var63 = AbstractFont.escapeBrackets(er.ao_renamed(TilePaint.aw_renamed(var4)));
                  if (-1 != var39.am * 2138745227) {
                     fo.addMessage(9, ArchiveDiskActionHandler.af_renamed(var39.am * 2138745227) + var24, var63, FloorUnderlayType.longToTitleString(var28));
                  } else {
                     fo.addMessage(9, var24, var63, FloorUnderlayType.longToTitleString(var28));
                  }
               }

               var1.aq = null;
               return true;
            }

            if (var1.aq == ServerProt.eq) {
               var11 = var4.g1();
               var12 = var4.eo();
               var7 = var4.ej();
               var23 = var7 >> 16;
               var25 = var7 >> 8 & 255;
               var8 = var23 + (var7 >> 4 & 7);
               var9 = (var7 & 7) + var25;
               var10 = var4.cl();
               if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
                  var8 = 64 + var8 * 128;
                  var9 = var9 * 128 + 64;
                  GraphicsObject var13 = new GraphicsObject(var10, -1727408401 * GameShell.mh, var8, var9, fq.getTileHeight(var8, var9, GameShell.mh * -1727408401) - var11, var12, ep * -1886224337);
                  np.addFirst(var13);
               }

               var1.aq = null;
               return true;
            }

            if (var1.aq == ServerProt.ct) {
               sj = var4.dq() * 1410976369;
               su = var4.g1() * -2053731769;
               var1.aq = null;
               return true;
            }

            if (ServerProt.cw == var1.aq) {
               ea = var4.da() * 860606706;
               qa = -235455367 * qu;
               var1.aq = null;
               return true;
            }

            if (ServerProt.as == var1.aq) {
               eu = var4.g1() * -1378513753;
               if (1 == eu * 633821975) {
                  es = var4.cl() * -431692551;
               }

               if (eu * 633821975 >= 2 && eu * 633821975 <= 6) {
                  if (633821975 * eu == 2) {
                     eg = 2045745472;
                     ed = 349971264;
                  }

                  if (3 == eu * 633821975) {
                     eg = 0;
                     ed = 349971264;
                  }

                  if (eu * 633821975 == 4) {
                     eg = -203476352;
                     ed = 349971264;
                  }

                  if (5 == 633821975 * eu) {
                     eg = 2045745472;
                     ed = 0;
                  }

                  if (6 == 633821975 * eu) {
                     eg = 2045745472;
                     ed = 699942528;
                  }

                  eu = 1537939790;
                  el = var4.cl() * -501846925;
                  en = var4.cl() * 1886247917;
                  er = var4.g1() * 233713123;
               }

               if (10 == eu * 633821975) {
                  eb = var4.cl() * -1034603829;
               }

               var1.aq = null;
               return true;
            }

            if (ServerProt.bx == var1.aq) {
               var23 = var4.g1n();
               var25 = var4.da();
               var7 = var4.er();
               var29 = (InterfaceParent)oc.get((long)var7);
               if (null != var29) {
                  nv.closeInterface(var29, var25 != 944864121 * var29.af);
               }

               dj.openInterface(var7, var25, var23);
               var1.aq = null;
               return true;
            }

            if (ServerProt.bd == var1.aq) {
               var23 = var4.g4s();
               var25 = var4.cl();
               if (var23 < -70000) {
                  var25 += 32768;
               }

               if (var23 >= 0) {
                  var26 = gh.an_renamed(var23);
               } else {
                  var26 = null;
               }

               if (var26 != null) {
                  for(var8 = 0; var8 < var26.gb.length; ++var8) {
                     var26.gb[var8] = 0;
                     var26.gp[var8] = 0;
                  }
               }

               WorldMapRegion.au_renamed(var25);
               var8 = var4.cl();

               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var4.da();
                  var11 = var4.dq();
                  if (var11 == 255) {
                     var11 = var4.er();
                  }

                  if (null != var26 && var9 < var26.gb.length) {
                     var26.gb[var9] = var10;
                     var26.gp[var9] = var11;
                  }

                  oy.itemContainerSetItem(var25, var9, var10 - 1, var11, (byte)75);
               }

               if (var26 != null) {
                  fw.ma_renamed(var26);
               }

               ClientProt.mp_renamed();
               qj[(qc += -565562765) * -710491461 - 1 & 31] = var25 & 32767;
               var1.aq = null;
               return true;
            }

            if (ServerProt.df == var1.aq) {
               EnumType.jb_renamed(lm.an);
               var1.aq = null;
               return true;
            }

            ob.af_renamed("" + (null != var1.aq ? 1287795301 * var1.aq.ed : -1) + Formatting.an + (null != var1.ax ? 1287795301 * var1.ax.ed : -1) + Formatting.an + (null != var1.ai ? 1287795301 * var1.ai.ed : -1) + Formatting.an + var1.al * 889658999, (Throwable)null);
            bx.hc_renamed();
         } catch (IOException var21) {
            ng.ht_renamed();
         } catch (Exception var22) {
            var6 = "" + (var1.aq != null ? 1287795301 * var1.aq.ed : -1) + Formatting.an + (var1.ax != null ? 1287795301 * var1.ax.ed : -1) + Formatting.an + (null != var1.ai ? 1287795301 * var1.ai.ed : -1) + Formatting.an + 889658999 * var1.al + Formatting.an + (MusicPatchNode.mi.dy[0] + -1232093375 * jm.ib) + Formatting.an + (Scenery.jc * 827352769 + MusicPatchNode.mi.ds[0]) + Formatting.an;

            for(var7 = 0; var7 < 889658999 * var1.al && var7 < 50; ++var7) {
               var6 = var6 + var4.al[var7] + Formatting.an;
            }

            ob.af_renamed(var6, var22);
            bx.hc_renamed();
         }

         return true;
      }
   }

   final void ko() {
      qj.kn_renamed();
      if (pr == null) {
         int var2 = -1222491879 * MouseHandler.ar;
         int var3;
         int var4;
         int var5;
         int var6;
         int var7;
         int var8;
         if (nt) {
            int var9;
            if (var2 != 1 && (su.ev || 4 != var2)) {
               var3 = MouseHandler.ay * -2063363905;
               var4 = MouseHandler.ao * -1224153235;
               if (var3 < -1141903185 * hl.nf - 10 || var3 > -960964385 * DesktopPlatformInfoProvider.nj + -1141903185 * hl.nf + 10 || var4 < ArchiveLoader.nc * -115281635 - 10 || var4 > ArchiveLoader.nc * -115281635 + fq.nv * 245252327 + 10) {
                  nt = false;
                  var5 = hl.nf * -1141903185;
                  var6 = ArchiveLoader.nc * -115281635;
                  var7 = DesktopPlatformInfoProvider.nj * -960964385;
                  var8 = 245252327 * fq.nv;

                  for(var9 = 0; var9 < -356793645 * rr; ++var9) {
                     if (ra[var9] + rh[var9] > var5 && rh[var9] < var5 + var7 && ri[var9] + rb[var9] > var6 && rb[var9] < var8 + var6) {
                        rf[var9] = true;
                     }
                  }
               }
            }

            if (var2 == 1 || !su.ev && var2 == 4) {
               var3 = -1141903185 * hl.nf;
               var4 = ArchiveLoader.nc * -115281635;
               var5 = -960964385 * DesktopPlatformInfoProvider.nj;
               var6 = 2020601481 * MouseHandler.am;
               var7 = 1163896205 * MouseHandler.as;
               var8 = -1;

               int var10;
               for(var9 = 0; var9 < ne * 730065501; ++var9) {
                  var10 = (ne * 730065501 - 1 - var9) * 15 + 31 + var4;
                  if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < 3 + var10) {
                     var8 = var9;
                  }
               }

               int var11;
               int var12;
               int var13;
               if (var8 != -1 && var8 >= 0) {
                  var9 = nk[var8];
                  var10 = ni[var8];
                  var11 = nh[var8];
                  var12 = nq[var8];
                  var13 = oi[var8];
                  String var14 = og[var8];
                  String var15 = ok[var8];
                  ar.ke_renamed(var9, var10, var11, var12, var13, var14, var15, 2020601481 * MouseHandler.am, MouseHandler.as * 1163896205);
               }

               nt = false;
               var9 = hl.nf * -1141903185;
               var10 = -115281635 * ArchiveLoader.nc;
               var11 = DesktopPlatformInfoProvider.nj * -960964385;
               var12 = fq.nv * 245252327;

               for(var13 = 0; var13 < rr * -356793645; ++var13) {
                  if (ra[var13] + rh[var13] > var9 && rh[var13] < var11 + var9 && rb[var13] + ri[var13] > var10 && rb[var13] < var10 + var12) {
                     rf[var13] = true;
                  }
               }
            }
         } else {
            var3 = DynamicObject.lm_renamed();
            if ((1 == var2 || !su.ev && 4 == var2) && this.kr()) {
               var2 = 2;
            }

            if ((var2 == 1 || !su.ev && var2 == 4) && ne * 730065501 > 0 && var3 >= 0) {
               var4 = nk[var3];
               var5 = ni[var3];
               var6 = nh[var3];
               var7 = nq[var3];
               var8 = oi[var3];
               String var16 = og[var3];
               String var17 = ok[var3];
               ar.ke_renamed(var4, var5, var6, var7, var8, var16, var17, 2020601481 * MouseHandler.am, MouseHandler.as * 1163896205);
            }

            if (2 == var2 && ne * 730065501 > 0) {
               this.openMiniMenu(2020601481 * MouseHandler.am, 1163896205 * MouseHandler.as);
            }
         }

      }
   }

   final boolean kr() {
      int var2 = DynamicObject.lm_renamed();
      boolean var3 = nb && 730065501 * ne > 2;
      if (!var3) {
         boolean var4;
         if (var2 < 0) {
            var4 = false;
         } else {
            int var5 = nh[var2];
            if (var5 >= 2000) {
               var5 -= 2000;
            }

            if (1007 == var5) {
               var4 = true;
            } else {
               var4 = false;
            }
         }

         var3 = var4;
      }

      return var3 && !ox[var2];
   }

   final void openMiniMenu(int var1, int var2) {
      qb.openMenu0(var1, var2);
      var1 -= -82629945 * vd;
      var2 -= 1352043351 * vx;
      bx.js.menuOpen(GameShell.mh * -1727408401, var1, var2, false);
      nt = true;
   }

   final void ln(boolean var1) {
      SeqType.lc_renamed(or * -896157613, aj * -1687260435, kd.ak * 1658005443, var1);
   }

   void alignComponent(Component var1) {
      Component var3 = -1 == 913615679 * var1.cu ? null : gh.an_renamed(913615679 * var1.cu);
      int var4;
      int var5;
      if (null == var3) {
         var4 = -1687260435 * aj;
         var5 = kd.ak * 1658005443;
      } else {
         var4 = -794961409 * var3.cs;
         var5 = var3.cc * 1473950221;
      }

      gs.alignComponentSize(var1, var4, var5, false);
      hl.alignComponentPosition(var1, var4, var5);
   }

   final void me() {
      fw.ma_renamed(pr);
      Formatting.qe += 873371827;
      if (px && pq) {
         int var2 = -2063363905 * MouseHandler.ay;
         int var3 = MouseHandler.ao * -1224153235;
         var2 -= -1789924433 * pd;
         var3 -= pw * 1902621241;
         if (var2 < pi * 1084046795) {
            var2 = 1084046795 * pi;
         }

         if (var2 + pr.cs * -794961409 > -794961409 * pf.cs + 1084046795 * pi) {
            var2 = 1084046795 * pi + pf.cs * -794961409 - -794961409 * pr.cs;
         }

         if (var3 < pb * -746723443) {
            var3 = pb * -746723443;
         }

         if (var3 + 1473950221 * pr.cc > pb * -746723443 + pf.cc * 1473950221) {
            var3 = -746723443 * pb + pf.cc * 1473950221 - pr.cc * 1473950221;
         }

         int var4 = var2 - 565355253 * ph;
         int var5 = var3 - pv * 1136091355;
         int var6 = pr.ec * 154898553;
         if (1993201275 * Formatting.qe > pr.ei * -1849043027 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
            pn = true;
         }

         int var7 = var2 - pi * 1084046795 + pf.cq * -1469632775;
         int var8 = pf.cm * 1223232735 + (var3 - -746723443 * pb);
         ClientScriptEvent var9;
         if (null != pr.fn && pn) {
            var9 = new ClientScriptEvent();
            var9.aw = pr;
            var9.ac = var7 * -2011830585;
            var9.au = 1126405829 * var8;
            var9.af = pr.fn;
            HeadbarUpdate.af_renamed(var9);
         }

         if (0 == 114417019 * MouseHandler.aa) {
            if (pn) {
               if (null != pr.fz) {
                  var9 = new ClientScriptEvent();
                  var9.aw = pr;
                  var9.ac = -2011830585 * var7;
                  var9.au = 1126405829 * var8;
                  var9.aq = pz;
                  var9.af = pr.fz;
                  HeadbarUpdate.af_renamed(var9);
               }

               if (null != pz) {
                  Component var10 = pr;
                  int var11 = StructType.an_renamed(KeyHandler.getComponentClickMask(var10));
                  Component var13;
                  if (0 == var11) {
                     var13 = null;
                  } else {
                     int var12 = 0;

                     while(true) {
                        if (var12 >= var11) {
                           var13 = var10;
                           break;
                        }

                        var10 = gh.an_renamed(913615679 * var10.cu);
                        if (var10 == null) {
                           var13 = null;
                           break;
                        }

                        ++var12;
                     }
                  }

                  if (null != var13) {
                     PacketBitNode var14 = mi.an_renamed(ClientProt.bw, in.au);
                     var14.aw.dy(-2006098851 * pz.gn);
                     var14.aw.p4LE16(pz.bs * 1713081171);
                     var14.aw.dy(55577617 * pz.br);
                     var14.aw.dy(pr.br * 55577617);
                     var14.aw.el(1713081171 * pr.bs);
                     var14.aw.p2(pr.gn * -2006098851);
                     in.aw(var14);
                  }
               }
            } else if (this.kr()) {
               this.openMiniMenu(ph * 565355253 + -1789924433 * pd, pw * 1902621241 + pv * 1136091355);
            } else if (ne * 730065501 > 0) {
               hp.mx_renamed(565355253 * ph + pd * -1789924433, 1136091355 * pv + pw * 1902621241);
            }

            pr = null;
         }

      } else {
         if (1993201275 * Formatting.qe > 1) {
            if (!pn && ne * 730065501 > 0) {
               hp.mx_renamed(ph * 565355253 + pd * -1789924433, pv * 1136091355 + pw * 1902621241);
            }

            pr = null;
         }

      }
   }

   public Username username() {
      return null != MusicPatchNode.mi ? MusicPatchNode.mi.af : null;
   }
}
