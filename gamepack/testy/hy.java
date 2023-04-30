import java.util.Arrays;

public class hy implements be {
   public int[] aw = new int[128];
   int aq = 0;
   boolean[] ay = new boolean[112];
   public static final String kt = "";
   int[] au = new int[128];
   int ab = 0;
   char[] af = new char[128];
   public static final int bn = 62;
   int at = 0;
   boolean[] aa = new boolean[112];
   int[] an = new int[128];
   boolean[] ao = new boolean[112];
   public char ax;
   public int ai;
   public int ac = 0;
   int al = 0;
   static final int rz = 100;

   public boolean bx(int var1) {
      return var1 >= 0 && var1 < 112 ? this.ao[var1] : false;
   }

   public boolean af(int var1, int var2) {
      try {
         this.ax(var1, (byte)30);
         this.aa[var1] = true;
         this.ay[var1] = true;
         this.ao[var1] = false;
         this.aw[(this.ac += -1818927653) * 1888573011 - 1] = var1;
         return true;
      } catch (RuntimeException var3) {
         throw db.an(var3, "hy.af(" + ')');
      }
   }

   public boolean bi(int var1) {
      return var1 >= 0 && var1 < 112 ? this.ay[var1] : false;
   }

   public boolean ay(boolean var1) {
      return false;
   }

   void ax(int var1, byte var2) {
      try {
         int var3 = -1384260729 * this.al + 1 & 127;
         if (var3 != 73809669 * this.aq) {
            if (var2 >= 55) {
               return;
            }

            this.an[this.al * -1384260729] = var1;
            this.af[-1384260729 * this.al] = 0;
            this.al = var3 * -1899169225;
         }

      } catch (RuntimeException var4) {
         throw db.an(var4, "hy.ax(" + ')');
      }
   }

