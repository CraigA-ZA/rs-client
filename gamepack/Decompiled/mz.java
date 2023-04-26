import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

public class mz {
   boolean aj = true;
   boolean as = false;
   boolean az = false;
   int ad = 0;
   int ae = 0;
   int ak = 0;
   int ap = 0;
   int bb = 0;
   int bd = 0;
   int be = 0;
   int bi = 0;
   int bk = 1473042979;
   int bm = 0;
   int bo = 0;
   int bx = 763922309;
   int by = 0;
   int bz = 0;
   lx bj;
   lx bt;
   oq am = new oq();
   oq ar = new oq();

   public static PacketBitNode af_renamed(int var0, String var1, Language var2, int var3) {
      PacketBitNode var5 = mi.an_renamed(ClientProt.ax, Client.packetWriter.au);
      var5.bit.bu(0);
      int var6 = -1633313603 * var5.bit.index;
      var5.bit.bu(var0);
      String var7 = var1.toLowerCase();
      byte var8 = 0;
      if (var7.startsWith(Strings.hs)) {
         var8 = 0;
         var1 = var1.substring(Strings.hs.length());
      } else if (var7.startsWith(Strings.hl)) {
         var8 = 1;
         var1 = var1.substring(Strings.hl.length());
      } else if (var7.startsWith(Strings.hr)) {
         var8 = 2;
         var1 = var1.substring(Strings.hr.length());
      } else if (var7.startsWith(Strings.hg)) {
         var8 = 3;
         var1 = var1.substring(Strings.hg.length());
      } else if (var7.startsWith(Strings.ht)) {
         var8 = 4;
         var1 = var1.substring(Strings.ht.length());
      } else if (var7.startsWith(Strings.hq)) {
         var8 = 5;
         var1 = var1.substring(Strings.hq.length());
      } else if (var7.startsWith(Strings.hk)) {
         var8 = 6;
         var1 = var1.substring(Strings.hk.length());
      } else if (var7.startsWith(Strings.hp)) {
         var8 = 7;
         var1 = var1.substring(Strings.hp.length());
      } else if (var7.startsWith(Strings.hf)) {
         var8 = 8;
         var1 = var1.substring(Strings.hf.length());
      } else if (var7.startsWith(Strings.if)) {
         var8 = 9;
         var1 = var1.substring(Strings.if.length());
      } else if (var7.startsWith(Strings.iu)) {
         var8 = 10;
         var1 = var1.substring(Strings.iu.length());
      } else if (var7.startsWith(Strings.iy)) {
         var8 = 11;
         var1 = var1.substring(Strings.iy.length());
      } else if (Language.af != var2) {
         if (var7.startsWith(Strings.hn)) {
            var8 = 0;
            var1 = var1.substring(Strings.hn.length());
         } else if (var7.startsWith(Strings.hh)) {
            var8 = 1;
            var1 = var1.substring(Strings.hh.length());
         } else if (var7.startsWith(Strings.hc)) {
            var8 = 2;
            var1 = var1.substring(Strings.hc.length());
         } else if (var7.startsWith(Strings.ho)) {
            var8 = 3;
            var1 = var1.substring(Strings.ho.length());
         } else if (var7.startsWith(Strings.hb)) {
            var8 = 4;
            var1 = var1.substring(Strings.hb.length());
         } else if (var7.startsWith(Strings.hz)) {
            var8 = 5;
            var1 = var1.substring(Strings.hz.length());
         } else if (var7.startsWith(Strings.ha)) {
            var8 = 6;
            var1 = var1.substring(Strings.ha.length());
         } else if (var7.startsWith(Strings.he)) {
            var8 = 7;
            var1 = var1.substring(Strings.he.length());
         } else if (var7.startsWith(Strings.hy)) {
            var8 = 8;
            var1 = var1.substring(Strings.hy.length());
         } else if (var7.startsWith(Strings.ia)) {
            var8 = 9;
            var1 = var1.substring(Strings.ia.length());
         } else if (var7.startsWith(Strings.iw)) {
            var8 = 10;
            var1 = var1.substring(Strings.iw.length());
         } else if (var7.startsWith(Strings.iz)) {
            var8 = 11;
            var1 = var1.substring(Strings.iz.length());
         }
      }

      var7 = var1.toLowerCase();
      byte var9 = 0;
      if (var7.startsWith(Strings.ig)) {
         var9 = 1;
         var1 = var1.substring(Strings.ig.length());
      } else if (var7.startsWith(Strings.il)) {
         var9 = 2;
         var1 = var1.substring(Strings.il.length());
      } else if (var7.startsWith(Strings.in)) {
         var9 = 3;
         var1 = var1.substring(Strings.in.length());
      } else if (var7.startsWith(Strings.ii)) {
         var9 = 4;
         var1 = var1.substring(Strings.ii.length());
      } else if (var7.startsWith(Strings.ie)) {
         var9 = 5;
         var1 = var1.substring(Strings.ie.length());
      } else if (Language.af != var2) {
         if (var7.startsWith(Strings.ih)) {
            var9 = 1;
            var1 = var1.substring(Strings.ih.length());
         } else if (var7.startsWith(Strings.is)) {
            var9 = 2;
            var1 = var1.substring(Strings.is.length());
         } else if (var7.startsWith(Strings.ic)) {
            var9 = 3;
            var1 = var1.substring(Strings.ic.length());
         } else if (var7.startsWith(Strings.ik)) {
            var9 = 4;
            var1 = var1.substring(Strings.ik.length());
         } else if (var7.startsWith(Strings.iq)) {
            var9 = 5;
            var1 = var1.substring(Strings.iq.length());
         }
      }

      var5.bit.bu(var8);
      var5.bit.bu(var9);
      WorldMapArea.an_renamed(var5.bit, var1);
      if (var0 == ms.ac.ordinal()) {
         var5.bit.bu(var3);
      }

      var5.bit.cu(var5.bit.index * -1633313603 - var6);
      return var5;
   }

