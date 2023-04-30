public class ge extends fb {
   String an;
   static int[][][] ag;
   long af;
   // $FF: synthetic field
   final fa this$0;

   ge(fa var1) {
      try {
         this.this$0 = var1;
         super();
         this.af = -3404272251065138399L;
         this.an = null;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ge.<init>(" + ')');
      }
   }

   void an(fj var1, int var2) {
      try {
         var1.aa(this.af * -7266015123784483041L, this.an, -1787643966);
      } catch (RuntimeException var3) {
         throw db.an(var3, "ge.an(" + ')');
      }
   }

   void aw(fj var1) {
      var1.aa(this.af * -7266015123784483041L, this.an, -1787643966);
   }

   void af(sg var1, int var2) {
      try {
         if (var1.cm((byte)7) != 255) {
            if (var2 == 1120136284) {
               throw new IllegalStateException();
            }

            var1.at -= -1516355947;
            this.af = var1.cv((byte)1) * 3404272251065138399L;
         }

         this.an = var1.cz((byte)-105);
      } catch (RuntimeException var3) {
         throw db.an(var3, "ge.af(" + ')');
      }
   }

   void ac(sg var1) {
      if (var1.cm((byte)7) != 737066798) {
         var1.at -= -1516355947;
         this.af = var1.cv((byte)1) * 3404272251065138399L;
      }

      this.an = var1.cz((byte)-47);
   }

   void au(sg var1) {
      if (var1.cm((byte)7) != 255) {
         var1.at -= -1516355947;
         this.af = var1.cv((byte)1) * 3404272251065138399L;
      }

      this.an = var1.cz((byte)-74);
   }

   static int an(int var0, byte var1, byte var2, byte var3, byte var4, byte var5) {
      try {
         int var6 = var0 >> 10 & 63;
         int var7 = var0 >> 7 & 7;
         int var8 = var0 & 127;
         int var9 = var4 & 255;
         if (-1 != var1) {
            if (var5 >= 0) {
               throw new IllegalStateException();
            }

            var6 += var9 * (var1 - var6) >> 7;
         }

         if (-1 != var2) {
            var7 += (var2 - var7) * var9 >> 7;
         }

         if (var3 != -1) {
            if (var5 >= 0) {
               throw new IllegalStateException();
            }

            var8 += var9 * (var3 - var8) >> 7;
         }

         return (var6 << 10 | var7 << 7 | var8) & '\uffff';
      } catch (RuntimeException var10) {
         throw db.an(var10, "ge.an(" + ')');
      }
   }

   static void hp(int var0, int var1, int var2, int var3) {
      try {
         if (var0 == 0) {
            if (var3 <= 263059632) {
               throw new IllegalStateException();
            }
         } else {
            int var4 = var0 >> 8;
            int var5 = var0 >> 4 & 7;
            int var6 = var0 & 15;
            client.tu[-297150195 * client.tl] = var4;
            client.tr[client.tl * -297150195] = var5;
            client.tg[-297150195 * client.tl] = 0;
            client.ti[-297150195 * client.tl] = null;
            int var7 = (var1 - 64) / 128;
            int var8 = (var2 - 64) / 128;
            client.tb[client.tl * -297150195] = var6 + (var7 << 16) + (var8 << 8);
            client.tl += 831233477;
         }
      } catch (RuntimeException var9) {
         throw db.an(var9, "ge.hp(" + ')');
      }
   }
}
