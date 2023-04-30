import accessors.RSClientScriptFrame;

public class ck implements RSClientScriptFrame {
   static final int ml = 2;
   int an;
   ch af;
   String[] ac;
   static client bc;
   int[] aw;
   static final int wo = 14;
   static final String ht = "jagex.disableBouncyCastle";
   static int ug;

   ck() {
      try {
         super();
         this.an = 1031782053;
      } catch (RuntimeException var1) {
         throw db.an(var1, "ck.<init>(" + ')');
      }
   }

   static final void mg(double var0) {
      try {
         am.an(var0);
         ((im)in.ab.aq).an(var0);
         ec.aj(1285226307);
         aj.vb.ah(var0);
      } catch (RuntimeException var2) {
         throw db.an(var2, "ck.mg(" + ')');
      }
   }

   static final void ls(int var0, int var1, int var2, int var3, int var4) {
      try {
         if (-303899309 * client.oq == 0) {
            if (var4 != -1708655552) {
               throw new IllegalStateException();
            }

            if (!client.om) {
               if (var4 != -1708655552) {
                  throw new IllegalStateException();
               }

               cb.kz(mk.gc, "", 23, 0, var0 - var2, var1 - var3, (byte)116);
            }
         }

         long var5 = -1L;
         long var7 = -1L;

         int var9;
         for(var9 = 0; var9 < ap.af((byte)-10); ++var9) {
            if (var4 != -1708655552) {
               throw new IllegalStateException();
            }

            long var10 = bk.ac(var9, 2061308557);
            if (var7 == var10) {
               if (var4 != -1708655552) {
                  throw new IllegalStateException();
               }
            } else {
               var7 = var10;
               int var12 = ir.au(var9, -1628059522);
               int var13 = ab(var9, -1705605824);
               int var14 = im.al(ix.ag[var9]);
               int var16 = di.at(ix.ag[var9]);
               int var17 = var16;
               int var21;
               int var22;
               if (2 == var14) {
                  if (var4 != -1708655552) {
                     return;
                  }

                  if (bx.js.bk(bm.mh * -1727408401, var12, var13, var10) >= 0) {
                     hq var18 = fw.an(var16, (short)30393);
                     if (null != var18.bu) {
                        if (var4 != -1708655552) {
                           throw new IllegalStateException();
                        }

                        var18 = var18.ao((byte)45);
                     }

                     if (null == var18) {
                        if (var4 != -1708655552) {
                           throw new IllegalStateException();
                        }
                        continue;
                     }

                     dg var19 = null;

                     for(dg var20 = (dg)client.nn.aq(); var20 != null; var20 = (dg)client.nn.at()) {
                        if (var4 != -1708655552) {
                           throw new IllegalStateException();
                        }

                        if (593068225 * var20.af == -1727408401 * bm.mh) {
                           if (var4 != -1708655552) {
                              throw new IllegalStateException();
                           }

                           if (var20.aw * 68300005 == var12 && 800888185 * var20.ac == var13) {
                              if (var4 != -1708655552) {
                                 throw new IllegalStateException();
                              }

                              if (var17 == 552715177 * var20.al) {
                                 if (var4 != -1708655552) {
                                    return;
                                 }

                                 var19 = var20;
                                 break;
                              }
                           }
                        }
                     }

                     if (1 == -303899309 * client.oq) {
                        if (var4 != -1708655552) {
                           throw new IllegalStateException();
                        }

                        cb.kz(mk.gu, client.it + " " + dq.ab + " " + oa.an(65535, -1198768404) + var18.ao, 1, var17, var12, var13, (byte)54);
                     } else if (client.om) {
                        if (var4 != -1708655552) {
                           throw new IllegalStateException();
                        }

                        if ((cj.oo * 1457791911 & 4) == 4) {
                           if (var4 != -1708655552) {
                              return;
                           }

                           cb.kz(client.oj, client.ob + " " + dq.ab + " " + oa.an(65535, 1981502739) + var18.ao, 2, var17, var12, var13, (byte)64);
                        }
                     } else {
                        String[] var30 = var18.bi;
                        if (var30 != null) {
                           if (var4 != -1708655552) {
                              throw new IllegalStateException();
                           }

                           for(var21 = 4; var21 >= 0; --var21) {
                              if (var19 != null) {
                                 if (var4 != -1708655552) {
                                    return;
                                 }

                                 if (!var19.an(var21, -633273091)) {
                                    if (var4 != -1708655552) {
                                       throw new IllegalStateException();
                                    }
                                    continue;
                                 }
                              }

                              if (null != var30[var21]) {
                                 if (var4 != -1708655552) {
                                    return;
                                 }

                                 var22 = 0;
                                 if (0 == var21) {
                                    var22 = 3;
                                 }

                                 if (var21 == 1) {
                                    if (var4 != -1708655552) {
                                       throw new IllegalStateException();
                                    }

                                    var22 = 4;
                                 }

                                 if (var21 == 2) {
                                    if (var4 != -1708655552) {
                                       throw new IllegalStateException();
                                    }

                                    var22 = 5;
                                 }

                                 if (var21 == 3) {
                                    if (var4 != -1708655552) {
                                       throw new IllegalStateException();
                                    }

                                    var22 = 6;
                                 }

                                 if (var21 == 4) {
                                    if (var4 != -1708655552) {
                                       throw new IllegalStateException();
                                    }

                                    var22 = 1001;
                                 }

                                 cb.kz(var30[var21], oa.an(65535, -1061937089) + var18.ao, var22, var17, var12, var13, (byte)120);
                              }
                           }
                        }

                        cb.kz(mk.gh, oa.an(65535, -107881886) + var18.ao, 1002, -1529817365 * var18.at, var12, var13, (byte)73);
                     }
                  }
               }

               int var29;
               df var31;
               int[] var32;
               dv var36;
               if (1 == var14) {
                  if (var4 != -1708655552) {
                     throw new IllegalStateException();
                  }

                  df var26 = client.iu[var17];
                  if (null == var26) {
                     if (var4 != -1708655552) {
                        throw new IllegalStateException();
                     }
                     continue;
                  }

                  if (var26.af.al * 1458410691 == 1) {
                     if (var4 != -1708655552) {
                        throw new IllegalStateException();
                     }

                     if (64 == (var26.bx * 1144428983 & 127) && 64 == (var26.bo * -411750205 & 127)) {
                        if (var4 != -1708655552) {
                           return;
                        }

                        for(var29 = 0; var29 < 265474485 * client.iw; ++var29) {
                           if (var4 != -1708655552) {
                              throw new IllegalStateException();
                           }

                           var31 = client.iu[client.iy[var29]];
                           if (null != var31) {
                              if (var4 != -1708655552) {
                                 throw new IllegalStateException();
                              }

                              if (var26 != var31) {
                                 if (var4 != -1708655552) {
                                    return;
                                 }

                                 if (1458410691 * var31.af.al == 1) {
                                    if (var4 != -1708655552) {
                                       throw new IllegalStateException();
                                    }

                                    if (var26.bx * 1144428983 == var31.bx * 1144428983 && -411750205 * var26.bo == -411750205 * var31.bo) {
                                       if (var4 != -1708655552) {
                                          return;
                                       }

                                       gl.lf(var31, client.iy[var29], var12, var13, (short)31551);
                                    }
                                 }
                              }
                           }
                        }

                        var29 = ds.ab * -2010934433;
                        var32 = ds.aq;

                        for(var21 = 0; var21 < var29; ++var21) {
                           if (var4 != -1708655552) {
                              throw new IllegalStateException();
                           }

                           var36 = client.mc[var32[var21]];
                           if (null != var36) {
                              if (var4 != -1708655552) {
                                 throw new IllegalStateException();
                              }

                              if (1144428983 * var36.bx == 1144428983 * var26.bx) {
                                 if (var4 != -1708655552) {
                                    throw new IllegalStateException();
                                 }

                                 if (-411750205 * var36.bo == var26.bo * -411750205) {
                                    if (var4 != -1708655552) {
                                       throw new IllegalStateException();
                                    }

                                    ct.li(var36, var32[var21], var12, var13, 1402248095);
                                 }
                              }
                           }
                        }
                     }
                  }

                  gl.lf(var26, var17, var12, var13, (short)3751);
               }

               if (0 == var14) {
                  dv var27 = client.mc[var17];
                  if (null == var27) {
                     continue;
                  }

                  if (64 == (1144428983 * var27.bx & 127)) {
                     if (var4 != -1708655552) {
                        throw new IllegalStateException();
                     }

                     if (64 == (-411750205 * var27.bo & 127)) {
                        for(var29 = 0; var29 < client.iw * 265474485; ++var29) {
                           if (var4 != -1708655552) {
                              throw new IllegalStateException();
                           }

                           var31 = client.iu[client.iy[var29]];
                           if (var31 != null) {
                              if (var4 != -1708655552) {
                                 throw new IllegalStateException();
                              }

                              if (1458410691 * var31.af.al == 1) {
                                 if (var4 != -1708655552) {
                                    throw new IllegalStateException();
                                 }

                                 if (1144428983 * var27.bx == var31.bx * 1144428983) {
                                    if (var4 != -1708655552) {
                                       throw new IllegalStateException();
                                    }

                                    if (var31.bo * -411750205 == var27.bo * -411750205) {
                                       if (var4 != -1708655552) {
                                          throw new IllegalStateException();
                                       }

                                       gl.lf(var31, client.iy[var29], var12, var13, (short)25450);
                                    }
                                 }
                              }
                           }
                        }

                        var29 = ds.ab * -2010934433;
                        var32 = ds.aq;

                        for(var21 = 0; var21 < var29; ++var21) {
                           if (var4 != -1708655552) {
                              return;
                           }

                           var36 = client.mc[var32[var21]];
                           if (null != var36) {
                              if (var4 != -1708655552) {
                                 throw new IllegalStateException();
                              }

                              if (var27 != var36) {
                                 if (var4 != -1708655552) {
                                    throw new IllegalStateException();
                                 }

                                 if (1144428983 * var27.bx == var36.bx * 1144428983) {
                                    if (var4 != -1708655552) {
                                       throw new IllegalStateException();
                                    }

                                    if (-411750205 * var36.bo == -411750205 * var27.bo) {
                                       if (var4 != -1708655552) {
                                          throw new IllegalStateException();
                                       }

                                       ct.li(var36, var32[var21], var12, var13, 1402248095);
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }

                  if (var17 != client.nl * -1565733637) {
                     if (var4 != -1708655552) {
                        return;
                     }

                     ct.li(var27, var17, var12, var13, 1402248095);
                  } else {
                     var5 = var10;
                  }
               }

               if (var14 == 3) {
                  if (var4 != -1708655552) {
                     throw new IllegalStateException();
                  }

                  nh var28 = client.nr[-1727408401 * bm.mh][var12][var13];
                  if (null != var28) {
                     if (var4 != -1708655552) {
                        throw new IllegalStateException();
                     }

                     for(dx var33 = (dx)var28.al(); null != var33; var33 = (dx)var28.aa()) {
                        hz var34 = dh.af(176307405 * var33.af, (byte)127);
                        if (1 == client.oq * -303899309) {
                           if (var4 != -1708655552) {
                              throw new IllegalStateException();
                           }

                           cb.kz(mk.gu, client.it + " " + dq.ab + " " + oa.an(16748608, -1283759671) + var34.ah, 16, var33.af * 176307405, var12, var13, (byte)81);
                        } else if (client.om) {
                           if (var4 != -1708655552) {
                              return;
                           }

                           if (1 == (1457791911 * cj.oo & 1)) {
                              if (var4 != -1708655552) {
                                 return;
                              }

                              cb.kz(client.oj, client.ob + " " + dq.ab + " " + oa.an(16748608, -25704293) + var34.ah, 17, 176307405 * var33.af, var12, var13, (byte)67);
                           }
                        } else {
                           String[] var35 = var34.bm;

                           for(var22 = 4; var22 >= 0; --var22) {
                              if (var4 != -1708655552) {
                                 throw new IllegalStateException();
                              }

                              if (!var33.aw(var22, 1791885272)) {
                                 if (var4 != -1708655552) {
                                    return;
                                 }
                              } else {
                                 if (var35 != null) {
                                    if (var4 != -1708655552) {
                                       throw new IllegalStateException();
                                    }

                                    if (var35[var22] != null) {
                                       if (var4 != -1708655552) {
                                          return;
                                       }

                                       byte var23 = 0;
                                       if (var22 == 0) {
                                          var23 = 18;
                                       }

                                       if (var22 == 1) {
                                          if (var4 != -1708655552) {
                                             throw new IllegalStateException();
                                          }

                                          var23 = 19;
                                       }

                                       if (var22 == 2) {
                                          if (var4 != -1708655552) {
                                             throw new IllegalStateException();
                                          }

                                          var23 = 20;
                                       }

                                       if (var22 == 3) {
                                          if (var4 != -1708655552) {
                                             return;
                                          }

                                          var23 = 21;
                                       }

                                       if (4 == var22) {
                                          if (var4 != -1708655552) {
                                             throw new IllegalStateException();
                                          }

                                          var23 = 22;
                                       }

                                       cb.kz(var35[var22], oa.an(16748608, 942127261) + var34.ah, var23, 176307405 * var33.af, var12, var13, (byte)90);
                                       continue;
                                    }
                                 }

                                 if (var22 == 2) {
                                    if (var4 != -1708655552) {
                                       throw new IllegalStateException();
                                    }

                                    cb.kz(mk.an, oa.an(16748608, 1669674345) + var34.ah, 20, 176307405 * var33.af, var12, var13, (byte)102);
                                 }
                              }
                           }

                           cb.kz(mk.gh, oa.an(16748608, 80782411) + var34.ah, 1004, var33.af * 176307405, var12, var13, (byte)40);
                        }
                     }
                  }
               }
            }
         }

         if (var5 != -1L) {
            var9 = (int)(var5 >>> 0 & 127L);
            int var11 = hs.aq(var5);
            dv var25 = client.mc[client.nl * -1565733637];
            ct.li(var25, -1565733637 * client.nl, var9, var11, 1402248095);
         }

      } catch (RuntimeException var24) {
         throw db.an(var24, "ck.ls(" + ')');
      }
   }

   static void nt(String var0, byte var1) {
      try {
         ef.cm = var0;

         try {
            String var2 = bc.getParameter(Integer.toString(18));
            String var3 = bc.getParameter(Integer.toString(13));
            String var4 = var2 + "settings=" + var0 + "; version=1; path=/; domain=" + var3;
            if (var0.length() == 0) {
               if (var1 == 99) {
                  throw new IllegalStateException();
               }

               var4 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
               var4 = var4 + "; Expires=" + fo.af(dq.af(-257579037) + 94608000000L) + "; Max-Age=" + 94608000L;
            }

            by.af(bc, "document.cookie=\"" + var4 + "\"", (byte)90);
         } catch (Throwable var5) {
         }

      } catch (RuntimeException var6) {
         throw db.an(var6, "ck.nt(" + ')');
      }
   }

   public static int ab(int var0, int var1) {
      try {
         return hs.aq(ix.ag[var0]);
      } catch (RuntimeException var2) {
         throw db.an(var2, "ck.ab(" + ')');
      }
   }
}
