import accessors.RSHeadbarUpdate;

public class dh extends rp implements RSHeadbarUpdate {
   static final int be = 19136995;
   static final float us = 325.949F;
   int aw;
   int an;
   int af;
   int ac;
   public static final int ab = 5;
   static final int ag = 1;

   void an(int var1, int var2, int var3, int var4) {
      this.af = var1 * -1996034979;
      this.an = 329974251 * var2;
      this.aw = var3 * -1727836311;
      this.ac = 1487825381 * var4;
   }

   void af(int var1, int var2, int var3, int var4, int var5) {
      try {
         this.af = var1 * -1996034979;
         this.an = 329974251 * var2;
         this.aw = var3 * -1727836311;
         this.ac = 1487825381 * var4;
      } catch (RuntimeException var6) {
         throw db.an(var6, "dh.af(" + ')');
      }
   }

   void aw(int var1, int var2, int var3, int var4) {
      this.af = var1 * -1996034979;
      this.an = 329974251 * var2;
      this.aw = var3 * 99123202;
      this.ac = 1621352969 * var4;
   }

   dh(int var1, int var2, int var3, int var4) {
      try {
         super();
         this.af = var1 * -1996034979;
         this.an = 329974251 * var2;
         this.aw = var3 * -1727836311;
         this.ac = var4 * 1487825381;
      } catch (RuntimeException var5) {
         throw db.an(var5, "dh.<init>(" + ')');
      }
   }

   void ac(int var1, int var2, int var3, int var4) {
      this.af = var1 * -1996034979;
      this.an = 329974251 * var2;
      this.aw = var3 * -1727836311;
      this.ac = 1487825381 * var4;
   }

   void au(int var1, int var2, int var3, int var4) {
      this.af = var1 * -1996034979;
      this.an = 329974251 * var2;
      this.aw = var3 * -1727836311;
      this.ac = 1487825381 * var4;
   }

   public static void af(dr var0, byte var1) {
      try {
         nz.an(var0, 500000, 475000, 637714632);
      } catch (RuntimeException var2) {
         throw db.an(var2, "dh.af(" + ')');
      }
   }

   public static hz af(int var0, byte var1) {
      try {
         hz var2 = (hz)hz.aa.af((long)var0);
         if (null != var2) {
            if (var1 <= 7) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = nc.ab.bh(10, var0, (byte)-19);
            var2 = new hz();
            var2.ai = var0 * 526060183;
            if (null != var3) {
               if (var1 <= 7) {
                  throw new IllegalStateException();
               }

               var2.aw(new sg(var3), (byte)-17);
            }

            var2.an(-2125749046);
            if (-1 != -1375068187 * var2.ci) {
               if (var1 <= 7) {
                  throw new IllegalStateException();
               }

               var2.au(af(var2.ci * -1375068187, (byte)24), af(1399852547 * var2.ce, (byte)64), -1546193991);
            }

            if (var2.cg * -1276549997 != -1) {
               if (var1 <= 7) {
                  throw new IllegalStateException();
               }

               var2.ab(af(var2.cg * -1276549997, (byte)26), af(-1273418661 * var2.cl, (byte)123), 797932055);
            }

            if (var2.cy * 119859889 != -1) {
               if (var1 <= 7) {
                  throw new IllegalStateException();
               }

               var2.aq(af(var2.cy * 119859889, (byte)93), af(-172219939 * var2.cr, (byte)9), -670361185);
            }

            if (!gm.al) {
               if (var1 <= 7) {
                  throw new IllegalStateException();
               }

               if (var2.bz) {
                  if (var1 <= 7) {
                     throw new IllegalStateException();
                  }

                  var2.ah = mk.af;
                  var2.cf = false;

                  int var4;
                  for(var4 = 0; var4 < var2.bm.length; ++var4) {
                     if (var1 <= 7) {
                        throw new IllegalStateException();
                     }

                     var2.bm[var4] = null;
                  }

                  for(var4 = 0; var4 < var2.bd.length; ++var4) {
                     if (var4 != 4) {
                        if (var1 <= 7) {
                           throw new IllegalStateException();
                        }

                        var2.bd[var4] = null;
                     }
                  }

                  var2.bj = 1290787642;
                  var2.ck = 0;
                  if (var2.cm != null) {
                     if (var1 <= 7) {
                        throw new IllegalStateException();
                     }

                     boolean var8 = false;

                     for(rp var5 = var2.cm.ac(); null != var5; var5 = var2.cm.au()) {
                        if (var1 <= 7) {
                           throw new IllegalStateException();
                        }

                        ho var6 = bz.an((int)var5.hr, 367699395);
                        if (var6.ab) {
                           if (var1 <= 7) {
                              throw new IllegalStateException();
                           }

                           var5.ga();
                        } else {
                           var8 = true;
                        }
                     }

                     if (!var8) {
                        if (var1 <= 7) {
                           throw new IllegalStateException();
                        }

                        var2.cm = null;
                     }
                  }
               }
            }

            hz.aa.aw(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var7) {
         throw db.an(var7, "dh.af(" + ')');
      }
   }
}
