public class gh extends gn {
   String af;
   static final int am = 21;
   static final int al = 128;
   // $FF: synthetic field
   final gy this$0;

   public int af(byte var1) {
      try {
         return 1;
      } catch (RuntimeException var2) {
         throw db.an(var2, "gh.af(" + ')');
      }
   }

   gh(gy var1, String var2, String var3) {
      try {
         this.this$0 = var1;
         super(var1, var2);
         this.af = var3;
      } catch (RuntimeException var4) {
         throw db.an(var4, "gh.<init>(" + ')');
      }
   }

   public String an(byte var1) {
      try {
         return this.af;
      } catch (RuntimeException var2) {
         throw db.an(var2, "gh.an(" + ')');
      }
   }

   public static void aq(int var0) {
      try {
         ho.an.ac();
      } catch (RuntimeException var1) {
         throw db.an(var1, "gh.aq(" + ')');
      }
   }

   public int ac() {
      return 1;
   }

   public int au() {
      return 1;
   }

   public int aw() {
      return 1;
   }

   public String aq() {
      return this.af;
   }

   public String ab() {
      return this.af;
   }

   public static mq an(int var0, byte var1) {
      try {
         int var2 = var0 >> 16;
         int var3 = var0 & '\uffff';
         if (hn.ap[var2] != null) {
            if (var1 != 5) {
               throw new IllegalStateException();
            }

            if (hn.ap[var2][var3] != null) {
               return hn.ap[var2][var3];
            }

            if (var1 != 5) {
               throw new IllegalStateException();
            }
         }

         boolean var4 = bq.ac(var2, 1376777516);
         if (!var4) {
            return null;
         } else {
            return hn.ap[var2][var3];
         }
      } catch (RuntimeException var5) {
         throw db.an(var5, "gh.an(" + ')');
      }
   }

