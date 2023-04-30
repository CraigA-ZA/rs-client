import java.util.LinkedList;
import java.util.List;

public class fw extends fb {
   int af;
   int an;
   int aw;
   static int lf;
   // $FF: synthetic field
   final fa this$0;
   static final int cr = 512;
   int ac;
   static int iz;
   static final int tn = 1536;

   public static int af(int var0, int var1, int var2, ia var3, if var4, boolean var5, int[] var6, int[] var7, int var8) {
      try {
         int var10;
         for(int var9 = 0; var9 < 128; ++var9) {
            for(var10 = 0; var10 < 128; ++var10) {
               if (var8 == -52173422) {
                  throw new IllegalStateException();
               }

               iw.aw[var9][var10] = 0;
               iw.ac[var9][var10] = 99999999;
            }
         }

         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         int var16;
         int var17;
         int var18;
         int var20;
         int var21;
         int var22;
         boolean var29;
         if (var2 == 1) {
            var29 = dz.an(var0, var1, var3, var4, 1568495332);
         } else if (var2 == 2) {
            if (var8 == -52173422) {
               throw new IllegalStateException();
            }

            var11 = var0;
            var12 = var1;
            var13 = 64;
            var14 = 64;
            var15 = var0 - var13;
            var16 = var1 - var14;
            iw.aw[var13][var14] = 99;
            iw.ac[var13][var14] = 0;
            var17 = 0;
            var18 = 0;
            iw.al[var17] = var0;
            iw.at[var17++] = var1;
            int[][] var19 = var4.bj;

            boolean var30;
            while(true) {
               if (var18 == var17) {
                  am.au = -617213805 * var11;
                  pg.ab = 1169106949 * var12;
                  var30 = false;
                  break;
               }

               var11 = iw.al[var18];
               var12 = iw.at[var18];
               var18 = var18 + 1 & 4095;
               var13 = var11 - var15;
               var14 = var12 - var16;
               var20 = var11 - var4.bz * 1724654229;
               var21 = var12 - var4.bm * -216630539;
               if (var3.af(2, var11, var12, var4, 286986723)) {
                  if (var8 == -52173422) {
                     throw new IllegalStateException();
                  }

                  am.au = -617213805 * var11;
                  pg.ab = var12 * 1169106949;
                  var30 = true;
                  break;
               }

               var22 = 1 + iw.ac[var13][var14];
               if (var13 > 0) {
                  if (var8 == -52173422) {
                     throw new IllegalStateException();
                  }

                  if (0 != iw.aw[var13 - 1][var14]) {
                     if (var8 == -52173422) {
                        throw new IllegalStateException();
                     }
                  } else if (0 != (var19[var20 - 1][var21] & 19136782)) {
                     if (var8 == -52173422) {
                        throw new IllegalStateException();
                     }
                  } else if (0 != (var19[var20 - 1][1 + var21] & 19136824)) {
                     if (var8 == -52173422) {
                        throw new IllegalStateException();
                     }
                  } else {
                     iw.al[var17] = var11 - 1;
                     iw.at[var17] = var12;
                     var17 = 1 + var17 & 4095;
                     iw.aw[var13 - 1][var14] = 2;
                     iw.ac[var13 - 1][var14] = var22;
                  }
               }

               if (var13 < 126) {
                  if (var8 == -52173422) {
                     throw new IllegalStateException();
                  }

                  if (iw.aw[1 + var13][var14] != 0) {
                     if (var8 == -52173422) {
                        throw new IllegalStateException();
                     }
                  } else if (0 != (var19[var20 + 2][var21] & 19136899)) {
                     if (var8 == -52173422) {
                        throw new IllegalStateException();
                     }
                  } else if ((var19[2 + var20][var21 + 1] & 19136992) != 0) {
                     if (var8 == -52173422) {
                        throw new IllegalStateException();
                     }
                  } else {
                     iw.al[var17] = 1 + var11;
                     iw.at[var17] = var12;
                     var17 = 1 + var17 & 4095;
                     iw.aw[1 + var13][var14] = 8;
                     iw.ac[var13 + 1][var14] = var22;
                  }
               }

               if (var14 > 0) {
                  if (var8 == -52173422) {
                     throw new IllegalStateException();
                  }

                  if (0 != iw.aw[var13][var14 - 1]) {
                     if (var8 == -52173422) {
                        throw new IllegalStateException();
                     }
                  } else if (0 != (var19[var20][var21 - 1] & 19136782)) {
                     if (var8 == -52173422) {
                        throw new IllegalStateException();
                     }
                  } else if (0 != (var19[var20 + 1][var21 - 1] & 19136899)) {
                     if (var8 == -52173422) {
                        throw new IllegalStateException();
                     }
                  } else {
                     iw.al[var17] = var11;
                     iw.at[var17] = var12 - 1;
                     var17 = var17 + 1 & 4095;
                     iw.aw[var13][var14 - 1] = 1;
                     iw.ac[var13][var14 - 1] = var22;
                  }
               }

               if (var14 < 126) {
                  if (var8 == -52173422) {
                     throw new IllegalStateException();
                  }

                  if (0 == iw.aw[var13][1 + var14] && (var19[var20][2 + var21] & 19136824) == 0 && 0 == (var19[var20 + 1][2 + var21] & 19136992)) {
                     iw.al[var17] = var11;
                     iw.at[var17] = var12 + 1;
                     var17 = var17 + 1 & 4095;
                     iw.aw[var13][1 + var14] = 4;
                     iw.ac[var13][var14 + 1] = var22;
                  }
               }

               if (var13 > 0) {
                  if (var8 == -52173422) {
                     throw new IllegalStateException();
                  }

                  if (var14 > 0) {
                     if (var8 == -52173422) {
                        throw new IllegalStateException();
                     }

                     if (iw.aw[var13 - 1][var14 - 1] != 0) {
                        if (var8 == -52173422) {
                           throw new IllegalStateException();
                        }
                     } else if (0 != (var19[var20 - 1][var21] & 19136830)) {
                        if (var8 == -52173422) {
                           throw new IllegalStateException();
                        }
                     } else if (0 == (var19[var20 - 1][var21 - 1] & 19136782)) {
                        if ((var19[var20][var21 - 1] & 19136911) != 0) {
                           if (var8 == -52173422) {
                              throw new IllegalStateException();
                           }
                        } else {
                           iw.al[var17] = var11 - 1;
                           iw.at[var17] = var12 - 1;
                           var17 = var17 + 1 & 4095;
                           iw.aw[var13 - 1][var14 - 1] = 3;
                           iw.ac[var13 - 1][var14 - 1] = var22;
                        }
                     }
                  }
               }

               if (var13 < 126) {
                  if (var8 == -52173422) {
                     throw new IllegalStateException();
                  }

                  if (var14 > 0) {
                     if (var8 == -52173422) {
                        throw new IllegalStateException();
                     }

                     if (0 != iw.aw[1 + var13][var14 - 1]) {
                        if (var8 == -52173422) {
                           throw new IllegalStateException();
                        }
                     } else if ((var19[1 + var20][var21 - 1] & 19136911) == 0 && (var19[2 + var20][var21 - 1] & 19136899) == 0) {
                        if (0 != (var19[2 + var20][var21] & 19136995)) {
                           if (var8 == -52173422) {
                              throw new IllegalStateException();
                           }
                        } else {
                           iw.al[var17] = 1 + var11;
                           iw.at[var17] = var12 - 1;
                           var17 = var17 + 1 & 4095;
                           iw.aw[1 + var13][var14 - 1] = 9;
                           iw.ac[1 + var13][var14 - 1] = var22;
                        }
                     }
                  }
               }

               if (var13 > 0) {
                  if (var8 == -52173422) {
                     throw new IllegalStateException();
                  }

                  if (var14 < 126) {
                     if (var8 == -52173422) {
                        throw new IllegalStateException();
                     }

                     if (iw.aw[var13 - 1][1 + var14] != 0) {
                        if (var8 == -52173422) {
                           throw new IllegalStateException();
                        }
                     } else if ((var19[var20 - 1][1 + var21] & 19136830) == 0) {
                        if (0 != (var19[var20 - 1][2 + var21] & 19136824)) {
                           if (var8 == -52173422) {
                              throw new IllegalStateException();
                           }
                        } else if ((var19[var20][var21 + 2] & 19137016) != 0) {
                           if (var8 == -52173422) {
                              throw new IllegalStateException();
                           }
                        } else {
                           iw.al[var17] = var11 - 1;
                           iw.at[var17] = var12 + 1;
                           var17 = var17 + 1 & 4095;
                           iw.aw[var13 - 1][var14 + 1] = 6;
                           iw.ac[var13 - 1][1 + var14] = var22;
                        }
                     }
                  }
               }

               if (var13 < 126) {
                  if (var8 == -52173422) {
                     throw new IllegalStateException();
                  }

                  if (var14 < 126) {
                     if (var8 == -52173422) {
                        throw new IllegalStateException();
                     }

                     if (iw.aw[1 + var13][var14 + 1] != 0) {
                        if (var8 == -52173422) {
                           throw new IllegalStateException();
                        }
                     } else if ((var19[1 + var20][2 + var21] & 19137016) != 0) {
                        if (var8 == -52173422) {
                           throw new IllegalStateException();
                        }
                     } else if ((var19[var20 + 2][2 + var21] & 19136992) != 0) {
                        if (var8 == -52173422) {
                           throw new IllegalStateException();
                        }
                     } else if (0 != (var19[var20 + 2][var21 + 1] & 19136995)) {
                        if (var8 == -52173422) {
                           throw new IllegalStateException();
                        }
                     } else {
                        iw.al[var17] = 1 + var11;
                        iw.at[var17] = var12 + 1;
                        var17 = var17 + 1 & 4095;
                        iw.aw[var13 + 1][1 + var14] = 12;
                        iw.ac[1 + var13][1 + var14] = var22;
                     }
                  }
               }
            }

            var29 = var30;
         } else {
            var29 = hj.aw(var0, var1, var2, var3, var4, 1036507043);
         }

         var10 = var0 - 64;
         var11 = var1 - 64;
         var12 = 1093766555 * am.au;
         var13 = -56662835 * pg.ab;
         if (!var29) {
            if (!var5) {
               return -1;
            }

            if (var8 == -52173422) {
               throw new IllegalStateException();
            }

            var14 = Integer.MAX_VALUE;
            var15 = Integer.MAX_VALUE;
            byte var32 = 10;
            var17 = 689701217 * var3.af;
            var18 = -407280601 * var3.an;
            int var33 = 372776577 * var3.aw;
            var20 = -333607875 * var3.ac;
            var21 = var17 - var32;

            while(true) {
               if (var21 > var17 + var32) {
                  if (var14 == Integer.MAX_VALUE) {
                     return -1;
                  }
                  break;
               }

               if (var8 == -52173422) {
                  throw new IllegalStateException();
               }

               for(var22 = var18 - var32; var22 <= var18 + var32; ++var22) {
                  if (var8 == -52173422) {
                     throw new IllegalStateException();
                  }

                  int var23 = var21 - var10;
                  int var24 = var22 - var11;
                  if (var23 >= 0 && var24 >= 0) {
                     if (var8 == -52173422) {
                        throw new IllegalStateException();
                     }

                     if (var23 < 128) {
                        if (var8 == -52173422) {
                           throw new IllegalStateException();
                        }

                        if (var24 < 128) {
                           if (var8 == -52173422) {
                              throw new IllegalStateException();
                           }

                           if (iw.ac[var23][var24] < 100) {
                              if (var8 == -52173422) {
                                 throw new IllegalStateException();
                              }

                              int var25 = 0;
                              if (var21 < var17) {
                                 if (var8 == -52173422) {
                                    throw new IllegalStateException();
                                 }

                                 var25 = var17 - var21;
                              } else if (var21 > var33 + var17 - 1) {
                                 if (var8 == -52173422) {
                                    throw new IllegalStateException();
                                 }

                                 var25 = var21 - (var33 + var17 - 1);
                              }

                              int var26 = 0;
                              if (var22 < var18) {
                                 var26 = var18 - var22;
                              } else if (var22 > var20 + var18 - 1) {
                                 if (var8 == -52173422) {
                                    throw new IllegalStateException();
                                 }

                                 var26 = var22 - (var20 + var18 - 1);
                              }

                              int var27 = var26 * var26 + var25 * var25;
                              if (var27 >= var14) {
                                 if (var8 == -52173422) {
                                    throw new IllegalStateException();
                                 }

                                 if (var14 != var27) {
                                    continue;
                                 }

                                 if (var8 == -52173422) {
                                    throw new IllegalStateException();
                                 }

                                 if (iw.ac[var23][var24] >= var15) {
                                    continue;
                                 }

                                 if (var8 == -52173422) {
                                    throw new IllegalStateException();
                                 }
                              }

                              var14 = var27;
                              var15 = iw.ac[var23][var24];
                              var12 = var21;
                              var13 = var22;
                           }
                        }
                     }
                  }
               }

               ++var21;
            }
         }

         if (var0 == var12) {
            if (var8 == -52173422) {
               throw new IllegalStateException();
            }

            if (var1 == var13) {
               if (var8 == -52173422) {
                  throw new IllegalStateException();
               }

               var6[0] = var12;
               var7[0] = var13;
               return 0;
            }
         }

         byte var31 = 0;
         iw.al[var31] = var12;
         var14 = var31 + 1;
         iw.at[var31] = var13;
         var15 = var16 = iw.aw[var12 - var10][var13 - var11];

         while(true) {
            if (var0 == var12) {
               if (var8 == -52173422) {
                  throw new IllegalStateException();
               }

               if (var13 == var1) {
                  var17 = 0;

                  while(var14-- > 0) {
                     if (var8 == -52173422) {
                        throw new IllegalStateException();
                     }

                     var6[var17] = iw.al[var14];
                     var7[var17++] = iw.at[var14];
                     if (var17 >= var6.length) {
                        if (var8 == -52173422) {
                           throw new IllegalStateException();
                        }
                        break;
                     }
                  }

                  return var17;
               }

               if (var8 == -52173422) {
                  throw new IllegalStateException();
               }
            }

            if (var15 != var16) {
               if (var8 == -52173422) {
                  throw new IllegalStateException();
               }

               var16 = var15;
               iw.al[var14] = var12;
               iw.at[var14++] = var13;
            }

            if ((var15 & 2) != 0) {
               if (var8 == -52173422) {
                  throw new IllegalStateException();
               }

               ++var12;
            } else if ((var15 & 8) != 0) {
               if (var8 == -52173422) {
                  throw new IllegalStateException();
               }

               --var12;
            }

            if (0 != (var15 & 1)) {
               if (var8 == -52173422) {
                  throw new IllegalStateException();
               }

               ++var13;
            } else if ((var15 & 4) != 0) {
               if (var8 == -52173422) {
                  throw new IllegalStateException();
               }

               --var13;
            }

            var15 = iw.aw[var12 - var10][var13 - var11];
         }
      } catch (RuntimeException var28) {
         throw db.an(var28, "fw.af(" + ')');
      }
   }

