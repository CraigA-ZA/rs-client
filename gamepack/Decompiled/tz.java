public class tz {
   boolean aa;
   int ab;
   int ac;
   int ai;
   int al = 0;
   int an;
   int ao;
   int aq;
   int at = 0;
   int au;
   int aw;
   int ax;
   int ay;

   public void af(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      this.an = 452324461 * var1;
      this.aw = var2 * 1354465017;
      this.ac = 958752335 * var3;
      this.au = 1476552633 * var4;
      this.ab = var5 * -1050948703;
      this.aq = -420531569 * var6;
      this.al = -1791669253 * var7;
      this.at = 1315090237 * var8;
      this.aa = var9;
   }

   public void an(int var1, int var2, int var3, int var4) {
      this.ay = var1 * -1716104877;
      this.ao = 1360885335 * var2;
      this.ax = var3 * 270310371;
      this.ai = -2112142917 * var4;
   }

   public void aw(oq var1, Font var2) {
      if (null != var2) {
         int var4 = var2.al;
         int var5 = Math.min(this.au * -942838135, (int)((float)var4 * 0.9F));
         int var6 = var1.bo(2079060143 * this.ac);
         int var7 = var1.bz(this.au * -942838135);
         int var8 = -2074411675 * this.an - 795400289 * this.ab + var6;
         int var9 = var7 + (this.aw * 1392698185 - this.aq * -417354641) + var4;
         Rasterizer2D.Rasterizer2D_setClip(this.an * -2074411675, this.aw * 1392698185, this.ac * 2079060143 + this.an * -2074411675, -942838135 * this.au + 1392698185 * this.aw);
         int var10 = -335536107 * this.at;
         int var11 = this.al * -729151693;
         if (var10 > var11) {
            int var12 = var10;
            var10 = var11;
            var11 = var12;
         }

         oa var22 = var1.ai(0, var10);
         oa var13 = var1.ai(var10, var11);
         oa var14 = var1.ai(var11, var1.au());
         oa var15 = var1.ai(0, -729151693 * this.al);
         int var17;
         int var19;
         if (!var13.aw()) {
            int var16 = var2.at + var2.aa;

            for(var17 = 0; var17 < var13.ac(); ++var17) {
               om var18 = var13.al(var17);
               var19 = var18.an * 1620071571 + var8;
               int var20 = var2.charWidth(var18.af);
               int var21 = -727185157 * var18.aw + var9 - var4;
               Rasterizer2D.Rasterizer2D_fillRectangle(var19, var21, var20, var16, -1287309 * this.ai);
            }
         }

         if (!var22.aw()) {
            var2.ad(var22, var8, var9, 1499601627 * this.ay, this.ao * 812242279, -1);
         }

         if (!var13.aw()) {
            var2.ad(var13, var8, var9, this.ax * 933331403, this.ao * 812242279, -1);
         }

         if (!var14.aw()) {
            var2.ad(var14, var8, var9, this.ay * 1499601627, this.ao * 812242279, -1);
         }

         if (this.aa) {
            rg var23 = var15.aq();
            var17 = var8 + (Integer)var23.af;
            int var24 = var9 + (Integer)var23.an;
            var19 = var24 - var5;
            Rasterizer2D.Rasterizer2D_drawLine(var17, var24, var17, var19, this.ay * 1499601627);
            if (-1 != 812242279 * this.ao) {
               Rasterizer2D.Rasterizer2D_drawLine(var17 + 1, 1 + var24, 1 + var17, var19 + 1, this.ao * 812242279);
            }
         }

      }
   }
}
