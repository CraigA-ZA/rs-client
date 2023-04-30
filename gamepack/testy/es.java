import accessors.RSUserComparator5;

public class es extends pz implements RSUserComparator5 {
   static ps sb;
   final boolean af;

   public es(boolean var1) {
      try {
         super();
         this.af = var1;
      } catch (RuntimeException var2) {
         throw db.an(var2, "es.<init>(" + ')');
      }
   }

   public int al(Object var1, Object var2) {
      return this.af((pb)var1, (pb)var2, 318450924);
   }

   public int ab(Object var1, Object var2) {
      return this.af((pb)var1, (pb)var2, 318450924);
   }

   public int au(Object var1, Object var2) {
      return this.af((pb)var1, (pb)var2, 318450924);
   }

   static void an(int var0, String var1, String var2, int var3) {
      try {
         fo.aw(var0, var1, var2, (String)null, (short)-677);
      } catch (RuntimeException var4) {
         throw db.an(var4, "es.an(" + ')');
      }
   }

   public int aq(Object var1, Object var2) {
      return this.af((pb)var1, (pb)var2, 318450924);
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.af((pb)var1, (pb)var2, 318450924);
      } catch (RuntimeException var3) {
         throw db.an(var3, "es.compare(" + ')');
      }
   }

   int an(pb var1, pb var2) {
      if (0 != 177258591 * var1.au) {
         if (var2.au * 177258591 == 0) {
            return this.af ? -1 : 1;
         }
      } else if (177258591 * var2.au != 0) {
         return this.af ? 1 : -1;
      }

      return this.ao(var1, var2, 641920470);
   }

   int aw(pb var1, pb var2) {
      if (0 != 1506008730 * var1.au) {
         if (var2.au * 177258591 == 0) {
            return this.af ? -1 : 1;
         }
      } else if (-773060063 * var2.au != 0) {
         return this.af ? 1 : -1;
      }

      return this.ao(var1, var2, 641920470);
   }

   int ac(pb var1, pb var2) {
      if (0 != 177258591 * var1.au) {
         if (var2.au * 177258591 == 0) {
            return this.af ? -1 : 1;
         }
      } else if (177258591 * var2.au != 0) {
         return this.af ? 1 : -1;
      }

      return this.ao(var1, var2, 641920470);
   }

   static void hx(nd var0, String var1, int var2) {
      try {
         dw var3 = new dw(var0, var1);
         client.we.add(var3);
         client.ws += 1472564749 * var3.aw;
      } catch (RuntimeException var4) {
         throw db.an(var4, "es.hx(" + ')');
      }
   }

   int af(pb var1, pb var2, int var3) {
      try {
         byte var10000;
         if (0 != 177258591 * var1.au) {
            if (var3 != 318450924) {
               throw new IllegalStateException();
            }

            if (var2.au * 177258591 == 0) {
               if (var3 != 318450924) {
                  throw new IllegalStateException();
               }

               if (this.af) {
                  if (var3 != 318450924) {
                     throw new IllegalStateException();
                  }

                  var10000 = -1;
               } else {
                  var10000 = 1;
               }

               return var10000;
            }
         } else if (177258591 * var2.au != 0) {
            if (var3 != 318450924) {
               throw new IllegalStateException();
            }

            if (this.af) {
               if (var3 != 318450924) {
                  throw new IllegalStateException();
               }

               var10000 = 1;
            } else {
               var10000 = -1;
            }

            return var10000;
         }

         return this.ao(var1, var2, 641920470);
      } catch (RuntimeException var4) {
         throw db.an(var4, "es.af(" + ')');
      }
   }
}
