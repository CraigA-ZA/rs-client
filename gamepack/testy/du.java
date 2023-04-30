import accessors.RSClientPreferences;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class du implements RSClientPreferences {
   int ay;
   boolean aq;
   static final int ac = 417;
   boolean au;
   boolean ab;
   int ao;
   boolean al;
   double aa;
   static final int an = 10;
   int ai;
   static final int af = 10;
   int ax;
   int ah;
   String ag;
   int at;
   final Map av;
   static final int ch = 30;

   void ao(int var1) {
      try {
         boolean var10001;
         if (!this.al) {
            if (var1 >= 2108671835) {
               throw new IllegalStateException();
            }

            var10001 = true;
         } else {
            var10001 = false;
         }

         this.ay(var10001, 2121132599);
      } catch (RuntimeException var2) {
         throw db.an(var2, "du.ao(" + ')');
      }
   }

   int cw() {
      return this.ay * -461734757;
   }

   void af(boolean var1, int var2) {
      try {
         ;
      } catch (RuntimeException var3) {
         throw db.an(var3, "du.af(" + ')');
      }
   }

   sg an(byte var1) {
      try {
         sg var2 = new sg(417, true);
         var2.bu(10, (byte)1);
         byte var10001;
         if (this.au) {
            if (var1 <= 0) {
               throw new IllegalStateException();
            }

            var10001 = 1;
         } else {
            var10001 = 0;
         }

         var2.bu(var10001, (byte)23);
         var2.bu(this.aq ? 1 : 0, (byte)58);
         var2.bu(this.ah * -1016688579, (byte)60);
         var2.bu(this.av.size(), (byte)94);
         Iterator var3 = this.av.entrySet().iterator();

         while(var3.hasNext()) {
            Map.Entry var4 = (Map.Entry)var3.next();
            var2.ba((Integer)var4.getKey(), -2081835031);
            var2.ba((Integer)var4.getValue(), -2081835031);
         }

         var2.bh(null != this.ag ? this.ag : "", -2068470209);
         var2.bp(this.ab, 614283261);
         var2.bu((int)(this.aa * 100.0), (byte)108);
         var2.bu(-461734757 * this.ay, (byte)39);
         var2.bu(-1738472395 * this.ao, (byte)78);
         var2.bu(this.ax * 1655566467, (byte)86);
         var2.bu(this.ai * -934134045, (byte)75);
         if (this.al) {
            if (var1 <= 0) {
               throw new IllegalStateException();
            }

            var10001 = 1;
         } else {
            var10001 = 0;
         }

         var2.bu(var10001, (byte)36);
         var2.ba(971082243 * this.at, -2081835031);
         return var2;
      } catch (RuntimeException var5) {
         throw db.an(var5, "du.an(" + ')');
      }
   }

   void bl(boolean var1) {
      this.ab = var1;
      dn.ac((byte)-56);
   }

   void au(boolean var1, int var2) {
      try {
         this.au = var1;
         dn.ac((byte)-58);
      } catch (RuntimeException var3) {
         throw db.an(var3, "du.au(" + ')');
      }
   }

   void aq(boolean var1, int var2) {
      try {
         this.ab = var1;
         dn.ac((byte)-14);
      } catch (RuntimeException var3) {
         throw db.an(var3, "du.aq(" + ')');
      }
   }

   boolean al(int var1) {
      try {
         return this.ab;
      } catch (RuntimeException var2) {
         throw db.an(var2, "du.al(" + ')');
      }
   }

   boolean ck() {
      return this.al;
   }

   static du br() {
      sy var0 = null;
      du var1 = new du();

      try {
         var0 = in.an("", client.cc.aq, false, (byte)-50);
         byte[] var2 = new byte[(int)var0.au(2016174619)];

         int var4;
         for(int var3 = 0; var3 < var2.length; var3 += var4) {
            var4 = var0.ab(var2, var3, var2.length - var3, -1591292992);
            if (-1 == var4) {
               throw new IOException();
            }
         }

         var1 = new du(new sg(var2));
      } catch (Exception var6) {
      }

      try {
         if (null != var0) {
            var0.aw((byte)-104);
         }
      } catch (Exception var5) {
      }

      return var1;
   }

   void bf(boolean var1) {
      this.au = var1;
      dn.ac((byte)-103);
   }

   void ca() {
      this.ay(!this.al, 2043952570);
   }

   boolean ax(short var1) {
      try {
         return this.al;
      } catch (RuntimeException var2) {
         throw db.an(var2, "du.ax(" + ')');
      }
   }

   boolean bk(String var1, byte var2) {
      try {
         int var3 = this.bo(var1, -643798559);
         return this.av.containsKey(var3);
      } catch (RuntimeException var4) {
         throw db.an(var4, "du.bk(" + ')');
      }
   }

   int cr() {
      return this.at * 971082243;
   }

   void ah(double var1) {
      try {
         this.aa = var1;
         dn.ac((byte)-97);
      } catch (RuntimeException var3) {
         throw db.an(var3, "du.ah(" + ')');
      }
   }

   double av(int var1) {
      try {
         return this.aa;
      } catch (RuntimeException var2) {
         throw db.an(var2, "du.av(" + ')');
      }
   }

   void ar(int var1, int var2) {
      try {
         this.ay = var1 * -1477768813;
         dn.ac((byte)-31);
      } catch (RuntimeException var3) {
         throw db.an(var3, "du.ar(" + ')');
      }
   }

   int am(int var1) {
      try {
         return this.ay * -461734757;
      } catch (RuntimeException var2) {
         throw db.an(var2, "du.am(" + ')');
      }
   }

   void as(int var1, int var2) {
      try {
         this.ao = var1 * -1956827619;
         dn.ac((byte)-30);
      } catch (RuntimeException var3) {
         throw db.an(var3, "du.as(" + ')');
      }
   }

   int aj(int var1) {
      try {
         return -1738472395 * this.ao;
      } catch (RuntimeException var2) {
         throw db.an(var2, "du.aj(" + ')');
      }
   }

   void ak(int var1, int var2) {
      try {
         this.ax = var1 * -314712533;
         dn.ac((byte)-17);
      } catch (RuntimeException var3) {
         throw db.an(var3, "du.ak(" + ')');
      }
   }

   int az(int var1) {
      try {
         return this.ax * 1655566467;
      } catch (RuntimeException var2) {
         throw db.an(var2, "du.az(" + ')');
      }
   }

   void ad(String var1, int var2) {
      try {
         this.ag = var1;
         dn.ac((byte)-112);
      } catch (RuntimeException var3) {
         throw db.an(var3, "du.ad(" + ')');
      }
   }

   int ag(int var1) {
      try {
         return this.at * 971082243;
      } catch (RuntimeException var2) {
         throw db.an(var2, "du.ag(" + ')');
      }
   }

   void ap(int var1, int var2) {
      try {
         this.ai = -1923156277 * var1;
         dn.ac((byte)-69);
      } catch (RuntimeException var3) {
         throw db.an(var3, "du.ap(" + ')');
      }
   }

   int by(int var1) {
      try {
         return this.ai * -934134045;
      } catch (RuntimeException var2) {
         throw db.an(var2, "du.by(" + ')');
      }
   }

   void bb(int var1, int var2) {
      try {
         this.ah = var1 * 1056868117;
         dn.ac((byte)-23);
      } catch (RuntimeException var3) {
         throw db.an(var3, "du.bb(" + ')');
      }
   }

   int bi(byte var1) {
      try {
         return -1016688579 * this.ah;
      } catch (RuntimeException var2) {
         throw db.an(var2, "du.bi(" + ')');
      }
   }

   static du bn() {
      sy var0 = null;
      du var1 = new du();

      try {
         var0 = in.an("", client.cc.aq, false, (byte)-42);
         byte[] var2 = new byte[(int)var0.au(2048426288)];

         int var4;
         for(int var3 = 0; var3 < var2.length; var3 += var4) {
            var4 = var0.ab(var2, var3, var2.length - var3, -1371253920);
            if (-1 == var4) {
               throw new IOException();
            }
         }

         var1 = new du(new sg(var2));
      } catch (Exception var6) {
      }

      try {
         if (null != var0) {
            var0.aw((byte)-17);
         }
      } catch (Exception var5) {
      }

      return var1;
   }

   String ae(int var1) {
      try {
         return this.ag;
      } catch (RuntimeException var2) {
         throw db.an(var2, "du.ae(" + ')');
      }
   }

   int bx(String var1, byte var2) {
      try {
         int var3 = this.bo(var1, 1030951960);
         return !this.av.containsKey(var3) ? 0 : (Integer)this.av.get(var3);
      } catch (RuntimeException var4) {
         throw db.an(var4, "du.bx(" + ')');
      }
   }

   int de() {
      return -1016688579 * this.ah;
   }

   void ct(int var1) {
      this.ao = var1 * -1956827619;
      dn.ac((byte)-98);
   }

   void bm(boolean var1) {
   }

   void bd(boolean var1) {
   }

   sg bt() {
      sg var1 = new sg(417, true);
      var1.bu(10, (byte)6);
      var1.bu(this.au ? 1 : 0, (byte)53);
      var1.bu(this.aq ? 1 : 0, (byte)120);
      var1.bu(this.ah * -1016688579, (byte)104);
      var1.bu(this.av.size(), (byte)94);
      Iterator var2 = this.av.entrySet().iterator();

      while(var2.hasNext()) {
         Map.Entry var3 = (Map.Entry)var2.next();
         var1.ba((Integer)var3.getKey(), -2081835031);
         var1.ba((Integer)var3.getValue(), -2081835031);
      }

      var1.bh(null != this.ag ? this.ag : "", -2061376517);
      var1.bp(this.ab, 614283261);
      var1.bu((int)(this.aa * 100.0), (byte)18);
      var1.bu(-461734757 * this.ay, (byte)79);
      var1.bu(-1738472395 * this.ao, (byte)11);
      var1.bu(this.ax * 1655566467, (byte)21);
      var1.bu(this.ai * -934134045, (byte)111);
      var1.bu(this.al ? 1 : 0, (byte)53);
      var1.ba(971082243 * this.at, -2081835031);
      return var1;
   }

   void bz(boolean var1) {
   }

   int cg() {
      return this.at * 1723943518;
   }

   static du bs() {
      sy var0 = null;
      du var1 = new du();

      try {
         var0 = in.an("", client.cc.aq, false, (byte)-28);
         byte[] var2 = new byte[(int)var0.au(2080986638)];

         int var4;
         for(int var3 = 0; var3 < var2.length; var3 += var4) {
            var4 = var0.ab(var2, var3, var2.length - var3, -2112960522);
            if (-1 == var4) {
               throw new IOException();
            }
         }

         var1 = new du(new sg(var2));
      } catch (Exception var6) {
      }

      try {
         if (null != var0) {
            var0.aw((byte)-18);
         }
      } catch (Exception var5) {
      }

      return var1;
   }

   void ay(boolean var1, int var2) {
      try {
         this.al = var1;
         dn.ac((byte)0);
      } catch (RuntimeException var3) {
         throw db.an(var3, "du.ay(" + ')');
      }
   }

   static void bg() {
      sy var0 = null;

      try {
         var0 = in.an("", client.cc.aq, true, (byte)-44);
         sg var1 = aj.vb.an((byte)93);
         var0.an(var1.al, 0, var1.at * 1845611723, 185047612);
      } catch (Exception var3) {
      }

      try {
         if (null != var0) {
            var0.ac(true, (byte)10);
         }
      } catch (Exception var2) {
      }

   }

   static void bu() {
      sy var0 = null;

      try {
         var0 = in.an("", client.cc.aq, true, (byte)-76);
         sg var1 = aj.vb.an((byte)73);
         var0.an(var1.al, 0, var1.at * -1633313603, 185047612);
      } catch (Exception var3) {
      }

      try {
         if (null != var0) {
            var0.ac(true, (byte)10);
         }
      } catch (Exception var2) {
      }

   }

   void ch(int var1) {
      this.ao = var1 * -1956827619;
      dn.ac((byte)-42);
   }

   du() {
      try {
         super();
         this.ab = false;
         this.al = false;
         this.aa = 0.8;
         this.ay = 1301921773;
         this.ao = 590995555;
         this.ax = -1313786027;
         this.ai = 1923156277;
         this.ag = null;
         this.ah = 1056868117;
         this.av = new LinkedHashMap();
         this.af(true, -299950185);
      } catch (RuntimeException var1) {
         throw db.an(var1, "du.<init>(" + ')');
      }
   }

   int bo(String var1, int var2) {
      try {
         return de.al(var1.toLowerCase(), (byte)59);
      } catch (RuntimeException var3) {
         throw db.an(var3, "du.bo(" + ')');
      }
   }

   void be(String var1, int var2, byte var3) {
      try {
         int var4 = this.bo(var1, -1970967103);
         if (this.av.size() >= 10 && !this.av.containsKey(var4)) {
            if (var3 <= 5) {
               return;
            }

            Iterator var5 = this.av.entrySet().iterator();
            var5.next();
            var5.remove();
         }

         this.av.put(var4, var2);
         dn.ac((byte)-13);
      } catch (RuntimeException var6) {
         throw db.an(var6, "du.be(" + ')');
      }
   }

   String di() {
      return this.ag;
   }

   void bp(boolean var1) {
      this.ab = var1;
      dn.ac((byte)-36);
   }

   void bc(boolean var1) {
      this.ab = var1;
      dn.ac((byte)-123);
   }

   boolean bh() {
      return this.ab;
   }

   boolean bw() {
      return this.ab;
   }

   void ce(boolean var1) {
      this.aq = var1;
      dn.ac((byte)-106);
   }

   boolean ci() {
      return this.aq;
   }

   void cs(boolean var1) {
      this.al = var1;
      dn.ac((byte)-45);
   }

   void cc(boolean var1) {
      this.al = var1;
      dn.ac((byte)-91);
   }

   void cn(boolean var1) {
      this.al = var1;
      dn.ac((byte)-94);
   }

   void bq(boolean var1) {
      this.au = var1;
      dn.ac((byte)-79);
   }

   void cu() {
      this.ay(!this.al, 1961100201);
   }

   static final void aq(sq var0, int var1, dv var2, int var3, byte var4) {
      try {
         byte var5 = iu.af.au;
         int var6;
         if (0 != (var3 & 2)) {
            if (var4 >= 0) {
               throw new IllegalStateException();
            }

            var6 = var0.db((byte)-23);
            byte[] var7 = new byte[var6];
            sg var8 = new sg(var7);
            var0.ct(var7, 0, var6, -1570744551);
            ds.au[var1] = var8;
            var2.af(var8, -1943187792);
         }

         int var15;
         if (0 != (var3 & 16)) {
            var6 = var0.ep(-523126268);
            if (65535 == var6) {
               if (var4 >= 0) {
                  throw new IllegalStateException();
               }

               var6 = -1;
            }

            var15 = var0.df(-2032922264);
            ig.iq(var2, var6, var15, -1059867527);
         }

         if (0 != (var3 & 4)) {
            if (var4 >= 0) {
               throw new IllegalStateException();
            }

            var2.cr = var0.eo(-1155912512) * 1052277865;
            var2.cr += (var0.db((byte)-110) << 16) * 1052277865;
            var6 = 16777215;
            if (var2.cr * 1005900761 == var6) {
               if (var4 >= 0) {
                  return;
               }

               var2.cr = -1052277865;
            }
         }

         if ((var3 & 128) != 0) {
            if (var4 >= 0) {
               throw new IllegalStateException();
            }

            var2.bw = var0.cw((byte)0);
            if (var2.bw.charAt(0) == '~') {
               if (var4 >= 0) {
                  throw new IllegalStateException();
               }

               var2.bw = var2.bw.substring(1);
               es.an(2, var2.af.af(-710264960), var2.bw, -397121414);
            } else if (var2 == lq.mi) {
               es.an(2, var2.af.af(-710264960), var2.bw, -397121414);
            }

            var2.ce = false;
            var2.cc = 0;
            var2.cn = 0;
            var2.cs = -739348018;
         }

         int var9;
         int var10;
         int var16;
         if ((var3 & 64) != 0) {
            if (var4 >= 0) {
               throw new IllegalStateException();
            }

            var6 = var0.cm((byte)7);
            int var11;
            int var12;
            if (var6 > 0) {
               if (var4 >= 0) {
                  throw new IllegalStateException();
               }

               for(var15 = 0; var15 < var6; ++var15) {
                  if (var4 >= 0) {
                     throw new IllegalStateException();
                  }

                  var9 = -1;
                  var10 = -1;
                  var11 = -1;
                  var16 = var0.cd(-1669577471);
                  if (var16 == 32767) {
                     if (var4 >= 0) {
                        throw new IllegalStateException();
                     }

                     var16 = var0.cd(-664197509);
                     var10 = var0.cd(-1143699491);
                     var9 = var0.cd(-1579056340);
                     var11 = var0.cd(-683077650);
                  } else if (var16 != 32766) {
                     if (var4 >= 0) {
                        throw new IllegalStateException();
                     }

                     var10 = var0.cd(-1208096133);
                  } else {
                     var16 = -1;
                  }

                  var12 = var0.cd(-1626403646);
                  var2.co(var16, var10, var9, var11, client.ep * -1886224337, var12, 1919870398);
               }
            }

            var15 = var0.db((byte)-19);
            if (var15 > 0) {
               if (var4 >= 0) {
                  throw new IllegalStateException();
               }

               for(var16 = 0; var16 < var15; ++var16) {
                  if (var4 >= 0) {
                     throw new IllegalStateException();
                  }

                  var9 = var0.cd(-1008172524);
                  var10 = var0.cd(-1007608623);
                  if (32767 != var10) {
                     if (var4 >= 0) {
                        throw new IllegalStateException();
                     }

                     var11 = var0.cd(-381851079);
                     var12 = var0.dq(-2070899692);
                     int var10000;
                     if (var10 > 0) {
                        if (var4 >= 0) {
                           throw new IllegalStateException();
                        }

                        var10000 = var0.df(-2015179409);
                     } else {
                        var10000 = var12;
                     }

                     int var13 = var10000;
                     var2.cz(var9, client.ep * -1886224337, var10, var11, var12, var13, (byte)108);
                  } else {
                     var2.cw(var9, 1269115179);
                  }
               }
            }
         }

         if ((var3 & 1) != 0) {
            if (var4 >= 0) {
               throw new IllegalStateException();
            }

            var2.cx = var0.cl(-2142773761) * -1409690365;
            if (0 == var2.dn * 1134756167) {
               var2.dd = var2.cx * 948720829;
               var2.cd(-2133185468);
            }
         }

         if (0 != (var3 & 32)) {
            if (var4 >= 0) {
               throw new IllegalStateException();
            }

            var6 = var0.ep(-523126268);
            nz var17 = (nz)ht.af(mr.au((byte)-26), var0.cm((byte)7), (short)173);
            boolean var26;
            if (var0.df(-1988197335) == 1) {
               if (var4 >= 0) {
                  throw new IllegalStateException();
               }

               var26 = true;
            } else {
               var26 = false;
            }

            boolean var21 = var26;
            var9 = var0.db((byte)-113);
            var10 = -1633313603 * var0.at;
            if (var2.af != null) {
               if (var4 >= 0) {
                  return;
               }

               if (null != var2.aw) {
                  if (var4 >= 0) {
                     throw new IllegalStateException();
                  }

                  boolean var23 = false;
                  if (var17.aj && cl.vt.aq(var2.af, 448491204)) {
                     var23 = true;
                  }

                  if (!var23) {
                     if (var4 >= 0) {
                        throw new IllegalStateException();
                     }

                     if (client.ma * 43311027 == 0) {
                        if (var4 >= 0) {
                           throw new IllegalStateException();
                        }

                        if (!var2.az) {
                           if (var4 >= 0) {
                              throw new IllegalStateException();
                           }

                           boolean var10001;
                           String var24;
                           label388: {
                              ds.ag.at = 0;
                              var0.ct(ds.ag.al, 0, var9, -1570744551);
                              ds.ag.at = 0;
                              var24 = ou.ah(er.ao(jc.aw(ds.ag, (byte)22), (byte)-121));
                              var2.bw = var24.trim();
                              var2.cc = 1732198649 * (var6 >> 8);
                              var2.cn = 1666666057 * (var6 & 255);
                              var2.cs = -739348018;
                              var2.ce = var21;
                              if (lq.mi != var2) {
                                 if (var4 >= 0) {
                                    throw new IllegalStateException();
                                 }

                                 if (var17.aj && "" != client.ss) {
                                    if (var4 >= 0) {
                                       throw new IllegalStateException();
                                    }

                                    if (var24.toLowerCase().indexOf(client.ss) == -1) {
                                       if (var4 >= 0) {
                                          throw new IllegalStateException();
                                       }

                                       var10001 = true;
                                       break label388;
                                    }
                                 }
                              }

                              var10001 = false;
                           }

                           var2.ci = var10001;
                           byte var25;
                           byte var27;
                           if (var17.as) {
                              if (var4 >= 0) {
                                 throw new IllegalStateException();
                              }

                              if (var21) {
                                 if (var4 >= 0) {
                                    throw new IllegalStateException();
                                 }

                                 var27 = 91;
                              } else {
                                 var27 = 1;
                              }

                              var25 = var27;
                           } else {
                              if (var21) {
                                 if (var4 >= 0) {
                                    throw new IllegalStateException();
                                 }

                                 var27 = 90;
                              } else {
                                 var27 = 2;
                              }

                              var25 = var27;
                           }

                           if (-1 != var17.am * 2138745227) {
                              if (var4 >= 0) {
                                 throw new IllegalStateException();
                              }

                              es.an(var25, ns.af(2138745227 * var17.am, 1707899837) + var2.af.af(-710264960), var24, -397121414);
                           } else {
                              es.an(var25, var2.af.af(-710264960), var24, -397121414);
                           }
                        }
                     }
                  }
               }
            }

            var0.at = -1516355947 * (var10 + var9);
         }

         if ((var3 & 4096) != 0) {
            if (var4 >= 0) {
               throw new IllegalStateException();
            }

            var6 = var0.cl(50551235);
            var15 = var0.er(363073604);
            var2.cj(0, var6, var15 >> 16, var15 & '\uffff', 461666962);
         }

         if ((var3 & 1024) != 0) {
            if (var4 >= 0) {
               throw new IllegalStateException();
            }

            var2.di = var0.cf(435772489) * -278393391;
            var2.dl = var0.dx(-1768453502) * -1448856093;
            var2.dr = var0.dj(157402377) * 242410523;
            var2.dk = var0.dj(-390113501) * 2106434927;
            var2.dt = (var0.eo(-1613227680) + client.ep * -1886224337) * -608537751;
            var2.dv = (var0.cl(-716459504) + -1886224337 * client.ep) * -2100738849;
            var2.dz = var0.eo(-794014581) * -698990457;
            if (var2.bi) {
               if (var4 >= 0) {
                  return;
               }

               var2.di += -1987308883 * var2.be;
               var2.dl += 198846147 * var2.bk;
               var2.dr += 580103439 * var2.be;
               var2.dk += var2.bk * 999446991;
               var2.dn = 0;
            } else {
               var2.di += var2.dy[0] * -278393391;
               var2.dl += -1448856093 * var2.ds[0];
               var2.dr += var2.dy[0] * 242410523;
               var2.dk += var2.ds[0] * 2106434927;
               var2.dn = 400971895;
            }

            var2.eo = 0;
         }

         if (0 != (var3 & 512)) {
            if (var4 >= 0) {
               throw new IllegalStateException();
            }

            iu[] var18 = ds.ac;
            iu[] var22 = new iu[]{iu.aw, iu.af, iu.an, iu.ac};
            var18[var1] = (iu)ht.af(var22, var0.dd(1036326896), (short)173);
         }

         if (0 != (var3 & 2048)) {
            if (var4 >= 0) {
               return;
            }

            var5 = var0.cf(435772489);
         }

         if ((var3 & 8192) != 0) {
            for(var6 = 0; var6 < 3; ++var6) {
               if (var4 >= 0) {
                  throw new IllegalStateException();
               }

               var2.aq[var6] = var0.cw((byte)0);
            }
         }

         if ((var3 & '耀') != 0) {
            if (var4 >= 0) {
               throw new IllegalStateException();
            }

            var2.dh = (-1886224337 * client.ep + var0.eo(325307348)) * -887211183;
            var2.dp = (-1886224337 * client.ep + var0.cl(568171869)) * -368061749;
            var2.du = var0.cf(435772489);
            var2.db = var0.cf(435772489);
            var2.df = var0.dd(-275895724);
            var2.dq = (byte)var0.df(-2139502669);
         }

         if ((var3 & 65536) != 0) {
            if (var4 >= 0) {
               throw new IllegalStateException();
            }

            var6 = var0.dq(-2070899692);

            for(var15 = 0; var15 < var6; ++var15) {
               var16 = var0.df(-2041663917);
               var9 = var0.eo(-1332583140);
               var10 = var0.cx(-1592627762);
               var2.cj(var16, var9, var10 >> 16, var10 & '\uffff', 2051903393);
            }
         }

         if (var2.bi) {
            if (var4 >= 0) {
               return;
            }

            if (127 == var5) {
               var2.ar(2039538205 * var2.be, var2.bk * 1584800161, -1637184439);
            } else {
               iu var19;
               if (var5 != iu.af.au) {
                  if (var4 >= 0) {
                     return;
                  }

                  iu[] var20 = new iu[]{iu.aw, iu.af, iu.an, iu.ac};
                  var19 = (iu)ht.af(var20, var5, (short)173);
               } else {
                  var19 = ds.ac[var1];
               }

               var2.av(2039538205 * var2.be, var2.bk * 1584800161, var19, (byte)-57);
            }
         }

      } catch (RuntimeException var14) {
         throw db.an(var14, "du.aq(" + ')');
      }
   }

   void cq(int var1) {
      this.at = -1873612629 * var1;
      dn.ac((byte)-40);
   }

   void cm(int var1) {
      this.at = -1873612629 * var1;
      dn.ac((byte)-25);
   }

   void cf(int var1) {
      this.at = 605656486 * var1;
      dn.ac((byte)-101);
   }

   int cl() {
      return this.at * -997285237;
   }

   boolean ba() {
      return this.au;
   }

   void dc(String var1) {
      this.ag = var1;
      dn.ac((byte)-124);
   }

   int cz() {
      return this.ay * -461734757;
   }

   void cx(double var1) {
      this.aa = var1;
      dn.ac((byte)-54);
   }

   void cv(double var1) {
      this.aa = var1;
      dn.ac((byte)-30);
   }

   void cb(int var1) {
      this.ay = var1 * -1764917110;
      dn.ac((byte)-50);
   }

   boolean du(String var1) {
      int var2 = this.bo(var1, -1426913581);
      return this.av.containsKey(var2);
   }

   boolean ab(int var1) {
      try {
         return this.au;
      } catch (RuntimeException var2) {
         throw db.an(var2, "du.ab(" + ')');
      }
   }

   int dx(String var1) {
      return de.al(var1.toLowerCase(), (byte)119);
   }

   int cj() {
      return this.ay * -461734757;
   }

   int co() {
      return this.ay * -461734757;
   }

   du(sg var1) {
      try {
         super();
         this.ab = false;
         this.al = false;
         this.aa = 0.8;
         this.ay = 1301921773;
         this.ao = 590995555;
         this.ax = -1313786027;
         this.ai = 1923156277;
         this.ag = null;
         this.ah = 1056868117;
         this.av = new LinkedHashMap();
         if (var1 != null && var1.al != null) {
            int var2 = var1.cm((byte)7);
            if (var2 >= 0 && var2 <= 10) {
               if (var1.cm((byte)7) == 1) {
                  this.au = true;
               }

               if (var2 > 1) {
                  this.aq = var1.cm((byte)7) == 1;
               }

               if (var2 > 3) {
                  this.ah = var1.cm((byte)7) * 1056868117;
               }

               if (var2 > 2) {
                  int var3 = var1.cm((byte)7);

                  for(int var4 = 0; var4 < var3; ++var4) {
                     int var5 = var1.cx(-1694820613);
                     int var6 = var1.cx(-1182146282);
                     this.av.put(var5, var6);
                  }
               }

               if (var2 > 4) {
                  this.ag = var1.cz((byte)-85);
               }

               if (var2 > 5) {
                  this.ab = var1.co(1404535452);
               }

               if (var2 > 6) {
                  this.aa = (double)var1.cm((byte)7) / 100.0;
                  this.ay = var1.cm((byte)7) * -1477768813;
                  this.ao = var1.cm((byte)7) * -1956827619;
                  this.ax = var1.cm((byte)7) * -314712533;
               }

               if (var2 > 7) {
                  this.ai = var1.cm((byte)7) * -1923156277;
               }

               if (var2 > 8) {
                  this.al = var1.cm((byte)7) == 1;
               }

               if (var2 > 9) {
                  this.at = var1.cx(-1976075161) * -1873612629;
               }
            } else {
               this.af(true, -1535554164);
            }
         } else {
            this.af(true, -2017592644);
         }

      } catch (RuntimeException var7) {
         throw db.an(var7, "du.<init>(" + ')');
      }
   }

   void cp(int var1) {
      this.ax = var1 * -314712533;
      dn.ac((byte)-30);
   }

   int cd() {
      return this.ax * 1655566467;
   }

   sg bj() {
      sg var1 = new sg(417, true);
      var1.bu(10, (byte)11);
      var1.bu(this.au ? 1 : 0, (byte)56);
      var1.bu(this.aq ? 1 : 0, (byte)47);
      var1.bu(this.ah * 769885273, (byte)49);
      var1.bu(this.av.size(), (byte)29);
      Iterator var2 = this.av.entrySet().iterator();

      while(var2.hasNext()) {
         Map.Entry var3 = (Map.Entry)var2.next();
         var1.ba((Integer)var3.getKey(), -2081835031);
         var1.ba((Integer)var3.getValue(), -2081835031);
      }

      var1.bh(null != this.ag ? this.ag : "", -1965803098);
      var1.bp(this.ab, 614283261);
      var1.bu((int)(this.aa * 100.0), (byte)118);
      var1.bu(-461734757 * this.ay, (byte)75);
      var1.bu(1767656285 * this.ao, (byte)61);
      var1.bu(this.ax * -1669266377, (byte)67);
      var1.bu(this.ai * 1485272108, (byte)16);
      var1.bu(this.al ? 1 : 0, (byte)1);
      var1.ba(1013117136 * this.at, -2081835031);
      return var1;
   }

   int dw() {
      return this.ax * 1655566467;
   }

   boolean bv() {
      return this.au;
   }

   String do() {
      return this.ag;
   }

   void cy(double var1) {
      this.aa = var1;
      dn.ac((byte)-96);
   }

   void dr(int var1) {
      this.ai = -1923156277 * var1;
      dn.ac((byte)-105);
   }

   void dl(int var1) {
      this.ai = -1923156277 * var1;
      dn.ac((byte)-55);
   }

   int dk() {
      return this.ai * 1383379929;
   }

   void dt(int var1) {
      this.ah = var1 * 1056868117;
      dn.ac((byte)-77);
   }

   void dv(int var1) {
      this.ah = var1 * 1056868117;
      dn.ac((byte)-84);
   }

   void dz(int var1) {
      this.ah = var1 * 1627252785;
      dn.ac((byte)-72);
   }

   int dg() {
      return -1016688579 * this.ah;
   }

   void at(boolean var1, int var2) {
      try {
         this.aq = var1;
         dn.ac((byte)-1);
      } catch (RuntimeException var3) {
         throw db.an(var3, "du.at(" + ')');
      }
   }

   boolean dh(String var1) {
      int var2 = this.bo(var1, 331892263);
      return this.av.containsKey(var2);
   }

   boolean dp(String var1) {
      int var2 = this.bo(var1, 271816125);
      return this.av.containsKey(var2);
   }

   boolean aa(int var1) {
      try {
         return this.aq;
      } catch (RuntimeException var2) {
         throw db.an(var2, "du.aa(" + ')');
      }
   }

   boolean db(String var1) {
      int var2 = this.bo(var1, -2018990347);
      return this.av.containsKey(var2);
   }

   boolean df(String var1) {
      int var2 = this.bo(var1, -566477662);
      return this.av.containsKey(var2);
   }

   int dq(String var1) {
      int var2 = this.bo(var1, -294257946);
      return !this.av.containsKey(var2) ? 0 : (Integer)this.av.get(var2);
   }

   int dd(String var1) {
      int var2 = this.bo(var1, 925234748);
      return !this.av.containsKey(var2) ? 0 : (Integer)this.av.get(var2);
   }

   int dj(String var1) {
      int var2 = this.bo(var1, -250336017);
      return !this.av.containsKey(var2) ? 0 : (Integer)this.av.get(var2);
   }

   void ai(int var1, byte var2) {
      try {
         this.at = -1873612629 * var1;
         dn.ac((byte)-107);
      } catch (RuntimeException var3) {
         throw db.an(var3, "du.ai(" + ')');
      }
   }

   int dn(String var1) {
      return de.al(var1.toLowerCase(), (byte)114);
   }

   int dy(String var1) {
      return de.al(var1.toLowerCase(), (byte)98);
   }

   int ds(String var1) {
      return de.al(var1.toLowerCase(), (byte)12);
   }

   int da(String var1) {
      return de.al(var1.toLowerCase(), (byte)19);
   }

   int dm() {
      return this.ax * 1655566467;
   }
}
