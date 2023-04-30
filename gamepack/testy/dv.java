import accessors.RSPlayer;

public final class dv extends de implements RSPlayer {
   px ap;
   int at;
   int ai;
   int ar;
   static final int ab = 3;
   tm af;
   int ac;
   int am;
   int aa;
   int ay;
   int ao;
   int ax;
   boolean aj;
   mw aw;
   it ah;
   int ag;
   int av;
   int as;
   int al;
   String[] aq;
   int ak;
   boolean az;
   int ad;
   int ae;
   int au;
   px by;
   px bb;
   boolean bi;
   int be;
   int bk;

   final void cr(int var1, int var2, iu var3) {
      if (this.dn * 1134756167 < 9) {
         this.dn += 400971895;
      }

      for(int var4 = 1134756167 * this.dn; var4 > 0; --var4) {
         this.dy[var4] = this.dy[var4 - 1];
         this.ds[var4] = this.ds[var4 - 1];
         this.da[var4] = this.da[var4 - 1];
      }

      this.dy[0] = var1;
      this.ds[0] = var2;
      this.da[0] = var3;
   }

   final void af(sg var1, int var2) {
      try {
         var1.at = 0;
         int var3 = var1.cm((byte)7);
         boolean var4 = true;
         this.ac = var1.cf(435772489) * 1162421511;
         this.au = var1.cf(435772489) * -914676177;
         int var5 = -1;
         this.ak = 0;
         int[] var6 = new int[12];

         int var8;
         int var9;
         int var10;
         for(int var7 = 0; var7 < 12; ++var7) {
            if (var2 == 316483960) {
               throw new IllegalStateException();
            }

            var8 = var1.cm((byte)7);
            if (var8 == 0) {
               if (var2 == 316483960) {
                  throw new IllegalStateException();
               }

               var6[var7] = 0;
            } else {
               var9 = var1.cm((byte)7);
               var6[var7] = var9 + (var8 << 8);
               if (0 == var7) {
                  if (var2 == 316483960) {
                     return;
                  }

                  if (65535 == var6[0]) {
                     var5 = var1.cl(715081390);
                     break;
                  }
               }

               if (var6[var7] >= 512) {
                  if (var2 == 316483960) {
                     return;
                  }

                  var10 = dh.af(var6[var7] - 512, (byte)116).ck * -919846075;
                  if (0 != var10) {
                     if (var2 == 316483960) {
                        throw new IllegalStateException();
                     }

                     this.ak = -248928759 * var10;
                  }
               }
            }
         }

         int[] var16 = null;
         if (-1931866699 * client.cx >= 213) {
            if (var2 == 316483960) {
               throw new IllegalStateException();
            }

            var16 = new int[12];

            for(var8 = 0; var8 < 12; ++var8) {
               var9 = var1.cm((byte)7);
               if (var9 == 0) {
                  var16[var8] = 0;
               } else {
                  var10 = var1.cm((byte)7);
                  var16[var8] = (var9 << 8) + var10;
               }
            }
         }

         int[] var17 = new int[5];

         for(var9 = 0; var9 < 5; ++var9) {
            if (var2 == 316483960) {
               return;
            }

            label239: {
               var10 = var1.cm((byte)7);
               if (var10 >= 0) {
                  if (var10 < mw.ao[var9].length) {
                     break label239;
                  }

                  if (var2 == 316483960) {
                     throw new IllegalStateException();
                  }
               }

               var10 = 0;
            }

            var17[var9] = var10;
         }

         this.bt = var1.cl(403920818) * 1196796229;
         if (65535 == this.bt * 1590591885) {
            if (var2 == 316483960) {
               throw new IllegalStateException();
            }

            this.bt = -1196796229;
         }

         this.bj = var1.cl(-111684246) * -767436785;
         if (65535 == this.bj * 1319769839) {
            if (var2 == 316483960) {
               throw new IllegalStateException();
            }

            this.bj = 767436785;
         }

         this.bn = this.bj * 980575951;
         this.bs = var1.cl(-900366720) * 1672510249;
         if (this.bs * 736907545 == 65535) {
            if (var2 == 316483960) {
               throw new IllegalStateException();
            }

            this.bs = -1672510249;
         }

         this.br = var1.cl(-1978017770) * -1683505383;
         if (65535 == 1648569641 * this.br) {
            if (var2 == 316483960) {
               throw new IllegalStateException();
            }

            this.br = 1683505383;
         }

         this.bg = var1.cl(216748442) * 497469823;
         if (-127994241 * this.bg == 65535) {
            if (var2 == 316483960) {
               throw new IllegalStateException();
            }

            this.bg = -497469823;
         }

         this.bu = var1.cl(-456544714) * 1927855919;
         if (65535 == this.bu * -1059657777) {
            if (var2 == 316483960) {
               return;
            }

            this.bu = -1927855919;
         }

         this.bf = var1.cl(-850104511) * 140602839;
         if (1939789287 * this.bf == 65535) {
            if (var2 == 316483960) {
               throw new IllegalStateException();
            }

            this.bf = -140602839;
         }

         this.af = new tm(var1.cw((byte)0), co.cn);
         this.ac((byte)2);
         this.ay(2109204603);
         this.ai(453146982);
         if (lq.mi == this) {
            if (var2 == 316483960) {
               return;
            }

            tr.an = this.af.af(-710264960);
         }

         this.al = var1.cm((byte)7) * 225691243;
         this.at = var1.cl(-303616420) * 1353643761;
         boolean var10001;
         if (var1.cm((byte)7) == 1) {
            if (var2 == 316483960) {
               throw new IllegalStateException();
            }

            var10001 = true;
         } else {
            var10001 = false;
         }

         this.az = var10001;
         if (client.cs * -1274626977 == 0 && client.pu * 324465533 >= 2) {
            if (var2 == 316483960) {
               throw new IllegalStateException();
            }

            this.az = false;
         }

         gx[] var18 = null;
         boolean var19 = false;
         int var11 = var1.cl(-1952907902);
         var19 = (var11 >> 15 & 1) == 1;
         int var12;
         if (var11 > 0) {
            if (var2 == 316483960) {
               throw new IllegalStateException();
            }

            if (32768 != var11) {
               if (var2 == 316483960) {
                  throw new IllegalStateException();
               }

               var18 = new gx[12];

               for(var12 = 0; var12 < 12; ++var12) {
                  if (var2 == 316483960) {
                     return;
                  }

                  int var13 = var11 >> 12 - var12 & 1;
                  if (1 == var13) {
                     var18[var12] = cw.af(var6[var12] - 512, var1, -1162920359);
                  }
               }
            }
         }

         for(var12 = 0; var12 < 3; ++var12) {
            this.aq[var12] = var1.cw((byte)0);
         }

         int var15 = var1.cm((byte)7);
         if (this.aw == null) {
            if (var2 == 316483960) {
               throw new IllegalStateException();
            }

            this.aw = new mw();
         }

         this.aw.af(var16, var6, var18, var19, var17, var3, var5, var15, (byte)21);
      } catch (RuntimeException var14) {
         throw db.an(var14, "dv.af(" + ')');
      }
   }