   static final void ak(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, ie var8, if var9, int var10) {
      try {
         hq var11 = fw.an(var4, (short)17115);
         int var10000;
         if (var7 >= 0) {
            if (var10 != -1255092021) {
               throw new IllegalStateException();
            }

            var10000 = var7;
         } else {
            var10000 = 1292954189 * var11.ae;
         }

         int var12;
         int var13;
         int var14;
         label480: {
            var12 = var10000;
            if (var5 != 1) {
               if (var10 != -1255092021) {
                  return;
               }

               if (var5 != 3) {
                  var13 = var11.av * -1339930361;
                  var14 = var11.ar * -1659393955;
                  break label480;
               }

               if (var10 != -1255092021) {
                  throw new IllegalStateException();
               }
            }

            var13 = var11.ar * -1659393955;
            var14 = var11.av * -1339930361;
         }

         int var15;
         int var16;
         if (var2 + var13 <= 104) {
            if (var10 != -1255092021) {
               throw new IllegalStateException();
            }

            var15 = (var13 >> 1) + var2;
            var16 = (1 + var13 >> 1) + var2;
         } else {
            var15 = var2;
            var16 = var2 + 1;
         }

         int var17;
         int var18;
         if (var3 + var14 <= 104) {
            if (var10 != -1255092021) {
               throw new IllegalStateException();
            }

            var17 = (var14 >> 1) + var3;
            var18 = var3 + (var14 + 1 >> 1);
         } else {
            var17 = var3;
            var18 = 1 + var3;
         }

         int[][] var19 = cd.af[var1];
         int var20 = var19[var15][var17] + var19[var16][var17] + var19[var15][var18] + var19[var16][var18] >> 2;
         int var21 = (var2 << 7) + (var13 << 6);
         int var22 = (var14 << 6) + (var3 << 7);
         boolean var10003;
         if (0 == 415653149 * var11.aj) {
            if (var10 != -1255092021) {
               throw new IllegalStateException();
            }

            var10003 = true;
         } else {
            var10003 = false;
         }

         long var23 = ir.aa(var2, var3, 2, var10003, var4, 1218220316);
         int var25 = (var5 << 6) + var6;
         if (1 == -1850643527 * var11.bg) {
            var25 += 256;
         }

         Object var26;
         if (var6 == 22) {
            if (-1 == var12 && null == var11.bu) {
               if (var10 != -1255092021) {
                  return;
               }

               var26 = var11.at(22, var5, var19, var21, var20, var22, (byte)-51);
            } else {
               var26 = new ct(var4, 22, var5, var1, var2, var3, var12, var11.bh, (iv)null);
            }

            var8.aq(var0, var2, var3, var20, (iv)var26, var23, var25);
            if (var11.am * -973955889 == 1) {
               if (var10 != -1255092021) {
                  throw new IllegalStateException();
               }

               var9.au(var2, var3, -360808658);
            }

         } else {
            if (var6 != 10) {
               if (var10 != -1255092021) {
                  throw new IllegalStateException();
               }

               if (var6 != 11) {
                  if (var6 >= 12) {
                     if (var10 != -1255092021) {
                        throw new IllegalStateException();
                     }

                     label373: {
                        if (-1 == var12) {
                           if (var10 != -1255092021) {
                              return;
                           }

                           if (null == var11.bu) {
                              var26 = var11.at(var6, var5, var19, var21, var20, var22, (byte)-108);
                              break label373;
                           }
                        }

                        var26 = new ct(var4, var6, var5, var1, var2, var3, var12, var11.bh, (iv)null);
                     }

                     var8.ay(var0, var2, var3, var20, 1, 1, (iv)var26, 0, var23, var25);
                     if (var11.am * -973955889 != 0) {
                        var9.aw(var2, var3, var13, var14, var11.as, (byte)-38);
                     }

                     return;
                  }

                  if (var6 == 0) {
                     if (-1 == var12 && var11.bu == null) {
                        if (var10 != -1255092021) {
                           throw new IllegalStateException();
                        }

                        var26 = var11.at(0, var5, var19, var21, var20, var22, (byte)120);
                     } else {
                        var26 = new ct(var4, 0, var5, var1, var2, var3, var12, var11.bh, (iv)null);
                     }

                     var8.at(var0, var2, var3, var20, (iv)var26, (iv)null, cd.am[var5], 0, var23, var25);
                     if (-973955889 * var11.am != 0) {
                        var9.an(var2, var3, var6, var5, var11.as, -2067452311);
                     }

                     return;
                  }

                  if (1 == var6) {
                     if (var10 != -1255092021) {
                        return;
                     }

                     label388: {
                        if (-1 == var12) {
                           if (var10 != -1255092021) {
                              throw new IllegalStateException();
                           }

                           if (var11.bu == null) {
                              if (var10 != -1255092021) {
                                 return;
                              }

                              var26 = var11.at(1, var5, var19, var21, var20, var22, (byte)27);
                              break label388;
                           }
                        }

                        var26 = new ct(var4, 1, var5, var1, var2, var3, var12, var11.bh, (iv)null);
                     }

                     var8.at(var0, var2, var3, var20, (iv)var26, (iv)null, cd.as[var5], 0, var23, var25);
                     if (0 != -973955889 * var11.am) {
                        if (var10 != -1255092021) {
                           throw new IllegalStateException();
                        }

                        var9.an(var2, var3, var6, var5, var11.as, -2067452311);
                     }

                     return;
                  }

                  int var33;
                  if (2 == var6) {
                     Object var28;
                     Object var35;
                     label397: {
                        var33 = 1 + var5 & 3;
                        if (var12 == -1) {
                           if (var10 != -1255092021) {
                              throw new IllegalStateException();
                           }

                           if (var11.bu == null) {
                              if (var10 != -1255092021) {
                                 return;
                              }

                              var35 = var11.at(2, 4 + var5, var19, var21, var20, var22, (byte)71);
                              var28 = var11.at(2, var33, var19, var21, var20, var22, (byte)105);
                              break label397;
                           }
                        }

                        var35 = new ct(var4, 2, var5 + 4, var1, var2, var3, var12, var11.bh, (iv)null);
                        var28 = new ct(var4, 2, var33, var1, var2, var3, var12, var11.bh, (iv)null);
                     }

                     var8.at(var0, var2, var3, var20, (iv)var35, (iv)var28, cd.am[var5], cd.am[var33], var23, var25);
                     if (-973955889 * var11.am != 0) {
                        if (var10 != -1255092021) {
                           throw new IllegalStateException();
                        }

                        var9.an(var2, var3, var6, var5, var11.as, -2067452311);
                     }

                     return;
                  }

                  if (var6 == 3) {
                     if (var10 != -1255092021) {
                        throw new IllegalStateException();
                     }

                     label405: {
                        if (var12 == -1) {
                           if (var10 != -1255092021) {
                              throw new IllegalStateException();
                           }

                           if (null == var11.bu) {
                              if (var10 != -1255092021) {
                                 throw new IllegalStateException();
                              }

                              var26 = var11.at(3, var5, var19, var21, var20, var22, (byte)-26);
                              break label405;
                           }
                        }

                        var26 = new ct(var4, 3, var5, var1, var2, var3, var12, var11.bh, (iv)null);
                     }

                     var8.at(var0, var2, var3, var20, (iv)var26, (iv)null, cd.as[var5], 0, var23, var25);
                     if (-973955889 * var11.am != 0) {
                        if (var10 != -1255092021) {
                           throw new IllegalStateException();
                        }

                        var9.an(var2, var3, var6, var5, var11.as, -2067452311);
                     }

                     return;
                  }

                  if (var6 == 9) {
                     if (var10 != -1255092021) {
                        throw new IllegalStateException();
                     }

                     label414: {
                        if (var12 == -1) {
                           if (var10 != -1255092021) {
                              throw new IllegalStateException();
                           }

                           if (var11.bu == null) {
                              if (var10 != -1255092021) {
                                 return;
                              }

                              var26 = var11.at(var6, var5, var19, var21, var20, var22, (byte)-28);
                              break label414;
                           }
                        }

                        var26 = new ct(var4, var6, var5, var1, var2, var3, var12, var11.bh, (iv)null);
                     }

                     var8.ay(var0, var2, var3, var20, 1, 1, (iv)var26, 0, var23, var25);
                     if (-973955889 * var11.am != 0) {
                        if (var10 != -1255092021) {
                           return;
                        }

                        var9.aw(var2, var3, var13, var14, var11.as, (byte)-113);
                     }

                     return;
                  }

                  if (4 == var6) {
                     label423: {
                        if (-1 == var12) {
                           if (var10 != -1255092021) {
                              throw new IllegalStateException();
                           }

                           if (null == var11.bu) {
                              var26 = var11.at(4, var5, var19, var21, var20, var22, (byte)21);
                              break label423;
                           }
                        }

                        var26 = new ct(var4, 4, var5, var1, var2, var3, var12, var11.bh, (iv)null);
                     }

                     var8.aa(var0, var2, var3, var20, (iv)var26, (iv)null, cd.am[var5], 0, 0, 0, var23, var25);
                     return;
                  }

                  long var27;
                  Object var29;
                  if (5 == var6) {
                     var33 = 16;
                     var27 = var8.by(var0, var2, var3);
                     if (var27 != 0L) {
                        if (var10 != -1255092021) {
                           throw new IllegalStateException();
                        }

                        var33 = fw.an(di.at(var27), (short)10737).ap * -89408815;
                     }

                     label431: {
                        if (-1 == var12) {
                           if (var10 != -1255092021) {
                              return;
                           }

                           if (var11.bu == null) {
                              if (var10 != -1255092021) {
                                 throw new IllegalStateException();
                              }

                              var29 = var11.at(4, var5, var19, var21, var20, var22, (byte)-45);
                              break label431;
                           }
                        }

                        var29 = new ct(var4, 4, var5, var1, var2, var3, var12, var11.bh, (iv)null);
                     }

                     var8.aa(var0, var2, var3, var20, (iv)var29, (iv)null, cd.am[var5], 0, cd.aj[var5] * var33, cd.ak[var5] * var33, var23, var25);
                     return;
                  }

                  if (var6 == 6) {
                     var33 = 8;
                     var27 = var8.by(var0, var2, var3);
                     if (0L != var27) {
                        if (var10 != -1255092021) {
                           throw new IllegalStateException();
                        }

                        var33 = fw.an(di.at(var27), (short)19905).ap * -89408815 / 2;
                     }

                     if (var12 == -1 && var11.bu == null) {
                        if (var10 != -1255092021) {
                           throw new IllegalStateException();
                        }

                        var29 = var11.at(4, 4 + var5, var19, var21, var20, var22, (byte)-10);
                     } else {
                        var29 = new ct(var4, 4, var5 + 4, var1, var2, var3, var12, var11.bh, (iv)null);
                     }

                     var8.aa(var0, var2, var3, var20, (iv)var29, (iv)null, 256, var5, cd.az[var5] * var33, var33 * cd.ad[var5], var23, var25);
                     return;
                  }

                  if (var6 == 7) {
                     if (var10 != -1255092021) {
                        throw new IllegalStateException();
                     }

                     int var34;
                     label448: {
                        var34 = var5 + 2 & 3;
                        if (var12 == -1) {
                           if (var10 != -1255092021) {
                              throw new IllegalStateException();
                           }

                           if (var11.bu == null) {
                              if (var10 != -1255092021) {
                                 return;
                              }

                              var26 = var11.at(4, 4 + var34, var19, var21, var20, var22, (byte)98);
                              break label448;
                           }
                        }

                        var26 = new ct(var4, 4, 4 + var34, var1, var2, var3, var12, var11.bh, (iv)null);
                     }

                     var8.aa(var0, var2, var3, var20, (iv)var26, (iv)null, 256, var34, 0, 0, var23, var25);
                     return;
                  }

                  if (8 != var6) {
                     return;
                  }

                  if (var10 != -1255092021) {
                     throw new IllegalStateException();
                  }

                  var33 = 8;
                  var27 = var8.by(var0, var2, var3);
                  if (0L != var27) {
                     if (var10 != -1255092021) {
                        throw new IllegalStateException();
                     }

                     var33 = fw.an(di.at(var27), (short)19671).ap * -89408815 / 2;
                  }

                  int var31 = var5 + 2 & 3;
                  Object var30;
                  if (-1 == var12 && var11.bu == null) {
                     if (var10 != -1255092021) {
                        return;
                     }

                     var29 = var11.at(4, 4 + var5, var19, var21, var20, var22, (byte)51);
                     var30 = var11.at(4, 4 + var31, var19, var21, var20, var22, (byte)-40);
                  } else {
                     var29 = new ct(var4, 4, var5 + 4, var1, var2, var3, var12, var11.bh, (iv)null);
                     var30 = new ct(var4, 4, 4 + var31, var1, var2, var3, var12, var11.bh, (iv)null);
                  }

                  var8.aa(var0, var2, var3, var20, (iv)var29, (iv)var30, 256, var5, var33 * cd.az[var5], var33 * cd.ad[var5], var23, var25);
                  return;
               }

               if (var10 != -1255092021) {
                  throw new IllegalStateException();
               }
            }

            label472: {
               if (var12 == -1) {
                  if (var10 != -1255092021) {
                     throw new IllegalStateException();
                  }

                  if (var11.bu == null) {
                     if (var10 != -1255092021) {
                        throw new IllegalStateException();
                     }

                     var26 = var11.at(10, var5, var19, var21, var20, var22, (byte)-28);
                     break label472;
                  }
               }

               var26 = new ct(var4, 10, var5, var1, var2, var3, var12, var11.bh, (iv)null);
            }

            if (null != var26) {
               if (var10 != -1255092021) {
                  throw new IllegalStateException();
               }

               var8.ay(var0, var2, var3, var20, var13, var14, (iv)var26, 11 == var6 ? 256 : 0, var23, var25);
            }

            if (0 != var11.am * -973955889) {
               if (var10 != -1255092021) {
                  throw new IllegalStateException();
               }

               var9.aw(var2, var3, var13, var14, var11.as, (byte)-48);
            }

         }
      } catch (RuntimeException var32) {
         throw db.an(var32, "gh.ak(" + ')');
      }
   }
}
