public class Coord {
   public int af;
   public int an;
   public int aw;

   public Coord(int var1, int var2, int var3) {
      this.af = -166197253 * var1;
      this.an = -1150612997 * var2;
      this.aw = var3 * -1765780399;
   }

   public Coord(Coord var1) {
      this.af = var1.af * 1;
      this.an = 1 * var1.an;
      this.aw = var1.aw * 1;
   }

   public Coord(int var1) {
      if (var1 == -1) {
         this.af = 166197253;
      } else {
         this.af = (var1 >> 28 & 3) * -166197253;
         this.an = -1150612997 * (var1 >> 14 & 16383);
         this.aw = -1765780399 * (var1 & 16383);
      }

   }

   public int af() {
      return ks.an_renamed(-113644749 * this.af, -96298701 * this.an, -2105445199 * this.aw);
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof Coord) ? false : this.equals0((Coord)var1);
      }
   }

   boolean equals0(Coord var1) {
      if (this.af * -113644749 != var1.af * -113644749) {
         return false;
      } else if (-96298701 * var1.an != this.an * -96298701) {
         return false;
      } else {
         return this.aw * -2105445199 == var1.aw * -2105445199;
      }
   }

   public int hashCode() {
      return this.af();
   }

   public String toString() {
      return this.toString0(",");
   }

   String toString0(String var1) {
      return -113644749 * this.af + var1 + (this.an * -96298701 >> 6) + var1 + (-2105445199 * this.aw >> 6) + var1 + (-96298701 * this.an & 63) + var1 + (-2105445199 * this.aw & 63);
   }

   static final void if_renamed() {
      if (GraphicsObject.sl) {
         if (es.sb != null) {
            es.sb.sort();
         }

         for(int var1 = 0; var1 < -2010934433 * ds.ab; ++var1) {
            Player var2 = Client.mc[ds.aq[var1]];
            var2.ay();
         }

         GraphicsObject.sl = false;
      }

   }
}
