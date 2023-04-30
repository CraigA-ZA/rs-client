import accessors.RSDecimator;

public class cc implements RSDecimator {
   static final int cc = 71;
   static final int af = 14;
   static final int an = 7;
   int au;
   static final int aw = 6;
   int ac;
   static final int bq = 1007;
   static final int bn = 58;
   public static final int bm = 55;
   int[][] ab;

   static final void kq(dv var0, int var1, int var2, iu var3, int var4) {
      try {
         int var5 = var0.dy[0];
         int var6 = var0.ds[0];
         int var7 = var0.ah((byte)-116);
         if (var5 >= var7) {
            if (var4 != -1796483670) {
               throw new IllegalStateException();
            }

            if (var5 < 104 - var7) {
               if (var4 != -1796483670) {
                  throw new IllegalStateException();
               }

               if (var6 >= var7) {
                  if (var4 != -1796483670) {
                     throw new IllegalStateException();
                  }

                  if (var6 < 104 - var7) {
                     if (var1 >= var7) {
                        if (var4 != -1796483670) {
                           return;
                        }

                        if (var1 < 104 - var7) {
                           if (var4 != -1796483670) {
                              throw new IllegalStateException();
                           }

                           if (var2 >= var7) {
                              if (var4 != -1796483670) {
                                 throw new IllegalStateException();
                              }

                              if (var2 < 104 - var7) {
                                 int var10 = var0.ah((byte)-96);
                                 client.xr.af = -1369677151 * var1;
                                 client.xr.an = -2066887785 * var2;
                                 client.xr.aw = -2134236799;
                                 client.xr.ac = -1188140267;
                                 cm var11 = client.xr;
                                 int var12 = fw.af(var5, var6, var10, var11, client.jr[-1900490645 * var0.ad], true, client.xm, client.xn, 1716451155);
                                 if (var12 < 1) {
                                    if (var4 != -1796483670) {
                                       throw new IllegalStateException();
                                    }

                                    return;
                                 }

                                 for(int var13 = 0; var13 < var12 - 1; ++var13) {
                                    if (var4 != -1796483670) {
                                       throw new IllegalStateException();
                                    }

                                    var0.am(client.xm[var13], client.xn[var13], var3, 475560620);
                                 }

                                 return;
                              }

                              if (var4 != -1796483670) {
                                 throw new IllegalStateException();
                              }
                           }
                        }
                     }

                     return;
                  }
               }
            }
         }

      } catch (RuntimeException var14) {
         throw db.an(var14, "cc.kq(" + ')');
      }
   }

   byte[] af(byte[] var1, int var2) {
      try {
         if (this.ab != null) {
            if (var2 != 33076536) {
               throw new IllegalStateException();
            }

            int var3 = (int)((long)(this.au * -2101247493) * (long)var1.length / (long)(2021266139 * this.ac)) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;

            int var7;
            int var8;
            for(var7 = 0; var7 < var1.length; ++var7) {
               if (var2 != 33076536) {
                  throw new IllegalStateException();
               }

               var8 = var1[var7];
               int[] var9 = this.ab[var6];

               int var10;
               for(var10 = 0; var10 < 14; ++var10) {
                  if (var2 != 33076536) {
                     throw new IllegalStateException();
                  }

                  var4[var5 + var10] += var9[var10] * var8;
               }

               var6 += -2101247493 * this.au;
               var10 = var6 / (2021266139 * this.ac);
               var5 += var10;
               var6 -= var10 * 2021266139 * this.ac;
            }

            var1 = new byte[var3];

            for(var7 = 0; var7 < var3; ++var7) {
               if (var2 != 33076536) {
                  throw new IllegalStateException();
               }

               var8 = '耀' + var4[var7] >> 16;
               if (var8 < -128) {
                  if (var2 != 33076536) {
                     throw new IllegalStateException();
                  }

                  var1[var7] = -128;
               } else if (var8 > 127) {
                  if (var2 != 33076536) {
                     throw new IllegalStateException();
                  }

                  var1[var7] = 127;
               } else {
                  var1[var7] = (byte)var8;
               }
            }
         }

         return var1;
      } catch (RuntimeException var11) {
         throw db.an(var11, "cc.af(" + ')');
      }
   }

