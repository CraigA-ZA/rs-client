import accessors.RSVarcInt;

public class hi extends rk implements RSVarcInt {
   public static kh an = new kh(64);
   public boolean aw = false;
   static final int af = 0;

   public void ac(sg var1) {
      while(true) {
         int var2 = var1.cm((byte)7);
         if (0 == var2) {
            return;
         }

         this.an(var1, var2, 887119169);
      }
   }

   public void af(sg var1, int var2) {
      try {
         while(true) {
            int var3 = var1.cm((byte)7);
            if (0 == var3) {
               if (var2 == 65536) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.an(var1, var3, -194909553);
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "hi.af(" + ')');
      }
   }

   void an(sg var1, int var2, int var3) {
      try {
         if (2 == var2) {
            if (var3 == 294985633) {
               throw new IllegalStateException();
            }

            this.aw = true;
         }

      } catch (RuntimeException var4) {
         throw db.an(var4, "hi.an(" + ')');
      }
   }

   void au(sg var1, int var2) {
      if (2 == var2) {
         this.aw = true;
      }

   }

   public void aw(sg var1) {
      while(true) {
         int var2 = var1.cm((byte)7);
         if (0 == var2) {
            return;
         }

         this.an(var1, var2, 186513622);
      }
   }

   public static boolean ag(char var0, byte var1) {
      try {
         if (var0 >= ' ') {
            if (var1 <= -1) {
               throw new IllegalStateException();
            }

            if (var0 <= '~') {
               if (var1 <= -1) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         if (var0 >= 160) {
            if (var1 <= -1) {
               throw new IllegalStateException();
            }

            if (var0 <= 255) {
               if (var1 <= -1) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         if (8364 != var0) {
            if (var1 <= -1) {
               throw new IllegalStateException();
            }

            if (var0 != 338) {
               if (var1 <= -1) {
                  throw new IllegalStateException();
               }

               if (var0 != 8212) {
                  if (var1 <= -1) {
                     throw new IllegalStateException();
                  }

                  if (var0 != 339) {
                     if (376 != var0) {
                        return false;
                     }

                     if (var1 <= -1) {
                        throw new IllegalStateException();
                     }
                  }
               }
            }
         }

         return true;
      } catch (RuntimeException var2) {
         throw db.an(var2, "hi.ag(" + ')');
      }
   }
}