   public static void af_renamed(boolean var0) {
      if (var0 && null != Rasterizer2D.by) {
         Rasterizer3D.aq = Rasterizer3D.at;
      } else {
         Rasterizer3D.aq = Rasterizer3D.al;
      }

   }

   mz() {
      this.ar.ay(1);
      this.am.ay(1);
   }

   void af() {
      this.ak = (-870124373 * this.ak + 1) % 60 * -867080701;
      if (2106407237 * this.be > 0) {
         this.be -= 238055821;
      }

   }

   public boolean an(boolean var1) {
      var1 = var1 && this.aj;
      boolean var3 = var1 != this.as;
      this.as = var1;
      if (!this.as) {
         this.ap(this.by * 1350344153, this.by * 1350344153);
      }

      return var3;
   }

   public void aw(boolean var1) {
      this.aj = var1;
      this.as = var1 && this.as;
   }

   boolean ac(String var1) {
      String var3 = this.ar.ab();
      if (!var3.equals(var1)) {
         var1 = this.cb(var1);
         this.ar.ar(var1);
         this.ay(-466889091 * this.bm, 607166941 * this.bd);
         this.cj();
         this.dm();
         return true;
      } else {
         return false;
      }
   }

   boolean au(String var1) {
      this.am.ar(var1);
      return true;
   }

   boolean ab(AbstractFont var1) {
      boolean var3 = !this.az;
      this.ar.aa(var1);
      this.am.aa(var1);
      this.az = true;
      var3 |= this.ay(this.bm * -466889091, this.bd * 607166941);
      var3 |= this.ap(this.bb * 542296527, this.by * 1350344153);
      if (this.cj()) {
         this.dm();
         var3 = true;
      }

      return var3;
   }

   public static IndexedSprite[] ac_renamed(AbstractArchive var0, String var1, String var2) {
      if (!var0.cv(var1, var2)) {
         return null;
      } else {
         int var4 = var0.getGroupId(var1);
         int var5 = var0.getFileId(var4, var2);
         return cv.af_renamed(var0, var4, var5);
      }
   }

   public boolean aq(int var1, int var2) {
      boolean var4 = this.bo * -212351097 != var1 || var2 != 1953737631 * this.bz;
      this.bo = -1340125641 * var1;
      this.bz = 86683743 * var2;
      var4 |= this.ay(this.bm * -466889091, 607166941 * this.bd);
      return var4;
   }

   public boolean al(int var1) {
      if (var1 < 0) {
         var1 = Integer.MAX_VALUE;
      }

      boolean var3 = var1 == this.ar.bi();
      this.ar.aq(var1);
      this.am.aq(var1);
      if (this.cj()) {
         this.dm();
         var3 = true;
      }

      return var3;
   }

   public boolean at(int var1) {
      this.ar.al(var1);
      if (this.cj()) {
         this.dm();
         return true;
      } else {
         return false;
      }
   }

