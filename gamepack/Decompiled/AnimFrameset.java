public class AnimFrameset extends DualNode {
   AnimFrame[] frames;

   AnimFrameset(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
      NodeDeque var5 = new NodeDeque();
      int var6 = var1.cq(var3);
      this.frames = new AnimFrame[var6];
      int[] var7 = var1.ck(var3);

      for(int var8 = 0; var8 < var7.length; ++var8) {
         byte[] var9 = var1.takeFile(var3, var7[var8]);
         AnimBase var10 = null;
         int var11 = (var9[0] & 255) << 8 | var9[1] & 255;

         for(AnimBase var12 = (AnimBase)var5.last(); null != var12; var12 = (AnimBase)var5.previous()) {
            if (var12.transformCount * 1427390003 == var11) {
               var10 = var12;
               break;
            }
         }

         if (null == var10) {
            byte[] var13;
            if (var4) {
               var13 = var2.getFile(0, var11);
            } else {
               var13 = var2.getFile(var11, 0);
            }

            var10 = new AnimBase(var11, var13);
            var5.addFirst(var10);
         }

         this.frames[var7[var8]] = new AnimFrame(var9, var10);
      }

   }

   public boolean hasAlphaTransform(int var1) {
      return this.frames[var1].transparency;
   }

   static float aw_renamed(qs var0, float var1, float var2, float var3) {
      float var5 = qx.an_renamed(var0.af, var0.an * 754853883, var1);
      if (Math.abs(var5) < em.ac) {
         return var1;
      } else {
         float var6 = qx.an_renamed(var0.af, 754853883 * var0.an, var2);
         if (Math.abs(var6) < em.ac) {
            return var2;
         } else {
            float var7 = 0.0F;
            float var8 = 0.0F;
            float var9 = 0.0F;
            float var14 = 0.0F;
            boolean var15 = true;
            boolean var16 = false;

            do {
               var16 = false;
               if (var15) {
                  var7 = var1;
                  var14 = var5;
                  var8 = var2 - var1;
                  var9 = var8;
                  var15 = false;
               }

               if (Math.abs(var14) < Math.abs(var6)) {
                  var1 = var2;
                  var2 = var7;
                  var7 = var1;
                  var5 = var6;
                  var6 = var14;
                  var14 = var5;
               }

               float var17 = em.au * Math.abs(var2) + 0.5F * var3;
               float var18 = 0.5F * (var7 - var2);
               boolean var19 = Math.abs(var18) > var17 && var6 != 0.0F;
               if (var19) {
                  if (!(Math.abs(var9) < var17) && !(Math.abs(var5) <= Math.abs(var6))) {
                     float var13 = var6 / var5;
                     float var10;
                     float var11;
                     if (var7 == var1) {
                        var10 = var13 * 2.0F * var18;
                        var11 = 1.0F - var13;
                     } else {
                        var11 = var5 / var14;
                        float var12 = var6 / var14;
                        var10 = ((var11 - var12) * 2.0F * var18 * var11 - (var2 - var1) * (var12 - 1.0F)) * var13;
                        var11 = (var11 - 1.0F) * (var12 - 1.0F) * (var13 - 1.0F);
                     }

                     if ((double)var10 > 0.0) {
                        var11 = -var11;
                     } else {
                        var10 = -var10;
                     }

                     var13 = var9;
                     var9 = var8;
                     if (var10 * 2.0F < var18 * 3.0F * var11 - Math.abs(var17 * var11) && var10 < Math.abs(var13 * 0.5F * var11)) {
                        var8 = var10 / var11;
                     } else {
                        var8 = var18;
                        var9 = var18;
                     }
                  } else {
                     var8 = var18;
                     var9 = var18;
                  }

                  var1 = var2;
                  var5 = var6;
                  if (Math.abs(var8) > var17) {
                     var2 += var8;
                  } else if ((double)var18 > 0.0) {
                     var2 += var17;
                  } else {
                     var2 -= var17;
                  }

                  var6 = qx.an_renamed(var0.af, 754853883 * var0.an, var2);
                  if ((double)(var6 * (var14 / Math.abs(var14))) > 0.0) {
                     var15 = true;
                     var16 = true;
                  } else {
                     var16 = true;
                  }
               }
            } while(var16);

            return var2;
         }
      }
   }
}
