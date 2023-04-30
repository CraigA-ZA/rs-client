import accessors.RSGrandExchangeEvent;

public class nu implements RSGrandExchangeEvent {
   public final long an;
   public final int af;
   public final nb aw;
   String ac;
   String au;
   static long il;

   public String ab() {
      return this.au;
   }

   nu(sg var1, byte var2, int var3) {
      try {
         super();
         this.ac = var1.cw((byte)0);
         this.au = var1.cw((byte)0);
         this.af = var1.cl(-981226247) * -754309593;
         this.an = var1.cv((byte)1) * -1320905308375172459L;
         int var4 = var1.cx(-1136532466);
         int var5 = var1.cx(-1342350443);
         this.aw = new nb();
         this.aw.au(2, (byte)99);
         this.aw.ab(var2, 2014183796);
         this.aw.aw = 945098885 * var4;
         this.aw.ac = 275172041 * var5;
         this.aw.au = 0;
         this.aw.ab = 0;
         this.aw.an = -2000800301 * var3;
      } catch (RuntimeException var6) {
         throw db.an(var6, "nu.<init>(" + ')');
      }
   }

   public String an(int var1) {
      try {
         return this.au;
      } catch (RuntimeException var2) {
         throw db.an(var2, "nu.an(" + ')');
      }
   }

   public String aw() {
      return this.ac;
   }

   public String ac() {
      return this.ac;
   }

   public String au() {
      return this.au;
   }

   public String af(int var1) {
      try {
         return this.ac;
      } catch (RuntimeException var2) {
         throw db.an(var2, "nu.af(" + ')');
      }
   }

   public String aq() {
      return this.au;
   }

   public static void au(int var0) {
      try {
         hm.aw.ac();
         hm.ac.ac();
      } catch (RuntimeException var1) {
         throw db.an(var1, "nu.au(" + ')');
      }
   }

   static float af(ek var0, float var1, int var2) {
      try {
         if (var0 != null) {
            if (var2 >= 1411328115) {
               throw new IllegalStateException();
            }

            if (var0.at((short)-10805) != 0) {
               if (var1 < (float)(-834721191 * var0.au[0].af)) {
                  if (ex.af == var0.aw) {
                     if (var2 >= 1411328115) {
                        throw new IllegalStateException();
                     }

                     return var0.au[0].an;
                  }

                  return cq.aw(var0, var1, true, 1357377055);
               }

               if (var1 > (float)(var0.au[var0.at((short)-29102) - 1].af * -834721191)) {
                  if (var2 >= 1411328115) {
                     throw new IllegalStateException();
                  }

                  if (ex.af == var0.ac) {
                     if (var2 >= 1411328115) {
                        throw new IllegalStateException();
                     }

                     return var0.au[var0.at((short)-12284) - 1].an;
                  }

                  return cq.aw(var0, var1, false, 1925410939);
               }

               if (var0.an) {
                  return var0.au[0].an;
               }

               ev var3 = var0.al(var1, 692284858);
               boolean var4 = false;
               boolean var5 = false;
               if (var3 != null) {
                  if (var2 >= 1411328115) {
                     throw new IllegalStateException();
                  }

                  float var6;
                  float var7;
                  float var8;
                  label245: {
                     if ((double)var3.au == 0.0) {
                        if (var2 >= 1411328115) {
                           throw new IllegalStateException();
                        }

                        if ((double)var3.ab == 0.0) {
                           if (var2 >= 1411328115) {
                              throw new IllegalStateException();
                           }

                           var4 = true;
                           break label245;
                        }
                     }

                     if (Float.MAX_VALUE == var3.au) {
                        if (var2 >= 1411328115) {
                           throw new IllegalStateException();
                        }

                        if (Float.MAX_VALUE == var3.ab) {
                           if (var2 >= 1411328115) {
                              throw new IllegalStateException();
                           }

                           var5 = true;
                           break label245;
                        }
                     }

                     if (null != var3.aq) {
                        if (var0.av) {
                           if (var2 >= 1411328115) {
                              throw new IllegalStateException();
                           }

                           var6 = (float)(var3.af * -834721191);
                           float var10 = var3.an;
                           var7 = var6 + var3.au * 0.33333334F;
                           float var11 = var10 + var3.ab * 0.33333334F;
                           float var9 = (float)(-834721191 * var3.aq.af);
                           float var13 = var3.aq.an;
                           var8 = var9 - 0.33333334F * var3.aq.aw;
                           float var12 = var13 - 0.33333334F * var3.aq.ac;
                           if (var0.af) {
                              if (var2 >= 1411328115) {
                                 throw new IllegalStateException();
                              }

                              ho.ac(var0, var6, var7, var8, var9, var10, var11, var12, var13, -2028355721);
                           } else if (var0 == null) {
                              if (var2 >= 1411328115) {
                                 throw new IllegalStateException();
                              }
                           } else {
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
                                 if (var2 >= 1411328115) {
                                    throw new IllegalStateException();
                                 }

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
                  }

                  if (var4) {
                     if (var2 >= 1411328115) {
                        throw new IllegalStateException();
                     }

                     return var3.an;
                  }

                  if (var5) {
                     if (var2 >= 1411328115) {
                        throw new IllegalStateException();
                     }

                     if (var1 != (float)(var3.af * -834721191)) {
                        if (var2 >= 1411328115) {
                           throw new IllegalStateException();
                        }

                        if (null != var3.aq) {
                           return var3.aq.an;
                        }

                        if (var2 >= 1411328115) {
                           throw new IllegalStateException();
                        }
                     }

                     return var3.an;
                  }

                  if (var0.af) {
                     if (var2 >= 1411328115) {
                        throw new IllegalStateException();
                     }

                     if (null == var0) {
                        if (var2 >= 1411328115) {
                           throw new IllegalStateException();
                        }

                        var6 = 0.0F;
                     } else {
                        if (var1 == var0.aq) {
                           if (var2 >= 1411328115) {
                              throw new IllegalStateException();
                           }

                           var7 = 0.0F;
                        } else if (var0.al == var1) {
                           if (var2 >= 1411328115) {
                              throw new IllegalStateException();
                           }

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
                           int var23 = da.af(em.ab, 3, 0.0F, true, 1.0F, true, em.aq, (byte)-57);
                           if (1 == var23) {
                              if (var2 >= 1411328115) {
                                 throw new IllegalStateException();
                              }

                              var8 = em.aq[0];
                           } else {
                              var8 = 0.0F;
                           }
                        }

                        var6 = var0.ax + (var0.ai + (var0.ah * var8 + var0.ag) * var8) * var8;
                     }

                     return var6;
                  }

                  return ag.an(var0, var1, (byte)88);
               }

               return 0.0F;
            }

            if (var2 >= 1411328115) {
               throw new IllegalStateException();
            }
         }

         return 0.0F;
      } catch (RuntimeException var22) {
         throw db.an(var22, "nu.af(" + ')');
      }
   }
}
