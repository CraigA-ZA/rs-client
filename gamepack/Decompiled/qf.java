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

   static final boolean ag_renamed(it var0, int var1, int var2, int var3, int var4) {
      boolean var6 = ix.af;
      if (!var6) {
         return false;
      } else {
         ew.ai_renamed();
         iq var7 = (iq)var0.bj.get(var1);
         int var8 = 108689513 * var7.af + var2;
         int var9 = var3 + 849275953 * var7.an;
         int var10 = -1615192333 * var7.aw + var4;
         int var11 = -1923653815 * var7.ac;
         int var12 = -975840301 * var7.au;
         int var13 = var7.ab * -452185969;
         int var14 = -1874962943 * ix.au - var8;
         int var15 = lh.ab * 554168439 - var9;
         int var16 = -1672023491 * ix.aq - var10;
         if (Math.abs(var14) > -391109139 * EnumType.ay + var11) {
            return false;
         } else if (Math.abs(var15) > var12 + ix.ao * 1926934503) {
            return false;
         } else if (Math.abs(var16) > aa.ax * -2043788763 + var13) {
            return false;
         } else if (Math.abs(var16 * -864785215 * ea.at - var15 * -2085912871 * ReflectionCheck.aa) > var12 * -2043788763 * aa.ax + var13 * ix.ao * 1926934503) {
            return false;
         } else if (Math.abs(-2085912871 * ReflectionCheck.aa * var14 - var16 * 1677061457 * ix.al) > EnumType.ay * -391109139 * var13 + var11 * -2043788763 * aa.ax) {
            return false;
         } else {
            return Math.abs(var15 * ix.al * 1677061457 - -864785215 * ea.at * var14) <= -391109139 * EnumType.ay * var12 + 1926934503 * ix.ao * var11;
         }
      }
   }
}
