public class PlatformInfo extends Node {
   boolean bs;
   boolean bz;
   int bc;
   int bd;
   int bf;
   int bg;
   int bh;
   int bj;
   int bm;
   int bn;
   int bo;
   int bq;
   int br;
   int bt;
   int bw;
   int ce;
   int cn;
   int[] cc = new int[3];
   String ba;
   String bl;
   String bp;
   String bv;
   String ca;
   String ci;
   String cs;
   String cu;

   PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25, String var26) {
      this.bo = -1752231917 * var1;
      this.bz = var2;
      this.bm = 51591913 * var3;
      this.bd = -746472041 * var4;
      this.bt = var5 * -694374651;
      this.bj = var6 * 1786544423;
      this.bn = var7 * 1296880687;
      this.bs = var8;
      this.br = -2091170655 * var9;
      this.bg = 1039308385 * var10;
      this.bf = -1509290189 * var11;
      this.bq = -29991611 * var12;
      this.ba = var13;
      this.bv = var14;
      this.bl = var15;
      this.bp = var16;
      this.bc = -1739220305 * var17;
      this.bh = var18 * -478417633;
      this.bw = -1294370559 * var19;
      this.ce = 1200026087 * var20;
      this.ci = var21;
      this.cs = var22;
      this.cc = var23;
      this.cn = var24 * -1284731395;
      this.ca = var25;
      this.cu = var26;
   }

   public void write(Packet var1) {
      var1.bu(9);
      var1.bu(this.bo * -414762469);
      var1.bu(this.bz ? 1 : 0);
      var1.p2(this.bm * -189842087);
      var1.bu(-1690004953 * this.bd);
      var1.bu(this.bt * -943340083);
      var1.bu(1022418583 * this.bj);
      var1.bu(this.bn * -1753943345);
      var1.bu(this.bs ? 1 : 0);
      var1.p2(-1410621599 * this.br);
      var1.bu(this.bg * -618885727);
      var1.bq(this.bf * 674530299);
      var1.p2(1910222221 * this.bq);
      var1.pjstr(this.ba);
      var1.pjstr(this.bv);
      var1.pjstr(this.bl);
      var1.pjstr(this.bp);
      var1.bu(-1802285345 * this.bh);
      var1.p2(-335545265 * this.bc);
      var1.pjstr(this.ci);
      var1.pjstr(this.cs);
      var1.bu(2136442625 * this.bw);
      var1.bu(this.ce * -180252201);

      for(int var3 = 0; var3 < this.cc.length; ++var3) {
         var1.ba(this.cc[var3]);
      }

      var1.ba(this.cn * -656820395);
      var1.pjstr(this.ca);
      var1.pjstr(this.cu);
   }

   public int size() {
      int var2 = 39;
      var2 += gx.bw_renamed(this.ba);
      var2 += gx.bw_renamed(this.bv);
      var2 += gx.bw_renamed(this.bl);
      var2 += gx.bw_renamed(this.bp);
      var2 += gx.bw_renamed(this.ci);
      var2 += gx.bw_renamed(this.cs);
      var2 += gx.bw_renamed(this.ca);
      var2 += gx.bw_renamed(this.cu);
      return var2;
   }
}
