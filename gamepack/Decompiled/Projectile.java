public final class Projectile extends Entity {
   boolean ao = false;
   double ag;
   double ah;
   double ai;
   double am;
   double ar;
   double as;
   double av;
   double ax;
   SeqType az;
   int aa;
   int ab;
   int ac;
   int ad = 0;
   int ae = 0;
   int af;
   int aj;
   int ak;
   int al;
   int an;
   int aq;
   int at;
   int au;
   int aw;
   int ay;

   public static gx af_renamed(int var0, Packet var1) {
      int var3 = var1.g1();
      boolean var4 = 0 != (var3 & 1);
      boolean var5 = (var3 & 2) != 0;
      gx var6 = new gx(var0);
      int var7;
      int[] var8;
      boolean var9;
      int var10;
      short var11;
      if (var4) {
         var7 = var1.g1();
         var8 = new int[]{var7 & 15, var7 >> 4 & 15};
         var9 = var6.aw != null && var8.length == var6.aw.length;

         for(var10 = 0; var10 < 2; ++var10) {
            if (var8[var10] != 15) {
               var11 = (short)var1.cl();
               if (var9) {
                  var6.aw[var8[var10]] = var11;
               }
            }
         }
      }

      if (var5) {
         var7 = var1.g1();
         var8 = new int[]{var7 & 15, var7 >> 4 & 15};
         var9 = var6.ac != null && var8.length == var6.ac.length;

         for(var10 = 0; var10 < 2; ++var10) {
            if (15 != var8[var10]) {
               var11 = (short)var1.cl();
               if (var9) {
                  var6.ac[var8[var10]] = var11;
               }
            }
         }
      }

      return var6;
   }

   Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      this.af = var1 * 1976780613;
      this.an = -285111439 * var2;
      this.aw = var3 * 1597594169;
      this.ac = var4 * 2006425677;
      this.au = 1414804309 * var5;
      this.aq = 1059692065 * var6;
      this.al = 439544315 * var7;
      this.at = var8 * 1262587759;
      this.aa = -685079183 * var9;
      this.ay = -1186625123 * var10;
      this.ab = var11 * 528720955;
      this.ao = false;
      int var12 = Inventory.getSpotType(this.af * 19084173).aq * 374130911;
      if (-1 != var12) {
         this.az = Inventory.getSeqType(var12, (byte)109);
      } else {
         this.az = null;
      }

   }

   final void setDestination(int var1, int var2, int var3, int var4) {
      double var6;
      if (!this.ao) {
         var6 = (double)(var1 - -1024822263 * this.aw);
         double var8 = (double)(var2 - this.ac * -650340219);
         double var10 = Math.sqrt(var8 * var8 + var6 * var6);
         this.ax = (double)(-1024822263 * this.aw) + (double)(this.aa * 1485806481) * var6 / var10;
         this.ai = (double)(1485806481 * this.aa) * var8 / var10 + (double)(-650340219 * this.ac);
         this.ag = (double)(1797140989 * this.au);
      }

      var6 = (double)(1 + -1203783373 * this.al - var4);
      this.ah = ((double)var1 - this.ax) / var6;
      this.av = ((double)var2 - this.ai) / var6;
      this.ar = Math.sqrt(this.av * this.av + this.ah * this.ah);
      if (!this.ao) {
         this.am = -this.ar * Math.tan(0.02454369 * (double)(this.at * 1173139343));
      }

      this.as = 2.0 * ((double)var3 - this.ag - this.am * var6) / (var6 * var6);
   }

   final void advance(int var1) {
      this.ao = true;
      this.ax += this.ah * (double)var1;
      this.ai += this.av * (double)var1;
      this.ag += this.am * (double)var1 + (double)var1 * 0.5 * this.as * (double)var1;
      this.am += this.as * (double)var1;
      this.aj = ((int)(Math.atan2(this.ah, this.av) * 325.949) + 1024 & 2047) * 1909592961;
      this.ak = ((int)(Math.atan2(this.am, this.ar) * 325.949) & 2047) * -361004777;
      if (null != this.az) {
         if (!this.az.ao()) {
            this.ae += 1634469153 * var1;

            while(true) {
               do {
                  do {
                     if (723631841 * this.ae <= this.az.av[this.ad * -693399445]) {
                        return;
                     }

                     this.ae -= this.az.av[-693399445 * this.ad] * 1634469153;
                     this.ad += -1253532605;
                  } while(this.ad * -693399445 < this.az.ag.length);

                  this.ad -= this.az.am * 1545662235;
               } while(this.ad * -693399445 >= 0 && -693399445 * this.ad < this.az.ag.length);

               this.ad = 0;
            }
         } else {
            this.ad += -1253532605 * var1;
            int var3 = this.az.ax();
            if (-693399445 * this.ad >= var3) {
               this.ad = (var3 - this.az.am * 1363943497) * -1253532605;
            }
         }
      }

   }

   protected final it getModel() {
      SpotType var2 = Inventory.getSpotType(19084173 * this.af);
      it var3 = var2.au(-693399445 * this.ad);
      if (var3 == null) {
         return null;
      } else {
         var3.bi(-1585330521 * this.ak);
         return var3;
      }
   }

   static final int ax_renamed() {
      return ix.an * 2139535413;
   }

   static long ho_renamed() {
      return Client.mn * -1749026863537138247L;
   }
}
