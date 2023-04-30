import accessors.RSTile;
import java.io.IOException;

public final class is extends rp implements RSTile {
   jk aq;
   int aj;
   int aw;
   int ac;
   boolean ah;
   ij ab;
   boolean ar;
   je al;
   ig at;
   int af;
   int ay;
   jj[] ao;
   int[] ax;
   int ai;
   int ag;
   int am;
   int an;
   boolean av;
   jc au;
   int as;
   iy aa;
   int ak;
   is az;

   public static boolean af(byte var0) {
      try {
         long var1 = dq.af(153542825);
         int var3 = (int)(var1 - -2114584129517998633L * nl.aw);
         nl.aw = -6047020038529116697L * var1;
         if (var3 > 200) {
            if (var0 == 1) {
               throw new IllegalStateException();
            }

            var3 = 200;
         }

         nl.an += var3 * -425972525;
         if (nl.ao * -1651605431 == 0 && 0 == nl.aq * -1952694793) {
            if (var0 == 1) {
               throw new IllegalStateException();
            }

            if (0 == -32010957 * nl.aa) {
               if (var0 == 1) {
                  throw new IllegalStateException();
               }

               if (0 == nl.au * -1171541559) {
                  if (var0 == 1) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }
         }

         if (nl.af == null) {
            if (var0 == 1) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            try {
               if (nl.an * -942339237 > 30000) {
                  throw new IOException();
               } else {
                  no var4;
                  sg var5;
                  while(-1952694793 * nl.aq < 200 && nl.au * -1171541559 > 0) {
                     if (var0 == 1) {
                        throw new IllegalStateException();
                     }

                     var4 = (no)nl.ac.aw();
                     var5 = new sg(4);
                     var5.bu(1, (byte)86);
                     var5.bq((int)var4.hr, 1913109811);
                     nl.af.ab(var5.al, 0, 4, -2115422184);
                     nl.ab.an(var4, var4.hr);
                     nl.au -= -1320339335;
                     nl.aq += -1677618233;
                  }

                  while(nl.ao * -1651605431 < 200 && nl.aa * -32010957 > 0) {
                     if (var0 == 1) {
                        throw new IllegalStateException();
                     }

                     var4 = (no)nl.al.aw();
                     var5 = new sg(4);
                     var5.bu(0, (byte)127);
                     var5.bq((int)var4.hr, 1135612474);
                     nl.af.ab(var5.al, 0, 4, -2115422184);
                     var4.fs();
                     nl.ay.an(var4, var4.hr);
                     nl.aa -= -2069940741;
                     nl.ao += -979537415;
                  }

                  int var20 = 0;

                  while(true) {
                     label304: {
                        if (var20 < 100) {
                           if (var0 == 1) {
                              throw new IllegalStateException();
                           }

                           int var21 = nl.af.aw(-669086178);
                           if (var21 < 0) {
                              throw new IOException();
                           }

                           if (0 != var21) {
                              nl.an = 0;
                              byte var6 = 0;
                              if (ch.ai == null) {
                                 if (var0 == 1) {
                                    throw new IllegalStateException();
                                 }

                                 var6 = 8;
                              } else if (0 == nl.av * -1961769541) {
                                 if (var0 == 1) {
                                    throw new IllegalStateException();
                                 }

                                 var6 = 1;
                              }

                              int var7;
                              int var8;
                              int var9;
                              int var11;
                              byte[] var10000;
                              int var10001;
                              sg var24;
                              if (var6 > 0) {
                                 if (var0 == 1) {
                                    throw new IllegalStateException();
                                 }

                                 var7 = var6 - nl.ag.at * -1633313603;
                                 if (var7 > var21) {
                                    if (var0 == 1) {
                                       throw new IllegalStateException();
                                    }

                                    var7 = var21;
                                 }

                                 nl.af.au(nl.ag.al, -1633313603 * nl.ag.at, var7, -2106093590);
                                 if (0 != nl.ad) {
                                    if (var0 == 1) {
                                       throw new IllegalStateException();
                                    }

                                    for(var8 = 0; var8 < var7; ++var8) {
                                       if (var0 == 1) {
                                          throw new IllegalStateException();
                                       }

                                       var10000 = nl.ag.al;
                                       var10001 = -1633313603 * nl.ag.at + var8;
                                       var10000[var10001] ^= nl.ad;
                                    }
                                 }

                                 var24 = nl.ag;
                                 var24.at += var7 * -1516355947;
                                 if (-1633313603 * nl.ag.at >= var6) {
                                    if (null == ch.ai) {
                                       if (var0 == 1) {
                                          throw new IllegalStateException();
                                       }

                                       nl.ag.at = 0;
                                       var8 = nl.ag.cm((byte)7);
                                       var9 = nl.ag.cl(187645414);
                                       int var10 = nl.ag.cm((byte)7);
                                       var11 = nl.ag.cx(-1966667077);
                                       long var12 = (long)((var8 << 16) + var9);
                                       no var14 = (no)nl.ab.af(var12);
                                       nl.ax = true;
                                       if (var14 == null) {
                                          var14 = (no)nl.ay.af(var12);
                                          nl.ax = false;
                                       }

                                       if (null == var14) {
                                          if (var0 == 1) {
                                             throw new IllegalStateException();
                                          }

                                          throw new IOException();
                                       }

                                       byte var25;
                                       if (0 == var10) {
                                          if (var0 == 1) {
                                             throw new IllegalStateException();
                                          }

                                          var25 = 5;
                                       } else {
                                          var25 = 9;
                                       }

                                       byte var15 = var25;
                                       ch.ai = var14;
                                       nl.ah = new sg(var15 + var11 + ch.ai.aw);
                                       nl.ah.bu(var10, (byte)58);
                                       nl.ah.ba(var11, -2081835031);
                                       nl.av = -598099048;
                                       nl.ag.at = 0;
                                    } else if (nl.av * -1961769541 == 0) {
                                       if (var0 == 1) {
                                          throw new IllegalStateException();
                                       }

                                       if (-1 == nl.ag.al[0]) {
                                          nl.av = -74762381;
                                          nl.ag.at = 0;
                                       } else {
                                          ch.ai = null;
                                       }
                                    }
                                    break label304;
                                 }

                                 if (var0 == 1) {
                                    throw new IllegalStateException();
                                 }
                              } else {
                                 var7 = nl.ah.al.length - ch.ai.aw;
                                 var8 = 512 - nl.av * -1961769541;
                                 if (var8 > var7 - nl.ah.at * -1633313603) {
                                    if (var0 == 1) {
                                       throw new IllegalStateException();
                                    }

                                    var8 = var7 - nl.ah.at * -1633313603;
                                 }

                                 if (var8 > var21) {
                                    if (var0 == 1) {
                                       throw new IllegalStateException();
                                    }

                                    var8 = var21;
                                 }

                                 nl.af.au(nl.ah.al, nl.ah.at * -1633313603, var8, -2106093590);
                                 if (0 != nl.ad) {
                                    if (var0 == 1) {
                                       throw new IllegalStateException();
                                    }

                                    for(var9 = 0; var9 < var8; ++var9) {
                                       if (var0 == 1) {
                                          throw new IllegalStateException();
                                       }

                                       var10000 = nl.ah.al;
                                       var10001 = var9 + -1633313603 * nl.ah.at;
                                       var10000[var10001] ^= nl.ad;
                                    }
                                 }

                                 var24 = nl.ah;
                                 var24.at += var8 * -1516355947;
                                 nl.av += -74762381 * var8;
                                 if (var7 == nl.ah.at * -1633313603) {
                                    if (var0 == 1) {
                                       throw new IllegalStateException();
                                    }

                                    if (ch.ai.hr == 16711935L) {
                                       cz.as = nl.ah;

                                       for(var9 = 0; var9 < 256; ++var9) {
                                          if (var0 == 1) {
                                             throw new IllegalStateException();
                                          }

                                          nd var22 = nl.aj[var9];
                                          if (var22 != null) {
                                             cz.as.at = var9 * 754054312 + 1008154857;
                                             if (-1633313603 * cz.as.at >= cz.as.al.length) {
                                                if (var0 == 1) {
                                                   throw new IllegalStateException();
                                                }

                                                if (!var22.ah) {
                                                   throw new RuntimeException("");
                                                }

                                                if (var0 == 1) {
                                                   throw new IllegalStateException();
                                                }

                                                var22.au((byte)-59);
                                             } else {
                                                var11 = cz.as.cx(-1554555000);
                                                int var23 = cz.as.cx(-1392290912);
                                                var22.ab(var11, var23, -691028);
                                             }
                                          }
                                       }
                                    } else {
                                       nl.am.reset();
                                       nl.am.update(nl.ah.al, 0, var7);
                                       var9 = (int)nl.am.getValue();
                                       if (var9 != ch.ai.an * -75260527) {
                                          if (var0 == 1) {
                                             throw new IllegalStateException();
                                          }

                                          try {
                                             nl.af.aq(-538193159);
                                          } catch (Exception var17) {
                                          }

                                          nl.ae += 372675253;
                                          nl.af = null;
                                          nl.ad = (byte)((int)(Math.random() * 255.0 + 1.0));
                                          return false;
                                       }

                                       nl.ae = 0;
                                       nl.ap = 0;
                                       nd var26 = ch.ai.af;
                                       var10001 = (int)(ch.ai.hr & 65535L);
                                       byte[] var10002 = nl.ah.al;
                                       boolean var10003;
                                       if (16711680L == (ch.ai.hr & 16711680L)) {
                                          if (var0 == 1) {
                                             throw new IllegalStateException();
                                          }

                                          var10003 = true;
                                       } else {
                                          var10003 = false;
                                       }

                                       var26.aq(var10001, var10002, var10003, nl.ax, 681088359);
                                    }

                                    ch.ai.ga();
                                    if (nl.ax) {
                                       if (var0 == 1) {
                                          throw new IllegalStateException();
                                       }

                                       nl.aq -= -1677618233;
                                    } else {
                                       nl.ao -= -979537415;
                                    }

                                    nl.av = 0;
                                    ch.ai = null;
                                    nl.ah = null;
                                    break label304;
                                 }

                                 if (-1961769541 * nl.av == 512) {
                                    if (var0 == 1) {
                                       throw new IllegalStateException();
                                    }

                                    nl.av = 0;
                                    break label304;
                                 }
                              }
                           }
                        }

                        return true;
                     }

                     ++var20;
                  }
               }
            } catch (IOException var18) {
               try {
                  nl.af.aq(-923421367);
               } catch (Exception var16) {
               }

               nl.ap += -161323731;
               nl.af = null;
               return false;
            }
         }
      } catch (RuntimeException var19) {
         throw db.an(var19, "is.af(" + ')');
      }
   }

   is(int var1, int var2, int var3) {
      try {
         super();
         this.ao = new jj[5];
         this.ax = new int[5];
         this.ai = 0;
         this.ac = (this.af = -1846949283 * var1) * 1251513827;
         this.an = var2 * 960127795;
         this.aw = var3 * 210148197;
      } catch (RuntimeException var4) {
         throw db.an(var4, "is.<init>(" + ')');
      }
   }
}
