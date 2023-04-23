public final class Projectile extends Entity {
   boolean isMoving = false;
   double ag;
   double speedX;
   double ai;
   double speedZ;
   double speed;
   double accelerationZ;
   double speedY;
   double ax;
   SeqType seqType;
   int int4;
   int int5;
   int sourceY;
   int frame = 0;
   int frameCycle = 0;
   int id;
   int yaw;
   int pitch;
   int cycleEnd;
   int plane;
   int cycleStart;
   int int3;
   int sourceZ;
   int sourceX;
   int targetIndex;

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
      this.id = var1 * 1976780613;
      this.plane = -285111439 * var2;
      this.sourceX = var3 * 1597594169;
      this.sourceY = var4 * 2006425677;
      this.sourceZ = 1414804309 * var5;
      this.cycleStart = 1059692065 * var6;
      this.cycleEnd = 439544315 * var7;
      this.int3 = var8 * 1262587759;
      this.int4 = -685079183 * var9;
      this.targetIndex = -1186625123 * var10;
      this.int5 = var11 * 528720955;
      this.isMoving = false;
      int var12 = Inventory.getSpotType(this.id * 19084173).sequence * 374130911;
      if (-1 != var12) {
         this.seqType = Inventory.getSeqType(var12, (byte)109);
      } else {
         this.seqType = null;
      }

   }

   final void setDestination(int var1, int var2, int var3, int var4) {
      double var6;
      if (!this.isMoving) {
         var6 = (double)(var1 - -1024822263 * this.sourceX);
         double var8 = (double)(var2 - this.sourceY * -650340219);
         double var10 = Math.sqrt(var8 * var8 + var6 * var6);
         this.ax = (double)(-1024822263 * this.sourceX) + (double)(this.int4 * 1485806481) * var6 / var10;
         this.ai = (double)(1485806481 * this.int4) * var8 / var10 + (double)(-650340219 * this.sourceY);
         this.ag = (double)(1797140989 * this.sourceZ);
      }

      var6 = (double)(1 + -1203783373 * this.cycleEnd - var4);
      this.speedX = ((double)var1 - this.ax) / var6;
      this.speedY = ((double)var2 - this.ai) / var6;
      this.speed = Math.sqrt(this.speedY * this.speedY + this.speedX * this.speedX);
      if (!this.isMoving) {
         this.speedZ = -this.speed * Math.tan(0.02454369 * (double)(this.int3 * 1173139343));
      }

      this.accelerationZ = 2.0 * ((double)var3 - this.ag - this.speedZ * var6) / (var6 * var6);
   }

   final void advance(int var1) {
      this.isMoving = true;
      this.ax += this.speedX * (double)var1;
      this.ai += this.speedY * (double)var1;
      this.ag += this.speedZ * (double)var1 + (double)var1 * 0.5 * this.accelerationZ * (double)var1;
      this.speedZ += this.accelerationZ * (double)var1;
      this.yaw = ((int)(Math.atan2(this.speedX, this.speedY) * 325.949) + 1024 & 2047) * 1909592961;
      this.pitch = ((int)(Math.atan2(this.speedZ, this.speed) * 325.949) & 2047) * -361004777;
      if (null != this.seqType) {
         if (!this.seqType.ao()) {
            this.frameCycle += 1634469153 * var1;

            while(true) {
               do {
                  do {
                     if (723631841 * this.frameCycle <= this.seqType.frameLengths[this.frame * -693399445]) {
                        return;
                     }

                     this.frameCycle -= this.seqType.frameLengths[-693399445 * this.frame] * 1634469153;
                     this.frame += -1253532605;
                  } while(this.frame * -693399445 < this.seqType.frameIds.length);

                  this.frame -= this.seqType.righthand * 1545662235;
               } while(this.frame * -693399445 >= 0 && -693399445 * this.frame < this.seqType.frameIds.length);

               this.frame = 0;
            }
         } else {
            this.frame += -1253532605 * var1;
            int var3 = this.seqType.ax();
            if (-693399445 * this.frame >= var3) {
               this.frame = (var3 - this.seqType.righthand * 1363943497) * -1253532605;
            }
         }
      }

   }

   protected final it getModel() {
      SpotType var2 = Inventory.getSpotType(19084173 * this.id);
      it var3 = var2.au(-693399445 * this.frame);
      if (var3 == null) {
         return null;
      } else {
         var3.bi(-1585330521 * this.pitch);
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
