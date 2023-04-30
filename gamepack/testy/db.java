import accessors.RSHeadbar;

public class db extends rp implements RSHeadbar {
   oi ac;
   static tc[] ka;
   hm aw;
   static final int af = 4;
   static final int cr = 30;
   public static final int ae = 23;
   static final int an = 4;
   static final int bb = 19136992;

   dh an(int var1, byte var2) {
      try {
         dh var3 = (dh)this.ac.au();
         if (null != var3) {
            if (var2 >= 13) {
               throw new IllegalStateException();
            }

            if (-1225111563 * var3.af <= var1) {
               for(dh var4 = (dh)this.ac.aq(); null != var4; var4 = (dh)this.ac.aq()) {
                  if (var2 >= 13) {
                     throw new IllegalStateException();
                  }

                  if (-1225111563 * var4.af > var1) {
                     break;
                  }

                  var3.ga();
                  var3 = var4;
               }

               if (this.aw.ao * -407931959 + -2116244499 * var3.ac + -1225111563 * var3.af > var1) {
                  if (var2 >= 13) {
                     throw new IllegalStateException();
                  }

                  return var3;
               }

               var3.ga();
               return null;
            }

            if (var2 >= 13) {
               throw new IllegalStateException();
            }
         }

         return null;
      } catch (RuntimeException var5) {
         throw an(var5, "db.an(" + ')');
      }
   }

   void af(int var1, int var2, int var3, int var4, int var5) {
      try {
         dh var6 = null;
         int var7 = 0;

         for(dh var8 = (dh)this.ac.au(); var8 != null; var8 = (dh)this.ac.aq()) {
            if (var5 != -869970014) {
               return;
            }

            ++var7;
            if (-1225111563 * var8.af == var1) {
               if (var5 != -869970014) {
                  return;
               }

               var8.af(var1, var2, var3, var4, 470045969);
               return;
            }

            if (-1225111563 * var8.af <= var1) {
               if (var5 != -869970014) {
                  throw new IllegalStateException();
               }

               var6 = var8;
            }
         }

         if (var6 == null) {
            if (var5 == -869970014) {
               if (var7 < 4) {
                  if (var5 != -869970014) {
                     throw new IllegalStateException();
                  }

                  this.ac.aw(new dh(var1, var2, var3, var4));
               }

            }
         } else {
            oi.ac(new dh(var1, var2, var3, var4), var6);
            if (var7 >= 4) {
               if (var5 != -869970014) {
                  throw new IllegalStateException();
               }

               this.ac.au().ga();
            }

         }
      } catch (RuntimeException var9) {
         throw an(var9, "db.af(" + ')');
      }
   }

   void ab(int var1, int var2, int var3, int var4) {
      dh var5 = null;
      int var6 = 0;

      for(dh var7 = (dh)this.ac.au(); var7 != null; var7 = (dh)this.ac.aq()) {
         ++var6;
         if (-1225111563 * var7.af == var1) {
            var7.af(var1, var2, var3, var4, 71945091);
            return;
         }

         if (-1225111563 * var7.af <= var1) {
            var5 = var7;
         }
      }

      if (var5 == null) {
         if (var6 < 4) {
            this.ac.aw(new dh(var1, var2, var3, var4));
         }

      } else {
         oi.ac(new dh(var1, var2, var3, var4), var5);
         if (var6 >= 4) {
            this.ac.au().ga();
         }

      }
   }

   boolean aw(int var1) {
      try {
         return this.ac.at();
      } catch (RuntimeException var2) {
         throw an(var2, "db.aw(" + ')');
      }
   }

   dh at(int var1) {
      dh var2 = (dh)this.ac.au();
      if (null != var2 && -1225111563 * var2.af <= var1) {
         for(dh var3 = (dh)this.ac.aq(); null != var3 && -1225111563 * var3.af <= var1; var3 = (dh)this.ac.aq()) {
            var2.ga();
            var2 = var3;
         }

         if (this.aw.ao * -407931959 + -2116244499 * var2.ac + -1225111563 * var2.af > var1) {
            return var2;
         } else {
            var2.ga();
            return null;
         }
      } else {
         return null;
      }
   }

   void au(int var1, int var2, int var3, int var4) {
      dh var5 = null;
      int var6 = 0;

      for(dh var7 = (dh)this.ac.au(); var7 != null; var7 = (dh)this.ac.aq()) {
         ++var6;
         if (-1225111563 * var7.af == var1) {
            var7.af(var1, var2, var3, var4, 1770613359);
            return;
         }

         if (-1225111563 * var7.af <= var1) {
            var5 = var7;
         }
      }

      if (var5 == null) {
         if (var6 < 4) {
            this.ac.aw(new dh(var1, var2, var3, var4));
         }

      } else {
         oi.ac(new dh(var1, var2, var3, var4), var5);
         if (var6 >= 4) {
            this.ac.au().ga();
         }

      }
   }

   db(hm var1) {
      try {
         super();
         this.ac = new oi();
         this.aw = var1;
      } catch (RuntimeException var2) {
         throw an(var2, "db.<init>(" + ')');
      }
   }

   dh aq(int var1) {
      dh var2 = (dh)this.ac.au();
      if (null != var2 && -1225111563 * var2.af <= var1) {
         for(dh var3 = (dh)this.ac.aq(); null != var3 && -1225111563 * var3.af <= var1; var3 = (dh)this.ac.aq()) {
            var2.ga();
            var2 = var3;
         }

         if (this.aw.ao * -407931959 + -2116244499 * var2.ac + -1225111563 * var2.af > var1) {
            return var2;
         } else {
            var2.ga();
            return null;
         }
      } else {
         return null;
      }
   }

   dh al(int var1) {
      dh var2 = (dh)this.ac.au();
      if (null != var2 && -1225111563 * var2.af <= var1) {
         for(dh var3 = (dh)this.ac.aq(); null != var3 && 810363171 * var3.af <= var1; var3 = (dh)this.ac.aq()) {
            var2.ga();
            var2 = var3;
         }

         if (this.aw.ao * -1132759969 + -2116244499 * var2.ac + -1225111563 * var2.af > var1) {
            return var2;
         } else {
            var2.ga();
            return null;
         }
      } else {
         return null;
      }
   }

   void ac(int var1, int var2, int var3, int var4) {
      dh var5 = null;
      int var6 = 0;

      for(dh var7 = (dh)this.ac.au(); var7 != null; var7 = (dh)this.ac.aq()) {
         ++var6;
         if (-1225111563 * var7.af == var1) {
            var7.af(var1, var2, var3, var4, -47609229);
            return;
         }

         if (-1225111563 * var7.af <= var1) {
            var5 = var7;
         }
      }

      if (var5 == null) {
         if (var6 < 4) {
            this.ac.aw(new dh(var1, var2, var3, var4));
         }

      } else {
         oi.ac(new dh(var1, var2, var3, var4), var5);
         if (var6 >= 4) {
            this.ac.au().ga();
         }

      }
   }

   boolean aa() {
      return this.ac.at();
   }

   public static tr an(Throwable var0, String var1) {
      try {
         tr var2;
         if (var0 instanceof tr) {
            var2 = (tr)var0;
            var2.ab = var2.ab + ' ' + var1;
         } else {
            var2 = new tr(var0, var1);
         }

         return var2;
      } catch (RuntimeException var3) {
         throw an(var3, "db.an(" + ')');
      }
   }
}
