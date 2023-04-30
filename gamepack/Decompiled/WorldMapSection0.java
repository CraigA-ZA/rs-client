public class WorldMapSection0 implements WorldMapSection {
   static Task js5SocketTask;
   int aa;
   int ab;
   int ac;
   int af;
   int ai;
   int al;
   int an;
   int ao;
   int aq;
   int at;
   int au;
   int aw;
   int ax;
   int ay;

   WorldMapSection0() {
   }

   public void expandBounds(WorldMapArea var1) {
      if (77939951 * var1.minX0 > this.au * -1555384875) {
         var1.minX0 = this.au * -1093871237;
      }

      if (1854846129 * var1.maxX0 < this.au * -1555384875) {
         var1.maxX0 = -2069943195 * this.au;
      }

      if (var1.minY0 * 2059655157 > this.ab * -347980981) {
         var1.minY0 = 297795135 * this.ab;
      }

      if (-1086956513 * var1.maxY0 < this.ab * -347980981) {
         var1.maxY0 = this.ab * -1984578731;
      }

   }

   public boolean containsCoord(int var1, int var2, int var3) {
      if (var1 >= this.af * -1490859351 && var1 < this.an * -1180089391 + -1490859351 * this.af) {
         return var2 >= (275577107 * this.aw << 6) + (this.aq * 534868105 << 3) && var2 <= (593688545 * this.at << 3) + (275577107 * this.aw << 6) + 7 && var3 >= (1257977427 * this.al << 3) + (-365078831 * this.ac << 6) && var3 <= 7 + (this.ac * -365078831 << 6) + (849738307 * this.aa << 3);
      } else {
         return false;
      }
   }

   public boolean containsPosition(int var1, int var2) {
      return var1 >= (this.au * -1555384875 << 6) + (-320125941 * this.ay << 3) && var1 <= 7 + (this.au * -1555384875 << 6) + (this.ax * -1911161937 << 3) && var2 >= (1970066063 * this.ao << 3) + (this.ab * -347980981 << 6) && var2 <= 7 + (-347980981 * this.ab << 6) + (-264659017 * this.ai << 3);
   }

   public int[] position(int var1, int var2, int var3) {
      if (!this.containsCoord(var1, var2, var3)) {
         return null;
      } else {
         int[] var5 = new int[]{this.ay * 1733959768 - this.aq * -16022456 + -760384192 * this.au - this.aw * 457065664 + var2, var3 + (this.ab * -795946304 - -1890208704 * this.ac) + (-1419340680 * this.ao - this.al * 1473884824)};
         return var5;
      }
   }

   public Coord coord(int var1, int var2) {
      if (!this.containsPosition(var1, var2)) {
         return null;
      } else {
         int var4 = var1 + (457065664 * this.aw - -760384192 * this.au) + (-16022456 * this.aq - 1733959768 * this.ay);
         int var5 = -1890208704 * this.ac - this.ab * -795946304 + var2 + (1473884824 * this.al - this.ao * -1419340680);
         return new Coord(-1490859351 * this.af, var4, var5);
      }
   }

   public void read(Packet var1) {
      this.af = var1.g1() * -1371866727;
      this.an = var1.g1() * 1766061361;
      this.aw = var1.cl() * -1529759461;
      this.aq = var1.g1() * -1324677703;
      this.at = var1.g1() * 445615137;
      this.ac = var1.cl() * 1425588785;
      this.al = var1.g1() * -1310294565;
      this.aa = var1.g1() * 597074539;
      this.au = var1.cl() * -1827087491;
      this.ay = var1.g1() * -868079709;
      this.ax = var1.g1() * 1286224719;
      this.ab = var1.cl() * 781973091;
      this.ao = var1.g1() * -1779561361;
      this.ai = var1.g1() * 1519676935;
      this.aq();
   }

   void aq() {
   }
}
