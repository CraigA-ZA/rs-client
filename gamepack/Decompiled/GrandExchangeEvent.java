public class GrandExchangeEvent {
   static long il;
   String string2;
   String string1;
   public final int world;
   public final long an;
   public final GrandExchangeOffer grandExchangeOffer;

   static float af_renamed(ek var0, float var1) {
      if (var0 != null && var0.at() != 0) {
         if (var1 < (float)(-834721191 * var0.au[0].af)) {
            return ex.af == var0.aw ? var0.au[0].an : Message.aw_renamed(var0, var1, true);
         } else if (var1 > (float)(var0.au[var0.at() - 1].af * -834721191)) {
            return ex.af == var0.ac ? var0.au[var0.at() - 1].an : Message.aw_renamed(var0, var1, false);
         } else if (var0.an) {
            return var0.au[0].an;
         } else {
            ev var3 = var0.al(var1);
            boolean var4 = false;
            boolean var5 = false;
            if (var3 == null) {
               return 0.0F;
            } else {
               float var6;
               float var7;
               float var8;
               if ((double)var3.au == 0.0 && (double)var3.ab == 0.0) {
                  var4 = true;
               } else if (Float.MAX_VALUE == var3.au && Float.MAX_VALUE == var3.ab) {
                  var5 = true;
               } else if (null != var3.aq) {
                  if (var0.av) {
                     var6 = (float)(var3.af * -834721191);
                     float var10 = var3.an;
                     var7 = var6 + var3.au * 0.33333334F;
                     float var11 = var10 + var3.ab * 0.33333334F;
                     float var9 = (float)(-834721191 * var3.aq.af);
                     float var13 = var3.aq.an;
                     var8 = var9 - 0.33333334F * var3.aq.aw;
                     float var12 = var13 - 0.33333334F * var3.aq.ac;
                     if (var0.af) {
                        ParamType.ac_renamed(var0, var6, var7, var8, var9, var10, var11, var12, var13);
                     } else if (var0 != null) {
                        var0.aq = var6;
                        float var14 = var9 - var6;
                        float var15 = var13 - var10;
                        float var16 = var7 - var6;
                        float var17 = 0.0F;
                        float var18 = 0.0F;
                        if ((double)var16 != 0.0) {
                           var17 = (var11 - var10) / var16;
                        }

                        var16 = var9 - var8;
                        if (0.0 != (double)var16) {
                           var18 = (var13 - var12) / var16;
                        }

                        float var19 = 1.0F / (var14 * var14);
                        float var20 = var14 * var17;
                        float var21 = var18 * var14;
                        var0.at = (var21 + var20 - var15 - var15) * var19 / var14;
                        var0.aa = (var15 + var15 + var15 - var20 - var20 - var21) * var19;
                        var0.ay = var17;
                        var0.ao = var10;
                     }

                     var0.av = false;
                  }
               } else {
                  var4 = true;
               }

               if (var4) {
                  return var3.an;
               } else if (var5) {
                  return var1 != (float)(var3.af * -834721191) && null != var3.aq ? var3.aq.an : var3.an;
               } else if (var0.af) {
                  if (null == var0) {
                     var6 = 0.0F;
                  } else {
                     if (var1 == var0.aq) {
                        var7 = 0.0F;
                     } else if (var0.al == var1) {
                        var7 = 1.0F;
                     } else {
                        var7 = (var1 - var0.aq) / (var0.al - var0.aq);
                     }

                     if (var0.ab) {
                        var8 = var7;
                     } else {
                        em.ab[3] = var0.ao;
                        em.ab[2] = var0.ay;
                        em.ab[1] = var0.aa;
                        em.ab[0] = var0.at - var7;
                        em.aq[0] = 0.0F;
                        em.aq[1] = 0.0F;
                        em.aq[2] = 0.0F;
                        em.aq[3] = 0.0F;
                        em.aq[4] = 0.0F;
                        int var22 = da.af_renamed(em.ab, 3, 0.0F, true, 1.0F, true, em.aq);
                        if (1 == var22) {
                           var8 = em.aq[0];
                        } else {
                           var8 = 0.0F;
                        }
                     }

                     var6 = var0.ax + (var0.ai + (var0.ah * var8 + var0.ag) * var8) * var8;
                  }

                  return var6;
               } else {
                  return ag.an_renamed(var0, var1);
               }
            }
         }
      } else {
         return 0.0F;
      }
   }

   public static void au_renamed() {
      HeadbarType.HeadbarType_cached.clear();
      HeadbarType.ac.clear();
   }

   GrandExchangeEvent(Packet var1, byte var2, int var3) {
      this.string2 = var1.cw();
      this.string1 = var1.cw();
      this.world = var1.cl() * -754309593;
      this.an = var1.g8s() * -1320905308375172459L;
      int var4 = var1.g4s();
      int var5 = var1.g4s();
      this.grandExchangeOffer = new GrandExchangeOffer();
      this.grandExchangeOffer.au(2);
      this.grandExchangeOffer.ab(var2);
      this.grandExchangeOffer.currentPrice = 945098885 * var4;
      this.grandExchangeOffer.id = 275172041 * var5;
      this.grandExchangeOffer.totalQuantity = 0;
      this.grandExchangeOffer.currentQuantity = 0;
      this.grandExchangeOffer.unitPrice = -2000800301 * var3;
   }

   public String af() {
      return this.string2;
   }

   public String an() {
      return this.string1;
   }
}
