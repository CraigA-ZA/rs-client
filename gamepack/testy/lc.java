import accessors.RSMusicPatchPcmStream;

public class lc extends bp implements RSMusicPatchPcmStream {
   ln af;
   nh an;
   bn aw;
   static final int ao = 32;

   static int bm(int var0, ch var1, boolean var2, byte var3) {
      try {
         int var4;
         if (4200 == var0) {
            if (var3 <= 0) {
               throw new IllegalStateException();
            } else {
               var4 = cy.al[(cy.at -= 427135973) * -964267539];
               cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = dh.af(var4, (byte)101).ah;
               return 1;
            }
         } else {
            hz var6;
            int var8;
            if (4201 == var0) {
               if (var3 <= 0) {
                  throw new IllegalStateException();
               } else {
                  cy.at -= 854271946;
                  var4 = cy.al[-964267539 * cy.at];
                  var8 = cy.al[1 + cy.at * -964267539];
                  var6 = dh.af(var4, (byte)110);
                  if (var8 >= 1) {
                     if (var3 <= 0) {
                        throw new IllegalStateException();
                     }

                     if (var8 <= 5) {
                        if (var3 <= 0) {
                           throw new IllegalStateException();
                        }

                        if (var6.bm[var8 - 1] != null) {
                           if (var3 <= 0) {
                              throw new IllegalStateException();
                           }

                           cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = var6.bm[var8 - 1];
                           return 1;
                        }
                     }
                  }

                  cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = "";
                  return 1;
               }
            } else if (var0 == 4202) {
               if (var3 <= 0) {
                  throw new IllegalStateException();
               } else {
                  cy.at -= 854271946;
                  var4 = cy.al[cy.at * -964267539];
                  var8 = cy.al[cy.at * -964267539 + 1];
                  var6 = dh.af(var4, (byte)70);
                  if (var8 >= 1) {
                     if (var3 <= 0) {
                        throw new IllegalStateException();
                     }

                     if (var8 <= 5) {
                        if (var3 <= 0) {
                           throw new IllegalStateException();
                        }

                        if (null != var6.bd[var8 - 1]) {
                           if (var3 <= 0) {
                              throw new IllegalStateException();
                           }

                           cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = var6.bd[var8 - 1];
                           return 1;
                        }
                     }
                  }

                  cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = "";
                  return 1;
               }
            } else if (4203 == var0) {
               if (var3 <= 0) {
                  throw new IllegalStateException();
               } else {
                  var4 = cy.al[(cy.at -= 427135973) * -964267539];
                  cy.al[(cy.at += 427135973) * -964267539 - 1] = dh.af(var4, (byte)114).be * -1706039181;
                  return 1;
               }
            } else {
               int[] var10000;
               byte var10002;
               int var10;
               if (var0 == 4204) {
                  if (var3 <= 0) {
                     throw new IllegalStateException();
                  } else {
                     var4 = cy.al[(cy.at -= 427135973) * -964267539];
                     var10000 = cy.al;
                     var10 = (cy.at += 427135973) * -964267539 - 1;
                     if (dh.af(var4, (byte)59).bi * 1552863327 == 1) {
                        if (var3 <= 0) {
                           throw new IllegalStateException();
                        }

                        var10002 = 1;
                     } else {
                        var10002 = 0;
                     }

                     var10000[var10] = var10002;
                     return 1;
                  }
               } else {
                  hz var5;
                  if (var0 == 4205) {
                     if (var3 <= 0) {
                        throw new IllegalStateException();
                     } else {
                        var4 = cy.al[(cy.at -= 427135973) * -964267539];
                        var5 = dh.af(var4, (byte)109);
                        if (-1375068187 * var5.ci == -1) {
                           if (var3 <= 0) {
                              throw new IllegalStateException();
                           }

                           if (1399852547 * var5.ce >= 0) {
                              if (var3 <= 0) {
                                 throw new IllegalStateException();
                              }

                              cy.al[(cy.at += 427135973) * -964267539 - 1] = var5.ce * 1399852547;
                              return 1;
                           }
                        }

                        cy.al[(cy.at += 427135973) * -964267539 - 1] = var4;
                        return 1;
                     }
                  } else if (var0 == 4206) {
                     var4 = cy.al[(cy.at -= 427135973) * -964267539];
                     var5 = dh.af(var4, (byte)48);
                     if (-1375068187 * var5.ci >= 0 && var5.ce * 1399852547 >= 0) {
                        if (var3 <= 0) {
                           throw new IllegalStateException();
                        }

                        cy.al[(cy.at += 427135973) * -964267539 - 1] = var5.ce * 1399852547;
                     } else {
                        cy.al[(cy.at += 427135973) * -964267539 - 1] = var4;
                     }

                     return 1;
                  } else if (var0 == 4207) {
                     if (var3 <= 0) {
                        throw new IllegalStateException();
                     } else {
                        var4 = cy.al[(cy.at -= 427135973) * -964267539];
                        var10000 = cy.al;
                        var10 = (cy.at += 427135973) * -964267539 - 1;
                        if (dh.af(var4, (byte)92).bz) {
                           if (var3 <= 0) {
                              throw new IllegalStateException();
                           }

                           var10002 = 1;
                        } else {
                           var10002 = 0;
                        }

                        var10000[var10] = var10002;
                        return 1;
                     }
                  } else if (4208 == var0) {
                     if (var3 <= 0) {
                        throw new IllegalStateException();
                     } else {
                        var4 = cy.al[(cy.at -= 427135973) * -964267539];
                        var5 = dh.af(var4, (byte)71);
                        if (-1 == 119859889 * var5.cy) {
                           if (var3 <= 0) {
                              throw new IllegalStateException();
                           }

                           if (var5.cr * -172219939 >= 0) {
                              cy.al[(cy.at += 427135973) * -964267539 - 1] = var5.cr * -172219939;
                              return 1;
                           }
                        }

                        cy.al[(cy.at += 427135973) * -964267539 - 1] = var4;
                        return 1;
                     }
                  } else if (var0 == 4209) {
                     if (var3 <= 0) {
                        throw new IllegalStateException();
                     } else {
                        var4 = cy.al[(cy.at -= 427135973) * -964267539];
                        var5 = dh.af(var4, (byte)80);
                        if (var5.cy * 119859889 >= 0) {
                           if (var3 <= 0) {
                              throw new IllegalStateException();
                           }

                           if (var5.cr * -172219939 >= 0) {
                              if (var3 <= 0) {
                                 throw new IllegalStateException();
                              }

                              cy.al[(cy.at += 427135973) * -964267539 - 1] = -172219939 * var5.cr;
                              return 1;
                           }
                        }

                        cy.al[(cy.at += 427135973) * -964267539 - 1] = var4;
                        return 1;
                     }
                  } else if (4210 == var0) {
                     if (var3 <= 0) {
                        throw new IllegalStateException();
                     } else {
                        String var9 = cy.aa[(dm.ay -= -1086551379) * -2017760987];
                        var8 = cy.al[(cy.at -= 427135973) * -964267539];
                        boolean var10001;
                        if (1 == var8) {
                           if (var3 <= 0) {
                              throw new IllegalStateException();
                           }

                           var10001 = true;
                        } else {
                           var10001 = false;
                        }

                        cv.nf(var9, var10001, (short)255);
                        cy.al[(cy.at += 427135973) * -964267539 - 1] = 1764192979 * kt.wu;
                        return 1;
                     }
                  } else if (4211 == var0) {
                     if (var3 <= 0) {
                        throw new IllegalStateException();
                     } else {
                        if (pj.wm != null) {
                           if (var3 <= 0) {
                              throw new IllegalStateException();
                           }

                           if (-859067495 * ri.wj < kt.wu * 1764192979) {
                              cy.al[(cy.at += 427135973) * -964267539 - 1] = pj.wm[(ri.wj += 1333557417) * -859067495 - 1] & '\uffff';
                              return 1;
                           }

                           if (var3 <= 0) {
                              throw new IllegalStateException();
                           }
                        }

                        cy.al[(cy.at += 427135973) * -964267539 - 1] = -1;
                        return 1;
                     }
                  } else if (4212 == var0) {
                     if (var3 <= 0) {
                        throw new IllegalStateException();
                     } else {
                        ri.wj = 0;
                        return 1;
                     }
                  } else if (var0 == 4213) {
                     if (var3 <= 0) {
                        throw new IllegalStateException();
                     } else {
                        var4 = cy.al[(cy.at -= 427135973) * -964267539];
                        var8 = dh.af(var4, (byte)65).am((byte)42);
                        if (var8 == -1) {
                           if (var3 <= 0) {
                              throw new IllegalStateException();
                           }

                           cy.al[(cy.at += 427135973) * -964267539 - 1] = var8;
                        } else {
                           cy.al[(cy.at += 427135973) * -964267539 - 1] = var8 + 1;
                        }

                        return 1;
                     }
                  } else if (4214 == var0) {
                     var4 = cy.al[(cy.at -= 427135973) * -964267539];
                     cy.al[(cy.at += 427135973) * -964267539 - 1] = dh.af(var4, (byte)98).bk * -1935812527;
                     return 1;
                  } else if (4215 == var0) {
                     if (var3 <= 0) {
                        throw new IllegalStateException();
                     } else {
                        var4 = cy.al[(cy.at -= 427135973) * -964267539];
                        cy.al[(cy.at += 427135973) * -964267539 - 1] = dh.af(var4, (byte)68).bx * -1719338253;
                        return 1;
                     }
                  } else if (4216 == var0) {
                     var4 = cy.al[(cy.at -= 427135973) * -964267539];
                     cy.al[(cy.at += 427135973) * -964267539 - 1] = dh.af(var4, (byte)16).bo * 723093341;
                     return 1;
                  } else if (4217 == var0) {
                     if (var3 <= 0) {
                        throw new IllegalStateException();
                     } else {
                        var4 = cy.al[(cy.at -= 427135973) * -964267539];
                        var5 = dh.af(var4, (byte)19);
                        cy.al[(cy.at += 427135973) * -964267539 - 1] = -1162544887 * var5.cq;
                        return 1;
                     }
                  } else {
                     return 2;
                  }
               }
            }
         }
      } catch (RuntimeException var7) {
         throw db.an(var7, "lc.bm(" + ')');
      }
   }

