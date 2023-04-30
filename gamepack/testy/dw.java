import accessors.RSArchiveLoader;

public class dw implements RSArchiveLoader {
   static final int af = 10000;
   final nd an;
   final int aw;
   int ac;
   static int nc;
   public static final int bb = 26;

   boolean aw() {
      this.ac = 0;

      for(int var1 = 0; var1 < 412842149 * this.aw; ++var1) {
         if (!this.an.ao(var1, -1436580108) || this.an.ay(var1, 1429785421)) {
            this.ac += -1346987550;
         }
      }

      return -1464399353 * this.ac >= this.aw * -844373525;
   }

   boolean af(byte var1) {
      try {
         this.ac = 0;

         for(int var2 = 0; var2 < -17715959 * this.aw; ++var2) {
            if (var1 <= 15) {
               throw new IllegalStateException();
            }

            if (this.an.ao(var2, -2043627121)) {
               if (var1 <= 15) {
                  throw new IllegalStateException();
               }

               if (!this.an.ay(var2, 1783984529)) {
                  continue;
               }
            }

            this.ac += 1412973495;
         }

         boolean var10000;
         if (-1464399353 * this.ac >= this.aw * -17715959) {
            if (var1 <= 15) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw db.an(var3, "dw.af(" + ')');
      }
   }

   boolean an() {
      this.ac = 0;

      for(int var1 = 0; var1 < -17715959 * this.aw; ++var1) {
         if (!this.an.ao(var1, -2128515684) || this.an.ay(var1, 1341239113)) {
            this.ac += -1804674373;
         }
      }

      return -1464399353 * this.ac >= this.aw * -17715959;
   }

   static final int lx(mq var0, int var1, int var2) {
      try {
         if (var0.gc != null) {
            if (var2 != 1696113134) {
               throw new IllegalStateException();
            }

            if (var1 < var0.gc.length) {
               try {
                  int[] var3 = var0.gc[var1];
                  int var4 = 0;
                  int var5 = 0;
                  byte var6 = 0;

                  while(true) {
                     int var7 = var3[var5++];
                     int var8 = 0;
                     byte var9 = 0;
                     if (0 == var7) {
                        if (var2 != 1696113134) {
                           throw new IllegalStateException();
                        }

                        return var4;
                     }

                     if (1 == var7) {
                        var8 = client.ng[var3[var5++]];
                     }

                     if (2 == var7) {
                        if (var2 != 1696113134) {
                           throw new IllegalStateException();
                        }

                        var8 = client.ny[var3[var5++]];
                     }

                     if (3 == var7) {
                        if (var2 != 1696113134) {
                           throw new IllegalStateException();
                        }

                        var8 = client.nu[var3[var5++]];
                     }

                     int var10;
                     mq var11;
                     int var12;
                     int var13;
                     if (4 == var7) {
                        if (var2 != 1696113134) {
                           throw new IllegalStateException();
                        }

                        var10 = var3[var5++] << 16;
                        var10 += var3[var5++];
                        var11 = gh.an(var10, (byte)5);
                        var12 = var3[var5++];
                        if (var12 != -1) {
                           label322: {
                              if (var2 != 1696113134) {
                                 throw new IllegalStateException();
                              }

                              if (dh.af(var12, (byte)22).bz) {
                                 if (!client.ca) {
                                    break label322;
                                 }

                                 if (var2 != 1696113134) {
                                    throw new IllegalStateException();
                                 }
                              }

                              for(var13 = 0; var13 < var11.gb.length; ++var13) {
                                 if (var2 != 1696113134) {
                                    throw new IllegalStateException();
                                 }

                                 if (var11.gb[var13] == var12 + 1) {
                                    var8 += var11.gp[var13];
                                 }
                              }
                           }
                        }
                     }

                     if (var7 == 5) {
                        if (var2 != 1696113134) {
                           throw new IllegalStateException();
                        }

                        var8 = le.aw[var3[var5++]];
                     }

                     if (6 == var7) {
                        if (var2 != 1696113134) {
                           throw new IllegalStateException();
                        }

                        var8 = mh.aw[client.ny[var3[var5++]] - 1];
                     }

                     if (var7 == 7) {
                        var8 = le.aw[var3[var5++]] * 100 / '뜛';
                     }

                     if (8 == var7) {
                        var8 = 1302967875 * lq.mi.al;
                     }

                     if (9 == var7) {
                        if (var2 != 1696113134) {
                           throw new IllegalStateException();
                        }

                        for(var10 = 0; var10 < 25; ++var10) {
                           if (var2 != 1696113134) {
                              throw new IllegalStateException();
                           }

                           if (mh.an[var10]) {
                              if (var2 != 1696113134) {
                                 throw new IllegalStateException();
                              }

                              var8 += client.ny[var10];
                           }
                        }
                     }

                     if (10 == var7) {
                        if (var2 != 1696113134) {
                           throw new IllegalStateException();
                        }

                        var10 = var3[var5++] << 16;
                        var10 += var3[var5++];
                        var11 = gh.an(var10, (byte)5);
                        var12 = var3[var5++];
                        if (-1 != var12) {
                           label326: {
                              if (var2 != 1696113134) {
                                 throw new IllegalStateException();
                              }

                              if (dh.af(var12, (byte)46).bz) {
                                 if (var2 != 1696113134) {
                                    throw new IllegalStateException();
                                 }

                                 if (!client.ca) {
                                    break label326;
                                 }

                                 if (var2 != 1696113134) {
                                    throw new IllegalStateException();
                                 }
                              }

                              for(var13 = 0; var13 < var11.gb.length; ++var13) {
                                 if (var11.gb[var13] == var12 + 1) {
                                    var8 = 999999999;
                                    break;
                                 }
                              }
                           }
                        }
                     }

                     if (var7 == 11) {
                        var8 = -365416549 * client.pk;
                     }

                     if (12 == var7) {
                        if (var2 != 1696113134) {
                           throw new IllegalStateException();
                        }

                        var8 = client.pj * -1940722149;
                     }

                     if (13 == var7) {
                        var10 = le.aw[var3[var5++]];
                        int var16 = var3[var5++];
                        byte var10000;
                        if ((var10 & 1 << var16) != 0) {
                           if (var2 != 1696113134) {
                              throw new IllegalStateException();
                           }

                           var10000 = 1;
                        } else {
                           var10000 = 0;
                        }

                        var8 = var10000;
                     }

                     if (var7 == 14) {
                        if (var2 != 1696113134) {
                           throw new IllegalStateException();
                        }

                        var10 = var3[var5++];
                        var8 = jy.af(var10, 1353386129);
                     }

                     if (15 == var7) {
                        if (var2 != 1696113134) {
                           throw new IllegalStateException();
                        }

                        var9 = 1;
                     }

                     if (var7 == 16) {
                        if (var2 != 1696113134) {
                           throw new IllegalStateException();
                        }

                        var9 = 2;
                     }

                     if (17 == var7) {
                        if (var2 != 1696113134) {
                           throw new IllegalStateException();
                        }

                        var9 = 3;
                     }

                     if (var7 == 18) {
                        if (var2 != 1696113134) {
                           throw new IllegalStateException();
                        }

                        var8 = -1232093375 * jm.ib + (lq.mi.bx * 1144428983 >> 7);
                     }

                     if (19 == var7) {
                        var8 = jj.jc * 827352769 + (-411750205 * lq.mi.bo >> 7);
                     }

                     if (20 == var7) {
                        if (var2 != 1696113134) {
                           throw new IllegalStateException();
                        }

                        var8 = var3[var5++];
                     }

                     if (0 == var9) {
                        if (var6 == 0) {
                           var4 += var8;
                        }

                        if (1 == var6) {
                           if (var2 != 1696113134) {
                              throw new IllegalStateException();
                           }

                           var4 -= var8;
                        }

                        if (2 == var6) {
                           if (var2 != 1696113134) {
                              throw new IllegalStateException();
                           }

                           if (0 != var8) {
                              if (var2 != 1696113134) {
                                 throw new IllegalStateException();
                              }

                              var4 /= var8;
                           }
                        }

                        if (var6 == 3) {
                           if (var2 != 1696113134) {
                              throw new IllegalStateException();
                           }

                           var4 *= var8;
                        }

                        var6 = 0;
                     } else {
                        var6 = var9;
                     }
                  }
               } catch (Exception var14) {
                  return -1;
               }
            }

            if (var2 != 1696113134) {
               throw new IllegalStateException();
            }
         }

         return -2;
      } catch (RuntimeException var15) {
         throw db.an(var15, "dw.lx(" + ')');
      }
   }

   boolean ac() {
      this.ac = 0;

      for(int var1 = 0; var1 < -17715959 * this.aw; ++var1) {
         if (!this.an.ao(var1, -2132309312) || this.an.ay(var1, 1105401917)) {
            this.ac += 1412973495;
         }
      }

      return -1464399353 * this.ac >= this.aw * -17715959;
   }

   dw(nd var1, String var2) {
      try {
         super();
         this.ac = 0;
         this.an = var1;
         this.aw = var1.cm(608624390) * -1548488391;
      } catch (RuntimeException var3) {
         throw db.an(var3, "dw.<init>(" + ')');
      }
   }
}