   public boolean aa(int var1) {
      this.bx = var1 * 1383561339;
      if (this.cj()) {
         this.dm();
         return true;
      } else {
         return false;
      }
   }

   public boolean ay(int var1, int var2) {
      if (!this.ca()) {
         this.bm = -1473981739 * var1;
         this.bd = var2 * -2081112459;
         return false;
      } else {
         int var4 = -466889091 * this.bm;
         int var5 = 607166941 * this.bd;
         int var6 = Math.max(0, this.ar.ad() - this.bo * -212351097 + 2);
         int var7 = Math.max(0, this.ar.ae() - this.bz * 1953737631 + 1);
         this.bm = Math.max(0, Math.min(var6, var1)) * -1473981739;
         this.bd = Math.max(0, Math.min(var7, var2)) * -2081112459;
         return var4 != this.bm * -466889091 || 607166941 * this.bd != var5;
      }
   }

   public boolean ao(int var1, int var2) {
      boolean var4 = true;
      if (var1 < 0 || var1 > 2) {
         var4 = false;
      }

      if (var2 < 0 || var2 > 2) {
         var4 = false;
      }

      return var4 ? this.ar.ao(var1, var2) : false;
   }

   public void ax(int var1) {
      this.ar.ax(var1);
   }

   public void ai(int var1) {
      this.ad = var1 * 258208179;
   }

   public void ag(int var1) {
      this.ar.ay(var1);
   }

   public void ah(int var1) {
      this.ar.at(var1);
   }

   public boolean av(int var1) {
      this.ap = var1 * -399838397;
      String var3 = this.ar.ab();
      int var4 = var3.length();
      var3 = this.cb(var3);
      if (var3.length() != var4) {
         this.ar.ar(var3);
         this.ay(-466889091 * this.bm, 607166941 * this.bd);
         this.cj();
         this.dm();
         return true;
      } else {
         return false;
      }
   }

   public void ar() {
      this.az = false;
   }

   public boolean am(int var1) {
      if (this.dw(var1)) {
         this.ad();
         ow var3 = this.ar.ag((char)var1, this.by * 1350344153, -1383048587 * this.bk);
         this.ap(var3.af(), var3.af());
         this.cj();
         this.dm();
      }

      return true;
   }

   public void as() {
      if (!this.ad() && this.by * 1350344153 > 0) {
         int var2 = this.ar.as(this.by * 1350344153 - 1);
         this.dm();
         this.ap(var2, var2);
      }

   }

   public void aj() {
      if (!this.ad() && this.by * 1350344153 < this.ar.au()) {
         int var2 = this.ar.as(1350344153 * this.by);
         this.dm();
         this.ap(var2, var2);
      }

   }

   public void ak() {
      if (!this.ad() && 1350344153 * this.by > 0) {
         rg var2 = this.cz(1350344153 * this.by - 1);
         int var3 = this.ar.aj((Integer)var2.af, 1350344153 * this.by);
         this.dm();
         this.ap(var3, var3);
      }

   }

   public void az() {
      if (!this.ad() && this.by * 1350344153 < this.ar.au()) {
         rg var2 = this.cz(this.by * 1350344153);
         int var3 = this.ar.aj(1350344153 * this.by, (Integer)var2.an);
         this.dm();
         this.ap(var3, var3);
      }

   }

   boolean ad() {
      if (!this.cv()) {
         return false;
      } else {
         int var2 = this.ar.aj(542296527 * this.bb, this.by * 1350344153);
         this.dm();
         this.ap(var2, var2);
         return true;
      }
   }

   public void ae() {
      this.ap(0, this.ar.au());
   }

   public boolean ap(int var1, int var2) {
      if (!this.ca()) {
         this.bb = 1269275951 * var1;
         this.by = -405138839 * var2;
         return false;
      } else {
         if (var1 > this.ar.au()) {
            var1 = this.ar.au();
         }

         if (var2 > this.ar.au()) {
            var2 = this.ar.au();
         }

         boolean var4 = 542296527 * this.bb != var1 || this.by * 1350344153 != var2;
         this.bb = 1269275951 * var1;
         if (var2 != this.by * 1350344153) {
            this.by = var2 * -405138839;
            this.ak = 0;
            this.cp();
         }

         if (var4 && this.bj != null) {
            this.bj.af();
         }

         return var4;
      }
   }

   public void by(boolean var1) {
      rg var3 = this.cw(this.by * 1350344153);
      this.ch((Integer)var3.af, var1);
   }

