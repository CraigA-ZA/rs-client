public class mi {
   static final mi af = new mi(51, 27, 800, 0, 16, 16);
   static final mi an = new mi(25, 28, 800, 656, 40, 40);
   final int aw;
   final int ac;
   static final int wb = 2;

   mi(int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         super();
         this.aw = -383400655 * var5;
         this.ac = 1549082123 * var6;
      } catch (RuntimeException var7) {
         throw db.an(var7, "mi.<init>(" + ')');
      }
   }

   static void ac(sq var0, int var1, int var2) {
      try {
         boolean var10000;
         if (var0.at(1, -1838068044) == 1) {
            if (var2 == 1995081372) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var3 = var10000;
         if (var3) {
            ds.ai[(ds.ax += 1362331411) * 1474255643 - 1] = var1;
         }

         int var4 = var0.at(2, -1385119441);
         dv var5 = client.mc[var1];
         if (var4 == 0) {
            if (var3) {
               if (var2 == 1995081372) {
                  throw new IllegalStateException();
               } else {
                  var5.bi = false;
               }
            } else if (-549033243 * client.mg == var1) {
               if (var2 != 1995081372) {
                  throw new RuntimeException();
               }
            } else {
               ds.aa[var1] = (jm.ib * -1232093375 + var5.dy[0] >> 13 << 14) + (var5.ad * -1900490645 << 28) + (var5.ds[0] + jj.jc * 827352769 >> 13);
               if (var5.cx * -283165269 != -1) {
                  if (var2 == 1995081372) {
                     throw new IllegalStateException();
                  }

                  ds.ay[var1] = var5.cx * -283165269;
               } else {
                  ds.ay[var1] = -1751341433 * var5.dd;
               }

               ds.ao[var1] = var5.cr * 1005900761;
               client.mc[var1] = null;
               if (var0.at(1, -549893763) != 0) {
                  if (var2 == 1995081372) {
                     throw new IllegalStateException();
                  }

                  kb.au(var0, var1, 93651592);
               }

            }
         } else {
            int var6;
            int var7;
            int var8;
            if (var4 == 1) {
               if (var2 == 1995081372) {
                  throw new IllegalStateException();
               } else {
                  var6 = var0.at(3, 388873533);
                  var7 = var5.dy[0];
                  var8 = var5.ds[0];
                  if (0 == var6) {
                     if (var2 == 1995081372) {
                        throw new IllegalStateException();
                     }

                     --var7;
                     --var8;
                  } else if (1 == var6) {
                     if (var2 == 1995081372) {
                        return;
                     }

                     --var8;
                  } else if (2 == var6) {
                     ++var7;
                     --var8;
                  } else if (3 == var6) {
                     if (var2 == 1995081372) {
                        return;
                     }

                     --var7;
                  } else if (var6 == 4) {
                     if (var2 == 1995081372) {
                        throw new IllegalStateException();
                     }

                     ++var7;
                  } else if (var6 == 5) {
                     if (var2 == 1995081372) {
                        return;
                     }

                     --var7;
                     ++var8;
                  } else if (6 == var6) {
                     if (var2 == 1995081372) {
                        throw new IllegalStateException();
                     }

                     ++var8;
                  } else if (7 == var6) {
                     if (var2 == 1995081372) {
                        throw new IllegalStateException();
                     }

                     ++var7;
                     ++var8;
                  }

                  if (var1 == -549033243 * client.mg) {
                     label492: {
                        if (1144428983 * var5.bx >= 1536 && -411750205 * var5.bo >= 1536) {
                           if (var2 == 1995081372) {
                              return;
                           }

                           if (var5.bx * 1144428983 < 11776) {
                              if (var2 == 1995081372) {
                                 throw new IllegalStateException();
                              }

                              if (var5.bo * -411750205 < 11776) {
                                 break label492;
                              }

                              if (var2 == 1995081372) {
                                 throw new IllegalStateException();
                              }
                           }
                        }

                        var5.ar(var7, var8, -1060497849);
                        var5.bi = false;
                        return;
                     }
                  }

                  if (var3) {
                     if (var2 == 1995081372) {
                        throw new IllegalStateException();
                     }

                     var5.bi = true;
                     var5.be = -700518347 * var7;
                     var5.bk = var8 * -1699085727;
                  } else {
                     var5.bi = false;
                     var5.av(var7, var8, ds.ac[var1], (byte)-1);
                  }

               }
            } else if (var4 == 2) {
               if (var2 != 1995081372) {
                  var6 = var0.at(4, -1597041933);
                  var7 = var5.dy[0];
                  var8 = var5.ds[0];
                  if (var6 == 0) {
                     var7 -= 2;
                     var8 -= 2;
                  } else if (var6 == 1) {
                     if (var2 == 1995081372) {
                        throw new IllegalStateException();
                     }

                     --var7;
                     var8 -= 2;
                  } else if (var6 == 2) {
                     var8 -= 2;
                  } else if (var6 == 3) {
                     if (var2 == 1995081372) {
                        throw new IllegalStateException();
                     }

                     ++var7;
                     var8 -= 2;
                  } else if (4 == var6) {
                     if (var2 == 1995081372) {
                        throw new IllegalStateException();
                     }

                     var7 += 2;
                     var8 -= 2;
                  } else if (5 == var6) {
                     if (var2 == 1995081372) {
                        throw new IllegalStateException();
                     }

                     var7 -= 2;
                     --var8;
                  } else if (var6 == 6) {
                     if (var2 == 1995081372) {
                        return;
                     }

                     var7 += 2;
                     --var8;
                  } else if (var6 == 7) {
                     if (var2 == 1995081372) {
                        return;
                     }

                     var7 -= 2;
                  } else if (8 == var6) {
                     if (var2 == 1995081372) {
                        throw new IllegalStateException();
                     }

                     var7 += 2;
                  } else if (9 == var6) {
                     if (var2 == 1995081372) {
                        throw new IllegalStateException();
                     }

                     var7 -= 2;
                     ++var8;
                  } else if (10 == var6) {
                     if (var2 == 1995081372) {
                        throw new IllegalStateException();
                     }

                     var7 += 2;
                     ++var8;
                  } else if (11 == var6) {
                     var7 -= 2;
                     var8 += 2;
                  } else if (12 == var6) {
                     if (var2 == 1995081372) {
                        return;
                     }

                     --var7;
                     var8 += 2;
                  } else if (13 == var6) {
                     if (var2 == 1995081372) {
                        throw new IllegalStateException();
                     }

                     var8 += 2;
                  } else if (var6 == 14) {
                     if (var2 == 1995081372) {
                        throw new IllegalStateException();
                     }

                     ++var7;
                     var8 += 2;
                  } else if (15 == var6) {
                     if (var2 == 1995081372) {
                        throw new IllegalStateException();
                     }

                     var7 += 2;
                     var8 += 2;
                  }

                  if (var1 == client.mg * -549033243) {
                     label494: {
                        if (var2 == 1995081372) {
                           throw new IllegalStateException();
                        }

                        if (1144428983 * var5.bx >= 1536 && var5.bo * -411750205 >= 1536) {
                           if (var2 == 1995081372) {
                              throw new IllegalStateException();
                           }

                           if (var5.bx * 1144428983 < 11776) {
                              if (var2 == 1995081372) {
                                 throw new IllegalStateException();
                              }

                              if (var5.bo * -411750205 < 11776) {
                                 break label494;
                              }
                           }
                        }

                        var5.ar(var7, var8, -887988772);
                        var5.bi = false;
                        return;
                     }
                  }

                  if (var3) {
                     if (var2 == 1995081372) {
                        throw new IllegalStateException();
                     }

                     var5.bi = true;
                     var5.be = -700518347 * var7;
                     var5.bk = -1699085727 * var8;
                  } else {
                     var5.bi = false;
                     var5.av(var7, var8, ds.ac[var1], (byte)-111);
                  }

               }
            } else {
               var6 = var0.at(1, -1890954794);
               int var9;
               int var10;
               int var11;
               int var12;
               if (0 == var6) {
                  if (var2 != 1995081372) {
                     var7 = var0.at(12, -351033677);
                     var8 = var7 >> 10;
                     var9 = var7 >> 5 & 31;
                     if (var9 > 15) {
                        if (var2 == 1995081372) {
                           throw new IllegalStateException();
                        }

                        var9 -= 32;
                     }

                     var10 = var7 & 31;
                     if (var10 > 15) {
                        if (var2 == 1995081372) {
                           return;
                        }

                        var10 -= 32;
                     }

                     label433: {
                        label432: {
                           var11 = var9 + var5.dy[0];
                           var12 = var5.ds[0] + var10;
                           if (-549033243 * client.mg == var1) {
                              if (var2 == 1995081372) {
                                 throw new IllegalStateException();
                              }

                              if (1144428983 * var5.bx < 1536) {
                                 break label432;
                              }

                              if (var2 == 1995081372) {
                                 throw new IllegalStateException();
                              }

                              if (var5.bo * -411750205 < 1536 || var5.bx * 1144428983 >= 11776) {
                                 break label432;
                              }

                              if (var2 == 1995081372) {
                                 throw new IllegalStateException();
                              }

                              if (-411750205 * var5.bo >= 11776) {
                                 if (var2 == 1995081372) {
                                    throw new IllegalStateException();
                                 }
                                 break label432;
                              }
                           }

                           if (var3) {
                              if (var2 == 1995081372) {
                                 return;
                              }

                              var5.bi = true;
                              var5.be = -700518347 * var11;
                              var5.bk = -1699085727 * var12;
                           } else {
                              var5.bi = false;
                              var5.av(var11, var12, ds.ac[var1], (byte)-84);
                           }
                           break label433;
                        }

                        var5.ar(var11, var12, -2116502672);
                        var5.bi = false;
                     }

                     var5.ad = (byte)(-1900490645 * var5.ad + var8 & 3) * -1829675965;
                     if (var1 == client.mg * -549033243) {
                        if (var2 == 1995081372) {
                           throw new IllegalStateException();
                        }

                        bm.mh = var5.ad * 1128021573;
                     }

                  }
               } else {
                  label455: {
                     label454: {
                        var7 = var0.at(30, 187616942);
                        var8 = var7 >> 28;
                        var9 = var7 >> 14 & 16383;
                        var10 = var7 & 16383;
                        var11 = (var9 + var5.dy[0] + -1232093375 * jm.ib & 16383) - -1232093375 * jm.ib;
                        var12 = (var10 + var5.ds[0] + 827352769 * jj.jc & 16383) - jj.jc * 827352769;
                        if (-549033243 * client.mg == var1) {
                           if (var5.bx * 1144428983 < 1536) {
                              break label454;
                           }

                           if (var2 == 1995081372) {
                              throw new IllegalStateException();
                           }

                           if (-411750205 * var5.bo < 1536) {
                              break label454;
                           }

                           if (var2 == 1995081372) {
                              return;
                           }

                           if (var5.bx * 1144428983 >= 11776) {
                              break label454;
                           }

                           if (var2 == 1995081372) {
                              throw new IllegalStateException();
                           }

                           if (var5.bo * -411750205 >= 11776) {
                              break label454;
                           }
                        }

                        if (var3) {
                           var5.bi = true;
                           var5.be = -700518347 * var11;
                           var5.bk = -1699085727 * var12;
                        } else {
                           var5.bi = false;
                           var5.av(var11, var12, ds.ac[var1], (byte)8);
                        }
                        break label455;
                     }

                     var5.ar(var11, var12, -736842232);
                     var5.bi = false;
                  }

                  var5.ad = -1829675965 * (byte)(var8 + var5.ad * -1900490645 & 3);
                  if (-549033243 * client.mg == var1) {
                     if (var2 == 1995081372) {
                        return;
                     }

                     bm.mh = var5.ad * 1128021573;
                  }

               }
            }
         }
      } catch (RuntimeException var13) {
         throw db.an(var13, "mi.ac(" + ')');
      }
   }

   static mi[] an() {
      return new mi[]{af, an};
   }

   static mi[] aw() {
      return new mi[]{af, an};
   }

   static mi[] ac() {
      return new mi[]{af, an};
   }

   static mi[] au() {
      return new mi[]{af, an};
   }

   public static lg an(lv var0, tp var1, short var2) {
      try {
         lg var3 = hh.af((byte)0);
         var3.af = var0;
         var3.an = -474143459 * var0.dd;
         if (-1 == var3.an * -1245059367) {
            if (var2 >= 1132) {
               throw new IllegalStateException();
            }

            var3.aw = new sq(260);
         } else if (var3.an * -1245059367 == -2) {
            var3.aw = new sq(10000);
         } else if (var3.an * -1245059367 <= 18) {
            var3.aw = new sq(20);
         } else if (-1245059367 * var3.an <= 98) {
            if (var2 >= 1132) {
               throw new IllegalStateException();
            }

            var3.aw = new sq(100);
         } else {
            var3.aw = new sq(260);
         }

         var3.aw.an(var1, -1962868632);
         var3.aw.aw(1546470819 * var3.af.dq, (byte)-107);
         var3.ac = 0;
         return var3;
      } catch (RuntimeException var4) {
         throw db.an(var4, "mi.an(" + ')');
      }
   }

   static int az(byte var0) {
      try {
         return cz.ce * 1145608355;
      } catch (RuntimeException var1) {
         throw db.an(var1, "mi.az(" + ')');
      }
   }
}
