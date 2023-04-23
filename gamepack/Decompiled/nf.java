import java.util.HashMap;

public class nf {
   static SoundSystem soundSystem;
   int au = 0;
   int[] ac = new int[2048];
   int[] aw = new int[2048];
   Bounds an = new Bounds(0, 0);
   final HashMap af = new HashMap();

   public nf() {
      dt.at = new int[2000];
      int var1 = 0;
      int var2 = 240;

      int var3;
      int var4;
      for(var3 = 12; var1 < 16; var2 -= var3) {
         var4 = eu.af((double)((float)var2 / 360.0F), 0.9998999834060669, (double)((float)var1 * 0.425F / 16.0F + 0.075F));
         dt.at[var1] = var4;
         ++var1;
      }

      var2 = 48;

      for(var3 = var2 / 6; var1 < dt.at.length; var2 -= var3) {
         var4 = var1 * 2;

         for(int var5 = eu.af((double)((float)var2 / 360.0F), 0.9998999834060669, 0.5); var1 < var4 && var1 < dt.at.length; ++var1) {
            dt.at[var1] = var5;
         }
      }

   }

   void af(int var1) {
      int var3 = 1 + 2 * var1;
      double var5 = (double)((float)var1 / 3.0F);
      int var7 = 2 * var1 + 1;
      double[] var8 = new double[var7];
      int var9 = -var1;

      for(int var10 = 0; var9 <= var1; ++var10) {
         var8[var10] = KeyHandler.an((double)var9, 0.0, var5);
         ++var9;
      }

      double[] var15 = var8;
      double var16 = var8[var1] * var8[var1];
      int[] var17 = new int[var3 * var3];
      boolean var11 = false;

      for(int var12 = 0; var12 < var3; ++var12) {
         for(int var13 = 0; var13 < var3; ++var13) {
            int var14 = var17[var13 + var12 * var3] = (int)(var15[var12] * var15[var13] / var16 * 256.0);
            if (!var11 && var14 > 0) {
               var11 = true;
            }
         }
      }

      Sprite var18 = new Sprite(var17, var3, var3);
      this.af.put(var1, var18);
   }

   public static MapElementType getMapElementType(int var0) {
      return var0 >= 0 && var0 < MapElementType.MapElementType_cached.length && MapElementType.MapElementType_cached[var0] != null ? MapElementType.MapElementType_cached[var0] : new MapElementType(var0);
   }

   Sprite an(int var1) {
      if (!this.af.containsKey(var1)) {
         this.af(var1);
      }

      return (Sprite)this.af.get(var1);
   }

   public final void aw(int var1, int var2) {
      if (this.au * -674420889 < this.aw.length) {
         this.aw[-674420889 * this.au] = var1;
         this.ac[this.au * -674420889] = var2;
         this.au += 1304822871;
      }
   }

   public final void ac() {
      this.au = 0;
   }

   public final void au(int var1, int var2, Sprite var3, float var4) {
      int var6 = (int)(18.0F * var4);
      Sprite var7 = this.an(var6);
      int var8 = 1 + 2 * var6;
      Bounds var9 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
      Bounds var10 = new Bounds(0, 0);
      this.an.an(var8, var8);
      System.nanoTime();

      int var11;
      int var12;
      int var13;
      for(var11 = 0; var11 < -674420889 * this.au; ++var11) {
         var12 = this.aw[var11];
         var13 = this.ac[var11];
         int var14 = (int)((float)(var12 - var1) * var4) - var6;
         int var15 = (int)((float)var3.subHeight - var4 * (float)(var13 - var2)) - var6;
         this.an.af(var14, var15);
         this.an.ac(var9, var10);
         this.ab(var7, var3, var10);
      }

      System.nanoTime();
      System.nanoTime();

      for(var11 = 0; var11 < var3.pixels.length; ++var11) {
         if (0 == var3.pixels[var11]) {
            var3.pixels[var11] = -16777216;
         } else {
            var12 = (var3.pixels[var11] + 64 - 1) / 256;
            if (var12 <= 0) {
               var3.pixels[var11] = -16777216;
            } else {
               if (var12 > dt.at.length) {
                  var12 = dt.at.length;
               }

               var13 = dt.at[var12 - 1];
               var3.pixels[var11] = -16777216 | var13;
            }
         }
      }

      System.nanoTime();
   }

   void ab(Sprite var1, Sprite var2, Bounds var3) {
      if (0 != var3.aw * 944313703 && var3.ac * -1376251093 != 0) {
         int var5 = 0;
         int var6 = 0;
         if (0 == -844906645 * var3.af) {
            var5 = var1.subWidth - 944313703 * var3.aw;
         }

         if (0 == 1864020389 * var3.an) {
            var6 = var1.subHeight - var3.ac * -1376251093;
         }

         int var7 = var1.subWidth * var6 + var5;
         int var8 = var3.an * 1864020389 * var2.subWidth + var3.af * -844906645;

         for(int var9 = 0; var9 < -1376251093 * var3.ac; ++var9) {
            for(int var10 = 0; var10 < var3.aw * 944313703; ++var10) {
               int[] var10000 = var2.pixels;
               int var10001 = var8++;
               var10000[var10001] += var1.pixels[var7++];
            }

            var7 += var1.subWidth - 944313703 * var3.aw;
            var8 += var2.subWidth - 944313703 * var3.aw;
         }

      }
   }
}
