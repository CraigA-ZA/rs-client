import accessors.RSWorldMapAreaData;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class kk extends js implements RSWorldMapAreaData {
   List ag;
   HashSet ax;
   public static final int ah = 12;
   HashSet ai;
   static int[] jj;

   void cv(sg var1, boolean var2) {
      this.ag = new LinkedList();
      int var3 = var1.cl(-2031356606);

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = var1.do(-28531776);
         lb var6 = new lb(var1.cx(-1211129751));
         boolean var7 = var1.cm((byte)7) == 1;
         if (var2 || !var7) {
            this.ag.add(new jt((lb)null, var6, var5, (ku)null));
         }
      }

   }

   void cl(sg var1, sg var2, int var3, boolean var4, byte var5) {
      try {
         this.af(var1, var3, (byte)18);
         int var6 = var2.cl(-707598822);
         this.ax = new HashSet(var6);

         int var7;
         for(var7 = 0; var7 < var6; ++var7) {
            if (var5 == 1) {
               throw new IllegalStateException();
            }

            jm var8 = new jm();

            try {
               var8.af(var2, -1901491736);
            } catch (IllegalStateException var12) {
               continue;
            }

            this.ax.add(var8);
         }

         var7 = var2.cl(-541249217);
         this.ai = new HashSet(var7);

         for(int var14 = 0; var14 < var7; ++var14) {
            if (var5 == 1) {
               throw new IllegalStateException();
            }

            jh var9 = new jh();

            try {
               var9.af(var2, 1529906024);
            } catch (IllegalStateException var11) {
               continue;
            }

            this.ai.add(var9);
         }

         this.cg(var2, var4, 1022421975);
      } catch (RuntimeException var13) {
         throw db.an(var13, "kk.cl(" + ')');
      }
   }

   void cb(sg var1, boolean var2) {
      this.ag = new LinkedList();
      int var3 = var1.cl(-1998958587);

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = var1.do(1282002574);
         lb var6 = new lb(var1.cx(-1067443890));
         boolean var7 = var1.cm((byte)7) == 1;
         if (var2 || !var7) {
            this.ag.add(new jt((lb)null, var6, var5, (ku)null));
         }
      }

   }

   void cr(sg var1, sg var2, int var3, boolean var4) {
      this.af(var1, var3, (byte)24);
      int var5 = var2.cl(-758521105);
      this.ax = new HashSet(var5);

      int var6;
      for(var6 = 0; var6 < var5; ++var6) {
         jm var7 = new jm();

         try {
            var7.af(var2, 1432634769);
         } catch (IllegalStateException var11) {
            continue;
         }

         this.ax.add(var7);
      }

      var6 = var2.cl(-675842663);
      this.ai = new HashSet(var6);

      for(int var12 = 0; var12 < var6; ++var12) {
         jh var8 = new jh();

         try {
            var8.af(var2, 2051577769);
         } catch (IllegalStateException var10) {
            continue;
         }

         this.ai.add(var8);
      }

      this.cg(var2, var4, 296734291);
   }

   void cy(sg var1, boolean var2) {
      this.ag = new LinkedList();
      int var3 = var1.cl(-2124907656);

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = var1.do(520955335);
         lb var6 = new lb(var1.cx(-938969125));
         boolean var7 = var1.cm((byte)7) == 1;
         if (var2 || !var7) {
            this.ag.add(new jt((lb)null, var6, var5, (ku)null));
         }
      }

   }

   kk() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw db.an(var1, "kk.<init>(" + ')');
      }
   }

   void cg(sg var1, boolean var2, int var3) {
      try {
         this.ag = new LinkedList();
         int var4 = var1.cl(-1524494369);

         for(int var5 = 0; var5 < var4; ++var5) {
            if (var3 <= -1633313603) {
               throw new IllegalStateException();
            }

            int var6 = var1.do(1051942603);
            lb var7 = new lb(var1.cx(-1970417183));
            boolean var10000;
            if (var1.cm((byte)7) == 1) {
               if (var3 <= -1633313603) {
                  return;
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            boolean var8 = var10000;
            if (!var2) {
               if (var3 <= -1633313603) {
                  return;
               }

               if (var8) {
                  continue;
               }
            }

            this.ag.add(new jt((lb)null, var7, var6, (ku)null));
         }

      } catch (RuntimeException var9) {
         throw db.an(var9, "kk.cg(" + ')');
      }
   }

   void cx(sg var1, boolean var2) {
      this.ag = new LinkedList();
      int var3 = var1.cl(35183519);

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = var1.do(1191960084);
         lb var6 = new lb(var1.cx(-1478364856));
         boolean var7 = var1.cm((byte)7) == 1;
         if (var2 || !var7) {
            this.ag.add(new jt((lb)null, var6, var5, (ku)null));
         }
      }

   }

   static int bi(int var0, ch var1, boolean var2, int var3) {
      try {
         if (var0 == 3600) {
            if (var3 != 1038224910) {
               throw new IllegalStateException();
            } else {
               if (cl.vt.aq * -1736413869 == 0) {
                  if (var3 != 1038224910) {
                     throw new IllegalStateException();
                  }

                  cy.al[(cy.at += 427135973) * -964267539 - 1] = -2;
               } else if (cl.vt.aq * -1736413869 == 1) {
                  cy.al[(cy.at += 427135973) * -964267539 - 1] = -1;
               } else {
                  cy.al[(cy.at += 427135973) * -964267539 - 1] = cl.vt.au.bm(-348042385);
               }

               return 1;
            }
         } else {
            int var10;
            if (3601 == var0) {
               if (var3 != 1038224910) {
                  throw new IllegalStateException();
               } else {
                  var10 = cy.al[(cy.at -= 427135973) * -964267539];
                  if (cl.vt.af(-405500659)) {
                     if (var3 != 1038224910) {
                        throw new IllegalStateException();
                     }

                     if (var10 >= 0) {
                        if (var3 != 1038224910) {
                           throw new IllegalStateException();
                        }

                        if (var10 < cl.vt.au.bm(1190824187)) {
                           if (var3 != 1038224910) {
                              throw new IllegalStateException();
                           }

                           pr var9 = (pr)cl.vt.au.bq(var10, 963304822);
                           cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = var9.bk(-238021346);
                           cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = var9.bx(-43557433);
                           return 1;
                        }
                     }
                  }

                  cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = "";
                  cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = "";
                  return 1;
               }
            } else if (var0 == 3602) {
               var10 = cy.al[(cy.at -= 427135973) * -964267539];
               if (cl.vt.af(730650293)) {
                  if (var3 != 1038224910) {
                     throw new IllegalStateException();
                  }

                  if (var10 >= 0 && var10 < cl.vt.au.bm(1611004102)) {
                     if (var3 != 1038224910) {
                        throw new IllegalStateException();
                     }

                     cy.al[(cy.at += 427135973) * -964267539 - 1] = ((pb)cl.vt.au.bq(var10, 882370308)).au * 177258591;
                     return 1;
                  }
               }

               cy.al[(cy.at += 427135973) * -964267539 - 1] = 0;
               return 1;
            } else if (3603 == var0) {
               var10 = cy.al[(cy.at -= 427135973) * -964267539];
               if (cl.vt.af(654615523)) {
                  if (var3 != 1038224910) {
                     throw new IllegalStateException();
                  }

                  if (var10 >= 0) {
                     if (var3 != 1038224910) {
                        throw new IllegalStateException();
                     }

                     if (var10 < cl.vt.au.bm(1236419289)) {
                        if (var3 != 1038224910) {
                           throw new IllegalStateException();
                        }

                        cy.al[(cy.at += 427135973) * -964267539 - 1] = ((pb)cl.vt.au.bq(var10, 1924376358)).aq * 1922414955;
                        return 1;
                     }
                  }
               }

               cy.al[(cy.at += 427135973) * -964267539 - 1] = 0;
               return 1;
            } else {
               String var11;
               if (3604 == var0) {
                  if (var3 != 1038224910) {
                     throw new IllegalStateException();
                  } else {
                     var11 = cy.aa[(dm.ay -= -1086551379) * -2017760987];
                     int var8 = cy.al[(cy.at -= 427135973) * -964267539];
                     dp.ar(var11, var8, (byte)-36);
                     return 1;
                  }
               } else if (3605 == var0) {
                  var11 = cy.aa[(dm.ay -= -1086551379) * -2017760987];
                  cl.vt.al(var11, (byte)-60);
                  return 1;
               } else if (3606 == var0) {
                  if (var3 != 1038224910) {
                     throw new IllegalStateException();
                  } else {
                     var11 = cy.aa[(dm.ay -= -1086551379) * -2017760987];
                     cl.vt.ah(var11, -1657474548);
                     return 1;
                  }
               } else if (var0 == 3607) {
                  var11 = cy.aa[(dm.ay -= -1086551379) * -2017760987];
                  cl.vt.ax(var11, 42988923);
                  return 1;
               } else if (var0 == 3608) {
                  if (var3 != 1038224910) {
                     throw new IllegalStateException();
                  } else {
                     var11 = cy.aa[(dm.ay -= -1086551379) * -2017760987];
                     boolean var7 = true;
                     cl.vt.av(var11, var7, (byte)49);
                     return 1;
                  }
               } else {
                  byte var12;
                  int[] var13;
                  int var10001;
                  if (var0 == 3609) {
                     if (var3 != 1038224910) {
                        throw new IllegalStateException();
                     } else {
                        var11 = cy.aa[(dm.ay -= -1086551379) * -2017760987];
                        var11 = ne.nh(var11, 1227239523);
                        var13 = cy.al;
                        var10001 = (cy.at += 427135973) * -964267539 - 1;
                        if (cl.vt.ab(new tm(var11, co.cn), false, (byte)-51)) {
                           if (var3 != 1038224910) {
                              throw new IllegalStateException();
                           }

                           var12 = 1;
                        } else {
                           var12 = 0;
                        }

                        var13[var10001] = var12;
                        return 1;
                     }
                  } else if (var0 == 3611) {
                     if (var3 != 1038224910) {
                        throw new IllegalStateException();
                     } else {
                        if (es.sb != null) {
                           if (var3 != 1038224910) {
                              throw new IllegalStateException();
                           }

                           cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = es.sb.ac;
                        } else {
                           cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = "";
                        }

                        return 1;
                     }
                  } else if (var0 == 3612) {
                     if (var3 != 1038224910) {
                        throw new IllegalStateException();
                     } else {
                        if (es.sb != null) {
                           cy.al[(cy.at += 427135973) * -964267539 - 1] = es.sb.bm(1196697260);
                        } else {
                           cy.al[(cy.at += 427135973) * -964267539 - 1] = 0;
                        }

                        return 1;
                     }
                  } else if (var0 == 3613) {
                     if (var3 != 1038224910) {
                        throw new IllegalStateException();
                     } else {
                        var10 = cy.al[(cy.at -= 427135973) * -964267539];
                        if (null != es.sb && var10 < es.sb.bm(1742835252)) {
                           if (var3 != 1038224910) {
                              throw new IllegalStateException();
                           }

                           cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = es.sb.bq(var10, 534440360).be(473993579).af(-710264960);
                        } else {
                           cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = "";
                        }

                        return 1;
                     }
                  } else if (var0 == 3614) {
                     if (var3 != 1038224910) {
                        throw new IllegalStateException();
                     } else {
                        var10 = cy.al[(cy.at -= 427135973) * -964267539];
                        if (es.sb != null && var10 < es.sb.bm(1290906441)) {
                           if (var3 != 1038224910) {
                              throw new IllegalStateException();
                           }

                           cy.al[(cy.at += 427135973) * -964267539 - 1] = ((pb)es.sb.bq(var10, -438427501)).bq(129347781);
                        } else {
                           cy.al[(cy.at += 427135973) * -964267539 - 1] = 0;
                        }

                        return 1;
                     }
                  } else if (3615 == var0) {
                     if (var3 != 1038224910) {
                        throw new IllegalStateException();
                     } else {
                        var10 = cy.al[(cy.at -= 427135973) * -964267539];
                        if (null != es.sb) {
                           if (var3 != 1038224910) {
                              throw new IllegalStateException();
                           }

                           if (var10 < es.sb.bm(-957593587)) {
                              if (var3 != 1038224910) {
                                 throw new IllegalStateException();
                              }

                              cy.al[(cy.at += 427135973) * -964267539 - 1] = ((pb)es.sb.bq(var10, 1925231499)).aq * 1922414955;
                              return 1;
                           }
                        }

                        cy.al[(cy.at += 427135973) * -964267539 - 1] = 0;
                        return 1;
                     }
                  } else if (3616 == var0) {
                     var13 = cy.al;
                     var10001 = (cy.at += 427135973) * -964267539 - 1;
                     if (es.sb != null) {
                        if (var3 != 1038224910) {
                           throw new IllegalStateException();
                        }

                        var12 = es.sb.ab;
                     } else {
                        var12 = 0;
                     }

                     var13[var10001] = var12;
                     return 1;
                  } else if (3617 == var0) {
                     if (var3 != 1038224910) {
                        throw new IllegalStateException();
                     } else {
                        var11 = cy.aa[(dm.ay -= -1086551379) * -2017760987];
                        sh.nm(var11, (byte)90);
                        return 1;
                     }
                  } else {
                     int var10002;
                     if (3618 == var0) {
                        if (var3 != 1038224910) {
                           throw new IllegalStateException();
                        } else {
                           var13 = cy.al;
                           var10001 = (cy.at += 427135973) * -964267539 - 1;
                           if (es.sb != null) {
                              if (var3 != 1038224910) {
                                 throw new IllegalStateException();
                              }

                              var10002 = 1788650387 * es.sb.aq;
                           } else {
                              var10002 = 0;
                           }

                           var13[var10001] = var10002;
                           return 1;
                        }
                     } else if (3619 == var0) {
                        if (var3 != 1038224910) {
                           throw new IllegalStateException();
                        } else {
                           var11 = cy.aa[(dm.ay -= -1086551379) * -2017760987];
                           oq.nl(var11, 613256531);
                           return 1;
                        }
                     } else if (3620 == var0) {
                        if (var3 != 1038224910) {
                           throw new IllegalStateException();
                        } else {
                           jm.nr(1629805896);
                           return 1;
                        }
                     } else if (3621 == var0) {
                        if (var3 != 1038224910) {
                           throw new IllegalStateException();
                        } else {
                           if (!cl.vt.af(-172766100)) {
                              if (var3 != 1038224910) {
                                 throw new IllegalStateException();
                              }

                              cy.al[(cy.at += 427135973) * -964267539 - 1] = -1;
                           } else {
                              cy.al[(cy.at += 427135973) * -964267539 - 1] = cl.vt.ab.bm(390898749);
                           }

                           return 1;
                        }
                     } else if (3622 == var0) {
                        var10 = cy.al[(cy.at -= 427135973) * -964267539];
                        if (cl.vt.af(-1722877690)) {
                           if (var3 != 1038224910) {
                              throw new IllegalStateException();
                           }

                           if (var10 >= 0) {
                              if (var3 != 1038224910) {
                                 throw new IllegalStateException();
                              }

                              if (var10 < cl.vt.ab.bm(1318332360)) {
                                 if (var3 != 1038224910) {
                                    throw new IllegalStateException();
                                 }

                                 pi var5 = (pi)cl.vt.ab.bq(var10, 67332413);
                                 cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = var5.bk(-1576234334);
                                 cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = var5.bx(-43557433);
                                 return 1;
                              }
                           }
                        }

                        cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = "";
                        cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = "";
                        return 1;
                     } else if (3623 == var0) {
                        if (var3 != 1038224910) {
                           throw new IllegalStateException();
                        } else {
                           var11 = cy.aa[(dm.ay -= -1086551379) * -2017760987];
                           var11 = ne.nh(var11, 1227239523);
                           var13 = cy.al;
                           var10001 = (cy.at += 427135973) * -964267539 - 1;
                           if (cl.vt.aq(new tm(var11, co.cn), -754962431)) {
                              if (var3 != 1038224910) {
                                 throw new IllegalStateException();
                              }

                              var10002 = 1;
                           } else {
                              var10002 = 0;
                           }

                           var13[var10001] = var10002;
                           return 1;
                        }
                     } else if (var0 == 3624) {
                        if (var3 != 1038224910) {
                           throw new IllegalStateException();
                        } else {
                           var10 = cy.al[(cy.at -= 427135973) * -964267539];
                           if (null != es.sb) {
                              if (var3 != 1038224910) {
                                 throw new IllegalStateException();
                              }

                              if (var10 < es.sb.bm(-352014483) && es.sb.bq(var10, -240385906).be(473993579).equals(lq.mi.af)) {
                                 if (var3 != 1038224910) {
                                    throw new IllegalStateException();
                                 }

                                 cy.al[(cy.at += 427135973) * -964267539 - 1] = 1;
                                 return 1;
                              }
                           }

                           cy.al[(cy.at += 427135973) * -964267539 - 1] = 0;
                           return 1;
                        }
                     } else if (3625 == var0) {
                        if (var3 != 1038224910) {
                           throw new IllegalStateException();
                        } else {
                           if (null != es.sb) {
                              if (var3 != 1038224910) {
                                 throw new IllegalStateException();
                              }

                              if (es.sb.au != null) {
                                 cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = es.sb.au;
                                 return 1;
                              }
                           }

                           cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = "";
                           return 1;
                        }
                     } else if (3626 == var0) {
                        if (var3 != 1038224910) {
                           throw new IllegalStateException();
                        } else {
                           var10 = cy.al[(cy.at -= 427135973) * -964267539];
                           if (null != es.sb) {
                              if (var3 != 1038224910) {
                                 throw new IllegalStateException();
                              }

                              if (var10 < es.sb.bm(-1224051640)) {
                                 if (var3 != 1038224910) {
                                    throw new IllegalStateException();
                                 }

                                 if (((pd)es.sb.bq(var10, 379318628)).aw(-1838290453)) {
                                    if (var3 != 1038224910) {
                                       throw new IllegalStateException();
                                    }

                                    cy.al[(cy.at += 427135973) * -964267539 - 1] = 1;
                                    return 1;
                                 }
                              }
                           }

                           cy.al[(cy.at += 427135973) * -964267539 - 1] = 0;
                           return 1;
                        }
                     } else if (3627 == var0) {
                        if (var3 != 1038224910) {
                           throw new IllegalStateException();
                        } else {
                           var10 = cy.al[(cy.at -= 427135973) * -964267539];
                           if (es.sb != null) {
                              if (var3 != 1038224910) {
                                 throw new IllegalStateException();
                              }

                              if (var10 < es.sb.bm(288578462) && ((pd)es.sb.bq(var10, -407066307)).ay(-1806675774)) {
                                 if (var3 != 1038224910) {
                                    throw new IllegalStateException();
                                 }

                                 cy.al[(cy.at += 427135973) * -964267539 - 1] = 1;
                                 return 1;
                              }
                           }

                           cy.al[(cy.at += 427135973) * -964267539 - 1] = 0;
                           return 1;
                        }
                     } else if (var0 == 3628) {
                        if (var3 != 1038224910) {
                           throw new IllegalStateException();
                        } else {
                           cl.vt.au.ce(357528038);
                           return 1;
                        }
                     } else {
                        boolean var4;
                        boolean var10000;
                        if (var0 == 3629) {
                           if (var3 != 1038224910) {
                              throw new IllegalStateException();
                           } else {
                              if (cy.al[(cy.at -= 427135973) * -964267539] == 1) {
                                 if (var3 != 1038224910) {
                                    throw new IllegalStateException();
                                 }

                                 var10000 = true;
                              } else {
                                 var10000 = false;
                              }

                              var4 = var10000;
                              cl.vt.au.ci(new tw(var4), (byte)78);
                              return 1;
                           }
                        } else if (var0 == 3630) {
                           if (var3 != 1038224910) {
                              throw new IllegalStateException();
                           } else {
                              if (cy.al[(cy.at -= 427135973) * -964267539] == 1) {
                                 if (var3 != 1038224910) {
                                    throw new IllegalStateException();
                                 }

                                 var10000 = true;
                              } else {
                                 var10000 = false;
                              }

                              var4 = var10000;
                              cl.vt.au.ci(new ty(var4), (byte)98);
                              return 1;
                           }
                        } else if (3631 == var0) {
                           if (var3 != 1038224910) {
                              throw new IllegalStateException();
                           } else {
                              var4 = cy.al[(cy.at -= 427135973) * -964267539] == 1;
                              cl.vt.au.ci(new eb(var4), (byte)99);
                              return 1;
                           }
                        } else if (var0 == 3632) {
                           var4 = cy.al[(cy.at -= 427135973) * -964267539] == 1;
                           cl.vt.au.ci(new ej(var4), (byte)89);
                           return 1;
                        } else if (var0 == 3633) {
                           if (var3 != 1038224910) {
                              throw new IllegalStateException();
                           } else {
                              if (cy.al[(cy.at -= 427135973) * -964267539] == 1) {
                                 if (var3 != 1038224910) {
                                    throw new IllegalStateException();
                                 }

                                 var10000 = true;
                              } else {
                                 var10000 = false;
                              }

                              var4 = var10000;
                              cl.vt.au.ci(new es(var4), (byte)116);
                              return 1;
                           }
                        } else if (3634 == var0) {
                           if (var3 != 1038224910) {
                              throw new IllegalStateException();
                           } else {
                              var4 = cy.al[(cy.at -= 427135973) * -964267539] == 1;
                              cl.vt.au.ci(new eg(var4), (byte)118);
                              return 1;
                           }
                        } else if (var0 == 3635) {
                           if (cy.al[(cy.at -= 427135973) * -964267539] == 1) {
                              if (var3 != 1038224910) {
                                 throw new IllegalStateException();
                              }

                              var10000 = true;
                           } else {
                              var10000 = false;
                           }

                           var4 = var10000;
                           cl.vt.au.ci(new eu(var4), (byte)75);
                           return 1;
                        } else if (var0 == 3636) {
                           if (var3 != 1038224910) {
                              throw new IllegalStateException();
                           } else {
                              if (cy.al[(cy.at -= 427135973) * -964267539] == 1) {
                                 if (var3 != 1038224910) {
                                    throw new IllegalStateException();
                                 }

                                 var10000 = true;
                              } else {
                                 var10000 = false;
                              }

                              var4 = var10000;
                              cl.vt.au.ci(new ea(var4), (byte)65);
                              return 1;
                           }
                        } else if (var0 == 3637) {
                           if (var3 != 1038224910) {
                              throw new IllegalStateException();
                           } else {
                              if (cy.al[(cy.at -= 427135973) * -964267539] == 1) {
                                 if (var3 != 1038224910) {
                                    throw new IllegalStateException();
                                 }

                                 var10000 = true;
                              } else {
                                 var10000 = false;
                              }

                              var4 = var10000;
                              cl.vt.au.ci(new el(var4), (byte)124);
                              return 1;
                           }
                        } else if (3638 == var0) {
                           if (var3 != 1038224910) {
                              throw new IllegalStateException();
                           } else {
                              if (cy.al[(cy.at -= 427135973) * -964267539] == 1) {
                                 if (var3 != 1038224910) {
                                    throw new IllegalStateException();
                                 }

                                 var10000 = true;
                              } else {
                                 var10000 = false;
                              }

                              var4 = var10000;
                              cl.vt.au.ci(new en(var4), (byte)115);
                              return 1;
                           }
                        } else if (var0 == 3639) {
                           if (var3 != 1038224910) {
                              throw new IllegalStateException();
                           } else {
                              cl.vt.au.ba((byte)28);
                              return 1;
                           }
                        } else if (3640 == var0) {
                           if (var3 != 1038224910) {
                              throw new IllegalStateException();
                           } else {
                              cl.vt.ab.ce(357528038);
                              return 1;
                           }
                        } else if (var0 == 3641) {
                           if (var3 != 1038224910) {
                              throw new IllegalStateException();
                           } else {
                              if (cy.al[(cy.at -= 427135973) * -964267539] == 1) {
                                 if (var3 != 1038224910) {
                                    throw new IllegalStateException();
                                 }

                                 var10000 = true;
                              } else {
                                 var10000 = false;
                              }

                              var4 = var10000;
                              cl.vt.ab.ci(new tw(var4), (byte)53);
                              return 1;
                           }
                        } else if (var0 == 3642) {
                           if (var3 != 1038224910) {
                              throw new IllegalStateException();
                           } else {
                              if (cy.al[(cy.at -= 427135973) * -964267539] == 1) {
                                 if (var3 != 1038224910) {
                                    throw new IllegalStateException();
                                 }

                                 var10000 = true;
                              } else {
                                 var10000 = false;
                              }

                              var4 = var10000;
                              cl.vt.ab.ci(new ty(var4), (byte)60);
                              return 1;
                           }
                        } else if (3643 == var0) {
                           if (var3 != 1038224910) {
                              throw new IllegalStateException();
                           } else {
                              cl.vt.ab.ba((byte)-93);
                              return 1;
                           }
                        } else if (3644 == var0) {
                           if (es.sb != null) {
                              if (var3 != 1038224910) {
                                 throw new IllegalStateException();
                              }

                              es.sb.ce(357528038);
                           }

                           return 1;
                        } else if (3645 == var0) {
                           if (var3 != 1038224910) {
                              throw new IllegalStateException();
                           } else {
                              if (cy.al[(cy.at -= 427135973) * -964267539] == 1) {
                                 if (var3 != 1038224910) {
                                    throw new IllegalStateException();
                                 }

                                 var10000 = true;
                              } else {
                                 var10000 = false;
                              }

                              var4 = var10000;
                              if (null != es.sb) {
                                 if (var3 != 1038224910) {
                                    throw new IllegalStateException();
                                 }

                                 es.sb.ci(new tw(var4), (byte)99);
                              }

                              return 1;
                           }
                        } else if (3646 == var0) {
                           if (var3 != 1038224910) {
                              throw new IllegalStateException();
                           } else {
                              var4 = cy.al[(cy.at -= 427135973) * -964267539] == 1;
                              if (null != es.sb) {
                                 if (var3 != 1038224910) {
                                    throw new IllegalStateException();
                                 }

                                 es.sb.ci(new ty(var4), (byte)18);
                              }

                              return 1;
                           }
                        } else if (3647 == var0) {
                           if (var3 != 1038224910) {
                              throw new IllegalStateException();
                           } else {
                              if (cy.al[(cy.at -= 427135973) * -964267539] == 1) {
                                 if (var3 != 1038224910) {
                                    throw new IllegalStateException();
                                 }

                                 var10000 = true;
                              } else {
                                 var10000 = false;
                              }

                              var4 = var10000;
                              if (null != es.sb) {
                                 if (var3 != 1038224910) {
                                    throw new IllegalStateException();
                                 }

                                 es.sb.ci(new eb(var4), (byte)30);
                              }

                              return 1;
                           }
                        } else if (3648 == var0) {
                           if (var3 != 1038224910) {
                              throw new IllegalStateException();
                           } else {
                              var4 = cy.al[(cy.at -= 427135973) * -964267539] == 1;
                              if (null != es.sb) {
                                 es.sb.ci(new ej(var4), (byte)21);
                              }

                              return 1;
                           }
                        } else if (var0 == 3649) {
                           if (var3 != 1038224910) {
                              throw new IllegalStateException();
                           } else {
                              if (cy.al[(cy.at -= 427135973) * -964267539] == 1) {
                                 if (var3 != 1038224910) {
                                    throw new IllegalStateException();
                                 }

                                 var10000 = true;
                              } else {
                                 var10000 = false;
                              }

                              var4 = var10000;
                              if (null != es.sb) {
                                 es.sb.ci(new es(var4), (byte)101);
                              }

                              return 1;
                           }
                        } else if (3650 == var0) {
                           if (var3 != 1038224910) {
                              throw new IllegalStateException();
                           } else {
                              if (cy.al[(cy.at -= 427135973) * -964267539] == 1) {
                                 if (var3 != 1038224910) {
                                    throw new IllegalStateException();
                                 }

                                 var10000 = true;
                              } else {
                                 var10000 = false;
                              }

                              var4 = var10000;
                              if (es.sb != null) {
                                 if (var3 != 1038224910) {
                                    throw new IllegalStateException();
                                 }

                                 es.sb.ci(new eg(var4), (byte)8);
                              }

                              return 1;
                           }
                        } else if (var0 == 3651) {
                           var4 = cy.al[(cy.at -= 427135973) * -964267539] == 1;
                           if (es.sb != null) {
                              if (var3 != 1038224910) {
                                 throw new IllegalStateException();
                              }

                              es.sb.ci(new eu(var4), (byte)112);
                           }

                           return 1;
                        } else if (var0 == 3652) {
                           if (var3 != 1038224910) {
                              throw new IllegalStateException();
                           } else {
                              if (cy.al[(cy.at -= 427135973) * -964267539] == 1) {
                                 if (var3 != 1038224910) {
                                    throw new IllegalStateException();
                                 }

                                 var10000 = true;
                              } else {
                                 var10000 = false;
                              }

                              var4 = var10000;
                              if (es.sb != null) {
                                 es.sb.ci(new ea(var4), (byte)106);
                              }

                              return 1;
                           }
                        } else if (3653 == var0) {
                           if (cy.al[(cy.at -= 427135973) * -964267539] == 1) {
                              if (var3 != 1038224910) {
                                 throw new IllegalStateException();
                              }

                              var10000 = true;
                           } else {
                              var10000 = false;
                           }

                           var4 = var10000;
                           if (es.sb != null) {
                              if (var3 != 1038224910) {
                                 throw new IllegalStateException();
                              }

                              es.sb.ci(new el(var4), (byte)33);
                           }

                           return 1;
                        } else if (3654 == var0) {
                           if (var3 != 1038224910) {
                              throw new IllegalStateException();
                           } else {
                              var4 = cy.al[(cy.at -= 427135973) * -964267539] == 1;
                              if (es.sb != null) {
                                 if (var3 != 1038224910) {
                                    throw new IllegalStateException();
                                 }

                                 es.sb.ci(new en(var4), (byte)41);
                              }

                              return 1;
                           }
                        } else if (var0 == 3655) {
                           if (var3 != 1038224910) {
                              throw new IllegalStateException();
                           } else {
                              if (es.sb != null) {
                                 if (var3 != 1038224910) {
                                    throw new IllegalStateException();
                                 }

                                 es.sb.ba((byte)-19);
                              }

                              return 1;
                           }
                        } else if (var0 == 3656) {
                           if (cy.al[(cy.at -= 427135973) * -964267539] == 1) {
                              if (var3 != 1038224910) {
                                 throw new IllegalStateException();
                              }

                              var10000 = true;
                           } else {
                              var10000 = false;
                           }

                           var4 = var10000;
                           cl.vt.au.ci(new er(var4), (byte)75);
                           return 1;
                        } else if (3657 == var0) {
                           if (var3 != 1038224910) {
                              throw new IllegalStateException();
                           } else {
                              if (cy.al[(cy.at -= 427135973) * -964267539] == 1) {
                                 if (var3 != 1038224910) {
                                    throw new IllegalStateException();
                                 }

                                 var10000 = true;
                              } else {
                                 var10000 = false;
                              }

                              var4 = var10000;
                              if (null != es.sb) {
                                 if (var3 != 1038224910) {
                                    throw new IllegalStateException();
                                 }

                                 es.sb.ci(new er(var4), (byte)89);
                              }

                              return 1;
                           }
                        } else {
                           return 2;
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "kk.bi(" + ')');
      }
   }
}