   public void bb(boolean var1) {
      rg var3 = this.cw(1350344153 * this.by);
      this.ch((Integer)var3.an, var1);
   }

   public void bi(boolean var1) {
      this.ch(0, var1);
   }

   public void be(boolean var1) {
      this.ch(this.ar.au(), var1);
   }

   public void bk(boolean var1) {
      if (this.cv() && !var1) {
         this.ch(Math.min(542296527 * this.bb, 1350344153 * this.by), var1);
      } else if (this.by * 1350344153 > 0) {
         this.ch(this.by * 1350344153 - 1, var1);
      }

   }

   public void bx(boolean var1) {
      if (this.cv() && !var1) {
         this.ch(Math.max(542296527 * this.bb, this.by * 1350344153), var1);
      } else if (this.by * 1350344153 < this.ar.au()) {
         this.ch(1 + 1350344153 * this.by, var1);
      }

   }

   public void bo(boolean var1) {
      if (1350344153 * this.by > 0) {
         rg var3 = this.cz(1350344153 * this.by - 1);
         this.ch((Integer)var3.af, var1);
      }

   }

   public void bz(boolean var1) {
      if (this.by * 1350344153 < this.ar.au()) {
         rg var3 = this.cz(1 + this.by * 1350344153);
         this.ch((Integer)var3.an, var1);
      }

   }

   public void bm(boolean var1) {
      if (this.by * 1350344153 > 0) {
         this.ch(this.ar.az(1350344153 * this.by, -1), var1);
      }

   }

   public void bd(boolean var1) {
      if (this.by * 1350344153 < this.ar.au()) {
         this.ch(this.ar.az(this.by * 1350344153, 1), var1);
      }

   }

   public void bt(boolean var1) {
      if (this.by * 1350344153 > 0) {
         int var3 = this.ct();
         this.ch(this.ar.az(1350344153 * this.by, -var3), var1);
      }

   }

   public void bj(boolean var1) {
      if (1350344153 * this.by < this.ar.au()) {
         int var3 = this.ct();
         this.ch(this.ar.az(1350344153 * this.by, var3), var1);
      }

   }

   public void bn(boolean var1) {
      oa var3 = this.ar.ai(0, this.by * 1350344153);
      rg var4 = var3.aq();
      this.ch(this.ar.ak((Integer)var4.af, 607166941 * this.bd), var1);
   }

   public void bs(boolean var1) {
      oa var3 = this.ar.ai(0, 1350344153 * this.by);
      rg var4 = var3.aq();
      this.ch(this.ar.ak((Integer)var4.af, 1953737631 * this.bz + 607166941 * this.bd), var1);
   }

   public void br(int var1, int var2, boolean var3, boolean var4) {
      boolean var6 = false;
      rg var7;
      int var9;
      if (!this.az) {
         var9 = 0;
      } else {
         var1 += -466889091 * this.bm;
         var2 += 607166941 * this.bd;
         var7 = this.dc();
         var9 = this.ar.ak(var1 - (Integer)var7.af, var2 - (Integer)var7.an);
      }

      if (var3 && var4) {
         this.ae = -1271167213;
         var7 = this.cz(var9);
         rg var8 = this.cz(-600117957 * this.bi);
         this.co(var8, var7);
      } else if (var3) {
         this.ae = -1271167213;
         var7 = this.cz(var9);
         this.ap((Integer)var7.af, (Integer)var7.an);
         this.bi = (Integer)var7.af * 1170826227;
      } else if (var4) {
         this.ap(this.bi * -600117957, var9);
      } else {
         if (this.be * 2106407237 > 0 && var9 == -600117957 * this.bi) {
            if (542296527 * this.bb == 1350344153 * this.by) {
               this.ae = -1271167213;
               var7 = this.cz(var9);
               this.ap((Integer)var7.af, (Integer)var7.an);
            } else {
               this.ae = 1752632870;
               var7 = this.cw(var9);
               this.ap((Integer)var7.af, (Integer)var7.an);
            }
         } else {
            this.ae = 0;
            this.ap(var9, var9);
            this.bi = 1170826227 * var9;
         }

         this.be = 1656428229;
      }

   }