   static final void ay(int var0, int var1, int var2, int var3, int var4, int var5, ie var6, if var7, int var8) {
      try {
         if (client.cu) {
            if (var8 >= 480760824) {
               throw new IllegalStateException();
            }

            if (0 == (cd.an[0][var1][var2] & 2) && (cd.an[var0][var1][var2] & 16) != 0) {
               if (var8 >= 480760824) {
                  throw new IllegalStateException();
               }

               return;
            }
         }

         if (var0 < 1401144457 * cd.aw) {
            if (var8 >= 480760824) {
               throw new IllegalStateException();
            }

            cd.aw = -1087180359 * var0;
         }

         hq var9;
         int var10;
         int var11;
         label858: {
            var9 = fw.an(var3, (short)25436);
            if (var4 != 1) {
               if (var8 >= 480760824) {
                  throw new IllegalStateException();
               }

               if (var4 != 3) {
                  var10 = var9.av * -1339930361;
                  var11 = -1659393955 * var9.ar;
                  break label858;
               }

               if (var8 >= 480760824) {
                  throw new IllegalStateException();
               }
            }

            var10 = -1659393955 * var9.ar;
            var11 = -1339930361 * var9.av;
         }

         int var12;
         int var13;
         if (var1 + var10 <= 104) {
            if (var8 >= 480760824) {
               return;
            }

            var12 = var1 + (var10 >> 1);
            var13 = (1 + var10 >> 1) + var1;
         } else {
            var12 = var1;
            var13 = 1 + var1;
         }

         int var14;
         int var15;
         if (var11 + var2 <= 104) {
            if (var8 >= 480760824) {
               throw new IllegalStateException();
            }

            var14 = var2 + (var11 >> 1);
            var15 = (1 + var11 >> 1) + var2;
         } else {
            var14 = var2;
            var15 = 1 + var2;
         }

         int[][] var16 = cd.af[var0];
         int var17 = var16[var13][var15] + var16[var12][var15] + var16[var12][var14] + var16[var13][var14] >> 2;
         int var18 = (var10 << 6) + (var1 << 7);
         int var19 = (var2 << 7) + (var11 << 6);
         boolean var10003;
         if (0 == 415653149 * var9.aj) {
            if (var8 >= 480760824) {
               throw new IllegalStateException();
            }

            var10003 = true;
         } else {
            var10003 = false;
         }

         long var20 = ir.aa(var1, var2, 2, var10003, var3, 1998456330);
         int var22 = var5 + (var4 << 6);
         if (-1850643527 * var9.bg == 1) {
            var22 += 256;
         }

         if (var9.ah(-1940318911)) {
            if (var8 >= 480760824) {
               return;
            }

            bm.ac(var0, var1, var2, var9, var4, (byte)-47);
         }

         Object var23;
         if (22 == var5) {
            if (var8 < 480760824) {
               if (client.cu) {
                  if (var8 >= 480760824) {
                     return;
                  }

                  if (0 == var9.aj * 415653149 && 1 != var9.am * -973955889) {
                     if (var8 >= 480760824) {
                        return;
                     }

                     if (!var9.bs) {
                        return;
                     }
                  }
               }

               if (-1 == 1292954189 * var9.ae && null == var9.bu) {
                  if (var8 >= 480760824) {
                     return;
                  }

                  var23 = var9.al(22, var4, var16, var18, var17, var19, (byte)-65);
               } else {
                  var23 = new ct(var3, 22, var4, var0, var1, var2, 1292954189 * var9.ae, var9.bh, (iv)null);
               }

               var6.aq(var0, var1, var2, var17, (iv)var23, var20, var22);
               if (var9.am * -973955889 == 1) {
                  if (var8 >= 480760824) {
                     return;
                  }

                  if (var7 != null) {
                     if (var8 >= 480760824) {
                        return;
                     }

                     var7.au(var1, var2, 93248030);
                  }
               }

            }
         } else {
            int var24;
            if (10 != var5) {
               if (var8 >= 480760824) {
                  throw new IllegalStateException();
               }

               if (var5 != 11) {
                  int[] var10000;
                  if (var5 >= 12) {
                     if (var8 >= 480760824) {
                        throw new IllegalStateException();
                     }

                     label726: {
                        if (var9.ae * 1292954189 == -1) {
                           if (var8 >= 480760824) {
                              return;
                           }

                           if (null == var9.bu) {
                              if (var8 >= 480760824) {
                                 throw new IllegalStateException();
                              }

                              var23 = var9.al(var5, var4, var16, var18, var17, var19, (byte)-110);
                              break label726;
                           }
                        }

                        var23 = new ct(var3, var5, var4, var0, var1, var2, var9.ae * 1292954189, var9.bh, (iv)null);
                     }

                     var6.ay(var0, var1, var2, var17, 1, 1, (iv)var23, 0, var20, var22);
                     if (var5 >= 12) {
                        if (var8 >= 480760824) {
                           throw new IllegalStateException();
                        }

                        if (var5 <= 17) {
                           if (var8 >= 480760824) {
                              throw new IllegalStateException();
                           }

                           if (var5 != 13) {
                              if (var8 >= 480760824) {
                                 throw new IllegalStateException();
                              }

                              if (var0 > 0) {
                                 var10000 = ge.ag[var0][var1];
                                 var10000[var2] |= 2340;
                              }
                           }
                        }
                     }

                     if (0 != var9.am * -973955889) {
                        if (var8 >= 480760824) {
                           return;
                        }

                        if (null != var7) {
                           var7.aw(var1, var2, var10, var11, var9.as, (byte)-123);
                        }
                     }

                     return;
                  }

                  if (var5 == 0) {
                     if (var8 >= 480760824) {
                        throw new IllegalStateException();
                     }

                     label734: {
                        if (-1 == var9.ae * 1292954189) {
                           if (var8 >= 480760824) {
                              throw new IllegalStateException();
                           }

                           if (var9.bu == null) {
                              var23 = var9.al(0, var4, var16, var18, var17, var19, (byte)-17);
                              break label734;
                           }
                        }

                        var23 = new ct(var3, 0, var4, var0, var1, var2, 1292954189 * var9.ae, var9.bh, (iv)null);
                     }

                     var6.at(var0, var1, var2, var17, (iv)var23, (iv)null, cd.am[var4], 0, var20, var22);
                     if (0 == var4) {
                        if (var8 >= 480760824) {
                           throw new IllegalStateException();
                        }

                        if (var9.bo) {
                           if (var8 >= 480760824) {
                              throw new IllegalStateException();
                           }

                           cd.al[var0][var1][var2] = 50;
                           cd.al[var0][var1][var2 + 1] = 50;
                        }

                        if (var9.ad) {
                           if (var8 >= 480760824) {
                              return;
                           }

                           var10000 = ge.ag[var0][var1];
                           var10000[var2] |= 585;
                        }
                     } else if (1 == var4) {
                        if (var8 >= 480760824) {
                           return;
                        }

                        if (var9.bo) {
                           if (var8 >= 480760824) {
                              return;
                           }

                           cd.al[var0][var1][1 + var2] = 50;
                           cd.al[var0][var1 + 1][1 + var2] = 50;
                        }

                        if (var9.ad) {
                           if (var8 >= 480760824) {
                              throw new IllegalStateException();
                           }

                           var10000 = ge.ag[var0][var1];
                           var10000[1 + var2] |= 1170;
                        }
                     } else if (2 == var4) {
                        if (var8 >= 480760824) {
                           return;
                        }

                        if (var9.bo) {
                           if (var8 >= 480760824) {
                              return;
                           }

                           cd.al[var0][1 + var1][var2] = 50;
                           cd.al[var0][1 + var1][1 + var2] = 50;
                        }

                        if (var9.ad) {
                           if (var8 >= 480760824) {
                              throw new IllegalStateException();
                           }

                           var10000 = ge.ag[var0][1 + var1];
                           var10000[var2] |= 585;
                        }
                     } else if (3 == var4) {
                        if (var9.bo) {
                           if (var8 >= 480760824) {
                              throw new IllegalStateException();
                           }

                           cd.al[var0][var1][var2] = 50;
                           cd.al[var0][var1 + 1][var2] = 50;
                        }

                        if (var9.ad) {
                           if (var8 >= 480760824) {
                              return;
                           }

                           var10000 = ge.ag[var0][var1];
                           var10000[var2] |= 1170;
                        }
                     }

                     if (var9.am * -973955889 != 0) {
                        if (var8 >= 480760824) {
                           return;
                        }

                        if (null != var7) {
                           if (var8 >= 480760824) {
                              return;
                           }

                           var7.an(var1, var2, var5, var4, var9.as, -2067452311);
                        }
                     }

                     if (16 != -89408815 * var9.ap) {
                        if (var8 >= 480760824) {
                           return;
                        }

                        var6.av(var0, var1, var2, -89408815 * var9.ap);
                     }

                     return;
                  }

                  if (var5 == 1) {
                     if (var8 >= 480760824) {
                        return;
                     }

                     if (1292954189 * var9.ae == -1 && var9.bu == null) {
                        if (var8 >= 480760824) {
                           throw new IllegalStateException();
                        }

                        var23 = var9.al(1, var4, var16, var18, var17, var19, (byte)-60);
                     } else {
                        var23 = new ct(var3, 1, var4, var0, var1, var2, 1292954189 * var9.ae, var9.bh, (iv)null);
                     }

                     var6.at(var0, var1, var2, var17, (iv)var23, (iv)null, cd.as[var4], 0, var20, var22);
                     if (var9.bo) {
                        if (var8 >= 480760824) {
                           throw new IllegalStateException();
                        }

                        if (var4 == 0) {
                           if (var8 >= 480760824) {
                              throw new IllegalStateException();
                           }

                           cd.al[var0][var1][var2 + 1] = 50;
                        } else if (1 == var4) {
                           if (var8 >= 480760824) {
                              throw new IllegalStateException();
                           }

                           cd.al[var0][var1 + 1][1 + var2] = 50;
                        } else if (2 == var4) {
                           if (var8 >= 480760824) {
                              return;
                           }

                           cd.al[var0][var1 + 1][var2] = 50;
                        } else if (var4 == 3) {
                           cd.al[var0][var1][var2] = 50;
                        }
                     }

                     if (-973955889 * var9.am != 0) {
                        if (var8 >= 480760824) {
                           return;
                        }

                        if (var7 != null) {
                           if (var8 >= 480760824) {
                              throw new IllegalStateException();
                           }

                           var7.an(var1, var2, var5, var4, var9.as, -2067452311);
                        }
                     }

                     return;
                  }

                  int var30;
                  if (var5 == 2) {
                     if (var8 >= 480760824) {
                        throw new IllegalStateException();
                     }

                     Object var32;
                     Object var33;
                     label751: {
                        var30 = 1 + var4 & 3;
                        if (1292954189 * var9.ae == -1) {
                           if (var8 >= 480760824) {
                              throw new IllegalStateException();
                           }

                           if (null == var9.bu) {
                              if (var8 >= 480760824) {
                                 throw new IllegalStateException();
                              }

                              var33 = var9.al(2, var4 + 4, var16, var18, var17, var19, (byte)-33);
                              var32 = var9.al(2, var30, var16, var18, var17, var19, (byte)-89);
                              break label751;
                           }
                        }

                        var33 = new ct(var3, 2, 4 + var4, var0, var1, var2, var9.ae * 1292954189, var9.bh, (iv)null);
                        var32 = new ct(var3, 2, var30, var0, var1, var2, 1292954189 * var9.ae, var9.bh, (iv)null);
                     }

                     var6.at(var0, var1, var2, var17, (iv)var33, (iv)var32, cd.am[var4], cd.am[var30], var20, var22);
                     if (var9.ad) {
                        if (var8 >= 480760824) {
                           throw new IllegalStateException();
                        }

                        if (var4 == 0) {
                           if (var8 >= 480760824) {
                              throw new IllegalStateException();
                           }

                           var10000 = ge.ag[var0][var1];
                           var10000[var2] |= 585;
                           var10000 = ge.ag[var0][var1];
                           var10000[var2 + 1] |= 1170;
                        } else if (1 == var4) {
                           if (var8 >= 480760824) {
                              throw new IllegalStateException();
                           }

                           var10000 = ge.ag[var0][var1];
                           var10000[1 + var2] |= 1170;
                           var10000 = ge.ag[var0][1 + var1];
                           var10000[var2] |= 585;
                        } else if (var4 == 2) {
                           var10000 = ge.ag[var0][var1 + 1];
                           var10000[var2] |= 585;
                           var10000 = ge.ag[var0][var1];
                           var10000[var2] |= 1170;
                        } else if (var4 == 3) {
                           if (var8 >= 480760824) {
                              throw new IllegalStateException();
                           }

                           var10000 = ge.ag[var0][var1];
                           var10000[var2] |= 1170;
                           var10000 = ge.ag[var0][var1];
                           var10000[var2] |= 585;
                        }
                     }

                     if (var9.am * -973955889 != 0) {
                        if (var8 >= 480760824) {
                           throw new IllegalStateException();
                        }

                        if (null != var7) {
                           if (var8 >= 480760824) {
                              return;
                           }

                           var7.an(var1, var2, var5, var4, var9.as, -2067452311);
                        }
                     }

                     if (16 != var9.ap * -89408815) {
                        if (var8 >= 480760824) {
                           throw new IllegalStateException();
                        }

                        var6.av(var0, var1, var2, var9.ap * -89408815);
                     }

                     return;
                  }

                  if (var5 == 3) {
                     if (var8 >= 480760824) {
                        throw new IllegalStateException();
                     }

                     label760: {
                        if (-1 == 1292954189 * var9.ae) {
                           if (var8 >= 480760824) {
                              throw new IllegalStateException();
                           }

                           if (var9.bu == null) {
                              var23 = var9.al(3, var4, var16, var18, var17, var19, (byte)-78);
                              break label760;
                           }
                        }

                        var23 = new ct(var3, 3, var4, var0, var1, var2, var9.ae * 1292954189, var9.bh, (iv)null);
                     }

                     var6.at(var0, var1, var2, var17, (iv)var23, (iv)null, cd.as[var4], 0, var20, var22);
                     if (var9.bo) {
                        if (var8 >= 480760824) {
                           return;
                        }

                        if (0 == var4) {
                           if (var8 >= 480760824) {
                              throw new IllegalStateException();
                           }

                           cd.al[var0][var1][1 + var2] = 50;
                        } else if (1 == var4) {
                           if (var8 >= 480760824) {
                              throw new IllegalStateException();
                           }

                           cd.al[var0][var1 + 1][var2 + 1] = 50;
                        } else if (2 == var4) {
                           if (var8 >= 480760824) {
                              throw new IllegalStateException();
                           }

                           cd.al[var0][var1 + 1][var2] = 50;
                        } else if (var4 == 3) {
                           if (var8 >= 480760824) {
                              throw new IllegalStateException();
                           }

                           cd.al[var0][var1][var2] = 50;
                        }
                     }

                     if (0 != var9.am * -973955889) {
                        if (var8 >= 480760824) {
                           throw new IllegalStateException();
                        }

                        if (null != var7) {
                           var7.an(var1, var2, var5, var4, var9.as, -2067452311);
                        }
                     }

                     return;
                  }

                  if (9 == var5) {
                     label769: {
                        if (-1 == var9.ae * 1292954189) {
                           if (var8 >= 480760824) {
                              throw new IllegalStateException();
                           }

                           if (var9.bu == null) {
                              if (var8 >= 480760824) {
                                 return;
                              }

                              var23 = var9.al(var5, var4, var16, var18, var17, var19, (byte)-96);
                              break label769;
                           }
                        }

                        var23 = new ct(var3, var5, var4, var0, var1, var2, 1292954189 * var9.ae, var9.bh, (iv)null);
                     }

                     var6.ay(var0, var1, var2, var17, 1, 1, (iv)var23, 0, var20, var22);
                     if (var9.am * -973955889 != 0) {
                        if (var8 >= 480760824) {
                           throw new IllegalStateException();
                        }

                        if (var7 != null) {
                           if (var8 >= 480760824) {
                              return;
                           }

                           var7.aw(var1, var2, var10, var11, var9.as, (byte)-70);
                        }
                     }

                     if (-89408815 * var9.ap != 16) {
                        if (var8 >= 480760824) {
                           return;
                        }

                        var6.av(var0, var1, var2, -89408815 * var9.ap);
                     }

                     return;
                  }

                  if (var5 == 4) {
                     if (var8 >= 480760824) {
                        throw new IllegalStateException();
                     }

                     label777: {
                        if (1292954189 * var9.ae == -1) {
                           if (var8 >= 480760824) {
                              throw new IllegalStateException();
                           }

                           if (null == var9.bu) {
                              if (var8 >= 480760824) {
                                 throw new IllegalStateException();
                              }

                              var23 = var9.al(4, var4, var16, var18, var17, var19, (byte)-85);
                              break label777;
                           }
                        }

                        var23 = new ct(var3, 4, var4, var0, var1, var2, var9.ae * 1292954189, var9.bh, (iv)null);
                     }

                     var6.aa(var0, var1, var2, var17, (iv)var23, (iv)null, cd.am[var4], 0, 0, 0, var20, var22);
                     return;
                  }

                  long var31;
                  Object var34;
                  if (5 == var5) {
                     if (var8 >= 480760824) {
                        throw new IllegalStateException();
                     }

                     var30 = 16;
                     var31 = var6.by(var0, var1, var2);
                     if (0L != var31) {
                        var30 = fw.an(di.at(var31), (short)6583).ap * -89408815;
                     }

                     label786: {
                        if (var9.ae * 1292954189 == -1) {
                           if (var8 >= 480760824) {
                              return;
                           }

                           if (null == var9.bu) {
                              if (var8 >= 480760824) {
                                 throw new IllegalStateException();
                              }

                              var34 = var9.al(4, var4, var16, var18, var17, var19, (byte)-90);
                              break label786;
                           }
                        }

                        var34 = new ct(var3, 4, var4, var0, var1, var2, var9.ae * 1292954189, var9.bh, (iv)null);
                     }

                     var6.aa(var0, var1, var2, var17, (iv)var34, (iv)null, cd.am[var4], 0, cd.aj[var4] * var30, var30 * cd.ak[var4], var20, var22);
                     return;
                  }

                  if (var5 == 6) {
                     if (var8 >= 480760824) {
                        return;
                     }

                     var30 = 8;
                     var31 = var6.by(var0, var1, var2);
                     if (0L != var31) {
                        if (var8 >= 480760824) {
                           throw new IllegalStateException();
                        }

                        var30 = fw.an(di.at(var31), (short)22010).ap * -89408815 / 2;
                     }

                     if (-1 == 1292954189 * var9.ae && null == var9.bu) {
                        if (var8 >= 480760824) {
                           throw new IllegalStateException();
                        }

                        var34 = var9.al(4, 4 + var4, var16, var18, var17, var19, (byte)-95);
                     } else {
                        var34 = new ct(var3, 4, 4 + var4, var0, var1, var2, var9.ae * 1292954189, var9.bh, (iv)null);
                     }

                     var6.aa(var0, var1, var2, var17, (iv)var34, (iv)null, 256, var4, cd.az[var4] * var30, var30 * cd.ad[var4], var20, var22);
                     return;
                  }

                  if (var5 == 7) {
                     if (var8 >= 480760824) {
                        throw new IllegalStateException();
                     }

                     label807: {
                        var24 = 2 + var4 & 3;
                        if (var9.ae * 1292954189 == -1) {
                           if (var8 >= 480760824) {
                              throw new IllegalStateException();
                           }

                           if (var9.bu == null) {
                              if (var8 >= 480760824) {
                                 return;
                              }

                              var23 = var9.al(4, 4 + var24, var16, var18, var17, var19, (byte)-87);
                              break label807;
                           }
                        }

                        var23 = new ct(var3, 4, var24 + 4, var0, var1, var2, 1292954189 * var9.ae, var9.bh, (iv)null);
                     }

                     var6.aa(var0, var1, var2, var17, (iv)var23, (iv)null, 256, var24, 0, 0, var20, var22);
                     return;
                  }

                  if (8 == var5) {
                     var30 = 8;
                     var31 = var6.by(var0, var1, var2);
                     if (0L != var31) {
                        if (var8 >= 480760824) {
                           throw new IllegalStateException();
                        }

                        var30 = fw.an(di.at(var31), (short)22609).ap * -89408815 / 2;
                     }

                     Object var27;
                     label816: {
                        int var28 = 2 + var4 & 3;
                        if (var9.ae * 1292954189 == -1) {
                           if (var8 >= 480760824) {
                              throw new IllegalStateException();
                           }

                           if (null == var9.bu) {
                              var34 = var9.al(4, var4 + 4, var16, var18, var17, var19, (byte)-28);
                              var27 = var9.al(4, 4 + var28, var16, var18, var17, var19, (byte)-104);
                              break label816;
                           }
                        }

                        var34 = new ct(var3, 4, var4 + 4, var0, var1, var2, 1292954189 * var9.ae, var9.bh, (iv)null);
                        var27 = new ct(var3, 4, var28 + 4, var0, var1, var2, var9.ae * 1292954189, var9.bh, (iv)null);
                     }

                     var6.aa(var0, var1, var2, var17, (iv)var34, (iv)var27, 256, var4, cd.az[var4] * var30, var30 * cd.ad[var4], var20, var22);
                     return;
                  }

                  return;
               }

               if (var8 >= 480760824) {
                  throw new IllegalStateException();
               }
            }

            label847: {
               if (-1 == var9.ae * 1292954189) {
                  if (var8 >= 480760824) {
                     throw new IllegalStateException();
                  }

                  if (var9.bu == null) {
                     if (var8 >= 480760824) {
                        throw new IllegalStateException();
                     }

                     var23 = var9.al(10, var4, var16, var18, var17, var19, (byte)-73);
                     break label847;
                  }
               }

               var23 = new ct(var3, 10, var4, var0, var1, var2, var9.ae * 1292954189, var9.bh, (iv)null);
            }

            if (null != var23) {
               short var10008;
               if (11 == var5) {
                  if (var8 >= 480760824) {
                     throw new IllegalStateException();
                  }

                  var10008 = 256;
               } else {
                  var10008 = 0;
               }

               if (var6.ay(var0, var1, var2, var17, var10, var11, (iv)var23, var10008, var20, var22) && var9.bo) {
                  var24 = 15;
                  if (var23 instanceof it) {
                     var24 = ((it)var23).ah() / 4;
                     if (var24 > 30) {
                        if (var8 >= 480760824) {
                           throw new IllegalStateException();
                        }

                        var24 = 30;
                     }
                  }

                  for(int var25 = 0; var25 <= var10; ++var25) {
                     if (var8 >= 480760824) {
                        throw new IllegalStateException();
                     }

                     for(int var26 = 0; var26 <= var11; ++var26) {
                        if (var8 >= 480760824) {
                           throw new IllegalStateException();
                        }

                        if (var24 > cd.al[var0][var1 + var25][var2 + var26]) {
                           if (var8 >= 480760824) {
                              throw new IllegalStateException();
                           }

                           cd.al[var0][var1 + var25][var26 + var2] = (byte)var24;
                        }
                     }
                  }
               }
            }

            if (0 != var9.am * -973955889 && var7 != null) {
               if (var8 >= 480760824) {
                  throw new IllegalStateException();
               }

               var7.aw(var1, var2, var10, var11, var9.as, (byte)-64);
            }

         }
      } catch (RuntimeException var29) {
         throw db.an(var29, "hy.ay(" + ')');
      }
   }