   void af(sg var1, int var2) {
      try {
         this.af = var1.cx(-1023556250) * 1125554619;
         this.ac = var1.cx(-1268158036) * -1773346325;
         this.an = var1.cm((byte)7) * 1126530805;
         this.aw = var1.cm((byte)7) * -1791842501;
      } catch (RuntimeException var3) {
         throw db.an(var3, "fw.af(" + ')');
      }
   }

   void an(fj var1, int var2) {
      try {
         var1.av(this.af * 327631731, 116080323 * this.ac, this.an * -2041660067, this.aw * 1801165299, -458025371);
      } catch (RuntimeException var3) {
         throw db.an(var3, "fw.an(" + ')');
      }
   }

   void aw(fj var1) {
      var1.av(this.af * 327631731, 116080323 * this.ac, this.an * -2041660067, this.aw * 1801165299, -1882412251);
   }

   fw(fa var1) {
      try {
         this.this$0 = var1;
         super();
      } catch (RuntimeException var2) {
         throw db.an(var2, "fw.<init>(" + ')');
      }
   }

   void au(sg var1) {
      this.af = var1.cx(-1635288779) * 1125554619;
      this.ac = var1.cx(-1963658189) * -1773346325;
      this.an = var1.cm((byte)7) * 1126530805;
      this.aw = var1.cm((byte)7) * -1791842501;
   }

