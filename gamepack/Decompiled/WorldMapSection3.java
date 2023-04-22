public class WorldMapSection3 implements WorldMapSection {
   static Component[] qk;
   int aq;
   int af;
   int aw;
   int au;
   int ab;
   int ac;
   int al;
   int at;
   int an;
   int aa;

   public void af(WorldMapArea var1) {
      if (var1.minX0 * 77939951 > 1704678507 * this.aq) {
         var1.minX0 = this.aq * 829177925;
      }

      if (var1.maxX0 * 1854846129 < 758652409 * this.at) {
         var1.maxX0 = this.at * 652996553;
      }

      if (var1.minY0 * 2059655157 > this.al * 710831151) {
         var1.minY0 = 1834070291 * this.al;
      }

      if (var1.maxY0 * -1086956513 < -422674435 * this.aa) {
         var1.maxY0 = this.aa * 1310400611;
      }

   }

   public boolean an(int var1, int var2, int var3) {
      if (var1 >= 2017495751 * this.af && var1 < this.af * 2017495751 + 737827993 * this.an) {
         return var2 >> 6 >= 2029294685 * this.aw && var2 >> 6 <= this.au * 1316670953 && var3 >> 6 >= this.ac * 1330856607 && var3 >> 6 <= 140125345 * this.ab;
      } else {
         return false;
      }
   }

   public Coord au(int var1, int var2) {
      if (!this.aw(var1, var2)) {
         return null;
      } else {
         int var4 = 1025840960 * this.aw - 1725242048 * this.aq + var1;
         int var5 = var2 + (-724523072 * this.ac - this.al * -1751446592);
         return new Coord(2017495751 * this.af, var4, var5);
      }
   }

   public boolean aw(int var1, int var2) {
      return var1 >> 6 >= this.aq * 1704678507 && var1 >> 6 <= 758652409 * this.at && var2 >> 6 >= 710831151 * this.al && var2 >> 6 <= -422674435 * this.aa;
   }

   void aq() {
   }

   WorldMapSection3() {
   }

   public int[] ac(int var1, int var2, int var3) {
      if (!this.an(var1, var2, var3)) {
         return null;
      } else {
         int[] var5 = new int[]{var2 + (this.aq * 1725242048 - 1025840960 * this.aw), -1751446592 * this.al - this.ac * -724523072 + var3};
         return var5;
      }
   }

   public void ab(Packet var1) {
      this.af = var1.g1() * -1899292937;
      this.an = var1.g1() * -856410199;
      this.aw = var1.cl() * -932847627;
      this.ac = var1.cl() * 1701796191;
      this.au = var1.cl() * -58271143;
      this.ab = var1.cl() * -1039876255;
      this.aq = var1.cl() * -704333757;
      this.al = var1.cl() * 1891785423;
      this.at = var1.cl() * -941091767;
      this.aa = var1.cl() * 643487061;
      this.aq();
   }
}