   public void ai(byte var1) {
      try {
         this.aq = this.at * -1092387907;
         this.at = this.al * -206073161;
         this.ac = 0;
         this.ab = 0;
         Arrays.fill(this.ay, false);
         Arrays.fill(this.ao, false);
      } catch (RuntimeException var2) {
         throw db.an(var2, "hy.ai(" + ')');
      }
   }

   public int[] as(int var1) {
      try {
         int[] var2 = new int[2082731989 * this.ab];

         for(int var3 = 0; var3 < this.ab * 2082731989; ++var3) {
            if (var1 <= -84614457) {
               throw new IllegalStateException();
            }

            var2[var3] = this.au[var3];
         }

         return var2;
      } catch (RuntimeException var4) {
         throw db.an(var4, "hy.as(" + ')');
      }
   }

   public boolean ah(int var1, byte var2) {
      try {
         if (var1 >= 0) {
            if (var2 <= 0) {
               throw new IllegalStateException();
            }

            if (var1 < 112) {
               return this.ay[var1];
            }

            if (var2 <= 0) {
               throw new IllegalStateException();
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw db.an(var3, "hy.ah(" + ')');
      }
   }

   public final boolean ag(int var1) {
      try {
         if (-147657295 * this.at == this.aq * 73809669) {
            if (var1 <= 289925105) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            this.ai = -2050262723 * this.an[73809669 * this.aq];
            this.ax = this.af[73809669 * this.aq];
            this.aq = -1675774515 * (1 + 73809669 * this.aq & 127);
            return true;
         }
      } catch (RuntimeException var2) {
         throw db.an(var2, "hy.ag(" + ')');
      }
   }

   public int[] am(int var1) {
      try {
         int[] var2 = new int[this.ac * 1888573011];

         for(int var3 = 0; var3 < 1888573011 * this.ac; ++var3) {
            if (var1 <= 1199226105) {
               throw new IllegalStateException();
            }

            var2[var3] = this.aw[var3];
         }

         return var2;
      } catch (RuntimeException var4) {
         throw db.an(var4, "hy.am(" + ')');
      }
   }

   public boolean an(int var1, int var2) {
      try {
         this.aa[var1] = false;
         this.ay[var1] = false;
         this.ao[var1] = true;
         this.au[(this.ab += -971798147) * 2082731989 - 1] = var1;
         return true;
      } catch (RuntimeException var3) {
         throw db.an(var3, "hy.an(" + ')');
      }
   }

   public boolean ab(int var1) {
      this.ax(var1, (byte)-62);
      this.aa[var1] = true;
      this.ay[var1] = true;
      this.ao[var1] = false;
      this.aw[(this.ac += -1818927653) * 1888573011 - 1] = var1;
      return true;
   }

   public int[] bo() {
      int[] var1 = new int[this.ac * 1888573011];

      for(int var2 = 0; var2 < 1888573011 * this.ac; ++var2) {
         var1[var2] = this.aw[var2];
      }

      return var1;
   }

   public boolean aq(int var1) {
      this.aa[var1] = false;
      this.ay[var1] = false;
      this.ao[var1] = true;
      this.au[(this.ab += -971798147) * 2082731989 - 1] = var1;
      return true;
   }

   public boolean al(char var1) {
      int var2 = 1 + this.al * -1384260729 & 127;
      if (var2 != this.aq * 1388150079) {
         this.an[-1203777774 * this.al] = -1;
         this.af[-1384260729 * this.al] = var1;
         this.al = -1314924538 * var2;
      }

      return false;
   }

   public boolean at(char var1) {
      int var2 = 1 + this.al * -1384260729 & 127;
      if (var2 != this.aq * 73809669) {
         this.an[-1384260729 * this.al] = -1;
         this.af[-1384260729 * this.al] = var1;
         this.al = -1899169225 * var2;
      }

      return false;
   }

   public boolean aa(boolean var1) {
      return false;
   }

   public boolean ac(boolean var1, byte var2) {
      try {
         return false;
      } catch (RuntimeException var3) {
         throw db.an(var3, "hy.ac(" + ')');
      }
   }

   public boolean ao(boolean var1) {
      return false;
   }

   public final boolean ap() {
      if (-147657295 * this.at == this.aq * 73809669) {
         return false;
      } else {
         this.ai = -2050262723 * this.an[73809669 * this.aq];
         this.ax = this.af[73809669 * this.aq];
         this.aq = -1675774515 * (1 + 73809669 * this.aq & 127);
         return true;
      }
   }

   public boolean au(int var1) {
      this.ax(var1, (byte)-128);
      this.aa[var1] = true;
      this.ay[var1] = true;
      this.ao[var1] = false;
      this.aw[(this.ac += -1818927653) * 1744372969 - 1] = var1;
      return true;
   }

   public void az() {
      this.aq = this.at * -1092387907;
      this.at = this.al * -206073161;
      this.ac = 0;
      this.ab = 0;
      Arrays.fill(this.ay, false);
      Arrays.fill(this.ao, false);
   }

   public boolean av(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 >= 1163786688) {
               throw new IllegalStateException();
            }

            if (var1 < 112) {
               return this.aa[var1];
            }

            if (var2 >= 1163786688) {
               throw new IllegalStateException();
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw db.an(var3, "hy.av(" + ')');
      }
   }

   public final boolean ae() {
      if (-147657295 * this.at == this.aq * 73809669) {
         return false;
      } else {
         this.ai = -2050262723 * this.an[73809669 * this.aq];
         this.ax = this.af[73809669 * this.aq];
         this.aq = -1675774515 * (1 + 73809669 * this.aq & 127);
         return true;
      }
   }

   public boolean ar(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var1 < 112) {
               return this.ao[var1];
            }

            if (var2 != 1556637445) {
               throw new IllegalStateException();
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw db.an(var3, "hy.ar(" + ')');
      }
   }