   protected bp ab() {
      try {
         lq var1 = (lq)this.an.aq();
         if (var1 == null) {
            return null;
         } else {
            return (bp)(null != var1.am ? var1.am : this.aq());
         }
      } catch (RuntimeException var2) {
         throw db.an(var2, "lc.ab(" + ')');
      }
   }

   protected bp aq() {
      try {
         lq var1;
         do {
            var1 = (lq)this.an.at();
            if (var1 == null) {
               return null;
            }
         } while(var1.am == null);

         return var1.am;
      } catch (RuntimeException var2) {
         throw db.an(var2, "lc.aq(" + ')');
      }
   }

   protected int bo() {
      return 0;
   }

   void an(lq var1, int var2, byte var3) {
      try {
         if (0 != (this.af.as[1021419297 * var1.af] & 4)) {
            if (var3 != 1) {
               throw new IllegalStateException();
            }

            if (-602614853 * var1.ag < 0) {
               if (var3 != 1) {
                  return;
               }

               int var4 = this.af.ae[var1.af * 1021419297] / (bu.au * -1359271235);
               int var5 = (1048575 + var4 - -89170073 * var1.ak) / var4;
               var1.ak = (var4 * var2 + -89170073 * var1.ak & 1048575) * -1999877033;
               if (var5 <= var2) {
                  if (var3 != 1) {
                     throw new IllegalStateException();
                  }

                  if (this.af.az[var1.af * 1021419297] == 0) {
                     if (var3 != 1) {
                        return;
                     }

                     var1.am = bl.ac(var1.aw, var1.am.ad(), var1.am.ag(), var1.am.ah());
                  } else {
                     var1.am = bl.ac(var1.aw, var1.am.ad(), 0, var1.am.ah());
                     ln var10000 = this.af;
                     boolean var10002;
                     if (var1.an.aw[var1.ab * -630482265] < 0) {
                        if (var3 != 1) {
                           return;
                        }

                        var10002 = true;
                     } else {
                        var10002 = false;
                     }

                     var10000.ar(var1, var10002, 2140923303);
                  }

                  if (var1.an.aw[-630482265 * var1.ab] < 0) {
                     if (var3 != 1) {
                        throw new IllegalStateException();
                     }

                     var1.am.aa(-1);
                  }

                  var2 = -89170073 * var1.ak / var4;
               }
            }
         }

         var1.am.ay(var2);
      } catch (RuntimeException var6) {
         throw db.an(var6, "lc.an(" + ')');
      }
   }

