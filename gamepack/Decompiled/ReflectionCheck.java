import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionCheck extends Node {
   protected static String bj;
   static int aa;
   byte[][][] al;
   int af;
   int an;
   int[] ab;
   int[] ac;
   int[] aw;
   Field[] au;
   Method[] aq;

   ReflectionCheck() {
   }

   public static void af_renamed(AbstractArchive var0) {
      sm.af = var0;
   }

   static final void ii_renamed(Actor var0, int var1) {
      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      SeqType var14;
      if (var0.dt * -435598119 >= -1886224337 * Client.ep) {
         var3 = Math.max(1, -435598119 * var0.dt - -1886224337 * Client.ep);
         var4 = -1883924352 * var0.di + var0.bm * 1119756096;
         var5 = var0.bm * 1119756096 + var0.dl * -161749632;
         var0.bx += (var4 - 1144428983 * var0.bx) / var3 * -881028089;
         var0.bo += (var5 - -411750205 * var0.bo) / var3 * 1193213931;
         var0.ep = 0;
         var0.dd = -1369167919 * var0.dz;
      } else {
         int var9;
         if (var0.dv * -1274841313 >= -1886224337 * Client.ep) {
            boolean var12 = -1274841313 * var0.dv == -1886224337 * Client.ep || -1 == -1372355773 * var0.ct || 1253892101 * var0.dm != 0;
            if (!var12) {
               SeqType var13 = Inventory.getSeqType(var0.ct * -1372355773, (byte)113);
               if (null != var13 && !var13.ao()) {
                  var12 = 1 + 1356757385 * var0.cd > var13.av[var0.cp * -41215169];
               } else {
                  var12 = true;
               }
            }

            if (var12) {
               var4 = var0.dv * -1274841313 - var0.dt * -435598119;
               var5 = Client.ep * -1886224337 - var0.dt * -435598119;
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
               var0.ep = 0;
            } else {
               label559: {
                  if (-1372355773 * var0.ct != -1 && var0.dm * 1253892101 == 0) {
                     var14 = Inventory.getSeqType(-1372355773 * var0.ct, (byte)73);
                     if (var0.eo * -1181739279 > 0 && var14.bb * 1069382699 == 0) {
                        var0.ep += -1610286357;
                        break label559;
                     }

                     if (var0.eo * -1181739279 <= 0 && 0 == 1957040329 * var14.bi) {
                        var0.ep += -1610286357;
                        break label559;
                     }
                  }

                  var3 = var0.bx * 1144428983;
                  var4 = var0.bo * -411750205;
                  var5 = 1119756096 * var0.bm + 128 * var0.dy[var0.dn * 1134756167 - 1];
                  var6 = var0.ds[var0.dn * 1134756167 - 1] * 128 + 1119756096 * var0.bm;
                  if (var3 < var5) {
                     if (var4 < var6) {
                        var0.dd = -398716160;
                     } else if (var4 > var6) {
                        var0.dd = -558202624;
                     } else {
                        var0.dd = -478459392;
                     }
                  } else if (var3 > var5) {
                     if (var4 < var6) {
                        var0.dd = -239229696;
                     } else if (var4 > var6) {
                        var0.dd = -79743232;
                     } else {
                        var0.dd = -159486464;
                     }
                  } else if (var4 < var6) {
                     var0.dd = -318972928;
                  } else if (var4 > var6) {
                     var0.dd = 0;
                  }

                  iu var18 = var0.da[var0.dn * 1134756167 - 1];
                  if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
                     var8 = -1751341433 * var0.dd - var0.bz * -1703696531 & 2047;
                     if (var8 > 1024) {
                        var8 -= 2048;
                     }

                     var9 = var0.br * 1648569641;
                     if (var8 >= -256 && var8 <= 256) {
                        var9 = 736907545 * var0.bs;
                     } else if (var8 >= 256 && var8 < 768) {
                        var9 = var0.bu * -1059657777;
                     } else if (var8 >= -768 && var8 <= -256) {
                        var9 = -127994241 * var0.bg;
                     }

                     if (var9 == -1) {
                        var9 = 736907545 * var0.bs;
                     }

                     var0.cz = 327373721 * var9;
                     int var10 = 4;
                     boolean var11 = true;
                     if (var0 instanceof Npc) {
                        var11 = ((Npc)var0).af.bu;
                     }

                     if (var11) {
                        if (var0.bz * -1703696531 != var0.dd * -1751341433 && var0.cr * 1005900761 == -1 && 0 != 351748387 * var0.dx) {
                           var10 = 2;
                        }

                        if (var0.dn * 1134756167 > 2) {
                           var10 = 6;
                        }

                        if (var0.dn * 1134756167 > 3) {
                           var10 = 8;
                        }

                        if (var0.ep * 1489558979 > 0 && 1134756167 * var0.dn > 1) {
                           var10 = 8;
                           var0.ep -= -1610286357;
                        }
                     } else {
                        if (1134756167 * var0.dn > 1) {
                           var10 = 6;
                        }

                        if (var0.dn * 1134756167 > 2) {
                           var10 = 8;
                        }

                        if (var0.ep * 1489558979 > 0 && var0.dn * 1134756167 > 1) {
                           var10 = 8;
                           var0.ep -= -1610286357;
                        }
                     }

                     if (var18 == iu.ac) {
                        var10 <<= 1;
                     } else if (var18 == iu.an) {
                        var10 >>= 1;
                     }

                     if (var10 >= 8) {
                        if (var0.cz * -1302441815 == 736907545 * var0.bs && var0.bf * 1939789287 != -1) {
                           var0.cz = var0.bf * 863812623;
                        } else if (-1302441815 * var0.cz == 1648569641 * var0.br && -1 != 793978951 * var0.bq) {
                           var0.cz = 538384239 * var0.bq;
                        } else if (-127994241 * var0.bg == var0.cz * -1302441815 && var0.ba * 1755337849 != -1) {
                           var0.cz = var0.ba * -1205815471;
                        } else if (var0.bu * -1059657777 == var0.cz * -1302441815 && var0.bv * 802247051 != -1) {
                           var0.cz = 2091568403 * var0.bv;
                        }
                     } else if (var10 <= 1) {
                        if (var0.bs * 736907545 == var0.cz * -1302441815 && -1254675467 * var0.bl != -1) {
                           var0.cz = var0.bl * -560417683;
                        } else if (var0.br * 1648569641 == -1302441815 * var0.cz && var0.bp * 572220041 != -1) {
                           var0.cz = var0.bp * -630501663;
                        } else if (-127994241 * var0.bg == -1302441815 * var0.cz && var0.bc * -1312118043 != -1) {
                           var0.cz = var0.bc * 1773625821;
                        } else if (-1302441815 * var0.cz == var0.bu * -1059657777 && var0.bh * -428343529 != -1) {
                           var0.cz = -483333697 * var0.bh;
                        }
                     }

                     if (var5 != var3 || var4 != var6) {
                        if (var3 < var5) {
                           var0.bx += -881028089 * var10;
                           if (var0.bx * 1144428983 > var5) {
                              var0.bx = -881028089 * var5;
                           }
                        } else if (var3 > var5) {
                           var0.bx -= -881028089 * var10;
                           if (1144428983 * var0.bx < var5) {
                              var0.bx = var5 * -881028089;
                           }
                        }

                        if (var4 < var6) {
                           var0.bo += 1193213931 * var10;
                           if (-411750205 * var0.bo > var6) {
                              var0.bo = 1193213931 * var6;
                           }
                        } else if (var4 > var6) {
                           var0.bo -= 1193213931 * var10;
                           if (-411750205 * var0.bo < var6) {
                              var0.bo = 1193213931 * var6;
                           }
                        }
                     }

                     if (var0.bx * 1144428983 == var5 && var0.bo * -411750205 == var6) {
                        var0.dn -= 400971895;
                        if (var0.eo * -1181739279 > 0) {
                           var0.eo -= 1622809105;
                        }
                     }
                  } else {
                     var0.bx = -881028089 * var5;
                     var0.bo = var6 * 1193213931;
                     var0.dn -= 400971895;
                     if (var0.eo * -1181739279 > 0) {
                        var0.eo -= 1622809105;
                     }
                  }
               }
            }
         }
      }

      if (var0.bx * 1144428983 < 128 || var0.bo * -411750205 < 128 || 1144428983 * var0.bx >= 13184 || var0.bo * -411750205 >= 13184) {
         var0.ct = 1690721941;
         var0.dt = 0;
         var0.dv = 0;
         var0.ct();
         var0.bx = -1102445696 * var0.dy[0] + -1606165824 * var0.bm;
         var0.bo = var0.bm * 254242752 + -1887439488 * var0.ds[0];
         var0.cb();
      }

      if (var0 == MusicPatchNode.mi && (1144428983 * var0.bx < 1536 || -411750205 * var0.bo < 1536 || var0.bx * 1144428983 >= 11776 || -411750205 * var0.bo >= 11776)) {
         var0.ct = 1690721941;
         var0.dt = 0;
         var0.dv = 0;
         var0.ct();
         var0.bx = -1102445696 * var0.dy[0] + var0.bm * -1606165824;
         var0.bo = var0.bm * 254242752 + -1887439488 * var0.ds[0];
         var0.cb();
      }

      if (-1 != 1005900761 * var0.cr) {
         var14 = null;
         var4 = 65536;
         Object var15;
         if (1005900761 * var0.cr < var4) {
            var15 = Client.iu[var0.cr * 1005900761];
         } else {
            var15 = Client.mc[var0.cr * 1005900761 - var4];
         }

         if (null != var15) {
            var5 = 1144428983 * var0.bx - ((Actor)var15).bx * 1144428983;
            var6 = var0.bo * -411750205 - -411750205 * ((Actor)var15).bo;
            if (var5 != 0 || var6 != 0) {
               var8 = (int)(Math.atan2((double)var5, (double)var6) * 325.94932345220167) & 2047;
               var0.dd = var8 * 385564471;
            }
         } else if (var0.cy) {
            var0.cr = -1052277865;
            var0.cy = false;
         }
      }

      if (0 == 1134756167 * var0.dn || 1489558979 * var0.ep > 0) {
         var3 = -1;
         if (-714961113 * var0.cv != -1 && -1282076959 * var0.cb != -1) {
            var4 = var0.cv * -1320709248 - 1205837952 * jm.ib + 64;
            var5 = -897093504 * var0.cb - -1473027968 * Scenery.jc + 64;
            var6 = var0.bx * 1144428983 - var4;
            var7 = -411750205 * var0.bo - var5;
            if (var6 != 0 || 0 != var7) {
               var8 = (int)(Math.atan2((double)var6, (double)var7) * 325.94932345220167) & 2047;
               var3 = var8;
            }
         } else if (var0.cx * -283165269 != -1) {
            var3 = -283165269 * var0.cx;
         }

         if (var3 != -1) {
            var0.dd = var3 * 385564471;
            if (var0.co) {
               var0.bz = 841550147 * var0.dd;
            }
         }

         var0.cd();
      }

      var3 = -1751341433 * var0.dd - var0.bz * -1703696531 & 2047;
      if (var3 != 0) {
         boolean var16 = true;
         boolean var17 = true;
         var0.dj += 531854385;
         var6 = var3 > 1024 ? -1 : 1;
         var0.bz += var6 * var0.dx * 351748387 * -1228309915;
         boolean var19 = true;
         if (var3 < var0.dx * 351748387 || var3 > 2048 - var0.dx * 351748387) {
            var0.bz = 841550147 * var0.dd;
            var19 = false;
         }

         if (var0.dx * 351748387 > 0 && var0.cz * -1302441815 == 1590591885 * var0.bt && (-1223990063 * var0.dj > 25 || var19)) {
            if (var6 == -1 && 1319769839 * var0.bj != -1) {
               var0.cz = var0.bj * -1570491945;
            } else if (var6 == 1 && 1796560353 * var0.bn != -1) {
               var0.cz = -1883552135 * var0.bn;
            } else {
               var0.cz = var0.bs * 961712881;
            }
         }

         var0.bz = -1228309915 * (var0.bz * -1703696531 & 2047);
      } else {
         if (var0.cy) {
            var0.cr = -1052277865;
            var0.cy = false;
         }

         var0.dj = 0;
      }

      NetFileRequest.ik_renamed(var0);
   }

   static final void mt_renamed(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (SoundSystem.loadInterface(var0)) {
         ix.updateInterface(hn.ap[var0], -1, var1, var2, var3, var4, var5, var6);
      }
   }
}
