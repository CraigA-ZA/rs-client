import accessors.RSObj;

public final class dx extends iv implements RSObj {
   static final int pa = 0;
   int an;
   static final int aw = 31;
   static final int al = 2;
   static final int ae = 25;
   int af;
   int ac;
   static String gp;

   void at(int var1) {
      this.ac = 1318728709 * var1;
   }

   void af(int var1, byte var2) {
      try {
         this.ac = 1318728709 * var1;
      } catch (RuntimeException var3) {
         throw db.an(var3, "dx.af(" + ')');
      }
   }

   protected final it au() {
      return dh.af(1032359208 * this.af, (byte)54).at(1564456112 * this.an, -1682687295);
   }

   static final void ms(mq[] var0, int var1, byte var2) {
      try {
         for(int var3 = 0; var3 < var0.length; ++var3) {
            if (var2 <= 10) {
               throw new IllegalStateException();
            }

            mq var4 = var0[var3];
            if (null == var4) {
               if (var2 <= 10) {
                  throw new IllegalStateException();
               }
            } else if (var1 != var4.cu * 913615679) {
               if (var2 <= 10) {
                  throw new IllegalStateException();
               }
            } else {
               if (var4.bn) {
                  if (var2 <= 10) {
                     throw new IllegalStateException();
                  }

                  if (pm.ny(var4, (byte)1)) {
                     if (var2 <= 10) {
                        return;
                     }
                     continue;
                  }
               }

               int var6;
               if (0 == 883712245 * var4.bg) {
                  if (!var4.bn && pm.ny(var4, (byte)1)) {
                     if (var2 <= 10) {
                        throw new IllegalStateException();
                     }

                     if (var4 != ln.oh) {
                        if (var2 <= 10) {
                           throw new IllegalStateException();
                        }
                        continue;
                     }
                  }

                  ms(var0, var4.bs * 1713081171, (byte)100);
                  if (null != var4.gz) {
                     if (var2 <= 10) {
                        return;
                     }

                     ms(var4.gz, 1713081171 * var4.bs, (byte)114);
                  }

                  di var5 = (di)client.oc.af((long)(var4.bs * 1713081171));
                  if (var5 != null) {
                     if (var2 <= 10) {
                        throw new IllegalStateException();
                     }

                     var6 = 944864121 * var5.af;
                     if (!bq.ac(var6, 1376777516)) {
                        if (var2 <= 10) {
                           throw new IllegalStateException();
                        }
                     } else {
                        ms(hn.ap[var6], -1, (byte)30);
                     }
                  }
               }

               if (6 == var4.bg * 883712245) {
                  label205: {
                     if (-1 == var4.dv * -1526544909) {
                        if (var2 <= 10) {
                           throw new IllegalStateException();
                        }

                        if (var4.dz * -717228843 == -1) {
                           break label205;
                        }

                        if (var2 <= 10) {
                           return;
                        }
                     }

                     boolean var10 = rr.lb(var4, -1381305986);
                     if (var10) {
                        if (var2 <= 10) {
                           throw new IllegalStateException();
                        }

                        var6 = var4.dz * -717228843;
                     } else {
                        var6 = var4.dv * -1526544909;
                     }

                     if (var6 != -1) {
                        ha var7 = dc.an(var6, (byte)104);
                        if (!var7.ao(1471844378)) {
                           if (var2 <= 10) {
                              throw new IllegalStateException();
                           }

                           for(var4.gl += client.ja * 1742890489; 1438245367 * var4.gl > var7.av[var4.gx * 1575517389]; fw.ma(var4, -701633967)) {
                              if (var2 <= 10) {
                                 throw new IllegalStateException();
                              }

                              var4.gl -= var7.av[var4.gx * 1575517389] * -1830604857;
                              var4.gx += -1991520251;
                              if (var4.gx * 1575517389 >= var7.ag.length) {
                                 var4.gx -= -149229203 * var7.am;
                                 if (1575517389 * var4.gx >= 0) {
                                    if (1575517389 * var4.gx < var7.ag.length) {
                                       continue;
                                    }

                                    if (var2 <= 10) {
                                       throw new IllegalStateException();
                                    }
                                 }

                                 var4.gx = 0;
                              }
                           }
                        } else {
                           var4.gx += 1198415163 * client.ja;
                           int var8 = var7.ax(-1838545993);
                           if (var4.gx * 1575517389 >= var8) {
                              label215: {
                                 if (var2 <= 10) {
                                    throw new IllegalStateException();
                                 }

                                 var4.gx -= -149229203 * var7.am;
                                 if (var4.gx * 1575517389 >= 0) {
                                    if (var2 <= 10) {
                                       return;
                                    }

                                    if (1575517389 * var4.gx < var8) {
                                       break label215;
                                    }
                                 }

                                 var4.gx = 0;
                              }
                           }

                           fw.ma(var4, -1972750241);
                        }
                     }
                  }

                  if (0 != -238796869 * var4.dq) {
                     if (var2 <= 10) {
                        return;
                     }

                     if (!var4.bn) {
                        if (var2 <= 10) {
                           throw new IllegalStateException();
                        }

                        int var11 = var4.dq * -238796869 >> 16;
                        var6 = var4.dq * -238796869 << 16 >> 16;
                        var11 *= -1795081153 * client.ja;
                        var6 *= -1795081153 * client.ja;
                        var4.dh = -142910041 * (var4.dh * 797932055 + var11 & 2047);
                        var4.dp = (var4.dp * -480949115 + var6 & 2047) * -230241203;
                        fw.ma(var4, -1934285081);
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var9) {
         throw db.an(var9, "dx.ms(" + ')');
      }
   }

   protected final it an(byte var1) {
      try {
         return dh.af(176307405 * this.af, (byte)103).at(-1745152527 * this.an, -1518101570);
      } catch (RuntimeException var2) {
         throw db.an(var2, "dx.an(" + ')');
      }
   }

   protected final it ab() {
      return dh.af(176307405 * this.af, (byte)58).at(-1889137184 * this.an, -1757520650);
   }

   protected final it aq() {
      return dh.af(176307405 * this.af, (byte)46).at(-1745152527 * this.an, -62747448);
   }

   protected final it al() {
      return dh.af(176307405 * this.af, (byte)53).at(-1745152527 * this.an, -1814781300);
   }

   void ac(int var1) {
      this.ac = 1318728709 * var1;
   }

   boolean aw(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 <= 1640777576) {
               throw new IllegalStateException();
            }

            if (var1 <= 4) {
               boolean var10000;
               if (0 != (this.ac * -1724221235 & 1 << var1)) {
                  if (var2 <= 1640777576) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               return var10000;
            }
         }

         return true;
      } catch (RuntimeException var3) {
         throw db.an(var3, "dx.aw(" + ')');
      }
   }

   boolean aa(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return 0 != (this.ac * 479857586 & 1 << var1);
      } else {
         return true;
      }
   }

   boolean ay(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return 0 != (this.ac * -1891815889 & 1 << var1);
      } else {
         return true;
      }
   }

   boolean ao(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return 0 != (this.ac * 1177520578 & 1 << var1);
      } else {
         return true;
      }
   }

   static fh av(int var0, int var1) {
      try {
         if (aj.ag(var0, 854271946) != 0) {
            if (var1 <= 2139535413) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            fh var3 = (fh)ha.aa.af((long)var0);
            fh var2;
            if (null != var3) {
               if (var1 <= 2139535413) {
                  throw new IllegalStateException();
               }

               var2 = var3;
            } else {
               var3 = iw.af(ha.ab, ha.aq, var0, false, 684013048);
               if (null != var3) {
                  if (var1 <= 2139535413) {
                     throw new IllegalStateException();
                  }

                  ha.aa.aw(var3, (long)var0);
               }

               var2 = var3;
            }

            return var2;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "dx.av(" + ')');
      }
   }

   dx() {
      try {
         super();
         this.ac = -2069082981;
      } catch (RuntimeException var1) {
         throw db.an(var1, "dx.<init>(" + ')');
      }
   }

   static void ix(byte var0) {
      try {
         if (client.md) {
            bd.ib(lq.mi, false, -1861126010);
         }

      } catch (RuntimeException var1) {
         throw db.an(var1, "dx.ix(" + ')');
      }
   }
}
