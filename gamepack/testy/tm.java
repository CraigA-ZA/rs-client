import accessors.RSUsername;

public class tm implements Comparable, RSUsername {
   public static final int ab = 8;
   String an;
   String af;
   static final int ac = 2;

   public String ahj() {
      return this.af(-710264960);
   }

   public tm(String var1, sw var2) {
      try {
         super();
         this.af = var1;
         this.an = bk.aw(var1, var2, (byte)-85);
      } catch (RuntimeException var3) {
         throw db.an(var3, "tm.<init>(" + ')');
      }
   }

   public String af(int var1) {
      try {
         return this.af;
      } catch (RuntimeException var2) {
         throw db.an(var2, "tm.af(" + ')');
      }
   }

   public String an(int var1) {
      try {
         return this.an;
      } catch (RuntimeException var2) {
         throw db.an(var2, "tm.an(" + ')');
      }
   }

   public boolean aw(int var1) {
      try {
         boolean var10000;
         if (this.an != null) {
            if (var1 == -956940951) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw db.an(var2, "tm.aw(" + ')');
      }
   }

   public boolean equals(Object var1) {
      try {
         if (var1 instanceof tm) {
            tm var2 = (tm)var1;
            if (null == this.an) {
               return null == var2.an;
            } else if (var2.an == null) {
               return false;
            } else {
               return this.hashCode() != var2.hashCode() ? false : this.an.equals(var2.an);
            }
         } else {
            return false;
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "tm.equals(" + ')');
      }
   }

   public boolean ai() {
      return this.an != null;
   }

   public tm(String var1) {
      try {
         super();
         this.af = var1;
         this.an = bk.aw(var1, sw.af, (byte)-73);
      } catch (RuntimeException var2) {
         throw db.an(var2, "tm.<init>(" + ')');
      }
   }

   public int aq(tm var1, byte var2) {
      try {
         if (this.an == null) {
            if (var2 <= 30) {
               throw new IllegalStateException();
            } else {
               return var1.an == null ? 0 : 1;
            }
         } else if (null == var1.an) {
            if (var2 <= 30) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            return this.an.compareTo(var1.an);
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "tm.aq(" + ')');
      }
   }

   public int compareTo(Object var1) {
      try {
         return this.aq((tm)var1, (byte)58);
      } catch (RuntimeException var2) {
         throw db.an(var2, "tm.compareTo(" + ')');
      }
   }

   public boolean gm(Object var1) {
      if (var1 instanceof tm) {
         tm var2 = (tm)var1;
         if (null == this.an) {
            return null == var2.an;
         } else if (var2.an == null) {
            return false;
         } else {
            return this.hashCode() != var2.hashCode() ? false : this.an.equals(var2.an);
         }
      } else {
         return false;
      }
   }

   public boolean gi(Object var1) {
      if (var1 instanceof tm) {
         tm var2 = (tm)var1;
         if (null == this.an) {
            return null == var2.an;
         } else if (var2.an == null) {
            return false;
         } else {
            return this.hashCode() != var2.hashCode() ? false : this.an.equals(var2.an);
         }
      } else {
         return false;
      }
   }

   public boolean gq(Object var1) {
      if (var1 instanceof tm) {
         tm var2 = (tm)var1;
         if (null == this.an) {
            return null == var2.an;
         } else if (var2.an == null) {
            return false;
         } else {
            return this.hashCode() != var2.hashCode() ? false : this.an.equals(var2.an);
         }
      } else {
         return false;
      }
   }

   public boolean gk(Object var1) {
      if (var1 instanceof tm) {
         tm var2 = (tm)var1;
         if (null == this.an) {
            return null == var2.an;
         } else if (var2.an == null) {
            return false;
         } else {
            return this.hashCode() != var2.hashCode() ? false : this.an.equals(var2.an);
         }
      } else {
         return false;
      }
   }

   public int aht() {
      return null == this.an ? 0 : this.an.hashCode();
   }

   public int ac(Object var1) {
      return this.aq((tm)var1, (byte)84);
   }

   public int ahv() {
      return null == this.an ? 0 : this.an.hashCode();
   }

   public String ahm() {
      return this.af(-710264960);
   }

   public String ahp() {
      return this.af(-710264960);
   }

   public boolean ag() {
      return this.an != null;
   }

   public int hashCode() {
      try {
         return null == this.an ? 0 : this.an.hashCode();
      } catch (RuntimeException var1) {
         throw db.an(var1, "tm.hashCode(" + ')');
      }
   }

   public int au(Object var1) {
      return this.aq((tm)var1, (byte)57);
   }

   public int ab(Object var1) {
      return this.aq((tm)var1, (byte)44);
   }

   public String al() {
      return this.af;
   }

   public int ahh() {
      return null == this.an ? 0 : this.an.hashCode();
   }

   public String aa() {
      return this.af;
   }

   public String ay() {
      return this.an;
   }

   public String ao() {
      return this.an;
   }

   public boolean ax() {
      return this.an != null;
   }

   public String at() {
      return this.af;
   }

   public String toString() {
      try {
         return this.af(-710264960);
      } catch (RuntimeException var1) {
         throw db.an(var1, "tm.toString(" + ')');
      }
   }
}
