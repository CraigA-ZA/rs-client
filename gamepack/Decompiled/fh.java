import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

public class fh extends DualNode {
   static fj ah;
   static int aq;
   boolean ab;
   ek[][] aw = (ek[][])null;
   int af;
   int au = 0;
   List aa;
   Future at;
   public ek[][] an = (ek[][])null;
   public AnimBase ac;

   fh(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
      this.af = 1049522741 * var3;
      byte[] var5 = var1.takeFile(-1156919267 * this.af >> 16 & '\uffff', this.af * -1156919267 & '\uffff');
      Packet var6 = new Packet(var5);
      int var7 = var6.g1();
      int var8 = var6.cl();
      byte[] var9;
      if (var4) {
         var9 = var2.getFile(0, var8);
      } else {
         var9 = var2.getFile(var8, 0);
      }

      this.ac = new AnimBase(var8, var9);
      this.aa = new ArrayList();
      this.at = ot.al.submit(new fi(this, var6, var7));
   }

   void decode0(Packet var1, int var2) {
      var1.cl();
      var1.cl();
      this.au = var1.g1() * 2106398559;
      int var4 = var1.cl();
      this.aw = new ek[this.ac.an().an()][];
      this.an = new ek[this.ac.af()][];
      eh[] var5 = new eh[var4];

      int var6;
      int var8;
      int var10;
      for(var6 = 0; var6 < var4; ++var6) {
         var8 = var1.g1();
         ey var9 = (ey)StructType.findEnumerated(gz.au_renamed(), var8);
         if (null == var9) {
            var9 = ey.af;
         }

         var10 = var1.gSmart1or2s();
         ec var11 = el.aq_renamed(var1.g1());
         ek var12 = new ek();
         var12.af(var1, var2);
         var5[var6] = new eh(this, var12, var9, var11, var10);
         int var13 = var9.ab();
         ek[][] var14;
         if (ey.an == var9) {
            var14 = this.aw;
         } else {
            var14 = this.an;
         }

         if (var14[var10] == null) {
            var14[var10] = new ek[var13];
         }

         if (ey.au == var9) {
            this.ab = true;
         }
      }

      var6 = var4 / (-1609019153 * aq);
      int var7 = var4 % (aq * -1609019153);
      int var15 = 0;

      for(var10 = 0; var10 < -1609019153 * aq; ++var10) {
         var8 = var15;
         var15 += var6;
         if (var7 > 0) {
            ++var15;
            --var7;
         }

         if (var15 == var8) {
            break;
         }

         this.aa.add(ot.al.submit(new ei(this, var8, var15, var5)));
      }

   }

   public boolean isFromFriend() {
      if (null == this.at && this.aa == null) {
         return true;
      } else {
         if (this.at != null) {
            if (!this.at.isDone()) {
               return false;
            }

            this.at = null;
         }

         boolean var2 = true;

         for(int var3 = 0; var3 < this.aa.size(); ++var3) {
            if (!((Future)this.aa.get(var3)).isDone()) {
               var2 = false;
            } else {
               this.aa.remove(var3);
               --var3;
            }
         }

         if (!var2) {
            return false;
         } else {
            this.aa = null;
            return true;
         }
      }
   }

   public int gIsaac1() {
      return this.au * -744553313;
   }

   public boolean loadModel() {
      return this.ab;
   }

   public void ab(int var1, ew var2, int var3, int var4) {
      qj var6;
      synchronized(qj.an) {
         if (0 == -910698341 * qj.ac) {
            var6 = new qj();
         } else {
            qj.an[(qj.ac -= -564638317) * -910698341].ab();
            var6 = qj.an[-910698341 * qj.ac];
         }
      }

      this.aq(var6, var3, var2, var1);
      this.at(var6, var3, var2, var1);
      this.al(var6, var3, var2, var1);
      var2.au(var6);
      var6.an();
   }

   void aq(qj var1, int var2, ew var3, int var4) {
      float[] var6 = var3.at(this.au * -744553313);
      float var7 = var6[0];
      float var8 = var6[1];
      float var9 = var6[2];
      if (this.aw[var2] != null) {
         ek var10 = this.aw[var2][0];
         ek var11 = this.aw[var2][1];
         ek var12 = this.aw[var2][2];
         if (null != var10) {
            var7 = var10.aw(var4);
         }

         if (var11 != null) {
            var8 = var11.aw(var4);
         }

         if (var12 != null) {
            var9 = var12.aw(var4);
         }
      }

      qx var18 = fs.an_renamed();
      var18.au(1.0F, 0.0F, 0.0F, var7);
      qx var19 = fs.an_renamed();
      var19.au(0.0F, 1.0F, 0.0F, var8);
      qx var20 = fs.an_renamed();
      var20.au(0.0F, 0.0F, 1.0F, var9);
      qx var13 = fs.an_renamed();
      var13.aq(var20);
      var13.aq(var18);
      var13.aq(var19);
      qj var14;
      synchronized(qj.an) {
         if (0 == qj.ac * -910698341) {
            var14 = new qj();
         } else {
            qj.an[(qj.ac -= -564638317) * -910698341].ab();
            var14 = qj.an[-910698341 * qj.ac];
         }
      }

      var14.ax(var13);
      var1.ao(var14);
      var18.aw();
      var19.aw();
      var20.aw();
      var13.aw();
      var14.an();
   }