   boolean aw(int var1) {
      try {
         if (this.ap == px.af) {
            if (var1 >= -934859703) {
               throw new IllegalStateException();
            }

            this.at((byte)94);
         }

         boolean var10000;
         if (this.ap == px.an) {
            if (var1 >= -934859703) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw db.an(var2, "dv.aw(" + ')');
      }
   }

   void ba() {
      for(int var1 = 0; var1 < 4; ++var1) {
         if (client.sg[var1] != null && client.sg[var1].aw(this.af.af(-710264960), (byte)112) != -1 && 2 != var1) {
            this.bb = px.an;
            return;
         }
      }

      this.bb = px.aw;
   }

   void cg(int var1, int var2) {
      this.dn = 0;
      this.eo = 0;
      this.ep = 0;
      this.dy[0] = var1;
      this.ds[0] = var2;
      int var3 = this.ah((byte)-85);
      this.bx = -1102445696 * this.dy[0] + -551222848 * var3;
      this.bo = var3 * -943719744 + -1887439488 * this.ds[0];
   }

   void bb() {
      this.ap = px.af;
   }

   void ay(int var1) {
      try {
         this.by = px.af;
      } catch (RuntimeException var2) {
         throw db.an(var2, "dv.ay(" + ')');
      }
   }

   void ao(byte var1) {
      try {
         px var10001;
         label24: {
            if (es.sb != null) {
               if (var1 <= 32) {
                  throw new IllegalStateException();
               }

               if (es.sb.bt(this.af, -1263792908)) {
                  if (var1 <= 32) {
                     throw new IllegalStateException();
                  }

                  var10001 = px.an;
                  break label24;
               }
            }

            var10001 = px.aw;
         }

         this.by = var10001;
      } catch (RuntimeException var2) {
         throw db.an(var2, "dv.ao(" + ')');
      }
   }

   void ax(byte var1) {
      try {
         for(int var2 = 0; var2 < 4; ++var2) {
            if (client.sg[var2] != null) {
               if (var1 >= 8) {
                  throw new IllegalStateException();
               }

               if (client.sg[var2].aw(this.af.af(-710264960), (byte)55) != -1) {
                  if (var1 >= 8) {
                     throw new IllegalStateException();
                  }

                  if (2 != var2) {
                     if (var1 >= 8) {
                        throw new IllegalStateException();
                     }

                     this.bb = px.an;
                     return;
                  }
               }
            }
         }

         this.bb = px.aw;
      } catch (RuntimeException var3) {
         throw db.an(var3, "dv.ax(" + ')');
      }
   }

   void ai(int var1) {
      try {
         this.bb = px.af;
      } catch (RuntimeException var2) {
         throw db.an(var2, "dv.ai(" + ')');
      }
   }

   boolean ag(byte var1) {
      try {
         if (this.bb == px.af) {
            if (var1 != 0) {
               throw new IllegalStateException();
            }

            this.ax((byte)-64);
         }

         boolean var10000;
         if (this.bb == px.an) {
            if (var1 != 0) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw db.an(var2, "dv.ag(" + ')');
      }
   }

   void ac(byte var1) {
      try {
         this.ap = px.af;
      } catch (RuntimeException var2) {
         throw db.an(var2, "dv.ac(" + ')');
      }
   }

   protected final it an(byte var1) {
      try {
         if (this.aw == null) {
            return null;
         } else {
            ha var10000;
            label184: {
               if (this.ct * -1372355773 != -1) {
                  if (var1 >= 14) {
                     throw new IllegalStateException();
                  }

                  if (0 == this.dm * 1253892101) {
                     if (var1 >= 14) {
                        throw new IllegalStateException();
                     }

                     var10000 = dc.an(this.ct * -1372355773, (byte)73);
                     break label184;
                  }
               }

               var10000 = null;
            }

            ha var2;
            label197: {
               var2 = var10000;
               if (-1 != this.cz * -1302441815) {
                  if (var1 >= 14) {
                     throw new IllegalStateException();
                  }

                  if (!this.aj) {
                     label195: {
                        if (var1 >= 14) {
                           throw new IllegalStateException();
                        }

                        if (this.cz * -1302441815 == this.bt * 1590591885) {
                           if (var1 >= 14) {
                              throw new IllegalStateException();
                           }

                           if (var2 != null) {
                              break label195;
                           }

                           if (var1 >= 14) {
                              throw new IllegalStateException();
                           }
                        }

                        var10000 = dc.an(this.cz * -1302441815, (byte)57);
                        break label197;
                     }
                  }
               }

               var10000 = null;
            }

            ha var3 = var10000;
            it var4 = this.aw.aa(var2, -41215169 * this.cp, var3, 424813829 * this.cw, (byte)31);
            if (var4 == null) {
               if (var1 >= 14) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               var4.ai();
               this.de = 2070391287 * var4.et;
               int var5 = var4.ao;
               if (!this.aj) {
                  if (var1 >= 14) {
                     throw new IllegalStateException();
                  }

                  var4 = this.cp(var4, (byte)106);
               }

               if (!this.aj) {
                  if (var1 >= 14) {
                     throw new IllegalStateException();
                  }

                  if (this.ah != null) {
                     if (var1 >= 14) {
                        throw new IllegalStateException();
                     }

                     if (client.ep * -1886224337 >= this.ao * -935505685) {
                        this.ah = null;
                     }

                     if (-1886224337 * client.ep >= -1402262375 * this.ay) {
                        if (var1 >= 14) {
                           throw new IllegalStateException();
                        }

                        if (-1886224337 * client.ep < -935505685 * this.ao) {
                           if (var1 >= 14) {
                              throw new IllegalStateException();
                           }

                           it var6 = this.ah;
                           var6.be(this.ax * 1793688517 - 1144428983 * this.bx, this.ai * 1238902143 - 561204023 * this.aa, 240546619 * this.ag - -411750205 * this.bo);
                           if (this.dd * -1751341433 == 512) {
                              if (var1 >= 14) {
                                 throw new IllegalStateException();
                              }

                              var6.ap();
                              var6.ap();
                              var6.ap();
                           } else if (1024 == -1751341433 * this.dd) {
                              if (var1 >= 14) {
                                 throw new IllegalStateException();
                              }

                              var6.ap();
                              var6.ap();
                           } else if (1536 == -1751341433 * this.dd) {
                              if (var1 >= 14) {
                                 throw new IllegalStateException();
                              }

                              var6.ap();
                           }

                           it[] var7 = new it[]{var4, var6};
                           var4 = new it(var7, 2);
                           if (this.dd * -1751341433 == 512) {
                              if (var1 >= 14) {
                                 throw new IllegalStateException();
                              }

                              var6.ap();
                           } else if (1024 == this.dd * -1751341433) {
                              if (var1 >= 14) {
                                 throw new IllegalStateException();
                              }

                              var6.ap();
                              var6.ap();
                           } else if (-1751341433 * this.dd == 1536) {
                              if (var1 >= 14) {
                                 throw new IllegalStateException();
                              }

                              var6.ap();
                              var6.ap();
                              var6.ap();
                           }

                           var6.be(this.bx * 1144428983 - 1793688517 * this.ax, 561204023 * this.aa - this.ai * 1238902143, -411750205 * this.bo - this.ag * 240546619);
                        }
                     }
                  }
               }

               var4.bx = true;
               if (this.dq != 0 && client.ep * -1886224337 >= this.dh * 1182789041) {
                  if (var1 >= 14) {
                     throw new IllegalStateException();
                  }

                  if (client.ep * -1886224337 < 707232483 * this.dp) {
                     if (var1 >= 14) {
                        throw new IllegalStateException();
                     }

                     var4.cj = this.du;
                     var4.ch = this.db;
                     var4.ct = this.df;
                     var4.cp = this.dq;
                     var4.cd = (short)var5;
                     return var4;
                  }
               }

               var4.cp = 0;
               return var4;
            }
         }
      } catch (RuntimeException var8) {
         throw db.an(var8, "dv.an(" + ')');
      }
   }

   void bx() {
      this.ap = cl.vt.am(this.af, -2046225107) ? px.an : px.aw;
   }

   void ar(int var1, int var2, int var3) {
      try {
         this.dn = 0;
         this.eo = 0;
         this.ep = 0;
         this.dy[0] = var1;
         this.ds[0] = var2;
         int var4 = this.ah((byte)-38);
         this.bx = -1102445696 * this.dy[0] + -551222848 * var4;
         this.bo = var4 * -943719744 + -1887439488 * this.ds[0];
      } catch (RuntimeException var5) {
         throw db.an(var5, "dv.ar(" + ')');
      }
   }

   final void am(int var1, int var2, iu var3, int var4) {
      try {
         if (this.dn * 1134756167 < 9) {
            if (var4 != 475560620) {
               return;
            }

            this.dn += 400971895;
         }

         for(int var5 = 1134756167 * this.dn; var5 > 0; --var5) {
            if (var4 != 475560620) {
               throw new IllegalStateException();
            }

            this.dy[var5] = this.dy[var5 - 1];
            this.ds[var5] = this.ds[var5 - 1];
            this.da[var5] = this.da[var5 - 1];
         }

         this.dy[0] = var1;
         this.ds[0] = var2;
         this.da[0] = var3;
      } catch (RuntimeException var6) {
         throw db.an(var6, "dv.am(" + ')');
      }
   }

   final boolean as(int var1) {
      try {
         if (this.aw == null) {
            if (var1 != 1666539507) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            return true;
         }
      } catch (RuntimeException var2) {
         throw db.an(var2, "dv.as(" + ')');
      }
   }

   void bn() {
      this.by = px.af;
   }

   protected final it ab() {
      if (this.aw == null) {
         return null;
      } else {
         ha var1 = this.ct * -932948515 != -1 && 0 == this.dm * 1253892101 ? dc.an(this.ct * -1372355773, (byte)114) : null;
         ha var2 = -1 != this.cz * -1302441815 && !this.aj && (this.cz * -1302441815 != this.bt * 796201815 || var1 == null) ? dc.an(this.cz * -638499823, (byte)16) : null;
         it var3 = this.aw.aa(var1, -41215169 * this.cp, var2, 401006219 * this.cw, (byte)37);
         if (var3 == null) {
            return null;
         } else {
            var3.ai();
            this.de = -782197158 * var3.et;
            int var4 = var3.ao;
            if (!this.aj) {
               var3 = this.cp(var3, (byte)116);
            }

            if (!this.aj && this.ah != null) {
               if (client.ep * 1979434 >= this.ao * -935505685) {
                  this.ah = null;
               }

               if (-1886224337 * client.ep >= -1402262375 * this.ay && 1743377105 * client.ep < -1675531961 * this.ao) {
                  it var5 = this.ah;
                  var5.be(this.ax * 1793688517 - -923556392 * this.bx, this.ai * 1238902143 - -29095639 * this.aa, 240546619 * this.ag - 1290387295 * this.bo);
                  if (this.dd * -353800634 == 1370518934) {
                     var5.ap();
                     var5.ap();
                     var5.ap();
                  } else if (-1919311210 == -1751341433 * this.dd) {
                     var5.ap();
                     var5.ap();
                  } else if (415025260 == -1134332089 * this.dd) {
                     var5.ap();
                  }

                  it[] var6 = new it[]{var3, var5};
                  var3 = new it(var6, 2);
                  if (this.dd * -1751341433 == -1944817061) {
                     var5.ap();
                  } else if (-1018834405 == this.dd * -1751341433) {
                     var5.ap();
                     var5.ap();
                  } else if (-556770947 * this.dd == 1536) {
                     var5.ap();
                     var5.ap();
                     var5.ap();
                  }

                  var5.be(this.bx * 1144428983 - -1897519143 * this.ax, 1285682795 * this.aa - this.ai * -154406366, 1786536813 * this.bo - this.ag * 240546619);
               }
            }

            var3.bx = true;
            if (this.dq != 0 && client.ep * 1719791262 >= this.dh * -1212607814 && client.ep * -1886224337 < 707232483 * this.dp) {
               var3.cj = this.du;
               var3.ch = this.db;
               var3.ct = this.df;
               var3.cp = this.dq;
               var3.cd = (short)var4;
            } else {
               var3.cp = 0;
            }

            return var3;
         }
      }
   }

   protected final it aq() {
      if (this.aw == null) {
         return null;
      } else {
         ha var1 = this.ct * -1372355773 != -1 && 0 == this.dm * 1253892101 ? dc.an(this.ct * -1372355773, (byte)117) : null;
         ha var2 = -1 != this.cz * -1302441815 && !this.aj && (this.cz * -1302441815 != this.bt * 1590591885 || var1 == null) ? dc.an(this.cz * -1302441815, (byte)90) : null;
         it var3 = this.aw.aa(var1, -41215169 * this.cp, var2, 424813829 * this.cw, (byte)9);
         if (var3 == null) {
            return null;
         } else {
            var3.ai();
            this.de = 2070391287 * var3.et;
            int var4 = var3.ao;
            if (!this.aj) {
               var3 = this.cp(var3, (byte)124);
            }

            if (!this.aj && this.ah != null) {
               if (client.ep * -1886224337 >= this.ao * -935505685) {
                  this.ah = null;
               }

               if (-1886224337 * client.ep >= -1402262375 * this.ay && -1886224337 * client.ep < -935505685 * this.ao) {
                  it var5 = this.ah;
                  var5.be(this.ax * 1793688517 - 1144428983 * this.bx, this.ai * 1238902143 - 561204023 * this.aa, 240546619 * this.ag - -411750205 * this.bo);
                  if (this.dd * -1751341433 == 512) {
                     var5.ap();
                     var5.ap();
                     var5.ap();
                  } else if (1024 == -1751341433 * this.dd) {
                     var5.ap();
                     var5.ap();
                  } else if (1536 == -1751341433 * this.dd) {
                     var5.ap();
                  }

                  it[] var6 = new it[]{var3, var5};
                  var3 = new it(var6, 2);
                  if (this.dd * -1751341433 == 512) {
                     var5.ap();
                  } else if (1024 == this.dd * -1751341433) {
                     var5.ap();
                     var5.ap();
                  } else if (-1751341433 * this.dd == 1536) {
                     var5.ap();
                     var5.ap();
                     var5.ap();
                  }

                  var5.be(this.bx * 1144428983 - 1793688517 * this.ax, 561204023 * this.aa - this.ai * 1238902143, -411750205 * this.bo - this.ag * 240546619);
               }
            }

            var3.bx = true;
            if (this.dq != 0 && client.ep * -1886224337 >= this.dh * 1182789041 && client.ep * -1886224337 < 707232483 * this.dp) {
               var3.cj = this.du;
               var3.ch = this.db;
               var3.ct = this.df;
               var3.cp = this.dq;
               var3.cd = (short)var4;
            } else {
               var3.cp = 0;
            }

            return var3;
         }
      }
   }

   dv() {
      try {
         super();
         this.ac = -1162421511;
         this.au = 914676177;
         this.aq = new String[3];

         for(int var1 = 0; var1 < 3; ++var1) {
            this.aq[var1] = "";
         }

         this.al = 0;
         this.at = 0;
         this.ay = 0;
         this.ao = 0;
         this.aj = false;
         this.ak = 0;
         this.az = false;
         this.ap = px.af;
         this.by = px.af;
         this.bb = px.af;
         this.bi = false;
      } catch (RuntimeException var2) {
         throw db.an(var2, "dv.<init>(" + ')');
      }
   }

   final void aj(sg var1) {
      var1.at = 0;
      int var2 = var1.cm((byte)7);
      boolean var3 = true;
      this.ac = var1.cf(435772489) * 1162421511;
      this.au = var1.cf(435772489) * -914676177;
      int var4 = -1;
      this.ak = 0;
      int[] var5 = new int[12];

      int var7;
      int var8;
      int var9;
      for(int var6 = 0; var6 < 12; ++var6) {
         var7 = var1.cm((byte)7);
         if (var7 == 0) {
            var5[var6] = 0;
         } else {
            var8 = var1.cm((byte)7);
            var5[var6] = var8 + (var7 << 8);
            if (0 == var6 && -1562577922 == var5[0]) {
               var4 = var1.cl(421047883);
               break;
            }

            if (var5[var6] >= -587271768) {
               var9 = dh.af(var5[var6] - -515159163, (byte)119).ck * -919846075;
               if (0 != var9) {
                  this.ak = -248928759 * var9;
               }
            }
         }
      }

      int[] var14 = null;
      if (-1850708740 * client.cx >= 213) {
         var14 = new int[12];

         for(var7 = 0; var7 < 12; ++var7) {
            var8 = var1.cm((byte)7);
            if (var8 == 0) {
               var14[var7] = 0;
            } else {
               var9 = var1.cm((byte)7);
               var14[var7] = (var8 << 8) + var9;
            }
         }
      }

      int[] var15 = new int[5];

      for(var8 = 0; var8 < 5; ++var8) {
         var9 = var1.cm((byte)7);
         if (var9 < 0 || var9 >= mw.ao[var8].length) {
            var9 = 0;
         }

         var15[var8] = var9;
      }

      this.bt = var1.cl(211804824) * -2104770339;
      if (65535 == this.bt * 540629456) {
         this.bt = 1854796544;
      }

      this.bj = var1.cl(-774450636) * -767436785;
      if (65535 == this.bj * 1319769839) {
         this.bj = 767436785;
      }

      this.bn = this.bj * 119568838;
      this.bs = var1.cl(-326442015) * 1044048311;
      if (this.bs * 1574056336 == -767100629) {
         this.bs = -1672510249;
      }

      this.br = var1.cl(-2009546153) * 510067687;
      if (65535 == 1852866297 * this.br) {
         this.br = 1683505383;
      }

      this.bg = var1.cl(-2047181364) * 497469823;
      if (-913480968 * this.bg == 65535) {
         this.bg = 1181460204;
      }

      this.bu = var1.cl(-2106043552) * 1927855919;
      if (-873619200 == this.bu * -1059657777) {
         this.bu = 1502742191;
      }

      this.bf = var1.cl(-1048728214) * 795502895;
      if (-939233395 * this.bf == 1979145742) {
         this.bf = -140602839;
      }

      this.af = new tm(var1.cw((byte)0), co.cn);
      this.ac((byte)2);
      this.ay(1473801296);
      this.ai(453146982);
      if (lq.mi == this) {
         tr.an = this.af.af(-710264960);
      }

      this.al = var1.cm((byte)7) * 225691243;
      this.at = var1.cl(-720177024) * 805431832;
      this.az = var1.cm((byte)7) == 1;
      if (client.cs * -1029070184 == 0 && client.pu * 324465533 >= 2) {
         this.az = false;
      }

      gx[] var16 = null;
      boolean var17 = false;
      int var10 = var1.cl(-918019724);
      var17 = (var10 >> 15 & 1) == 1;
      int var11;
      if (var10 > 0 && 32768 != var10) {
         var16 = new gx[12];

         for(var11 = 0; var11 < 12; ++var11) {
            int var12 = var10 >> 12 - var11 & 1;
            if (1 == var12) {
               var16[var11] = cw.af(var5[var11] - 1507135733, var1, 1129075533);
            }
         }
      }

      for(var11 = 0; var11 < 3; ++var11) {
         this.aq[var11] = var1.cw((byte)0);
      }

      int var13 = var1.cm((byte)7);
      if (this.aw == null) {
         this.aw = new mw();
      }

      this.aw.af(var14, var5, var16, var17, var15, var2, var4, var13, (byte)21);
   }

   final void av(int var1, int var2, iu var3, byte var4) {
      try {
         if (this.ct * -1372355773 != -1) {
            if (var4 >= 10) {
               return;
            }

            if (dc.an(-1372355773 * this.ct, (byte)61).bi * 1957040329 == 1) {
               if (var4 >= 10) {
                  throw new IllegalStateException();
               }

               this.ct = 1690721941;
            }
         }

         this.cd(-2110924342);
         if (var1 >= 0) {
            if (var4 >= 10) {
               throw new IllegalStateException();
            }

            if (var1 < 104 && var2 >= 0) {
               if (var4 >= 10) {
                  return;
               }

               if (var2 < 104) {
                  if (this.dy[0] >= 0) {
                     if (var4 >= 10) {
                        return;
                     }

                     if (this.dy[0] < 104) {
                        if (var4 >= 10) {
                           throw new IllegalStateException();
                        }

                        if (this.ds[0] >= 0) {
                           if (var4 >= 10) {
                              return;
                           }

                           if (this.ds[0] < 104) {
                              if (iu.ac == var3) {
                                 if (var4 >= 10) {
                                    throw new IllegalStateException();
                                 }

                                 cc.kq(this, var1, var2, iu.ac, -1796483670);
                              }

                              this.am(var1, var2, var3, 475560620);
                              return;
                           }

                           if (var4 >= 10) {
                              throw new IllegalStateException();
                           }
                        }
                     }
                  }

                  this.ar(var1, var2, -160290835);
                  return;
               }

               if (var4 >= 10) {
                  throw new IllegalStateException();
               }
            }
         }

         this.ar(var1, var2, -511348482);
      } catch (RuntimeException var5) {
         throw db.an(var5, "dv.av(" + ')');
      }
   }

   boolean bt() {
      if (px.af == this.by) {
         this.ao((byte)124);
      }

      return this.by == px.an;
   }

   boolean ad() {
      if (this.ap == px.af) {
         this.at((byte)77);
      }

      return this.ap == px.an;
   }

   protected final it al() {
      if (this.aw == null) {
         return null;
      } else {
         ha var1 = this.ct * -1372355773 != -1 && 0 == this.dm * 1253892101 ? dc.an(this.ct * -1372355773, (byte)6) : null;
         ha var2 = -1 == this.cz * -1302441815 || this.aj || this.cz * -1302441815 == this.bt * 1590591885 && var1 != null ? null : dc.an(this.cz * -1302441815, (byte)43);
         it var3 = this.aw.aa(var1, -41215169 * this.cp, var2, 728999224 * this.cw, (byte)13);
         if (var3 == null) {
            return null;
         } else {
            var3.ai();
            this.de = 193820574 * var3.et;
            int var4 = var3.ao;
            if (!this.aj) {
               var3 = this.cp(var3, (byte)126);
            }

            if (!this.aj && this.ah != null) {
               if (client.ep * 247431094 >= this.ao * 794366454) {
                  this.ah = null;
               }

               if (-1886224337 * client.ep >= 874303174 * this.ay && 1975247366 * client.ep < -917046344 * this.ao) {
                  it var5 = this.ah;
                  var5.be(this.ax * 1793688517 - 1144428983 * this.bx, this.ai * 1238902143 - -1802890636 * this.aa, 240546619 * this.ag - -411750205 * this.bo);
                  if (this.dd * -1751341433 == 512) {
                     var5.ap();
                     var5.ap();
                     var5.ap();
                  } else if (-1767137765 == -1751341433 * this.dd) {
                     var5.ap();
                     var5.ap();
                  } else if (1536 == -480095205 * this.dd) {
                     var5.ap();
                  }

                  it[] var6 = new it[]{var3, var5};
                  var3 = new it(var6, 2);
                  if (this.dd * -1751341433 == 2082605643) {
                     var5.ap();
                  } else if (1024 == this.dd * -900528962) {
                     var5.ap();
                     var5.ap();
                  } else if (-1535659614 * this.dd == 1536) {
                     var5.ap();
                     var5.ap();
                     var5.ap();
                  }

                  var5.be(this.bx * -468773866 - 973718370 * this.ax, 561204023 * this.aa - this.ai * 1238902143, -345359696 * this.bo - this.ag * 1536960610);
               }
            }

            var3.bx = true;
            if (this.dq != 0 && client.ep * -1963576077 >= this.dh * 974107602 && client.ep * -555974452 < -1003437728 * this.dp) {
               var3.cj = this.du;
               var3.ch = this.db;
               var3.ct = this.df;
               var3.cp = this.dq;
               var3.cd = (short)var4;
            } else {
               var3.cp = 0;
            }

            return var3;
         }
      }
   }

   boolean ap() {
      if (this.ap == px.af) {
         this.at((byte)94);
      }

      return this.ap == px.an;
   }

   boolean by() {
      if (this.ap == px.af) {
         this.at((byte)48);
      }

      return this.ap == px.an;
   }

   boolean ae() {
      if (this.ap == px.af) {
         this.at((byte)28);
      }

      return this.ap == px.an;
   }

   final boolean cv() {
      return this.aw != null;
   }

   void be() {
      this.ap = cl.vt.am(this.af, -1902824386) ? px.an : px.aw;
   }

   void bk() {
      this.ap = cl.vt.am(this.af, -1881605934) ? px.an : px.aw;
   }

   int ah(byte var1) {
      try {
         if (this.aw != null) {
            if (var1 >= 20) {
               throw new IllegalStateException();
            }

            if (-1 != -2131733097 * this.aw.ab) {
               if (var1 >= 20) {
                  throw new IllegalStateException();
               }

               return nm.an(-2131733097 * this.aw.ab, (byte)-35).al * 1458410691;
            }
         }

         return 1;
      } catch (RuntimeException var2) {
         throw db.an(var2, "dv.ah(" + ')');
      }
   }

   void bo() {
      this.ap = cl.vt.am(this.af, -1927462840) ? px.an : px.aw;
   }

   boolean bz() {
      if (px.af == this.by) {
         this.ao((byte)44);
      }

      return this.by == px.an;
   }

   boolean bm() {
      if (px.af == this.by) {
         this.ao((byte)91);
      }

      return this.by == px.an;
   }

   protected final it au() {
      if (this.aw == null) {
         return null;
      } else {
         ha var1 = this.ct * -1372355773 != -1 && 0 == this.dm * 1253892101 ? dc.an(this.ct * -1372355773, (byte)121) : null;
         ha var2 = -1 != this.cz * -1302441815 && !this.aj && (this.cz * -1302441815 != this.bt * 1590591885 || var1 == null) ? dc.an(this.cz * -1302441815, (byte)61) : null;
         it var3 = this.aw.aa(var1, -41215169 * this.cp, var2, 424813829 * this.cw, (byte)69);
         if (var3 == null) {
            return null;
         } else {
            var3.ai();
            this.de = 2070391287 * var3.et;
            int var4 = var3.ao;
            if (!this.aj) {
               var3 = this.cp(var3, (byte)127);
            }

            if (!this.aj && this.ah != null) {
               if (client.ep * -1886224337 >= this.ao * -935505685) {
                  this.ah = null;
               }

               if (-1886224337 * client.ep >= -1402262375 * this.ay && -1886224337 * client.ep < -935505685 * this.ao) {
                  it var5 = this.ah;
                  var5.be(this.ax * 1793688517 - 1144428983 * this.bx, this.ai * 1238902143 - 561204023 * this.aa, 240546619 * this.ag - -411750205 * this.bo);
                  if (this.dd * -1751341433 == 512) {
                     var5.ap();
                     var5.ap();
                     var5.ap();
                  } else if (1024 == -1751341433 * this.dd) {
                     var5.ap();
                     var5.ap();
                  } else if (1536 == -1751341433 * this.dd) {
                     var5.ap();
                  }

                  it[] var6 = new it[]{var3, var5};
                  var3 = new it(var6, 2);
                  if (this.dd * -1751341433 == 512) {
                     var5.ap();
                  } else if (1024 == this.dd * -1751341433) {
                     var5.ap();
                     var5.ap();
                  } else if (-1751341433 * this.dd == 1536) {
                     var5.ap();
                     var5.ap();
                     var5.ap();
                  }

                  var5.be(this.bx * 1144428983 - 1793688517 * this.ax, 561204023 * this.aa - this.ai * 1238902143, -411750205 * this.bo - this.ag * 240546619);
               }
            }

            var3.bx = true;
            if (this.dq != 0 && client.ep * -1886224337 >= this.dh * 1182789041 && client.ep * -1886224337 < 707232483 * this.dp) {
               var3.cj = this.du;
               var3.ch = this.db;
               var3.ct = this.df;
               var3.cp = this.dq;
               var3.cd = (short)var4;
            } else {
               var3.cp = 0;
            }

            return var3;
         }
      }
   }

   void bq() {
      for(int var1 = 0; var1 < 4; ++var1) {
         if (client.sg[var1] != null && client.sg[var1].aw(this.af.af(-710264960), (byte)32) != -1 && 2 != var1) {
            this.bb = px.an;
            return;
         }
      }

      this.bb = px.aw;
   }

   void bj() {
      this.by = px.af;
   }

   boolean cs() {
      if (this.bb == px.af) {
         this.ax((byte)-98);
      }

      return this.bb == px.an;
   }

   void bs() {
      this.by = px.af;
   }

   void at(byte var1) {
      try {
         px var10001;
         if (cl.vt.am(this.af, -2018991784)) {
            if (var1 <= 1) {
               return;
            }

            var10001 = px.an;
         } else {
            var10001 = px.aw;
         }

         this.ap = var10001;
      } catch (RuntimeException var2) {
         throw db.an(var2, "dv.at(" + ')');
      }
   }

   void bg() {
      this.by = es.sb != null && es.sb.bt(this.af, -1565064385) ? px.an : px.aw;
   }

   void bu() {
      this.by = es.sb != null && es.sb.bt(this.af, -1789131921) ? px.an : px.aw;
   }

   void bf() {
      for(int var1 = 0; var1 < 4; ++var1) {
         if (client.sg[var1] != null && client.sg[var1].aw(this.af.af(-710264960), (byte)97) != -1 && 2 != var1) {
            this.bb = px.an;
            return;
         }
      }

      this.bb = px.aw;
   }

   final void cy(int var1, int var2, iu var3) {
      if (this.dn * 1134756167 < 9) {
         this.dn += 400971895;
      }

      for(int var4 = 1134756167 * this.dn; var4 > 0; --var4) {
         this.dy[var4] = this.dy[var4 - 1];
         this.ds[var4] = this.ds[var4 - 1];
         this.da[var4] = this.da[var4 - 1];
      }

      this.dy[0] = var1;
      this.ds[0] = var2;
      this.da[0] = var3;
   }

   boolean aa(byte var1) {
      try {
         if (px.af == this.by) {
            if (var1 >= 31) {
               throw new IllegalStateException();
            }

            this.ao((byte)45);
         }

         boolean var10000;
         if (this.by == px.an) {
            if (var1 >= 31) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw db.an(var2, "dv.aa(" + ')');
      }
   }

   void br() {
      this.by = es.sb != null && es.sb.bt(this.af, 395597273) ? px.an : px.aw;
   }

   void bl() {
      this.bb = px.af;
   }

   final void ak(sg var1) {
      var1.at = 0;
      int var2 = var1.cm((byte)7);
      boolean var3 = true;
      this.ac = var1.cf(435772489) * 1162421511;
      this.au = var1.cf(435772489) * -914676177;
      int var4 = -1;
      this.ak = 0;
      int[] var5 = new int[12];

      int var7;
      int var8;
      int var9;
      for(int var6 = 0; var6 < 12; ++var6) {
         var7 = var1.cm((byte)7);
         if (var7 == 0) {
            var5[var6] = 0;
         } else {
            var8 = var1.cm((byte)7);
            var5[var6] = var8 + (var7 << 8);
            if (0 == var6 && 65535 == var5[0]) {
               var4 = var1.cl(769850293);
               break;
            }

            if (var5[var6] >= 512) {
               var9 = dh.af(var5[var6] - 512, (byte)16).ck * -919846075;
               if (0 != var9) {
                  this.ak = -248928759 * var9;
               }
            }
         }
      }

      int[] var14 = null;
      if (-1931866699 * client.cx >= 213) {
         var14 = new int[12];

         for(var7 = 0; var7 < 12; ++var7) {
            var8 = var1.cm((byte)7);
            if (var8 == 0) {
               var14[var7] = 0;
            } else {
               var9 = var1.cm((byte)7);
               var14[var7] = (var8 << 8) + var9;
            }
         }
      }

      int[] var15 = new int[5];

      for(var8 = 0; var8 < 5; ++var8) {
         var9 = var1.cm((byte)7);
         if (var9 < 0 || var9 >= mw.ao[var8].length) {
            var9 = 0;
         }

         var15[var8] = var9;
      }

      this.bt = var1.cl(-862188727) * 1196796229;
      if (65535 == this.bt * 1590591885) {
         this.bt = -1196796229;
      }

      this.bj = var1.cl(-1590985391) * -767436785;
      if (65535 == this.bj * 1319769839) {
         this.bj = 767436785;
      }

      this.bn = this.bj * 980575951;
      this.bs = var1.cl(-1463339340) * 1672510249;
      if (this.bs * 736907545 == 65535) {
         this.bs = -1672510249;
      }

      this.br = var1.cl(-1172289359) * -1683505383;
      if (65535 == 1648569641 * this.br) {
         this.br = 1683505383;
      }

      this.bg = var1.cl(-1144460320) * 497469823;
      if (-127994241 * this.bg == 65535) {
         this.bg = -497469823;
      }

      this.bu = var1.cl(139611322) * 1927855919;
      if (65535 == this.bu * -1059657777) {
         this.bu = -1927855919;
      }

      this.bf = var1.cl(-444844051) * 140602839;
      if (1939789287 * this.bf == 65535) {
         this.bf = -140602839;
      }

      this.af = new tm(var1.cw((byte)0), co.cn);
      this.ac((byte)2);
      this.ay(1516152544);
      this.ai(453146982);
      if (lq.mi == this) {
         tr.an = this.af.af(-710264960);
      }

      this.al = var1.cm((byte)7) * 225691243;
      this.at = var1.cl(-1655414721) * 1353643761;
      this.az = var1.cm((byte)7) == 1;
      if (client.cs * -1274626977 == 0 && client.pu * 324465533 >= 2) {
         this.az = false;
      }

      gx[] var16 = null;
      boolean var17 = false;
      int var10 = var1.cl(-394748441);
      var17 = (var10 >> 15 & 1) == 1;
      int var11;
      if (var10 > 0 && 32768 != var10) {
         var16 = new gx[12];

         for(var11 = 0; var11 < 12; ++var11) {
            int var12 = var10 >> 12 - var11 & 1;
            if (1 == var12) {
               var16[var11] = cw.af(var5[var11] - 512, var1, -1555712175);
            }
         }
      }

      for(var11 = 0; var11 < 3; ++var11) {
         this.aq[var11] = var1.cw((byte)0);
      }

      int var13 = var1.cm((byte)7);
      if (this.aw == null) {
         this.aw = new mw();
      }

      this.aw.af(var14, var5, var16, var17, var15, var2, var4, var13, (byte)73);
   }

   void bc() {
      this.bb = px.af;
   }

   int cu() {
      return this.aw != null && -1 != -2131733097 * this.aw.ab ? nm.an(-2131733097 * this.aw.ab, (byte)-89).al * 1458410691 : 1;
   }

   void bw() {
      this.bb = px.af;
   }

   void ce() {
      this.bb = px.af;
   }

   boolean ci() {
      if (this.bb == px.af) {
         this.ax((byte)-3);
      }

      return this.bb == px.an;
   }

   void bi() {
      this.ap = px.af;
   }

   boolean cc() {
      if (this.bb == px.af) {
         this.ax((byte)-115);
      }

      return this.bb == px.an;
   }

   int cn() {
      return this.aw != null && -1 != 747584608 * this.aw.ab ? nm.an(1671322384 * this.aw.ab, (byte)-19).al * 1458410691 : 1;
   }

   int ca() {
      return this.aw != null && -1 != -2131733097 * this.aw.ab ? nm.an(1396787240 * this.aw.ab, (byte)-25).al * 828317312 : 1;
   }

   boolean bd() {
      if (px.af == this.by) {
         this.ao((byte)74);
      }

      return this.by == px.an;
   }

   void bh() {
      this.bb = px.af;
   }

   final void cq(int var1, int var2, iu var3) {
      if (this.ct * -1372355773 != -1 && dc.an(-1372355773 * this.ct, (byte)126).bi * 1957040329 == 1) {
         this.ct = 1690721941;
      }

      this.cd(-2143858086);
      if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
         if (this.dy[0] >= 0 && this.dy[0] < 104 && this.ds[0] >= 0 && this.ds[0] < 104) {
            if (iu.ac == var3) {
               cc.kq(this, var1, var2, iu.ac, -1796483670);
            }

            this.am(var1, var2, var3, 475560620);
         } else {
            this.ar(var1, var2, -200652475);
         }
      } else {
         this.ar(var1, var2, -817136496);
      }

   }

   final void cm(int var1, int var2, iu var3) {
      if (this.ct * -1372355773 != -1 && dc.an(-1007015736 * this.ct, (byte)98).bi * -1783292256 == 1) {
         this.ct = 1590035220;
      }

      this.cd(-2143782261);
      if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
         if (this.dy[0] >= 0 && this.dy[0] < 928821171 && this.ds[0] >= 0 && this.ds[0] < 104) {
            if (iu.ac == var3) {
               cc.kq(this, var1, var2, iu.ac, -1796483670);
            }

            this.am(var1, var2, var3, 475560620);
         } else {
            this.ar(var1, var2, -1939289893);
         }
      } else {
         this.ar(var1, var2, -970599363);
      }

   }

   final void cf(int var1, int var2, iu var3) {
      if (this.ct * 1452941382 != -1 && dc.an(-723947764 * this.ct, (byte)74).bi * 1957040329 == 1) {
         this.ct = 711061820;
      }

      this.cd(-2116499920);
      if (var1 >= 0 && var1 < 877147991 && var2 >= 0 && var2 < 920160810) {
         if (this.dy[0] >= 0 && this.dy[0] < 104 && this.ds[0] >= 0 && this.ds[0] < 104) {
            if (iu.ac == var3) {
               cc.kq(this, var1, var2, iu.ac, -1796483670);
            }

            this.am(var1, var2, var3, 475560620);
         } else {
            this.ar(var1, var2, -857390184);
         }
      } else {
         this.ar(var1, var2, -1320647815);
      }

   }

   void cl(int var1, int var2) {
      this.dn = 0;
      this.eo = 0;
      this.ep = 0;
      this.dy[0] = var1;
      this.ds[0] = var2;
      int var3 = this.ah((byte)-80);
      this.bx = -1102445696 * this.dy[0] + 478936340 * var3;
      this.bo = var3 * -1815504847 + -171358884 * this.ds[0];
   }

   final void az(sg var1) {
      var1.at = 0;
      int var2 = var1.cm((byte)7);
      boolean var3 = true;
      this.ac = var1.cf(435772489) * 1162421511;
      this.au = var1.cf(435772489) * -914676177;
      int var4 = -1;
      this.ak = 0;
      int[] var5 = new int[12];

      int var7;
      int var8;
      int var9;
      for(int var6 = 0; var6 < 12; ++var6) {
         var7 = var1.cm((byte)7);
         if (var7 == 0) {
            var5[var6] = 0;
         } else {
            var8 = var1.cm((byte)7);
            var5[var6] = var8 + (var7 << 8);
            if (0 == var6 && 65535 == var5[0]) {
               var4 = var1.cl(-1992438584);
               break;
            }

            if (var5[var6] >= 512) {
               var9 = dh.af(var5[var6] - 512, (byte)118).ck * -919846075;
               if (0 != var9) {
                  this.ak = -248928759 * var9;
               }
            }
         }
      }

      int[] var14 = null;
      if (-1931866699 * client.cx >= 213) {
         var14 = new int[12];

         for(var7 = 0; var7 < 12; ++var7) {
            var8 = var1.cm((byte)7);
            if (var8 == 0) {
               var14[var7] = 0;
            } else {
               var9 = var1.cm((byte)7);
               var14[var7] = (var8 << 8) + var9;
            }
         }
      }

      int[] var15 = new int[5];

      for(var8 = 0; var8 < 5; ++var8) {
         var9 = var1.cm((byte)7);
         if (var9 < 0 || var9 >= mw.ao[var8].length) {
            var9 = 0;
         }

         var15[var8] = var9;
      }

      this.bt = var1.cl(694872059) * 1196796229;
      if (65535 == this.bt * 1590591885) {
         this.bt = -1196796229;
      }

      this.bj = var1.cl(-1887360262) * -767436785;
      if (65535 == this.bj * 1319769839) {
         this.bj = 767436785;
      }

      this.bn = this.bj * 980575951;
      this.bs = var1.cl(555559596) * 1672510249;
      if (this.bs * 736907545 == 65535) {
         this.bs = -1672510249;
      }

      this.br = var1.cl(531598444) * -1683505383;
      if (65535 == 1648569641 * this.br) {
         this.br = 1683505383;
      }

      this.bg = var1.cl(145781136) * 497469823;
      if (-127994241 * this.bg == 65535) {
         this.bg = -497469823;
      }

      this.bu = var1.cl(-1616491548) * 1927855919;
      if (65535 == this.bu * -1059657777) {
         this.bu = -1927855919;
      }

      this.bf = var1.cl(-313399836) * 140602839;
      if (1939789287 * this.bf == 65535) {
         this.bf = -140602839;
      }

      this.af = new tm(var1.cw((byte)0), co.cn);
      this.ac((byte)2);
      this.ay(1950508446);
      this.ai(453146982);
      if (lq.mi == this) {
         tr.an = this.af.af(-710264960);
      }

      this.al = var1.cm((byte)7) * 225691243;
      this.at = var1.cl(434239624) * 1353643761;
      this.az = var1.cm((byte)7) == 1;
      if (client.cs * -1274626977 == 0 && client.pu * 324465533 >= 2) {
         this.az = false;
      }

      gx[] var16 = null;
      boolean var17 = false;
      int var10 = var1.cl(336365197);
      var17 = (var10 >> 15 & 1) == 1;
      int var11;
      if (var10 > 0 && 32768 != var10) {
         var16 = new gx[12];

         for(var11 = 0; var11 < 12; ++var11) {
            int var12 = var10 >> 12 - var11 & 1;
            if (1 == var12) {
               var16[var11] = cw.af(var5[var11] - 512, var1, -981770893);
            }
         }
      }

      for(var11 = 0; var11 < 3; ++var11) {
         this.aq[var11] = var1.cw((byte)0);
      }

      int var13 = var1.cm((byte)7);
      if (this.aw == null) {
         this.aw = new mw();
      }

      this.aw.af(var14, var5, var16, var17, var15, var2, var4, var13, (byte)32);
   }

   void bp() {
      this.bb = px.af;
   }

   void bv() {
      for(int var1 = 0; var1 < 4; ++var1) {
         if (client.sg[var1] != null && client.sg[var1].aw(this.af.af(-710264960), (byte)22) != -1 && 2 != var1) {
            this.bb = px.an;
            return;
         }
      }

      this.bb = px.aw;
   }

   final boolean cx() {
      return this.aw != null;
   }

   final void ck(int var1, int var2, iu var3) {
      if (this.ct * -1372355773 != -1 && dc.an(-1372355773 * this.ct, (byte)11).bi * 1957040329 == 1) {
         this.ct = 1690721941;
      }

      this.cd(-2140163181);
      if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
         if (this.dy[0] >= 0 && this.dy[0] < 104 && this.ds[0] >= 0 && this.ds[0] < 104) {
            if (iu.ac == var3) {
               cc.kq(this, var1, var2, iu.ac, -1796483670);
            }

            this.am(var1, var2, var3, 475560620);
         } else {
            this.ar(var1, var2, -134979483);
         }
      } else {
         this.ar(var1, var2, -252492907);
      }

   }

