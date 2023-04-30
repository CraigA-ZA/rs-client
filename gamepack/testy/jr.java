import accessors.RSWorldMapRegion;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class jr implements RSWorldMapRegion {
   int ay;
   static final int an = -3407872;
   static final int aw = 37748736;
   final HashMap ai;
   public static ke au = new ke(37748736, 256);
   int ab;
   int aq;
   jm al;
   LinkedList at;
   int aa;
   static final int af = -3355444;
   static final int ac = 256;
   HashMap ax;
   List ao;

   void ae(HashSet var1, int var2, int var3, short var4) {
      try {
         Iterator var5 = this.ao.iterator();

         while(var5.hasNext()) {
            if (var4 <= 128) {
               throw new IllegalStateException();
            }

            kg var6 = (kg)var5.next();
            if (var6.as(684549380)) {
               hw var7 = nf.an(var6.an(-402130740), 2080610855);
               if (var7 != null) {
                  if (var4 <= 128) {
                     throw new IllegalStateException();
                  }

                  if (var1.contains(var7.al(-1521601261))) {
                     if (var4 <= 128) {
                        throw new IllegalStateException();
                     }

                     this.ap(var7, -216598991 * var6.at, var6.aa * -1288412757, var2, var3, -697064067);
                  }
               }
            }
         }

      } catch (RuntimeException var8) {
         throw db.an(var8, "jr.ae(" + ')');
      }
   }

   void ac(int var1, int var2, int var3, byte var4) {
      try {
         tq var5 = gz.an(-2122501643 * this.ab, 1858063995 * this.aq, this.ay * -1897887643, 1906592458);
         if (var5 == null) {
            if (var4 <= 3) {
               throw new IllegalStateException();
            }
         } else {
            if (this.ay * -1205724864 == var3) {
               if (var4 <= 3) {
                  throw new IllegalStateException();
               }

               var5.ay(var1, var2);
            } else {
               var5.bz(var1, var2, var3, var3);
            }

         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "jr.ac(" + ')');
      }
   }

   void au(jm var1, List var2, int var3) {
      try {
         this.ax.clear();
         this.al = var1;
         this.aa(var2, (short)10781);
      } catch (RuntimeException var4) {
         throw db.an(var4, "jr.au(" + ')');
      }
   }

   void ab(HashSet var1, List var2, int var3) {
      try {
         this.ax.clear();
         Iterator var4 = var1.iterator();

         while(var4.hasNext()) {
            if (var3 == 143437147) {
               throw new IllegalStateException();
            }

            jh var5 = (jh)var4.next();
            if (var5.bk(790722291) == this.ab * -2122501643) {
               if (var3 == 143437147) {
                  return;
               }

               if (var5.bx(2104723155) == 1858063995 * this.aq) {
                  this.at.add(var5);
               }
            }
         }

         this.aa(var2, (short)1710);
      } catch (RuntimeException var6) {
         throw db.an(var6, "jr.ab(" + ')');
      }
   }

   static tq bg(int var0, int var1, int var2) {
      return (tq)au.af(er.af(var0, var1, var2, -1790263875));
   }

   void al(hq var1, int var2, int var3, int var4, jz var5, int var6) {
      try {
         lb var7 = new lb(var2, this.ab * 1598848320 + var3, -1342988608 * this.aq + var4);
         lb var8 = null;
         if (null != this.al) {
            if (var6 == -1086551379) {
               throw new IllegalStateException();
            }

            var8 = new lb(this.al.at * 1615088237 + var2, var3 + this.al.au * 518961216, 763222976 * this.al.ab + var4);
         } else {
            jh var9 = (jh)var5;
            var8 = new lb(var2 + var9.at * 1615088237, var3 + 518961216 * var9.au + var9.aw(-907307158) * 8, var9.ab * 763222976 + var4 + var9.al(652823069) * 8);
         }

         hw var10;
         Object var12;
         if (var1.bu != null) {
            if (var6 == -1086551379) {
               throw new IllegalStateException();
            }

            var12 = new jf(var8, var7, -1529817365 * var1.at, this);
         } else {
            var10 = nf.an(1270945427 * var1.be, 2025341780);
            var12 = new jt(var8, var7, var10.au * 219774827, this.bz(var10, -1925842659));
         }

         var10 = nf.an(((kg)var12).an(-1645609936), 1835538080);
         if (var10.ao) {
            if (var6 == -1086551379) {
               throw new IllegalStateException();
            }

            this.ax.put(new lb(0, var3, var4), var12);
         }

      } catch (RuntimeException var11) {
         throw db.an(var11, "jr.al(" + ')');
      }
   }

   void at(int var1) {
      try {
         Iterator var2 = this.ax.values().iterator();

         while(var2.hasNext()) {
            if (var1 >= 1275991106) {
               throw new IllegalStateException();
            }

            kg var3 = (kg)var2.next();
            if (var3 instanceof jf) {
               ((jf)var3).af(1844375559);
            }
         }

      } catch (RuntimeException var4) {
         throw db.an(var4, "jr.at(" + ')');
      }
   }

   void aa(List var1, short var2) {
      try {
         Iterator var3 = var1.iterator();

         while(var3.hasNext()) {
            if (var2 <= 255) {
               throw new IllegalStateException();
            }

            jt var4 = (jt)var3.next();
            if (nf.an(1767565411 * var4.af, 1893418018).ao && var4.aq.an * -96298701 >> 6 == this.ab * -2122501643) {
               if (var2 <= 255) {
                  throw new IllegalStateException();
               }

               if (this.aq * 1858063995 == -2105445199 * var4.aq.aw >> 6) {
                  if (var2 <= 255) {
                     return;
                  }

                  jt var5 = new jt(var4.aq, var4.aq, var4.af * 1767565411, this.bo(var4.af * 1767565411, -1151256626));
                  this.ao.add(var5);
               }
            }
         }

      } catch (RuntimeException var6) {
         throw db.an(var6, "jr.aa(" + ')');
      }
   }

   void ay(int var1) {
      try {
         if (this.al != null) {
            if (var1 <= 1036805162) {
               throw new IllegalStateException();
            }

            this.al.by(216938688);
         } else {
            Iterator var2 = this.at.iterator();

            while(var2.hasNext()) {
               if (var1 <= 1036805162) {
                  throw new IllegalStateException();
               }

               jh var3 = (jh)var2.next();
               var3.by(1948378515);
            }
         }

      } catch (RuntimeException var4) {
         throw db.an(var4, "jr.ay(" + ')');
      }
   }

   boolean ao(nm var1, short var2) {
      try {
         this.ax.clear();
         if (null != this.al) {
            if (var2 <= 1400) {
               throw new IllegalStateException();
            } else {
               this.al.ap(var1, (byte)97);
               if (this.al.ae(-556860665)) {
                  if (var2 <= 1400) {
                     throw new IllegalStateException();
                  } else {
                     this.aq(0, 0, 64, 64, this.al, 791967957);
                     return true;
                  }
               } else {
                  return false;
               }
            }
         } else {
            boolean var3 = true;

            Iterator var4;
            jh var5;
            for(var4 = this.at.iterator(); var4.hasNext(); var3 &= var5.ae(-1355381698)) {
               if (var2 <= 1400) {
                  throw new IllegalStateException();
               }

               var5 = (jh)var4.next();
               var5.ap(var1, (byte)19);
            }

            if (var3) {
               if (var2 <= 1400) {
                  throw new IllegalStateException();
               }

               var4 = this.at.iterator();

               while(var4.hasNext()) {
                  if (var2 <= 1400) {
                     throw new IllegalStateException();
                  }

                  var5 = (jh)var4.next();
                  this.aq(var5.at((byte)57) * 8, var5.aa((short)-12865) * 8, 8, 8, var5, -442915873);
               }
            }

            return var3;
         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "jr.ao(" + ')');
      }
   }

   static void au(int var0, int var1) {
      try {
         dc var2 = (dc)dc.af.af((long)var0);
         if (var2 != null) {
            for(int var3 = 0; var3 < var2.an.length; ++var3) {
               if (var1 != -28927295) {
                  throw new IllegalStateException();
               }

               var2.an[var3] = -1;
               var2.aw[var3] = 0;
            }

         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "jr.au(" + ')');
      }
   }

   void ai(int var1, int var2, int var3, HashSet var4, byte var5) {
      try {
         if (null == var4) {
            if (var5 >= 0) {
               throw new IllegalStateException();
            }

            var4 = new HashSet();
         }

         this.ad(var1, var2, var4, var3, -1769642683);
         this.be(var1, var2, var4, var3, -2097457957);
      } catch (RuntimeException var6) {
         throw db.an(var6, "jr.ai(" + ')');
      }
   }

   void ag(HashSet var1, int var2, int var3, int var4) {
      try {
         Iterator var5 = this.ax.values().iterator();

         while(var5.hasNext()) {
            if (var4 >= -1386616521) {
               throw new IllegalStateException();
            }

            kg var6 = (kg)var5.next();
            if (!var6.as(-462313720)) {
               if (var4 >= -1386616521) {
                  throw new IllegalStateException();
               }
            } else {
               int var7 = var6.an(-582837628);
               if (var1.contains(var7)) {
                  hw var8 = nf.an(var7, 2097191218);
                  this.ap(var8, var6.at * -216598991, var6.aa * -1288412757, var2, var3, -1649381751);
               }
            }
         }

         this.ae(var1, var2, var3, (short)20836);
      } catch (RuntimeException var9) {
         throw db.an(var9, "jr.ag(" + ')');
      }
   }

   void ah(kj var1, tc[] var2, kc var3, byte var4) {
      try {
         int var5;
         int var6;
         for(var5 = 0; var5 < 64; ++var5) {
            if (var4 <= 9) {
               throw new IllegalStateException();
            }

            for(var6 = 0; var6 < 64; ++var6) {
               if (var4 <= 9) {
                  throw new IllegalStateException();
               }

               this.am(var5, var6, this.al, var1, var3, -2045075746);
               this.as(var5, var6, this.al, var1, 1395300206);
            }
         }

         for(var5 = 0; var5 < 64; ++var5) {
            if (var4 <= 9) {
               throw new IllegalStateException();
            }

            for(var6 = 0; var6 < 64; ++var6) {
               this.ar(var5, var6, this.al, var1, var2, -711908357);
            }
         }

      } catch (RuntimeException var7) {
         throw db.an(var7, "jr.ah(" + ')');
      }
   }

   void cq(int var1, int var2, int var3, HashSet var4) {
      if (null == var4) {
         var4 = new HashSet();
      }

      this.ad(var1, var2, var4, var3, -1769642683);
      this.be(var1, var2, var4, var3, -1902222937);
   }

   void ar(int var1, int var2, jz var3, kj var4, tc[] var5, int var6) {
      try {
         this.az(var1, var2, var3, -1855512856);
         this.ak(var1, var2, var3, var5, -926949025);
      } catch (RuntimeException var7) {
         throw db.an(var7, "jr.ar(" + ')');
      }
   }

   void am(int var1, int var2, jz var3, kj var4, kc var5, int var6) {
      try {
         int var7 = var3.ax[0][var1][var2] - 1;
         int var8 = var3.ai[0][var1][var2] - 1;
         if (var7 == -1) {
            if (var6 >= -1536899763) {
               return;
            }

            if (var8 == -1) {
               th.em(-1897887643 * this.ay * var1, (63 - var2) * this.ay * -1897887643, -1897887643 * this.ay, this.ay * -1897887643, this.aa * 973203971);
            }
         }

         int var9 = 16711935;
         int var10;
         if (var8 != -1) {
            if (var6 >= -1536899763) {
               return;
            }

            int var11 = 973203971 * this.aa;
            hk var13 = (hk)hk.an.af((long)var8);
            hk var12;
            if (var13 != null) {
               if (var6 >= -1536899763) {
                  throw new IllegalStateException();
               }

               var12 = var13;
            } else {
               byte[] var14 = hk.af.bh(4, var8, (byte)-13);
               var13 = new hk();
               if (null != var14) {
                  var13.aw(new sg(var14), var8, (short)128);
               }

               var13.an(-378972580);
               hk.an.aw(var13, (long)var8);
               var12 = var13;
            }

            if (var12 == null) {
               if (var6 >= -1536899763) {
                  return;
               }

               var10 = var11;
            } else {
               int var15;
               int var16;
               int var17;
               int var18;
               int var19;
               if (-2085280195 * var12.ab >= 0) {
                  if (var6 >= -1536899763) {
                     throw new IllegalStateException();
                  }

                  var15 = -187777599 * var12.aa;
                  var16 = var12.ay * 1797179473;
                  var17 = -1379609783 * var12.ao;
                  if (var17 > 179) {
                     if (var6 >= -1536899763) {
                        throw new IllegalStateException();
                     }

                     var16 /= 2;
                  }

                  if (var17 > 192) {
                     if (var6 >= -1536899763) {
                        throw new IllegalStateException();
                     }

                     var16 /= 2;
                  }

                  if (var17 > 217) {
                     if (var6 >= -1536899763) {
                        throw new IllegalStateException();
                     }

                     var16 /= 2;
                  }

                  if (var17 > 243) {
                     if (var6 >= -1536899763) {
                        throw new IllegalStateException();
                     }

                     var16 /= 2;
                  }

                  var18 = (var16 / 32 << 7) + (var15 / 4 << 10) + var17 / 2;
                  var19 = dd.af(var18, 96, 2039313596);
                  var10 = in.af[var19] | -16777216;
               } else if (-202963991 * var12.ac >= 0) {
                  if (var6 >= -1536899763) {
                     throw new IllegalStateException();
                  }

                  int var21 = dd.af(in.ab.aq.ac(var12.ac * -202963991, 2087935623), 96, 1166097859);
                  var10 = in.af[var21] | -16777216;
               } else if (var12.aw * 1889574527 == 16711935) {
                  if (var6 >= -1536899763) {
                     throw new IllegalStateException();
                  }

                  var10 = var11;
               } else {
                  var15 = var12.aq * 174415927;
                  var16 = 470803713 * var12.al;
                  var17 = 532980473 * var12.at;
                  if (var17 > 179) {
                     if (var6 >= -1536899763) {
                        throw new IllegalStateException();
                     }

                     var16 /= 2;
                  }

                  if (var17 > 192) {
                     if (var6 >= -1536899763) {
                        throw new IllegalStateException();
                     }

                     var16 /= 2;
                  }

                  if (var17 > 217) {
                     if (var6 >= -1536899763) {
                        throw new IllegalStateException();
                     }

                     var16 /= 2;
                  }

                  if (var17 > 243) {
                     if (var6 >= -1536899763) {
                        throw new IllegalStateException();
                     }

                     var16 /= 2;
                  }

                  var18 = (var15 / 4 << 10) + (var16 / 32 << 7) + var17 / 2;
                  var19 = dd.af(var18, 96, 1910305875);
                  var10 = in.af[var19] | -16777216;
               }
            }

            var9 = var10;
         }

         if (var8 > -1) {
            if (var6 >= -1536899763) {
               throw new IllegalStateException();
            }

            if (0 == var3.ag[0][var1][var2]) {
               if (var6 >= -1536899763) {
                  throw new IllegalStateException();
               }

               th.em(-1897887643 * this.ay * var1, this.ay * -1897887643 * (63 - var2), -1897887643 * this.ay, this.ay * -1897887643, var9);
               return;
            }
         }

         var10 = this.aj(var1, var2, var3, var5, 390149173);
         if (var8 == -1) {
            if (var6 < -1536899763) {
               th.em(var1 * -1897887643 * this.ay, (63 - var2) * -1897887643 * this.ay, this.ay * -1897887643, -1897887643 * this.ay, var10);
            }
         } else {
            var4.af(var1 * -1897887643 * this.ay, this.ay * -1897887643 * (63 - var2), var10, var9, this.ay * -1897887643, this.ay * -1897887643, var3.ag[0][var1][var2], var3.ah[0][var1][var2], 1823196120);
         }
      } catch (RuntimeException var20) {
         throw db.an(var20, "jr.am(" + ')');
      }
   }

   int bx(tq var1, hn var2, int var3) {
      try {
         switch (var2.ac * 578864459) {
            case 1:
               return -var1.aw / 2;
            case 2:
               return 0;
            default:
               return -var1.aw;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "jr.bx(" + ')');
      }
   }

   int aj(int var1, int var2, jz var3, kc var4, int var5) {
      try {
         return 0 == var3.ax[0][var1][var2] ? this.aa * 973203971 : var4.af(var1, var2, 222072056);
      } catch (RuntimeException var6) {
         throw db.an(var6, "jr.aj(" + ')');
      }
   }

   void cd(int var1, int var2, jz var3, tc[] var4) {
      for(int var5 = 0; var5 < 1884441404 * var3.aa; ++var5) {
         jl[] var6 = var3.av[var5][var1][var2];
         if (null != var6 && var6.length != 0) {
            jl[] var7 = var6;

            for(int var8 = 0; var8 < var7.length; ++var8) {
               jl var9 = var7[var8];
               if (!iy.au(var9.an * 603915833, -2137147313)) {
                  int var11 = var9.an * 1504481025;
                  boolean var10 = 2021339175 * mc.az.ad == var11;
                  if (!var10) {
                     continue;
                  }
               }

               hq var12 = fw.an(2080162465 * var9.af, (short)5729);
               if (-1 != 1602881847 * var12.bk) {
                  if (771086195 * var12.bk != 46 && var12.bk * 2073613165 != 1839062802) {
                     var4[771086195 * var12.bk].au(var1 * -1897887643 * this.ay, this.ay * -1897887643 * (-550236294 - var2), -844069788 * this.ay, 499192010 * this.ay);
                  } else {
                     var4[var12.bk * 771086195].au(var1 * -1897887643 * this.ay, -1897887643 * this.ay * (63 - var2), -965237675 * this.ay + 1, 678401920 * this.ay + 1);
                  }
               }
            }
         }
      }

   }

   void az(int var1, int var2, jz var3, int var4) {
      try {
         for(int var5 = 0; var5 < var3.aa * 1632558421; ++var5) {
            if (var4 == -805549871) {
               throw new IllegalStateException();
            }

            jl[] var6 = var3.av[var5][var1][var2];
            if (var6 != null) {
               if (var6.length == 0) {
                  if (var4 == -805549871) {
                     throw new IllegalStateException();
                  }
               } else {
                  jl[] var7 = var6;

                  for(int var8 = 0; var8 < var7.length; ++var8) {
                     if (var4 == -805549871) {
                        return;
                     }

                     jl var9;
                     boolean var10000;
                     label136: {
                        label135: {
                           var9 = var7[var8];
                           int var11 = 1504481025 * var9.an;
                           if (var11 >= mc.af.ad * -1344801027) {
                              if (var4 == -805549871) {
                                 throw new IllegalStateException();
                              }

                              if (var11 <= mc.ac.ad * -1344801027) {
                                 break label135;
                              }

                              if (var4 == -805549871) {
                                 throw new IllegalStateException();
                              }
                           }

                           if (-1344801027 * mc.au.ad != var11) {
                              var10000 = false;
                              break label136;
                           }
                        }

                        var10000 = true;
                     }

                     boolean var10 = var10000;
                     if (var10) {
                        if (var4 == -805549871) {
                           return;
                        }

                        hq var12 = fw.an(2080162465 * var9.af, (short)1697);
                        int var13 = var12.aj * 415653149 != 0 ? -3407872 : -3355444;
                        if (mc.af.ad * -1344801027 == 1504481025 * var9.an) {
                           if (var4 == -805549871) {
                              throw new IllegalStateException();
                           }

                           this.bt(var1, var2, -1419490017 * var9.aw, var13, (byte)0);
                        }

                        if (-1344801027 * mc.aw.ad == 1504481025 * var9.an) {
                           if (var4 == -805549871) {
                              throw new IllegalStateException();
                           }

                           this.bt(var1, var2, var9.aw * -1419490017, -3355444, (byte)0);
                           this.bt(var1, var2, var9.aw * -1419490017 + 1, var13, (byte)0);
                        }

                        if (mc.ac.ad * -1344801027 == 1504481025 * var9.an) {
                           if (var4 == -805549871) {
                              throw new IllegalStateException();
                           }

                           if (var9.aw * -1419490017 == 0) {
                              if (var4 == -805549871) {
                                 throw new IllegalStateException();
                              }

                              th.ec(this.ay * -1897887643 * var1, (63 - var2) * -1897887643 * this.ay, 1, var13);
                           }

                           if (1 == -1419490017 * var9.aw) {
                              th.ec(this.ay * -1897887643 * var1 + this.ay * -1897887643 - 1, (63 - var2) * this.ay * -1897887643, 1, var13);
                           }

                           if (2 == var9.aw * -1419490017) {
                              th.ec(var1 * this.ay * -1897887643 + -1897887643 * this.ay - 1, (63 - var2) * -1897887643 * this.ay + -1897887643 * this.ay - 1, 1, var13);
                           }

                           if (3 == -1419490017 * var9.aw) {
                              if (var4 == -805549871) {
                                 throw new IllegalStateException();
                              }

                              th.ec(-1897887643 * this.ay * var1, (63 - var2) * this.ay * -1897887643 + this.ay * -1897887643 - 1, 1, var13);
                           }
                        }

                        if (-1344801027 * mc.au.ad == 1504481025 * var9.an) {
                           if (var4 == -805549871) {
                              throw new IllegalStateException();
                           }

                           int var14 = -1419490017 * var9.aw % 2;
                           int var15;
                           if (var14 == 0) {
                              if (var4 == -805549871) {
                                 throw new IllegalStateException();
                              }

                              for(var15 = 0; var15 < this.ay * -1897887643; ++var15) {
                                 if (var4 == -805549871) {
                                    throw new IllegalStateException();
                                 }

                                 th.ec(this.ay * -1897887643 * var1 + var15, (64 - var2) * -1897887643 * this.ay - 1 - var15, 1, var13);
                              }
                           } else {
                              for(var15 = 0; var15 < -1897887643 * this.ay; ++var15) {
                                 th.ec(var1 * -1897887643 * this.ay + var15, var15 + -1897887643 * this.ay * (63 - var2), 1, var13);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var16) {
         throw db.an(var16, "jr.az(" + ')');
      }
   }

   void ad(int var1, int var2, HashSet var3, int var4, int var5) {
      try {
         float var6 = (float)var4 / 64.0F;
         float var7 = var6 / 2.0F;
         Iterator var8 = this.ax.entrySet().iterator();

         while(var8.hasNext()) {
            if (var5 != -1769642683) {
               return;
            }

            Map.Entry var9 = (Map.Entry)var8.next();
            lb var10 = (lb)var9.getKey();
            int var11 = (int)((float)var1 + (float)(var10.an * -96298701) * var6 - var7);
            int var12 = (int)((float)(var2 + var4) - (float)(-2105445199 * var10.aw) * var6 - var7);
            kg var13 = (kg)var9.getValue();
            if (null != var13 && var13.as(970262038)) {
               if (var5 != -1769642683) {
                  throw new IllegalStateException();
               }

               var13.at = -1370053935 * var11;
               var13.aa = 1379111171 * var12;
               hw var14 = nf.an(var13.an(-293939764), 2122412967);
               if (!var3.contains(var14.al(557788055))) {
                  this.by(var13, var11, var12, var6, (byte)62);
               }
            }
         }

      } catch (RuntimeException var15) {
         throw db.an(var15, "jr.ad(" + ')');
      }
   }

   jr(int var1, int var2, int var3, HashMap var4) {
      try {
         super();
         this.ab = var1 * 970404445;
         this.aq = var2 * 125165747;
         this.at = new LinkedList();
         this.ao = new LinkedList();
         this.ax = new HashMap();
         this.aa = (var3 | -16777216) * 241012907;
         this.ai = var4;
      } catch (RuntimeException var5) {
         throw db.an(var5, "jr.<init>(" + ')');
      }
   }

   void ap(hw var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         tq var7 = var1.ab(false, -16711936);
         if (var7 == null) {
            if (var6 >= -401572388) {
               throw new IllegalStateException();
            }
         } else {
            var7.ax(var2 - var7.an / 2, var3 - var7.aw / 2);
            if (var4 % var5 < var5 / 2) {
               th.ed(var2, var3, 15, 16776960, 128);
               th.ed(var2, var3, 7, 16777215, 256);
            }

         }
      } catch (RuntimeException var8) {
         throw db.an(var8, "jr.ap(" + ')');
      }
   }

   void by(kg var1, int var2, int var3, float var4, byte var5) {
      try {
         hw var6 = nf.an(var1.an(-1416808168), 1865972483);
         this.bb(var6, var2, var3, (byte)0);
         this.bi(var1, var6, var2, var3, var4, (byte)8);
      } catch (RuntimeException var7) {
         throw db.an(var7, "jr.by(" + ')');
      }
   }

   void bt(int var1, int var2, int var3, int var4, byte var5) {
      try {
         var3 %= 4;
         if (0 == var3) {
            if (var5 != 0) {
               throw new IllegalStateException();
            }

            th.ee(-1897887643 * this.ay * var1, this.ay * -1897887643 * (63 - var2), this.ay * -1897887643, var4);
         }

         if (1 == var3) {
            if (var5 != 0) {
               throw new IllegalStateException();
            }

            th.ec(this.ay * -1897887643 * var1, (63 - var2) * this.ay * -1897887643, -1897887643 * this.ay, var4);
         }

         if (var3 == 2) {
            th.ee(this.ay * -1897887643 * var1 + this.ay * -1897887643 - 1, this.ay * -1897887643 * (63 - var2), this.ay * -1897887643, var4);
         }

         if (var3 == 3) {
            if (var5 != 0) {
               throw new IllegalStateException();
            }

            th.ec(var1 * -1897887643 * this.ay, -1897887643 * this.ay + (63 - var2) * this.ay * -1897887643 - 1, -1897887643 * this.ay, var4);
         }

      } catch (RuntimeException var6) {
         throw db.an(var6, "jr.bt(" + ')');
      }
   }

   void cz(int var1, int var2, jz var3, kj var4, kc var5) {
      int var6 = var3.ax[0][var1][var2] - 1;
      int var7 = var3.ai[0][var1][var2] - 1;
      if (var6 == -1 && var7 == -1) {
         th.em(-1897887643 * this.ay * var1, (63 - var2) * this.ay * -1897887643, -1897887643 * this.ay, this.ay * -1897887643, this.aa * 973203971);
      }

      int var8 = 16711935;
      int var9;
      if (var7 != -1) {
         int var10 = 973203971 * this.aa;
         hk var12 = (hk)hk.an.af((long)var7);
         hk var11;
         if (var12 != null) {
            var11 = var12;
         } else {
            byte[] var13 = hk.af.bh(4, var7, (byte)-116);
            var12 = new hk();
            if (null != var13) {
               var12.aw(new sg(var13), var7, (short)128);
            }

            var12.an(-765355122);
            hk.an.aw(var12, (long)var7);
            var11 = var12;
         }

         if (var11 == null) {
            var9 = var10;
         } else {
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            if (-2085280195 * var11.ab >= 0) {
               var14 = -187777599 * var11.aa;
               var15 = var11.ay * 1797179473;
               var16 = -1379609783 * var11.ao;
               if (var16 > 179) {
                  var15 /= 2;
               }

               if (var16 > 192) {
                  var15 /= 2;
               }

               if (var16 > 217) {
                  var15 /= 2;
               }

               if (var16 > 243) {
                  var15 /= 2;
               }

               var17 = (var15 / 32 << 7) + (var14 / 4 << 10) + var16 / 2;
               var18 = dd.af(var17, 96, 1240026183);
               var9 = in.af[var18] | -16777216;
            } else if (-202963991 * var11.ac >= 0) {
               int var19 = dd.af(in.ab.aq.ac(var11.ac * -202963991, 2052330882), 96, 1128320712);
               var9 = in.af[var19] | -16777216;
            } else if (var11.aw * 1889574527 == 16711935) {
               var9 = var10;
            } else {
               var14 = var11.aq * 174415927;
               var15 = 470803713 * var11.al;
               var16 = 532980473 * var11.at;
               if (var16 > 179) {
                  var15 /= 2;
               }

               if (var16 > 192) {
                  var15 /= 2;
               }

               if (var16 > 217) {
                  var15 /= 2;
               }

               if (var16 > 243) {
                  var15 /= 2;
               }

               var17 = (var14 / 4 << 10) + (var15 / 32 << 7) + var16 / 2;
               var18 = dd.af(var17, 96, 921079749);
               var9 = in.af[var18] | -16777216;
            }
         }

         var8 = var9;
      }

      if (var7 > -1 && 0 == var3.ag[0][var1][var2]) {
         th.em(-1897887643 * this.ay * var1, this.ay * -1897887643 * (63 - var2), -1897887643 * this.ay, this.ay * -1897887643, var8);
      } else {
         var9 = this.aj(var1, var2, var3, var5, 390149173);
         if (var7 == -1) {
            th.em(var1 * -1897887643 * this.ay, (63 - var2) * -1897887643 * this.ay, this.ay * -1897887643, -1897887643 * this.ay, var9);
         } else {
            var4.af(var1 * -1897887643 * this.ay, this.ay * -1897887643 * (63 - var2), var9, var8, this.ay * -1897887643, this.ay * -1897887643, var3.ag[0][var1][var2], var3.ah[0][var1][var2], -914319260);
         }
      }
   }

   static long bn(int var0, int var1, int var2) {
      return (long)(var2 << 16 | var0 << 8 | var1);
   }

   void cj(int var1, int var2, jz var3, kj var4) {
      for(int var5 = 1; var5 < var3.aa * 1632558421; ++var5) {
         int var6 = var3.ai[var5][var1][var2] - 1;
         if (var6 > -1) {
            int var8 = 973203971 * this.aa;
            hk var10 = (hk)hk.an.af((long)var6);
            hk var9;
            if (var10 != null) {
               var9 = var10;
            } else {
               byte[] var11 = hk.af.bh(4, var6, (byte)-4);
               var10 = new hk();
               if (null != var11) {
                  var10.aw(new sg(var11), var6, (short)128);
               }

               var10.an(1968484175);
               hk.an.aw(var10, (long)var6);
               var9 = var10;
            }

            int var7;
            if (var9 == null) {
               var7 = var8;
            } else {
               int var12;
               int var13;
               int var14;
               int var15;
               int var16;
               if (var9.ab * -2085280195 >= 0) {
                  var12 = var9.aa * -187777599;
                  var13 = var9.ay * 1797179473;
                  var14 = -1379609783 * var9.ao;
                  if (var14 > 179) {
                     var13 /= 2;
                  }

                  if (var14 > 192) {
                     var13 /= 2;
                  }

                  if (var14 > 217) {
                     var13 /= 2;
                  }

                  if (var14 > 243) {
                     var13 /= 2;
                  }

                  var15 = var14 / 2 + (var12 / 4 << 10) + (var13 / 32 << 7);
                  var16 = dd.af(var15, 96, 1366878132);
                  var7 = in.af[var16] | -16777216;
               } else if (var9.ac * -202963991 >= 0) {
                  int var17 = dd.af(in.ab.aq.ac(var9.ac * -202963991, -1418339200), 96, 1762111661);
                  var7 = in.af[var17] | -16777216;
               } else if (1889574527 * var9.aw == 16711935) {
                  var7 = var8;
               } else {
                  var12 = var9.aq * 174415927;
                  var13 = 470803713 * var9.al;
                  var14 = var9.at * 532980473;
                  if (var14 > 179) {
                     var13 /= 2;
                  }

                  if (var14 > 192) {
                     var13 /= 2;
                  }

                  if (var14 > 217) {
                     var13 /= 2;
                  }

                  if (var14 > 243) {
                     var13 /= 2;
                  }

                  var15 = var14 / 2 + (var12 / 4 << 10) + (var13 / 32 << 7);
                  var16 = dd.af(var15, 96, 435094207);
                  var7 = in.af[var16] | -16777216;
               }
            }

            if (var3.ag[var5][var1][var2] == 0) {
               th.em(var1 * -1897887643 * this.ay, (63 - var2) * -1897887643 * this.ay, this.ay * -1897887643, -1897887643 * this.ay, var7);
            } else {
               var4.af(var1 * -1897887643 * this.ay, (63 - var2) * this.ay * -1897887643, 0, var7, this.ay * -1897887643, this.ay * -1897887643, var3.ag[var5][var1][var2], var3.ah[var5][var1][var2], 2121247674);
            }
         }
      }

   }

   void bi(kg var1, hw var2, int var3, int var4, float var5, byte var6) {
      try {
         ku var7 = var1.aw(-2001210063);
         if (null == var7) {
            if (var6 != 8) {
               throw new IllegalStateException();
            }
         } else if (!var7.ac.af(var5, (byte)0)) {
            if (var6 != 8) {
               throw new IllegalStateException();
            }
         } else {
            on var8 = (on)this.ai.get(var7.ac);
            var8.ak(var7.af, var3 - var7.an * -31821843 / 2, var4, var7.an * -31821843, -1401615011 * var7.aw, -16777216 | 1080412371 * var2.at, 0, 1, 0, var8.al / 2);
         }
      } catch (RuntimeException var9) {
         throw db.an(var9, "jr.bi(" + ')');
      }
   }

   ku bo(int var1, int var2) {
      try {
         hw var3 = nf.an(var1, 2024834381);
         return this.bz(var3, 1576393937);
      } catch (RuntimeException var4) {
         throw db.an(var4, "jr.bo(" + ')');
      }
   }

   ku bz(hw var1, int var2) {
      try {
         if (null != var1.al && this.ai != null) {
            if (var2 == -442346035) {
               throw new IllegalStateException();
            }

            if (this.ai.get(jd.af) != null) {
               jd var3 = jd.an(952315347 * var1.aa, 1545697832);
               if (null == var3) {
                  if (var2 == -442346035) {
                     throw new IllegalStateException();
                  }

                  return null;
               }

               on var4 = (on)this.ai.get(var3);
               if (var4 == null) {
                  if (var2 == -442346035) {
                     throw new IllegalStateException();
                  }

                  return null;
               }

               int var5 = var4.ag(var1.al, 1000000);
               String[] var6 = new String[var5];
               var4.ax(var1.al, (int[])null, var6);
               int var7 = var6.length * var4.al / 2;
               int var8 = 0;
               String[] var9 = var6;

               for(int var10 = 0; var10 < var9.length; ++var10) {
                  if (var2 == -442346035) {
                     throw new IllegalStateException();
                  }

                  String var11 = var9[var10];
                  int var12 = var4.ao(var11);
                  if (var12 > var8) {
                     if (var2 == -442346035) {
                        throw new IllegalStateException();
                     }

                     var8 = var12;
                  }
               }

               return new ku(var1.al, var8, var7, var3);
            }
         }

         return null;
      } catch (RuntimeException var13) {
         throw db.an(var13, "jr.bz(" + ')');
      }
   }

   void do(int var1, int var2, jz var3) {
      for(int var4 = 0; var4 < var3.aa * 1632558421; ++var4) {
         jl[] var5 = var3.av[var4][var1][var2];
         if (var5 != null && var5.length != 0) {
            jl[] var6 = var5;

            for(int var7 = 0; var7 < var6.length; ++var7) {
               jl var8 = var6[var7];
               int var10 = -457361361 * var8.an;
               boolean var9 = var10 >= mc.af.ad * 836438036 && var10 <= mc.ac.ad * 1507932452 || 1102011564 * mc.au.ad == var10;
               if (var9) {
                  hq var11 = fw.an(2090192207 * var8.af, (short)26645);
                  int var12 = var11.aj * 415653149 != 0 ? -3407872 : -1738021609;
                  if (mc.af.ad * 487262371 == 1128944903 * var8.an) {
                     this.bt(var1, var2, -1419490017 * var8.aw, var12, (byte)0);
                  }

                  if (-1344801027 * mc.aw.ad == -1226350886 * var8.an) {
                     this.bt(var1, var2, var8.aw * -1419490017, -3355444, (byte)0);
                     this.bt(var1, var2, var8.aw * 133875660 + 1, var12, (byte)0);
                  }

                  if (mc.ac.ad * -1344801027 == 1504481025 * var8.an) {
                     if (var8.aw * -1419490017 == 0) {
                        th.ec(this.ay * -394945980 * var1, (63 - var2) * 118410509 * this.ay, 1, var12);
                     }

                     if (1 == -783944815 * var8.aw) {
                        th.ec(this.ay * -1897887643 * var1 + this.ay * 660467138 - 1, (63 - var2) * this.ay * -1758281416, 1, var12);
                     }

                     if (2 == var8.aw * 2040258146) {
                        th.ec(var1 * this.ay * -2143410227 + 1574920246 * this.ay - 1, (-1352302164 - var2) * 1750459345 * this.ay + -1897887643 * this.ay - 1, 1, var12);
                     }

                     if (3 == -1419490017 * var8.aw) {
                        th.ec(-1897887643 * this.ay * var1, (624982886 - var2) * this.ay * -97760155 + this.ay * -1757484138 - 1, 1, var12);
                     }
                  }

                  if (-1344801027 * mc.au.ad == 1504481025 * var8.an) {
                     int var13 = -1419490017 * var8.aw % 2;
                     int var14;
                     if (var13 == 0) {
                        for(var14 = 0; var14 < this.ay * -1897887643; ++var14) {
                           th.ec(this.ay * -1897887643 * var1 + var14, (206141534 - var2) * -1897887643 * this.ay - 1 - var14, 1, var12);
                        }
                     } else {
                        for(var14 = 0; var14 < -1897887643 * this.ay; ++var14) {
                           th.ec(var1 * -1897887643 * this.ay + var14, var14 + -1627119932 * this.ay * (-1807005285 - var2), 1, var12);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   List bd(byte var1) {
      try {
         LinkedList var2 = new LinkedList();
         var2.addAll(this.ao);
         var2.addAll(this.ax.values());
         return var2;
      } catch (RuntimeException var3) {
         throw db.an(var3, "jr.bd(" + ')');
      }
   }

   void de(kg var1, int var2, int var3, float var4) {
      hw var5 = nf.an(var1.an(-1325143425), 1928816114);
      this.bb(var5, var2, var3, (byte)0);
      this.bi(var1, var5, var2, var3, var4, (byte)8);
   }

   static long bj(int var0, int var1, int var2) {
      return (long)(var2 << 16 | var0 << 8 | var1);
   }

   void cx(kj var1, tc[] var2, kc var3) {
      int var4;
      int var5;
      for(var4 = 0; var4 < 64; ++var4) {
         for(var5 = 0; var5 < 64; ++var5) {
            this.am(var4, var5, this.al, var1, var3, -1923427221);
            this.as(var4, var5, this.al, var1, 2015347906);
         }
      }

      for(var4 = 0; var4 < 64; ++var4) {
         for(var5 = 0; var5 < 64; ++var5) {
            this.ar(var4, var5, this.al, var1, var2, -886909910);
         }
      }

   }

   static tq bs(int var0, int var1, int var2) {
      return (tq)au.af(er.af(var0, var1, var2, -699245380));
   }

   static tq br(int var0, int var1, int var2) {
      return (tq)au.af(er.af(var0, var1, var2, -2097495790));
   }

   void av(kj var1, tc[] var2, kc var3, int var4) {
      try {
         Iterator var5 = this.at.iterator();

         jh var6;
         int var7;
         int var8;
         while(var5.hasNext()) {
            if (var4 != 390308152) {
               throw new IllegalStateException();
            }

            var6 = (jh)var5.next();

            for(var7 = var6.at((byte)57) * 8; var7 < var6.at((byte)57) * 8 + 8; ++var7) {
               for(var8 = var6.aa((short)-30527) * 8; var8 < var6.aa((short)-17785) * 8 + 8; ++var8) {
                  if (var4 != 390308152) {
                     throw new IllegalStateException();
                  }

                  this.am(var7, var8, var6, var1, var3, -1631652520);
                  this.as(var7, var8, var6, var1, 1978515823);
               }
            }
         }

         var5 = this.at.iterator();

         while(var5.hasNext()) {
            if (var4 != 390308152) {
               throw new IllegalStateException();
            }

            var6 = (jh)var5.next();

            for(var7 = var6.at((byte)57) * 8; var7 < var6.at((byte)57) * 8 + 8; ++var7) {
               if (var4 != 390308152) {
                  return;
               }

               for(var8 = var6.aa((short)-16391) * 8; var8 < var6.aa((short)-8672) * 8 + 8; ++var8) {
                  if (var4 != 390308152) {
                     throw new IllegalStateException();
                  }

                  this.ar(var7, var8, var6, var1, var2, -154098764);
               }
            }
         }

      } catch (RuntimeException var9) {
         throw db.an(var9, "jr.av(" + ')');
      }
   }

   static void bu() {
      au.aq();
   }

   void ax(int var1, kj var2, tc[] var3, nm var4, nm var5, int var6) {
      try {
         this.ay = -467998355 * var1;
         if (this.al == null && this.at.isEmpty()) {
            if (var6 >= 1718459230) {
               throw new IllegalStateException();
            }
         } else if (gz.an(this.ab * -2122501643, 1858063995 * this.aq, var1, 2091722822) != null) {
            if (var6 >= 1718459230) {
               throw new IllegalStateException();
            }
         } else {
            boolean var7 = true;
            var7 &= this.ao(var4, (short)8372);
            int var9;
            if (null != this.al) {
               if (var6 >= 1718459230) {
                  throw new IllegalStateException();
               }

               var9 = 1716482187 * this.al.ay;
            } else {
               var9 = ((jz)this.at.getFirst()).ay * 1716482187;
            }

            var7 &= var5.cs(var9, -567775969);
            if (!var7) {
               if (var6 < 1718459230) {
                  ;
               }
            } else {
               byte[] var8 = var5.cn(var9, (byte)-68);
               kc var10;
               if (null == var8) {
                  if (var6 >= 1718459230) {
                     return;
                  }

                  var10 = new kc();
               } else {
                  var10 = new kc(mk.af(var8, -172326596).af);
               }

               tq var12 = new tq(-1205724864 * this.ay, -1205724864 * this.ay);
               var12.ac();
               if (this.al != null) {
                  if (var6 >= 1718459230) {
                     throw new IllegalStateException();
                  }

                  this.ah(var2, var3, var10, (byte)84);
               } else {
                  this.av(var2, var3, var10, 390308152);
               }

               int var13 = -2122501643 * this.ab;
               int var14 = this.aq * 1858063995;
               int var15 = -1897887643 * this.ay;
               au.au(var12, er.af(var13, var14, var15, -1198658533), var12.af.length * 4);
               this.ay(1615699563);
            }
         }
      } catch (RuntimeException var16) {
         throw db.an(var16, "jr.ax(" + ')');
      }
   }

   int bk(tq var1, hd var2, byte var3) {
      try {
         switch (var2.ac * 1932346871) {
            case 0:
               return 0;
            case 2:
               return -var1.an / 2;
            default:
               return -var1.an;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "jr.bk(" + ')');
      }
   }

   void ba(jm var1, List var2) {
      this.ax.clear();
      this.al = var1;
      this.aa(var2, (short)16790);
   }

   void bv(jm var1, List var2) {
      this.ax.clear();
      this.al = var1;
      this.aa(var2, (short)31857);
   }

   List da(int var1, int var2, int var3, int var4, int var5) {
      LinkedList var6 = new LinkedList();
      if (var4 >= var1 && var5 >= var2) {
         if (var4 < var1 + var3 && var5 < var3 + var2) {
            Iterator var7 = this.ax.values().iterator();

            kg var8;
            while(var7.hasNext()) {
               var8 = (kg)var7.next();
               if (var8.as(-1059795441) && var8.am(var4, var5, (byte)-22)) {
                  var6.add(var8);
               }
            }

            var7 = this.ao.iterator();

            while(var7.hasNext()) {
               var8 = (kg)var7.next();
               if (var8.as(-1303626476) && var8.am(var4, var5, (byte)-44)) {
                  var6.add(var8);
               }
            }

            return var6;
         } else {
            return var6;
         }
      } else {
         return var6;
      }
   }

   void bp(HashSet var1, List var2) {
      this.ax.clear();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         jh var4 = (jh)var3.next();
         if (var4.bk(2060694018) == this.ab * -2122501643 && var4.bx(1710019407) == 1858063995 * this.aq) {
            this.at.add(var4);
         }
      }

      this.aa(var2, (short)8885);
   }

   void bc(HashSet var1, List var2) {
      this.ax.clear();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         jh var4 = (jh)var3.next();
         if (var4.bk(892082894) == this.ab * -2122501643 && var4.bx(1719943073) == 1858063995 * this.aq) {
            this.at.add(var4);
         }
      }

      this.aa(var2, (short)19829);
   }

   void bh(int var1, int var2, int var3, int var4, jz var5) {
      for(int var6 = var1; var6 < var3 + var1; ++var6) {
         label80:
         for(int var7 = var2; var7 < var4 + var2; ++var7) {
            for(int var8 = 0; var8 < var5.aa * 867393305; ++var8) {
               jl[] var9 = var5.av[var8][var6][var7];
               if (null != var9 && 0 != var9.length) {
                  jl[] var10 = var9;

                  for(int var11 = 0; var11 < var10.length; ++var11) {
                     hq var13;
                     boolean var14;
                     label71: {
                        jl var12 = var10[var11];
                        var13 = fw.an(var12.af * 2080162465, (short)32559);
                        if (null != var13.bu) {
                           int[] var15 = var13.bu;

                           for(int var16 = 0; var16 < var15.length; ++var16) {
                              int var17 = var15[var16];
                              hq var18 = fw.an(var17, (short)7351);
                              if (-147580716 * var18.be != -1) {
                                 var14 = true;
                                 break label71;
                              }
                           }
                        } else if (-486863019 * var13.be != -1) {
                           var14 = true;
                           break label71;
                        }

                        var14 = false;
                     }

                     if (var14) {
                        this.al(var13, var8, var6, var7, var5, 1208276385);
                        continue label80;
                     }
                  }
               }
            }
         }
      }

   }

   void bw(int var1, int var2, int var3, int var4, jz var5) {
      for(int var6 = var1; var6 < var3 + var1; ++var6) {
         label81:
         for(int var7 = var2; var7 < var4 + var2; ++var7) {
            for(int var8 = 0; var8 < var5.aa * 1632558421; ++var8) {
               jl[] var9 = var5.av[var8][var6][var7];
               if (null != var9 && 0 != var9.length) {
                  jl[] var10 = var9;

                  for(int var11 = 0; var11 < var10.length; ++var11) {
                     hq var13;
                     boolean var14;
                     label72: {
                        jl var12 = var10[var11];
                        var13 = fw.an(var12.af * 2080162465, (short)10320);
                        if (null != var13.bu) {
                           int[] var15 = var13.bu;

                           for(int var16 = 0; var16 < var15.length; ++var16) {
                              int var17 = var15[var16];
                              hq var18 = fw.an(var17, (short)27756);
                              if (1270945427 * var18.be != -1) {
                                 var14 = true;
                                 break label72;
                              }
                           }
                        } else if (1270945427 * var13.be != -1) {
                           var14 = true;
                           break label72;
                        }

                        var14 = false;
                     }

                     if (var14) {
                        this.al(var13, var8, var6, var7, var5, -1453945783);
                        continue label81;
                     }
                  }
               }
            }
         }
      }

   }

   void ce(hq var1, int var2, int var3, int var4, jz var5) {
      lb var6 = new lb(var2, this.ab * -86171401 + var3, -1969300816 * this.aq + var4);
      lb var7 = null;
      if (null != this.al) {
         var7 = new lb(this.al.at * 1615088237 + var2, var3 + this.al.au * 1652387696, 763222976 * this.al.ab + var4);
      } else {
         jh var8 = (jh)var5;
         var7 = new lb(var2 + var8.at * 1615088237, var3 + 1684617255 * var8.au + var8.aw(-1881173832) * 8, var8.ab * 1921794220 + var4 + var8.al(1253252409) * 8);
      }

      hw var9;
      Object var10;
      if (var1.bu != null) {
         var10 = new jf(var7, var6, -1529817365 * var1.at, this);
      } else {
         var9 = nf.an(1270945427 * var1.be, 2029449514);
         var10 = new jt(var7, var6, var9.au * 219774827, this.bz(var9, 202686549));
      }

      var9 = nf.an(((kg)var10).an(-557324366), 2132649137);
      if (var9.ao) {
         this.ax.put(new lb(0, var3, var4), var10);
      }

   }

   void ci(hq var1, int var2, int var3, int var4, jz var5) {
      lb var6 = new lb(var2, this.ab * 1598848320 + var3, -1342988608 * this.aq + var4);
      lb var7 = null;
      if (null != this.al) {
         var7 = new lb(this.al.at * 1615088237 + var2, var3 + this.al.au * 518961216, 763222976 * this.al.ab + var4);
      } else {
         jh var8 = (jh)var5;
         var7 = new lb(var2 + var8.at * 1615088237, var3 + 518961216 * var8.au + var8.aw(-1181735717) * 8, var8.ab * 763222976 + var4 + var8.al(1826768350) * 8);
      }

      hw var9;
      Object var10;
      if (var1.bu != null) {
         var10 = new jf(var7, var6, -1529817365 * var1.at, this);
      } else {
         var9 = nf.an(1270945427 * var1.be, 1944996464);
         var10 = new jt(var7, var6, var9.au * 219774827, this.bz(var9, -916826041));
      }

      var9 = nf.an(((kg)var10).an(-966641663), 2112927218);
      if (var9.ao) {
         this.ax.put(new lb(0, var3, var4), var10);
      }

   }

   void cs() {
      Iterator var1 = this.ax.values().iterator();

      while(var1.hasNext()) {
         kg var2 = (kg)var1.next();
         if (var2 instanceof jf) {
            ((jf)var2).af(1844375559);
         }
      }

   }

   void cc() {
      Iterator var1 = this.ax.values().iterator();

      while(var1.hasNext()) {
         kg var2 = (kg)var1.next();
         if (var2 instanceof jf) {
            ((jf)var2).af(1844375559);
         }
      }

   }

   void cr(kj var1, tc[] var2, kc var3) {
      int var4;
      int var5;
      for(var4 = 0; var4 < 64; ++var4) {
         for(var5 = 0; var5 < 64; ++var5) {
            this.am(var4, var5, this.al, var1, var3, -1583819645);
            this.as(var4, var5, this.al, var1, -1384877148);
         }
      }

      for(var4 = 0; var4 < 64; ++var4) {
         for(var5 = 0; var5 < 64; ++var5) {
            this.ar(var4, var5, this.al, var1, var2, -1349524676);
         }
      }

   }

   void ca() {
      if (this.al != null) {
         this.al.by(-646969508);
      } else {
         Iterator var1 = this.at.iterator();

         while(var1.hasNext()) {
            jh var2 = (jh)var1.next();
            var2.by(-1110271063);
         }
      }

   }

   boolean cu(nm var1) {
      this.ax.clear();
      if (null != this.al) {
         this.al.ap(var1, (byte)103);
         if (this.al.ae(-1217912395)) {
            this.aq(0, 0, -1606645517, 64, this.al, -1939271280);
            return true;
         } else {
            return false;
         }
      } else {
         boolean var2 = true;

         Iterator var3;
         jh var4;
         for(var3 = this.at.iterator(); var3.hasNext(); var2 &= var4.ae(-1354088308)) {
            var4 = (jh)var3.next();
            var4.ap(var1, (byte)102);
         }

         if (var2) {
            var3 = this.at.iterator();

            while(var3.hasNext()) {
               var4 = (jh)var3.next();
               this.aq(var4.at((byte)57) * 8, var4.aa((short)400) * 8, 8, 8, var4, 1177987412);
            }
         }

         return var2;
      }
   }

   void ck(int var1, int var2, int var3, HashSet var4) {
      if (null == var4) {
         var4 = new HashSet();
      }

      this.ad(var1, var2, var4, var3, -1769642683);
      this.be(var1, var2, var4, var3, -2144725149);
   }

   void bb(hw var1, int var2, int var3, byte var4) {
      try {
         tq var5 = var1.ab(false, -16711936);
         if (var5 != null) {
            if (var4 != 0) {
               return;
            }

            int var6 = this.bk(var5, var1.aj, (byte)30);
            int var7 = this.bx(var5, var1.ak, -1956047929);
            var5.ax(var6 + var2, var7 + var3);
         }

      } catch (RuntimeException var8) {
         throw db.an(var8, "jr.bb(" + ')');
      }
   }

   void cm(HashSet var1, int var2, int var3) {
      Iterator var4 = this.ax.values().iterator();

      while(var4.hasNext()) {
         kg var5 = (kg)var4.next();
         if (var5.as(1390730354)) {
            int var6 = var5.an(-372459421);
            if (var1.contains(var6)) {
               hw var7 = nf.an(var6, 2094339545);
               this.ap(var7, var5.at * -216598991, var5.aa * -1288412757, var2, var3, -1838015119);
            }
         }
      }

      this.ae(var1, var2, var3, (short)5523);
   }

   void cf(HashSet var1, int var2, int var3) {
      Iterator var4 = this.ax.values().iterator();

      while(var4.hasNext()) {
         kg var5 = (kg)var4.next();
         if (var5.as(463487630)) {
            int var6 = var5.an(-1003746982);
            if (var1.contains(var6)) {
               hw var7 = nf.an(var6, 2108797367);
               this.ap(var7, var5.at * -295740087, var5.aa * -588183460, var2, var3, -700066971);
            }
         }
      }

      this.ae(var1, var2, var3, (short)345);
   }

   void dl(int var1, int var2, HashSet var3, int var4) {
      float var5 = (float)var4 / 64.0F;
      float var6 = var5 / 2.0F;
      Iterator var7 = this.ax.entrySet().iterator();

      while(var7.hasNext()) {
         Map.Entry var8 = (Map.Entry)var7.next();
         lb var9 = (lb)var8.getKey();
         int var10 = (int)((float)var1 + (float)(var9.an * -96298701) * var5 - var6);
         int var11 = (int)((float)(var2 + var4) - (float)(-831920036 * var9.aw) * var5 - var6);
         kg var12 = (kg)var8.getValue();
         if (null != var12 && var12.as(-78149885)) {
            var12.at = -1370053935 * var10;
            var12.aa = -1093132534 * var11;
            hw var13 = nf.an(var12.an(-1083747189), 2015330316);
            if (!var3.contains(var13.al(-1737819460))) {
               this.by(var12, var10, var11, var5, (byte)4);
            }
         }
      }

   }

   void cg(HashSet var1, int var2, int var3) {
      Iterator var4 = this.ax.values().iterator();

      while(var4.hasNext()) {
         kg var5 = (kg)var4.next();
         if (var5.as(-1091464948)) {
            int var6 = var5.an(-1483890517);
            if (var1.contains(var6)) {
               hw var7 = nf.an(var6, 1988039478);
               this.ap(var7, var5.at * -216598991, var5.aa * -1288412757, var2, var3, -1413544553);
            }
         }
      }

      this.ae(var1, var2, var3, (short)30528);
   }

   static void bf() {
      au.aq();
   }

   void cy(kj var1, tc[] var2, kc var3) {
      int var4;
      int var5;
      for(var4 = 0; var4 < 64; ++var4) {
         for(var5 = 0; var5 < 64; ++var5) {
            this.am(var4, var5, this.al, var1, var3, -1999084852);
            this.as(var4, var5, this.al, var1, 1808367775);
         }
      }

      for(var4 = 0; var4 < 64; ++var4) {
         for(var5 = 0; var5 < 64; ++var5) {
            this.ar(var4, var5, this.al, var1, var2, -2146885907);
         }
      }

   }

   void cn(List var1) {
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         jt var3 = (jt)var2.next();
         if (nf.an(994924002 * var3.af, 2101958222).ao && var3.aq.an * -96298701 >> 6 == this.ab * -1238818621 && this.aq * 1346869867 == 678095160 * var3.aq.aw >> 6) {
            jt var4 = new jt(var3.aq, var3.aq, var3.af * 1767565411, this.bo(var3.af * 963207918, 1483333439));
            this.ao.add(var4);
         }
      }

   }

   void cv(kj var1, tc[] var2, kc var3) {
      Iterator var4 = this.at.iterator();

      jh var5;
      int var6;
      int var7;
      while(var4.hasNext()) {
         var5 = (jh)var4.next();

         for(var6 = var5.at((byte)57) * 8; var6 < var5.at((byte)57) * 8 + 8; ++var6) {
            for(var7 = var5.aa((short)-4549) * 8; var7 < var5.aa((short)-1330) * 8 + 8; ++var7) {
               this.am(var6, var7, var5, var1, var3, -2005684782);
               this.as(var6, var7, var5, var1, -964288116);
            }
         }
      }

      var4 = this.at.iterator();

      while(var4.hasNext()) {
         var5 = (jh)var4.next();

         for(var6 = var5.at((byte)57) * 8; var6 < var5.at((byte)57) * 8 + 8; ++var6) {
            for(var7 = var5.aa((short)-10491) * 8; var7 < var5.aa((short)-4428) * 8 + 8; ++var7) {
               this.ar(var6, var7, var5, var1, var2, -312516599);
            }
         }
      }

   }

   List et() {
      LinkedList var1 = new LinkedList();
      var1.addAll(this.ao);
      var1.addAll(this.ax.values());
      return var1;
   }

   void co(int var1, int var2, jz var3, kj var4, tc[] var5) {
      this.az(var1, var2, var3, 620926451);
      this.ak(var1, var2, var3, var5, -926949025);
   }

   void bl(jm var1, List var2) {
      this.ax.clear();
      this.al = var1;
      this.aa(var2, (short)13903);
   }

   void ak(int var1, int var2, jz var3, tc[] var4, int var5) {
      try {
         for(int var6 = 0; var6 < 1632558421 * var3.aa; ++var6) {
            jl[] var7 = var3.av[var6][var1][var2];
            if (null != var7) {
               if (var5 != -926949025) {
                  throw new IllegalStateException();
               }

               if (var7.length == 0) {
                  if (var5 != -926949025) {
                     throw new IllegalStateException();
                  }
               } else {
                  jl[] var8 = var7;

                  for(int var9 = 0; var9 < var8.length; ++var9) {
                     if (var5 != -926949025) {
                        return;
                     }

                     jl var10 = var8[var9];
                     if (!iy.au(var10.an * 1504481025, -2088433826)) {
                        if (var5 != -926949025) {
                           return;
                        }

                        int var12 = var10.an * 1504481025;
                        boolean var11 = -1344801027 * mc.az.ad == var12;
                        if (!var11) {
                           if (var5 != -926949025) {
                              return;
                           }
                           continue;
                        }
                     }

                     hq var14 = fw.an(2080162465 * var10.af, (short)3903);
                     if (-1 != 771086195 * var14.bk) {
                        if (var5 != -926949025) {
                           return;
                        }

                        if (771086195 * var14.bk != 46) {
                           if (var5 != -926949025) {
                              throw new IllegalStateException();
                           }

                           if (var14.bk * 771086195 != 52) {
                              var4[771086195 * var14.bk].au(var1 * -1897887643 * this.ay, this.ay * -1897887643 * (63 - var2), 499192010 * this.ay, 499192010 * this.ay);
                              continue;
                           }

                           if (var5 != -926949025) {
                              throw new IllegalStateException();
                           }
                        }

                        var4[var14.bk * 771086195].au(var1 * -1897887643 * this.ay, -1897887643 * this.ay * (63 - var2), 499192010 * this.ay + 1, 499192010 * this.ay + 1);
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var13) {
         throw db.an(var13, "jr.ak(" + ')');
      }
   }

   void cw(int var1, int var2, jz var3, kj var4, kc var5) {
      int var6 = var3.ax[0][var1][var2] - 1;
      int var7 = var3.ai[0][var1][var2] - 1;
      if (var6 == -1 && var7 == -1) {
         th.em(-1897887643 * this.ay * var1, (-1840245484 - var2) * this.ay * -1897887643, -1897887643 * this.ay, this.ay * -1044972273, this.aa * -2087508960);
      }

      int var8 = 16711935;
      int var9;
      if (var7 != -1) {
         int var10 = 793440072 * this.aa;
         hk var12 = (hk)hk.an.af((long)var7);
         hk var11;
         if (var12 != null) {
            var11 = var12;
         } else {
            byte[] var13 = hk.af.bh(4, var7, (byte)-8);
            var12 = new hk();
            if (null != var13) {
               var12.aw(new sg(var13), var7, (short)128);
            }

            var12.an(1602966342);
            hk.an.aw(var12, (long)var7);
            var11 = var12;
         }

         if (var11 == null) {
            var9 = var10;
         } else {
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            if (-2085280195 * var11.ab >= 0) {
               var14 = -367214849 * var11.aa;
               var15 = var11.ay * 2054815491;
               var16 = -1869461123 * var11.ao;
               if (var16 > 1022526426) {
                  var15 /= 2;
               }

               if (var16 > 192) {
                  var15 /= 2;
               }

               if (var16 > -2095710915) {
                  var15 /= 2;
               }

               if (var16 > -2133245700) {
                  var15 /= 2;
               }

               var17 = (var15 / -1544805504 << 7) + (var14 / 4 << 10) + var16 / 2;
               var18 = dd.af(var17, 96, 1410369632);
               var9 = in.af[var18] | -797970370;
            } else if (-202963991 * var11.ac >= 0) {
               int var19 = dd.af(in.ab.aq.ac(var11.ac * -202963991, 1144669452), 2018898025, 1437036293);
               var9 = in.af[var19] | 1613554833;
            } else if (var11.aw * 1889574527 == 1617220467) {
               var9 = var10;
            } else {
               var14 = var11.aq * 2002795149;
               var15 = 734022403 * var11.al;
               var16 = 1460922060 * var11.at;
               if (var16 > 1331546986) {
                  var15 /= 2;
               }

               if (var16 > -950662459) {
                  var15 /= 2;
               }

               if (var16 > 1741339437) {
                  var15 /= 2;
               }

               if (var16 > 618429169) {
                  var15 /= 2;
               }

               var17 = (var14 / 4 << 10) + (var15 / -131960054 << 7) + var16 / 2;
               var18 = dd.af(var17, 50297465, 923176989);
               var9 = in.af[var18] | -16777216;
            }
         }

         var8 = var9;
      }

      if (var7 > -1 && 0 == var3.ag[0][var1][var2]) {
         th.em(-1897887643 * this.ay * var1, this.ay * -1897887643 * (-1877427665 - var2), -1897887643 * this.ay, this.ay * -1836623976, var8);
      } else {
         var9 = this.aj(var1, var2, var3, var5, 390149173);
         if (var7 == -1) {
            th.em(var1 * -1897887643 * this.ay, (198949540 - var2) * 1448416084 * this.ay, this.ay * -1897887643, -266397560 * this.ay, var9);
         } else {
            var4.af(var1 * -291796679 * this.ay, this.ay * 659721087 * (63 - var2), var9, var8, this.ay * 64492454, this.ay * -1257941486, var3.ag[0][var1][var2], var3.ah[0][var1][var2], -2009995516);
         }
      }
   }

   void ch(int var1, int var2, jz var3, kj var4) {
      for(int var5 = 1; var5 < var3.aa * 1632558421; ++var5) {
         int var6 = var3.ai[var5][var1][var2] - 1;
         if (var6 > -1) {
            int var8 = 973203971 * this.aa;
            hk var10 = (hk)hk.an.af((long)var6);
            hk var9;
            if (var10 != null) {
               var9 = var10;
            } else {
               byte[] var11 = hk.af.bh(4, var6, (byte)-8);
               var10 = new hk();
               if (null != var11) {
                  var10.aw(new sg(var11), var6, (short)128);
               }

               var10.an(1392882907);
               hk.an.aw(var10, (long)var6);
               var9 = var10;
            }

            int var7;
            if (var9 == null) {
               var7 = var8;
            } else {
               int var12;
               int var13;
               int var14;
               int var15;
               int var16;
               if (var9.ab * -2085280195 >= 0) {
                  var12 = var9.aa * -187777599;
                  var13 = var9.ay * -1984356417;
                  var14 = 278128979 * var9.ao;
                  if (var14 > 179) {
                     var13 /= 2;
                  }

                  if (var14 > -478327547) {
                     var13 /= 2;
                  }

                  if (var14 > -1582615227) {
                     var13 /= 2;
                  }

                  if (var14 > -1869358065) {
                     var13 /= 2;
                  }

                  var15 = var14 / 2 + (var12 / 4 << 10) + (var13 / 1175395816 << 7);
                  var16 = dd.af(var15, 96, 1762756863);
                  var7 = in.af[var16] | 1323887152;
               } else if (var9.ac * -202963991 >= 0) {
                  int var17 = dd.af(in.ab.aq.ac(var9.ac * -202963991, -1337450456), -562241238, 521796189);
                  var7 = in.af[var17] | 674892013;
               } else if (1889574527 * var9.aw == 16711935) {
                  var7 = var8;
               } else {
                  var12 = var9.aq * -732416410;
                  var13 = -364721316 * var9.al;
                  var14 = var9.at * -1584398624;
                  if (var14 > 179) {
                     var13 /= 2;
                  }

                  if (var14 > -1884799933) {
                     var13 /= 2;
                  }

                  if (var14 > -231233193) {
                     var13 /= 2;
                  }

                  if (var14 > 280816061) {
                     var13 /= 2;
                  }

                  var15 = var14 / 2 + (var12 / 4 << 10) + (var13 / 32 << 7);
                  var16 = dd.af(var15, 2051605212, 565047320);
                  var7 = in.af[var16] | -1255771044;
               }
            }

            if (var3.ag[var5][var1][var2] == 0) {
               th.em(var1 * -1897887643 * this.ay, (63 - var2) * -1687800936 * this.ay, this.ay * -1768454103, 979098588 * this.ay, var7);
            } else {
               var4.af(var1 * -1897887643 * this.ay, (63 - var2) * this.ay * -1897887643, 0, var7, this.ay * -1897887643, this.ay * -1897887643, var3.ag[var5][var1][var2], var3.ah[var5][var1][var2], 1321618637);
            }
         }
      }

   }

   int ct(int var1, int var2, jz var3, kc var4) {
      return 0 == var3.ax[0][var1][var2] ? this.aa * 973203971 : var4.af(var1, var2, 866678865);
   }

   void cp(int var1, int var2, jz var3, tc[] var4) {
      for(int var5 = 0; var5 < 1632558421 * var3.aa; ++var5) {
         jl[] var6 = var3.av[var5][var1][var2];
         if (null != var6 && var6.length != 0) {
            jl[] var7 = var6;

            for(int var8 = 0; var8 < var7.length; ++var8) {
               jl var9 = var7[var8];
               if (!iy.au(var9.an * -2066974395, -2144543228)) {
                  int var11 = var9.an * 1611152743;
                  boolean var10 = 2004602643 * mc.az.ad == var11;
                  if (!var10) {
                     continue;
                  }
               }

               hq var12 = fw.an(2080162465 * var9.af, (short)32243);
               if (-1 != 771086195 * var12.bk) {
                  if (771086195 * var12.bk != -1797833551 && var12.bk * 771086195 != 52) {
                     var4[771086195 * var12.bk].au(var1 * -1897887643 * this.ay, this.ay * -1897887643 * (63 - var2), 1304439433 * this.ay, 499192010 * this.ay);
                  } else {
                     var4[var12.bk * 290488624].au(var1 * -278993233 * this.ay, -1897887643 * this.ay * (-1040722647 - var2), 499192010 * this.ay + 1, 499192010 * this.ay + 1);
                  }
               }
            }
         }
      }

   }

   void be(int var1, int var2, HashSet var3, int var4, int var5) {
      try {
         float var6 = (float)var4 / 64.0F;
         Iterator var7 = this.ao.iterator();

         while(var7.hasNext()) {
            kg var8 = (kg)var7.next();
            if (!var8.as(-280174602)) {
               if (var5 >= -1370384679) {
                  throw new IllegalStateException();
               }
            } else {
               int var9 = var8.aq.an * -96298701 % 64;
               int var10 = -2105445199 * var8.aq.aw % 64;
               var8.at = (int)(var6 * (float)var9 + (float)var1) * -1370053935;
               var8.aa = (int)((float)(63 - var10) * var6 + (float)var2) * 1379111171;
               if (var3.contains(var8.an(-823186589))) {
                  if (var5 >= -1370384679) {
                     throw new IllegalStateException();
                  }
               } else {
                  this.by(var8, var8.at * -216598991, var8.aa * -1288412757, var6, (byte)105);
               }
            }
         }

      } catch (RuntimeException var11) {
         throw db.an(var11, "jr.be(" + ')');
      }
   }

   void dm(int var1, int var2, jz var3, tc[] var4) {
      for(int var5 = 0; var5 < 1632558421 * var3.aa; ++var5) {
         jl[] var6 = var3.av[var5][var1][var2];
         if (null != var6 && var6.length != 0) {
            jl[] var7 = var6;

            for(int var8 = 0; var8 < var7.length; ++var8) {
               jl var9 = var7[var8];
               if (!iy.au(var9.an * 1504481025, -2123819909)) {
                  int var11 = var9.an * 1504481025;
                  boolean var10 = -1344801027 * mc.az.ad == var11;
                  if (!var10) {
                     continue;
                  }
               }

               hq var12 = fw.an(2080162465 * var9.af, (short)6667);
               if (-1 != 771086195 * var12.bk) {
                  if (771086195 * var12.bk != 46 && var12.bk * 771086195 != 52) {
                     var4[771086195 * var12.bk].au(var1 * -1897887643 * this.ay, this.ay * -1897887643 * (63 - var2), 499192010 * this.ay, 499192010 * this.ay);
                  } else {
                     var4[var12.bk * 771086195].au(var1 * -1897887643 * this.ay, -1897887643 * this.ay * (63 - var2), 499192010 * this.ay + 1, 499192010 * this.ay + 1);
                  }
               }
            }
         }
      }

   }

   void dw(int var1, int var2, jz var3) {
      for(int var4 = 0; var4 < var3.aa * 1632558421; ++var4) {
         jl[] var5 = var3.av[var4][var1][var2];
         if (var5 != null && var5.length != 0) {
            jl[] var6 = var5;

            for(int var7 = 0; var7 < var6.length; ++var7) {
               jl var8 = var6[var7];
               int var10 = -529972859 * var8.an;
               boolean var9 = var10 >= mc.af.ad * 1953565431 && var10 <= mc.ac.ad * 1727404531 || -1549814073 * mc.au.ad == var10;
               if (var9) {
                  hq var11 = fw.an(2080162465 * var8.af, (short)14561);
                  int var12 = var11.aj * -1998471870 != 0 ? -436306048 : -3355444;
                  if (mc.af.ad * -1344801027 == 1170630623 * var8.an) {
                     this.bt(var1, var2, -1657905107 * var8.aw, var12, (byte)0);
                  }

                  if (-1344801027 * mc.aw.ad == 1504481025 * var8.an) {
                     this.bt(var1, var2, var8.aw * -1419490017, -3355444, (byte)0);
                     this.bt(var1, var2, var8.aw * -439897209 + 1, var12, (byte)0);
                  }

                  if (mc.ac.ad * -1344801027 == 1698052948 * var8.an) {
                     if (var8.aw * 847194087 == 0) {
                        th.ec(this.ay * -1897887643 * var1, (63 - var2) * -1897887643 * this.ay, 1, var12);
                     }

                     if (1 == -1419490017 * var8.aw) {
                        th.ec(this.ay * -1471011994 * var1 + this.ay * -1897887643 - 1, (63 - var2) * this.ay * 480243151, 1, var12);
                     }

                     if (2 == var8.aw * -2056533463) {
                        th.ec(var1 * this.ay * -316369405 + -1897887643 * this.ay - 1, (1122620218 - var2) * 1681718903 * this.ay + -1850780483 * this.ay - 1, 1, var12);
                     }

                     if (3 == -1424345444 * var8.aw) {
                        th.ec(-1251169207 * this.ay * var1, (2094750526 - var2) * this.ay * -641806571 + this.ay * -1897887643 - 1, 1, var12);
                     }
                  }

                  if (1178063396 * mc.au.ad == 1504481025 * var8.an) {
                     int var13 = -1419490017 * var8.aw % 2;
                     int var14;
                     if (var13 == 0) {
                        for(var14 = 0; var14 < this.ay * 981354187; ++var14) {
                           th.ec(this.ay * -1897887643 * var1 + var14, (64 - var2) * -1680040213 * this.ay - 1 - var14, 1, var12);
                        }
                     } else {
                        for(var14 = 0; var14 < 1088948880 * this.ay; ++var14) {
                           th.ec(var1 * -1897887643 * this.ay + var14, var14 + -1042741959 * this.ay * (63 - var2), 1, var12);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   void dc(int var1, int var2, jz var3) {
      for(int var4 = 0; var4 < var3.aa * 1632558421; ++var4) {
         jl[] var5 = var3.av[var4][var1][var2];
         if (var5 != null && var5.length != 0) {
            jl[] var6 = var5;

            for(int var7 = 0; var7 < var6.length; ++var7) {
               jl var8 = var6[var7];
               int var10 = 1504481025 * var8.an;
               boolean var9 = var10 >= mc.af.ad * -1344801027 && var10 <= mc.ac.ad * -1344801027 || -1344801027 * mc.au.ad == var10;
               if (var9) {
                  hq var11 = fw.an(2080162465 * var8.af, (short)16877);
                  int var12 = var11.aj * 415653149 != 0 ? -3407872 : -3355444;
                  if (mc.af.ad * -1344801027 == 1504481025 * var8.an) {
                     this.bt(var1, var2, -1419490017 * var8.aw, var12, (byte)0);
                  }

                  if (-1344801027 * mc.aw.ad == 1504481025 * var8.an) {
                     this.bt(var1, var2, var8.aw * -1419490017, -3355444, (byte)0);
                     this.bt(var1, var2, var8.aw * -1419490017 + 1, var12, (byte)0);
                  }

                  if (mc.ac.ad * -1344801027 == 1504481025 * var8.an) {
                     if (var8.aw * -1419490017 == 0) {
                        th.ec(this.ay * -1897887643 * var1, (63 - var2) * -1897887643 * this.ay, 1, var12);
                     }

                     if (1 == -1419490017 * var8.aw) {
                        th.ec(this.ay * -1897887643 * var1 + this.ay * -1897887643 - 1, (63 - var2) * this.ay * -1897887643, 1, var12);
                     }

                     if (2 == var8.aw * -1419490017) {
                        th.ec(var1 * this.ay * -1897887643 + -1897887643 * this.ay - 1, (63 - var2) * -1897887643 * this.ay + -1897887643 * this.ay - 1, 1, var12);
                     }

                     if (3 == -1419490017 * var8.aw) {
                        th.ec(-1897887643 * this.ay * var1, (63 - var2) * this.ay * -1897887643 + this.ay * -1897887643 - 1, 1, var12);
                     }
                  }

                  if (-1344801027 * mc.au.ad == 1504481025 * var8.an) {
                     int var13 = -1419490017 * var8.aw % 2;
                     int var14;
                     if (var13 == 0) {
                        for(var14 = 0; var14 < this.ay * -1897887643; ++var14) {
                           th.ec(this.ay * -1897887643 * var1 + var14, (64 - var2) * -1897887643 * this.ay - 1 - var14, 1, var12);
                        }
                     } else {
                        for(var14 = 0; var14 < -1897887643 * this.ay; ++var14) {
                           th.ec(var1 * -1897887643 * this.ay + var14, var14 + -1897887643 * this.ay * (63 - var2), 1, var12);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   int dx(tq var1, hn var2) {
      switch (var2.ac * 578864459) {
         case 1:
            return -var1.aw / 2;
         case 2:
            return 0;
         default:
            return -var1.aw;
      }
   }

   void di(int var1, int var2, jz var3) {
      for(int var4 = 0; var4 < var3.aa * 1632558421; ++var4) {
         jl[] var5 = var3.av[var4][var1][var2];
         if (var5 != null && var5.length != 0) {
            jl[] var6 = var5;

            for(int var7 = 0; var7 < var6.length; ++var7) {
               jl var8 = var6[var7];
               int var10 = 1504481025 * var8.an;
               boolean var9 = var10 >= mc.af.ad * -1344801027 && var10 <= mc.ac.ad * -1344801027 || -1344801027 * mc.au.ad == var10;
               if (var9) {
                  hq var11 = fw.an(2080162465 * var8.af, (short)22435);
                  int var12 = var11.aj * 415653149 != 0 ? -3407872 : -3355444;
                  if (mc.af.ad * -1344801027 == 1504481025 * var8.an) {
                     this.bt(var1, var2, -1419490017 * var8.aw, var12, (byte)0);
                  }

                  if (-1344801027 * mc.aw.ad == 1504481025 * var8.an) {
                     this.bt(var1, var2, var8.aw * -1419490017, -3355444, (byte)0);
                     this.bt(var1, var2, var8.aw * -1419490017 + 1, var12, (byte)0);
                  }

                  if (mc.ac.ad * -1344801027 == 1504481025 * var8.an) {
                     if (var8.aw * -1419490017 == 0) {
                        th.ec(this.ay * -1897887643 * var1, (63 - var2) * -1897887643 * this.ay, 1, var12);
                     }

                     if (1 == -1419490017 * var8.aw) {
                        th.ec(this.ay * -1897887643 * var1 + this.ay * -1897887643 - 1, (63 - var2) * this.ay * -1897887643, 1, var12);
                     }

                     if (2 == var8.aw * -1419490017) {
                        th.ec(var1 * this.ay * -1897887643 + -1897887643 * this.ay - 1, (63 - var2) * -1897887643 * this.ay + -1897887643 * this.ay - 1, 1, var12);
                     }

                     if (3 == -1419490017 * var8.aw) {
                        th.ec(-1897887643 * this.ay * var1, (63 - var2) * this.ay * -1897887643 + this.ay * -1897887643 - 1, 1, var12);
                     }
                  }

                  if (-1344801027 * mc.au.ad == 1504481025 * var8.an) {
                     int var13 = -1419490017 * var8.aw % 2;
                     int var14;
                     if (var13 == 0) {
                        for(var14 = 0; var14 < this.ay * -1897887643; ++var14) {
                           th.ec(this.ay * -1897887643 * var1 + var14, (64 - var2) * -1897887643 * this.ay - 1 - var14, 1, var12);
                        }
                     } else {
                        for(var14 = 0; var14 < -1897887643 * this.ay; ++var14) {
                           th.ec(var1 * -1897887643 * this.ay + var14, var14 + -1897887643 * this.ay * (63 - var2), 1, var12);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   void dr(int var1, int var2, HashSet var3, int var4) {
      float var5 = (float)var4 / 64.0F;
      float var6 = var5 / 2.0F;
      Iterator var7 = this.ax.entrySet().iterator();

      while(var7.hasNext()) {
         Map.Entry var8 = (Map.Entry)var7.next();
         lb var9 = (lb)var8.getKey();
         int var10 = (int)((float)var1 + (float)(var9.an * -96298701) * var5 - var6);
         int var11 = (int)((float)(var2 + var4) - (float)(-2105445199 * var9.aw) * var5 - var6);
         kg var12 = (kg)var8.getValue();
         if (null != var12 && var12.as(-338204267)) {
            var12.at = -1370053935 * var10;
            var12.aa = 1379111171 * var11;
            hw var13 = nf.an(var12.an(-1100019989), 2059416318);
            if (!var3.contains(var13.al(-621841052))) {
               this.by(var12, var10, var11, var5, (byte)14);
            }
         }
      }

   }

   void cb(kj var1, tc[] var2, kc var3) {
      Iterator var4 = this.at.iterator();

      jh var5;
      int var6;
      int var7;
      while(var4.hasNext()) {
         var5 = (jh)var4.next();

         for(var6 = var5.at((byte)57) * 8; var6 < var5.at((byte)57) * 8 + 8; ++var6) {
            for(var7 = var5.aa((short)-26328) * 8; var7 < var5.aa((short)-23579) * 8 + 8; ++var7) {
               this.am(var6, var7, var5, var1, var3, -2070388761);
               this.as(var6, var7, var5, var1, -1573199799);
            }
         }
      }

      var4 = this.at.iterator();

      while(var4.hasNext()) {
         var5 = (jh)var4.next();

         for(var6 = var5.at((byte)57) * 8; var6 < var5.at((byte)57) * 8 + 8; ++var6) {
            for(var7 = var5.aa((short)-30321) * 8; var7 < var5.aa((short)-12712) * 8 + 8; ++var7) {
               this.ar(var6, var7, var5, var1, var2, -562011417);
            }
         }
      }

   }

   void dk(int var1, int var2, HashSet var3, int var4) {
      float var5 = (float)var4 / 64.0F;
      float var6 = var5 / 2.0F;
      Iterator var7 = this.ax.entrySet().iterator();

      while(var7.hasNext()) {
         Map.Entry var8 = (Map.Entry)var7.next();
         lb var9 = (lb)var8.getKey();
         int var10 = (int)((float)var1 + (float)(var9.an * -96298701) * var5 - var6);
         int var11 = (int)((float)(var2 + var4) - (float)(-2105445199 * var9.aw) * var5 - var6);
         kg var12 = (kg)var8.getValue();
         if (null != var12 && var12.as(1541533482)) {
            var12.at = -1370053935 * var10;
            var12.aa = 1379111171 * var11;
            hw var13 = nf.an(var12.an(-1633090773), 1844223186);
            if (!var3.contains(var13.al(-1797658421))) {
               this.by(var12, var10, var11, var5, (byte)28);
            }
         }
      }

   }

   void dt(HashSet var1, int var2, int var3) {
      Iterator var4 = this.ao.iterator();

      while(var4.hasNext()) {
         kg var5 = (kg)var4.next();
         if (var5.as(1888005555)) {
            hw var6 = nf.an(var5.an(-367671437), 1986833627);
            if (var6 != null && var1.contains(var6.al(-183624112))) {
               this.ap(var6, -216598991 * var5.at, var5.aa * -1377085152, var2, var3, -1291299408);
            }
         }
      }

   }

   void dv(HashSet var1, int var2, int var3) {
      Iterator var4 = this.ao.iterator();

      while(var4.hasNext()) {
         kg var5 = (kg)var4.next();
         if (var5.as(1546738103)) {
            hw var6 = nf.an(var5.an(-1120995473), 2069322412);
            if (var6 != null && var1.contains(var6.al(140934188))) {
               this.ap(var6, 1414710105 * var5.at, var5.aa * -1288412757, var2, var3, -1732072222);
            }
         }
      }

   }

   void dz(hw var1, int var2, int var3, int var4, int var5) {
      tq var6 = var1.ab(false, -16711936);
      if (var6 != null) {
         var6.ax(var2 - var6.an / 2, var3 - var6.aw / 2);
         if (var4 % var5 < var5 / 2) {
            th.ed(var2, var3, 15, 16776960, -244846401);
            th.ed(var2, var3, 7, 349242982, 256);
         }

      }
   }

   void dg(kg var1, int var2, int var3, float var4) {
      hw var5 = nf.an(var1.an(-1645764334), 2002825764);
      this.bb(var5, var2, var3, (byte)0);
      this.bi(var1, var5, var2, var3, var4, (byte)8);
   }

   void aq(int var1, int var2, int var3, int var4, jz var5, int var6) {
      try {
         for(int var7 = var1; var7 < var3 + var1; ++var7) {
            if (var6 >= 1283536030) {
               return;
            }

            label115:
            for(int var8 = var2; var8 < var4 + var2; ++var8) {
               if (var6 >= 1283536030) {
                  throw new IllegalStateException();
               }

               for(int var9 = 0; var9 < var5.aa * 1632558421; ++var9) {
                  if (var6 >= 1283536030) {
                     return;
                  }

                  jl[] var10 = var5.av[var9][var7][var8];
                  if (null != var10) {
                     if (var6 >= 1283536030) {
                        throw new IllegalStateException();
                     }

                     if (0 == var10.length) {
                        if (var6 >= 1283536030) {
                           throw new IllegalStateException();
                        }
                     } else {
                        jl[] var11 = var10;

                        for(int var12 = 0; var12 < var11.length; ++var12) {
                           if (var6 >= 1283536030) {
                              throw new IllegalStateException();
                           }

                           hq var14;
                           boolean var15;
                           label106: {
                              jl var13 = var11[var12];
                              var14 = fw.an(var13.af * 2080162465, (short)13848);
                              if (null != var14.bu) {
                                 int[] var16 = var14.bu;

                                 for(int var17 = 0; var17 < var16.length; ++var17) {
                                    if (var6 >= 1283536030) {
                                       throw new IllegalStateException();
                                    }

                                    int var18 = var16[var17];
                                    hq var19 = fw.an(var18, (short)4463);
                                    if (1270945427 * var19.be != -1) {
                                       var15 = true;
                                       break label106;
                                    }
                                 }
                              } else if (1270945427 * var14.be != -1) {
                                 if (var6 >= 1283536030) {
                                    throw new IllegalStateException();
                                 }

                                 var15 = true;
                                 break label106;
                              }

                              var15 = false;
                           }

                           if (var15) {
                              this.al(var14, var9, var7, var8, var5, 881675685);
                              continue label115;
                           }

                           if (var6 >= 1283536030) {
                              throw new IllegalStateException();
                           }
                        }
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var20) {
         throw db.an(var20, "jr.aq(" + ')');
      }
   }

   void dh(kg var1, int var2, int var3, float var4) {
      hw var5 = nf.an(var1.an(-285147009), 2112182749);
      this.bb(var5, var2, var3, (byte)0);
      this.bi(var1, var5, var2, var3, var4, (byte)8);
   }

   void dp(hw var1, int var2, int var3) {
      tq var4 = var1.ab(false, -16711936);
      if (var4 != null) {
         int var5 = this.bk(var4, var1.aj, (byte)-33);
         int var6 = this.bx(var4, var1.ak, -1742435239);
         var4.ax(var5 + var2, var6 + var3);
      }

   }

   void du(hw var1, int var2, int var3) {
      tq var4 = var1.ab(false, -16711936);
      if (var4 != null) {
         int var5 = this.bk(var4, var1.aj, (byte)-17);
         int var6 = this.bx(var4, var1.ak, -1871175081);
         var4.ax(var5 + var2, var6 + var3);
      }

   }

   void db(hw var1, int var2, int var3) {
      tq var4 = var1.ab(false, -16711936);
      if (var4 != null) {
         int var5 = this.bk(var4, var1.aj, (byte)83);
         int var6 = this.bx(var4, var1.ak, -1821630962);
         var4.ax(var5 + var2, var6 + var3);
      }

   }

   void df(int var1, int var2, HashSet var3, int var4) {
      float var5 = (float)var4 / 64.0F;
      Iterator var6 = this.ao.iterator();

      while(var6.hasNext()) {
         kg var7 = (kg)var6.next();
         if (var7.as(1874207690)) {
            int var8 = var7.aq.an * -96298701 % 64;
            int var9 = -1381060527 * var7.aq.aw % -377071861;
            var7.at = (int)(var5 * (float)var8 + (float)var1) * 1593967405;
            var7.aa = (int)((float)(63 - var9) * var5 + (float)var2) * -217894002;
            if (!var3.contains(var7.an(-152691293))) {
               this.by(var7, var7.at * -216598991, var7.aa * 1355885104, var5, (byte)113);
            }
         }
      }

   }

   int dq(tq var1, hd var2) {
      switch (var2.ac * 1932346871) {
         case 0:
            return 0;
         case 2:
            return -var1.an / 2;
         default:
            return -var1.an;
      }
   }

   int dd(tq var1, hd var2) {
      switch (var2.ac * 1932346871) {
         case 0:
            return 0;
         case 2:
            return -var1.an / 2;
         default:
            return -var1.an;
      }
   }

   int dj(tq var1, hd var2) {
      switch (var2.ac * 501578733) {
         case 0:
            return 0;
         case 2:
            return -var1.an / 2;
         default:
            return -var1.an;
      }
   }

   List eq() {
      LinkedList var1 = new LinkedList();
      var1.addAll(this.ao);
      var1.addAll(this.ax.values());
      return var1;
   }

   ku dn(hw var1) {
      if (null != var1.al && this.ai != null && this.ai.get(jd.af) != null) {
         jd var2 = jd.an(952315347 * var1.aa, 1134926043);
         if (null == var2) {
            return null;
         } else {
            on var3 = (on)this.ai.get(var2);
            if (var3 == null) {
               return null;
            } else {
               int var4 = var3.ag(var1.al, 1000000);
               String[] var5 = new String[var4];
               var3.ax(var1.al, (int[])null, var5);
               int var6 = var5.length * var3.al / 2;
               int var7 = 0;
               String[] var8 = var5;

               for(int var9 = 0; var9 < var8.length; ++var9) {
                  String var10 = var8[var9];
                  int var11 = var3.ao(var10);
                  if (var11 > var7) {
                     var7 = var11;
                  }
               }

               return new ku(var1.al, var7, var6, var2);
            }
         }
      } else {
         return null;
      }
   }

   void as(int var1, int var2, jz var3, kj var4, int var5) {
      try {
         for(int var6 = 1; var6 < var3.aa * 1632558421; ++var6) {
            int var7 = var3.ai[var6][var1][var2] - 1;
            if (var7 > -1) {
               int var9 = 973203971 * this.aa;
               hk var11 = (hk)hk.an.af((long)var7);
               hk var10;
               if (var11 != null) {
                  if (var5 == -818868517) {
                     throw new IllegalStateException();
                  }

                  var10 = var11;
               } else {
                  byte[] var12 = hk.af.bh(4, var7, (byte)-19);
                  var11 = new hk();
                  if (null != var12) {
                     var11.aw(new sg(var12), var7, (short)128);
                  }

                  var11.an(-720329904);
                  hk.an.aw(var11, (long)var7);
                  var10 = var11;
               }

               int var8;
               if (var10 == null) {
                  if (var5 == -818868517) {
                     throw new IllegalStateException();
                  }

                  var8 = var9;
               } else {
                  int var13;
                  int var14;
                  int var15;
                  int var16;
                  int var17;
                  if (var10.ab * -2085280195 >= 0) {
                     if (var5 == -818868517) {
                        throw new IllegalStateException();
                     }

                     var13 = var10.aa * -187777599;
                     var14 = var10.ay * 1797179473;
                     var15 = -1379609783 * var10.ao;
                     if (var15 > 179) {
                        if (var5 == -818868517) {
                           return;
                        }

                        var14 /= 2;
                     }

                     if (var15 > 192) {
                        var14 /= 2;
                     }

                     if (var15 > 217) {
                        if (var5 == -818868517) {
                           throw new IllegalStateException();
                        }

                        var14 /= 2;
                     }

                     if (var15 > 243) {
                        if (var5 == -818868517) {
                           throw new IllegalStateException();
                        }

                        var14 /= 2;
                     }

                     var16 = var15 / 2 + (var13 / 4 << 10) + (var14 / 32 << 7);
                     var17 = dd.af(var16, 96, 1484562565);
                     var8 = in.af[var17] | -16777216;
                  } else if (var10.ac * -202963991 >= 0) {
                     if (var5 == -818868517) {
                        return;
                     }

                     int var19 = dd.af(in.ab.aq.ac(var10.ac * -202963991, -402670979), 96, 1321873265);
                     var8 = in.af[var19] | -16777216;
                  } else if (1889574527 * var10.aw == 16711935) {
                     if (var5 == -818868517) {
                        throw new IllegalStateException();
                     }

                     var8 = var9;
                  } else {
                     var13 = var10.aq * 174415927;
                     var14 = 470803713 * var10.al;
                     var15 = var10.at * 532980473;
                     if (var15 > 179) {
                        if (var5 == -818868517) {
                           throw new IllegalStateException();
                        }

                        var14 /= 2;
                     }

                     if (var15 > 192) {
                        var14 /= 2;
                     }

                     if (var15 > 217) {
                        if (var5 == -818868517) {
                           throw new IllegalStateException();
                        }

                        var14 /= 2;
                     }

                     if (var15 > 243) {
                        if (var5 == -818868517) {
                           return;
                        }

                        var14 /= 2;
                     }

                     var16 = var15 / 2 + (var13 / 4 << 10) + (var14 / 32 << 7);
                     var17 = dd.af(var16, 96, 1909981308);
                     var8 = in.af[var17] | -16777216;
                  }
               }

               if (var3.ag[var6][var1][var2] == 0) {
                  th.em(var1 * -1897887643 * this.ay, (63 - var2) * -1897887643 * this.ay, this.ay * -1897887643, -1897887643 * this.ay, var8);
               } else {
                  var4.af(var1 * -1897887643 * this.ay, (63 - var2) * this.ay * -1897887643, 0, var8, this.ay * -1897887643, this.ay * -1897887643, var3.ag[var6][var1][var2], var3.ah[var6][var1][var2], -582317645);
               }
            }
         }

      } catch (RuntimeException var18) {
         throw db.an(var18, "jr.as(" + ')');
      }
   }

   List ds(int var1, int var2, int var3, int var4, int var5) {
      LinkedList var6 = new LinkedList();
      if (var4 >= var1 && var5 >= var2) {
         if (var4 < var1 + var3 && var5 < var3 + var2) {
            Iterator var7 = this.ax.values().iterator();

            kg var8;
            while(var7.hasNext()) {
               var8 = (kg)var7.next();
               if (var8.as(460803296) && var8.am(var4, var5, (byte)-35)) {
                  var6.add(var8);
               }
            }

            var7 = this.ao.iterator();

            while(var7.hasNext()) {
               var8 = (kg)var7.next();
               if (var8.as(-28058570) && var8.am(var4, var5, (byte)-59)) {
                  var6.add(var8);
               }
            }

            return var6;
         } else {
            return var6;
         }
      } else {
         return var6;
      }
   }

   List bm(int var1, int var2, int var3, int var4, int var5, byte var6) {
      try {
         LinkedList var7 = new LinkedList();
         if (var4 >= var1 && var5 >= var2) {
            if (var4 < var1 + var3) {
               if (var6 >= 1) {
                  throw new IllegalStateException();
               }

               if (var5 < var3 + var2) {
                  Iterator var8 = this.ax.values().iterator();

                  kg var9;
                  while(var8.hasNext()) {
                     if (var6 >= 1) {
                        throw new IllegalStateException();
                     }

                     var9 = (kg)var8.next();
                     if (var9.as(1824088404)) {
                        if (var6 >= 1) {
                           throw new IllegalStateException();
                        }

                        if (var9.am(var4, var5, (byte)-65)) {
                           if (var6 >= 1) {
                              throw new IllegalStateException();
                           }

                           var7.add(var9);
                        }
                     }
                  }

                  var8 = this.ao.iterator();

                  while(var8.hasNext()) {
                     if (var6 >= 1) {
                        throw new IllegalStateException();
                     }

                     var9 = (kg)var8.next();
                     if (var9.as(1303030906)) {
                        if (var6 >= 1) {
                           throw new IllegalStateException();
                        }

                        if (var9.am(var4, var5, (byte)-25)) {
                           if (var6 >= 1) {
                              throw new IllegalStateException();
                           }

                           var7.add(var9);
                        }
                     }
                  }

                  return var7;
               }

               if (var6 >= 1) {
                  throw new IllegalStateException();
               }
            }

            return var7;
         } else {
            return var7;
         }
      } catch (RuntimeException var10) {
         throw db.an(var10, "jr.bm(" + ')');
      }
   }

   List ep(int var1, int var2, int var3, int var4, int var5) {
      LinkedList var6 = new LinkedList();
      if (var4 >= var1 && var5 >= var2) {
         if (var4 < var1 + var3 && var5 < var3 + var2) {
            Iterator var7 = this.ax.values().iterator();

            kg var8;
            while(var7.hasNext()) {
               var8 = (kg)var7.next();
               if (var8.as(421338917) && var8.am(var4, var5, (byte)-76)) {
                  var6.add(var8);
               }
            }

            var7 = this.ao.iterator();

            while(var7.hasNext()) {
               var8 = (kg)var7.next();
               if (var8.as(1408338258) && var8.am(var4, var5, (byte)-96)) {
                  var6.add(var8);
               }
            }

            return var6;
         } else {
            return var6;
         }
      } else {
         return var6;
      }
   }

   List eo(int var1, int var2, int var3, int var4, int var5) {
      LinkedList var6 = new LinkedList();
      if (var4 >= var1 && var5 >= var2) {
         if (var4 < var1 + var3 && var5 < var3 + var2) {
            Iterator var7 = this.ax.values().iterator();

            kg var8;
            while(var7.hasNext()) {
               var8 = (kg)var7.next();
               if (var8.as(1819121033) && var8.am(var4, var5, (byte)-109)) {
                  var6.add(var8);
               }
            }

            var7 = this.ao.iterator();

            while(var7.hasNext()) {
               var8 = (kg)var7.next();
               if (var8.as(-1200607436) && var8.am(var4, var5, (byte)-76)) {
                  var6.add(var8);
               }
            }

            return var6;
         } else {
            return var6;
         }
      } else {
         return var6;
      }
   }

   void cl(HashSet var1, int var2, int var3) {
      Iterator var4 = this.ax.values().iterator();

      while(var4.hasNext()) {
         kg var5 = (kg)var4.next();
         if (var5.as(1102865194)) {
            int var6 = var5.an(-1300654833);
            if (var1.contains(var6)) {
               hw var7 = nf.an(var6, 2014329195);
               this.ap(var7, var5.at * -216598991, var5.aa * 1850140489, var2, var3, -784552649);
            }
         }
      }

      this.ae(var1, var2, var3, (short)29091);
   }

   ku dy(hw var1) {
      if (null != var1.al && this.ai != null && this.ai.get(jd.af) != null) {
         jd var2 = jd.an(1099622714 * var1.aa, -458739222);
         if (null == var2) {
            return null;
         } else {
            on var3 = (on)this.ai.get(var2);
            if (var3 == null) {
               return null;
            } else {
               int var4 = var3.ag(var1.al, -1672918800);
               String[] var5 = new String[var4];
               var3.ax(var1.al, (int[])null, var5);
               int var6 = var5.length * var3.al / 2;
               int var7 = 0;
               String[] var8 = var5;

               for(int var9 = 0; var9 < var8.length; ++var9) {
                  String var10 = var8[var9];
                  int var11 = var3.ao(var10);
                  if (var11 > var7) {
                     var7 = var11;
                  }
               }

               return new ku(var1.al, var7, var6, var2);
            }
         }
      } else {
         return null;
      }
   }

   void ef(int var1, int var2, int var3, int var4) {
      var3 %= 4;
      if (0 == var3) {
         th.ee(-1897887643 * this.ay * var1, this.ay * -1897887643 * (63 - var2), this.ay * -1897887643, var4);
      }

      if (1 == var3) {
         th.ec(this.ay * -1897887643 * var1, (63 - var2) * this.ay * -1897887643, -1897887643 * this.ay, var4);
      }

      if (var3 == 2) {
         th.ee(this.ay * -1897887643 * var1 + this.ay * -1897887643 - 1, this.ay * -1897887643 * (63 - var2), this.ay * -1897887643, var4);
      }

      if (var3 == 3) {
         th.ec(var1 * -1897887643 * this.ay, -1897887643 * this.ay + (63 - var2) * this.ay * -1897887643 - 1, -1897887643 * this.ay, var4);
      }

   }

   void bq(int var1, int var2, int var3) {
      tq var4 = gz.an(-2122501643 * this.ab, 1858063995 * this.aq, this.ay * -1897887643, 2047100321);
      if (var4 != null) {
         if (this.ay * -1205724864 == var3) {
            var4.ay(var1, var2);
         } else {
            var4.bz(var1, var2, var3, var3);
         }

      }
   }
}
