public class Coord {
   public int x;
   public int y;
   public int z;

   public String toString() {
      return this.toString0(",");
   }

   public Coord(int var1) {
      if (var1 == -1) {
         this.y = 166197253;
      } else {
         this.y = (var1 >> 28 & 3) * -166197253;
         this.x = -1150612997 * (var1 >> 14 & 16383);
         this.z = -1765780399 * (var1 & 16383);
      }

   }

   boolean equals0(Coord var1) {
      if (this.y * -113644749 != var1.y * -113644749) {
         return false;
      } else if (-96298701 * var1.x != this.x * -96298701) {
         return false;
      } else {
         return this.z * -2105445199 == var1.z * -2105445199;
      }
   }

   public int af() {
      return ks.an_renamed(-113644749 * this.y, -96298701 * this.x, -2105445199 * this.z);
   }

   String toString0(String var1) {
      return -113644749 * this.y + var1 + (this.x * -96298701 >> 6) + var1 + (-2105445199 * this.z >> 6) + var1 + (-96298701 * this.x & 63) + var1 + (-2105445199 * this.z & 63);
   }

   public Coord(Coord var1) {
      this.y = var1.y * 1;
      this.x = 1 * var1.x;
      this.z = var1.z * 1;
   }

   public Coord(int var1, int var2, int var3) {
      this.y = -166197253 * var1;
      this.x = -1150612997 * var2;
      this.z = var3 * -1765780399;
   }

   public int hashCode() {
      return this.af();
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof Coord) ? false : this.equals0((Coord)var1);
      }
   }

   static final void if_renamed() {
      if (GraphicsObject.sl) {
         if (es.clanChat != null) {
            es.clanChat.ba();
         }

         for(int var1 = 0; var1 < -2010934433 * ds.ab; ++var1) {
            Player var2 = Client.players[ds.aq[var1]];
            var2.ay();
         }

         GraphicsObject.sl = false;
      }

   }
}
