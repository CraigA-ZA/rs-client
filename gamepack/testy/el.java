import accessors.RSUserComparator9;

public class el extends pz implements RSUserComparator9 {
   static final int aq = 1;
   final boolean af;

   static void af(int var0) {
      try {
         if (qh.an != null) {
            if (var0 >= 1658005443) {
               throw new IllegalStateException();
            }
         } else {
            qh.an = new int[65536];
            double var1 = 0.949999988079071;

            for(int var3 = 0; var3 < 65536; ++var3) {
               if (var0 >= 1658005443) {
                  throw new IllegalStateException();
               }

               double var4 = 0.0078125 + (double)(var3 >> 10 & 63) / 64.0;
               double var6 = (double)(var3 >> 7 & 7) / 8.0 + 0.0625;
               double var8 = (double)(var3 & 127) / 128.0;
               double var10 = var8;
               double var12 = var8;
               double var14 = var8;
               if (var6 != 0.0) {
                  if (var0 >= 1658005443) {
                     throw new IllegalStateException();
                  }

                  double var16;
                  if (var8 < 0.5) {
                     if (var0 >= 1658005443) {
                        throw new IllegalStateException();
                     }

                     var16 = var8 * (1.0 + var6);
                  } else {
                     var16 = var6 + var8 - var6 * var8;
                  }

                  double var18 = var8 * 2.0 - var16;
                  double var20 = 0.3333333333333333 + var4;
                  if (var20 > 1.0) {
                     if (var0 >= 1658005443) {
                        throw new IllegalStateException();
                     }

                     --var20;
                  }

                  double var24 = var4 - 0.3333333333333333;
                  if (var24 < 0.0) {
                     if (var0 >= 1658005443) {
                        throw new IllegalStateException();
                     }

                     ++var24;
                  }

                  if (6.0 * var20 < 1.0) {
                     var10 = var18 + var20 * 6.0 * (var16 - var18);
                  } else if (var20 * 2.0 < 1.0) {
                     if (var0 >= 1658005443) {
                        throw new IllegalStateException();
                     }

                     var10 = var16;
                  } else if (3.0 * var20 < 2.0) {
                     if (var0 >= 1658005443) {
                        throw new IllegalStateException();
                     }

                     var10 = var18 + 6.0 * (var16 - var18) * (0.6666666666666666 - var20);
                  } else {
                     var10 = var18;
                  }

                  if (6.0 * var4 < 1.0) {
                     var12 = 6.0 * (var16 - var18) * var4 + var18;
                  } else if (2.0 * var4 < 1.0) {
                     if (var0 >= 1658005443) {
                        throw new IllegalStateException();
                     }

                     var12 = var16;
                  } else if (3.0 * var4 < 2.0) {
                     if (var0 >= 1658005443) {
                        throw new IllegalStateException();
                     }

                     var12 = (var16 - var18) * (0.6666666666666666 - var4) * 6.0 + var18;
                  } else {
                     var12 = var18;
                  }

                  if (var24 * 6.0 < 1.0) {
                     if (var0 >= 1658005443) {
                        return;
                     }

                     var14 = var24 * 6.0 * (var16 - var18) + var18;
                  } else if (var24 * 2.0 < 1.0) {
                     var14 = var16;
                  } else if (3.0 * var24 < 2.0) {
                     if (var0 >= 1658005443) {
                        throw new IllegalStateException();
                     }

                     var14 = 6.0 * (0.6666666666666666 - var24) * (var16 - var18) + var18;
                  } else {
                     var14 = var18;
                  }
               }

               var10 = Math.pow(var10, var1);
               var12 = Math.pow(var12, var1);
               var14 = Math.pow(var14, var1);
               int var27 = (int)(256.0 * var10);
               int var17 = (int)(var12 * 256.0);
               int var28 = (int)(var14 * 256.0);
               int var19 = (var27 << 16) + (var17 << 8) + var28;
               qh.an[var3] = var19 & 16777215;
            }

         }
      } catch (RuntimeException var26) {
         throw db.an(var26, "el.af(" + ')');
      }
   }

   int af(pb var1, pb var2, int var3) {
      try {
         if (client.bw * -453810525 == var1.au * 177258591) {
            if (var3 != 150312401) {
               throw new IllegalStateException();
            }

            if (var2.au * 177258591 == client.bw * -453810525) {
               if (var3 != 150312401) {
                  throw new IllegalStateException();
               }

               int var10000;
               if (this.af) {
                  if (var3 != 150312401) {
                     throw new IllegalStateException();
                  }

                  var10000 = var1.be(473993579).aq(var2.be(473993579), (byte)104);
               } else {
                  var10000 = var2.be(473993579).aq(var1.be(473993579), (byte)119);
               }

               return var10000;
            }
         }

         return this.ao(var1, var2, 641920470);
      } catch (RuntimeException var4) {
         throw db.an(var4, "el.af(" + ')');
      }
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.af((pb)var1, (pb)var2, 150312401);
      } catch (RuntimeException var3) {
         throw db.an(var3, "el.compare(" + ')');
      }
   }

   public int au(Object var1, Object var2) {
      return this.af((pb)var1, (pb)var2, 150312401);
   }

   public int al(Object var1, Object var2) {
      return this.af((pb)var1, (pb)var2, 150312401);
   }

   public el(boolean var1) {
      try {
         super();
         this.af = var1;
      } catch (RuntimeException var2) {
         throw db.an(var2, "el.<init>(" + ')');
      }
   }

   public int aq(Object var1, Object var2) {
      return this.af((pb)var1, (pb)var2, 150312401);
   }

   int an(pb var1, pb var2) {
      if (client.bw * -453810525 == var1.au * 177258591 && var2.au * 177258591 == client.bw * -453810525) {
         return this.af ? var1.be(473993579).aq(var2.be(473993579), (byte)45) : var2.be(473993579).aq(var1.be(473993579), (byte)48);
      } else {
         return this.ao(var1, var2, 641920470);
      }
   }

   int aw(pb var1, pb var2) {
      if (client.bw * -453810525 == var1.au * -2125712629 && var2.au * 972738267 == client.bw * -2130900176) {
         return this.af ? var1.be(473993579).aq(var2.be(473993579), (byte)69) : var2.be(473993579).aq(var1.be(473993579), (byte)75);
      } else {
         return this.ao(var1, var2, 641920470);
      }
   }

   static ec aq(int var0, int var1) {
      try {
         ec var2 = (ec)ht.af(em.au((byte)127), var0, (short)173);
         if (null == var2) {
            if (var1 >= 158134841) {
               throw new IllegalStateException();
            }

            var2 = ec.af;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw db.an(var3, "el.aq(" + ')');
      }
   }

   public int ab(Object var1, Object var2) {
      return this.af((pb)var1, (pb)var2, 150312401);
   }
}
