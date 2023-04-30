public class ex implements nj {
   static final ex an = new ex(1, 1);
   static gf rk;
   static final ex aw = new ex(2, 2);
   static final ex ac = new ex(3, 3);
   static final ex au = new ex(4, 4);
   static final int av = 19;
   final int aq;
   static final String ho = "JX_DISPLAY_NAME";
   final int ab;
   static final ex af = new ex(0, 0);
   static tq at;
   static final int ax = 25;
   static int uo;

   public int aw() {
      return this.aq * 1278841248;
   }

   public int af(int var1) {
      try {
         return this.aq * 355070857;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ex.af(" + ')');
      }
   }

   static ex[] al() {
      return new ex[]{af, an, aw, ac, au};
   }

   ex(int var1, int var2) {
      try {
         super();
         this.ab = var1 * -1799886237;
         this.aq = var2 * 962359993;
      } catch (RuntimeException var3) {
         throw db.an(var3, "ex.<init>(" + ')');
      }
   }

   public int ac() {
      return this.aq * -1446996376;
   }

   static ex[] aq() {
      return new ex[]{af, an, aw, ac, au};
   }

   public int an() {
      return this.aq * 1494955129;
   }

   static void aw(cl[] var0, int var1, int var2, int[] var3, int[] var4, int var5) {
      try {
         if (var1 < var2) {
            if (var5 != -139825594) {
               throw new IllegalStateException();
            }

            int var6 = var1 - 1;
            int var7 = 1 + var2;
            int var8 = (var2 + var1) / 2;
            cl var9 = var0[var8];
            var0[var8] = var0[var1];
            var0[var1] = var9;

            while(true) {
               if (var6 >= var7) {
                  aw(var0, var1, var7, var3, var4, -139825594);
                  aw(var0, 1 + var7, var2, var3, var4, -139825594);
                  break;
               }

               if (var5 != -139825594) {
                  return;
               }

               boolean var10 = true;

               int var11;
               int var12;
               int var13;
               do {
                  --var7;

                  for(var11 = 0; var11 < 4; ++var11) {
                     if (var5 != -139825594) {
                        throw new IllegalStateException();
                     }

                     if (var3[var11] == 2) {
                        if (var5 != -139825594) {
                           throw new IllegalStateException();
                        }

                        var12 = var0[var7].av * 1692771375;
                        var13 = 1692771375 * var9.av;
                     } else if (1 == var3[var11]) {
                        if (var5 != -139825594) {
                           throw new IllegalStateException();
                        }

                        var12 = var0[var7].ax * -1396846889;
                        var13 = var9.ax * -1396846889;
                        if (var12 == -1 && var4[var11] == 1) {
                           if (var5 != -139825594) {
                              return;
                           }

                           var12 = 2001;
                        }

                        if (var13 == -1 && 1 == var4[var11]) {
                           if (var5 != -139825594) {
                              throw new IllegalStateException();
                           }

                           var13 = 2001;
                        }
                     } else if (3 == var3[var11]) {
                        if (var5 != -139825594) {
                           throw new IllegalStateException();
                        }

                        var12 = var0[var7].at(1029039210) ? 1 : 0;
                        var13 = var9.at(1029039210) ? 1 : 0;
                     } else {
                        var12 = var0[var7].ay * -2091224171;
                        var13 = -2091224171 * var9.ay;
                     }

                     if (var13 != var12) {
                        if (var4[var11] == 1) {
                           if (var5 != -139825594) {
                              return;
                           }

                           if (var12 > var13) {
                              if (var5 != -139825594) {
                                 throw new IllegalStateException();
                              }
                              break;
                           }
                        }

                        if (var4[var11] == 0) {
                           if (var5 != -139825594) {
                              throw new IllegalStateException();
                           }

                           if (var12 < var13) {
                              break;
                           }
                        }

                        var10 = false;
                        break;
                     }

                     if (var5 != -139825594) {
                        throw new IllegalStateException();
                     }

                     if (var11 == 3) {
                        if (var5 != -139825594) {
                           throw new IllegalStateException();
                        }

                        var10 = false;
                     }
                  }
               } while(var10);

               if (var5 != -139825594) {
                  throw new IllegalStateException();
               }

               var10 = true;

               do {
                  ++var6;

                  for(var11 = 0; var11 < 4; ++var11) {
                     if (var5 != -139825594) {
                        return;
                     }

                     if (2 == var3[var11]) {
                        var12 = 1692771375 * var0[var6].av;
                        var13 = 1692771375 * var9.av;
                     } else if (var3[var11] == 1) {
                        if (var5 != -139825594) {
                           throw new IllegalStateException();
                        }

                        var12 = var0[var6].ax * -1396846889;
                        var13 = -1396846889 * var9.ax;
                        if (-1 == var12) {
                           if (var5 != -139825594) {
                              throw new IllegalStateException();
                           }

                           if (1 == var4[var11]) {
                              if (var5 != -139825594) {
                                 throw new IllegalStateException();
                              }

                              var12 = 2001;
                           }
                        }

                        if (-1 == var13 && var4[var11] == 1) {
                           if (var5 != -139825594) {
                              return;
                           }

                           var13 = 2001;
                        }
                     } else if (3 == var3[var11]) {
                        if (var5 != -139825594) {
                           throw new IllegalStateException();
                        }

                        byte var10000;
                        if (var0[var6].at(1029039210)) {
                           if (var5 != -139825594) {
                              throw new IllegalStateException();
                           }

                           var10000 = 1;
                        } else {
                           var10000 = 0;
                        }

                        var12 = var10000;
                        if (var9.at(1029039210)) {
                           if (var5 != -139825594) {
                              throw new IllegalStateException();
                           }

                           var10000 = 1;
                        } else {
                           var10000 = 0;
                        }

                        var13 = var10000;
                     } else {
                        var12 = var0[var6].ay * -2091224171;
                        var13 = var9.ay * -2091224171;
                     }

                     if (var12 != var13) {
                        if (1 == var4[var11]) {
                           if (var5 != -139825594) {
                              throw new IllegalStateException();
                           }

                           if (var12 < var13) {
                              if (var5 != -139825594) {
                                 return;
                              }
                              break;
                           }
                        }

                        if (var4[var11] == 0) {
                           if (var5 != -139825594) {
                              throw new IllegalStateException();
                           }

                           if (var12 > var13) {
                              break;
                           }
                        }

                        var10 = false;
                        break;
                     }

                     if (var5 != -139825594) {
                        return;
                     }

                     if (3 == var11) {
                        if (var5 != -139825594) {
                           throw new IllegalStateException();
                        }

                        var10 = false;
                     }
                  }
               } while(var10);

               if (var5 != -139825594) {
                  throw new IllegalStateException();
               }

               if (var6 < var7) {
                  if (var5 != -139825594) {
                     throw new IllegalStateException();
                  }

                  cl var15 = var0[var6];
                  var0[var6] = var0[var7];
                  var0[var7] = var15;
               }
            }
         }

      } catch (RuntimeException var14) {
         throw db.an(var14, "ex.aw(" + ')');
      }
   }
}
