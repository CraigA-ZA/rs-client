import accessors.RSReflectionCheck;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class bj extends rp implements RSReflectionCheck {
   Field[] au;
   int an;
   int[] aw;
   int[] ac;
   int af;
   int[] ab;
   Method[] aq;
   byte[][][] al;
   static int aa;
   protected static String bj;
   static final int bz = 8;

   public static void af(nm var0, int var1) {
      try {
         sm.af = var0;
      } catch (RuntimeException var2) {
         throw db.an(var2, "bj.af(" + ')');
      }
   }

   bj() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw db.an(var1, "bj.<init>(" + ')');
      }
   }

   static final void mt(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         if (!bq.ac(var0, 1376777516)) {
            if (var7 == -631543188) {
               ;
            }
         } else {
            ix.mw(hn.ap[var0], -1, var1, var2, var3, var4, var5, var6, 1611526345);
         }
      } catch (RuntimeException var8) {
         throw db.an(var8, "bj.mt(" + ')');
      }
   }

   static final void ii(de var0, int var1, byte var2) {
      try {
         int var3;
         int var4;
         int var5;
         int var6;
         int var7;
         int var8;
         ha var15;
         if (var0.dt * -435598119 >= -1886224337 * client.ep) {
            if (var2 >= 50) {
               return;
            }

            var3 = Math.max(1, -435598119 * var0.dt - -1886224337 * client.ep);
            var4 = -1883924352 * var0.di + var0.bm * 1119756096;
            var5 = var0.bm * 1119756096 + var0.dl * -161749632;
            var0.bx += (var4 - 1144428983 * var0.bx) / var3 * -881028089;
            var0.bo += (var5 - -411750205 * var0.bo) / var3 * 1193213931;
            var0.ep = 0;
            var0.dd = -1369167919 * var0.dz;
         } else {
            int var9;
            if (var0.dv * -1274841313 >= -1886224337 * client.ep) {
               if (var2 >= 50) {
                  throw new IllegalStateException();
               }

               boolean var10000;
               label757: {
                  if (-1274841313 * var0.dv != -1886224337 * client.ep && -1 != -1372355773 * var0.ct) {
                     if (1253892101 * var0.dm == 0) {
                        var10000 = false;
                        break label757;
                     }

                     if (var2 >= 50) {
                        throw new IllegalStateException();
                     }
                  }

                  var10000 = true;
               }

               boolean var13 = var10000;
               if (!var13) {
                  label863: {
                     if (var2 >= 50) {
                        return;
                     }

                     ha var14 = dc.an(var0.ct * -1372355773, (byte)113);
                     if (null != var14) {
                        if (var2 >= 50) {
                           throw new IllegalStateException();
                        }

                        if (!var14.ao(1413453204)) {
                           if (1 + 1356757385 * var0.cd > var14.av[var0.cp * -41215169]) {
                              if (var2 >= 50) {
                                 return;
                              }

                              var10000 = true;
                           } else {
                              var10000 = false;
                           }

                           var13 = var10000;
                           break label863;
                        }

                        if (var2 >= 50) {
                           throw new IllegalStateException();
                        }
                     }

                     var13 = true;
                  }
               }

               if (var13) {
                  if (var2 >= 50) {
                     throw new IllegalStateException();
                  }

                  var4 = var0.dv * -1274841313 - var0.dt * -435598119;
                  var5 = client.ep * -1886224337 - var0.dt * -435598119;
                  var6 = -1883924352 * var0.di + 1119756096 * var0.bm;
                  var7 = -161749632 * var0.dl + var0.bm * 1119756096;
                  var8 = var0.bm * 1119756096 + var0.dr * 69929344;
                  var9 = var0.bm * 1119756096 + -106117248 * var0.dk;
                  var0.bx = -881028089 * ((var6 * (var4 - var5) + var8 * var5) / var4);
                  var0.bo = 1193213931 * ((var5 * var9 + (var4 - var5) * var7) / var4);
               }

               var0.ep = 0;
               var0.dd = -1369167919 * var0.dz;
               var0.bz = var0.dd * 841550147;
            } else {
               var0.cz = var0.bt * 1603478597;
               if (1134756167 * var0.dn == 0) {
                  if (var2 >= 50) {
                     return;
                  }

                  var0.ep = 0;
               } else {
                  label843: {
                     if (-1372355773 * var0.ct != -1) {
                        if (var2 >= 50) {
                           throw new IllegalStateException();
                        }

                        if (var0.dm * 1253892101 == 0) {
                           if (var2 >= 50) {
                              throw new IllegalStateException();
                           }

                           var15 = dc.an(-1372355773 * var0.ct, (byte)73);
                           if (var0.eo * -1181739279 > 0) {
                              if (var2 >= 50) {
                                 throw new IllegalStateException();
                              }

                              if (var15.bb * 1069382699 == 0) {
                                 if (var2 >= 50) {
                                    return;
                                 }

                                 var0.ep += -1610286357;
                                 break label843;
                              }
                           }

                           if (var0.eo * -1181739279 <= 0) {
                              if (var2 >= 50) {
                                 return;
                              }

                              if (0 == 1957040329 * var15.bi) {
                                 if (var2 >= 50) {
                                    throw new IllegalStateException();
                                 }

                                 var0.ep += -1610286357;
                                 break label843;
                              }
                           }
                        }
                     }

                     var3 = var0.bx * 1144428983;
                     var4 = var0.bo * -411750205;
                     var5 = 1119756096 * var0.bm + 128 * var0.dy[var0.dn * 1134756167 - 1];
                     var6 = var0.ds[var0.dn * 1134756167 - 1] * 128 + 1119756096 * var0.bm;
                     if (var3 < var5) {
                        if (var2 >= 50) {
                           throw new IllegalStateException();
                        }

                        if (var4 < var6) {
                           if (var2 >= 50) {
                              throw new IllegalStateException();
                           }

                           var0.dd = -398716160;
                        } else if (var4 > var6) {
                           if (var2 >= 50) {
                              throw new IllegalStateException();
                           }

                           var0.dd = -558202624;
                        } else {
                           var0.dd = -478459392;
                        }
                     } else if (var3 > var5) {
                        if (var4 < var6) {
                           if (var2 >= 50) {
                              throw new IllegalStateException();
                           }

                           var0.dd = -239229696;
                        } else if (var4 > var6) {
                           if (var2 >= 50) {
                              throw new IllegalStateException();
                           }

                           var0.dd = -79743232;
                        } else {
                           var0.dd = -159486464;
                        }
                     } else if (var4 < var6) {
                        if (var2 >= 50) {
                           throw new IllegalStateException();
                        }

                        var0.dd = -318972928;
                     } else if (var4 > var6) {
                        if (var2 >= 50) {
                           throw new IllegalStateException();
                        }

                        var0.dd = 0;
                     }

                     iu var19 = var0.da[var0.dn * 1134756167 - 1];
                     if (var5 - var3 <= 256 && var5 - var3 >= -256) {
                        if (var2 >= 50) {
                           throw new IllegalStateException();
                        }

                        if (var6 - var4 <= 256) {
                           if (var2 >= 50) {
                              throw new IllegalStateException();
                           }

                           if (var6 - var4 >= -256) {
                              var8 = -1751341433 * var0.dd - var0.bz * -1703696531 & 2047;
                              if (var8 > 1024) {
                                 if (var2 >= 50) {
                                    throw new IllegalStateException();
                                 }

                                 var8 -= 2048;
                              }

                              label846: {
                                 var9 = var0.br * 1648569641;
                                 if (var8 >= -256) {
                                    if (var2 >= 50) {
                                       throw new IllegalStateException();
                                    }

                                    if (var8 <= 256) {
                                       if (var2 >= 50) {
                                          throw new IllegalStateException();
                                       }

                                       var9 = 736907545 * var0.bs;
                                       break label846;
                                    }
                                 }

                                 if (var8 >= 256 && var8 < 768) {
                                    if (var2 >= 50) {
                                       return;
                                    }

                                    var9 = var0.bu * -1059657777;
                                 } else if (var8 >= -768) {
                                    if (var2 >= 50) {
                                       return;
                                    }

                                    if (var8 <= -256) {
                                       if (var2 >= 50) {
                                          throw new IllegalStateException();
                                       }

                                       var9 = -127994241 * var0.bg;
                                    }
                                 }
                              }

                              if (var9 == -1) {
                                 var9 = 736907545 * var0.bs;
                              }

                              var0.cz = 327373721 * var9;
                              int var10 = 4;
                              boolean var11 = true;
                              if (var0 instanceof df) {
                                 var11 = ((df)var0).af.bu;
                              }

                              if (var11) {
                                 if (var2 >= 50) {
                                    throw new IllegalStateException();
                                 }

                                 if (var0.bz * -1703696531 != var0.dd * -1751341433) {
                                    if (var2 >= 50) {
                                       throw new IllegalStateException();
                                    }

                                    if (var0.cr * 1005900761 == -1) {
                                       if (var2 >= 50) {
                                          throw new IllegalStateException();
                                       }

                                       if (0 != 351748387 * var0.dx) {
                                          if (var2 >= 50) {
                                             return;
                                          }

                                          var10 = 2;
                                       }
                                    }
                                 }

                                 if (var0.dn * 1134756167 > 2) {
                                    if (var2 >= 50) {
                                       throw new IllegalStateException();
                                    }

                                    var10 = 6;
                                 }

                                 if (var0.dn * 1134756167 > 3) {
                                    if (var2 >= 50) {
                                       throw new IllegalStateException();
                                    }

                                    var10 = 8;
                                 }

                                 if (var0.ep * 1489558979 > 0) {
                                    if (var2 >= 50) {
                                       return;
                                    }

                                    if (1134756167 * var0.dn > 1) {
                                       var10 = 8;
                                       var0.ep -= -1610286357;
                                    }
                                 }
                              } else {
                                 if (1134756167 * var0.dn > 1) {
                                    if (var2 >= 50) {
                                       throw new IllegalStateException();
                                    }

                                    var10 = 6;
                                 }

                                 if (var0.dn * 1134756167 > 2) {
                                    var10 = 8;
                                 }

                                 if (var0.ep * 1489558979 > 0) {
                                    if (var2 >= 50) {
                                       throw new IllegalStateException();
                                    }

                                    if (var0.dn * 1134756167 > 1) {
                                       var10 = 8;
                                       var0.ep -= -1610286357;
                                    }
                                 }
                              }

                              if (var19 == iu.ac) {
                                 if (var2 >= 50) {
                                    return;
                                 }

                                 var10 <<= 1;
                              } else if (var19 == iu.an) {
                                 if (var2 >= 50) {
                                    throw new IllegalStateException();
                                 }

                                 var10 >>= 1;
                              }

                              if (var10 >= 8) {
                                 label850: {
                                    if (var2 >= 50) {
                                       throw new IllegalStateException();
                                    }

                                    if (var0.cz * -1302441815 == 736907545 * var0.bs) {
                                       if (var2 >= 50) {
                                          throw new IllegalStateException();
                                       }

                                       if (var0.bf * 1939789287 != -1) {
                                          var0.cz = var0.bf * 863812623;
                                          break label850;
                                       }
                                    }

                                    if (-1302441815 * var0.cz == 1648569641 * var0.br) {
                                       if (var2 >= 50) {
                                          throw new IllegalStateException();
                                       }

                                       if (-1 != 793978951 * var0.bq) {
                                          var0.cz = 538384239 * var0.bq;
                                          break label850;
                                       }
                                    }

                                    if (-127994241 * var0.bg == var0.cz * -1302441815) {
                                       if (var2 >= 50) {
                                          return;
                                       }

                                       if (var0.ba * 1755337849 != -1) {
                                          if (var2 >= 50) {
                                             throw new IllegalStateException();
                                          }

                                          var0.cz = var0.ba * -1205815471;
                                          break label850;
                                       }
                                    }

                                    if (var0.bu * -1059657777 == var0.cz * -1302441815) {
                                       if (var2 >= 50) {
                                          return;
                                       }

                                       if (var0.bv * 802247051 != -1) {
                                          if (var2 >= 50) {
                                             throw new IllegalStateException();
                                          }

                                          var0.cz = 2091568403 * var0.bv;
                                       }
                                    }
                                 }
                              } else if (var10 <= 1) {
                                 label865: {
                                    if (var2 >= 50) {
                                       throw new IllegalStateException();
                                    }

                                    if (var0.bs * 736907545 == var0.cz * -1302441815) {
                                       if (var2 >= 50) {
                                          throw new IllegalStateException();
                                       }

                                       if (-1254675467 * var0.bl != -1) {
                                          if (var2 >= 50) {
                                             throw new IllegalStateException();
                                          }

                                          var0.cz = var0.bl * -560417683;
                                          break label865;
                                       }
                                    }

                                    if (var0.br * 1648569641 == -1302441815 * var0.cz) {
                                       if (var2 >= 50) {
                                          throw new IllegalStateException();
                                       }

                                       if (var0.bp * 572220041 != -1) {
                                          var0.cz = var0.bp * -630501663;
                                          break label865;
                                       }
                                    }

                                    if (-127994241 * var0.bg == -1302441815 * var0.cz && var0.bc * -1312118043 != -1) {
                                       if (var2 >= 50) {
                                          return;
                                       }

                                       var0.cz = var0.bc * 1773625821;
                                    } else if (-1302441815 * var0.cz == var0.bu * -1059657777 && var0.bh * -428343529 != -1) {
                                       if (var2 >= 50) {
                                          return;
                                       }

                                       var0.cz = -483333697 * var0.bh;
                                    }
                                 }
                              }

                              label851: {
                                 if (var5 == var3) {
                                    if (var2 >= 50) {
                                       throw new IllegalStateException();
                                    }

                                    if (var4 == var6) {
                                       break label851;
                                    }

                                    if (var2 >= 50) {
                                       throw new IllegalStateException();
                                    }
                                 }

                                 if (var3 < var5) {
                                    var0.bx += -881028089 * var10;
                                    if (var0.bx * 1144428983 > var5) {
                                       if (var2 >= 50) {
                                          throw new IllegalStateException();
                                       }

                                       var0.bx = -881028089 * var5;
                                    }
                                 } else if (var3 > var5) {
                                    if (var2 >= 50) {
                                       return;
                                    }

                                    var0.bx -= -881028089 * var10;
                                    if (1144428983 * var0.bx < var5) {
                                       if (var2 >= 50) {
                                          throw new IllegalStateException();
                                       }

                                       var0.bx = var5 * -881028089;
                                    }
                                 }

                                 if (var4 < var6) {
                                    if (var2 >= 50) {
                                       throw new IllegalStateException();
                                    }

                                    var0.bo += 1193213931 * var10;
                                    if (-411750205 * var0.bo > var6) {
                                       if (var2 >= 50) {
                                          throw new IllegalStateException();
                                       }

                                       var0.bo = 1193213931 * var6;
                                    }
                                 } else if (var4 > var6) {
                                    if (var2 >= 50) {
                                       throw new IllegalStateException();
                                    }

                                    var0.bo -= 1193213931 * var10;
                                    if (-411750205 * var0.bo < var6) {
                                       if (var2 >= 50) {
                                          throw new IllegalStateException();
                                       }

                                       var0.bo = 1193213931 * var6;
                                    }
                                 }
                              }

                              if (var0.bx * 1144428983 == var5) {
                                 if (var2 >= 50) {
                                    return;
                                 }

                                 if (var0.bo * -411750205 == var6) {
                                    if (var2 >= 50) {
                                       throw new IllegalStateException();
                                    }

                                    var0.dn -= 400971895;
                                    if (var0.eo * -1181739279 > 0) {
                                       var0.eo -= 1622809105;
                                    }
                                 }
                              }
                              break label843;
                           }
                        }
                     }

                     var0.bx = -881028089 * var5;
                     var0.bo = var6 * 1193213931;
                     var0.dn -= 400971895;
                     if (var0.eo * -1181739279 > 0) {
                        if (var2 >= 50) {
                           throw new IllegalStateException();
                        }

                        var0.eo -= 1622809105;
                     }
                  }
               }
            }
         }

         label740: {
            if (var0.bx * 1144428983 >= 128 && var0.bo * -411750205 >= 128 && 1144428983 * var0.bx < 13184) {
               if (var2 >= 50) {
                  throw new IllegalStateException();
               }

               if (var0.bo * -411750205 < 13184) {
                  break label740;
               }

               if (var2 >= 50) {
                  throw new IllegalStateException();
               }
            }

            var0.ct = 1690721941;
            var0.dt = 0;
            var0.dv = 0;
            var0.ct(-2086288959);
            var0.bx = -1102445696 * var0.dy[0] + -1606165824 * var0.bm;
            var0.bo = var0.bm * 254242752 + -1887439488 * var0.ds[0];
            var0.cb((byte)32);
         }

         if (var0 == lq.mi) {
            label854: {
               if (var2 >= 50) {
                  throw new IllegalStateException();
               }

               if (1144428983 * var0.bx >= 1536) {
                  if (var2 >= 50) {
                     throw new IllegalStateException();
                  }

                  if (-411750205 * var0.bo >= 1536) {
                     if (var2 >= 50) {
                        return;
                     }

                     if (var0.bx * 1144428983 < 11776) {
                        if (var2 >= 50) {
                           throw new IllegalStateException();
                        }

                        if (-411750205 * var0.bo < 11776) {
                           break label854;
                        }

                        if (var2 >= 50) {
                           throw new IllegalStateException();
                        }
                     }
                  }
               }

               var0.ct = 1690721941;
               var0.dt = 0;
               var0.dv = 0;
               var0.ct(-1945472148);
               var0.bx = -1102445696 * var0.dy[0] + var0.bm * -1606165824;
               var0.bo = var0.bm * 254242752 + -1887439488 * var0.ds[0];
               var0.cb((byte)70);
            }
         }

         if (-1 != 1005900761 * var0.cr) {
            var15 = null;
            var4 = 65536;
            Object var16;
            if (1005900761 * var0.cr < var4) {
               if (var2 >= 50) {
                  throw new IllegalStateException();
               }

               var16 = client.iu[var0.cr * 1005900761];
            } else {
               var16 = client.mc[var0.cr * 1005900761 - var4];
            }

            if (null != var16) {
               label856: {
                  if (var2 >= 50) {
                     throw new IllegalStateException();
                  }

                  var5 = 1144428983 * var0.bx - ((de)var16).bx * 1144428983;
                  var6 = var0.bo * -411750205 - -411750205 * ((de)var16).bo;
                  if (var5 == 0) {
                     if (var2 >= 50) {
                        throw new IllegalStateException();
                     }

                     if (var6 == 0) {
                        break label856;
                     }
                  }

                  var8 = (int)(Math.atan2((double)var5, (double)var6) * 325.94932345220167) & 2047;
                  var0.dd = var8 * 385564471;
               }
            } else if (var0.cy) {
               if (var2 >= 50) {
                  throw new IllegalStateException();
               }

               var0.cr = -1052277865;
               var0.cy = false;
            }
         }

         label872: {
            if (0 != 1134756167 * var0.dn) {
               if (1489558979 * var0.ep <= 0) {
                  break label872;
               }

               if (var2 >= 50) {
                  throw new IllegalStateException();
               }
            }

            var3 = -1;
            if (-714961113 * var0.cv != -1 && -1282076959 * var0.cb != -1) {
               label858: {
                  if (var2 >= 50) {
                     throw new IllegalStateException();
                  }

                  var4 = var0.cv * -1320709248 - 1205837952 * jm.ib + 64;
                  var5 = -897093504 * var0.cb - -1473027968 * jj.jc + 64;
                  var6 = var0.bx * 1144428983 - var4;
                  var7 = -411750205 * var0.bo - var5;
                  if (var6 == 0) {
                     if (var2 >= 50) {
                        throw new IllegalStateException();
                     }

                     if (0 == var7) {
                        break label858;
                     }

                     if (var2 >= 50) {
                        throw new IllegalStateException();
                     }
                  }

                  var8 = (int)(Math.atan2((double)var6, (double)var7) * 325.94932345220167) & 2047;
                  var3 = var8;
               }
            } else if (var0.cx * -283165269 != -1) {
               var3 = -283165269 * var0.cx;
            }

            if (var3 != -1) {
               var0.dd = var3 * 385564471;
               if (var0.co) {
                  if (var2 >= 50) {
                     throw new IllegalStateException();
                  }

                  var0.bz = 841550147 * var0.dd;
               }
            }

            var0.cd(-2125761914);
         }

         var3 = -1751341433 * var0.dd - var0.bz * -1703696531 & 2047;
         if (var3 != 0) {
            if (var2 >= 50) {
               return;
            }

            boolean var17 = true;
            boolean var18 = true;
            var0.dj += 531854385;
            byte var22;
            if (var3 > 1024) {
               if (var2 >= 50) {
                  throw new IllegalStateException();
               }

               var22 = -1;
            } else {
               var22 = 1;
            }

            byte var20;
            boolean var21;
            label686: {
               var20 = var22;
               var0.bz += var20 * var0.dx * 351748387 * -1228309915;
               var21 = true;
               if (var3 >= var0.dx * 351748387) {
                  if (var2 >= 50) {
                     throw new IllegalStateException();
                  }

                  if (var3 <= 2048 - var0.dx * 351748387) {
                     break label686;
                  }

                  if (var2 >= 50) {
                     throw new IllegalStateException();
                  }
               }

               var0.bz = 841550147 * var0.dd;
               var21 = false;
            }

            if (var0.dx * 351748387 > 0) {
               if (var2 >= 50) {
                  return;
               }

               if (var0.cz * -1302441815 == 1590591885 * var0.bt) {
                  if (var2 >= 50) {
                     return;
                  }

                  if (-1223990063 * var0.dj > 25 || var21) {
                     label871: {
                        if (var20 == -1) {
                           if (var2 >= 50) {
                              return;
                           }

                           if (1319769839 * var0.bj != -1) {
                              if (var2 >= 50) {
                                 throw new IllegalStateException();
                              }

                              var0.cz = var0.bj * -1570491945;
                              break label871;
                           }
                        }

                        if (var20 == 1) {
                           if (var2 >= 50) {
                              throw new IllegalStateException();
                           }

                           if (1796560353 * var0.bn != -1) {
                              if (var2 >= 50) {
                                 throw new IllegalStateException();
                              }

                              var0.cz = -1883552135 * var0.bn;
                              break label871;
                           }
                        }

                        var0.cz = var0.bs * 961712881;
                     }
                  }
               }
            }

            var0.bz = -1228309915 * (var0.bz * -1703696531 & 2047);
         } else {
            if (var0.cy) {
               if (var2 >= 50) {
                  throw new IllegalStateException();
               }

               var0.cr = -1052277865;
               var0.cy = false;
            }

            var0.dj = 0;
         }

         no.ik(var0, (byte)-25);
      } catch (RuntimeException var12) {
         throw db.an(var12, "bj.ii(" + ')');
      }
   }
}
