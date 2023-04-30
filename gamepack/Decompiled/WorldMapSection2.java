public class WorldMapSection2 implements WorldMapSection {
   int ab;
   int ac;
   int af;
   int an;
   int au;
   int aw;

   WorldMapSection2() {
   }

   public void expandBounds(WorldMapArea var1) {
      if (77939951 * var1.minX0 > 1109784749 * this.au) {
         var1.minX0 = this.au * 759378979;
      }

      if (1854846129 * var1.maxX0 < this.au * 1109784749) {
         var1.maxX0 = -612355395 * this.au;
      }

      if (var1.minY0 * 2059655157 > this.ab * 1408900281) {
         var1.minY0 = this.ab * 429878069;
      }

      if (var1.maxY0 * -1086956513 < this.ab * 1408900281) {
         var1.maxY0 = this.ab * -510956505;
      }

   }

   static void af_renamed(int var0) {
      qj.aw = var0 * 1268073833;
      qj.an = new qj[var0];
      qj.ac = 0;
   }

   public boolean containsCoord(int var1, int var2, int var3) {
      if (var1 >= this.af * -1743834479 && var1 < this.af * -1743834479 + 1589949637 * this.an) {
         return this.aw * 304223505 == var2 >> 6 && var3 >> 6 == 1241809143 * this.ac;
      } else {
         return false;
      }
   }

   public boolean containsPosition(int var1, int var2) {
      return 1109784749 * this.au == var1 >> 6 && var2 >> 6 == 1408900281 * this.ab;
   }

   public int[] position(int var1, int var2, int var3) {
      if (!this.containsCoord(var1, var2, var3)) {
         return null;
      } else {
         int[] var5 = new int[]{var2 + (-1988220096 * this.au - this.aw * -2004532160), this.ab * -24695232 - this.ac * -2128593472 + var3};
         return var5;
      }
   }

   public Coord coord(int var1, int var2) {
      if (!this.containsPosition(var1, var2)) {
         return null;
      } else {
         int var4 = var1 + (-2004532160 * this.aw - -1988220096 * this.au);
         int var5 = var2 + (-2128593472 * this.ac - -24695232 * this.ab);
         return new Coord(this.af * -1743834479, var4, var5);
      }
   }

   public void read(Packet var1) {
      this.af = var1.g1() * 1979371121;
      this.an = var1.g1() * -6772211;
      this.aw = var1.cl() * 85687281;
      this.ac = var1.cl() * -1924251449;
      this.au = var1.cl() * 813050661;
      this.ab = var1.cl() * -529192567;
      this.aq();
   }

   void aq() {
   }
}
