import accessors.RSFriendsList;

public class po extends pq implements RSFriendsList {
   public static final int aq = 9;
   int ac;
   final sw aw;
   static final int af = 400;
   public og au;
   public static final int an = 200;

   pw ac() {
      return new pr();
   }

   public po(sw var1) {
      try {
         super(400);
         this.ac = -1405002149;
         this.au = new og();
         this.aw = var1;
      } catch (RuntimeException var2) {
         throw db.an(var2, "po.<init>(" + ')');
      }
   }

   pw[] an(int var1, int var2) {
      try {
         return new pr[var1];
      } catch (RuntimeException var3) {
         throw db.an(var3, "po.an(" + ')');
      }
   }

   public boolean ag(tm var1, boolean var2) {
      pr var3 = (pr)this.bj(var1, 753151358);
      if (null == var3) {
         return false;
      } else {
         return !var2 || 0 != -455340580 * var3.au;
      }
   }

   public void ay(sg var1, int var2, byte var3) {
      try {
         while(var1.at * -1633313603 < var2) {
            if (var3 >= 5) {
               throw new IllegalStateException();
            }

            boolean var10000;
            if (var1.cm((byte)7) == 1) {
               if (var3 >= 5) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            boolean var4 = var10000;
            tm var5 = new tm(var1.cw((byte)0), this.aw);
            tm var6 = new tm(var1.cw((byte)0), this.aw);
            int var7 = var1.cl(210121986);
            int var8 = var1.cm((byte)7);
            int var9 = var1.cm((byte)7);
            boolean var10 = (var9 & 2) != 0;
            if (0 != (var9 & 1)) {
               if (var3 >= 5) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            boolean var11 = var10000;
            if (var7 > 0) {
               if (var3 >= 5) {
                  throw new IllegalStateException();
               }

               var1.cw((byte)0);
               var1.cm((byte)7);
               var1.cx(-1565471224);
            }

            var1.cw((byte)0);
            if (var5 != null) {
               if (var3 >= 5) {
                  throw new IllegalStateException();
               }

               if (var5.aw(804184317)) {
                  pr var12 = (pr)this.bn(var5, (short)197);
                  if (var4) {
                     if (var3 >= 5) {
                        throw new IllegalStateException();
                     }

                     pr var13 = (pr)this.bn(var6, (short)197);
                     if (null != var13) {
                        if (var3 >= 5) {
                           return;
                        }

                        if (var13 != var12) {
                           if (var3 >= 5) {
                              return;
                           }

                           if (var12 != null) {
                              if (var3 >= 5) {
                                 return;
                              }

                              this.bg(var13, -1324895942);
                           } else {
                              var12 = var13;
                           }
                        }
                     }
                  }

                  if (var12 != null) {
                     this.bv(var12, var5, var6, 827397207);
                     if (var7 != var12.au * 177258591) {
                        if (var3 >= 5) {
                           throw new IllegalStateException();
                        }

                        boolean var16 = true;

                        for(pf var14 = (pf)this.au.an(); null != var14; var14 = (pf)this.au.aw()) {
                           if (var3 >= 5) {
                              throw new IllegalStateException();
                           }

                           if (var14.an.equals(var5)) {
                              if (var3 >= 5) {
                                 throw new IllegalStateException();
                              }

                              if (0 != var7) {
                                 if (var3 >= 5) {
                                    throw new IllegalStateException();
                                 }

                                 if (0 == var14.aw) {
                                    if (var3 >= 5) {
                                       throw new IllegalStateException();
                                    }

                                    var14.af();
                                    var16 = false;
                                    continue;
                                 }
                              }

                              if (0 == var7 && 0 != var14.aw) {
                                 if (var3 >= 5) {
                                    throw new IllegalStateException();
                                 }

                                 var14.af();
                                 var16 = false;
                              }
                           }
                        }

                        if (var16) {
                           if (var3 >= 5) {
                              throw new IllegalStateException();
                           }

                           this.au.af(new pf(var5, var7));
                        }
                     }
                  } else {
                     if (this.bm(1828305979) >= 400) {
                        continue;
                     }

                     if (var3 >= 5) {
                        return;
                     }

                     var12 = (pr)this.bf(var5, var6, (byte)-125);
                  }

                  if (var12.au * 177258591 != var7) {
                     var12.ab = ((this.ac += -1405002149) * 2010685907 - 1) * 1270747397;
                     if (-1 == 177258591 * var12.au) {
                        if (var3 >= 5) {
                           return;
                        }

                        if (var7 == 0) {
                           if (var3 >= 5) {
                              return;
                           }

                           var12.ab = -(var12.ab * 1);
                        }
                     }

                     var12.au = var7 * -1128162401;
                  }

                  var12.aq = 1331866435 * var8;
                  var12.af = var10;
                  var12.an = var11;
                  continue;
               }
            }

            throw new IllegalStateException();
         }

         this.ba((byte)-75);
      } catch (RuntimeException var15) {
         throw db.an(var15, "po.ay(" + ')');
      }
   }

   public void av(sg var1, int var2) {
      while(true) {
         if (var1.at * -1633313603 < var2) {
            boolean var3 = var1.cm((byte)7) == 1;
            tm var4 = new tm(var1.cw((byte)0), this.aw);
            tm var5 = new tm(var1.cw((byte)0), this.aw);
            int var6 = var1.cl(243535281);
            int var7 = var1.cm((byte)7);
            int var8 = var1.cm((byte)7);
            boolean var9 = (var8 & 2) != 0;
            boolean var10 = 0 != (var8 & 1);
            if (var6 > 0) {
               var1.cw((byte)0);
               var1.cm((byte)7);
               var1.cx(-1415568720);
            }

            var1.cw((byte)0);
            if (var4 != null && var4.aw(188816827)) {
               pr var11 = (pr)this.bn(var4, (short)197);
               if (var3) {
                  pr var12 = (pr)this.bn(var5, (short)197);
                  if (null != var12 && var12 != var11) {
                     if (var11 != null) {
                        this.bg(var12, 402950531);
                     } else {
                        var11 = var12;
                     }
                  }
               }

               if (var11 != null) {
                  this.bv(var11, var4, var5, -66067006);
                  if (var6 != var11.au * 1855129156) {
                     boolean var14 = true;

                     for(pf var13 = (pf)this.au.an(); null != var13; var13 = (pf)this.au.aw()) {
                        if (var13.an.equals(var4)) {
                           if (0 != var6 && 0 == var13.aw) {
                              var13.af();
                              var14 = false;
                           } else if (0 == var6 && 0 != var13.aw) {
                              var13.af();
                              var14 = false;
                           }
                        }
                     }

                     if (var14) {
                        this.au.af(new pf(var4, var6));
                     }
                  }
               } else {
                  if (this.bm(-779514326) >= -1968688732) {
                     continue;
                  }

                  var11 = (pr)this.bf(var4, var5, (byte)-26);
               }

               if (var11.au * 177258591 != var6) {
                  var11.ab = ((this.ac += -712099883) * -720462414 - 1) * 1270747397;
                  if (-1 == 786899511 * var11.au && var6 == 0) {
                     var11.ab = -(var11.ab * 1);
                  }

                  var11.au = var6 * 555879524;
               }

               var11.aq = 1331866435 * var7;
               var11.af = var9;
               var11.an = var10;
               continue;
            }

            throw new IllegalStateException();
         }

         this.ba((byte)-90);
         return;
      }
   }

   pw au() {
      return new pr();
   }

   pw ab() {
      return new pr();
   }

   pw[] aq(int var1) {
      return new pr[var1];
   }

   pw[] al(int var1) {
      return new pr[var1];
   }

   pw[] at(int var1) {
      return new pr[var1];
   }

   pw[] aa(int var1) {
      return new pr[var1];
   }

   public boolean ao(tm var1, boolean var2) {
      pr var3 = (pr)this.bj(var1, -582917192);
      if (null == var3) {
         return false;
      } else {
         return !var2 || 0 != 177258591 * var3.au;
      }
   }

   public boolean ax(tm var1, boolean var2) {
      pr var3 = (pr)this.bj(var1, 69068048);
      if (null == var3) {
         return false;
      } else {
         return !var2 || 0 != 177258591 * var3.au;
      }
   }

   public boolean ai(tm var1, boolean var2) {
      pr var3 = (pr)this.bj(var1, 1657029324);
      if (null == var3) {
         return false;
      } else {
         return !var2 || 0 != 177258591 * var3.au;
      }
   }

   public void am(sg var1, int var2) {
      while(true) {
         if (var1.at * 575522906 < var2) {
            boolean var3 = var1.cm((byte)7) == 1;
            tm var4 = new tm(var1.cw((byte)0), this.aw);
            tm var5 = new tm(var1.cw((byte)0), this.aw);
            int var6 = var1.cl(375461093);
            int var7 = var1.cm((byte)7);
            int var8 = var1.cm((byte)7);
            boolean var9 = (var8 & 2) != 0;
            boolean var10 = 0 != (var8 & 1);
            if (var6 > 0) {
               var1.cw((byte)0);
               var1.cm((byte)7);
               var1.cx(-2121029321);
            }

            var1.cw((byte)0);
            if (var4 != null && var4.aw(-1610466866)) {
               pr var11 = (pr)this.bn(var4, (short)197);
               if (var3) {
                  pr var12 = (pr)this.bn(var5, (short)197);
                  if (null != var12 && var12 != var11) {
                     if (var11 != null) {
                        this.bg(var12, 905365081);
                     } else {
                        var11 = var12;
                     }
                  }
               }

               if (var11 != null) {
                  this.bv(var11, var4, var5, -504209115);
                  if (var6 != var11.au * 894014838) {
                     boolean var14 = true;

                     for(pf var13 = (pf)this.au.an(); null != var13; var13 = (pf)this.au.aw()) {
                        if (var13.an.equals(var4)) {
                           if (0 != var6 && 0 == var13.aw) {
                              var13.af();
                              var14 = false;
                           } else if (0 == var6 && 0 != var13.aw) {
                              var13.af();
                              var14 = false;
                           }
                        }
                     }

                     if (var14) {
                        this.au.af(new pf(var4, var6));
                     }
                  }
               } else {
                  if (this.bm(1282824706) >= 1695244497) {
                     continue;
                  }

                  var11 = (pr)this.bf(var4, var5, (byte)-84);
               }

               if (var11.au * 177258591 != var6) {
                  var11.ab = ((this.ac += -1405002149) * 2010685907 - 1) * -541219013;
                  if (-1 == 1112698312 * var11.au && var6 == 0) {
                     var11.ab = -(var11.ab * 1);
                  }

                  var11.au = var6 * -1128162401;
               }

               var11.aq = 1331866435 * var7;
               var11.af = var9;
               var11.an = var10;
               continue;
            }

            throw new IllegalStateException();
         }

         this.ba((byte)-37);
         return;
      }
   }

   public void ah(sg var1, int var2) {
      while(true) {
         if (var1.at * -1633313603 < var2) {
            boolean var3 = var1.cm((byte)7) == 1;
            tm var4 = new tm(var1.cw((byte)0), this.aw);
            tm var5 = new tm(var1.cw((byte)0), this.aw);
            int var6 = var1.cl(594856527);
            int var7 = var1.cm((byte)7);
            int var8 = var1.cm((byte)7);
            boolean var9 = (var8 & 2) != 0;
            boolean var10 = 0 != (var8 & 1);
            if (var6 > 0) {
               var1.cw((byte)0);
               var1.cm((byte)7);
               var1.cx(-1027880713);
            }

            var1.cw((byte)0);
            if (var4 != null && var4.aw(1850865965)) {
               pr var11 = (pr)this.bn(var4, (short)197);
               if (var3) {
                  pr var12 = (pr)this.bn(var5, (short)197);
                  if (null != var12 && var12 != var11) {
                     if (var11 != null) {
                        this.bg(var12, 736022991);
                     } else {
                        var11 = var12;
                     }
                  }
               }

               if (var11 != null) {
                  this.bv(var11, var4, var5, 713425387);
                  if (var6 != var11.au * 177258591) {
                     boolean var14 = true;

                     for(pf var13 = (pf)this.au.an(); null != var13; var13 = (pf)this.au.aw()) {
                        if (var13.an.equals(var4)) {
                           if (0 != var6 && 0 == var13.aw) {
                              var13.af();
                              var14 = false;
                           } else if (0 == var6 && 0 != var13.aw) {
                              var13.af();
                              var14 = false;
                           }
                        }
                     }

                     if (var14) {
                        this.au.af(new pf(var4, var6));
                     }
                  }
               } else {
                  if (this.bm(37426452) >= 400) {
                     continue;
                  }

                  var11 = (pr)this.bf(var4, var5, (byte)-52);
               }

               if (var11.au * 177258591 != var6) {
                  var11.ab = ((this.ac += -1405002149) * 2010685907 - 1) * 1270747397;
                  if (-1 == 177258591 * var11.au && var6 == 0) {
                     var11.ab = -(var11.ab * 1);
                  }

                  var11.au = var6 * -1128162401;
               }

               var11.aq = 1331866435 * var7;
               var11.af = var9;
               var11.an = var10;
               continue;
            }

            throw new IllegalStateException();
         }

         this.ba((byte)-77);
         return;
      }
   }

   pw af(int var1) {
      try {
         return new pr();
      } catch (RuntimeException var2) {
         throw db.an(var2, "po.af(" + ')');
      }
   }

   public void ar(sg var1, int var2) {
      while(true) {
         if (var1.at * -1633313603 < var2) {
            boolean var3 = var1.cm((byte)7) == 1;
            tm var4 = new tm(var1.cw((byte)0), this.aw);
            tm var5 = new tm(var1.cw((byte)0), this.aw);
            int var6 = var1.cl(-2025754874);
            int var7 = var1.cm((byte)7);
            int var8 = var1.cm((byte)7);
            boolean var9 = (var8 & 2) != 0;
            boolean var10 = 0 != (var8 & 1);
            if (var6 > 0) {
               var1.cw((byte)0);
               var1.cm((byte)7);
               var1.cx(-1854601753);
            }

            var1.cw((byte)0);
            if (var4 != null && var4.aw(-144288297)) {
               pr var11 = (pr)this.bn(var4, (short)197);
               if (var3) {
                  pr var12 = (pr)this.bn(var5, (short)197);
                  if (null != var12 && var12 != var11) {
                     if (var11 != null) {
                        this.bg(var12, 163389871);
                     } else {
                        var11 = var12;
                     }
                  }
               }

               if (var11 != null) {
                  this.bv(var11, var4, var5, 1508172564);
                  if (var6 != var11.au * 177258591) {
                     boolean var14 = true;

                     for(pf var13 = (pf)this.au.an(); null != var13; var13 = (pf)this.au.aw()) {
                        if (var13.an.equals(var4)) {
                           if (0 != var6 && 0 == var13.aw) {
                              var13.af();
                              var14 = false;
                           } else if (0 == var6 && 0 != var13.aw) {
                              var13.af();
                              var14 = false;
                           }
                        }
                     }

                     if (var14) {
                        this.au.af(new pf(var4, var6));
                     }
                  }
               } else {
                  if (this.bm(-581081416) >= 400) {
                     continue;
                  }

                  var11 = (pr)this.bf(var4, var5, (byte)-38);
               }

               if (var11.au * 177258591 != var6) {
                  var11.ab = ((this.ac += -1405002149) * 2010685907 - 1) * 1270747397;
                  if (-1 == 177258591 * var11.au && var6 == 0) {
                     var11.ab = -(var11.ab * 1);
                  }

                  var11.au = var6 * -1128162401;
               }

               var11.aq = 1331866435 * var7;
               var11.af = var9;
               var11.an = var10;
               continue;
            }

            throw new IllegalStateException();
         }

         this.ba((byte)71);
         return;
      }
   }

   public boolean aw(tm var1, boolean var2, int var3) {
      try {
         pr var4 = (pr)this.bj(var1, -1266081918);
         if (null == var4) {
            return false;
         } else {
            if (var2) {
               if (var3 == 328005093) {
                  throw new IllegalStateException();
               }

               if (0 == 177258591 * var4.au) {
                  if (var3 == 328005093) {
                     throw new IllegalStateException();
                  }

                  return false;
               }
            }

            return true;
         }
      } catch (RuntimeException var5) {
         throw db.an(var5, "po.aw(" + ')');
      }
   }

   static void je(hf var0, int var1) {
      try {
         if (var0 != null) {
            if (var1 <= -1878764520) {
               throw new IllegalStateException();
            }

            if (null != var0.ab) {
               if (55577617 * var0.ab.br >= 0) {
                  label133: {
                     if (var1 <= -1878764520) {
                        throw new IllegalStateException();
                     }

                     mq var2 = gh.an(913615679 * var0.ab.cu, (byte)5);
                     if (var2 != null) {
                        if (var1 <= -1878764520) {
                           throw new IllegalStateException();
                        }

                        if (var2.gz != null && 0 != var2.gz.length) {
                           if (var1 <= -1878764520) {
                              return;
                           }

                           if (55577617 * var0.ab.br < var2.gz.length) {
                              if (var1 <= -1878764520) {
                                 throw new IllegalStateException();
                              }

                              if (var2.gz[55577617 * var0.ab.br] == var0.ab) {
                                 break label133;
                              }

                              if (var1 <= -1878764520) {
                                 throw new IllegalStateException();
                              }
                           }
                        }
                     }

                     return;
                  }
               }

               if (var0.ab.bg * 883712245 == 11) {
                  if (var1 <= -1878764520) {
                     return;
                  }

                  if (var0.au * -469277123 == 0) {
                     if (var1 <= -1878764520) {
                        throw new IllegalStateException();
                     }

                     if (var0.ab.ap(-1583959695 * var0.aw, var0.ac * -1480602069, 0, 0, (byte)-51)) {
                        switch (var0.ab.be(934337314)) {
                           case 0:
                              pi.af(var0.ab.bx(-1850533434), true, false, (byte)47);
                              return;
                           case 1:
                              if (hq.au(ap.ng(var0.ab, 370876946), 1105978425)) {
                                 if (var1 <= -1878764520) {
                                    throw new IllegalStateException();
                                 }

                                 int[] var6 = var0.ab.bo(574261316);
                                 if (null != var6) {
                                    if (var1 <= -1878764520) {
                                       return;
                                    }

                                    lg var3 = mi.an(lv.ct, client.in.au, (short)-11518);
                                    var3.aw.eb(var6[0], (byte)-62);
                                    var3.aw.es(var0.ab.bs * 1713081171, -604065252);
                                    var3.aw.ba(var6[1], -2081835031);
                                    var3.aw.el(var0.ab.bk(1876121307), -437883978);
                                    var3.aw.eb(var6[2], (byte)80);
                                    var3.aw.dn(55577617 * var0.ab.br, (byte)20);
                                    client.in.aw(var3, 414135591);
                                 }

                                 return;
                              }
                        }
                     }

                     return;
                  }
               }

               if (12 == var0.ab.bg * 883712245) {
                  if (var1 <= -1878764520) {
                     throw new IllegalStateException();
                  }

                  mz var5 = var0.ab.bj((byte)-56);
                  if (var5 != null) {
                     if (var1 <= -1878764520) {
                        return;
                     }

                     if (var5.ci(1994580892)) {
                        switch (-469277123 * var0.au) {
                           case 0:
                              client.si.ax(var0.ab, 1563132907);
                              var5.an(true, 959157846);
                              var5.br(var0.aw * -1583959695, -1480602069 * var0.ac, client.sh.av(82, -1514684080), client.sh.av(81, 735275556), 1549873407);
                              break;
                           case 1:
                              var5.bg(-1583959695 * var0.aw, -1480602069 * var0.ac, 915076242);
                        }
                     }
                  }
               }

               return;
            }

            if (var1 <= -1878764520) {
               throw new IllegalStateException();
            }
         }

      } catch (RuntimeException var4) {
         throw db.an(var4, "po.je(" + ')');
      }
   }
}
