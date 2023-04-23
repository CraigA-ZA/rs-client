public abstract class AbstractWorldMapIcon {
   int aa;
   int at;
   public final Coord al;
   public final Coord aq;

   AbstractWorldMapIcon(Coord var1, Coord var2) {
      this.al = var1;
      this.aq = var2;
   }

   boolean am(int var1, int var2) {
      if (this.aj(var1, var2)) {
         return true;
      } else {
         return this.ak(var1, var2);
      }
   }

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

   boolean ak(int var1, int var2) {
      WorldMapLabel var4 = this.label();
      if (null == var4) {
         return false;
      } else if (var1 >= this.at * -216598991 - var4.an * -31821843 / 2 && var1 <= var4.an * -31821843 / 2 + this.at * -216598991) {
         return var2 >= this.aa * -1288412757 && var2 <= this.aa * -1288412757 + var4.aw * -1401615011;
      } else {
         return false;
      }
   }

   abstract WorldMapLabel label();

   abstract int ac();

   public abstract int element();

   abstract int au();
}