   void al(qj var1, int var2, ew var3, int var4) {
      float[] var6 = var3.aa(this.au * -744553313);
      float var7 = var6[0];
      float var8 = var6[1];
      float var9 = var6[2];
      if (null != this.aw[var2]) {
         ek var10 = this.aw[var2][3];
         ek var11 = this.aw[var2][4];
         ek var12 = this.aw[var2][5];
         if (var10 != null) {
            var7 = var10.aw(var4);
         }

         if (var11 != null) {
            var8 = var11.aw(var4);
         }

         if (var12 != null) {
            var9 = var12.aw(var4);
         }
      }

      var1.au[12] = var7;
      var1.au[13] = var8;
      var1.au[14] = var9;
   }

   void at(qj var1, int var2, ew var3, int var4) {
      float[] var6 = var3.ay(-744553313 * this.au);
      float var7 = var6[0];
      float var8 = var6[1];
      float var9 = var6[2];
      if (null != this.aw[var2]) {
         ek var10 = this.aw[var2][6];
         ek var11 = this.aw[var2][7];
         ek var12 = this.aw[var2][8];
         if (var10 != null) {
            var7 = var10.aw(var4);
         }

         if (null != var11) {
            var8 = var11.aw(var4);
         }

         if (null != var12) {
            var9 = var12.aw(var4);
         }
      }

      qj var15;
      synchronized(qj.an) {
         if (-910698341 * qj.ac == 0) {
            var15 = new qj();
         } else {
            qj.an[(qj.ac -= -564638317) * -910698341].ab();
            var15 = qj.an[-910698341 * qj.ac];
         }
      }

      var15.aa(var7, var8, var9);
      var1.ao(var15);
      var15.an();
   }

   static void he_renamed(int var0, int var1, int var2) {
      if (aj.vb.aj() != 0 && 0 != var1 && Client.tl * -297150195 < 50) {
         Client.tu[Client.tl * -297150195] = var0;
         Client.tr[Client.tl * -297150195] = var1;
         Client.tg[Client.tl * -297150195] = var2;
         Client.ti[-297150195 * Client.tl] = null;
         Client.tb[Client.tl * -297150195] = 0;
         Client.tl += 831233477;
      }

   }

   static final void il_renamed(int var0, int var1, int var2) {
      if (-2100544359 * bt.kx < var0) {
         bt.kx += (2083910077 * KeyHandler.ul + fd.uu * -1514927571 * (var0 - -2100544359 * bt.kx) / 1000) * -1682679895;
         if (-2100544359 * bt.kx > var0) {
            bt.kx = -1682679895 * var0;
         }
      }

      if (bt.kx * -2100544359 > var0) {
         bt.kx -= -1682679895 * (KeyHandler.ul * 2083910077 + fd.uu * -1514927571 * (-2100544359 * bt.kx - var0) / 1000);
         if (-2100544359 * bt.kx < var0) {
            bt.kx = var0 * -1682679895;
         }
      }

      if (1772923873 * gk.kv < var1) {
         gk.kv += (2083910077 * KeyHandler.ul + (var1 - gk.kv * 1772923873) * fd.uu * -1514927571 / 1000) * -424093663;
         if (gk.kv * 1772923873 > var1) {
            gk.kv = -424093663 * var1;
         }
      }

      if (gk.kv * 1772923873 > var1) {
         gk.kv -= (KeyHandler.ul * 2083910077 + (1772923873 * gk.kv - var1) * -1514927571 * fd.uu / 1000) * -424093663;
         if (1772923873 * gk.kv < var1) {
            gk.kv = -424093663 * var1;
         }
      }

      if (-91399205 * ly.ke < var2) {
         ly.ke += (-1514927571 * fd.uu * (var2 - -91399205 * ly.ke) / 1000 + KeyHandler.ul * 2083910077) * 46344275;
         if (-91399205 * ly.ke > var2) {
            ly.ke = var2 * 46344275;
         }
      }

      if (-91399205 * ly.ke > var2) {
         ly.ke -= (-1514927571 * fd.uu * (ly.ke * -91399205 - var2) / 1000 + 2083910077 * KeyHandler.ul) * 46344275;
         if (-91399205 * ly.ke < var2) {
            ly.ke = 46344275 * var2;
         }
      }

   }
}