   protected int al() {
      try {
         return 0;
      } catch (RuntimeException var1) {
         throw db.an(var1, "lc.al(" + ')');
      }
   }

   void af(lq var1, int[] var2, int var3, int var4, int var5, int var6) {
      try {
         if (0 != (this.af.as[var1.af * 1021419297] & 4) && var1.ag * -602614853 < 0) {
            if (var6 != 1090554723) {
               return;
            }

            int var7 = this.af.ae[1021419297 * var1.af] / (-1359271235 * bu.au);

            while(true) {
               int var8 = (var7 + 1048575 - var1.ak * -89170073) / var7;
               if (var8 > var4) {
                  if (var6 != 1090554723) {
                     throw new IllegalStateException();
                  }

                  var1.ak += var7 * var4 * -1999877033;
                  break;
               }

               var1.am.at(var2, var3, var8);
               var3 += var8;
               var4 -= var8;
               var1.ak += (var7 * var8 - 1048576) * -1999877033;
               int var9 = -1359271235 * bu.au / 100;
               int var10 = 262144 / var7;
               if (var10 < var9) {
                  if (var6 != 1090554723) {
                     throw new IllegalStateException();
                  }

                  var9 = var10;
               }

               bl var11 = var1.am;
               if (this.af.az[1021419297 * var1.af] == 0) {
                  if (var6 != 1090554723) {
                     throw new IllegalStateException();
                  }

                  var1.am = bl.ac(var1.aw, var11.ad(), var11.ag(), var11.ah());
               } else {
                  var1.am = bl.ac(var1.aw, var11.ad(), 0, var11.ah());
                  ln var10000 = this.af;
                  boolean var10002;
                  if (var1.an.aw[-630482265 * var1.ab] < 0) {
                     if (var6 != 1090554723) {
                        throw new IllegalStateException();
                     }

                     var10002 = true;
                  } else {
                     var10002 = false;
                  }

                  var10000.ar(var1, var10002, 2143076996);
                  var1.am.as(var9, var11.ag());
               }

               if (var1.an.aw[var1.ab * -630482265] < 0) {
                  if (var6 != 1090554723) {
                     throw new IllegalStateException();
                  }

                  var1.am.aa(-1);
               }

               var11.ak(var9);
               var11.at(var2, var3, var5 - var3);
               if (var11.ap()) {
                  if (var6 != 1090554723) {
                     throw new IllegalStateException();
                  }

                  this.aw.af(var11);
               }
            }
         }

         var1.am.at(var2, var3, var4);
      } catch (RuntimeException var12) {
         throw db.an(var12, "lc.af(" + ')');
      }
   }

