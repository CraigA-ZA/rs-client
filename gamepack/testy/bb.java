import java.awt.FontMetrics;
import java.util.Arrays;

public class bb {
   int[] aq;
   public static final int dw = 101;
   public static final int aw = 2;
   static final int ac = 3;
   static final char ab = 'À';
   static final int cv = 24;
   int[] al;
   static final int an = 1;
   static FontMetrics bi;
   public static final int af = 0;

   public boolean bi(char var1) {
      return this.aa(var1, 1941786347) && (this.al[var1] == 1 || this.al[var1] == 3);
   }

   public void af(int var1, int var2, byte var3) {
      try {
         if (this.at(var1, 1848728032) && this.ay(var2, 1805766557)) {
            if (var3 != 0) {
               return;
            }

            this.aq[var1] = var2;
         }

      } catch (RuntimeException var4) {
         throw db.an(var4, "bb.af(" + ')');
      }
   }

   public void an(char var1, int var2, int var3) {
      try {
         if (this.aa(var1, 209638861)) {
            if (var3 != 48495477) {
               throw new IllegalStateException();
            }

            if (this.ay(var2, 1804631207)) {
               if (var3 != 48495477) {
                  throw new IllegalStateException();
               }

               this.al[var1] = var2;
            }
         }

      } catch (RuntimeException var4) {
         throw db.an(var4, "bb.an(" + ')');
      }
   }

   public int aw(int var1, int var2) {
      try {
         return this.at(var1, 1740089691) ? this.aq[var1] : 0;
      } catch (RuntimeException var3) {
         throw db.an(var3, "bb.aw(" + ')');
      }
   }

   public int ac(char var1, byte var2) {
      try {
         if (this.aa(var1, -349955121)) {
            if (var2 != 32) {
               throw new IllegalStateException();
            } else {
               return this.al[var1];
            }
         } else {
            return 0;
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "bb.ac(" + ')');
      }
   }

   public boolean au(int var1, int var2) {
      try {
         boolean var10000;
         label36: {
            if (this.at(var1, 1946342103)) {
               if (var2 != -1749930084) {
                  throw new IllegalStateException();
               }

               if (1 == this.aq[var1]) {
                  break label36;
               }

               if (this.aq[var1] == 3) {
                  if (var2 != -1749930084) {
                     throw new IllegalStateException();
                  }
                  break label36;
               }
            }

            var10000 = false;
            return var10000;
         }

         var10000 = true;
         return var10000;
      } catch (RuntimeException var3) {
         throw db.an(var3, "bb.au(" + ')');
      }
   }

   public boolean ab(char var1, int var2) {
      try {
         boolean var10000;
         label34: {
            if (this.aa(var1, 16146084)) {
               if (this.al[var1] == 1) {
                  break label34;
               }

               if (var2 >= 718910299) {
                  throw new IllegalStateException();
               }

               if (this.al[var1] == 3) {
                  break label34;
               }
            }

            var10000 = false;
            return var10000;
         }

         var10000 = true;
         return var10000;
      } catch (RuntimeException var3) {
         throw db.an(var3, "bb.ab(" + ')');
      }
   }

   public boolean aq(int var1, int var2) {
      try {
         boolean var10000;
         if (this.at(var1, 2137123671)) {
            label43: {
               if (var2 != 1380991347) {
                  throw new IllegalStateException();
               }

               if (this.aq[var1] != 2) {
                  if (var2 != 1380991347) {
                     throw new IllegalStateException();
                  }

                  if (3 != this.aq[var1]) {
                     break label43;
                  }

                  if (var2 != 1380991347) {
                     throw new IllegalStateException();
                  }
               }

               var10000 = true;
               return var10000;
            }
         }

         var10000 = false;
         return var10000;
      } catch (RuntimeException var3) {
         throw db.an(var3, "bb.aq(" + ')');
      }
   }

   public bb() {
      try {
         super();
         this.aq = new int[112];
         this.al = new int[192];
         Arrays.fill(this.aq, 3);
         Arrays.fill(this.al, 3);
      } catch (RuntimeException var1) {
         throw db.an(var1, "bb.<init>(" + ')');
      }
   }

   boolean at(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 <= 1498322871) {
               throw new IllegalStateException();
            }

            if (var1 < 112) {
               return true;
            }

