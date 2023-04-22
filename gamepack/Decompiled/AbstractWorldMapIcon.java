public abstract class AbstractWorldMapIcon {
   public final Coord coord2;
   int at;
   int aa;
   public final Coord coord1;

   boolean ak(int var1, int var2) {
      WorldMapLabel var4 = this.label();
      if (null == var4) {
         return false;
      } else if (var1 >= this.at * -216598991 - var4.width * -31821843 / 2 && var1 <= var4.width * -31821843 / 2 + this.at * -216598991) {
         return var2 >= this.aa * -1288412757 && var2 <= this.aa * -1288412757 + var4.height * -1401615011;
      } else {
         return false;
      }
   }

   boolean am(int var1, int var2) {
      if (this.aj(var1, var2)) {
         return true;
      } else {
         return this.ak(var1, var2);
      }
   }

   abstract WorldMapLabel label();

   abstract int ac();

   boolean as() {
      return this.element() >= 0;
   }

   boolean aj(int var1, int var2) {
      if (!this.as()) {
         return false;
      } else {
         MapElementType var4 = nf.getMapElementType(this.element());
         int var5 = this.ac();
         int var6 = this.au();
         switch (var4.aj.ac * 1932346871) {
            case 0:
               if (var1 <= -216598991 * this.at - var5 || var1 > -216598991 * this.at) {
                  return false;
               }
               break;
            case 1:
               if (var1 < this.at * -216598991 || var1 >= -216598991 * this.at + var5) {
                  return false;
               }
               break;
            case 2:
               if (var1 < -216598991 * this.at - var5 / 2 || var1 > -216598991 * this.at + var5 / 2) {
                  return false;
               }
         }

         switch (var4.ak.ac * 578864459) {
            case 0:
               if (var2 < -1288412757 * this.aa || var2 >= var6 + this.aa * -1288412757) {
                  return false;
               }
               break;
            case 1:
               if (var2 >= -1288412757 * this.aa - var6 / 2 && var2 <= -1288412757 * this.aa + var6 / 2) {
                  break;
               }

               return false;
            case 2:
               if (var2 <= this.aa * -1288412757 - var6 || var2 > this.aa * -1288412757) {
                  return false;
               }
         }

         return true;
      }
   }

   public abstract int element();

   AbstractWorldMapIcon(Coord var1, Coord var2) {
      this.coord1 = var1;
      this.coord2 = var2;
   }

   abstract int au();
}
