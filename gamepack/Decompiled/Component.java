import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Component extends Node {
   public static boolean bj;
   static EvictingDualNodeHashTable bm = new EvictingDualNodeHashTable(8);
   static EvictingDualNodeHashTable bo = new EvictingDualNodeHashTable(50);
   static EvictingDualNodeHashTable bx = new EvictingDualNodeHashTable(200);
   static EvictingDualNodeHashTable bz = new EvictingDualNodeHashTable(20);
   static pk bd;
   static pk bt;
   gy ef;
   int dk;
   int dt;
   int ez;
   HashMap ea;
   HashMap ej;
   mt es;
   public boolean bn = false;
   public boolean cj;
   public boolean ck = false;
   public boolean cv = false;
   public boolean di;
   public boolean dj;
   public boolean dm;
   public boolean do;
   public boolean dx;
   public boolean ee;
   public boolean el;
   public boolean et;
   public boolean fs;
   public boolean hh;
   public boolean hi;
   public boolean hl;
   public boolean hn;
   public boolean hw;
   public byte[][] en;
   public byte[][] er;
   public int ba = 0;
   public int bc = 0;
   public int bf = 0;
   public int bg;
   public int bh = 0;
   public int bl = 0;
   public int bp = 0;
   public int bq = 0;
   public int br = 1274125071;
   public int bs = -346484955;
   public int bu = 0;
   public int bv = 0;
   public int bw = 0;
   public int ca = -1855082267;
   public int cc = 0;
   public int cd;
   public int ce = 0;
   public int cf = 0;
   public int cg = 0;
   public int ch;
   public int ci = 0;
   public int cl = 0;
   public int cm = 0;
   public int cn = 915397977;
   public int co;
   public int cq = 0;
   public int cr = 0;
   public int cs = 0;
   public int ct;
   public int cu = -908641471;
   public int cw;
   public int cx = 0;
   public int cy = 0;
   public int cz;
   public int db;
   public int dc;
   public int de;
   public int df;
   public int dg;
   public int dh;
   public int dl;
   public int dn;
   public int dp;
   public int dq;
   public int dr;
   public int du;
   public int dv;
   public int dw;
   public int dy;
   public int dz;
   public int eb;
   public int ec;
   public int ei;
   public int eo;
   public int ep;
   public int eq;
   public int gi;
   public int gl;
   public int gn;
   public int gv;
   public int gx;
   public int hd;
   public int hj;
   public int hm;
   public int hu;
   public int hv;
   public int hx;
   public int[] ed;
   public int[] eg;
   public int[] ff;
   public int[] fq;
   public int[] fr;
   public int[] gb;
   public int[] gf;
   public int[] gm;
   public int[] gp;
   public int[] hs;
   public int[][] gc;
   public Object[] fa;
   public Object[] fb;
   public Object[] fc;
   public Object[] fd;
   public Object[] fg;
   public Object[] fh;
   public Object[] fi;
   public Object[] fj;
   public Object[] fk;
   public Object[] fl;
   public Object[] fm;
   public Object[] fn;
   public Object[] fo;
   public Object[] fp;
   public Object[] ft;
   public Object[] fu;
   public Object[] fv;
   public Object[] fw;
   public Object[] fx;
   public Object[] fy;
   public Object[] fz;
   public Object[] ga;
   public Object[] gd;
   public Object[] ge;
   public Object[] gg;
   public Object[] gh;
   public Object[] gj;
   public Object[] go;
   public Object[] gr;
   public Object[] gs;
   public Object[] gt;
   public Object[] gu;
   public Object[] gw;
   public Object[] gy;
   public String cp;
   public String da;
   public String ds;
   public String eh;
   public String fe;
   public String gk;
   public String gq;
   public String[] ek;
   public Component ey;
   public Component[] gz;
   public PlayerAppearance dd;
   public ta cb;

   public Component() {
      this.cb = ta.af;
      this.co = 0;
      this.cz = 0;
      this.cw = 1040382753;
      this.cj = false;
      this.ch = 504605111;
      this.ct = -1679014525;
      this.cd = 0;
      this.dm = false;
      this.dw = 0;
      this.dc = 0;
      this.dr = -1714481443;
      this.dl = -509431749;
      this.dk = 1918873989;
      this.dt = -1559002165;
      this.dv = 1195025605;
      this.dz = 1782995843;
      this.dg = 0;
      this.de = 0;
      this.dh = 0;
      this.dp = 0;
      this.du = 0;
      this.db = 471890156;
      this.df = 0;
      this.dq = 0;
      this.dj = false;
      this.dx = false;
      this.dn = -1523066442;
      this.dy = -1858899927;
      this.ds = "";
      this.da = "";
      this.ep = 0;
      this.eo = 0;
      this.eq = 0;
      this.et = false;
      this.ez = -996199275;
      this.eb = 0;
      this.el = false;
      this.eh = "";
      this.ey = null;
      this.ec = 0;
      this.ei = 0;
      this.ee = false;
      this.fe = "";
      this.fs = false;
      this.gi = 597372633;
      this.gq = "";
      this.gk = Strings.au;
      this.gn = 1852876811;
      this.gv = 0;
      this.gx = 0;
      this.gl = 0;
      this.hw = false;
      this.hi = false;
      this.hj = -3554691;
      this.hm = 0;
      this.hu = 0;
      this.hx = 0;
      this.hd = 1548573671;
      this.hv = -414825897;
      this.hn = false;
      this.hl = false;
      this.hh = false;
   }

   static {
      bd = new pk(10, py.af);
      bt = new pk(10, py.af);
      bj = false;
   }

   void decodeLegacy(Packet var1) {
      this.bn = false;
      this.bg = var1.g1() * -1183495331;
      this.bu = var1.g1() * -1494876793;
      this.bf = var1.cl() * 577746185;
      this.bp = var1.cg() * 1806877347;
      this.bc = var1.cg() * 1231090287;
      this.bh = var1.cl() * -1495372107;
      this.bw = var1.cl() * 1193771871;
      this.co = var1.g1() * 1833148663;
      this.cu = var1.cl() * 908641471;
      if (this.cu * 913615679 == 65535) {
         this.cu = -908641471;
      } else {
         this.cu = ((1713081171 * this.bs & -65536) + 913615679 * this.cu) * 908641471;
      }

      this.gi = var1.cl() * -597372633;
      if (65535 == -529297769 * this.gi) {
         this.gi = 597372633;
      }

      int var3 = var1.g1();
      int var4;
      if (var3 > 0) {
         this.gf = new int[var3];
         this.gm = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.gf[var4] = var1.g1();
            this.gm[var4] = var1.cl();
         }
      }

      var4 = var1.g1();
      int var5;
      if (var4 > 0) {
         this.gc = new int[var4][];

         for(var5 = 0; var5 < var4; ++var5) {
            int var6 = var1.cl();
            this.gc[var5] = new int[var6];

            for(int var7 = 0; var7 < var6; ++var7) {
               this.gc[var5][var7] = var1.cl();
               if (65535 == this.gc[var5][var7]) {
                  this.gc[var5][var7] = -1;
               }
            }
         }
      }

      if (0 == 883712245 * this.bg) {
         this.cl = var1.cl() * -1357451643;
         this.ck = var1.g1() == 1;
      }

      if (this.bg * 883712245 == 1) {
         var1.cl();
         var1.g1();
      }

      if (3 == this.bg * 883712245) {
         this.cv = var1.g1() == 1;
      }

      if (4 == this.bg * 883712245 || 883712245 * this.bg == 1) {
         this.eo = var1.g1() * 1612549297;
         this.eq = var1.g1() * -522107433;
         this.ep = var1.g1() * 2116078665;
         this.dy = var1.cl() * 1858899927;
         if (65535 == -1065036825 * this.dy) {
            this.dy = -1858899927;
         }

         this.et = var1.g1() == 1;
      }

      if (883712245 * this.bg == 4) {
         this.ds = var1.cw();
         this.da = var1.cw();
      }

      if (883712245 * this.bg == 1 || 3 == this.bg * 883712245 || this.bg * 883712245 == 4) {
         this.cg = var1.g4s() * -1604768377;
      }

      if (3 == 883712245 * this.bg || 4 == 883712245 * this.bg) {
         this.cr = var1.g4s() * 714852617;
         this.cy = var1.g4s() * -1045335587;
         this.cx = var1.g4s() * 1230092841;
      }

      if (883712245 * this.bg == 5) {
         this.ch = var1.g4s() * -504605111;
         this.ct = var1.g4s() * 1679014525;
      }

      if (this.bg * 883712245 == 6) {
         this.dr = -1714481443;
         this.dl = var1.cl() * 509431749;
         if (65535 == this.dl * -168077555) {
            this.dl = -509431749;
         }

         this.dk = 1918873989;
         this.dt = var1.cl() * 1559002165;
         if (this.dt * -3148259 == 65535) {
            this.dt = -1559002165;
         }

         this.dv = var1.cl() * -1195025605;
         if (-1526544909 * this.dv == 65535) {
            this.dv = 1195025605;
         }

         this.dz = var1.cl() * -1782995843;
         if (65535 == -717228843 * this.dz) {
            this.dz = 1782995843;
         }

         this.db = var1.cl() * -467727501;
         this.dh = var1.cl() * -142910041;
         this.dp = var1.cl() * -230241203;
      }

      if (8 == this.bg * 883712245) {
         this.ds = var1.cw();
      }

      if (35076151 * this.bu == 2) {
         this.fe = var1.cw();
         this.gq = var1.cw();
         var5 = var1.cl() & 63;
         this.eb = -882629235 * (this.eb * 1652991301 | var5 << 11);
      }

      if (1 == 35076151 * this.bu || 35076151 * this.bu == 4 || 35076151 * this.bu == 5 || 35076151 * this.bu == 6) {
         this.gk = var1.cw();
         if (this.gk.length() == 0) {
            if (this.bu * 35076151 == 1) {
               this.gk = Strings.au;
            }

            if (35076151 * this.bu == 4) {
               this.gk = Strings.ab;
            }

            if (35076151 * this.bu == 5) {
               this.gk = Strings.ab;
            }

            if (6 == this.bu * 35076151) {
               this.gk = Strings.aq;
            }
         }
      }

      if (this.bu * 35076151 == 1 || 4 == 35076151 * this.bu || 5 == this.bu * 35076151) {
         this.eb = (1652991301 * this.eb | 4194304) * -882629235;
      }

      if (this.bu * 35076151 == 6) {
         this.eb = (this.eb * 1652991301 | 1) * -882629235;
      }

   }

   void decode(Packet var1) {
      var1.g1();
      this.bn = true;
      this.bg = var1.g1() * -1183495331;
      this.bf = var1.cl() * 577746185;
      this.bp = var1.cg() * 1806877347;
      this.bc = var1.cg() * 1231090287;
      this.bh = var1.cl() * -1495372107;
      if (9 == this.bg * 883712245) {
         this.bw = var1.cg() * 1193771871;
      } else {
         this.bw = var1.cl() * 1193771871;
      }

      this.bv = var1.g1s() * 387308049;
      this.bl = var1.g1s() * -480958745;
      this.bq = var1.g1s() * 1656805111;
      this.ba = var1.g1s() * -362988363;
      this.cu = var1.cl() * 908641471;
      if (this.cu * 913615679 == 65535) {
         this.cu = -908641471;
      } else {
         this.cu = 908641471 * (913615679 * this.cu + (1713081171 * this.bs & -65536));
      }

      this.ck = var1.g1() == 1;
      if (this.bg * 883712245 == 0) {
         this.cf = var1.cl() * -1469650905;
         this.cl = var1.cl() * -1357451643;
         this.hn = var1.g1() == 1;
      }

      if (this.bg * 883712245 == 5) {
         this.ch = var1.g4s() * -504605111;
         this.cd = var1.cl() * 877496813;
         this.dm = var1.g1() == 1;
         this.co = var1.g1() * 1833148663;
         this.dw = var1.g1() * 646392503;
         this.dc = var1.g4s() * -140657215;
         this.do = var1.g1() == 1;
         this.di = var1.g1() == 1;
      }

      if (this.bg * 883712245 == 6) {
         this.dr = -1714481443;
         this.dl = var1.cl() * 509431749;
         if (this.dl * -168077555 == 65535) {
            this.dl = -509431749;
         }

         this.dg = var1.cg() * 1759898391;
         this.de = var1.cg() * 1163821709;
         this.dh = var1.cl() * -142910041;
         this.dp = var1.cl() * -230241203;
         this.du = var1.cl() * -1051718121;
         this.db = var1.cl() * -467727501;
         this.dv = var1.cl() * -1195025605;
         if (this.dv * -1526544909 == 65535) {
            this.dv = 1195025605;
         }

         this.dj = var1.g1() == 1;
         var1.cl();
         if (241981169 * this.bv != 0) {
            this.df = var1.cl() * 1436736911;
         }

         if (0 != this.bl * -480604969) {
            var1.cl();
         }
      }

      if (4 == 883712245 * this.bg) {
         this.dy = var1.cl() * 1858899927;
         if (this.dy * -1065036825 == 65535) {
            this.dy = -1858899927;
         }

         this.ds = var1.cw();
         this.ep = var1.g1() * 2116078665;
         this.eo = var1.g1() * 1612549297;
         this.eq = var1.g1() * -522107433;
         this.et = var1.g1() == 1;
         this.cg = var1.g4s() * -1604768377;
      }

      if (3 == 883712245 * this.bg) {
         this.cg = var1.g4s() * -1604768377;
         this.cv = var1.g1() == 1;
         this.co = var1.g1() * 1833148663;
      }

      if (883712245 * this.bg == 9) {
         this.cw = var1.g1() * 1040382753;
         this.cg = var1.g4s() * -1604768377;
         this.cj = var1.g1() == 1;
      }

      this.eb = var1.cr() * -882629235;
      this.eh = var1.cw();
      int var3 = var1.g1();
      if (var3 > 0) {
         this.ek = new String[var3];

         for(int var4 = 0; var4 < var3; ++var4) {
            this.ek[var4] = var1.cw();
         }
      }

      this.ec = var1.g1() * 1773001161;
      this.ei = var1.g1() * 1466803237;
      this.ee = var1.g1() == 1;
      this.fe = var1.cw();
      this.fi = this.readListener(var1);
      this.fx = this.readListener(var1);
      this.fb = this.readListener(var1);
      this.fy = this.readListener(var1);
      this.fa = this.readListener(var1);
      this.fw = this.readListener(var1);
      this.fv = this.readListener(var1);
      this.fc = this.readListener(var1);
      this.fj = this.readListener(var1);
      this.fg = this.readListener(var1);
      this.fd = this.readListener(var1);
      this.fh = this.readListener(var1);
      this.fl = this.readListener(var1);
      this.fp = this.readListener(var1);
      this.fo = this.readListener(var1);
      this.fn = this.readListener(var1);
      this.fz = this.readListener(var1);
      this.fm = this.readListener(var1);
      this.fr = this.readListenerTriggers(var1);
      this.fq = this.readListenerTriggers(var1);
      this.ff = this.readListenerTriggers(var1);
   }

   Object[] readListener(Packet var1) {
      int var3 = var1.g1();
      if (var3 == 0) {
         return null;
      } else {
         Object[] var4 = new Object[var3];

         for(int var5 = 0; var5 < var3; ++var5) {
            int var6 = var1.g1();
            if (var6 == 0) {
               var4[var5] = new Integer(var1.g4s());
            } else if (1 == var6) {
               var4[var5] = var1.cw();
            }
         }

         this.fs = true;
         return var4;
      }
   }

   int[] readListenerTriggers(Packet var1) {
      int var3 = var1.g1();
      if (var3 == 0) {
         return null;
      } else {
         int[] var4 = new int[var3];

         for(int var5 = 0; var5 < var3; ++var5) {
            var4[var5] = var1.g4s();
         }

         return var4;
      }
   }

   public Rasterizer3D at(boolean var1, UrlRequester var2) {
      bj = false;
      if (null != this.cp) {
         Rasterizer3D var4 = this.aa(var2);
         if (null != var4) {
            return var4;
         }
      }

      int var8;
      if (var1) {
         var8 = -1352724779 * this.ct;
      } else {
         var8 = -363627527 * this.ch;
      }

      if (var8 == -1) {
         return null;
      } else {
         long var5 = ((long)(this.dc * -353676735) << 40) + ((this.do ? 1L : 0L) << 38) + ((long)(this.dw * 1638912775) << 36) + (long)var8 + ((this.di ? 1L : 0L) << 39);
         Rasterizer3D var7 = (Rasterizer3D)bx.get(var5);
         if (null != var7) {
            return var7;
         } else {
            var7 = sc.aw_renamed(ClientScriptEvent.be, var8, 0);
            if (null == var7) {
               bj = true;
               return null;
            } else {
               this.ax(var7);
               bx.put(var7, var5);
               return var7;
            }
         }
      }
   }

   Rasterizer3D aa(UrlRequester var1) {
      if (!this.ao()) {
         return this.ay(var1);
      } else {
         String var3 = this.cp + (this.do ? 1 : 0) + (this.di ? 1 : 0) + this.dw * 1638912775 + -353676735 * this.dc;
         Rasterizer3D var4 = (Rasterizer3D)bt.an(var3);
         if (null == var4) {
            Rasterizer3D var5 = this.ay(var1);
            if (null != var5) {
               var4 = var5.an();
               this.ax(var4);
               bt.aw(var3, var4);
            }
         }

         return var4;
      }
   }

   Rasterizer3D ay(UrlRequester var1) {
      if (this.cp != null && null != var1) {
         lr var3 = (lr)bd.an(this.cp);
         if (null == var3) {
            var3 = new lr(this.cp, var1);
            bd.aw(this.cp, var3);
         }

         return var3.af();
      } else {
         return null;
      }
   }

   boolean ao() {
      return this.do || this.di || 0 != 1638912775 * this.dw || 0 != this.dc * -353676735;
   }

   void ax(Rasterizer3D var1) {
      if (this.do) {
         var1.fillSenderUsername();
      }

      if (this.di) {
         var1.aq();
      }

      if (1638912775 * this.dw > 0) {
         var1.ab(1638912775 * this.dw);
      }

      if (this.dw * 1638912775 >= 1) {
         var1.at(1);
      }

      if (1638912775 * this.dw >= 2) {
         var1.at(16777215);
      }

      if (0 != -353676735 * this.dc) {
         var1.aa(-353676735 * this.dc);
      }

   }

   public Font getFont() {
      bj = false;
      if (this.dy * -1065036825 == -1) {
         return null;
      } else {
         Font var2 = (Font)bz.get((long)(-1065036825 * this.dy));
         if (null != var2) {
            return var2;
         } else {
            AbstractArchive var4 = ClientScriptEvent.be;
            AbstractArchive var5 = fv.bk;
            int var6 = -1065036825 * this.dy;
            byte[] var8 = var4.takeFile(var6, 0);
            boolean var7;
            if (null == var8) {
               var7 = false;
            } else {
               sb.aa_renamed(var8);
               var7 = true;
            }

            Font var3;
            if (!var7) {
               var3 = null;
            } else {
               byte[] var9 = var5.takeFile(var6, 0);
               Font var11;
               if (null == var9) {
                  var11 = null;
               } else {
                  Font var10 = new Font(var9, tx.ac, ar.au, dd.ab, fd.aq, pc.al, VarBitType.at);
                  pk.ay_renamed();
                  var11 = var10;
               }

               var3 = var11;
            }

            if (var3 != null) {
               bz.put(var3, (long)(-1065036825 * this.dy));
            } else {
               bj = true;
            }

            return var3;
         }
      }
   }

   public it ag(SeqType var1, int var2, boolean var3, PlayerAppearance var4, hs var5, hv var6) {
      bj = false;
      int var8;
      int var9;
      if (var3) {
         var8 = this.dk * 1761517389;
         var9 = this.dt * -3148259;
      } else {
         var8 = this.dr * -123768459;
         var9 = this.dl * -168077555;
      }

      if (6 == var8) {
         if (null == var5) {
            return null;
         }

         var9 = var5.ab * -1115372301;
      }

      if (0 == var8) {
         return null;
      } else if (1 == var8 && -1 == var9) {
         return null;
      } else {
         if (var6 != null && var6.au && 6 == var8) {
            var8 = 3;
         }

         long var10 = (long)(var9 + (var8 << 16));
         if (var6 != null) {
            var10 |= var6.af * -1176524468931644747L << 20;
         }

         it var12 = (it)bo.get(var10);
         if (var12 == null) {
            UnlitModel var13 = null;
            int var14 = 64;
            int var15 = 768;
            switch (var8) {
               case 1:
                  var13 = UnlitModel.af_renamed(DynamicObject.bi, var9, 0);
                  break;
               case 2:
                  var13 = AbstractArchive.an_renamed(var9).aq((hv)null);
                  break;
               case 3:
                  var13 = null != var4 ? var4.getChatHeadModel() : null;
                  break;
               case 4:
                  ObjType var16 = HeadbarUpdate.getObjType(var9);
                  var13 = var16.al(10);
                  var14 += var16.ca * 2093614773;
                  var15 += 1794294545 * var16.cu;
               case 5:
               default:
                  break;
               case 6:
                  var13 = AbstractArchive.an_renamed(var9).aq(var6);
            }

            if (var13 == null) {
               bj = true;
               return null;
            }

            var12 = var13.bb(var14, var15, -50, -10, -50);
            bo.put(var12, var10);
         }

         if (var1 != null) {
            var12 = var1.ay(var12, var2);
         }

         return var12;
      }
   }

   public SpriteMask getSpriteMask(boolean var1, byte var2) {
      if (-1352724779 * this.ct == -1) {
         if (var2 == -1) {
            throw new IllegalStateException();
         }

         var1 = false;
      }

      int var10000;
      if (var1) {
         if (var2 == -1) {
            throw new IllegalStateException();
         }

         var10000 = -1352724779 * this.ct;
      } else {
         var10000 = -363627527 * this.ch;
      }

      int var3 = var10000;
      if (-1 == var3) {
         if (var2 == -1) {
            throw new IllegalStateException();
         } else {
            return null;
         }
      } else {
         long var15;
         if (this.di) {
            if (var2 == -1) {
               throw new IllegalStateException();
            }

            var15 = 1L;
         } else {
            var15 = 0L;
         }

         var15 <<= 39;
         long var10001;
         if (this.do) {
            if (var2 == -1) {
               throw new IllegalStateException();
            }

            var10001 = 1L;
         } else {
            var10001 = 0L;
         }

         long var4 = var15 + (var10001 << 38) + ((long)(1638912775 * this.dw) << 36) + (long)var3 + ((long)(this.dc * -353676735) << 40);
         SpriteMask var6 = (SpriteMask)bm.get(var4);
         if (null != var6) {
            return var6;
         } else {
            Rasterizer3D var7 = this.at(var1, (UrlRequester)null);
            if (var7 == null) {
               if (var2 == -1) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               Rasterizer3D var8 = var7.aw();
               int[] var9 = new int[var8.aw];
               int[] var10 = new int[var8.aw];

               for(int var11 = 0; var11 < var8.aw; ++var11) {
                  if (var2 == -1) {
                     throw new IllegalStateException();
                  }

                  int var12 = 0;
                  int var13 = var8.an;

                  int var14;
                  for(var14 = 0; var14 < var8.an; ++var14) {
                     if (var2 == -1) {
                        throw new IllegalStateException();
                     }

                     if (var8.af[var14 + var11 * var8.an] == 0) {
                        if (var2 == -1) {
                           throw new IllegalStateException();
                        }

                        var12 = var14;
                        break;
                     }
                  }

                  for(var14 = var8.an - 1; var14 >= var12; --var14) {
                     if (var2 == -1) {
                        throw new IllegalStateException();
                     }

                     if (0 == var8.af[var11 * var8.an + var14]) {
                        if (var2 == -1) {
                           throw new IllegalStateException();
                        }

                        var13 = var14 + 1;
                        break;
                     }
                  }

                  var9[var11] = var12;
                  var10[var11] = var13 - var12;
               }

               var6 = new SpriteMask(var8.an, var8.aw, var10, var9);
               bm.put(var6, var4);
               return var6;
            }
         }
      }
   }

   public void setAction(int var1, String var2) {
      if (null == this.ek || this.ek.length <= var1) {
         String[] var4 = new String[var1 + 1];
         if (this.ek != null) {
            for(int var5 = 0; var5 < this.ek.length; ++var5) {
               var4[var5] = this.ek[var5];
            }
         }

         this.ek = var4;
      }

      this.ek[var1] = var2;
   }

   public boolean am() {
      return !this.bn || 883712245 * this.bg == 0 || this.bg * 883712245 == 11 || this.fs || 1338 == this.bf * 1021339961 || 12 == 883712245 * this.bg;
   }

   public boolean isVisible() {
      return 11 == 883712245 * this.bg || 12 == this.bg * 883712245;
   }

   public void aj(String var1, UrlRequester var2, long var3) {
      if (11 == 883712245 * this.bg && -1L != var3) {
         var1 = var1.replaceAll("%userid%", Long.toString(var3));
         this.ef = new gy();
         if (!this.ef.af(var1, var2)) {
            this.ef = null;
         } else {
            if (null == this.ej || this.ea == null) {
               this.az();
            }

         }
      }
   }

   public void ak(String var1, UrlRequester var2) {
      if (883712245 * this.bg == 11 && null != var1) {
         this.ef = new gy();
         this.ef.am(var1, var2);
      }
   }

   void az() {
      this.ej = new HashMap();
      this.ea = new HashMap();
   }

   public void swapItems(int var1, int var2) {
      if (11 == 883712245 * this.bg) {
         if (null == this.ej) {
            this.az();
         }

         this.ej.put(var1, var2);
      }
   }

   public void ae(String var1, int var2) {
      if (11 == 883712245 * this.bg) {
         if (null == this.ea) {
            this.az();
         }

         this.ea.put(var1, var2);
      }
   }

   public boolean ap(int var1, int var2, int var3, int var4) {
      if (883712245 * this.bg == 11 && null != this.ef && this.by()) {
         var1 -= var3;
         var2 -= var4;
         int var6 = (int)(this.ef.at()[0] * (float)(this.cs * -794961409));
         int var7 = (int)(this.ef.at()[1] * (float)(1473950221 * this.cc));
         int var8 = var6 + (int)(this.ef.at()[2] * (float)(this.cs * -794961409));
         int var9 = var7 + (int)(this.ef.at()[3] * (float)(1473950221 * this.cc));
         return var1 >= var6 && var2 >= var7 && var1 < var8 && var2 < var9;
      } else {
         return false;
      }
   }

   public boolean by() {
      return 2 == 1888225603 * this.ez;
   }

   public int bb(String var1) {
      return 11 == this.bg * 883712245 && null != this.ef && this.by() ? this.ef.ac(var1) : -1;
   }

   public String bi(String var1) {
      return 11 == this.bg * 883712245 && null != this.ef && this.by() ? this.ef.au(var1) : null;
   }

   public int be() {
      return this.ea != null && this.ea.size() > 0 ? 1 : 0;
   }

   public int bk() {
      if (this.bg * 883712245 == 11 && null != this.ef && this.ea != null && !this.ea.isEmpty()) {
         String var2 = this.ef.al();
         return var2 != null && this.ea.containsKey(this.ef.al()) ? (Integer)this.ea.get(var2) : -1;
      } else {
         return -1;
      }
   }

   public String bx() {
      if (11 == 883712245 * this.bg && null != this.ef) {
         String var2 = this.ef.al();
         Iterator var3 = this.ef.aa().iterator();

         while(var3.hasNext()) {
            gn var4 = (gn)var3.next();
            String var5 = String.format("%%%S%%", var4.ao());
            if (var4.af() == 0) {
               var2.replaceAll(var5, Integer.toString(var4.al()));
            } else {
               var2.replaceAll(var5, var4.an());
            }
         }

         return var2;
      } else {
         return null;
      }
   }

   public int[] bo() {
      if (11 == 883712245 * this.bg && this.ef != null) {
         int[] var2 = new int[3];
         int var3 = 0;
         Iterator var4 = this.ef.aa().iterator();

         while(var4.hasNext()) {
            gn var5 = (gn)var4.next();
            if (!var5.ao().equals("user_id")) {
               if (var5.af() != 0) {
                  return null;
               }

               var2[var3++] = var5.al();
               if (var3 > 3) {
                  return null;
               }
            }
         }

         return var2;
      } else {
         return null;
      }
   }

   public boolean bz(UrlRequester var1) {
      if (this.bg * 883712245 == 11 && this.ef != null) {
         this.ef.an(var1);
         if (this.ef.aw() != this.ez * 1888225603) {
            this.ez = this.ef.aw() * 996199275;
            if (this.ez * 1888225603 >= 100) {
               return true;
            }

            if (2 == this.ez * 1888225603) {
               this.bd();
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   void bd() {
      this.hn = true;
      ArrayList var2 = this.ef.ab();
      ArrayList var3 = this.ef.aq();
      int var4 = var2.size() + var3.size();
      this.gz = new Component[var4];
      int var5 = 0;

      Iterator var6;
      Component var8;
      for(var6 = var2.iterator(); var6.hasNext(); this.gz[var5++] = var8) {
         gi var7 = (gi)var6.next();
         var8 = mz.bm_renamed(5, this, var5, 0, 0, 0, 0, var7.an);
         var8.cp = var7.af.aw();
         lr var9 = new lr(var7.af);
         bd.aw(var8.cp, var9);
      }

      for(var6 = var3.iterator(); var6.hasNext(); this.gz[var5++] = var8) {
         gq var10 = (gq)var6.next();
         var8 = mz.bm_renamed(4, this, var5, 0, 0, 0, 0, var10.au);
         var8.ds = var10.ac;
         var8.dy = (Integer)this.ej.get(1845750621 * var10.al) * 1858899927;
         var8.eo = var10.ab * 329326313;
         var8.eq = 1890763397 * var10.aq;
      }

   }

   public void bt() {
      this.es = new mt();

      for(int var2 = 1; var2 <= 12; ++var2) {
         this.es.aw.af(var2, 0);
      }

      for(char var3 = 0; var3 < ' '; ++var3) {
         this.es.aw.an(var3, 0);
      }

      this.es.aw.an('\u0080', 0);
      this.es.aw.af(82, 2);
      this.es.aw.af(81, 2);
      this.es.aw.af(86, 2);
   }

   public mz bj() {
      return null != this.es ? this.es.af : null;
   }

   public FaceNormal bn() {
      return this.es != null ? this.es.an : null;
   }

   public bb bs() {
      return this.es != null ? this.es.aw : null;
   }

   public mt br() {
      return this.es;
   }

   boolean bg(mz var1, byte var2) {
      boolean var3 = false;
      String var6;
      String var7;
      StringBuilder var8;
      int var9;
      int var10;
      int var11;
      char var12;
      String var13;
      if (null != this.ds && !this.ds.isEmpty()) {
         var7 = this.ds;
         var8 = new StringBuilder(var7.length());
         var9 = 0;
         var10 = -1;

         for(var11 = 0; var11 < var7.length(); ++var11) {
            if (var2 == -1) {
               throw new IllegalStateException();
            }

            var12 = var7.charAt(var11);
            if (var12 == '<') {
               var8.append(var7.substring(var9, var11));
               var10 = var11;
            } else if (var12 == '>') {
               if (var2 == -1) {
                  throw new IllegalStateException();
               }

               if (-1 != var10) {
                  if (var2 == -1) {
                     throw new IllegalStateException();
                  }

                  var13 = var7.substring(var10 + 1, var11);
                  var10 = -1;
                  if (var13.equals("lt")) {
                     var8.append("<");
                  } else if (var13.equals("gt")) {
                     if (var2 == -1) {
                        throw new IllegalStateException();
                     }

                     var8.append(">");
                  } else if (var13.equals("br")) {
                     var8.append("\n");
                  }

                  var9 = 1 + var11;
               }
            }
         }

         if (var9 < var7.length()) {
            if (var2 == -1) {
               throw new IllegalStateException();
            }

            var8.append(var7.substring(var9, var7.length()));
         }

         var6 = var8.toString();
         var3 |= var1.ac(var6);
         this.ds = "";
      }

      if (null != this.da) {
         if (var2 == -1) {
            throw new IllegalStateException();
         }

         if (!this.da.isEmpty()) {
            if (var2 == -1) {
               throw new IllegalStateException();
            }

            var7 = this.da;
            var8 = new StringBuilder(var7.length());
            var9 = 0;
            var10 = -1;

            for(var11 = 0; var11 < var7.length(); ++var11) {
               if (var2 == -1) {
                  throw new IllegalStateException();
               }

               var12 = var7.charAt(var11);
               if ('<' == var12) {
                  if (var2 == -1) {
                     throw new IllegalStateException();
                  }

                  var8.append(var7.substring(var9, var11));
                  var10 = var11;
               } else if ('>' == var12) {
                  if (var2 == -1) {
                     throw new IllegalStateException();
                  }

                  if (-1 != var10) {
                     if (var2 == -1) {
                        throw new IllegalStateException();
                     }

                     var13 = var7.substring(1 + var10, var11);
                     var10 = -1;
                     if (var13.equals("lt")) {
                        if (var2 == -1) {
                           throw new IllegalStateException();
                        }

                        var8.append("<");
                     } else if (var13.equals("gt")) {
                        if (var2 == -1) {
                           throw new IllegalStateException();
                        }

                        var8.append(">");
                     } else if (var13.equals("br")) {
                        if (var2 == -1) {
                           throw new IllegalStateException();
                        }

                        var8.append("\n");
                     }

                     var9 = 1 + var11;
                  }
               }
            }

            if (var9 < var7.length()) {
               if (var2 == -1) {
                  throw new IllegalStateException();
               }

               var8.append(var7.substring(var9, var7.length()));
            }

            var6 = var8.toString();
            var3 |= var1.au(var6);
            this.da = "";
         }
      }

      return var3;
   }

   public boolean bu() {
      mz var2 = this.bj();
      if (var2 == null) {
         return false;
      } else {
         boolean var3 = false;
         if (!var2.ca() && -1 != -1065036825 * this.dy) {
            int var4 = var2.cu();
            int var5 = var2.ck();
            int var6 = var2.cn();
            int var7 = var2.cc();
            Font var8 = this.getFont();
            if (null != var8) {
               var3 |= var2.ab(var8);
               var3 |= this.bg(var2, (byte)-12);
               var3 |= var2.ay(var4, var5);
               var3 |= var2.ap(var6, var7);
            }
         } else if (var2.ca()) {
            var3 |= this.bg(var2, (byte)86);
         }

         var2.af();
         return var3;
      }
   }
}