            if (var2 <= 1498322871) {
               throw new IllegalStateException();
            }
         }

         System.out.println("Invalid keycode: " + var1);
         return false;
      } catch (RuntimeException var3) {
         throw db.an(var3, "bb.at(" + ')');
      }
   }

   public boolean az(int var1) {
      return this.at(var1, 1532460789) && (1 == this.aq[var1] || this.aq[var1] == 3);
   }

   public boolean bb(char var1) {
      return this.aa(var1, -1180571319) && (this.al[var1] == 1 || this.al[var1] == 3);
   }

   public int av(char var1) {
      return this.aa(var1, 1490639262) ? this.al[var1] : 0;
   }

   static final void jh(byte var0) {
      try {
         nx.jv(false, -257332846);
         client.jx = 0;
         boolean var1 = true;

         int var2;
         for(var2 = 0; var2 < au.jf.length; ++var2) {
            if (var0 >= 2) {
               throw new IllegalStateException();
            }

            if (ri.jm[var2] != -1) {
               if (var0 >= 2) {
                  throw new IllegalStateException();
               }

               if (null == au.jf[var2]) {
                  if (var0 >= 2) {
                     throw new IllegalStateException();
                  }

                  au.jf[var2] = nn.fy.bh(ri.jm[var2], 0, (byte)-3);
                  if (null == au.jf[var2]) {
                     if (var0 >= 2) {
                        throw new IllegalStateException();
                     }

                     var1 = false;
                     client.jx += 1047178289;
                  }
               }
            }

            if (-1 != nd.jn[var2]) {
               if (var0 >= 2) {
                  throw new IllegalStateException();
               }

               if (cr.jw[var2] == null) {
                  if (var0 >= 2) {
                     throw new IllegalStateException();
                  }

                  cr.jw[var2] = nn.fy.bw(nd.jn[var2], 0, jj.jd[var2], 1509594220);
                  if (null == cr.jw[var2]) {
                     var1 = false;
                     client.jx += 1047178289;
                  }
               }
            }
         }

         if (!var1) {
            if (var0 >= 2) {
               throw new IllegalStateException();
            } else {
               client.je = -1672521981;
            }
         } else {
            client.jk = 0;
            var1 = true;

            int var4;
            int var5;
            for(var2 = 0; var2 < au.jf.length; ++var2) {
               byte[] var3 = cr.jw[var2];
               if (null != var3) {
                  if (var0 >= 2) {
                     throw new IllegalStateException();
                  }

                  var4 = 64 * (kk.jj[var2] >> 8) - -1232093375 * jm.ib;
                  var5 = (kk.jj[var2] & 255) * 64 - jj.jc * 827352769;
                  if (client.jv) {
                     if (var0 >= 2) {
                        throw new IllegalStateException();
                     }

                     var4 = 10;
                     var5 = 10;
                  }

                  var1 &= hj.al(var3, var4, var5, -1749443577);
               }
            }

            if (!var1) {
               if (var0 >= 2) {
                  throw new IllegalStateException();
               } else {
                  client.je = 949923334;
               }
            } else {
               if (client.je * -2139010133 != 0) {
                  jl.ij(mk.ao + dq.aq + dq.ac + 100 + "%" + dq.au, true, -201966709);
               }

               mj.hz(-1516087837);
               bx.js.af();

               for(var2 = 0; var2 < 4; ++var2) {
                  if (var0 >= 2) {
                     throw new IllegalStateException();
                  }

                  client.jr[var2].af(1586981298);
               }

               int var17;
               for(var2 = 0; var2 < 4; ++var2) {
                  if (var0 >= 2) {
                     throw new IllegalStateException();
                  }

                  for(var17 = 0; var17 < 104; ++var17) {
                     if (var0 >= 2) {
                        return;
                     }

                     for(var4 = 0; var4 < 104; ++var4) {
                        if (var0 >= 2) {
                           throw new IllegalStateException();
                        }

                        cd.an[var2][var17][var4] = 0;
                     }
                  }
               }

               mj.hz(-2031327751);
               fx.af(-876753180);
               var2 = au.jf.length;
               ht.af((byte)1);
               nx.jv(true, -2038260768);
               int var19;
               if (!client.jv) {
                  if (var0 >= 2) {
                     throw new IllegalStateException();
                  }

                  byte[] var6;
                  for(var17 = 0; var17 < var2; ++var17) {
                     var4 = (kk.jj[var17] >> 8) * 64 - -1232093375 * jm.ib;
                     var5 = (kk.jj[var17] & 255) * 64 - jj.jc * 827352769;
                     var6 = au.jf[var17];
                     if (var6 != null) {
                        if (var0 >= 2) {
                           throw new IllegalStateException();
                        }

                        mj.hz(-1243741842);
                        je.ac(var6, var4, var5, bi.ji * 856658440 - 48, qj.jg * 370541272 - 48, client.jr, 960745047);
                     }
                  }

                  for(var17 = 0; var17 < var2; ++var17) {
                     if (var0 >= 2) {
                        throw new IllegalStateException();
                     }

                     var4 = (kk.jj[var17] >> 8) * 64 - jm.ib * -1232093375;
                     var5 = (kk.jj[var17] & 255) * 64 - 827352769 * jj.jc;
                     var6 = au.jf[var17];
                     if (null == var6) {
                        if (var0 >= 2) {
                           throw new IllegalStateException();
                        }

                        if (qj.jg * 583188571 < 800) {
                           if (var0 >= 2) {
                              throw new IllegalStateException();
                           }

                           mj.hz(-1415151785);
                           ew.aw(var4, var5, 64, 64, -1549240794);
                        }
                     }
                  }

                  nx.jv(true, -571357084);

                  for(var17 = 0; var17 < var2; ++var17) {
                     if (var0 >= 2) {
                        throw new IllegalStateException();
                     }

                     byte[] var18 = cr.jw[var17];
                     if (null != var18) {
                        if (var0 >= 2) {
                           throw new IllegalStateException();
                        }

                        var5 = 64 * (kk.jj[var17] >> 8) - jm.ib * -1232093375;
                        var19 = 64 * (kk.jj[var17] & 255) - jj.jc * 827352769;
                        mj.hz(-88806239);
                        fq.at(var18, var5, var19, bx.js, client.jr, 1108782763);
                     }
                  }
               }

               int var7;
               int var8;
               int var9;
               if (client.jv) {
                  if (var0 >= 2) {
                     throw new IllegalStateException();
                  }

                  int var10;
                  int var11;
                  int var12;
                  for(var17 = 0; var17 < 4; ++var17) {
                     if (var0 >= 2) {
                        return;
                     }

                     mj.hz(-191987301);

                     for(var4 = 0; var4 < 13; ++var4) {
                        if (var0 >= 2) {
                           throw new IllegalStateException();
                        }

                        for(var5 = 0; var5 < 13; ++var5) {
                           if (var0 >= 2) {
                              throw new IllegalStateException();
                           }

                           boolean var20 = false;
                           var7 = client.jh[var17][var4][var5];
                           if (-1 != var7) {
                              var8 = var7 >> 24 & 3;
                              var9 = var7 >> 1 & 3;
                              var10 = var7 >> 14 & 1023;
                              var11 = var7 >> 3 & 2047;
                              var12 = (var10 / 8 << 8) + var11 / 8;

                              for(int var13 = 0; var13 < kk.jj.length; ++var13) {
                                 if (var12 == kk.jj[var13]) {
                                    if (var0 >= 2) {
                                       throw new IllegalStateException();
                                    }

                                    if (null != au.jf[var13]) {
                                       if (var0 >= 2) {
                                          throw new IllegalStateException();
                                       }

                                       int var14 = 8 * (var10 - var4);
                                       int var15 = 8 * (var11 - var5);
                                       as.au(au.jf[var13], var17, var4 * 8, var5 * 8, var8, 8 * (var10 & 7), 8 * (var11 & 7), var9, var14, var15, client.jr, 146668751);
                                       var20 = true;
                                       break;
                                    }
                                 }
                              }
                           }

                           if (!var20) {
                              if (var0 >= 2) {
                                 throw new IllegalStateException();
                              }

                              im.ab(var17, 8 * var4, 8 * var5, 2117448791);
                           }
                        }
                     }
                  }

                  for(var17 = 0; var17 < 13; ++var17) {
                     if (var0 >= 2) {
                        throw new IllegalStateException();
                     }

                     for(var4 = 0; var4 < 13; ++var4) {
                        if (var0 >= 2) {
                           throw new IllegalStateException();
                        }

                        var5 = client.jh[0][var17][var4];
                        if (-1 == var5) {
                           if (var0 >= 2) {
                              throw new IllegalStateException();
                           }

                           ew.aw(8 * var17, 8 * var4, 8, 8, -616825573);
                        }
                     }
                  }

                  nx.jv(true, -700064780);

                  for(var17 = 0; var17 < 4; ++var17) {
                     if (var0 >= 2) {
                        return;
                     }

                     mj.hz(-260351052);

                     for(var4 = 0; var4 < 13; ++var4) {
                        if (var0 >= 2) {
                           return;
                        }

                        for(var5 = 0; var5 < 13; ++var5) {
                           if (var0 >= 2) {
                              throw new IllegalStateException();
                           }

                           var19 = client.jh[var17][var4][var5];
                           if (-1 != var19) {
                              if (var0 >= 2) {
                                 throw new IllegalStateException();
                              }

                              var7 = var19 >> 24 & 3;
                              var8 = var19 >> 1 & 3;
                              var9 = var19 >> 14 & 1023;
                              var10 = var19 >> 3 & 2047;
                              var11 = (var9 / 8 << 8) + var10 / 8;

                              for(var12 = 0; var12 < kk.jj.length; ++var12) {
                                 if (kk.jj[var12] == var11 && null != cr.jw[var12]) {
                                    if (var0 >= 2) {
                                       throw new IllegalStateException();
                                    }

                                    cd.aa(cr.jw[var12], var17, 8 * var4, var5 * 8, var7, 8 * (var9 & 7), (var10 & 7) * 8, var8, bx.js, client.jr);
                                    break;
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               nx.jv(true, -2115197145);
               mj.hz(-672430337);
               ay.ao(bx.js, client.jr, 1670427112);
               nx.jv(true, -1650688963);
               var17 = cd.aw * 1401144457;
               if (var17 > -1727408401 * bm.mh) {
                  var17 = -1727408401 * bm.mh;
               }

               if (var17 < bm.mh * -1727408401 - 1) {
                  if (var0 >= 2) {
                     throw new IllegalStateException();
                  }

                  var17 = bm.mh * -1727408401 - 1;
               }

               if (client.cu) {
                  if (var0 >= 2) {
                     throw new IllegalStateException();
                  }

                  bx.js.an(1401144457 * cd.aw);
               } else {
                  bx.js.an(0);
               }

               for(var4 = 0; var4 < 104; ++var4) {
                  if (var0 >= 2) {
                     throw new IllegalStateException();
                  }

                  for(var5 = 0; var5 < 104; ++var5) {
                     if (var0 >= 2) {
                        throw new IllegalStateException();
                     }

                     em.kd(var4, var5, 1957371418);
                  }
               }

               mj.hz(-157026810);
               ap.jl((byte)98);
               hq.au.ac();
               lg var21;
               if (ck.bc.bf(972866614)) {
                  var21 = mi.an(lv.bt, client.in.au, (short)-32448);
                  var21.aw.ba(1057001181, -2081835031);
                  client.in.aw(var21, 414135591);
               }

               if (!client.jv) {
                  if (var0 >= 2) {
                     throw new IllegalStateException();
                  }

                  var4 = (1717695041 * bi.ji - 6) / 8;
                  var5 = (6 + bi.ji * 1717695041) / 8;
                  var19 = (qj.jg * 583188571 - 6) / 8;
                  var7 = (qj.jg * 583188571 + 6) / 8;

                  for(var8 = var4 - 1; var8 <= var5 + 1; ++var8) {
                     if (var0 >= 2) {
                        return;
                     }

                     for(var9 = var19 - 1; var9 <= 1 + var7; ++var9) {
                        if (var8 >= var4) {
                           if (var0 >= 2) {
                              throw new IllegalStateException();
                           }

                           if (var8 <= var5) {
                              if (var0 >= 2) {
                                 throw new IllegalStateException();
                              }

                              if (var9 >= var19) {
                                 if (var0 >= 2) {
                                    throw new IllegalStateException();
                                 }

                                 if (var9 <= var7) {
                                    if (var0 >= 2) {
                                       throw new IllegalStateException();
                                    }
                                    continue;
                                 }
                              }
                           }
                        }

                        nn.fy.cw("m" + var8 + "_" + var9, -1282619653);
                        nn.fy.cw("l" + var8 + "_" + var9, -313363047);
                     }
                  }
               }

               fd.hi(30, 642468106);
               mj.hz(-1669485535);
               iv.an(-407537410);
               var21 = mi.an(lv.ch, client.in.au, (short)-21);
               client.in.aw(var21, 414135591);
               df.bz(599275396);
            }
         }
      } catch (RuntimeException var16) {
         throw db.an(var16, "bb.jh(" + ')');
      }
   }

   public boolean ad(int var1) {
      return this.at(var1, 1790299204) && (1 == this.aq[var1] || this.aq[var1] == 3);
   }

   public void ag(char var1, int var2) {
      if (this.aa(var1, -1979034536) && this.ay(var2, 1995558913)) {
         this.al[var1] = var2;
      }

   }

   public int ah(int var1) {
      return this.at(var1, 1504697222) ? this.aq[var1] : 0;
   }

   public void ax(int var1, int var2) {
      if (this.at(var1, 1971727998) && this.ay(var2, 553084632)) {
         this.aq[var1] = var2;
      }

   }

   public int ar(char var1) {
      return this.aa(var1, 733712150) ? this.al[var1] : 0;
   }

   public int am(char var1) {
      return this.aa(var1, -1383605128) ? this.al[var1] : 0;
   }

   public int as(char var1) {
      return this.aa(var1, 1001144796) ? this.al[var1] : 0;
   }

   public int aj(char var1) {
      return this.aa(var1, 944330166) ? this.al[var1] : 0;
   }

   boolean ay(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 <= 427135973) {
               throw new IllegalStateException();
            }

            if (var1 < 4) {
               return true;
            }
         }

         System.out.println("Invalid mode: " + var1);
         return false;
      } catch (RuntimeException var3) {
         throw db.an(var3, "bb.ay(" + ')');
      }
   }

   boolean bn(char var1) {
      if (var1 >= 0 && var1 < -1062561337) {
         return true;
      } else {
         System.out.println("Invalid keychar: " + var1);
         return false;
      }
   }

   public boolean bo(char var1) {
      return this.aa(var1, 1789508296) && (2 == this.al[var1] || 3 == this.al[var1]);
   }

   public boolean ae(char var1) {
      return this.aa(var1, -1630194036) && (this.al[var1] == 1 || this.al[var1] == 3);
   }

   public boolean ap(char var1) {
      return this.aa(var1, -632204581) && (this.al[var1] == 1 || this.al[var1] == 3);
   }

   public boolean by(char var1) {
      return this.aa(var1, 1721285365) && (this.al[var1] == 1 || this.al[var1] == 3);
   }

   public boolean bk(int var1) {
      return this.at(var1, 1953201152) && (this.aq[var1] == 2 || 3 == this.aq[var1]);
   }

   public void ao(int var1, int var2) {
      if (this.at(var1, 1930305003) && this.ay(var2, 910053813)) {
         this.aq[var1] = var2;
      }

   }

   public boolean be(int var1) {
      return this.at(var1, 1549086882) && (this.aq[var1] == 2 || 3 == this.aq[var1]);
   }

   public boolean ak(int var1) {
      return this.at(var1, 1558246267) && (1 == this.aq[var1] || this.aq[var1] == 3);
   }

   public boolean bx(int var1) {
      return this.at(var1, 1707674327) && (this.aq[var1] == 2 || 3 == this.aq[var1]);
   }

   public void ai(int var1, int var2) {
      if (this.at(var1, 1871660919) && this.ay(var2, 1320113607)) {
         this.aq[var1] = var2;
      }

   }

   public boolean bz(char var1) {
      return this.aa(var1, -1435819184) && (2 == this.al[var1] || 3 == this.al[var1]);
   }

   boolean bd(int var1) {
      if (var1 >= 0 && var1 < 112) {
         return true;
      } else {
         System.out.println("Invalid keycode: " + var1);
         return false;
      }
   }

   public boolean al(char var1, int var2) {
      try {
         boolean var10000;
         label39: {
            if (this.aa(var1, 1305668583)) {
               if (var2 == 1565577319) {
                  throw new IllegalStateException();
               }

               if (2 == this.al[var1]) {
                  break label39;
               }

               if (var2 == 1565577319) {
                  throw new IllegalStateException();
               }

               if (3 == this.al[var1]) {
                  if (var2 == 1565577319) {
                     throw new IllegalStateException();
                  }
                  break label39;
               }
            }

            var10000 = false;
            return var10000;
         }

         var10000 = true;
         return var10000;
      } catch (RuntimeException var3) {
         throw db.an(var3, "bb.al(" + ')');
      }
   }

   boolean bt(int var1) {
      if (var1 >= 0 && var1 < -1900326645) {
         return true;
      } else {
         System.out.println("Invalid keycode: " + var1);
         return false;
      }
   }

   boolean bj(int var1) {
      if (var1 >= 0 && var1 < 112) {
         return true;
      } else {
         System.out.println("Invalid keycode: " + var1);
         return false;
      }
   }

   public boolean bm(char var1) {
      return this.aa(var1, 271823641) && (2 == this.al[var1] || 3 == this.al[var1]);
   }

   boolean bs(char var1) {
      if (var1 >= 0 && var1 < 192) {
         return true;
      } else {
         System.out.println("Invalid keychar: " + var1);
         return false;
      }
   }

   boolean aa(char var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 == -1958823801) {
               throw new IllegalStateException();
            }

            if (var1 < 192) {
               return true;
            }

            if (var2 == -1958823801) {
               throw new IllegalStateException();
            }
         }

         System.out.println("Invalid keychar: " + var1);
         return false;
      } catch (RuntimeException var3) {
         throw db.an(var3, "bb.aa(" + ')');
      }
   }
}
