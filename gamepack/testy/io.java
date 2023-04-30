import accessors.RSAnimFrameset;

public class io extends rk implements RSAnimFrameset {
   static final int ar = 15;
   static final int ap = 26;
   static final int an = -1;
   public static final int av = 1;
   il[] af;
   static final int am = 171;
   static final int co = 88;

   io(nm var1, nm var2, int var3, boolean var4) {
      try {
         super();
         nh var5 = new nh();
         int var6 = var1.cq(var3, (byte)15);
         this.af = new il[var6];
         int[] var7 = var1.ck(var3, 639762895);

         for(int var8 = 0; var8 < var7.length; ++var8) {
            byte[] var9 = var1.bh(var3, var7[var8], (byte)-103);
            ik var10 = null;
            int var11 = (var9[0] & 255) << 8 | var9[1] & 255;

            for(ik var12 = (ik)var5.aq(); null != var12; var12 = (ik)var5.at()) {
               if (var12.ab * 1427390003 == var11) {
                  var10 = var12;
                  break;
               }
            }

            if (null == var10) {
               byte[] var13;
               if (var4) {
                  var13 = var2.ca(0, var11, -606351717);
               } else {
                  var13 = var2.ca(var11, 0, -606351717);
               }

               var10 = new ik(var11, var13);
               var5.an(var10);
            }

            this.af[var7[var8]] = new il(var9, var10);
         }

      } catch (RuntimeException var14) {
         throw db.an(var14, "io.<init>(" + ')');
      }
   }

   public boolean an(int var1, int var2) {
      try {
         return this.af[var1].ay;
      } catch (RuntimeException var3) {
         throw db.an(var3, "io.an(" + ')');
      }
   }

   public static io aw(nm var0, nm var1, int var2, boolean var3) {
      boolean var4 = true;
      int[] var5 = var0.ck(var2, 782560030);

      for(int var6 = 0; var6 < var5.length; ++var6) {
         byte[] var7 = var0.ca(var2, var5[var6], -606351717);
         if (null == var7) {
            var4 = false;
         } else {
            int var8 = (var7[0] & 255) << 8 | var7[1] & 255;
            byte[] var9;
            if (var3) {
               var9 = var1.ca(0, var8, -606351717);
            } else {
               var9 = var1.ca(var8, 0, -606351717);
            }

            if (null == var9) {
               var4 = false;
            }
         }
      }

      if (!var4) {
         return null;
      } else {
         try {
            return new io(var0, var1, var2, var3);
         } catch (Exception var10) {
            return null;
         }
      }
   }

   public boolean ac(int var1) {
      return this.af[var1].ay;
   }

   public boolean au(int var1) {
      return this.af[var1].ay;
   }

   public boolean ab(int var1) {
      return this.af[var1].ay;
   }

   static float aw(qs var0, float var1, float var2, float var3, int var4) {
      try {
         float var5 = qx.an(var0.af, var0.an * 754853883, var1, 1101824083);
         if (Math.abs(var5) < em.ac) {
            return var1;
         } else {
            float var6 = qx.an(var0.af, 754853883 * var0.an, var2, 1062527611);
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
                     if (var4 <= -252312017) {
                        throw new IllegalStateException();
                     }

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

                  boolean var10000;
                  float var17;
                  float var18;
                  label136: {
                     var17 = em.au * Math.abs(var2) + 0.5F * var3;
                     var18 = 0.5F * (var7 - var2);
                     if (Math.abs(var18) > var17) {
                        if (var4 <= -252312017) {
                           throw new IllegalStateException();
                        }

                        if (var6 != 0.0F) {
                           if (var4 <= -252312017) {
                              throw new IllegalStateException();
                           }

                           var10000 = true;
                           break label136;
                        }
                     }

                     var10000 = false;
                  }

                  boolean var19 = var10000;
                  if (var19) {
                     if (var4 <= -252312017) {
                        throw new IllegalStateException();
                     }

                     label153: {
                        if (!(Math.abs(var9) < var17)) {
                           if (var4 <= -252312017) {
                              throw new IllegalStateException();
                           }

                           if (!(Math.abs(var5) <= Math.abs(var6))) {
                              float var13 = var6 / var5;
                              float var10;
                              float var11;
                              if (var7 == var1) {
                                 if (var4 <= -252312017) {
                                    throw new IllegalStateException();
                                 }

                                 var10 = var13 * 2.0F * var18;
                                 var11 = 1.0F - var13;
                              } else {
                                 var11 = var5 / var14;
                                 float var12 = var6 / var14;
                                 var10 = ((var11 - var12) * 2.0F * var18 * var11 - (var2 - var1) * (var12 - 1.0F)) * var13;
                                 var11 = (var11 - 1.0F) * (var12 - 1.0F) * (var13 - 1.0F);
                              }

                              if ((double)var10 > 0.0) {
                                 if (var4 <= -252312017) {
                                    throw new IllegalStateException();
                                 }

                                 var11 = -var11;
                              } else {
                                 var10 = -var10;
                              }

                              var13 = var9;
                              var9 = var8;
                              if (var10 * 2.0F < var18 * 3.0F * var11 - Math.abs(var17 * var11)) {
                                 if (var4 <= -252312017) {
                                    throw new IllegalStateException();
                                 }

                                 if (var10 < Math.abs(var13 * 0.5F * var11)) {
                                    if (var4 <= -252312017) {
                                       throw new IllegalStateException();
                                    }

                                    var8 = var10 / var11;
                                    break label153;
                                 }
                              }

                              var8 = var18;
                              var9 = var18;
                              break label153;
                           }

                           if (var4 <= -252312017) {
                              throw new IllegalStateException();
                           }
                        }

                        var8 = var18;
                        var9 = var18;
                     }

                     var1 = var2;
                     var5 = var6;
                     if (Math.abs(var8) > var17) {
                        if (var4 <= -252312017) {
                           throw new IllegalStateException();
                        }

                        var2 += var8;
                     } else if ((double)var18 > 0.0) {
                        if (var4 <= -252312017) {
                           throw new IllegalStateException();
                        }

                        var2 += var17;
                     } else {
                        var2 -= var17;
                     }

                     var6 = qx.an(var0.af, 754853883 * var0.an, var2, -822537260);
                     if ((double)(var6 * (var14 / Math.abs(var14))) > 0.0) {
                        if (var4 <= -252312017) {
                           throw new IllegalStateException();
                        }

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
      } catch (RuntimeException var20) {
         throw db.an(var20, "io.aw(" + ')');
      }
   }
}