   int an(int var1, byte var2) {
      try {
         if (this.ab != null) {
            if (var2 == 16) {
               throw new IllegalStateException();
            }

            var1 = (int)((long)var1 * (long)(this.au * -2101247493) / (long)(this.ac * 2021266139));
         }

         return var1;
      } catch (RuntimeException var3) {
         throw db.an(var3, "cc.an(" + ')');
      }
   }

   static void ai(on var0, on var1, byte var2) {
      try {
         int var5;
         int var6;
         if (null == st.dr) {
            nd var4 = rr.fv;
            tq[] var3;
            if (!var4.cv("sl_back", "", -1313069490)) {
               if (var2 >= 1) {
                  throw new IllegalStateException();
               }

               var3 = null;
            } else {
               var5 = var4.cy("sl_back", 2029828949);
               var6 = var4.cx(var5, "", (short)8192);
               var3 = eb.an(var4, var5, var6, 1271520368);
            }

            st.dr = var3;
         }

         if (null == av.dl) {
            av.dl = mz.ac(rr.fv, "sl_flags", "", 1567788624);
         }

         if (az.dk == null) {
            if (var2 >= 1) {
               throw new IllegalStateException();
            }

            az.dk = mz.ac(rr.fv, "sl_arrows", "", 2088277389);
         }

         if (cl.dt == null) {
            if (var2 >= 1) {
               return;
            }

            cl.dt = mz.ac(rr.fv, "sl_stars", "", -1730262222);
         }

         if (nz.dz == null) {
            nz.dz = lp.au(rr.fv, "leftarrow", "", -1123804584);
         }

         if (ai.dg == null) {
            if (var2 >= 1) {
               return;
            }

            ai.dg = lp.au(rr.fv, "rightarrow", "", -143232821);
         }

         th.em(cz.aw * 578342931, 23, 765, 480, 0);
         th.ew(578342931 * cz.aw, 0, 125, 23, 12425273, 9135624);
         th.ew(125 + cz.aw * 578342931, 0, 640, 23, 5197647, 2697513);
         var0.aj(mk.mo, cz.aw * 578342931 + 62, 15, 0, -1);
         if (null != cl.dt) {
            if (var2 >= 1) {
               throw new IllegalStateException();
            }

            cl.dt[1].aw(cz.aw * 578342931 + 140, 1);
            var1.ar(mk.mn, 578342931 * cz.aw + 152, 10, 16777215, -1);
            cl.dt[0].aw(cz.aw * 578342931 + 140, 12);
            var1.ar(mk.mi, 152 + cz.aw * 578342931, 21, 16777215, -1);
         }

         if (az.dk != null) {
            int var24;
            label543: {
               var24 = 578342931 * cz.aw + 280;
               if (cl.at[0] == 0) {
                  if (var2 >= 1) {
                     throw new IllegalStateException();
                  }

                  if (cl.al[0] == 0) {
                     if (var2 >= 1) {
                        return;
                     }

                     az.dk[2].aw(var24, 4);
                     break label543;
                  }
               }

               az.dk[0].aw(var24, 4);
            }

            label537: {
               if (cl.at[0] == 0) {
                  if (var2 >= 1) {
                     throw new IllegalStateException();
                  }

                  if (1 == cl.al[0]) {
                     if (var2 >= 1) {
                        throw new IllegalStateException();
                     }

                     az.dk[3].aw(15 + var24, 4);
                     break label537;
                  }
               }

               az.dk[1].aw(var24 + 15, 4);
            }

            int var26;
            label531: {
               var0.ar(mk.md, 32 + var24, 17, 16777215, -1);
               var26 = cz.aw * 578342931 + 390;
               if (1 == cl.at[0]) {
                  if (var2 >= 1) {
                     throw new IllegalStateException();
                  }

                  if (0 == cl.al[0]) {
                     if (var2 >= 1) {
                        throw new IllegalStateException();
                     }

                     az.dk[2].aw(var26, 4);
                     break label531;
                  }
               }

               az.dk[0].aw(var26, 4);
            }

            if (cl.at[0] == 1 && 1 == cl.al[0]) {
               if (var2 >= 1) {
                  throw new IllegalStateException();
               }

               az.dk[3].aw(15 + var26, 4);
            } else {
               az.dk[1].aw(var26 + 15, 4);
            }

            label520: {
               var0.ar(mk.mr, 32 + var26, 17, 16777215, -1);
               var5 = cz.aw * 578342931 + 500;
               if (2 == cl.at[0]) {
                  if (var2 >= 1) {
                     throw new IllegalStateException();
                  }

                  if (0 == cl.al[0]) {
                     if (var2 >= 1) {
                        throw new IllegalStateException();
                     }

                     az.dk[2].aw(var5, 4);
                     break label520;
                  }
               }

               az.dk[0].aw(var5, 4);
            }

            label514: {
               if (cl.at[0] == 2) {
                  if (var2 >= 1) {
                     return;
                  }

                  if (cl.al[0] == 1) {
                     if (var2 >= 1) {
                        throw new IllegalStateException();
                     }

                     az.dk[3].aw(var5 + 15, 4);
                     break label514;
                  }
               }

               az.dk[1].aw(15 + var5, 4);
            }

            label508: {
               var0.ar(mk.ml, 32 + var5, 17, 16777215, -1);
               var6 = cz.aw * 578342931 + 610;
               if (cl.at[0] == 3) {
                  if (var2 >= 1) {
                     return;
                  }

                  if (cl.al[0] == 0) {
                     if (var2 >= 1) {
                        throw new IllegalStateException();
                     }

                     az.dk[2].aw(var6, 4);
                     break label508;
                  }
               }

               az.dk[0].aw(var6, 4);
            }

            if (3 == cl.at[0] && 1 == cl.al[0]) {
               if (var2 >= 1) {
                  throw new IllegalStateException();
               }

               az.dk[3].aw(15 + var6, 4);
            } else {
               az.dk[1].aw(var6 + 15, 4);
            }

            var0.ar(mk.mf, var6 + 32, 17, 16777215, -1);
         }

         th.em(cz.aw * 578342931 + 708, 4, 50, 16, 0);
         var1.aj(mk.jl, 25 + 708 + cz.aw * 578342931, 16, 16777215, -1);
         cz.de = 848889613;
         if (st.dr != null) {
            byte var25 = 88;
            byte var27 = 19;
            var5 = 765 / (var25 + 1) - 1;
            var6 = 480 / (1 + var27);

            while(true) {
               int var7 = var6;
               int var8 = var5;
               if (var6 * (var5 - 1) >= -734287707 * cl.ab) {
                  if (var2 >= 1) {
                     throw new IllegalStateException();
                  }

                  --var5;
               }

               if (var5 * (var6 - 1) >= -734287707 * cl.ab) {
                  if (var2 >= 1) {
                     throw new IllegalStateException();
                  }

                  --var6;
               }

               if ((var6 - 1) * var5 >= cl.ab * -734287707) {
                  if (var2 >= 1) {
                     throw new IllegalStateException();
                  }

                  --var6;
               }

               if (var6 == var7) {
                  if (var2 >= 1) {
                     throw new IllegalStateException();
                  }

                  if (var8 == var5) {
                     if (var2 >= 1) {
                        return;
                     }

                     var7 = (765 - var25 * var5) / (var5 + 1);
                     if (var7 > 5) {
                        if (var2 >= 1) {
                           throw new IllegalStateException();
                        }

                        var7 = 5;
                     }

                     var8 = (480 - var6 * var27) / (var6 + 1);
                     if (var8 > 5) {
                        if (var2 >= 1) {
                           throw new IllegalStateException();
                        }

                        var8 = 5;
                     }

                     int var9 = (765 - var25 * var5 - var7 * (var5 - 1)) / 2;
                     int var10 = (480 - var27 * var6 - var8 * (var6 - 1)) / 2;
                     int var11 = (-734287707 * cl.ab + var6 - 1) / var6;
                     cz.dp = (var11 - var5) * 1853447421;
                     if (nz.dz != null) {
                        if (var2 >= 1) {
                           return;
                        }

                        if (cz.dh * 1246310743 > 0) {
                           if (var2 >= 1) {
                              throw new IllegalStateException();
                           }

                           nz.dz.aw(8, kd.ak * 1658005443 / 2 - nz.dz.ac / 2);
                        }
                     }

                     if (ai.dg != null) {
                        if (var2 >= 1) {
                           throw new IllegalStateException();
                        }

                        if (1246310743 * cz.dh < cz.dp * 1959698517) {
                           ai.dg.aw(bm.aj * -1687260435 - ai.dg.aw - 8, 1658005443 * kd.ak / 2 - ai.dg.ac / 2);
                        }
                     }

                     int var12 = var10 + 23;
                     int var13 = cz.aw * 578342931 + var9;
                     int var14 = 0;
                     boolean var15 = false;
                     int var16 = 1246310743 * cz.dh;

                     int var17;
                     for(var17 = var6 * var16; var17 < cl.ab * -734287707; ++var17) {
                        if (var2 >= 1) {
                           throw new IllegalStateException();
                        }

                        if (var16 - 1246310743 * cz.dh >= var5) {
                           if (var2 >= 1) {
                              throw new IllegalStateException();
                           }
                           break;
                        }

                        cl var18 = bx.au[var17];
                        boolean var19 = true;
                        String var20 = Integer.toString(-1396846889 * var18.ax);
                        if (-1 == -1396846889 * var18.ax) {
                           var20 = mk.my;
                           var19 = false;
                        } else if (var18.ax * -1396846889 > 1980) {
                           if (var2 >= 1) {
                              throw new IllegalStateException();
                           }

                           var20 = mk.mk;
                           var19 = false;
                        }

                        da var21 = null;
                        int var22 = 0;
                        da var10000;
                        if (var18.ag(578362576)) {
                           if (var2 >= 1) {
                              return;
                           }

                           if (var18.at(1029039210)) {
                              if (var2 >= 1) {
                                 throw new IllegalStateException();
                              }

                              var10000 = da.al;
                           } else {
                              var10000 = da.aq;
                           }

                           var21 = var10000;
                        } else if (var18.aa(-1583670467)) {
                           if (var18.at(1029039210)) {
                              if (var2 >= 1) {
                                 throw new IllegalStateException();
                              }

                              var10000 = da.ah;
                           } else {
                              var10000 = da.ag;
                           }

                           var21 = var10000;
                        } else if (var18.ai((byte)62)) {
                           if (var2 >= 1) {
                              throw new IllegalStateException();
                           }

                           var22 = 16711680;
                           if (var18.at(1029039210)) {
                              if (var2 >= 1) {
                                 throw new IllegalStateException();
                              }

                              var10000 = da.ab;
                           } else {
                              var10000 = da.au;
                           }

                           var21 = var10000;
                        } else if (var18.ah((byte)99)) {
                           if (var2 >= 1) {
                              throw new IllegalStateException();
                           }

                           var21 = var18.at(1029039210) ? da.aa : da.at;
                        } else if (var18.ao(1502648578)) {
                           if (var2 >= 1) {
                              throw new IllegalStateException();
                           }

                           if (var18.at(1029039210)) {
                              if (var2 >= 1) {
                                 throw new IllegalStateException();
                              }

                              var10000 = da.ac;
                           } else {
                              var10000 = da.aw;
                           }

                           var21 = var10000;
                        } else if (var18.av(-459773999)) {
                           if (var2 >= 1) {
                              throw new IllegalStateException();
                           }

                           if (var18.at(1029039210)) {
                              if (var2 >= 1) {
                                 throw new IllegalStateException();
                              }

                              var10000 = da.ao;
                           } else {
                              var10000 = da.ay;
                           }

                           var21 = var10000;
                        } else if (var18.ar((byte)116)) {
                           if (var18.at(1029039210)) {
                              if (var2 >= 1) {
                                 return;
                              }

                              var10000 = da.ai;
                           } else {
                              var10000 = da.ax;
                           }

                           var21 = var10000;
                        }

                        label568: {
                           if (null != var21) {
                              if (var2 >= 1) {
                                 throw new IllegalStateException();
                              }

                              if (var21.av * 1140778173 < st.dr.length) {
                                 break label568;
                              }

                              if (var2 >= 1) {
                                 throw new IllegalStateException();
                              }
                           }

                           if (var18.at(1029039210)) {
                              if (var2 >= 1) {
                                 throw new IllegalStateException();
                              }

                              var10000 = da.an;
                           } else {
                              var10000 = da.af;
                           }

                           var21 = var10000;
                        }

                        label472: {
                           if (bd.ay * -2063363905 >= var13) {
                              if (var2 >= 1) {
                                 return;
                              }

                              if (bd.ao * -1224153235 >= var12 && -2063363905 * bd.ay < var13 + var25) {
                                 if (var2 >= 1) {
                                    throw new IllegalStateException();
                                 }

                                 if (bd.ao * -1224153235 < var27 + var12) {
                                    if (var2 >= 1) {
                                       throw new IllegalStateException();
                                    }

                                    if (var19) {
                                       if (var2 >= 1) {
                                          throw new IllegalStateException();
                                       }

                                       cz.de = var17 * -848889613;
                                       st.dr[1140778173 * var21.av].av(var13, var12, 128, 16777215);
                                       var15 = true;
                                       break label472;
                                    }
                                 }
                              }
                           }

                           st.dr[1140778173 * var21.av].ay(var13, var12);
                        }

                        if (null != av.dl) {
                           if (var2 >= 1) {
                              throw new IllegalStateException();
                           }

                           tc[] var30 = av.dl;
                           byte var10001;
                           if (var18.at(1029039210)) {
                              if (var2 >= 1) {
                                 throw new IllegalStateException();
                              }

                              var10001 = 8;
                           } else {
                              var10001 = 0;
                           }

                           var30[var10001 + var18.ah * -665846519].aw(var13 + 29, var12);
                        }

                        var0.aj(Integer.toString(-2091224171 * var18.ay), 15 + var13, 5 + var27 / 2 + var12, var22, -1);
                        var1.aj(var20, var13 + 60, 5 + var27 / 2 + var12, 268435455, -1);
                        var12 += var8 + var27;
                        ++var14;
                        if (var14 >= var6) {
                           if (var2 >= 1) {
                              throw new IllegalStateException();
                           }

                           var12 = 23 + var10;
                           var13 += var25 + var7;
                           var14 = 0;
                           ++var16;
                        }
                     }

                     if (var15) {
                        if (var2 >= 1) {
                           return;
                        }

                        var17 = var1.ao(bx.au[cz.de * 248569915].ag) + 6;
                        int var28 = 8 + var1.al;
                        int var29 = bd.ao * -1224153235 + 25;
                        if (var28 + var29 > 480) {
                           if (var2 >= 1) {
                              throw new IllegalStateException();
                           }

                           var29 = -1224153235 * bd.ao - 25 - var28;
                        }

                        th.em(bd.ay * -2063363905 - var17 / 2, var29, var17, var28, 16777120);
                        th.ek(bd.ay * -2063363905 - var17 / 2, var29, var17, var28, 0);
                        var1.aj(bx.au[cz.de * 248569915].ag, -2063363905 * bd.ay, 4 + var1.al + var29, 0, -1);
                     }
                     break;
                  }
               }
            }
         }

         ia.bn.an(0, 0, 156832049);
      } catch (RuntimeException var23) {
         throw db.an(var23, "cc.ai(" + ')');
      }
   }