   public boolean by(int var1) {
      return var1 >= 0 && var1 < 112 ? this.ay[var1] : false;
   }

   public boolean bb(int var1) {
      return var1 >= 0 && var1 < 112 ? this.ay[var1] : false;
   }

   public boolean aw(char var1, int var2) {
      try {
         int var3 = 1 + this.al * -1384260729 & 127;
         if (var3 != this.aq * 73809669) {
            if (var2 >= -592927922) {
               throw new IllegalStateException();
            }

            this.an[-1384260729 * this.al] = -1;
            this.af[-1384260729 * this.al] = var1;
            this.al = -1899169225 * var3;
         }

         return false;
      } catch (RuntimeException var4) {
         throw db.an(var4, "hy.aw(" + ')');
      }
   }

   public boolean be(int var1) {
      return var1 >= 0 && var1 < -655682410 ? this.ao[var1] : false;
   }

   public boolean bk(int var1) {
      return var1 >= 0 && var1 < 112 ? this.ao[var1] : false;
   }

   public final boolean ad() {
      if (-147657295 * this.at == this.aq * 73809669) {
         return false;
      } else {
         this.ai = -2050262723 * this.an[73809669 * this.aq];
         this.ax = this.af[73809669 * this.aq];
         this.aq = -1675774515 * (1 + 73809669 * this.aq & 127);
         return true;
      }
   }