   static int bw(int var0, ch var1, boolean var2, byte var3) {
      try {
         int var4;
         Object var5;
         int var6;
         sk var7;
         int var8;
         if (var0 != 7500) {
            if (var3 <= 0) {
               throw new IllegalStateException();
            }

            if (var0 != 7508) {
               if (7501 == var0) {
                  if (var3 <= 0) {
                     throw new IllegalStateException();
                  }

                  if (null != an.wa) {
                     if (var3 <= 0) {
                        throw new IllegalStateException();
                     }

                     if (an.wa.hasNext()) {
                        if (var3 <= 0) {
                           throw new IllegalStateException();
                        }

                        cy.al[(cy.at += 427135973) * -964267539 - 1] = (Integer)an.wa.next();
                        return 1;
                     }
                  }

                  cy.al[(cy.at += 427135973) * -964267539 - 1] = -1;
                  return 1;
               }

               int var22;
               int var24;
               if (var0 == 7502) {
                  if (var3 <= 0) {
                     throw new IllegalStateException();
                  }

                  cy.at -= 1281407919;
                  var4 = cy.al[cy.at * -964267539];
                  var22 = cy.al[1 + -964267539 * cy.at];
                  var6 = cy.al[2 + -964267539 * cy.at];
                  var24 = oy.af(var22, (byte)104);
                  var8 = qe.an(var22, (byte)115);
                  int var26 = fv.aw(var22, 1774054198);
                  sz var27 = ek.an(var4, 1883775054);
                  sm var28 = md.an(var24, (byte)97);
                  int[] var29 = var28.aw[var8];
                  int var13 = 0;
                  int var14 = var29.length;
                  if (var26 >= 0) {
                     if (var3 <= 0) {
                        throw new IllegalStateException();
                     }

                     if (var26 >= var14) {
                        if (var3 <= 0) {
                           throw new IllegalStateException();
                        }

                        throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var26 + ", Max: " + var14);
                     }

                     var13 = var26;
                     var14 = 1 + var26;
                  }

                  Object[] var15 = var27.ac(var8, (byte)-37);
                  if (var15 == null) {
                     if (var3 <= 0) {
                        throw new IllegalStateException();
                     }

                     if (var28.ac != null) {
                        if (var3 <= 0) {
                           throw new IllegalStateException();
                        }

                        var15 = var28.ac[var8];
                     }
                  }

                  int var16;
                  int var17;
                  if (null == var15) {
                     if (var3 <= 0) {
                        throw new IllegalStateException();
                     }

                     for(var16 = var13; var16 < var14; ++var16) {
                        if (var3 <= 0) {
                           throw new IllegalStateException();
                        }

                        var17 = var29[var16];
                        sh var30 = da.an(var17, -2004143923);
                        if (sh.aw == var30) {
                           if (var3 <= 0) {
                              throw new IllegalStateException();
                           }

                           cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = "";
                        } else {
                           cy.al[(cy.at += 427135973) * -964267539 - 1] = nt.af(var17, 1338946112);
                        }
                     }

                     return 1;
                  }

                  var16 = var15.length / var29.length;
                  if (var6 >= 0) {
                     if (var3 <= 0) {
                        throw new IllegalStateException();
                     }

                     if (var6 < var16) {
                        for(var17 = var13; var17 < var14; ++var17) {
                           if (var3 <= 0) {
                              throw new IllegalStateException();
                           }

                           int var18 = var17 + var6 * var29.length;
                           sh var19 = da.an(var29[var17], -177160107);
                           if (sh.aw == var19) {
                              if (var3 <= 0) {
                                 throw new IllegalStateException();
                              }

                              cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = (String)var15[var18];
                           } else {
                              cy.al[(cy.at += 427135973) * -964267539 - 1] = (Integer)var15[var18];
                           }
                        }

                        return 1;
                     }
                  }

                  throw new RuntimeException();
               }

               if (var0 == 7503) {
                  if (var3 <= 0) {
                     throw new IllegalStateException();
                  }

                  cy.at -= 854271946;
                  var4 = cy.al[cy.at * -964267539];
                  var22 = cy.al[1 + cy.at * -964267539];
                  var6 = 0;
                  var24 = oy.af(var22, (byte)86);
                  var8 = qe.an(var22, (byte)22);
                  sz var25 = ek.an(var4, 570380215);
                  sm var10 = md.an(var24, (byte)49);
                  int[] var11 = var10.aw[var8];
                  Object[] var12 = var25.ac(var8, (byte)-88);
                  if (var12 == null) {
                     if (var3 <= 0) {
                        throw new IllegalStateException();
                     }

                     if (var10.ac != null) {
                        if (var3 <= 0) {
                           throw new IllegalStateException();
                        }

                        var12 = var10.ac[var8];
                     }
                  }

                  if (null != var12) {
                     if (var3 <= 0) {
                        throw new IllegalStateException();
                     }

                     var6 = var12.length / var11.length;
                  }

                  cy.al[(cy.at += 427135973) * -964267539 - 1] = var6;
                  return 1;
               }

               if (7504 != var0) {
                  if (var3 <= 0) {
                     throw new IllegalStateException();
                  }

                  if (7510 != var0) {
                     if (7505 == var0) {
                        if (var3 <= 0) {
                           throw new IllegalStateException();
                        }

                        var4 = cy.al[(cy.at -= 427135973) * -964267539];
                        sz var23 = ek.an(var4, -32726682);
                        cy.al[(cy.at += 427135973) * -964267539 - 1] = 468764621 * var23.au;
                        return 1;
                     }

                     if (var0 == 7506) {
                        var4 = cy.al[(cy.at -= 427135973) * -964267539];
                        var22 = -1;
                        if (aa.wf != null && var4 >= 0 && var4 < aa.wf.size()) {
                           if (var3 <= 0) {
                              throw new IllegalStateException();
                           }

                           var22 = (Integer)aa.wf.get(var4);
                        }

                        cy.al[(cy.at += 427135973) * -964267539 - 1] = var22;
                        return 1;
                     }

                     if (7507 != var0) {
                        if (var3 <= 0) {
                           throw new IllegalStateException();
                        }

                        if (7509 != var0) {
                           return 2;
                        }

                        if (var3 <= 0) {
                           throw new IllegalStateException();
                        }
                     }

                     var4 = cy.al[(cy.at -= 427135973) * -964267539];
                     var5 = dr.cn(var4, -444806434);
                     var6 = cy.al[(cy.at -= 427135973) * -964267539];
                     var7 = hf.ov(var6, 1127097285);
                     if (var7 == null) {
                        if (var3 <= 0) {
                           throw new IllegalStateException();
                        }

                        throw new RuntimeException();
                     }

                     if (oy.af(var6, (byte)91) != client.wi * -1334952277) {
                        if (var3 <= 0) {
                           throw new IllegalStateException();
                        }

                        throw new RuntimeException();
                     }

                     if (null == aa.wf) {
                        if (var3 <= 0) {
                           throw new IllegalStateException();
                        }

                        if (aa.wf.isEmpty()) {
                           if (var3 <= 0) {
                              throw new IllegalStateException();
                           }

                           throw new RuntimeException();
                        }
                     }

                     var8 = fv.aw(var6, 1324518303);
                     List var9 = var7.an(var5, var8, 1232252423);
                     aa.wf = new LinkedList(aa.wf);
                     if (var9 != null) {
                        if (var3 <= 0) {
                           throw new IllegalStateException();
                        }

                        aa.wf.retainAll(var9);
                     } else {
                        aa.wf.clear();
                     }

                     an.wa = aa.wf.iterator();
                     if (var0 == 7507) {
                        cy.al[(cy.at += 427135973) * -964267539 - 1] = aa.wf.size();
                     }

                     return 1;
                  }

                  if (var3 <= 0) {
                     throw new IllegalStateException();
                  }
               }

               cy.at -= 427135973;
               var4 = cy.al[-964267539 * cy.at];
               sk var21 = ay.od(var4, 1355800159);
               if (null == var21) {
                  if (var3 <= 0) {
                     throw new IllegalStateException();
                  }

                  throw new RuntimeException();
               }

               aa.wf = var21.an(0, 0, 1385460122);
               var6 = 0;
               if (null != aa.wf) {
                  client.wi = 978308099 * var4;
                  an.wa = aa.wf.iterator();
                  var6 = aa.wf.size();
               }

               if (var0 == 7504) {
                  if (var3 <= 0) {
                     throw new IllegalStateException();
                  }

                  cy.al[(cy.at += 427135973) * -964267539 - 1] = var6;
               }

               return 1;
            }

            if (var3 <= 0) {
               throw new IllegalStateException();
            }
         }

         var4 = cy.al[(cy.at -= 427135973) * -964267539];
         var5 = dr.cn(var4, 140297466);
         var6 = cy.al[(cy.at -= 427135973) * -964267539];
         var7 = hf.ov(var6, 1127097285);
         if (null == var7) {
            if (var3 <= 0) {
               throw new IllegalStateException();
            } else {
               throw new RuntimeException();
            }
         } else {
            var8 = fv.aw(var6, 615247476);
            aa.wf = var7.an(var5, var8, -1777573466);
            if (null != aa.wf) {
               if (var3 <= 0) {
                  throw new IllegalStateException();
               }

               client.wi = oy.af(var6, (byte)121) * 978308099;
               an.wa = aa.wf.iterator();
               if (7500 == var0) {
                  if (var3 <= 0) {
                     throw new IllegalStateException();
                  }

                  cy.al[(cy.at += 427135973) * -964267539 - 1] = aa.wf.size();
               }
            } else {
               client.wi = -978308099;
               an.wa = null;
               if (var0 == 7500) {
                  if (var3 <= 0) {
                     throw new IllegalStateException();
                  }

                  cy.al[(cy.at += 427135973) * -964267539 - 1] = 0;
               }
            }

            return 1;
         }
      } catch (RuntimeException var20) {
         throw db.an(var20, "fw.bw(" + ')');
      }
   }

   public static void ac(int var0) {
      try {
         synchronized(ns.ac) {
            if (0 != -1248352937 * ns.aw) {
               if (var0 == -116413398) {
                  throw new IllegalStateException();
               }

               ns.aw = 1527846503;

               try {
                  ns.ac.wait();
               } catch (InterruptedException var4) {
               }
            }

         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "fw.ac(" + ')');
      }
   }

   public static void ma(mq var0, int var1) {
      try {
         if (var0 != null) {
            if (var1 >= -519894348) {
               throw new IllegalStateException();
            }

            if (207148199 * client.rs == -1197721959 * var0.hv) {
               if (var1 >= -519894348) {
                  throw new IllegalStateException();
               }

               client.rf[372799529 * var0.hd] = true;
            }
         }

      } catch (RuntimeException var2) {
         throw db.an(var2, "fw.ma(" + ')');
      }
   }

   void ac(sg var1) {
      this.af = var1.cx(-1992473432) * 1215920913;
      this.ac = var1.cx(-2078950757) * -1773346325;
      this.an = var1.cm((byte)7) * 1126530805;
      this.aw = var1.cm((byte)7) * -950984967;
   }

   public static hq an(int var0, short var1) {
      try {
         hq var2 = (hq)hq.ac.af((long)var0);
         if (null != var2) {
            if (var1 <= 255) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = hq.an.bh(6, var0, (byte)-38);
            var2 = new hq();
            var2.at = var0 * -1113054781;
            if (var3 != null) {
               var2.ac(new sg(var3), 1333765973);
            }

            var2.aw((byte)97);
            if (var2.br) {
               if (var1 <= 255) {
                  throw new IllegalStateException();
               }

               var2.am = 0;
               var2.as = false;
            }

            hq.ac.aw(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "fw.an(" + ')');
      }
   }

   public static void av(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10) {
      try {
         in.aq.aq(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
      } catch (RuntimeException var11) {
         throw db.an(var11, "fw.av(" + ')');
      }
   }

   static String an(byte[] var0, int var1, int var2, int var3) {
      try {
         StringBuilder var4 = new StringBuilder();

         for(int var5 = var1; var5 < var2 + var1; var5 += 3) {
            if (var3 == -1790230453) {
               throw new IllegalStateException();
            }

            int var6 = var0[var5] & 255;
            var4.append(ol.af[var6 >>> 2]);
            if (var5 < var2 - 1) {
               if (var3 == -1790230453) {
                  throw new IllegalStateException();
               }

               int var7 = var0[1 + var5] & 255;
               var4.append(ol.af[(var6 & 3) << 4 | var7 >>> 4]);
               if (var5 < var2 - 2) {
                  if (var3 == -1790230453) {
                     throw new IllegalStateException();
                  }

                  int var8 = var0[var5 + 2] & 255;
                  var4.append(ol.af[(var7 & 15) << 2 | var8 >>> 6]).append(ol.af[var8 & 63]);
               } else {
                  var4.append(ol.af[(var7 & 15) << 2]).append("=");
               }
            } else {
               var4.append(ol.af[(var6 & 3) << 4]).append("==");
            }
         }

         return var4.toString();
      } catch (RuntimeException var9) {
         throw db.an(var9, "fw.an(" + ')');
      }
   }
}
