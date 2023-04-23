import java.io.IOException;
import java.util.concurrent.Callable;

public class as implements Callable {
   static Bounds bw;
   // $FF: synthetic field
   final ag this$0;
   final ay af;

   as(ag var1, ay var2) {
      this.this$0 = var1;
      this.af = var2;
   }

   public Object call() throws Exception {
      try {
         while(this.af.ac()) {
            PlayerAppearance.af(10L);
         }
      } catch (IOException var2) {
         return new aj("Error servicing REST query: " + var2.getMessage());
      }

      return this.af.au();
   }

   static final void au_renamed(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, CollisionMap[] var10) {
      int var13;
      for(int var12 = 0; var12 < 8; ++var12) {
         for(var13 = 0; var13 < 8; ++var13) {
            if (var2 + var12 > 0 && var12 + var2 < 103 && var3 + var13 > 0 && var3 + var13 < 103) {
               int[] var10000 = var10[var1].bj[var12 + var2];
               var10000[var13 + var3] &= -16777217;
            }
         }
      }

      Packet var25 = new Packet(var0);

      for(var13 = 0; var13 < 4; ++var13) {
         for(int var14 = 0; var14 < 64; ++var14) {
            for(int var15 = 0; var15 < 64; ++var15) {
               if (var4 == var13 && var14 >= var5 && var14 < 8 + var5 && var15 >= var6 && var15 < var6 + 8) {
                  int var16 = var2 + SpriteMask.af_renamed(var14 & 7, var15 & 7, var7);
                  int var19 = var14 & 7;
                  int var20 = var15 & 7;
                  int var21 = var7 & 3;
                  int var18;
                  if (0 == var21) {
                     var18 = var20;
                  } else if (var21 == 1) {
                     var18 = 7 - var19;
                  } else if (2 == var21) {
                     var18 = 7 - var20;
                  } else {
                     var18 = var19;
                  }

                  int var22 = var3 + var18;
                  int var23 = (var14 & 7) + var8 + var2;
                  int var24 = (var15 & 7) + var9 + var3;
                  of.loadTerrain(var25, var1, var16, var22, var23, var24, var7);
               } else {
                  of.loadTerrain(var25, 0, -1, -1, 0, 0, 0);
               }
            }
         }
      }

   }
}
