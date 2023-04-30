import accessors.RSUserComparator7;

public class eu extends pz implements RSUserComparator7 {
   public static final int ac = 5;
   static final int as = 1;
   final boolean af;
   static final int aw = 8;

   int an(pb var1, pb var2) {
      if (0 != 177258591 * var1.au && -272446157 * var2.au != 0) {
         return this.af ? -1829128565 * var1.ab - var2.ab * -730550804 : 1907692493 * var2.ab - var1.ab * 1907692493;
      } else {
         return this.ao(var1, var2, 641920470);
      }
   }

   int af(pb var1, pb var2, byte var3) {
      try {
         if (0 != 177258591 * var1.au) {
            if (var3 >= 32) {
               throw new IllegalStateException();
            }

            if (177258591 * var2.au != 0) {
               if (var3 >= 32) {
                  throw new IllegalStateException();
               }

               int var10000;
               if (this.af) {
                  if (var3 >= 32) {
                     throw new IllegalStateException();
                  }

                  var10000 = 1907692493 * var1.ab - var2.ab * 1907692493;
               } else {
                  var10000 = 1907692493 * var2.ab - var1.ab * 1907692493;
               }

               return var10000;
            }
         }

         return this.ao(var1, var2, 641920470);
      } catch (RuntimeException var4) {
         throw db.an(var4, "eu.af(" + ')');
      }
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.af((pb)var1, (pb)var2, (byte)-76);
      } catch (RuntimeException var3) {
         throw db.an(var3, "eu.compare(" + ')');
      }
   }

   public eu(boolean var1) {
      try {
         super();
         this.af = var1;
      } catch (RuntimeException var2) {
         throw db.an(var2, "eu.<init>(" + ')');
      }
   }

   public int ab(Object var1, Object var2) {
      return this.af((pb)var1, (pb)var2, (byte)27);
   }

   public int aq(Object var1, Object var2) {
      return this.af((pb)var1, (pb)var2, (byte)-87);
   }

   public int al(Object var1, Object var2) {
      return this.af((pb)var1, (pb)var2, (byte)-43);
   }

   int ac(pb var1, pb var2) {
      if (0 != -1829783132 * var1.au && -1438397780 * var2.au != 0) {
         return this.af ? 1711560298 * var1.ab - var2.ab * 1012634167 : -275175604 * var2.ab - var1.ab * 1907692493;
      } else {
         return this.ao(var1, var2, 641920470);
      }
   }

   public static int at(int var0) {
      try {
         return in.ab.ab * -1734758735;
      } catch (RuntimeException var1) {
         throw db.an(var1, "eu.at(" + ')');
      }
   }

   int aw(pb var1, pb var2) {
      if (0 != 177258591 * var1.au && 177258591 * var2.au != 0) {
         return this.af ? 1907692493 * var1.ab - var2.ab * 1907692493 : 1907692493 * var2.ab - var1.ab * 1907692493;
      } else {
         return this.ao(var1, var2, 641920470);
      }
   }

   int at(pb var1, pb var2) {
      if (0 != 177258591 * var1.au && 177258591 * var2.au != 0) {
         return this.af ? 1907692493 * var1.ab - var2.ab * 1907692493 : 1907692493 * var2.ab - var1.ab * 1907692493;
      } else {
         return this.ao(var1, var2, 641920470);
      }
   }

   public int au(Object var1, Object var2) {
      return this.af((pb)var1, (pb)var2, (byte)-64);
   }

   int aa(pb var1, pb var2) {
      if (0 != 177258591 * var1.au && 177258591 * var2.au != 0) {
         return this.af ? 661837582 * var1.ab - var2.ab * 1907692493 : 1907692493 * var2.ab - var1.ab * 1907692493;
      } else {
         return this.ao(var1, var2, 641920470);
      }
   }

   static void ky(int var0, String var1, int var2) {
      try {
         int var3 = -2010934433 * ds.ab;
         int[] var4 = ds.aq;
         boolean var5 = false;
         tm var6 = new tm(var1, co.cn);

         for(int var7 = 0; var7 < var3; ++var7) {
            if (var2 == 858993459) {
               return;
            }

            dv var8 = client.mc[var4[var7]];
            if (null != var8) {
               if (var2 == 858993459) {
                  throw new IllegalStateException();
               }

               if (var8 != lq.mi) {
                  if (var2 == 858993459) {
                     throw new IllegalStateException();
                  }

                  if (null != var8.af) {
                     if (var2 == 858993459) {
                        throw new IllegalStateException();
                     }

                     if (var8.af.equals(var6)) {
                        if (var2 == 858993459) {
                           throw new IllegalStateException();
                        }

                        lg var9;
                        if (var0 == 1) {
                           if (var2 == 858993459) {
                              return;
                           }

                           var9 = mi.an(lv.de, client.in.au, (short)-2396);
                           var9.aw.du(0, -126311178);
                           var9.aw.bf(var4[var7], (byte)56);
                           client.in.aw(var9, 414135591);
                        } else if (4 == var0) {
                           var9 = mi.an(lv.cf, client.in.au, (short)902);
                           var9.aw.dp(0, 2064320426);
                           var9.aw.dn(var4[var7], (byte)95);
                           client.in.aw(var9, 414135591);
                        } else if (var0 == 6) {
                           if (var2 == 858993459) {
                              throw new IllegalStateException();
                           }

                           var9 = mi.an(lv.ca, client.in.au, (short)-14436);
                           var9.aw.dy(var4[var7], (byte)98);
                           var9.aw.dp(0, -1602108935);
                           client.in.aw(var9, 414135591);
                        } else if (var0 == 7) {
                           if (var2 == 858993459) {
                              throw new IllegalStateException();
                           }

                           var9 = mi.an(lv.al, client.in.au, (short)-25818);
                           var9.aw.ds(var4[var7], -1152572044);
                           var9.aw.dh(0, (byte)-86);
                           client.in.aw(var9, 414135591);
                        }

                        var5 = true;
                        break;
                     }
                  }
               }
            }
         }

         if (!var5) {
            if (var2 == 858993459) {
               throw new IllegalStateException();
            }

            es.an(4, "", mk.gt + var1, -397121414);
         }

      } catch (RuntimeException var10) {
         throw db.an(var10, "eu.ky(" + ')');
      }
   }

   public static final int af(double var0, double var2, double var4) {
      try {
         double var6 = var4;
         double var8 = var4;
         double var10 = var4;
         if (var2 != 0.0) {
            double var12;
            if (var4 < 0.5) {
               var12 = var4 * (1.0 + var2);
            } else {
               var12 = var4 + var2 - var2 * var4;
            }

            double var14 = var4 * 2.0 - var12;
            double var16 = 0.3333333333333333 + var0;
            if (var16 > 1.0) {
               --var16;
            }

            double var20 = var0 - 0.3333333333333333;
            if (var20 < 0.0) {
               ++var20;
            }

            if (var16 * 6.0 < 1.0) {
               var6 = 6.0 * (var12 - var14) * var16 + var14;
            } else if (2.0 * var16 < 1.0) {
               var6 = var12;
            } else if (var16 * 3.0 < 2.0) {
               var6 = var14 + (0.6666666666666666 - var16) * (var12 - var14) * 6.0;
            } else {
               var6 = var14;
            }

            if (var0 * 6.0 < 1.0) {
               var8 = var14 + 6.0 * (var12 - var14) * var0;
            } else if (var0 * 2.0 < 1.0) {
               var8 = var12;
            } else if (3.0 * var0 < 2.0) {
               var8 = var14 + 6.0 * (var12 - var14) * (0.6666666666666666 - var0);
            } else {
               var8 = var14;
            }

            if (6.0 * var20 < 1.0) {
               var10 = 6.0 * (var12 - var14) * var20 + var14;
            } else if (2.0 * var20 < 1.0) {
               var10 = var12;
            } else if (var20 * 3.0 < 2.0) {
               var10 = (0.6666666666666666 - var20) * (var12 - var14) * 6.0 + var14;
            } else {
               var10 = var14;
            }
         }

         int var23 = (int)(256.0 * var6);
         int var13 = (int)(256.0 * var8);
         int var24 = (int)(256.0 * var10);
         int var15 = (var13 << 8) + (var23 << 16) + var24;
         return var15;
      } catch (RuntimeException var22) {
         throw db.an(var22, "eu.af(" + ')');
      }
   }

   static int bv(int var0, ch var1, boolean var2, int var3) {
      try {
         return 2;
      } catch (RuntimeException var4) {
         throw db.an(var4, "eu.bv(" + ')');
      }
   }
}