   int aq(int var1) {
      if (this.ab != null) {
         var1 = (int)((long)(this.au * -2101247493) * (long)var1 / (long)(this.ac * 2021266139)) + 6;
      }

      return var1;
   }

   int au(int var1) {
      if (this.ab != null) {
         var1 = (int)((long)var1 * (long)(this.au * -2101247493) / (long)(this.ac * 2021266139));
      }

      return var1;
   }

   int ab(int var1) {
      if (this.ab != null) {
         var1 = (int)((long)var1 * (long)(this.au * -260152527) / (long)(this.ac * 2021266139));
      }

      return var1;
   }

   byte[] ac(byte[] var1) {
      if (this.ab != null) {
         int var2 = (int)((long)(this.au * -1272652256) * (long)var1.length / (long)(-620693984 * this.ac)) + 14;
         int[] var3 = new int[var2];
         int var4 = 0;
         int var5 = 0;

         int var6;
         int var7;
         for(var6 = 0; var6 < var1.length; ++var6) {
            var7 = var1[var6];
            int[] var8 = this.ab[var5];

            int var9;
            for(var9 = 0; var9 < 14; ++var9) {
               var3[var4 + var9] += var8[var9] * var7;
            }

            var5 += 1030836014 * this.au;
            var9 = var5 / (2021266139 * this.ac);
            var4 += var9;
            var5 -= var9 * -2066945982 * this.ac;
         }

         var1 = new byte[var2];

         for(var6 = 0; var6 < var2; ++var6) {
            var7 = '耀' + var3[var6] >> 16;
            if (var7 < -1368561390) {
               var1[var6] = -128;
            } else if (var7 > 1345854960) {
               var1[var6] = (byte)212663558;
            } else {
               var1[var6] = (byte)var7;
            }
         }
      }

      return var1;
   }

