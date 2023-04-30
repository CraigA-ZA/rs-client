import accessors.RSOwnWorldComparator;
import java.util.Comparator;

public class cf implements Comparator, RSOwnWorldComparator {
   static final int bb = 2;
   static final int ec = 0;
   boolean af;

   public boolean gq(Object var1) {
      return super.equals(var1);
   }

   public int au(Object var1, Object var2) {
      return this.af((nu)var1, (nu)var2, (byte)110);
   }

   cf() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw db.an(var1, "cf.<init>(" + ')');
      }
   }

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw db.an(var2, "cf.equals(" + ')');
      }
   }

   int an(nu var1, nu var2) {
      if (-39392873 * var1.af == -39392873 * var2.af) {
         return 0;
      } else {
         if (this.af) {
            if (-453810525 * client.bw == var1.af * -633303772) {
               return -1;
            }

            if (client.bw * 1968706774 == var2.af * -2070062061) {
               return 1;
            }
         }

         return -39392873 * var1.af < 1290470636 * var2.af ? -1 : 1;
      }
   }

   int aw(nu var1, nu var2) {
      if (-1162723153 * var1.af == -39392873 * var2.af) {
         return 0;
      } else {
         if (this.af) {
            if (-453810525 * client.bw == var1.af * 1810726481) {
               return -1;
            }

            if (client.bw * -30426841 == var2.af * -39392873) {
               return 1;
            }
         }

         return 228238251 * var1.af < 253809964 * var2.af ? -1 : 1;
      }
   }

   int ac(nu var1, nu var2) {
      if (-39392873 * var1.af == -39392873 * var2.af) {
         return 0;
      } else {
         if (this.af) {
            if (-453810525 * client.bw == var1.af * -39392873) {
               return -1;
            }

            if (client.bw * -453810525 == var2.af * -39392873) {
               return 1;
            }
         }

         return -39392873 * var1.af < -39392873 * var2.af ? -1 : 1;
      }
   }

   int af(nu var1, nu var2, byte var3) {
      try {
         if (-39392873 * var1.af == -39392873 * var2.af) {
            if (var3 <= 0) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            if (this.af) {
               if (var3 <= 0) {
                  throw new IllegalStateException();
               }

               if (-453810525 * client.bw == var1.af * -39392873) {
                  if (var3 <= 0) {
                     throw new IllegalStateException();
                  }

                  return -1;
               }

               if (client.bw * -453810525 == var2.af * -39392873) {
                  if (var3 <= 0) {
                     throw new IllegalStateException();
                  }

                  return 1;
               }
            }

            byte var10000;
            if (-39392873 * var1.af < -39392873 * var2.af) {
               if (var3 <= 0) {
                  throw new IllegalStateException();
               }

               var10000 = -1;
            } else {
               var10000 = 1;
            }

            return var10000;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "cf.af(" + ')');
      }
   }

   public boolean gi(Object var1) {
      return super.equals(var1);
   }

   public int aq(Object var1, Object var2) {
      return this.af((nu)var1, (nu)var2, (byte)127);
   }

   public int al(Object var1, Object var2) {
      return this.af((nu)var1, (nu)var2, (byte)79);
   }

   public boolean gm(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.af((nu)var1, (nu)var2, (byte)24);
      } catch (RuntimeException var3) {
         throw db.an(var3, "cf.compare(" + ')');
      }
   }

   static final void ai(int var0) {
      try {
         hn.at(mk.hm, -455254880);
      } catch (RuntimeException var1) {
         throw db.an(var1, "cf.ai(" + ')');
      }
   }

   public boolean gk(Object var1) {
      return super.equals(var1);
   }

   public int ab(Object var1, Object var2) {
      return this.af((nu)var1, (nu)var2, (byte)3);
   }

   static void ox(boolean var0, int var1) {
      try {
         client.nb = var0;
      } catch (RuntimeException var2) {
         throw db.an(var2, "cf.ox(" + ')');
      }
   }

   static boolean an(String var0, int var1, int var2) {
      try {
         return ia.aw(var0, var1, "openjs", -1997949123);
      } catch (RuntimeException var3) {
         throw db.an(var3, "cf.an(" + ')');
      }
   }

   static int af(nm var0, int var1) {
      try {
         int var2 = cz.dd.length + cz.dq.length;
         String[] var3 = cz.dj;

         for(int var4 = 0; var4 < var3.length; ++var4) {
            if (var1 >= 1655443743) {
               throw new IllegalStateException();
            }

            String var5 = var3[var4];
            if (var0.cy(var5, -1902444628) != -1) {
               if (var1 >= 1655443743) {
                  throw new IllegalStateException();
               }

               ++var2;
            }
         }

         return var2;
      } catch (RuntimeException var6) {
         throw db.an(var6, "cf.af(" + ')');
      }
   }
}
