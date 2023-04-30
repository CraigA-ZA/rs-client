public abstract class rw {
   int at;
   int ay;
   int al;
   double aa;

   double av() {
      return this.aa;
   }

   public void aa(int var1) {
      try {
         if (this.at * 1095678947 < this.al * 71849511) {
            if (var1 == -764404363) {
               throw new IllegalStateException();
            }

            this.at += -1759485493;
            this.aa = co.ao(1095678947 * this.at, 71849511 * this.al, 570638463 * this.ay, -426403722);
         }

      } catch (RuntimeException var2) {
         throw db.an(var2, "rw.aa(" + ')');
      }
   }

   static double az(int var0, int var1, int var2) {
      double var3 = var1 > 0 ? (double)Math.max(0.0F, Math.min(1.0F, (float)var0 / (float)var1)) : 1.0;
      if (!(var3 <= 0.0) && !(var3 >= 1.0)) {
         double var5;
         double var7;
         switch (var2) {
            case 0:
               return var3;
            case 1:
               return 1.0 - Math.cos(Math.PI * var3 / 2.0);
            case 2:
               return Math.sin(var3 * Math.PI / 2.0);
            case 3:
               return -(Math.cos(var3 * Math.PI) - 1.0) / 2.0;
            case 4:
               return var3 * var3;
            case 5:
               return 1.0 - (1.0 - var3) * (1.0 - var3);
            case 6:
               return var3 < 0.5 ? var3 * var3 * 2.0 : 1.0 - Math.pow(2.0 + var3 * -2.0, 2.0) / 2.0;
            case 7:
               return var3 * var3 * var3;
            case 8:
               return 1.0 - Math.pow(1.0 - var3, 3.0);
            case 9:
               return var3 < 0.5 ? 4.0 * var3 * var3 * var3 : 1.0 - Math.pow(2.0 + -2.0 * var3, 3.0) / 2.0;
            case 10:
               return var3 * var3 * var3 * var3;
            case 11:
               return 1.0 - Math.pow(1.0 - var3, 4.0);
            case 12:
               return var3 < 0.5 ? var3 * var3 * var3 * var3 * 8.0 : 1.0 - Math.pow(var3 * -2.0 + 2.0, 4.0) / 2.0;
            case 13:
               return var3 * var3 * var3 * var3 * var3;
            case 14:
               return 1.0 - Math.pow(1.0 - var3, 5.0);
            case 15:
               return var3 < 0.5 ? var3 * var3 * var3 * 8.0 * var3 * var3 : 1.0 - Math.pow(var3 * -2.0 + 2.0, 5.0) / 2.0;
            case 16:
               return Math.pow(2.0, var3 * 10.0 - 10.0);
            case 17:
               return 1.0 - Math.pow(2.0, var3 * -10.0);
            case 18:
               return var3 < 0.5 ? Math.pow(2.0, 20.0 * var3 + 10.0) / 2.0 : (2.0 - Math.pow(2.0, 10.0 + var3 * -20.0)) / 2.0;
            case 19:
               return 1.0 - Math.sqrt(1.0 - Math.pow(var3, 2.0));
            case 20:
               return Math.sqrt(1.0 - Math.pow(var3 - 1.0, 2.0));
            case 21:
               return var3 < 0.5 ? (1.0 - Math.sqrt(1.0 - Math.pow(2.0 * var3, 2.0))) / 2.0 : (Math.sqrt(1.0 - Math.pow(2.0 + -2.0 * var3, 2.0)) + 1.0) / 2.0;
            case 22:
               var5 = 1.70158;
               var7 = 2.70158;
               return var3 * 2.70158 * var3 * var3 - 1.70158 * var3 * var3;
            case 23:
               var5 = 1.70158;
               var7 = 2.70158;
               return 1.0 + 2.70158 * Math.pow(var3 - 1.0, 3.0) + 1.70158 * Math.pow(var3 - 1.0, 2.0);
            case 24:
               var5 = 1.70158;
               var7 = 2.5949095;
               return var3 < 0.5 ? Math.pow(2.0 * var3, 2.0) * (7.189819 * var3 - 2.5949095) / 2.0 : (Math.pow(var3 * 2.0 - 2.0, 2.0) * (2.5949095 + (var3 * 2.0 - 2.0) * 3.5949095) + 2.0) / 2.0;
            case 25:
               var5 = 2.0943951023931953;
               return -Math.pow(2.0, var3 * 10.0 - 10.0) * Math.sin((10.0 * var3 - 10.75) * 2.0943951023931953);
            case 26:
               var5 = 2.0943951023931953;
               return Math.pow(2.0, -10.0 * var3) * Math.sin((var3 * 10.0 - 0.75) * 2.0943951023931953) + 1.0;
            case 27:
               var5 = 1.3962634015954636;
               var7 = Math.sin((20.0 * var3 - 11.125) * 1.3962634015954636);
               return var3 < 0.5 ? -(Math.pow(2.0, var3 * 20.0 - 10.0) * var7) / 2.0 : Math.pow(2.0, -20.0 * var3 + 10.0) * var7 / 2.0 + 1.0;
            default:
               return var3;
         }
      } else {
         return var3 <= 0.0 ? 0.0 : 1.0;
      }
   }

   double ar() {
      return this.aa;
   }

   public void ai() {
      if (this.at * -1177830986 < this.al * 1362565729) {
         this.at += -1759485493;
         this.aa = co.ao(1157153616 * this.at, -1802535646 * this.al, 570638463 * this.ay, -1046178178);
      }

   }

   public void ag() {
      if (this.at * 1095678947 < this.al * 71849511) {
         this.at += -1759485493;
         this.aa = co.ao(1095678947 * this.at, 71849511 * this.al, 570638463 * this.ay, 85100605);
      }

   }

   public void ax() {
      if (this.at * 1095678947 < this.al * 71849511) {
         this.at += -1759485493;
         this.aa = co.ao(1095678947 * this.at, 71849511 * this.al, 570638463 * this.ay, -1303011872);
      }

   }

   double ay(int var1) {
      try {
         return this.aa;
      } catch (RuntimeException var2) {
         throw db.an(var2, "rw.ay(" + ')');
      }
   }

   rw(int var1, int var2) {
      try {
         super();
         this.al = 0;
         this.at = 0;
         this.aa = 0.0;
         this.ay = 0;
         this.al = var1 * -617236073;
         this.at = 0;
         this.ay = (var2 >= 0 && var2 <= 27 ? var2 : 0) * -895713409;
         this.aa = co.ao(this.at * 1095678947, this.al * 71849511, this.ay * 570638463, 547022125);
      } catch (RuntimeException var3) {
         throw db.an(var3, "rw.<init>(" + ')');
      }
   }

   double am() {
      return this.aa;
   }

   double as() {
      return this.aa;
   }

   static double aj(int var0, int var1, int var2) {
      double var3 = var1 > 0 ? (double)Math.max(0.0F, Math.min(1.0F, (float)var0 / (float)var1)) : 1.0;
      if (!(var3 <= 0.0) && !(var3 >= 1.0)) {
         double var5;
         double var7;
         switch (var2) {
            case 0:
               return var3;
            case 1:
               return 1.0 - Math.cos(Math.PI * var3 / 2.0);
            case 2:
               return Math.sin(var3 * Math.PI / 2.0);
            case 3:
               return -(Math.cos(var3 * Math.PI) - 1.0) / 2.0;
            case 4:
               return var3 * var3;
            case 5:
               return 1.0 - (1.0 - var3) * (1.0 - var3);
            case 6:
               return var3 < 0.5 ? var3 * var3 * 2.0 : 1.0 - Math.pow(2.0 + var3 * -2.0, 2.0) / 2.0;
            case 7:
               return var3 * var3 * var3;
            case 8:
               return 1.0 - Math.pow(1.0 - var3, 3.0);
            case 9:
               return var3 < 0.5 ? 4.0 * var3 * var3 * var3 : 1.0 - Math.pow(2.0 + -2.0 * var3, 3.0) / 2.0;
            case 10:
               return var3 * var3 * var3 * var3;
            case 11:
               return 1.0 - Math.pow(1.0 - var3, 4.0);
            case 12:
               return var3 < 0.5 ? var3 * var3 * var3 * var3 * 8.0 : 1.0 - Math.pow(var3 * -2.0 + 2.0, 4.0) / 2.0;
            case 13:
               return var3 * var3 * var3 * var3 * var3;
            case 14:
               return 1.0 - Math.pow(1.0 - var3, 5.0);
            case 15:
               return var3 < 0.5 ? var3 * var3 * var3 * 8.0 * var3 * var3 : 1.0 - Math.pow(var3 * -2.0 + 2.0, 5.0) / 2.0;
            case 16:
               return Math.pow(2.0, var3 * 10.0 - 10.0);
            case 17:
               return 1.0 - Math.pow(2.0, var3 * -10.0);
            case 18:
               return var3 < 0.5 ? Math.pow(2.0, 20.0 * var3 + 10.0) / 2.0 : (2.0 - Math.pow(2.0, 10.0 + var3 * -20.0)) / 2.0;
            case 19:
               return 1.0 - Math.sqrt(1.0 - Math.pow(var3, 2.0));
            case 20:
               return Math.sqrt(1.0 - Math.pow(var3 - 1.0, 2.0));
            case 21:
               return var3 < 0.5 ? (1.0 - Math.sqrt(1.0 - Math.pow(2.0 * var3, 2.0))) / 2.0 : (Math.sqrt(1.0 - Math.pow(2.0 + -2.0 * var3, 2.0)) + 1.0) / 2.0;
            case 22:
               var5 = 1.70158;
               var7 = 2.70158;
               return var3 * 2.70158 * var3 * var3 - 1.70158 * var3 * var3;
            case 23:
               var5 = 1.70158;
               var7 = 2.70158;
               return 1.0 + 2.70158 * Math.pow(var3 - 1.0, 3.0) + 1.70158 * Math.pow(var3 - 1.0, 2.0);
            case 24:
               var5 = 1.70158;
               var7 = 2.5949095;
               return var3 < 0.5 ? Math.pow(2.0 * var3, 2.0) * (7.189819 * var3 - 2.5949095) / 2.0 : (Math.pow(var3 * 2.0 - 2.0, 2.0) * (2.5949095 + (var3 * 2.0 - 2.0) * 3.5949095) + 2.0) / 2.0;
            case 25:
               var5 = 2.0943951023931953;
               return -Math.pow(2.0, var3 * 10.0 - 10.0) * Math.sin((10.0 * var3 - 10.75) * 2.0943951023931953);
            case 26:
               var5 = 2.0943951023931953;
               return Math.pow(2.0, -10.0 * var3) * Math.sin((var3 * 10.0 - 0.75) * 2.0943951023931953) + 1.0;
            case 27:
               var5 = 1.3962634015954636;
               var7 = Math.sin((20.0 * var3 - 11.125) * 1.3962634015954636);
               return var3 < 0.5 ? -(Math.pow(2.0, var3 * 20.0 - 10.0) * var7) / 2.0 : Math.pow(2.0, -20.0 * var3 + 10.0) * var7 / 2.0 + 1.0;
            default:
               return var3;
         }
      } else {
         return var3 <= 0.0 ? 0.0 : 1.0;
      }
   }

   static double ak(int var0, int var1, int var2) {
      double var3 = var1 > 0 ? (double)Math.max(0.0F, Math.min(1.0F, (float)var0 / (float)var1)) : 1.0;
      if (!(var3 <= 0.0) && !(var3 >= 1.0)) {
         double var5;
         double var7;
         switch (var2) {
            case 0:
               return var3;
            case 1:
               return 1.0 - Math.cos(Math.PI * var3 / 2.0);
            case 2:
               return Math.sin(var3 * Math.PI / 2.0);
            case 3:
               return -(Math.cos(var3 * Math.PI) - 1.0) / 2.0;
            case 4:
               return var3 * var3;
            case 5:
               return 1.0 - (1.0 - var3) * (1.0 - var3);
            case 6:
               return var3 < 0.5 ? var3 * var3 * 2.0 : 1.0 - Math.pow(2.0 + var3 * -2.0, 2.0) / 2.0;
            case 7:
               return var3 * var3 * var3;
            case 8:
               return 1.0 - Math.pow(1.0 - var3, 3.0);
            case 9:
               return var3 < 0.5 ? 4.0 * var3 * var3 * var3 : 1.0 - Math.pow(2.0 + -2.0 * var3, 3.0) / 2.0;
            case 10:
               return var3 * var3 * var3 * var3;
            case 11:
               return 1.0 - Math.pow(1.0 - var3, 4.0);
            case 12:
               return var3 < 0.5 ? var3 * var3 * var3 * var3 * 8.0 : 1.0 - Math.pow(var3 * -2.0 + 2.0, 4.0) / 2.0;
            case 13:
               return var3 * var3 * var3 * var3 * var3;
            case 14:
               return 1.0 - Math.pow(1.0 - var3, 5.0);
            case 15:
               return var3 < 0.5 ? var3 * var3 * var3 * 8.0 * var3 * var3 : 1.0 - Math.pow(var3 * -2.0 + 2.0, 5.0) / 2.0;
            case 16:
               return Math.pow(2.0, var3 * 10.0 - 10.0);
            case 17:
               return 1.0 - Math.pow(2.0, var3 * -10.0);
            case 18:
               return var3 < 0.5 ? Math.pow(2.0, 20.0 * var3 + 10.0) / 2.0 : (2.0 - Math.pow(2.0, 10.0 + var3 * -20.0)) / 2.0;
            case 19:
               return 1.0 - Math.sqrt(1.0 - Math.pow(var3, 2.0));
            case 20:
               return Math.sqrt(1.0 - Math.pow(var3 - 1.0, 2.0));
            case 21:
               return var3 < 0.5 ? (1.0 - Math.sqrt(1.0 - Math.pow(2.0 * var3, 2.0))) / 2.0 : (Math.sqrt(1.0 - Math.pow(2.0 + -2.0 * var3, 2.0)) + 1.0) / 2.0;
            case 22:
               var5 = 1.70158;
               var7 = 2.70158;
               return var3 * 2.70158 * var3 * var3 - 1.70158 * var3 * var3;
            case 23:
               var5 = 1.70158;
               var7 = 2.70158;
               return 1.0 + 2.70158 * Math.pow(var3 - 1.0, 3.0) + 1.70158 * Math.pow(var3 - 1.0, 2.0);
            case 24:
               var5 = 1.70158;
               var7 = 2.5949095;
               return var3 < 0.5 ? Math.pow(2.0 * var3, 2.0) * (7.189819 * var3 - 2.5949095) / 2.0 : (Math.pow(var3 * 2.0 - 2.0, 2.0) * (2.5949095 + (var3 * 2.0 - 2.0) * 3.5949095) + 2.0) / 2.0;
            case 25:
               var5 = 2.0943951023931953;
               return -Math.pow(2.0, var3 * 10.0 - 10.0) * Math.sin((10.0 * var3 - 10.75) * 2.0943951023931953);
            case 26:
               var5 = 2.0943951023931953;
               return Math.pow(2.0, -10.0 * var3) * Math.sin((var3 * 10.0 - 0.75) * 2.0943951023931953) + 1.0;
            case 27:
               var5 = 1.3962634015954636;
               var7 = Math.sin((20.0 * var3 - 11.125) * 1.3962634015954636);
               return var3 < 0.5 ? -(Math.pow(2.0, var3 * 20.0 - 10.0) * var7) / 2.0 : Math.pow(2.0, -20.0 * var3 + 10.0) * var7 / 2.0 + 1.0;
            default:
               return var3;
         }
      } else {
         return var3 <= 0.0 ? 0.0 : 1.0;
      }
   }

   public void ah() {
      if (this.at * 1095678947 < this.al * 71849511) {
         this.at += -1759485493;
         this.aa = co.ao(1095678947 * this.at, 71849511 * this.al, 570638463 * this.ay, -1567759049);
      }

   }
}