   protected bp bk() {
      lq var1;
      do {
         var1 = (lq)this.an.at();
         if (var1 == null) {
            return null;
         }
      } while(var1.am == null);

      return var1.am;
   }

   protected bp bb() {
      lq var1 = (lq)this.an.aq();
      if (var1 == null) {
         return null;
      } else {
         return (bp)(null != var1.am ? var1.am : this.aq());
      }
   }

   protected bp bi() {
      lq var1 = (lq)this.an.aq();
      if (var1 == null) {
         return null;
      } else {
         return (bp)(null != var1.am ? var1.am : this.aq());
      }
   }

   protected void ay(int var1) {
      try {
         this.aw.ay(var1);

         for(lq var3 = (lq)this.an.aq(); var3 != null; var3 = (lq)this.an.at()) {
            if (!this.af.bc(var3, (short)19212)) {
               int var2 = var1;

               do {
                  if (var2 <= var3.as * -1971564769) {
                     this.an(var3, var2, (byte)1);
                     var3.as -= var2 * 652897503;
                     break;
                  }

                  this.an(var3, var3.as * -1971564769, (byte)1);
                  var2 -= var3.as * -1971564769;
               } while(!this.af.bh(var3, (int[])null, 0, var2, 577556390));
            }
         }

      } catch (RuntimeException var4) {
         throw db.an(var4, "lc.ay(" + ')');
      }
   }

