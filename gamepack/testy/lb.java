import accessors.RSCoord;

public class lb implements RSCoord {
   public int an;
   public int af;
   public int aw;
   public static final int bt = 57;

   public String toString() {
      try {
         return this.ac(",", 1584874808);
      } catch (RuntimeException var1) {
         throw db.an(var1, "lb.toString(" + ')');
      }
   }

   String ai(String var1) {
      return 455897121 * this.af + var1 + (this.an * -96298701 >> 6) + var1 + (-1758206828 * this.aw >> 6) + var1 + (1769589661 * this.an & 63) + var1 + (559692017 * this.aw & 63);
   }

   public lb(int var1) {
      try {
         super();
         if (var1 == -1) {
            this.af = 166197253;
         } else {
            this.af = (var1 >> 28 & 3) * -166197253;
            this.an = -1150612997 * (var1 >> 14 & 16383);
            this.aw = -1765780399 * (var1 & 16383);
         }

      } catch (RuntimeException var2) {
         throw db.an(var2, "lb.<init>(" + ')');
      }
   }

   public int ab() {
      return ks.an(-113644749 * this.af, -96298701 * this.an, -2105445199 * this.aw, (byte)1);
   }

   boolean ao(lb var1) {
      if (this.af * -910060353 != var1.af * -113644749) {
         return false;
      } else if (-618793855 * var1.an != this.an * -96298701) {
         return false;
      } else {
         return this.aw * 860975731 == var1.aw * -2105445199;
      }
   }

   boolean aw(lb var1, int var2) {
      try {
         if (this.af * -113644749 != var1.af * -113644749) {
            return false;
         } else if (-96298701 * var1.an != this.an * -96298701) {
            if (var2 != 1151983823) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else if (this.aw * -2105445199 != var1.aw * -2105445199) {
            if (var2 != 1151983823) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            return true;
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "lb.aw(" + ')');
      }
   }

   public String ahp() {
      return this.ac(",", 882374282);
   }

   public int af(int var1) {
      try {
         return ks.an(-113644749 * this.af, -96298701 * this.an, -2105445199 * this.aw, (byte)1);
      } catch (RuntimeException var2) {
         throw db.an(var2, "lb.af(" + ')');
      }
   }

   String ac(String var1, int var2) {
      try {
         return -113644749 * this.af + var1 + (this.an * -96298701 >> 6) + var1 + (-2105445199 * this.aw >> 6) + var1 + (-96298701 * this.an & 63) + var1 + (-2105445199 * this.aw & 63);
      } catch (RuntimeException var3) {
         throw db.an(var3, "lb.ac(" + ')');
      }
   }

   public boolean gm(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof lb) ? false : this.aw((lb)var1, 1151983823);
      }
   }

   public boolean gk(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof lb) ? false : this.aw((lb)var1, 1151983823);
      }
   }

   public lb(lb var1) {
      try {
         super();
         this.af = var1.af * 1;
         this.an = 1 * var1.an;
         this.aw = var1.aw * 1;
      } catch (RuntimeException var2) {
         throw db.an(var2, "lb.<init>(" + ')');
      }
   }

   public lb(int var1, int var2, int var3) {
      try {
         super();
         this.af = -166197253 * var1;
         this.an = -1150612997 * var2;
         this.aw = var3 * -1765780399;
      } catch (RuntimeException var4) {
         throw db.an(var4, "lb.<init>(" + ')');
      }
   }

   public int ahh() {
      return this.af(-964267539);
   }

   static int at(int var0, int var1, int var2) {
      return var0 << 28 | var1 << 14 | var2;
   }

   public int ahv() {
      return this.af(-964267539);
   }

   public int au() {
      return ks.an(-113644749 * this.af, -96298701 * this.an, 467460018 * this.aw, (byte)1);
   }

   public int aht() {
      return this.af(-964267539);
   }

   public int aq() {
      return ks.an(-113644749 * this.af, -96298701 * this.an, -2105445199 * this.aw, (byte)1);
   }

   static int al(int var0, int var1, int var2) {
      return var0 << 28 | var1 << 14 | var2;
   }

   public int hashCode() {
      try {
         return this.af(-964267539);
      } catch (RuntimeException var1) {
         throw db.an(var1, "lb.hashCode(" + ')');
      }
   }

   static int aa(int var0, int var1, int var2) {
      return var0 << 28 | var1 << 14 | var2;
   }

   public boolean equals(Object var1) {
      try {
         if (this == var1) {
            return true;
         } else {
            return !(var1 instanceof lb) ? false : this.aw((lb)var1, 1151983823);
         }
      } catch (RuntimeException var2) {
         throw db.an(var2, "lb.equals(" + ')');
      }
   }

   public boolean gi(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof lb) ? false : this.aw((lb)var1, 1151983823);
      }
   }

   public String ahm() {
      return this.ac(",", 1308797197);
   }

   boolean ay(lb var1) {
      if (this.af * -113644749 != var1.af * -113644749) {
         return false;
      } else if (-96298701 * var1.an != this.an * -96298701) {
         return false;
      } else {
         return this.aw * -2105445199 == var1.aw * -2105445199;
      }
   }

   public String ahj() {
      return this.ac(",", 836382626);
   }

   String ax(String var1) {
      return -113644749 * this.af + var1 + (this.an * -96298701 >> 6) + var1 + (-2105445199 * this.aw >> 6) + var1 + (-96298701 * this.an & 63) + var1 + (-2105445199 * this.aw & 63);
   }

   public boolean gq(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof lb) ? false : this.aw((lb)var1, 1151983823);
      }
   }

   static final void if(int var0) {
      try {
         if (cx.sl) {
            if (var0 >= 3551631) {
               return;
            }

            if (es.sb != null) {
               es.sb.ba((byte)43);
            }

            for(int var1 = 0; var1 < -2010934433 * ds.ab; ++var1) {
               if (var0 >= 3551631) {
                  throw new IllegalStateException();
               }

               dv var2 = client.mc[ds.aq[var1]];
               var2.ay(2091394919);
            }

            cx.sl = false;
         }

      } catch (RuntimeException var3) {
         throw db.an(var3, "lb.if(" + ')');
      }
   }
}
