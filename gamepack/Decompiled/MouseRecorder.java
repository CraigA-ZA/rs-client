public class MouseRecorder implements Runnable {
   public static int at;
   boolean af = true;
   int aw = 0;
   int[] ac = new int[500];
   int[] au = new int[500];
   Object an = new Object();
   long[] ab = new long[500];

   MouseRecorder() {
   }

   public void run() {
      for(; this.af; PlayerAppearance.af(50L)) {
         synchronized(this.an) {
            if (this.aw * 535437747 < 500) {
               this.ac[535437747 * this.aw] = MouseHandler.ay * -2063363905;
               this.au[535437747 * this.aw] = -1224153235 * MouseHandler.ao;
               this.ab[this.aw * 535437747] = -1090234605399222665L * MouseHandler.ax;
               this.aw += -1762036357;
            }
         }
      }

   }

   static final boolean isUsernameWhiteSpace(char var0) {
      return var0 == 160 || ' ' == var0 || var0 == '_' || '-' == var0;
   }

   static Message au_renamed(int var0) {
      return (Message)Messages.an.get((long)var0);
   }

   static int bf_renamed(int var0, ClientScript var1, boolean var2) {
      int var4;
      if (6600 == var0) {
         var4 = GameShell.mh * -1727408401;
         int var17 = (MusicPatchNode.mi.bx * 1144428983 >> 7) + jm.ib * -1232093375;
         int var13 = Scenery.jc * 827352769 + (-411750205 * MusicPatchNode.mi.bo >> 7);
         dz.worldMap().ao(var4, var17, var13, true);
         return 1;
      } else {
         WorldMapArea var8;
         if (var0 == 6601) {
            var4 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
            String var16 = "";
            var8 = dz.worldMap().getMapArea(var4);
            if (null != var8) {
               var16 = var8.archiveName();
            }

            Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var16;
            return 1;
         } else if (var0 == 6602) {
            var4 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
            dz.worldMap().ax(var4);
            return 1;
         } else if (var0 == 6603) {
            Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = dz.worldMap().by();
            return 1;
         } else if (var0 == 6604) {
            var4 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
            dz.worldMap().ad(var4);
            return 1;
         } else if (6605 == var0) {
            Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = dz.worldMap().isCacheLoaded() ? 1 : 0;
            return 1;
         } else {
            Coord var15;
            if (6606 == var0) {
               var15 = new Coord(Interpreter.al[(Interpreter.at -= 427135973) * -964267539]);
               dz.worldMap().bk(-96298701 * var15.an, -2105445199 * var15.aw);
               return 1;
            } else if (6607 == var0) {
               var15 = new Coord(Interpreter.al[(Interpreter.at -= 427135973) * -964267539]);
               dz.worldMap().bx(-96298701 * var15.an, -2105445199 * var15.aw);
               return 1;
            } else if (var0 == 6608) {
               var15 = new Coord(Interpreter.al[(Interpreter.at -= 427135973) * -964267539]);
               dz.worldMap().bo(-113644749 * var15.af, var15.an * -96298701, var15.aw * -2105445199);
               return 1;
            } else if (6609 == var0) {
               var15 = new Coord(Interpreter.al[(Interpreter.at -= 427135973) * -964267539]);
               dz.worldMap().bz(var15.af * -113644749, var15.an * -96298701, var15.aw * -2105445199);
               return 1;
            } else if (var0 == 6610) {
               Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = dz.worldMap().bm();
               Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = dz.worldMap().bd();
               return 1;
            } else {
               WorldMapArea var12;
               if (var0 == 6611) {
                  var4 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                  var12 = dz.worldMap().getMapArea(var4);
                  if (var12 == null) {
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
                  } else {
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var12.origin().af();
                  }

                  return 1;
               } else if (var0 == 6612) {
                  var4 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                  var12 = dz.worldMap().getMapArea(var4);
                  if (var12 == null) {
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
                  } else {
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = (var12.maxX() - var12.minX() + 1) * 64;
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = (var12.maxY() - var12.minY() + 1) * 64;
                  }

                  return 1;
               } else if (6613 == var0) {
                  var4 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                  var12 = dz.worldMap().getMapArea(var4);
                  if (var12 == null) {
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
                  } else {
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var12.minX() * 64;
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var12.minY() * 64;
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var12.maxX() * 64 + 64 - 1;
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var12.maxY() * 64 + 64 - 1;
                  }

                  return 1;
               } else if (var0 == 6614) {
                  var4 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                  var12 = dz.worldMap().getMapArea(var4);
                  if (var12 == null) {
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -1;
                  } else {
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var12.zoom();
                  }

                  return 1;
               } else if (6615 == var0) {
                  var15 = dz.worldMap().bt();
                  if (null == var15) {
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -1;
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -1;
                  } else {
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var15.an * -96298701;
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -2105445199 * var15.aw;
                  }

                  return 1;
               } else if (var0 == 6616) {
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = dz.worldMap().currentMapAreaId();
                  return 1;
               } else if (6617 == var0) {
                  var15 = new Coord(Interpreter.al[(Interpreter.at -= 427135973) * -964267539]);
                  var12 = dz.worldMap().getCurrentMapArea();
                  if (null == var12) {
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -1;
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -1;
                     return 1;
                  } else {
                     int[] var11 = var12.position(var15.af * -113644749, -96298701 * var15.an, -2105445199 * var15.aw);
                     if (null == var11) {
                        Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -1;
                        Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -1;
                     } else {
                        Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var11[0];
                        Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var11[1];
                     }

                     return 1;
                  }
               } else {
                  Coord var6;
                  if (6618 == var0) {
                     var15 = new Coord(Interpreter.al[(Interpreter.at -= 427135973) * -964267539]);
                     var12 = dz.worldMap().getCurrentMapArea();
                     if (var12 == null) {
                        Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -1;
                        Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -1;
                        return 1;
                     } else {
                        var6 = var12.coord(var15.an * -96298701, var15.aw * -2105445199);
                        if (null == var6) {
                           Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -1;
                        } else {
                           Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var6.af();
                        }

                        return 1;
                     }
                  } else {
                     Coord var9;
                     if (var0 == 6619) {
                        Interpreter.at -= 854271946;
                        var4 = Interpreter.al[-964267539 * Interpreter.at];
                        var9 = new Coord(Interpreter.al[Interpreter.at * -964267539 + 1]);
                        ii.cs_renamed(var4, var9, false);
                        return 1;
                     } else if (var0 == 6620) {
                        Interpreter.at -= 854271946;
                        var4 = Interpreter.al[Interpreter.at * -964267539];
                        var9 = new Coord(Interpreter.al[1 + Interpreter.at * -964267539]);
                        ii.cs_renamed(var4, var9, true);
                        return 1;
                     } else if (6621 == var0) {
                        Interpreter.at -= 854271946;
                        var4 = Interpreter.al[Interpreter.at * -964267539];
                        var9 = new Coord(Interpreter.al[1 + -964267539 * Interpreter.at]);
                        var8 = dz.worldMap().getMapArea(var4);
                        if (var8 == null) {
                           Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
                           return 1;
                        } else {
                           Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var8.containsCoord(var9.af * -113644749, var9.an * -96298701, -2105445199 * var9.aw) ? 1 : 0;
                           return 1;
                        }
                     } else if (var0 == 6622) {
                        Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = dz.worldMap().bj();
                        Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = dz.worldMap().bn();
                        return 1;
                     } else if (var0 == 6623) {
                        var15 = new Coord(Interpreter.al[(Interpreter.at -= 427135973) * -964267539]);
                        var12 = dz.worldMap().mapAreaAtCoord(-113644749 * var15.af, var15.an * -96298701, -2105445199 * var15.aw);
                        if (var12 == null) {
                           Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -1;
                        } else {
                           Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var12.id();
                        }

                        return 1;
                     } else if (6624 == var0) {
                        dz.worldMap().bs(Interpreter.al[(Interpreter.at -= 427135973) * -964267539]);
                        return 1;
                     } else if (var0 == 6625) {
                        dz.worldMap().br();
                        return 1;
                     } else if (var0 == 6626) {
                        dz.worldMap().bg(Interpreter.al[(Interpreter.at -= 427135973) * -964267539]);
                        return 1;
                     } else if (var0 == 6627) {
                        dz.worldMap().bu();
                        return 1;
                     } else {
                        boolean var14;
                        if (var0 == 6628) {
                           var14 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1;
                           dz.worldMap().perpetualFlash(var14);
                           return 1;
                        } else if (6629 == var0) {
                           var4 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                           dz.worldMap().flashElement(var4);
                           return 1;
                        } else if (var0 == 6630) {
                           var4 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                           dz.worldMap().flashCategory(var4);
                           return 1;
                        } else if (var0 == 6631) {
                           dz.worldMap().stopCurrentFlashes();
                           return 1;
                        } else if (var0 == 6632) {
                           var14 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1;
                           dz.worldMap().setElementsEnabled(var14);
                           return 1;
                        } else {
                           boolean var10;
                           if (var0 == 6633) {
                              Interpreter.at -= 854271946;
                              var4 = Interpreter.al[Interpreter.at * -964267539];
                              var10 = 1 == Interpreter.al[1 + -964267539 * Interpreter.at];
                              dz.worldMap().disableElement(var4, var10);
                              return 1;
                           } else if (6634 == var0) {
                              Interpreter.at -= 854271946;
                              var4 = Interpreter.al[Interpreter.at * -964267539];
                              var10 = Interpreter.al[1 + -964267539 * Interpreter.at] == 1;
                              dz.worldMap().disableCategory(var4, var10);
                              return 1;
                           } else if (var0 == 6635) {
                              Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = dz.worldMap().getElementsEnabled() ? 1 : 0;
                              return 1;
                           } else if (6636 == var0) {
                              var4 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                              Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = dz.worldMap().isElementDisabled(var4) ? 1 : 0;
                              return 1;
                           } else if (var0 == 6637) {
                              var4 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                              Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = dz.worldMap().isCategoryDisabled(var4) ? 1 : 0;
                              return 1;
                           } else if (var0 == 6638) {
                              Interpreter.at -= 854271946;
                              var4 = Interpreter.al[Interpreter.at * -964267539];
                              var9 = new Coord(Interpreter.al[1 + Interpreter.at * -964267539]);
                              var6 = dz.worldMap().cc(var4, var9);
                              if (null == var6) {
                                 Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -1;
                              } else {
                                 Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var6.af();
                              }

                              return 1;
                           } else {
                              AbstractWorldMapIcon var7;
                              if (var0 == 6639) {
                                 var7 = dz.worldMap().iconStart();
                                 if (var7 == null) {
                                    Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -1;
                                    Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -1;
                                 } else {
                                    Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var7.element();
                                    Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var7.aq.af();
                                 }

                                 return 1;
                              } else if (var0 == 6640) {
                                 var7 = dz.worldMap().iconNext();
                                 if (var7 == null) {
                                    Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -1;
                                    Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -1;
                                 } else {
                                    Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var7.element();
                                    Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var7.aq.af();
                                 }

                                 return 1;
                              } else {
                                 MapElementType var5;
                                 if (6693 == var0) {
                                    var4 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                                    var5 = nf.getMapElementType(var4);
                                    if (null == var5.al) {
                                       Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = "";
                                    } else {
                                       Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var5.al;
                                    }

                                    return 1;
                                 } else if (var0 == 6694) {
                                    var4 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                                    var5 = nf.getMapElementType(var4);
                                    Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 952315347 * var5.aa;
                                    return 1;
                                 } else if (6695 == var0) {
                                    var4 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                                    var5 = nf.getMapElementType(var4);
                                    if (null == var5) {
                                       Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -1;
                                    } else {
                                       Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var5.ae * -461862935;
                                    }

                                    return 1;
                                 } else if (6696 == var0) {
                                    var4 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                                    var5 = nf.getMapElementType(var4);
                                    if (null == var5) {
                                       Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -1;
                                    } else {
                                       Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 1458003089 * var5.ab;
                                    }

                                    return 1;
                                 } else if (var0 == 6697) {
                                    Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = ByteArrayPool.aj.af * 1618357717;
                                    return 1;
                                 } else if (var0 == 6698) {
                                    Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = ByteArrayPool.aj.an.af();
                                    return 1;
                                 } else if (var0 == 6699) {
                                    Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = ByteArrayPool.aj.aw.af();
                                    return 1;
                                 } else {
                                    return 2;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }
}
