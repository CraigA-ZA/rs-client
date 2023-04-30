import accessors.RSMusicPatchNode;

public class lq extends rp implements RSMusicPatchNode {
   int ah;
   int au;
   br aw;
   lp ac;
   static dv mi;
   int ab;
   int aq;
   int al;
   int ar;
   int aa;
   int ay;
   int ao;
   int ax;
   int as;
   bl am;
   int ag;
   int av;
   lz an;
   int af;
   int ai;
   int ak;
   int at;

   void an() {
      this.an = null;
      this.aw = null;
      this.ac = null;
      this.am = null;
   }

   lq() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw db.an(var1, "lq.<init>(" + ')');
      }
   }

   public static boolean aw(int var0, int var1) {
      try {
         boolean var10000;
         if (0 != (var0 >> 20 & 1)) {
            if (var1 <= -1808401495) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw db.an(var2, "lq.aw(" + ')');
      }
   }

   static String nu(mq var0, int var1) {
      try {
         if (hc.af(ap.ng(var0, 1141757659), 1774308606) == 0) {
            return null;
         } else {
            if (var0.fe != null) {
               if (var1 != 603369429) {
                  throw new IllegalStateException();
               }

               if (var0.fe.trim().length() != 0) {
                  return var0.fe;
               }

               if (var1 != 603369429) {
                  throw new IllegalStateException();
               }
            }

            return null;
         }
      } catch (RuntimeException var2) {
         throw db.an(var2, "lq.nu(" + ')');
      }
   }

   public static float af(int var0, short var1) {
      try {
         var0 &= 16383;
         return (float)((double)((float)var0 / 16384.0F) * 6.283185307179586);
      } catch (RuntimeException var2) {
         throw db.an(var2, "lq.af(" + ')');
      }
   }

   void af(byte var1) {
      try {
         this.an = null;
         this.aw = null;
         this.ac = null;
         this.am = null;
      } catch (RuntimeException var2) {
         throw db.an(var2, "lq.af(" + ')');
      }
   }

   static final void iw(mq var0, int var1, int var2, byte var3) {
      try {
         if (client.tp * 1383336963 != 0 && 1383336963 * client.tp != 3) {
            if (var3 >= 2) {
               throw new IllegalStateException();
            }
         } else {
            if (!client.nt) {
               if (var3 >= 2) {
                  throw new IllegalStateException();
               }

               if (bd.ar * -1222491879 != 1) {
                  if (var3 >= 2) {
                     throw new IllegalStateException();
                  }

                  if (su.ev) {
                     return;
                  }

                  if (var3 >= 2) {
                     throw new IllegalStateException();
                  }

                  if (bd.ar * -1222491879 != 4) {
                     return;
                  }

                  if (var3 >= 2) {
                     return;
                  }
               }

               ll var4 = var0.ah(true, (byte)29);
               if (null == var4) {
                  if (var3 >= 2) {
                     return;
                  }

                  return;
               }

               int var5 = 2020601481 * bd.am - var1;
               int var6 = bd.as * 1163896205 - var2;
               if (var4.af(var5, var6, -746690647)) {
                  if (var3 >= 2) {
                     throw new IllegalStateException();
                  }

                  var5 -= var4.af * 1484188043 / 2;
                  var6 -= var4.an * 939947663 / 2;
                  int var7 = client.kf * 704283033 & 2047;
                  int var8 = in.ac[var7];
                  int var9 = in.au[var7];
                  int var10 = var5 * var9 + var6 * var8 >> 11;
                  int var11 = var6 * var9 - var5 * var8 >> 11;
                  int var12 = 1144428983 * mi.bx + var10 >> 7;
                  int var13 = mi.bo * -411750205 - var11 >> 7;
                  lg var14 = mi.an(lv.af, client.in.au, (short)-28039);
                  var14.aw.bu(18, (byte)72);
                  var14.aw.ds(jj.jc * 827352769 + var13, -1006440190);
                  var14.aw.dn(var12 + -1232093375 * jm.ib, (byte)124);
                  sq var10000 = var14.aw;
                  int var10001;
                  if (client.sh.av(82, -1277851661)) {
                     if (var3 >= 2) {
                        throw new IllegalStateException();
                     }

                     var10001 = client.sh.av(81, -1755032313) ? 2 : 1;
                  } else {
                     var10001 = 0;
                  }

                  var10000.du(var10001, -988290643);
                  var14.aw.bu(var5, (byte)100);
                  var14.aw.bu(var6, (byte)12);
                  var14.aw.bf(704283033 * client.kf, (byte)48);
                  var14.aw.bu(57, (byte)48);
                  var14.aw.bu(0, (byte)19);
                  var14.aw.bu(0, (byte)1);
                  var14.aw.bu(89, (byte)23);
                  var14.aw.bf(1144428983 * mi.bx, (byte)-99);
                  var14.aw.bf(mi.bo * -411750205, (byte)3);
                  var14.aw.bu(63, (byte)64);
                  client.in.aw(var14, 414135591);
                  client.te = var12 * -1970850269;
                  client.th = 875414437 * var13;
               }
            }

         }
      } catch (RuntimeException var15) {
         throw db.an(var15, "lq.iw(" + ')');
      }
   }
}