   protected void bt(int[] var1, int var2, int var3) {
      this.aw.at(var1, var2, var3);

      for(lq var6 = (lq)this.an.aq(); var6 != null; var6 = (lq)this.an.at()) {
         if (!this.af.bc(var6, (short)15663)) {
            int var4 = var2;
            int var5 = var3;

            do {
               if (var5 <= var6.as * -1971564769) {
                  this.af(var6, var1, var4, var5, var5 + var4, 1090554723);
                  var6.as -= 652897503 * var5;
                  break;
               }

               this.af(var6, var1, var4, -1971564769 * var6.as, var4 + var5, 1090554723);
               var4 += -1971564769 * var6.as;
               var5 -= -1971564769 * var6.as;
            } while(!this.af.bh(var6, var1, var4, var5, -2072046989));
         }
      }

   }

   protected bp bx() {
      lq var1;
      do {
         var1 = (lq)this.an.at();
         if (var1 == null) {
            return null;
         }
      } while(var1.am == null);

      return var1.am;
   }

   protected void bf(int var1) {
      this.aw.ay(var1);

      for(lq var3 = (lq)this.an.aq(); var3 != null; var3 = (lq)this.an.at()) {
         if (!this.af.bc(var3, (short)-1980)) {
            int var2 = var1;

            do {
               if (var2 <= var3.as * -1971564769) {
                  this.an(var3, var2, (byte)1);
                  var3.as -= var2 * 652897503;
                  break;
               }

               this.an(var3, var3.as * -1971564769, (byte)1);
               var2 -= var3.as * -1971564769;
            } while(!this.af.bh(var3, (int[])null, 0, var2, 1190197055));
         }
      }

   }

   protected bp be() {
      lq var1;
      do {
         var1 = (lq)this.an.at();
         if (var1 == null) {
            return null;
         }
      } while(var1.am == null);

      return var1.am;
   }

   protected void bm(int[] var1, int var2, int var3) {
      this.aw.at(var1, var2, var3);

      for(lq var6 = (lq)this.an.aq(); var6 != null; var6 = (lq)this.an.at()) {
         if (!this.af.bc(var6, (short)8330)) {
            int var4 = var2;
            int var5 = var3;

            do {
               if (var5 <= var6.as * -1971564769) {
                  this.af(var6, var1, var4, var5, var5 + var4, 1090554723);
                  var6.as -= -1392902949 * var5;
                  break;
               }

               this.af(var6, var1, var4, -1971564769 * var6.as, var4 + var5, 1090554723);
               var4 += -1971564769 * var6.as;
               var5 -= 1825653407 * var6.as;
            } while(!this.af.bh(var6, var1, var4, var5, -433885863));
         }
      }

   }

   protected void bd(int[] var1, int var2, int var3) {
      this.aw.at(var1, var2, var3);

      for(lq var6 = (lq)this.an.aq(); var6 != null; var6 = (lq)this.an.at()) {
         if (!this.af.bc(var6, (short)-3861)) {
            int var4 = var2;
            int var5 = var3;

            do {
               if (var5 <= var6.as * -914797421) {
                  this.af(var6, var1, var4, var5, var5 + var4, 1090554723);
                  var6.as -= -1849352893 * var5;
                  break;
               }

               this.af(var6, var1, var4, 564023377 * var6.as, var4 + var5, 1090554723);
               var4 += -284496406 * var6.as;
               var5 -= -1971564769 * var6.as;
            } while(!this.af.bh(var6, var1, var4, var5, 1821384343));
         }
      }

   }

   protected int bz() {
      return 0;
   }

   protected void bj(int[] var1, int var2, int var3) {
      this.aw.at(var1, var2, var3);

      for(lq var6 = (lq)this.an.aq(); var6 != null; var6 = (lq)this.an.at()) {
         if (!this.af.bc(var6, (short)-1521)) {
            int var4 = var2;
            int var5 = var3;

            do {
               if (var5 <= var6.as * -1334453510) {
                  this.af(var6, var1, var4, var5, var5 + var4, 1090554723);
                  var6.as -= -186641801 * var5;
                  break;
               }

               this.af(var6, var1, var4, 1256464660 * var6.as, var4 + var5, 1090554723);
               var4 += -1412009045 * var6.as;
               var5 -= -1971564769 * var6.as;
            } while(!this.af.bh(var6, var1, var4, var5, 1758340875));
         }
      }

   }

