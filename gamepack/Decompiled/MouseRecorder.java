public class MouseRecorder implements Runnable {
   public static int at;
   boolean isRunning = true;
   int index = 0;
   int[] xs = new int[500];
   int[] ys = new int[500];
   Object lock = new Object();
   long[] millis = new long[500];

   MouseRecorder() {
   }

   public void run() {
      for(; this.isRunning; PlayerAppearance.af(50L)) {
         synchronized(this.lock) {
            if (this.index * 535437747 < 500) {
               this.xs[535437747 * this.index] = MouseHandler.ay * -2063363905;
               this.ys[535437747 * this.index] = -1224153235 * MouseHandler.ao;
               this.millis[this.index * 535437747] = -1090234605399222665L * MouseHandler.ax;
               this.index += -1762036357;
            }
         }
      }

   }

   static final boolean isUsernameWhiteSpace(char var0) {
      return var0 == 160 || ' ' == var0 || var0 == '_' || '-' == var0;
   }

   static Message au_renamed(int var0) {
      return (Message)Messages.Messages_hashTable.get((long)var0);
   }

   static int bf_renamed(int var0, ClientScript var1, boolean var2) {
      int var4;
      if (6600 == var0) {
         var4 = GameShell.plane * -1727408401;
         int var27 = (MusicPatchNode.localPlayer.bx * 1144428983 >> 7) + jm.ib * -1232093375;
         int var23 = Scenery.jc * 827352769 + (-411750205 * MusicPatchNode.localPlayer.bo >> 7);
         dz.worldMap().ao(var4, var27, var23, true);
         return 1;
      } else {
         WorldMapArea var18;
         if (var0 == 6601) {
            var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            String var26 = "";
            var18 = dz.worldMap().getMapArea(var4);
            if (null != var18) {
               var26 = var18.name();
            }

            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var26;
            return 1;
         } else if (var0 == 6602) {
            var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            dz.worldMap().ax(var4);
            return 1;
         } else if (var0 == 6603) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = dz.worldMap().by();
            return 1;
         } else if (var0 == 6604) {
            var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            dz.worldMap().ad(var4);
            return 1;
         } else if (6605 == var0) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = dz.worldMap().isCacheLoaded() ? 1 : 0;
            return 1;
         } else {
            Coord var25;
            if (6606 == var0) {
               var25 = new Coord(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
               dz.worldMap().bk(-96298701 * var25.x, -2105445199 * var25.z);
               return 1;
            } else if (6607 == var0) {
               var25 = new Coord(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
               dz.worldMap().bx(-96298701 * var25.x, -2105445199 * var25.z);
               return 1;
            } else if (var0 == 6608) {
               var25 = new Coord(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
               dz.worldMap().bo(-113644749 * var25.y, var25.x * -96298701, var25.z * -2105445199);
               return 1;
            } else if (6609 == var0) {
               var25 = new Coord(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
               dz.worldMap().bz(var25.y * -113644749, var25.x * -96298701, var25.z * -2105445199);
               return 1;
            } else if (var0 == 6610) {
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = dz.worldMap().bm();
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = dz.worldMap().bd();
               return 1;
            } else {
               WorldMapArea var22;
               if (var0 == 6611) {
                  var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                  var22 = dz.worldMap().getMapArea(var4);
                  if (var22 == null) {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                  } else {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var22.origin().af();
                  }

                  return 1;
               } else if (var0 == 6612) {
                  var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                  var22 = dz.worldMap().getMapArea(var4);
                  if (var22 == null) {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                  } else {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (var22.maxX() - var22.minX() + 1) * 64;
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (var22.maxY() - var22.minY() + 1) * 64;
                  }

                  return 1;
               } else if (6613 == var0) {
                  var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                  var22 = dz.worldMap().getMapArea(var4);
                  if (var22 == null) {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                  } else {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var22.minX() * 64;
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var22.minY() * 64;
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var22.maxX() * 64 + 64 - 1;
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var22.maxY() * 64 + 64 - 1;
                  }

                  return 1;
               } else if (var0 == 6614) {
                  var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                  var22 = dz.worldMap().getMapArea(var4);
                  if (var22 == null) {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                  } else {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var22.zoom();
                  }

                  return 1;
               } else if (6615 == var0) {
                  var25 = dz.worldMap().bt();
                  if (null == var25) {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                  } else {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var25.x * -96298701;
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -2105445199 * var25.z;
                  }

                  return 1;
               } else if (var0 == 6616) {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = dz.worldMap().currentMapAreaId();
                  return 1;
               } else if (6617 == var0) {
                  var25 = new Coord(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
                  var22 = dz.worldMap().getCurrentMapArea();
                  if (null == var22) {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                     return 1;
                  } else {
                     int[] var21 = var22.position(var25.y * -113644749, -96298701 * var25.x, -2105445199 * var25.z);
                     if (null == var21) {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                     } else {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var21[0];
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var21[1];
                     }

                     return 1;
                  }
               } else {
                  Coord var6;
                  if (6618 == var0) {
                     var25 = new Coord(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
                     var22 = dz.worldMap().getCurrentMapArea();
                     if (var22 == null) {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                        return 1;
                     } else {
                        var6 = var22.coord(var25.x * -96298701, var25.z * -2105445199);
                        if (null == var6) {
                           Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                        } else {
                           Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var6.af();
                        }

                        return 1;
                     }
                  } else {
                     Coord var19;
                     if (var0 == 6619) {
                        Interpreter.Interpreter_intStackSize -= 854271946;
                        var4 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                        var19 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1]);
                        ii.cs_renamed(var4, var19, false);
                        return 1;
                     } else if (var0 == 6620) {
                        Interpreter.Interpreter_intStackSize -= 854271946;
                        var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                        var19 = new Coord(Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539]);
                        ii.cs_renamed(var4, var19, true);
                        return 1;
                     } else if (6621 == var0) {
                        Interpreter.Interpreter_intStackSize -= 854271946;
                        var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                        var19 = new Coord(Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize]);
                        var18 = dz.worldMap().getMapArea(var4);
                        if (var18 == null) {
                           Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                           return 1;
                        } else {
                           Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var18.containsCoord(var19.y * -113644749, var19.x * -96298701, -2105445199 * var19.z) ? 1 : 0;
                           return 1;
                        }
                     } else if (var0 == 6622) {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = dz.worldMap().bj();
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = dz.worldMap().bn();
                        return 1;
                     } else if (var0 == 6623) {
                        var25 = new Coord(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
                        var22 = dz.worldMap().mapAreaAtCoord(-113644749 * var25.y, var25.x * -96298701, -2105445199 * var25.z);
                        if (var22 == null) {
                           Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                        } else {
                           Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var22.id();
                        }

                        return 1;
                     } else if (6624 == var0) {
                        dz.worldMap().bs(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
                        return 1;
                     } else if (var0 == 6625) {
                        dz.worldMap().br();
                        return 1;
                     } else if (var0 == 6626) {
                        dz.worldMap().bg(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
                        return 1;
                     } else if (var0 == 6627) {
                        dz.worldMap().bu();
                        return 1;
                     } else {
                        boolean var24;
                        if (var0 == 6628) {
                           var24 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                           dz.worldMap().perpetualFlash(var24);
                           return 1;
                        } else if (6629 == var0) {
                           var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                           dz.worldMap().flashElement(var4);
                           return 1;
                        } else if (var0 == 6630) {
                           var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                           dz.worldMap().flashCategory(var4);
                           return 1;
                        } else if (var0 == 6631) {
                           dz.worldMap().stopCurrentFlashes();
                           return 1;
                        } else if (var0 == 6632) {
                           var24 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                           dz.worldMap().setElementsEnabled(var24);
                           return 1;
                        } else {
                           boolean var20;
                           if (var0 == 6633) {
                              Interpreter.Interpreter_intStackSize -= 854271946;
                              var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                              var20 = 1 == Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize];
                              dz.worldMap().disableElement(var4, var20);
                              return 1;
                           } else if (6634 == var0) {
                              Interpreter.Interpreter_intStackSize -= 854271946;
                              var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                              var20 = Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize] == 1;
                              dz.worldMap().disableCategory(var4, var20);
                              return 1;
                           } else if (var0 == 6635) {
                              Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = dz.worldMap().getElementsEnabled() ? 1 : 0;
                              return 1;
                           } else if (6636 == var0) {
                              var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                              Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = dz.worldMap().isElementDisabled(var4) ? 1 : 0;
                              return 1;
                           } else if (var0 == 6637) {
                              var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                              Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = dz.worldMap().isCategoryDisabled(var4) ? 1 : 0;
                              return 1;
                           } else if (var0 == 6638) {
                              Interpreter.Interpreter_intStackSize -= 854271946;
                              var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                              var19 = new Coord(Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539]);
                              var6 = dz.worldMap().cc(var4, var19);
                              if (null == var6) {
                                 Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                              } else {
                                 Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var6.af();
                              }

                              return 1;
                           } else {
                              AbstractWorldMapIcon var17;
                              if (var0 == 6639) {
                                 var17 = dz.worldMap().iconStart();
                                 if (var17 == null) {
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                                 } else {
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var17.element();
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var17.coord2.af();
                                 }

                                 return 1;
                              } else if (var0 == 6640) {
                                 var17 = dz.worldMap().iconNext();
                                 if (var17 == null) {
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                                 } else {
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var17.element();
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var17.coord2.af();
                                 }

                                 return 1;
                              } else {
                                 MapElementType var5;
                                 if (6693 == var0) {
                                    var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                                    var5 = nf.getMapElementType(var4);
                                    if (null == var5.al) {
                                       Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
                                    } else {
                                       Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var5.al;
                                    }

                                    return 1;
                                 } else if (var0 == 6694) {
                                    var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                                    var5 = nf.getMapElementType(var4);
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 952315347 * var5.labelsize;
                                    return 1;
                                 } else if (6695 == var0) {
                                    var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                                    var5 = nf.getMapElementType(var4);
                                    if (null == var5) {
                                       Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                                    } else {
                                       Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var5.category * -461862935;
                                    }

                                    return 1;
                                 } else if (6696 == var0) {
                                    var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                                    var5 = nf.getMapElementType(var4);
                                    if (null == var5) {
                                       Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                                    } else {
                                       Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1458003089 * var5.sprite1;
                                    }

                                    return 1;
                                 } else if (var0 == 6697) {
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ByteArrayPool.worldMapEvent.mapElement * 1618357717;
                                    return 1;
                                 } else if (var0 == 6698) {
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ByteArrayPool.worldMapEvent.coord1.af();
                                    return 1;
                                 } else if (var0 == 6699) {
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ByteArrayPool.worldMapEvent.coord2.af();
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
