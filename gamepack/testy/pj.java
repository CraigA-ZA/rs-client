public final class pj implements Comparable {
   Object af;
   Object an;
   long aw;
   long ac;
   static gv ay;
   static nd fw;
   static short[] wm;

   public int ab(Object var1) {
      return this.af((pj)var1, 136195501);
   }

   int af(pj var1, int var2) {
      try {
         if (this.ac * -8679189461794727135L < -8679189461794727135L * var1.ac) {
            if (var2 == 327685) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else if (-8679189461794727135L * this.ac > var1.ac * -8679189461794727135L) {
            if (var2 == 327685) {
               throw new IllegalStateException();
            } else {
               return 1;
            }
         } else {
            return 0;
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "pj.af(" + ')');
      }
   }

   public boolean equals(Object var1) {
      try {
         if (var1 instanceof pj) {
            return this.an.equals(((pj)var1).an);
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var2) {
         throw db.an(var2, "pj.equals(" + ')');
      }
   }

   public int hashCode() {
      try {
         return this.an.hashCode();
      } catch (RuntimeException var1) {
         throw db.an(var1, "pj.hashCode(" + ')');
      }
   }

   public int ac(Object var1) {
      return this.af((pj)var1, 71600460);
   }

   public boolean gm(Object var1) {
      if (var1 instanceof pj) {
         return this.an.equals(((pj)var1).an);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public boolean gi(Object var1) {
      if (var1 instanceof pj) {
         return this.an.equals(((pj)var1).an);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public boolean gq(Object var1) {
      if (var1 instanceof pj) {
         return this.an.equals(((pj)var1).an);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public int au(Object var1) {
      return this.af((pj)var1, 826434148);
   }

   public int ahh() {
      return this.an.hashCode();
   }

   public boolean gk(Object var1) {
      if (var1 instanceof pj) {
         return this.an.equals(((pj)var1).an);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public int ahv() {
      return this.an.hashCode();
   }

   int an(pj var1) {
      if (this.ac * -8679189461794727135L < -8679189461794727135L * var1.ac) {
         return -1;
      } else {
         return -8679189461794727135L * this.ac > var1.ac * -8679189461794727135L ? 1 : 0;
      }
   }

   public int compareTo(Object var1) {
      try {
         return this.af((pj)var1, -331222916);
      } catch (RuntimeException var2) {
         throw db.an(var2, "pj.compareTo(" + ')');
      }
   }

   pj(Object var1, Object var2) {
      try {
         super();
         this.af = var1;
         this.an = var2;
      } catch (RuntimeException var3) {
         throw db.an(var3, "pj.<init>(" + ')');
      }
   }

   int aw(pj var1) {
      if (this.ac * -8679189461794727135L < -8679189461794727135L * var1.ac) {
         return -1;
      } else {
         return -8679189461794727135L * this.ac > var1.ac * -8679189461794727135L ? 1 : 0;
      }
   }

   public static tf af(int var0, int var1) {
      try {
         tf[] var2 = new tf[]{tf.af, tf.aw, tf.an};
         tf[] var3 = var2;

         for(int var4 = 0; var4 < var3.length; ++var4) {
            tf var5 = var3[var4];
            if (var5.ac * 1843384107 == var0) {
               if (var1 != -108064052) {
                  throw new IllegalStateException();
               }

               return var5;
            }
         }

         return null;
      } catch (RuntimeException var6) {
         throw db.an(var6, "pj.af(" + ')');
      }
   }

   public int aht() {
      return this.an.hashCode();
   }
}
