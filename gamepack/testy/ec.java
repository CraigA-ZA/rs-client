public class ec implements nj {
   static final ec ac = new ec(3, 3, (String)null, 2, 2);
   static final ec af = new ec(0, 0, (String)null, -1, -1);
   static final ec aw = new ec(2, 2, (String)null, 1, 2);
   static final ec an = new ec(1, 1, (String)null, 0, 2);
   static final ec ao = new ec(11, 11, (String)null, 1, 7);
   static final ec ai = new ec(13, 13, (String)null, 3, 7);
   static final ec aq = new ec(6, 6, (String)null, 5, 1);
   static final ec al = new ec(7, 7, (String)null, 6, 3);
   static final ec at = new ec(8, 8, (String)null, 7, 3);
   static final ec aa = new ec(9, 9, (String)null, 8, 3);
   static final ec ay = new ec(10, 10, (String)null, 0, 7);
   static final ec ag = new ec(14, 14, (String)null, 4, 7);
   static final ec ax = new ec(12, 12, (String)null, 2, 7);
   static final int db = 14;
   static final ec av = new ec(16, 16, (String)null, 0, 5);
   static final ec ah = new ec(15, 15, (String)null, 5, 7);
   static final ec ab = new ec(5, 5, (String)null, 4, 1);
   final int ar;
   final int am;
   final int as;
   static final byte by = 127;
   static int gc;
   static final ec au = new ec(4, 4, (String)null, 3, 1);

   public int an() {
      return -1158217209 * this.am;
   }

   int ay() {
      return 1712129874 * this.as;
   }

   int ab(byte var1) {
      try {
         return 1204354247 * this.as;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ec.ab(" + ')');
      }
   }

   public int af(int var1) {
      try {
         return -1158217209 * this.am;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ec.af(" + ')');
      }
   }

   int aa() {
      return 1204354247 * this.as;
   }

   static ec[] at() {
      return new ec[]{af, an, aw, ac, au, ab, aq, al, at, aa, ay, ao, ax, ai, ag, ah, av};
   }

   public int aw() {
      return 1471072985 * this.am;
   }

   ec(int var1, int var2, String var3, int var4, int var5) {
      try {
         super();
         this.ar = 40879509 * var1;
         this.am = 1377749943 * var2;
         this.as = var4 * 1121387767;
      } catch (RuntimeException var6) {
         throw db.an(var6, "ec.<init>(" + ')');
      }
   }

   static final void js(boolean var0, sq var1, byte var2) {
      try {
         client.jv = var0;
         int var3;
         int var5;
         int var6;
         int var7;
         int var8;
         if (!client.jv) {
            if (var2 == 3) {
               throw new IllegalStateException();
            }

            var3 = var1.da(437873455);
            int var4 = var1.da(682891587);
            var5 = var1.cl(-349681540);
            jj.jd = new int[var5][4];

            for(var6 = 0; var6 < var5; ++var6) {
               if (var2 == 3) {
                  throw new IllegalStateException();
               }

               for(var7 = 0; var7 < 4; ++var7) {
                  if (var2 == 3) {
                     throw new IllegalStateException();
                  }

                  jj.jd[var6][var7] = var1.cx(-1144141568);
               }
            }

            kk.jj = new int[var5];
            ri.jm = new int[var5];
            nd.jn = new int[var5];
            au.jf = new byte[var5][];
            cr.jw = new byte[var5][];
            var5 = 0;

            for(var6 = (var4 - 6) / 8; var6 <= (var4 + 6) / 8; ++var6) {
               if (var2 == 3) {
                  throw new IllegalStateException();
               }

               for(var7 = (var3 - 6) / 8; var7 <= (6 + var3) / 8; ++var7) {
                  if (var2 == 3) {
                     throw new IllegalStateException();
                  }

                  var8 = (var6 << 8) + var7;
                  kk.jj[var5] = var8;
                  ri.jm[var5] = nn.fy.cy("m" + var6 + "_" + var7, -1959178612);
                  nd.jn[var5] = nn.fy.cy("l" + var6 + "_" + var7, -1724706302);
                  ++var5;
               }
            }

            cc.jr(var4, var3, true, (byte)101);
         } else {
            var3 = var1.da(1766938486);
            boolean var17 = var1.cm((byte)7) == 1;
            var5 = var1.eo(1729553397);
            var6 = var1.cl(-172193304);
            var1.al((byte)50);

            int var9;
            int var10;
            for(var7 = 0; var7 < 4; ++var7) {
               if (var2 == 3) {
                  throw new IllegalStateException();
               }

               for(var8 = 0; var8 < 13; ++var8) {
                  if (var2 == 3) {
                     throw new IllegalStateException();
                  }

                  for(var9 = 0; var9 < 13; ++var9) {
                     if (var2 == 3) {
                        throw new IllegalStateException();
                     }

                     var10 = var1.at(1, -1971342711);
                     if (var10 == 1) {
                        if (var2 == 3) {
                           throw new IllegalStateException();
                        }

                        client.jh[var7][var8][var9] = var1.at(26, -1270590426);
                     } else {
                        client.jh[var7][var8][var9] = -1;
                     }
                  }
               }
            }

            var1.aa((byte)-69);
            jj.jd = new int[var6][4];

            for(var7 = 0; var7 < var6; ++var7) {
               if (var2 == 3) {
                  return;
               }

               for(var8 = 0; var8 < 4; ++var8) {
                  if (var2 == 3) {
                     throw new IllegalStateException();
                  }

                  jj.jd[var7][var8] = var1.cx(-2059609216);
               }
            }

            kk.jj = new int[var6];
            ri.jm = new int[var6];
            nd.jn = new int[var6];
            au.jf = new byte[var6][];
            cr.jw = new byte[var6][];
            var6 = 0;

            for(var7 = 0; var7 < 4; ++var7) {
               if (var2 == 3) {
                  throw new IllegalStateException();
               }

               for(var8 = 0; var8 < 13; ++var8) {
                  for(var9 = 0; var9 < 13; ++var9) {
                     if (var2 == 3) {
                        return;
                     }

                     var10 = client.jh[var7][var8][var9];
                     if (-1 != var10) {
                        if (var2 == 3) {
                           return;
                        }

                        int var11 = var10 >> 14 & 1023;
                        int var12 = var10 >> 3 & 2047;
                        int var13 = (var11 / 8 << 8) + var12 / 8;

                        int var14;
                        for(var14 = 0; var14 < var6; ++var14) {
                           if (kk.jj[var14] == var13) {
                              if (var2 == 3) {
                                 throw new IllegalStateException();
                              }

                              var13 = -1;
                              break;
                           }
                        }

                        if (var13 != -1) {
                           if (var2 == 3) {
                              throw new IllegalStateException();
                           }

                           kk.jj[var6] = var13;
                           var14 = var13 >> 8 & 255;
                           int var15 = var13 & 255;
                           ri.jm[var6] = nn.fy.cy("m" + var14 + "_" + var15, -956450247);
                           nd.jn[var6] = nn.fy.cy("l" + var14 + "_" + var15, -1184476028);
                           ++var6;
                        }
                     }
                  }
               }
            }

            boolean var10002;
            if (!var17) {
               if (var2 == 3) {
                  throw new IllegalStateException();
               }

               var10002 = true;
            } else {
               var10002 = false;
            }

            cc.jr(var3, var5, var10002, (byte)84);
         }

      } catch (RuntimeException var16) {
         throw db.an(var16, "ec.js(" + ')');
      }
   }

   static final void mu(int var0, int var1, byte var2) {
      try {
         if (!bq.ac(var0, 1376777516)) {
            if (var2 == 63) {
               ;
            }
         } else {
            fy.mq(hn.ap[var0], var1, (byte)119);
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "ec.mu(" + ')');
      }
   }

   int ao() {
      return 1204354247 * this.as;
   }

   int ax() {
      return 1204354247 * this.as;
   }

   static ec ai(int var0) {
      ec var1 = (ec)ht.af(em.au((byte)120), var0, (short)173);
      if (null == var1) {
         var1 = af;
      }

      return var1;
   }

   static ec ag(int var0) {
      ec var1 = (ec)ht.af(em.au((byte)102), var0, (short)173);
      if (null == var1) {
         var1 = af;
      }

      return var1;
   }

   static ec[] al() {
      return new ec[]{af, an, aw, ac, au, ab, aq, al, at, aa, ay, ao, ax, ai, ag, ah, av};
   }

   static void ac(int var0, boolean var1, int var2, boolean var3, byte var4) {
      try {
         if (bx.au != null) {
            if (var4 >= 1) {
               throw new IllegalStateException();
            }

            ai.au(0, bx.au.length - 1, var0, var1, var2, var3, 986853816);
         }

      } catch (RuntimeException var5) {
         throw db.an(var5, "ec.ac(" + ')');
      }
   }

   public static void aj(int var0) {
      try {
         hz.ao.ac();
      } catch (RuntimeException var1) {
         throw db.an(var1, "ec.aj(" + ')');
      }
   }

   public int ac() {
      return -1158217209 * this.am;
   }
}
