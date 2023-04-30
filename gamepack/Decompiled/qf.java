public class qf implements Enumerated {
   static final qf ac = new qf(3, 10);
   static final qf af = new qf(1, 1);
   static final qf an = new qf(2, 2);
   static final qf aw = new qf(0, 3);
   final int ab;
   final int au;

   qf(int var1, int var2) {
      this.au = -199539953 * var1;
      this.ab = var2 * -344766935;
   }

   public int ordinal() {
      return 2023077401 * this.ab;
   }

   static final boolean ag_renamed(Model var0, int var1, int var2, int var3, int var4) {
      boolean var6 = ViewportMouse.ViewportMouse_isInViewport;
      if (!var6) {
         return false;
      } else {
         ew.ai_renamed();
         AABB var7 = (AABB)var0.bj.get(var1);
         int var8 = 108689513 * var7.xMid + var2;
         int var9 = var3 + 849275953 * var7.yMid;
         int var10 = -1615192333 * var7.zMid + var4;
         int var11 = -1923653815 * var7.xMidOffset;
         int var12 = -975840301 * var7.yMidOffset;
         int var13 = var7.zMidOffset * -452185969;
         int var14 = -1874962943 * ViewportMouse.au - var8;
         int var15 = lh.ab * 554168439 - var9;
         int var16 = -1672023491 * ViewportMouse.aq - var10;
         if (Math.abs(var14) > -391109139 * EnumType.ay + var11) {
            return false;
         } else if (Math.abs(var15) > var12 + ViewportMouse.ao * 1926934503) {
            return false;
         } else if (Math.abs(var16) > aa.ax * -2043788763 + var13) {
            return false;
         } else if (Math.abs(var16 * -864785215 * UserComparator8.at - var15 * -2085912871 * ReflectionCheck.aa) > var12 * -2043788763 * aa.ax + var13 * ViewportMouse.ao * 1926934503) {
            return false;
         } else if (Math.abs(-2085912871 * ReflectionCheck.aa * var14 - var16 * 1677061457 * ViewportMouse.al) > EnumType.ay * -391109139 * var13 + var11 * -2043788763 * aa.ax) {
            return false;
         } else {
            return Math.abs(var15 * ViewportMouse.al * 1677061457 - -864785215 * UserComparator8.at * var14) <= -391109139 * EnumType.ay * var12 + 1926934503 * ViewportMouse.ao * var11;
         }
      }
   }
}