   public void bg(int var1, int var2) {
      if (this.az && this.ce()) {
         var1 += -466889091 * this.bm;
         var2 += this.bd * 607166941;
         rg var4 = this.dc();
         int var5 = this.ar.ak(var1 - (Integer)var4.af, var2 - (Integer)var4.an);
         rg var6;
         rg var7;
         switch (this.ae * -971547877) {
            case 0:
               this.ap(this.bb * 542296527, var5);
               break;
            case 1:
               var6 = this.cz(-600117957 * this.bi);
               var7 = this.cz(var5);
               this.co(var6, var7);
               break;
            case 2:
               var6 = this.cw(this.bi * -600117957);
               var7 = this.cw(var5);
               this.co(var6, var7);
         }
      }

   }

   public void bu(Clipboard var1) {
      oa var3 = this.ar.ai(542296527 * this.bb, this.by * 1350344153);
      if (!var3.aw()) {
         String var4 = var3.af();
         if (!var4.isEmpty()) {
            var1.setContents(new StringSelection(var4), (ClipboardOwner)null);
         }
      }

   }

   public void bf(Clipboard var1) {
      if (this.cv()) {
         this.bu(var1);
         this.ad();
      }

   }

   public void bq(Clipboard var1) {
      Transferable var3 = var1.getContents((Object)null);
      if (var3 != null && var3.isDataFlavorSupported(DataFlavor.stringFlavor)) {
         try {
            String var4 = this.cb((String)var3.getTransferData(DataFlavor.stringFlavor));
            this.ad();
            ow var5 = this.ar.ah(var4, 1350344153 * this.by, this.bk * -1383048587);
            this.ap(var5.af(), var5.af());
            this.cj();
            this.dm();
         } catch (Exception var6) {
         }
      }

   }

   public void ba() {
      this.bd = Math.max(0, this.bd * 607166941 - this.ar.ap()) * -2081112459;
   }

   public void bv() {
      int var2 = Math.max(0, this.ar.ae() - 1953737631 * this.bz);
      this.bd = Math.min(var2, 607166941 * this.bd + this.ar.ap()) * -2081112459;
   }

   public void bl(lx var1) {
      this.bt = var1;
   }

   public void bp(lx var1) {
      this.bj = var1;
   }

   public oq bc() {
      return this.ar;
   }

   public oq bh() {
      return this.am;
   }

   public oa bw() {
      return this.ar.ai(542296527 * this.bb, this.by * 1350344153);
   }

   public boolean ce() {
      return this.as;
   }

   public boolean ci() {
      return this.aj;
   }

   public boolean cs() {
      return this.ce() && -870124373 * this.ak % 60 < 30;
   }

   public int cc() {
      return this.by * 1350344153;
   }

   public int cn() {
      return this.bb * 542296527;
   }

   public boolean ca() {
      return this.az;
   }

   public int cu() {
      return this.bm * -466889091;
   }

   public int ck() {
      return 607166941 * this.bd;
   }

   public int cq() {
      return this.ar.bi();
   }

   public int cm() {
      return this.ar.be();
   }

   public int cf() {
      return this.bx * -522869069;
   }

   public int cl() {
      return this.ad * 1959011707;
   }

   public int cg() {
      return this.ar.bk();
   }

   public int cr() {
      return -947277461 * this.ap;
   }

   public int cy() {
      return this.ar.bx();
   }

   public boolean cx() {
      return this.cm() > 1;
   }

   boolean cv() {
      return 542296527 * this.bb != this.by * 1350344153;
   }

   String cb(String var1) {
      StringBuilder var3 = new StringBuilder(var1.length());

      for(int var4 = 0; var4 < var1.length(); ++var4) {
         char var5 = var1.charAt(var4);
         if (this.dw(var5)) {
            var3.append(var5);
         }
      }

      return var3.toString();
   }

   void co(rg var1, rg var2) {
      if ((Integer)var2.af < (Integer)var1.af) {
         this.ap((Integer)var1.an, (Integer)var2.af);
      } else {
         this.ap((Integer)var1.af, (Integer)var2.an);
      }

   }

   rg cz(int var1) {
      int var3 = this.ar.au();
      int var4 = 0;
      int var5 = var3;

      int var6;
      for(var6 = var1; var6 > 0; --var6) {
         if (this.cd(this.ar.af(var6 - 1).af)) {
            var4 = var6;
            break;
         }
      }

      for(var6 = var1; var6 < var3; ++var6) {
         if (this.cd(this.ar.af(var6).af)) {
            var5 = var6;
            break;
         }
      }

      return new rg(var4, var5);
   }

