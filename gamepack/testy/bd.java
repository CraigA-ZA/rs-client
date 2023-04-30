import accessors.RSMouseHandler;
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class bd implements MouseListener, MouseMotionListener, FocusListener, RSMouseHandler {
   public static int aa = 0;
   static final int an = 2;
   static final int aw = 4;
   public static bd ac = new bd();
   public static volatile int ag = 0;
   public static volatile int ab = 0;
   public static volatile int aq = 1849679947;
   public static volatile int au = 0;
   static final int af = 1;
   public static volatile long at = -678214925528160149L;
   public static int ay = 0;
   public static int ao = 0;
   public static volatile int ai = 0;
   public static volatile int al = -225734783;
   public static long ax = 0L;
   public static volatile int ah = 0;
   public static volatile long av = 0L;
   public static long aj = 0L;
   public static int am = 0;
   public static int as = 0;
   public static int ar = 0;
   static gj sx;

   public final synchronized void as(MouseEvent var1) {
      if (ac != null) {
         au = 0;
         aq = 1849679947;
         al = -225734783;
         at = var1.getWhen() * 678214925528160149L;
      }

   }

   final int ac(MouseEvent var1, byte var2) {
      try {
         int var3 = var1.getButton();
         if (!var1.isAltDown()) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            }

            if (var3 != 2) {
               if (!var1.isMetaDown()) {
                  if (3 != var3) {
                     return 1;
                  }

                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }
               }

               return 2;
            }
         }

         return 4;
      } catch (RuntimeException var4) {
         throw db.an(var4, "bd.ac(" + ')');
      }
   }

   public final synchronized void mousePressed(MouseEvent var1) {
      try {
         if (ac != null) {
            au = 0;
            ag = var1.getX() * 394285213;
            ah = var1.getY() * -1202616623;
            av = dq.af(1155874390) * 4279889128239043159L;
            ai = this.ac(var1, (byte)-121) * -528109255;
            if (0 != -1491866359 * ai) {
               ab = -946669631 * ai;
            }
         }

         if (var1.isPopupTrigger()) {
            var1.consume();
         }

      } catch (RuntimeException var2) {
         throw db.an(var2, "bd.mousePressed(" + ')');
      }
   }

   public final synchronized void mouseReleased(MouseEvent var1) {
      try {
         if (null != ac) {
            au = 0;
            ab = 0;
         }

         if (var1.isPopupTrigger()) {
            var1.consume();
         }

      } catch (RuntimeException var2) {
         throw db.an(var2, "bd.mouseReleased(" + ')');
      }
   }

   public final void bk(FocusEvent var1) {
   }

   public final synchronized void be(MouseEvent var1) {
      if (null != ac) {
         au = 0;
         aq = var1.getX() * 1634798673;
         al = var1.getY() * 225734783;
         at = var1.getWhen() * 678214925528160149L;
      }

   }

   public final synchronized void mouseExited(MouseEvent var1) {
      try {
         if (ac != null) {
            au = 0;
            aq = 1849679947;
            al = -225734783;
            at = var1.getWhen() * 678214925528160149L;
         }

      } catch (RuntimeException var2) {
         throw db.an(var2, "bd.mouseExited(" + ')');
      }
   }

   public final void mouseClicked(MouseEvent var1) {
      try {
         if (var1.isPopupTrigger()) {
            var1.consume();
         }

      } catch (RuntimeException var2) {
         throw db.an(var2, "bd.mouseClicked(" + ')');
      }
   }

   public final synchronized void mouseMoved(MouseEvent var1) {
      try {
         if (null != ac) {
            au = 0;
            aq = var1.getX() * -1849679947;
            al = var1.getY() * 225734783;
            at = var1.getWhen() * 678214925528160149L;
         }

      } catch (RuntimeException var2) {
         throw db.an(var2, "bd.mouseMoved(" + ')');
      }
   }

   public final void focusGained(FocusEvent var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw db.an(var2, "bd.focusGained(" + ')');
      }
   }

   public final synchronized void focusLost(FocusEvent var1) {
      try {
         if (null != ac) {
            ab = 0;
         }

      } catch (RuntimeException var2) {
         throw db.an(var2, "bd.focusLost(" + ')');
      }
   }

   public final synchronized void am(MouseEvent var1) {
      if (ac != null) {
         au = 0;
         aq = 1546946769;
         al = -225734783;
         at = var1.getWhen() * 678214925528160149L;
      }

   }

   public final synchronized void bi(MouseEvent var1) {
      if (null != ac) {
         au = 0;
         aq = var1.getX() * -1849679947;
         al = var1.getY() * -2083611069;
         at = var1.getWhen() * 678214925528160149L;
      }

   }

   public final synchronized void bx(FocusEvent var1) {
      if (null != ac) {
         ab = 0;
      }

   }

   public final synchronized void bz(MouseEvent var1) {
      if (null != ac) {
         au = 0;
         aq = var1.getX() * -1849679947;
         al = var1.getY() * 225734783;
         at = var1.getWhen() * 678214925528160149L;
      }

   }

   static void au(Component var0) {
      var0.addMouseListener(ac);
      var0.addMouseMotionListener(ac);
      var0.addFocusListener(ac);
   }

   static void ab(Component var0) {
      var0.addMouseListener(ac);
      var0.addMouseMotionListener(ac);
      var0.addFocusListener(ac);
   }

   public static void aq() {
      if (ac != null) {
         synchronized(ac) {
            ac = null;
         }
      }

   }

   public static void al() {
      if (ac != null) {
         synchronized(ac) {
            ac = null;
         }
      }

   }

   public static int at() {
      return (au += -500489753) * -119381545 - 1;
   }

   public static int ay() {
      return (au += 1288886998) * 457374606 - 1;
   }

   final int ao(MouseEvent var1) {
      int var2 = var1.getButton();
      if (!var1.isAltDown() && var2 != 2) {
         return !var1.isMetaDown() && 3 != var2 ? 1 : 2;
      } else {
         return 4;
      }
   }

   public final synchronized void mouseEntered(MouseEvent var1) {
      try {
         this.mouseMoved(var1);
      } catch (RuntimeException var2) {
         throw db.an(var2, "bd.mouseEntered(" + ')');
      }
   }

   public final synchronized void ai(MouseEvent var1) {
      if (ac != null) {
         au = 0;
         ag = var1.getX() * 394285213;
         ah = var1.getY() * -1202616623;
         av = dq.af(821578018) * 4279889128239043159L;
         ai = this.ac(var1, (byte)-44) * -528109255;
         if (0 != -1491866359 * ai) {
            ab = -946669631 * ai;
         }
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void ag(MouseEvent var1) {
      if (ac != null) {
         au = 0;
         ag = var1.getX() * 394285213;
         ah = var1.getY() * -1202616623;
         av = dq.af(355854891) * 4279889128239043159L;
         ai = this.ac(var1, (byte)-103) * 338783853;
         if (0 != -571961286 * ai) {
            ab = 1267620004 * ai;
         }
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final void ah(MouseEvent var1) {
      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public static int aa() {
      return (au += -500489753) * -119381545 - 1;
   }

   public final synchronized void bo(FocusEvent var1) {
      if (null != ac) {
         ab = 0;
      }

   }

   final int ax(MouseEvent var1) {
      int var2 = var1.getButton();
      if (!var1.isAltDown() && var2 != 2) {
         return !var1.isMetaDown() && 3 != var2 ? 1 : 2;
      } else {
         return 4;
      }
   }

   public final synchronized void aj(MouseEvent var1) {
      if (ac != null) {
         au = 0;
         aq = 1849679947;
         al = -225734783;
         at = var1.getWhen() * 678214925528160149L;
      }

   }

   public final void av(MouseEvent var1) {
      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void bb(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   public final synchronized void mouseDragged(MouseEvent var1) {
      try {
         this.mouseMoved(var1);
      } catch (RuntimeException var2) {
         throw db.an(var2, "bd.mouseDragged(" + ')');
      }
   }

   public final void ar(MouseEvent var1) {
      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   bd() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw db.an(var1, "bd.<init>(" + ')');
      }
   }

   static int hd(int var0) {
      try {
         if (null != client.we) {
            if (var0 >= 854271946) {
               throw new IllegalStateException();
            }

            if (client.wy * -397497277 < client.we.size()) {
               int var1 = 0;

               for(int var2 = 0; var2 <= client.wy * -397497277; ++var2) {
                  var1 += ((dw)client.we.get(var2)).ac * -1464399353;
               }

               return var1 * 10000 / (client.ws * 1240602605);
            }

            if (var0 >= 854271946) {
               throw new IllegalStateException();
            }
         }

         return 10000;
      } catch (RuntimeException var3) {
         throw db.an(var3, "bd.hd(" + ')');
      }
   }

   static void ib(dv var0, boolean var1, int var2) {
      try {
         if (null != var0) {
            if (var2 != -1861126010) {
               return;
            }

            if (var0.as(1666539507)) {
               if (var2 != -1861126010) {
                  throw new IllegalStateException();
               }

               if (!var0.az) {
                  if (var2 != -1861126010) {
                     throw new IllegalStateException();
                  }

                  label127: {
                     label138: {
                        var0.aj = false;
                        if (client.cu) {
                           if (var2 != -1861126010) {
                              throw new IllegalStateException();
                           }

                           if (ds.ab * -2010934433 > 50) {
                              break label138;
                           }

                           if (var2 != -1861126010) {
                              return;
                           }
                        }

                        if (-2010934433 * ds.ab <= 200) {
                           break label127;
                        }

                        if (var2 != -1861126010) {
                           throw new IllegalStateException();
                        }
                     }

                     if (var1) {
                        if (var2 != -1861126010) {
                           throw new IllegalStateException();
                        }

                        if (var0.bt * 1590591885 == -1302441815 * var0.cz) {
                           if (var2 != -1861126010) {
                              throw new IllegalStateException();
                           }

                           var0.aj = true;
                        }
                     }
                  }

                  int var3 = 1144428983 * var0.bx >> 7;
                  int var4 = -411750205 * var0.bo >> 7;
                  if (var3 >= 0) {
                     if (var2 != -1861126010) {
                        throw new IllegalStateException();
                     }

                     if (var3 < 104) {
                        if (var2 != -1861126010) {
                           return;
                        }

                        if (var4 >= 0) {
                           if (var2 != -1861126010) {
                              throw new IllegalStateException();
                           }

                           if (var4 < 104) {
                              if (var2 != -1861126010) {
                                 throw new IllegalStateException();
                              }

                              long var5 = ir.aa(0, 0, 0, false, var0.ae * -1232170701, 1560958875);
                              if (var0.ah != null) {
                                 if (var2 != -1861126010) {
                                    throw new IllegalStateException();
                                 }

                                 if (-1886224337 * client.ep >= var0.ay * -1402262375) {
                                    if (var2 != -1861126010) {
                                       throw new IllegalStateException();
                                    }

                                    if (-1886224337 * client.ep < var0.ao * -935505685) {
                                       var0.aj = false;
                                       var0.aa = fq.jw(1144428983 * var0.bx, -411750205 * var0.bo, bm.mh * -1727408401, (byte)8) * -548513145;
                                       var0.bd = -14183397 * client.ep;
                                       bx.js.ax(-1727408401 * bm.mh, var0.bx * 1144428983, var0.bo * -411750205, 561204023 * var0.aa, 60, var0, var0.bz * -1703696531, var5, -1793206457 * var0.av, -1107395863 * var0.ar, 54499173 * var0.am, var0.as * 806621699);
                                       return;
                                    }
                                 }
                              }

                              if (64 == (1144428983 * var0.bx & 127)) {
                                 if (var2 != -1861126010) {
                                    throw new IllegalStateException();
                                 }

                                 if (64 == (var0.bo * -411750205 & 127)) {
                                    if (var2 != -1861126010) {
                                       return;
                                    }

                                    if (client.mt[var3][var4] == client.mw * 2041464667) {
                                       if (var2 != -1861126010) {
                                          throw new IllegalStateException();
                                       }

                                       return;
                                    }

                                    client.mt[var3][var4] = 2041464667 * client.mw;
                                 }
                              }

                              var0.aa = fq.jw(1144428983 * var0.bx, var0.bo * -411750205, -1727408401 * bm.mh, (byte)-114) * -548513145;
                              var0.bd = client.ep * -14183397;
                              bx.js.ao(bm.mh * -1727408401, var0.bx * 1144428983, var0.bo * -411750205, 561204023 * var0.aa, 60, var0, -1703696531 * var0.bz, var5, var0.an);
                           }
                        }
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var7) {
         throw db.an(var7, "bd.ib(" + ')');
      }
   }

   static final void mr(mq var0, int var1) {
      try {
         int var2 = var0.bf * 1021339961;
         if (var2 == 324) {
            if (-1 == client.vr * -1563612739) {
               if (var1 == -1033157486) {
                  throw new IllegalStateException();
               }

               client.vr = 1781840109 * var0.ch;
               client.vu = 1885844547 * var0.ct;
            }

            if (1 == client.vh.au * 1693987821) {
               if (var1 == -1033157486) {
                  return;
               }

               var0.ch = client.vr * -272472859;
            } else {
               var0.ch = -1012252929 * client.vu;
            }

         } else if (var2 == 325) {
            if (var1 != -1033157486) {
               if (-1 == -1563612739 * client.vr) {
                  if (var1 == -1033157486) {
                     throw new IllegalStateException();
                  }

                  client.vr = 1781840109 * var0.ch;
                  client.vu = var0.ct * 1885844547;
               }

               if (1 == client.vh.au * 1693987821) {
                  var0.ch = client.vu * -1012252929;
               } else {
                  var0.ch = -272472859 * client.vr;
               }

            }
         } else if (327 == var2) {
            if (var1 != -1033157486) {
               var0.dh = 38330330;
               var0.dp = ((int)(Math.sin((double)(client.ep * -1886224337) / 40.0) * 256.0) & 2047) * -230241203;
               var0.dr = 17527377;
               var0.dl = 0;
            }
         } else if (328 == var2) {
            if (var1 != -1033157486) {
               var0.dh = 38330330;
               var0.dp = ((int)(Math.sin((double)(client.ep * -1886224337) / 40.0) * 256.0) & 2047) * -230241203;
               var0.dr = 17527377;
               var0.dl = 509431749;
            }
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "bd.mr(" + ')');
      }
   }

   static int aj(int var0, ch var1, boolean var2, byte var3) {
      try {
         mq var4 = gh.an(cy.al[(cy.at -= 427135973) * -964267539], (byte)5);
         if (var0 == 2600) {
            if (var3 == 60) {
               throw new IllegalStateException();
            } else {
               cy.al[(cy.at += 427135973) * -964267539 - 1] = var4.cq * -1469632775;
               return 1;
            }
         } else if (2601 == var0) {
            if (var3 == 60) {
               throw new IllegalStateException();
            } else {
               cy.al[(cy.at += 427135973) * -964267539 - 1] = var4.cm * 1223232735;
               return 1;
            }
         } else if (var0 == 2602) {
            if (var3 == 60) {
               throw new IllegalStateException();
            } else {
               cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = var4.ds;
               return 1;
            }
         } else if (2603 == var0) {
            if (var3 == 60) {
               throw new IllegalStateException();
            } else {
               cy.al[(cy.at += 427135973) * -964267539 - 1] = var4.cf * -773060713;
               return 1;
            }
         } else if (2604 == var0) {
            if (var3 == 60) {
               throw new IllegalStateException();
            } else {
               cy.al[(cy.at += 427135973) * -964267539 - 1] = var4.cl * -1273374131;
               return 1;
            }
         } else if (2605 == var0) {
            if (var3 == 60) {
               throw new IllegalStateException();
            } else {
               cy.al[(cy.at += 427135973) * -964267539 - 1] = 942674363 * var4.db;
               return 1;
            }
         } else if (var0 == 2606) {
            if (var3 == 60) {
               throw new IllegalStateException();
            } else {
               cy.al[(cy.at += 427135973) * -964267539 - 1] = 797932055 * var4.dh;
               return 1;
            }
         } else if (2607 == var0) {
            if (var3 == 60) {
               throw new IllegalStateException();
            } else {
               cy.al[(cy.at += 427135973) * -964267539 - 1] = -1023931993 * var4.du;
               return 1;
            }
         } else if (2608 == var0) {
            if (var3 == 60) {
               throw new IllegalStateException();
            } else {
               cy.al[(cy.at += 427135973) * -964267539 - 1] = -480949115 * var4.dp;
               return 1;
            }
         } else if (2609 == var0) {
            if (var3 == 60) {
               throw new IllegalStateException();
            } else {
               cy.al[(cy.at += 427135973) * -964267539 - 1] = 1634279623 * var4.co;
               return 1;
            }
         } else if (2610 == var0) {
            if (var3 == 60) {
               throw new IllegalStateException();
            } else {
               cy.al[(cy.at += 427135973) * -964267539 - 1] = 122284991 * var4.cz;
               return 1;
            }
         } else if (2611 == var0) {
            if (var3 == 60) {
               throw new IllegalStateException();
            } else {
               cy.al[(cy.at += 427135973) * -964267539 - 1] = var4.cg * 1409091639;
               return 1;
            }
         } else if (2612 == var0) {
            if (var3 == 60) {
               throw new IllegalStateException();
            } else {
               cy.al[(cy.at += 427135973) * -964267539 - 1] = 1449039161 * var4.cr;
               return 1;
            }
         } else if (var0 == 2613) {
            if (var3 == 60) {
               throw new IllegalStateException();
            } else {
               cy.al[(cy.at += 427135973) * -964267539 - 1] = var4.cb.af(2096946766);
               return 1;
            }
         } else if (var0 == 2614) {
            cy.al[(cy.at += 427135973) * -964267539 - 1] = var4.dx ? 1 : 0;
            return 1;
         } else {
            lo var5;
            if (var0 == 2617) {
               if (var3 == 60) {
                  throw new IllegalStateException();
               }

               var5 = var4.bn(-1740765458);
               cy.al[(cy.at += 427135973) * -964267539 - 1] = null != var5 ? var5.af * -90398499 : 0;
            }

            int[] var10000;
            int var10001;
            int var10002;
            if (2618 == var0) {
               if (var3 == 60) {
                  throw new IllegalStateException();
               } else {
                  var5 = var4.bn(-1740765458);
                  var10000 = cy.al;
                  var10001 = (cy.at += 427135973) * -964267539 - 1;
                  if (var5 != null) {
                     if (var3 == 60) {
                        throw new IllegalStateException();
                     }

                     var10002 = var5.an * 216034339;
                  } else {
                     var10002 = 0;
                  }

                  var10000[var10001] = var10002;
                  return 1;
               }
            } else {
               mz var10;
               String[] var12;
               String var13;
               if (2619 == var0) {
                  var10 = var4.bj((byte)11);
                  var12 = cy.aa;
                  var10001 = (dm.ay += -1086551379) * -2017760987 - 1;
                  if (null != var10) {
                     if (var3 == 60) {
                        throw new IllegalStateException();
                     }

                     var13 = var10.bh((byte)19).ab(-1389348498);
                  } else {
                     var13 = "";
                  }

                  var12[var10001] = var13;
                  return 1;
               } else if (2620 == var0) {
                  if (var3 == 60) {
                     throw new IllegalStateException();
                  } else {
                     var5 = var4.bn(-1740765458);
                     var10000 = cy.al;
                     var10001 = (cy.at += 427135973) * -964267539 - 1;
                     if (null != var5) {
                        if (var3 == 60) {
                           throw new IllegalStateException();
                        }

                        var10002 = var5.aw * 1912484269;
                     } else {
                        var10002 = 0;
                     }

                     var10000[var10001] = var10002;
                     return 1;
                  }
               } else if (2621 == var0) {
                  if (var3 == 60) {
                     throw new IllegalStateException();
                  } else {
                     var10 = var4.bj((byte)18);
                     var10000 = cy.al;
                     var10001 = (cy.at += 427135973) * -964267539 - 1;
                     if (var10 != null) {
                        if (var3 == 60) {
                           throw new IllegalStateException();
                        }

                        var10002 = var10.cq(-1665664841);
                     } else {
                        var10002 = 0;
                     }

                     var10000[var10001] = var10002;
                     return 1;
                  }
               } else if (var0 == 2622) {
                  if (var3 == 60) {
                     throw new IllegalStateException();
                  } else {
                     var10 = var4.bj((byte)22);
                     var10000 = cy.al;
                     var10001 = (cy.at += 427135973) * -964267539 - 1;
                     if (var10 != null) {
                        if (var3 == 60) {
                           throw new IllegalStateException();
                        }

                        var10002 = var10.cm(-2018781112);
                     } else {
                        var10002 = 0;
                     }

                     var10000[var10001] = var10002;
                     return 1;
                  }
               } else if (var0 == 2623) {
                  if (var3 == 60) {
                     throw new IllegalStateException();
                  } else {
                     var10 = var4.bj((byte)-72);
                     var10000 = cy.al;
                     var10001 = (cy.at += 427135973) * -964267539 - 1;
                     if (var10 != null) {
                        if (var3 == 60) {
                           throw new IllegalStateException();
                        }

                        var10002 = var10.cf(1424429838);
                     } else {
                        var10002 = 0;
                     }

                     var10000[var10001] = var10002;
                     return 1;
                  }
               } else {
                  byte var14;
                  if (var0 == 2624) {
                     if (var3 == 60) {
                        throw new IllegalStateException();
                     } else {
                        label432: {
                           var10 = var4.bj((byte)-8);
                           var10000 = cy.al;
                           var10001 = (cy.at += 427135973) * -964267539 - 1;
                           if (var10 != null) {
                              if (var3 == 60) {
                                 throw new IllegalStateException();
                              }

                              if (var10.ce(1794299510)) {
                                 if (var3 == 60) {
                                    throw new IllegalStateException();
                                 }

                                 var14 = 1;
                                 break label432;
                              }
                           }

                           var14 = 0;
                        }

                        var10000[var10001] = var14;
                        return 1;
                     }
                  } else if (var0 == 2625) {
                     if (var3 == 60) {
                        throw new IllegalStateException();
                     } else {
                        label441: {
                           var10 = var4.bj((byte)13);
                           var10000 = cy.al;
                           var10001 = (cy.at += 427135973) * -964267539 - 1;
                           if (var10 != null) {
                              if (var3 == 60) {
                                 throw new IllegalStateException();
                              }

                              if (var10.ci(1994580892)) {
                                 if (var3 == 60) {
                                    throw new IllegalStateException();
                                 }

                                 var14 = 1;
                                 break label441;
                              }
                           }

                           var14 = 0;
                        }

                        var10000[var10001] = var14;
                        return 1;
                     }
                  } else if (2626 == var0) {
                     if (var3 == 60) {
                        throw new IllegalStateException();
                     } else {
                        var10 = var4.bj((byte)15);
                        var12 = cy.aa;
                        var10001 = (dm.ay += -1086551379) * -2017760987 - 1;
                        if (null != var10) {
                           if (var3 == 60) {
                              throw new IllegalStateException();
                           }

                           var13 = var10.bw(1348666556).af(1175090531);
                        } else {
                           var13 = "";
                        }

                        var12[var10001] = var13;
                        return 1;
                     }
                  } else if (var0 == 2627) {
                     if (var3 == 60) {
                        throw new IllegalStateException();
                     } else {
                        var10 = var4.bj((byte)-66);
                        int var11;
                        if (null != var10) {
                           if (var3 == 60) {
                              throw new IllegalStateException();
                           }

                           var11 = var10.cn(1922606018);
                        } else {
                           var11 = 0;
                        }

                        int var6 = var11;
                        int var7 = null != var10 ? var10.cc(-1877189318) : 0;
                        cy.al[(cy.at += 427135973) * -964267539 - 1] = Math.min(var6, var7);
                        cy.al[(cy.at += 427135973) * -964267539 - 1] = Math.max(var6, var7);
                        return 1;
                     }
                  } else if (var0 == 2628) {
                     if (var3 == 60) {
                        throw new IllegalStateException();
                     } else {
                        var10 = var4.bj((byte)-41);
                        cy.al[(cy.at += 427135973) * -964267539 - 1] = var10 != null ? var10.cc(744622504) : 0;
                        return 1;
                     }
                  } else if (var0 == 2629) {
                     var10 = var4.bj((byte)-45);
                     var10000 = cy.al;
                     var10001 = (cy.at += 427135973) * -964267539 - 1;
                     if (null != var10) {
                        if (var3 == 60) {
                           throw new IllegalStateException();
                        }

                        var10002 = var10.cg(-743051865);
                     } else {
                        var10002 = 0;
                     }

                     var10000[var10001] = var10002;
                     return 1;
                  } else if (var0 == 2630) {
                     if (var3 == 60) {
                        throw new IllegalStateException();
                     } else {
                        var10 = var4.bj((byte)-51);
                        var10000 = cy.al;
                        var10001 = (cy.at += 427135973) * -964267539 - 1;
                        if (var10 != null) {
                           if (var3 == 60) {
                              throw new IllegalStateException();
                           }

                           var10002 = var10.cl((byte)-65);
                        } else {
                           var10002 = 0;
                        }

                        var10000[var10001] = var10002;
                        return 1;
                     }
                  } else if (2631 == var0) {
                     if (var3 == 60) {
                        throw new IllegalStateException();
                     } else {
                        var10 = var4.bj((byte)-45);
                        var10000 = cy.al;
                        var10001 = (cy.at += 427135973) * -964267539 - 1;
                        if (null != var10) {
                           if (var3 == 60) {
                              throw new IllegalStateException();
                           }

                           var10002 = var10.cr(860916461);
                        } else {
                           var10002 = 0;
                        }

                        var10000[var10001] = var10002;
                        return 1;
                     }
                  } else if (2632 == var0) {
                     if (var3 == 60) {
                        throw new IllegalStateException();
                     } else {
                        var10 = var4.bj((byte)58);
                        var10000 = cy.al;
                        var10001 = (cy.at += 427135973) * -964267539 - 1;
                        if (null != var10) {
                           if (var3 == 60) {
                              throw new IllegalStateException();
                           }

                           var10002 = var10.cy((byte)-40);
                        } else {
                           var10002 = 0;
                        }

                        var10000[var10001] = var10002;
                        return 1;
                     }
                  } else {
                     bb var9;
                     if (var0 == 2633) {
                        var9 = var4.bs(2109250007);
                        var10000 = cy.al;
                        var10001 = cy.at * -964267539 - 1;
                        if (var9 != null) {
                           if (var3 == 60) {
                              throw new IllegalStateException();
                           }

                           var10002 = var9.aw(cy.al[cy.at * -964267539 - 1], -1240015420);
                        } else {
                           var10002 = 0;
                        }

                        var10000[var10001] = var10002;
                        return 1;
                     } else if (var0 == 2634) {
                        if (var3 == 60) {
                           throw new IllegalStateException();
                        } else {
                           var9 = var4.bs(2024612722);
                           var10000 = cy.al;
                           var10001 = cy.at * -964267539 - 1;
                           if (var9 != null) {
                              if (var3 == 60) {
                                 throw new IllegalStateException();
                              }

                              var10002 = var9.ac((char)cy.al[-964267539 * cy.at - 1], (byte)32);
                           } else {
                              var10002 = 0;
                           }

                           var10000[var10001] = var10002;
                           return 1;
                        }
                     } else {
                        return 2;
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var8) {
         throw db.an(var8, "bd.aj(" + ')');
      }
   }

   public static boolean an(char var0, int var1) {
      try {
         if (var0 >= ' ') {
            if (var1 == 361417104) {
               throw new IllegalStateException();
            }

            if (var0 < 127) {
               return true;
            }

            if (var1 == 361417104) {
               throw new IllegalStateException();
            }
         }

         if (var0 > 127) {
            if (var0 < 160) {
               return true;
            }

            if (var1 == 361417104) {
               throw new IllegalStateException();
            }
         }

         if (var0 > 160) {
            if (var1 == 361417104) {
               throw new IllegalStateException();
            }

            if (var0 <= 255) {
               if (var1 == 361417104) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         if (0 != var0) {
            if (var1 == 361417104) {
               throw new IllegalStateException();
            }

            char[] var2 = od.af;

            for(int var3 = 0; var3 < var2.length; ++var3) {
               char var4 = var2[var3];
               if (var4 == var0) {
                  return true;
               }
            }
         }

         return false;
      } catch (RuntimeException var5) {
         throw db.an(var5, "bd.an(" + ')');
      }
   }
}