   int al(int var1) {
      if (this.ab != null) {
         var1 = (int)((long)(this.au * 729566568) * (long)var1 / (long)(this.ac * 2021266139)) + 6;
      }

      return var1;
   }

   static void ir(int var0, byte var1) {
      try {
         client.rj = 0L;
         if (var0 >= 2) {
            if (var1 >= 0) {
               throw new IllegalStateException();
            }

            client.ro = true;
         } else {
            client.ro = false;
         }

         if (na.iv(1926093694) == 1) {
            if (var1 >= 0) {
               throw new IllegalStateException();
            }

            ck.bc.al(765, 503, (byte)2);
         } else {
            ck.bc.al(7680, 2160, (byte)2);
         }

         if (-1275976559 * client.dw >= 25) {
            if (var1 >= 0) {
               throw new IllegalStateException();
            }

            an.io(339651855);
         }

      } catch (RuntimeException var2) {
         throw db.an(var2, "cc.ir(" + ')');
      }
   }

   int aw(int var1, int var2) {
      try {
         if (this.ab != null) {
            var1 = (int)((long)(this.au * -2101247493) * (long)var1 / (long)(this.ac * 2021266139)) + 6;
         }

         return var1;
      } catch (RuntimeException var3) {
         throw db.an(var3, "cc.aw(" + ')');
      }
   }