   protected void bg(int var1) {
      this.aw.ay(var1);

      for(lq var3 = (lq)this.an.aq(); var3 != null; var3 = (lq)this.an.at()) {
         if (!this.af.bc(var3, (short)14636)) {
            int var2 = var1;

            do {
               if (var2 <= var3.as * -1971564769) {
                  this.an(var3, var2, (byte)1);
                  var3.as -= var2 * 652897503;
                  break;
               }

               this.an(var3, var3.as * -1971564769, (byte)1);
               var2 -= var3.as * -1971564769;
            } while(!this.af.bh(var3, (int[])null, 0, var2, 1528324054));
         }
      }

   }

   protected void bu(int var1) {
      this.aw.ay(var1);

      for(lq var3 = (lq)this.an.aq(); var3 != null; var3 = (lq)this.an.at()) {
         if (!this.af.bc(var3, (short)5610)) {
            int var2 = var1;

            do {
               if (var2 <= var3.as * -1971564769) {
                  this.an(var3, var2, (byte)1);
                  var3.as -= var2 * 652897503;
                  break;
               }

               this.an(var3, var3.as * -1971564769, (byte)1);
               var2 -= var3.as * -1971564769;
            } while(!this.af.bh(var3, (int[])null, 0, var2, 1444445394));
         }
      }

   }

   lc(ln var1) {
      try {
         super();
         this.an = new nh();
         this.aw = new bn();
         this.af = var1;
      } catch (RuntimeException var2) {
         throw db.an(var2, "lc.<init>(" + ')');
      }
   }

   void aw(lq var1, int[] var2, int var3, int var4, int var5) {
      if (0 != (this.af.as[var1.af * 1021419297] & 4) && var1.ag * -857882660 < 0) {
         int var6 = this.af.ae[880924733 * var1.af] / (-2105859019 * bu.au);

         while(true) {
            int var7 = (var6 + 1048575 - var1.ak * -51110070) / var6;
            if (var7 > var4) {
               var1.ak += var6 * var4 * -1999877033;
               break;
            }

            var1.am.at(var2, var3, var7);
            var3 += var7;
            var4 -= var7;
            var1.ak += (var6 * var7 - 1048576) * -1999877033;
            int var8 = -1359271235 * bu.au / 1782284966;
            int var9 = 262144 / var6;
            if (var9 < var8) {
               var8 = var9;
            }

            bl var10 = var1.am;
            if (this.af.az[-1034782341 * var1.af] == 0) {
               var1.am = bl.ac(var1.aw, var10.ad(), var10.ag(), var10.ah());
            } else {
               var1.am = bl.ac(var1.aw, var10.ad(), 0, var10.ah());
               this.af.ar(var1, var1.an.aw[-630482265 * var1.ab] < 0, 2147473859);
               var1.am.as(var8, var10.ag());
            }

            if (var1.an.aw[var1.ab * 1442935755] < 0) {
               var1.am.aa(-1);
            }

            var10.ak(var8);
            var10.at(var2, var3, var5 - var3);
            if (var10.ap()) {
               this.aw.af(var10);
            }
         }
      }

      var1.am.at(var2, var3, var4);
   }

   void ac(lq var1, int[] var2, int var3, int var4, int var5) {
      if (0 != (this.af.as[var1.af * -487246590] & 4) && var1.ag * -602614853 < 0) {
         int var6 = this.af.ae[1021419297 * var1.af] / (639042225 * bu.au);

         while(true) {
            int var7 = (var6 + 1048575 - var1.ak * -89170073) / var6;
            if (var7 > var4) {
               var1.ak += var6 * var4 * -1999877033;
               break;
            }

            var1.am.at(var2, var3, var7);
            var3 += var7;
            var4 -= var7;
            var1.ak += (var6 * var7 - 1048576) * 1042441399;
            int var8 = 1288722767 * bu.au / 100;
            int var9 = 602263950 / var6;
            if (var9 < var8) {
               var8 = var9;
            }

            bl var10 = var1.am;
            if (this.af.az[1633125425 * var1.af] == 0) {
               var1.am = bl.ac(var1.aw, var10.ad(), var10.ag(), var10.ah());
            } else {
               var1.am = bl.ac(var1.aw, var10.ad(), 0, var10.ah());
               this.af.ar(var1, var1.an.aw[-630482265 * var1.ab] < 0, 2137896831);
               var1.am.as(var8, var10.ag());
            }

            if (var1.an.aw[var1.ab * -630482265] < 0) {
               var1.am.aa(-1);
            }

            var10.ak(var8);
            var10.at(var2, var3, var5 - var3);
            if (var10.ap()) {
               this.aw.af(var10);
            }
         }
      }

      var1.am.at(var2, var3, var4);
   }