   rg cw(int var1) {
      int var3 = this.ar.au();
      int var4 = 0;
      int var5 = var3;

      int var6;
      for(var6 = var1; var6 > 0; --var6) {
         if (this.ar.af(var6 - 1).af == '\n') {
            var4 = var6;
            break;
         }
      }

      for(var6 = var1; var6 < var3; ++var6) {
         if (this.ar.af(var6).af == '\n') {
            var5 = var6;
            break;
         }
      }

      return new rg(var4, var5);
   }

   boolean cj() {
      if (!this.ca()) {
         return false;
      } else {
         boolean var2 = false;
         if (this.ar.au() > this.bx * -522869069) {
            this.ar.aj(-522869069 * this.bx, this.ar.au());
            var2 = true;
         }

         int var3 = this.cm();
         int var4;
         if (this.ar.by() > var3) {
            var4 = this.ar.az(0, var3) - 1;
            this.ar.aj(var4, this.ar.au());
            var2 = true;
         }

         if (var2) {
            var4 = this.by * 1350344153;
            int var5 = 542296527 * this.bb;
            int var6 = this.ar.au();
            if (1350344153 * this.by > var6) {
               var4 = var6;
            }

            if (this.bb * 542296527 > var6) {
               var5 = var6;
            }

            this.ap(var5, var4);
         }

         return var2;
      }
   }

   void ch(int var1, boolean var2) {
      if (var2) {
         this.ap(this.bb * 542296527, var1);
      } else {
         this.ap(var1, var1);
      }

   }

   int ct() {
      return 1953737631 * this.bz / this.ar.ap();
   }

   void cp() {
      oa var2 = this.ar.ai(0, 1350344153 * this.by);
      rg var3 = var2.aq();
      int var4 = this.ar.ap();
      int var5 = (Integer)var3.af - 10;
      int var6 = var5 + 20;
      int var7 = (Integer)var3.an - 3;
      int var8 = var4 + 6 + var7;
      int var9 = this.bm * -466889091;
      int var10 = var9 + -212351097 * this.bo;
      int var11 = this.bd * 607166941;
      int var12 = 1953737631 * this.bz + var11;
      int var13 = -466889091 * this.bm;
      int var14 = 607166941 * this.bd;
      if (var5 < var9) {
         var13 = var5;
      } else if (var6 > var10) {
         var13 = var6 - this.bo * -212351097;
      }

      if (var7 < var11) {
         var14 = var7;
      } else if (var8 > var12) {
         var14 = var8 - this.bz * 1953737631;
      }

      this.ay(var13, var14);
   }

   boolean cd(int var1) {
      return 32 == var1 || 10 == var1 || 9 == var1;
   }

   void dm() {
      if (this.bt != null) {
         this.bt.af();
      }

   }

   boolean dw(int var1) {
      switch (-947277461 * this.ap) {
         case 1:
            return MiniMenuEntry.ay_renamed((char)var1);
         case 2:
            return fl.at_renamed((char)var1);
         case 3:
            return ff.aa_renamed((char)var1);
         case 4:
            char var3 = (char)var1;
            if (ff.aa_renamed(var3)) {
               return true;
            } else {
               if (var3 != 'k' && var3 != 'K' && var3 != 'm' && 'M' != var3 && var3 != 'b' && var3 != 'B') {
                  return false;
               }

               return true;
            }
         default:
            return true;
      }
   }

   rg dc() {
      int var2 = this.ar.bo(this.bo * -212351097);
      int var3 = this.ar.bz(this.bz * 1953737631);
      return new rg(var2, var3);
   }

   static Component bm_renamed(int var0, Component var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
      Component var9 = new Component();
      var9.type = -1183495331 * var0;
      var9.parentId = -1942978835 * var1.id;
      var9.childIndex = -1274125071 * var2;
      var9.isIf3 = true;
      var9.xAlignment = 1656805111 * var3;
      var9.yAlignment = -362988363 * var4;
      var9.widthAlignment = 387308049 * var5;
      var9.heightAlignment = -480958745 * var6;
      var9.rawX = 1806877347 * (int)((float)(-794961409 * var1.width) * var7[0]);
      var9.rawY = 1231090287 * (int)((float)(1473950221 * var1.height) * var7[1]);
      var9.rawWidth = -1495372107 * (int)((float)(-794961409 * var1.width) * var7[2]);
      var9.rawHeight = 1193771871 * (int)(var7[3] * (float)(1473950221 * var1.height));
      return var9;
   }
}