   static void au(int var0) {
      try {
         if (!ax.an) {
            if (var0 == Integer.MIN_VALUE) {
               throw new IllegalStateException();
            }
         } else {
            cz.au = null;
            lu.ab = null;
            py.ac = null;
            ex.at = null;
            ho.aa = null;
            ad.ay = null;
            fc.ao = null;
            cz.ax = null;
            gs.ag = null;
            st.dr = null;
            av.dl = null;
            az.dk = null;
            cl.dt = null;
            mv.dv = null;
            em.av.an(1639975847);
            ly.au = -626822165;
            ly.ab = null;
            oq.aq = 1643562499;
            gz.al = -1823837761;
            dn.at = 0;
            ev.ay = false;
            ga.aa = 440964570;
            gn.an(true, 1735285531);
            ax.an = false;
         }
      } catch (RuntimeException var1) {
         throw db.an(var1, "dv.au(" + ')');
      }
   }

   static int af(int var0, int var1, byte var2) {
      try {
         dc var3 = (dc)dc.af.af((long)var0);
         if (var3 == null) {
            if (var2 != 0) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            if (var1 >= 0) {
               if (var2 != 0) {
                  throw new IllegalStateException();
               }

               if (var1 < var3.an.length) {
                  return var3.an[var1];
               }

               if (var2 != 0) {
                  throw new IllegalStateException();
               }
            }

            return -1;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "dv.af(" + ')');
      }
   }
}