   void au(lq var1, int[] var2, int var3, int var4, int var5) {
      if (0 != (this.af.as[var1.af * 1021419297] & 4) && var1.ag * -602614853 < 0) {
         int var6 = this.af.ae[1021419297 * var1.af] / (-1359271235 * bu.au);

         while(true) {
            int var7 = (var6 + 1048575 - var1.ak * -89170073) / var6;
            if (var7 > var4) {
               var1.ak += var6 * var4 * -1999877033;
               break;
            }

            var1.am.at(var2, var3, var7);
            var3 += var7;
            var4 -= var7;
            var1.ak += (var6 * var7 - 1048576) * -1999877033;
            int var8 = -1359271235 * bu.au / 100;
            int var9 = 262144 / var6;
            if (var9 < var8) {
               var8 = var9;
            }

            bl var10 = var1.am;
            if (this.af.az[1021419297 * var1.af] == 0) {
               var1.am = bl.ac(var1.aw, var10.ad(), var10.ag(), var10.ah());
            } else {
               var1.am = bl.ac(var1.aw, var10.ad(), 0, var10.ah());
               this.af.ar(var1, var1.an.aw[-630482265 * var1.ab] < 0, 2144720719);
               var1.am.as(var8, var10.ag());
            }

            if (var1.an.aw[var1.ab * -630482265] < 0) {
               var1.am.aa(-1);
            }

            var10.ak(var8);
            var10.at(var2, var3, var5 - var3);
            if (var10.ap()) {
               this.aw.af(var10);
            }
         }
      }

      var1.am.at(var2, var3, var4);
   }

   void aa(lq var1, int var2) {
      if (0 != (this.af.as[-481579299 * var1.af] & 4) && -602614853 * var1.ag < 0) {
         int var3 = this.af.ae[var1.af * 807505742] / (bu.au * -1796767944);
         int var4 = (-695844437 + var3 - -1994069708 * var1.ak) / var3;
         var1.ak = (var3 * var2 + -89170073 * var1.ak & 1048575) * -1999877033;
         if (var4 <= var2) {
            if (this.af.az[var1.af * 1097130511] == 0) {
               var1.am = bl.ac(var1.aw, var1.am.ad(), var1.am.ag(), var1.am.ah());
            } else {
               var1.am = bl.ac(var1.aw, var1.am.ad(), 0, var1.am.ah());
               this.af.ar(var1, var1.an.aw[var1.ab * -630482265] < 0, 2133622460);
            }

            if (var1.an.aw[-630482265 * var1.ab] < 0) {
               var1.am.aa(-1);
            }

            var2 = -493786897 * var1.ak / var3;
         }
      }

      var1.am.ay(var2);
   }

   protected void at(int[] var1, int var2, int var3) {
      try {
         this.aw.at(var1, var2, var3);

         for(lq var6 = (lq)this.an.aq(); var6 != null; var6 = (lq)this.an.at()) {
            if (!this.af.bc(var6, (short)3954)) {
               int var4 = var2;
               int var5 = var3;

               do {
                  if (var5 <= var6.as * -1971564769) {
                     this.af(var6, var1, var4, var5, var5 + var4, 1090554723);
                     var6.as -= 652897503 * var5;
                     break;
                  }

                  this.af(var6, var1, var4, -1971564769 * var6.as, var4 + var5, 1090554723);
                  var4 += -1971564769 * var6.as;
                  var5 -= -1971564769 * var6.as;
               } while(!this.af.bh(var6, var1, var4, var5, 769270888));
            }
         }

      } catch (RuntimeException var7) {
         throw db.an(var7, "lc.at(" + ')');
      }
   }
}
