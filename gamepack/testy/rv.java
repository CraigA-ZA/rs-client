import accessors.RSPlatformInfo;

public class rv extends rp implements RSPlatformInfo {
   static final int al = 2;
   static final int ac = 3;
   static final int ab = 0;
   static final int an = 1;
   static final int bb = 1;
   int bf;
   boolean bz;
   int bm;
   int bd;
   int bt;
   int bq;
   int bn;
   int ce;
   String ca;
   String cs;
   int bw;
   boolean bs;
   int bc;
   String ba;
   String bv;
   String bl;
   String bp;
   static final int bu = 0;
   int bh;
   int bg;
   int bj;
   String ci;
   int[] cc;
   String cu;
   int cn;
   int bo;
   int br;

   public int an(byte var1) {
      try {
         int var2 = 39;
         var2 += gx.bw(this.ba, (byte)5);
         var2 += gx.bw(this.bv, (byte)-51);
         var2 += gx.bw(this.bl, (byte)-9);
         var2 += gx.bw(this.bp, (byte)-5);
         var2 += gx.bw(this.ci, (byte)-41);
         var2 += gx.bw(this.cs, (byte)17);
         var2 += gx.bw(this.ca, (byte)51);
         var2 += gx.bw(this.cu, (byte)-27);
         return var2;
      } catch (RuntimeException var3) {
         throw db.an(var3, "rv.an(" + ')');
      }
   }

   public void ac(sg var1) {
      var1.bu(9, (byte)40);
      var1.bu(this.bo * -414762469, (byte)45);
      var1.bu(this.bz ? 1 : 0, (byte)18);
      var1.bf(this.bm * -189842087, (byte)-34);
      var1.bu(-1690004953 * this.bd, (byte)120);
      var1.bu(this.bt * -943340083, (byte)93);
      var1.bu(1022418583 * this.bj, (byte)100);
      var1.bu(this.bn * -1753943345, (byte)29);
      var1.bu(this.bs ? 1 : 0, (byte)44);
      var1.bf(-1410621599 * this.br, (byte)-20);
      var1.bu(this.bg * -618885727, (byte)84);
      var1.bq(this.bf * 674530299, -781757615);
      var1.bf(1910222221 * this.bq, (byte)-88);
      var1.ce(this.ba, 101477924);
      var1.ce(this.bv, 1432634958);
      var1.ce(this.bl, 1318557751);
      var1.ce(this.bp, -966171102);
      var1.bu(-1802285345 * this.bh, (byte)103);
      var1.bf(-335545265 * this.bc, (byte)41);
      var1.ce(this.ci, 244687696);
      var1.ce(this.cs, -287811377);
      var1.bu(2136442625 * this.bw, (byte)113);
      var1.bu(this.ce * -180252201, (byte)105);

      for(int var2 = 0; var2 < this.cc.length; ++var2) {
         var1.ba(this.cc[var2], -2081835031);
      }

      var1.ba(this.cn * -656820395, -2081835031);
      var1.ce(this.ca, 1998399626);
      var1.ce(this.cu, -958572261);
   }

   public int au() {
      int var1 = 39;
      var1 += gx.bw(this.ba, (byte)-40);
      var1 += gx.bw(this.bv, (byte)33);
      var1 += gx.bw(this.bl, (byte)103);
      var1 += gx.bw(this.bp, (byte)40);
      var1 += gx.bw(this.ci, (byte)59);
      var1 += gx.bw(this.cs, (byte)-39);
      var1 += gx.bw(this.ca, (byte)83);
      var1 += gx.bw(this.cu, (byte)-84);
      return var1;
   }

   public void aw(sg var1) {
      var1.bu(9, (byte)1);
      var1.bu(this.bo * -414762469, (byte)93);
      var1.bu(this.bz ? 1 : 0, (byte)8);
      var1.bf(this.bm * -189842087, (byte)80);
      var1.bu(-1690004953 * this.bd, (byte)104);
      var1.bu(this.bt * -943340083, (byte)87);
      var1.bu(1022418583 * this.bj, (byte)74);
      var1.bu(this.bn * -1753943345, (byte)99);
      var1.bu(this.bs ? 1 : 0, (byte)23);
      var1.bf(-1410621599 * this.br, (byte)-20);
      var1.bu(this.bg * -618885727, (byte)4);
      var1.bq(this.bf * 674530299, -738036244);
      var1.bf(1910222221 * this.bq, (byte)-15);
      var1.ce(this.ba, 1306491482);
      var1.ce(this.bv, 1567222177);
      var1.ce(this.bl, 1380071657);
      var1.ce(this.bp, 222291068);
      var1.bu(-1802285345 * this.bh, (byte)68);
      var1.bf(-335545265 * this.bc, (byte)-16);
      var1.ce(this.ci, 921144343);
      var1.ce(this.cs, 681679309);
      var1.bu(2136442625 * this.bw, (byte)85);
      var1.bu(this.ce * -180252201, (byte)81);

      for(int var2 = 0; var2 < this.cc.length; ++var2) {
         var1.ba(this.cc[var2], -2081835031);
      }

      var1.ba(this.cn * -656820395, -2081835031);
      var1.ce(this.ca, 1980206519);
      var1.ce(this.cu, 225660962);
   }

