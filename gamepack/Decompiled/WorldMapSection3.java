public class WorldMapSection3 implements WorldMapSection {
   static Component[] qk;
   int aa;
   int ab;
   int ac;
   int af;
   int al;
   int an;
   int aq;
   int at;
   int au;
   int aw;

   WorldMapSection3() {
   }

   public void expandBounds(WorldMapArea var1) {
      if (var1.aq * 77939951 > 1704678507 * this.aq) {
         var1.aq = this.aq * 829177925;
      }

      if (var1.al * 1854846129 < 758652409 * this.at) {
         var1.al = this.at * 652996553;
      }

      if (var1.at * 2059655157 > this.al * 710831151) {
         var1.at = 1834070291 * this.al;
      }

      if (var1.aa * -1086956513 < -422674435 * this.aa) {
         var1.aa = this.aa * 1310400611;
      }

   }

   public boolean containsCoord(int var1, int var2, int var3) {
      if (var1 >= 2017495751 * this.af && var1 < this.af * 2017495751 + 737827993 * this.an) {
         return var2 >> 6 >= 2029294685 * this.aw && var2 >> 6 <= this.au * 1316670953 && var3 >> 6 >= this.ac * 1330856607 && var3 >> 6 <= 140125345 * this.ab;
      } else {
         return false;
      }
   }

   public boolean containsPosition(int var1, int var2) {
      return var1 >> 6 >= this.aq * 1704678507 && var1 >> 6 <= 758652409 * this.at && var2 >> 6 >= 710831151 * this.al && var2 >> 6 <= -422674435 * this.aa;
   }

   public int[] position(int var1, int var2, int var3) {
      if (!this.containsCoord(var1, var2, var3)) {
         return null;
      } else {
         int[] var5 = new int[]{var2 + (this.aq * 1725242048 - 1025840960 * this.aw), -1751446592 * this.al - this.ac * -724523072 + var3};
         return var5;
      }
   }

   public Coord coord(int var1, int var2) {
      if (!this.containsPosition(var1, var2)) {
         return null;
      } else {
         int var4 = 1025840960 * this.aw - 1725242048 * this.aq + var1;
         int var5 = var2 + (-724523072 * this.ac - this.al * -1751446592);
         return new Coord(2017495751 * this.af, var4, var5);
      }
   }

   public void read(Packet var1) {
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

   void aq() {
   }
}