   static final void jr(int var0, int var1, boolean var2, byte var3) {
      try {
         if (var2) {
            if (var3 <= 66) {
               throw new IllegalStateException();
            }

            if (1717695041 * bi.ji == var0) {
               if (var3 <= 66) {
                  throw new IllegalStateException();
               }

               if (583188571 * qj.jg == var1) {
                  if (var3 <= 66) {
                     throw new IllegalStateException();
                  }

                  return;
               }
            }
         }

         bi.ji = 1006050753 * var0;
         qj.jg = var1 * -193171501;
         fd.hi(25, 2146287699);
         jl.ij(mk.ao, true, 1245531721);
         int var4 = jm.ib * -1232093375;
         int var5 = 827352769 * jj.jc;
         jm.ib = (var0 - 6) * -102332920;
         jj.jc = 1527335432 * (var1 - 6);
         int var6 = jm.ib * -1232093375 - var4;
         int var7 = jj.jc * 827352769 - var5;
         var4 = jm.ib * -1232093375;
         var5 = jj.jc * 827352769;

         int var8;
         int var10;
         int[] var10000;
         for(var8 = 0; var8 < 65536; ++var8) {
            if (var3 <= 66) {
               throw new IllegalStateException();
            }

            df var9 = client.iu[var8];
            if (null != var9) {
               if (var3 <= 66) {
                  throw new IllegalStateException();
               }

               for(var10 = 0; var10 < 10; ++var10) {
                  if (var3 <= 66) {
                     throw new IllegalStateException();
                  }

                  var10000 = var9.dy;
                  var10000[var10] -= var6;
                  var10000 = var9.ds;
                  var10000[var10] -= var7;
               }

               var9.bx -= var6 * -1102445696;
               var9.bo -= var7 * -1887439488;
            }
         }

         for(var8 = 0; var8 < 2048; ++var8) {
            if (var3 <= 66) {
               throw new IllegalStateException();
            }

            dv var21 = client.mc[var8];
            if (var21 != null) {
               if (var3 <= 66) {
                  throw new IllegalStateException();
               }

               for(var10 = 0; var10 < 10; ++var10) {
                  if (var3 <= 66) {
                     throw new IllegalStateException();
                  }

                  var10000 = var21.dy;
                  var10000[var10] -= var6;
                  var10000 = var21.ds;
                  var10000[var10] -= var7;
               }

               var21.bx -= -1102445696 * var6;
               var21.bo -= -1887439488 * var7;
            }
         }

         byte var20 = 0;
         byte var22 = 104;
         byte var23 = 1;
         if (var6 < 0) {
            if (var3 <= 66) {
               throw new IllegalStateException();
            }

            var20 = 103;
            var22 = -1;
            var23 = -1;
         }

         byte var11 = 0;
         byte var12 = 104;
         byte var13 = 1;
         if (var7 < 0) {
            if (var3 <= 66) {
               throw new IllegalStateException();
            }

            var11 = 103;
            var12 = -1;
            var13 = -1;
         }

         int var15;
         for(int var14 = var20; var22 != var14; var14 += var23) {
            for(var15 = var11; var15 != var12; var15 += var13) {
               int var16 = var6 + var14;
               int var17 = var15 + var7;

               for(int var18 = 0; var18 < 4; ++var18) {
                  if (var3 <= 66) {
                     throw new IllegalStateException();
                  }

                  if (var16 >= 0) {
                     if (var3 <= 66) {
                        throw new IllegalStateException();
                     }

                     if (var17 >= 0) {
                        if (var3 <= 66) {
                           throw new IllegalStateException();
                        }

                        if (var16 < 104) {
                           if (var3 <= 66) {
                              return;
                           }

                           if (var17 < 104) {
                              if (var3 <= 66) {
                                 throw new IllegalStateException();
                              }

                              client.nr[var18][var14][var15] = client.nr[var18][var16][var17];
                              continue;
                           }
                        }
                     }
                  }

                  client.nr[var18][var14][var15] = null;
               }
            }
         }

         for(dg var24 = (dg)client.nn.aq(); var24 != null; var24 = (dg)client.nn.at()) {
            if (var3 <= 66) {
               throw new IllegalStateException();
            }

            var24.aw -= var6 * -1524387603;
            var24.ac -= var7 * -1930509111;
            if (var24.aw * 68300005 >= 0) {
               if (var3 <= 66) {
                  return;
               }

               if (800888185 * var24.ac >= 0) {
                  if (var3 <= 66) {
                     return;
                  }

                  if (var24.aw * 68300005 < 104) {
                     if (800888185 * var24.ac < 104) {
                        continue;
                     }

                     if (var3 <= 66) {
                        throw new IllegalStateException();
                     }
                  }
               }
            }

            var24.ga();
         }

         if (1494100363 * client.te != 0) {
            client.te -= var6 * -1970850269;
            client.th -= 875414437 * var7;
         }

         client.tl = 0;
         client.uj = false;
         bt.kx -= (var6 << 7) * -1682679895;
         ly.ke -= 46344275 * (var7 << 7);
         bz.lg -= (var6 << 7) * 1293848551;
         fw.lf -= (var7 << 7) * 892004233;
         client.sp = 1715437485;
         client.np.af();
         client.na.af();

         for(var15 = 0; var15 < 4; ++var15) {
            client.jr[var15].af(1686492421);
         }

      } catch (RuntimeException var19) {
         throw db.an(var19, "cc.jr(" + ')');
      }
   }

