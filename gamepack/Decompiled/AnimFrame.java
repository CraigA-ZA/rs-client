public class AnimFrame {
   static int[] aw = new int[500];
   int[] ys;
   boolean transparency = false;
   static int[] ac = new int[500];
   AnimBase base = null;
   int transformCount = -1;
   int[] transforms;
   int[] xs;
   int[] zs;
   static int[] an = new int[500];
   static int[] af = new int[500];

   AnimFrame(byte[] var1, AnimBase var2) {
      this.base = var2;
      Packet var3 = new Packet(var1);
      Packet var4 = new Packet(var1);
      var3.index = 1262255402;
      int var5 = var3.g1();
      int var6 = -1;
      int var7 = 0;
      var4.index = (var3.index * -1633313603 + var5) * -1516355947;

      int var8;
      for(var8 = 0; var8 < var5; ++var8) {
         int var9 = var3.g1();
         if (var9 > 0) {
            if (this.base.transformTypes[var8] != 0) {
               for(int var10 = var8 - 1; var10 > var6; --var10) {
                  if (this.base.transformTypes[var10] == 0) {
                     af[var7] = var10;
                     an[var7] = 0;
                     aw[var7] = 0;
                     ac[var7] = 0;
                     ++var7;
                     break;
                  }
               }
            }

            af[var7] = var8;
            short var22 = 0;
            if (this.base.transformTypes[var8] == 3) {
               var22 = 128;
            }

            if ((var9 & 1) != 0) {
               an[var7] = var4.gSmart1or2s();
            } else {
               an[var7] = var22;
            }

            if ((var9 & 2) != 0) {
               aw[var7] = var4.gSmart1or2s();
            } else {
               aw[var7] = var22;
            }

            if ((var9 & 4) != 0) {
               ac[var7] = var4.gSmart1or2s();
            } else {
               ac[var7] = var22;
            }

            var6 = var8;
            ++var7;
            if (this.base.transformTypes[var8] == 5) {
               this.transparency = true;
            }
         }
      }

      if (var4.index * -1633313603 != var1.length) {
         throw new RuntimeException();
      } else {
         this.transformCount = var7;
         this.transforms = new int[var7];
         this.xs = new int[var7];
         this.ys = new int[var7];
         this.zs = new int[var7];

         for(var8 = 0; var8 < var7; ++var8) {
            this.transforms[var8] = af[var8];
            this.xs[var8] = an[var8];
            this.ys[var8] = aw[var8];
            this.zs[var8] = ac[var8];
         }

      }
   }
}