   rv(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25, String var26) {
      try {
         super();
         this.cc = new int[3];
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
      } catch (RuntimeException var27) {
         throw db.an(var27, "rv.<init>(" + ')');
      }
   }

   public int ab() {
      int var1 = 39;
      var1 += gx.bw(this.ba, (byte)20);
      var1 += gx.bw(this.bv, (byte)-10);
      var1 += gx.bw(this.bl, (byte)84);
      var1 += gx.bw(this.bp, (byte)-80);
      var1 += gx.bw(this.ci, (byte)-3);
      var1 += gx.bw(this.cs, (byte)75);
      var1 += gx.bw(this.ca, (byte)113);
      var1 += gx.bw(this.cu, (byte)-15);
      return var1;
   }

   public void af(sg var1, byte var2) {
      try {
         var1.bu(9, (byte)82);
         var1.bu(this.bo * -414762469, (byte)34);
         var1.bu(this.bz ? 1 : 0, (byte)26);
         var1.bf(this.bm * -189842087, (byte)7);
         var1.bu(-1690004953 * this.bd, (byte)127);
         var1.bu(this.bt * -943340083, (byte)43);
         var1.bu(1022418583 * this.bj, (byte)4);
         var1.bu(this.bn * -1753943345, (byte)50);
         byte var10001;
         if (this.bs) {
            if (var2 <= 1) {
               throw new IllegalStateException();
            }

            var10001 = 1;
         } else {
            var10001 = 0;
         }

         var1.bu(var10001, (byte)94);
         var1.bf(-1410621599 * this.br, (byte)-35);
         var1.bu(this.bg * -618885727, (byte)65);
         var1.bq(this.bf * 674530299, -182550176);
         var1.bf(1910222221 * this.bq, (byte)-48);
         var1.ce(this.ba, 1492929913);
         var1.ce(this.bv, 259094531);
         var1.ce(this.bl, 1951222206);
         var1.ce(this.bp, 1636725861);
         var1.bu(-1802285345 * this.bh, (byte)26);
         var1.bf(-335545265 * this.bc, (byte)66);
         var1.ce(this.ci, 1461636662);
         var1.ce(this.cs, 1580376873);
         var1.bu(2136442625 * this.bw, (byte)70);
         var1.bu(this.ce * -180252201, (byte)15);

         for(int var3 = 0; var3 < this.cc.length; ++var3) {
            var1.ba(this.cc[var3], -2081835031);
         }

         var1.ba(this.cn * -656820395, -2081835031);
         var1.ce(this.ca, 1248794680);
         var1.ce(this.cu, -246130437);
      } catch (RuntimeException var4) {
         throw db.an(var4, "rv.af(" + ')');
      }
   }

   public int aq() {
      int var1 = 39;
      var1 += gx.bw(this.ba, (byte)15);
      var1 += gx.bw(this.bv, (byte)37);
      var1 += gx.bw(this.bl, (byte)-73);
      var1 += gx.bw(this.bp, (byte)26);
      var1 += gx.bw(this.ci, (byte)-18);
      var1 += gx.bw(this.cs, (byte)60);
      var1 += gx.bw(this.ca, (byte)30);
      var1 += gx.bw(this.cu, (byte)-54);
      return var1;
   }

   public int al() {
      int var1 = 39;
      var1 += gx.bw(this.ba, (byte)20);
      var1 += gx.bw(this.bv, (byte)17);
      var1 += gx.bw(this.bl, (byte)-4);
      var1 += gx.bw(this.bp, (byte)-11);
      var1 += gx.bw(this.ci, (byte)80);
      var1 += gx.bw(this.cs, (byte)46);
      var1 += gx.bw(this.ca, (byte)20);
      var1 += gx.bw(this.cu, (byte)-101);
      return var1;
   }
}
