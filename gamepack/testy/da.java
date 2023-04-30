public class da {
   int av;
   static final da an = new da(1);
   static final da au = new da(4);
   static final da ac = new da(3);
   static final da al = new da(7);
   static final da ab = new da(5);
   static final da aq = new da(6);
   static final da at = new da(8);
   static final da ao = new da(11);
   static final da af = new da(0);
   static final da ay = new da(10);
   static final da aw = new da(2);
   static final da ax = new da(12);
   static final da ai = new da(13);
   static final da ag = new da(14);
   static final da ah = new da(15);
   static final da aa = new da(9);
   static final int bx = 46;

   da(int var1) {
      try {
         super();
         this.av = var1 * 1355363989;
      } catch (RuntimeException var2) {
         throw db.an(var2, "da.<init>(" + ')');
      }
   }

   static final int mh(int var0) {
      try {
         float var1 = 200.0F * ((float)aj.vb.av(2106375231) - 0.5F);
         return 100 - Math.round(var1);
      } catch (RuntimeException var2) {
         throw db.an(var2, "da.mh(" + ')');
      }
   }

   static final void le(int var0, int var1, int var2, int var3, int var4, byte var5) {
      try {
         db.ka[0].aw(var0, var1);
         db.ka[1].aw(var0, var3 + var1 - 16);
         th.em(var0, var1 + 16, 16, var3 - 32, client.kq * 40021093);
         int var6 = (var3 - 32) * var3 / var4;
         if (var6 < 8) {
            if (var5 != 0) {
               throw new IllegalStateException();
            }

            var6 = 8;
         }

         int var7 = var2 * (var3 - 32 - var6) / (var4 - var3);
         th.em(var0, var1 + 16 + var7, 16, var6, 992783339 * client.kw);
         th.ee(var0, 16 + var1 + var7, var6, 1881503647 * client.kj);
         th.ee(var0 + 1, var7 + var1 + 16, var6, client.kj * 1881503647);
         th.ec(var0, var7 + var1 + 16, 16, client.kj * 1881503647);
         th.ec(var0, 17 + var1 + var7, 16, 1881503647 * client.kj);
         th.ee(var0 + 15, 16 + var1 + var7, var6, client.kk * 1155936455);
         th.ee(var0 + 14, 17 + var1 + var7, var6 - 1, 1155936455 * client.kk);
         th.ec(var0, var6 + 15 + var1 + var7, 16, client.kk * 1155936455);
         th.ec(1 + var0, 14 + var1 + var7 + var6, 15, 1155936455 * client.kk);
      } catch (RuntimeException var8) {
         throw db.an(var8, "da.le(" + ')');
      }
   }

   public static int af(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6, byte var7) {
      try {
         float var8 = 0.0F;

         for(int var9 = 0; var9 < var1 + 1; ++var9) {
            if (var7 >= 16) {
               throw new IllegalStateException();
            }

            var8 += Math.abs(var0[var9]);
         }

         float var23 = (Math.abs(var2) + Math.abs(var4)) * (float)(1 + var1) * em.ac;
         if (var8 <= var23) {
            return -1;
         } else {
            float[] var10 = new float[1 + var1];

            int var11;
            for(var11 = 0; var11 < var1 + 1; ++var11) {
               if (var7 >= 16) {
                  throw new IllegalStateException();
               }

               var10[var11] = 1.0F / var8 * var0[var11];
            }

            while(Math.abs(var10[var1]) < var23) {
               if (var7 >= 16) {
                  throw new IllegalStateException();
               }

               --var1;
            }

            var11 = 0;
            if (0 == var1) {
               if (var7 >= 16) {
                  throw new IllegalStateException();
               } else {
                  return var11;
               }
            } else if (var1 == 1) {
               var6[0] = -var10[0] / var10[1];
               boolean var10000;
               if (var3) {
                  if (var7 >= 16) {
                     throw new IllegalStateException();
                  }

                  if (var2 < var23 + var6[0]) {
                     if (var7 >= 16) {
                        throw new IllegalStateException();
                     }

                     var10000 = true;
                  } else {
                     var10000 = false;
                  }
               } else if (var2 < var6[0] - var23) {
                  if (var7 >= 16) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               boolean var24 = var10000;
               if (var5) {
                  if (var7 >= 16) {
                     throw new IllegalStateException();
                  }

                  var10000 = var4 > var6[0] - var23;
               } else if (var4 > var23 + var6[0]) {
                  if (var7 >= 16) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               byte var28;
               label244: {
                  boolean var25 = var10000;
                  if (var24) {
                     if (var7 >= 16) {
                        throw new IllegalStateException();
                     }

                     if (var25) {
                        if (var7 >= 16) {
                           throw new IllegalStateException();
                        }

                        var28 = 1;
                        break label244;
                     }
                  }

                  var28 = 0;
               }

               byte var26 = var28;
               if (var26 > 0) {
                  if (var7 >= 16) {
                     throw new IllegalStateException();
                  }

                  if (var3 && var6[0] < var2) {
                     if (var7 >= 16) {
                        throw new IllegalStateException();
                     }

                     var6[0] = var2;
                  } else if (var5 && var6[0] > var4) {
                     if (var7 >= 16) {
                        throw new IllegalStateException();
                     }

                     var6[0] = var4;
                  }
               }

               return var26;
            } else {
               qs var12 = new qs(var10, var1);
               float[] var13 = new float[1 + var1];

               for(int var14 = 1; var14 <= var1; ++var14) {
                  if (var7 >= 16) {
                     throw new IllegalStateException();
                  }

                  var13[var14 - 1] = (float)var14 * var10[var14];
               }

               float[] var27 = new float[1 + var1];
               int var15 = af(var13, var1 - 1, var2, false, var4, false, var27, (byte)-119);
               if (-1 == var15) {
                  if (var7 >= 16) {
                     throw new IllegalStateException();
                  } else {
                     return 0;
                  }
               } else {
                  boolean var16 = false;
                  float var18 = 0.0F;
                  float var19 = 0.0F;
                  float var20 = 0.0F;

                  for(int var21 = 0; var21 <= var15; ++var21) {
                     if (var7 >= 16) {
                        throw new IllegalStateException();
                     }

                     if (var11 > var1) {
                        return var11;
                     }

                     float var17;
                     if (var21 == 0) {
                        if (var7 >= 16) {
                           throw new IllegalStateException();
                        }

                        var17 = var2;
                        var19 = qx.an(var10, var1, var2, 186890791);
                        if (Math.abs(var19) <= var23) {
                           if (var7 >= 16) {
                              throw new IllegalStateException();
                           }

                           if (var3) {
                              if (var7 >= 16) {
                                 throw new IllegalStateException();
                              }

                              var6[var11++] = var2;
                           }
                        }
                     } else {
                        var17 = var20;
                        var19 = var18;
                     }

                     if (var21 == var15) {
                        if (var7 >= 16) {
                           throw new IllegalStateException();
                        }

                        var20 = var4;
                        var16 = false;
                     } else {
                        var20 = var27[var21];
                     }

                     var18 = qx.an(var10, var1, var20, -487531861);
                     if (var16) {
                        if (var7 >= 16) {
                           throw new IllegalStateException();
                        }

                        var16 = false;
                     } else if (Math.abs(var18) < var23) {
                        if (var7 >= 16) {
                           throw new IllegalStateException();
                        }

                        if (var21 == var15) {
                           if (var7 >= 16) {
                              throw new IllegalStateException();
                           }

                           if (!var5) {
                              continue;
                           }

                           if (var7 >= 16) {
                              throw new IllegalStateException();
                           }
                        }

                        var6[var11++] = var20;
                        var16 = true;
                     } else {
                        label314: {
                           if (var19 < 0.0F) {
                              if (var18 > 0.0F) {
                                 break label314;
                              }

                              if (var7 >= 16) {
                                 throw new IllegalStateException();
                              }
                           }

                           if (!(var19 > 0.0F)) {
                              continue;
                           }

                           if (var7 >= 16) {
                              throw new IllegalStateException();
                           }

                           if (!(var18 < 0.0F)) {
                              continue;
                           }

                           if (var7 >= 16) {
                              throw new IllegalStateException();
                           }
                        }

                        var6[var11++] = io.aw(var12, var17, var20, 0.0F, 905872105);
                        if (var11 > 1 && var6[var11 - 2] >= var6[var11 - 1] - var23) {
                           if (var7 >= 16) {
                              throw new IllegalStateException();
                           }

                           var6[var11 - 2] = (var6[var11 - 1] + var6[var11 - 2]) * 0.5F;
                           --var11;
                        }
                     }
                  }

                  return var11;
               }
            }
         }
      } catch (RuntimeException var22) {
         throw db.an(var22, "da.af(" + ')');
      }
   }

   public static sh an(int var0, int var1) {
      try {
         int var2 = st.an[var0];
         if (var2 == 1) {
            if (var1 == 1343308113) {
               throw new IllegalStateException();
            } else {
               return sh.af;
            }
         } else if (2 == var2) {
            if (var1 == 1343308113) {
               throw new IllegalStateException();
            } else {
               return sh.aw;
            }
         } else if (3 == var2) {
            if (var1 == 1343308113) {
               throw new IllegalStateException();
            } else {
               return sh.an;
            }
         } else {
            return null;
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "da.an(" + ')');
      }
   }
}