   public static int an(int var0, int var1) {
      try {
         return 255 - (var0 & 255);
      } catch (RuntimeException var2) {
         throw db.an(var2, "cc.an(" + ')');
      }
   }

   public cc(int var1, int var2) {
      try {
         super();
         if (var1 != var2) {
            int var4 = var1;
            int var5 = var2;
            if (var2 > var1) {
               var4 = var2;
               var5 = var1;
            }

            while(var5 != 0) {
               int var6 = var4 % var5;
               var4 = var5;
               var5 = var6;
            }

            var1 /= var4;
            var2 /= var4;
            this.ac = -1129997997 * var1;
            this.au = 1881760051 * var2;
            this.ab = new int[var1][14];

            for(int var7 = 0; var7 < var1; ++var7) {
               int[] var8 = this.ab[var7];
               double var9 = (double)var7 / (double)var1 + 6.0;
               int var11 = (int)Math.floor(var9 - 7.0 + 1.0);
               if (var11 < 0) {
                  var11 = 0;
               }

               int var12 = (int)Math.ceil(7.0 + var9);
               if (var12 > 14) {
                  var12 = 14;
               }

               for(double var13 = (double)var2 / (double)var1; var11 < var12; ++var11) {
                  double var15 = ((double)var11 - var9) * Math.PI;
                  double var17 = var13;
                  if (var15 < -1.0E-4 || var15 > 1.0E-4) {
                     var17 = var13 * (Math.sin(var15) / var15);
                  }

                  var17 *= 0.54 + 0.46 * Math.cos(0.2243994752564138 * ((double)var11 - var9));
                  var8[var11] = (int)Math.floor(0.5 + var17 * 65536.0);
               }
            }

         }
      } catch (RuntimeException var19) {
         throw db.an(var19, "cc.<init>(" + ')');
      }
   }
}