   public void ak() {
      this.aq = this.at * 56532349;
      this.at = this.al * 1600354243;
      this.ac = 0;
      this.ab = 0;
      Arrays.fill(this.ay, false);
      Arrays.fill(this.ao, false);
   }

   public int[] bz() {
      int[] var1 = new int[this.ac * 588071049];

      for(int var2 = 0; var2 < -739232436 * this.ac; ++var2) {
         var1[var2] = this.aw[var2];
      }

      return var1;
   }

   public int[] bm() {
      int[] var1 = new int[2082731989 * this.ab];

      for(int var2 = 0; var2 < this.ab * 2082731989; ++var2) {
         var1[var2] = this.au[var2];
      }

      return var1;
   }

   public int[] bd() {
      int[] var1 = new int[2082731989 * this.ab];

      for(int var2 = 0; var2 < this.ab * 2082731989; ++var2) {
         var1[var2] = this.au[var2];
      }

      return var1;
   }

   static final void bb(bp var0, int var1) {
      try {
         var0.am = false;
         if (null != var0.ar) {
            if (var1 <= -1089860964) {
               throw new IllegalStateException();
            }

            var0.ar.ab = 0;
         }

         for(bp var2 = var0.ab(); var2 != null; var2 = var0.aq()) {
            if (var1 <= -1089860964) {
               throw new IllegalStateException();
            }

            bb(var2, 401365532);
         }

      } catch (RuntimeException var3) {
         throw db.an(var3, "hy.bb(" + ')');
      }
   }

   void aj(int var1) {
      int var2 = -1384260729 * this.al + 1 & 820075166;
      if (var2 != 73809669 * this.aq) {
         this.an[this.al * -1384260729] = var1;
         this.af[-1384260729 * this.al] = 0;
         this.al = var2 * -2000372304;
      }

   }

   static final void in(int var0) {
      try {
         int var1 = -2010934433 * ds.ab;
         int[] var2 = ds.aq;

         for(int var3 = 0; var3 < var1; ++var3) {
            if (var0 >= -964267539) {
               return;
            }

            dv var4 = client.mc[var2[var3]];
            if (var4 != null) {
               if (var0 >= -964267539) {
                  throw new IllegalStateException();
               }

               bj.ii(var4, 1, (byte)-110);
            }
         }

      } catch (RuntimeException var5) {
         throw db.an(var5, "hy.in(" + ')');
      }
   }
}
