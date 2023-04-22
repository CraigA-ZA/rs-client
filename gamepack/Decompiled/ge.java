public class ge extends fb {
   String an;
   static int[][][] ag;
   long af;
   // $FF: synthetic field
   final fa this$0;

   ge(fa var1) {
      this.this$0 = var1;
      this.af = -3404272251065138399L;
      this.an = null;
   }

   void an(fj var1) {
      var1.aa(this.af * -7266015123784483041L, this.an, -1787643966);
   }

   void af(Packet var1) {
      if (var1.g1() != 255) {
         var1.index -= -1516355947;
         this.af = var1.g8s() * 3404272251065138399L;
      }

      this.an = var1.cz();
   }

   static int an_renamed(int var0, byte var1, byte var2, byte var3, byte var4) {
      int var6 = var0 >> 10 & 63;
      int var7 = var0 >> 7 & 7;
      int var8 = var0 & 127;
      int var9 = var4 & 255;
      if (-1 != var1) {
         var6 += var9 * (var1 - var6) >> 7;
      }

      if (-1 != var2) {
         var7 += (var2 - var7) * var9 >> 7;
      }

      if (var3 != -1) {
         var8 += var9 * (var3 - var8) >> 7;
      }

      return (var6 << 10 | var7 << 7 | var8) & '\uffff';
   }

   static void hp_renamed(int var0, int var1, int var2) {
      if (var0 != 0) {
         int var4 = var0 >> 8;
         int var5 = var0 >> 4 & 7;
         int var6 = var0 & 15;
         Client.tu[-297150195 * Client.soundEffectCount] = var4;
         Client.tr[Client.soundEffectCount * -297150195] = var5;
         Client.tg[-297150195 * Client.soundEffectCount] = 0;
         Client.soundEffects[-297150195 * Client.soundEffectCount] = null;
         int var7 = (var1 - 64) / 128;
         int var8 = (var2 - 64) / 128;
         Client.tb[Client.soundEffectCount * -297150195] = var6 + (var7 << 16) + (var8 << 8);
         Client.soundEffectCount += 831233477;
      }
   }
}
