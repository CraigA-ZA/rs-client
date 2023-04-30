public final class qx {
   static int an;
   static int aw;
   static qx[] af = new qx[0];
   float ac;
   float au;
   float ab;
   float aq;

   public boolean gq(Object var1) {
      if (!(var1 instanceof qx)) {
         return false;
      } else {
         qx var2 = (qx)var1;
         return this.ac == var2.ac && this.au == var2.au && this.ab == var2.ab && var2.aq == this.aq;
      }
   }

   qx() {
      try {
         super();
         this.ab(147041014);
      } catch (RuntimeException var1) {
         throw db.an(var1, "qx.<init>(" + ')');
      }
   }

   void ac(float var1, float var2, float var3, float var4, byte var5) {
      try {
         this.ac = var1;
         this.au = var2;
         this.ab = var3;
         this.aq = var4;
      } catch (RuntimeException var6) {
         throw db.an(var6, "qx.ac(" + ')');
      }
   }

   public void au(float var1, float var2, float var3, float var4, int var5) {
      try {
         float var6 = (float)Math.sin((double)(0.5F * var4));
         float var7 = (float)Math.cos((double)(0.5F * var4));
         this.ac = var6 * var1;
         this.au = var6 * var2;
         this.ab = var3 * var6;
         this.aq = var7;
      } catch (RuntimeException var8) {
         throw db.an(var8, "qx.au(" + ')');
      }
   }

   public static qx ao() {
      synchronized(af) {
         if (0 == -2133937525 * aw) {
            return new qx();
         } else {
            af[(aw -= 1732158755) * -1829924912].ab(1792716261);
            return af[-2099436983 * aw];
         }
      }
   }

   public final void aq(qx var1, byte var2) {
      try {
         this.ac(var1.au * this.ab + var1.ac * this.aq + var1.aq * this.ac - this.au * var1.ab, var1.au * this.aq + (this.au * var1.aq - this.ab * var1.ac) + this.ac * var1.ab, this.ab * var1.aq + var1.ac * this.au - var1.au * this.ac + var1.ab * this.aq, this.aq * var1.aq - var1.ac * this.ac - this.au * var1.au - this.ab * var1.ab, (byte)-47);
      } catch (RuntimeException var3) {
         throw db.an(var3, "qx.aq(" + ')');
      }
   }

   public String toString() {
      try {
         return this.ac + "," + this.au + "," + this.ab + "," + this.aq;
      } catch (RuntimeException var1) {
         throw db.an(var1, "qx.toString(" + ')');
      }
   }

   public int hashCode() {
      try {
         boolean var1 = true;
         float var2 = 1.0F;
         var2 = 31.0F * var2 + this.ac;
         var2 = 31.0F * var2 + this.au;
         var2 = 31.0F * var2 + this.ab;
         var2 = this.aq + 31.0F * var2;
         return (int)var2;
      } catch (RuntimeException var3) {
         throw db.an(var3, "qx.hashCode(" + ')');
      }
   }

   public boolean gi(Object var1) {
      if (!(var1 instanceof qx)) {
         return false;
      } else {
         qx var2 = (qx)var1;
         return this.ac == var2.ac && this.au == var2.au && this.ab == var2.ab && var2.aq == this.aq;
      }
   }

   static {
      lw.af(100, 233637321);
      new qx();
   }

   public boolean gm(Object var1) {
      if (!(var1 instanceof qx)) {
         return false;
      } else {
         qx var2 = (qx)var1;
         return this.ac == var2.ac && this.au == var2.au && this.ab == var2.ab && var2.aq == this.aq;
      }
   }

   public void aw(byte var1) {
      try {
         synchronized(af) {
            if (-2133937525 * aw < -1819670561 * an - 1) {
               if (var1 >= 0) {
                  throw new IllegalStateException();
               }

               af[(aw += 1732158755) * -2133937525 - 1] = this;
            }

         }
      } catch (RuntimeException var5) {
         throw db.an(var5, "qx.aw(" + ')');
      }
   }

   public void am(float var1, float var2, float var3, float var4) {
      float var5 = (float)Math.sin((double)(0.5F * var4));
      float var6 = (float)Math.cos((double)(0.5F * var4));
      this.ac = var5 * var1;
      this.au = var5 * var2;
      this.ab = var3 * var5;
      this.aq = var6;
   }

   public boolean gk(Object var1) {
      if (!(var1 instanceof qx)) {
         return false;
      } else {
         qx var2 = (qx)var1;
         return this.ac == var2.ac && this.au == var2.au && this.ab == var2.ab && var2.aq == this.aq;
      }
   }

   public int ahh() {
      boolean var1 = true;
      float var2 = 1.0F;
      var2 = 31.0F * var2 + this.ac;
      var2 = 31.0F * var2 + this.au;
      var2 = 31.0F * var2 + this.ab;
      var2 = this.aq + 31.0F * var2;
      return (int)var2;
   }

   public int aht() {
      boolean var1 = true;
      float var2 = 1.0F;
      var2 = 31.0F * var2 + this.ac;
      var2 = 31.0F * var2 + this.au;
      var2 = 31.0F * var2 + this.ab;
      var2 = this.aq + 31.0F * var2;
      return (int)var2;
   }

   public int ahv() {
      boolean var1 = true;
      float var2 = 1.0F;
      var2 = 31.0F * var2 + this.ac;
      var2 = 31.0F * var2 + this.au;
      var2 = 31.0F * var2 + this.ab;
      var2 = this.aq + 31.0F * var2;
      return (int)var2;
   }

   public String ahm() {
      return this.ac + "," + this.au + "," + this.ab + "," + this.aq;
   }

   public String ahp() {
      return this.ac + "," + this.au + "," + this.ab + "," + this.aq;
   }

   public String ahj() {
      return this.ac + "," + this.au + "," + this.ab + "," + this.aq;
   }

   static void al(int var0) {
      an = var0 * -1605864417;
      af = new qx[var0];
      aw = 0;
   }

   static void at(int var0) {
      an = var0 * -1605864417;
      af = new qx[var0];
      aw = 0;
   }

   public static qx ax() {
      synchronized(af) {
         if (0 == -2133937525 * aw) {
            return new qx();
         } else {
            af[(aw -= 1732158755) * -2133937525].ab(336090811);
            return af[-2133937525 * aw];
         }
      }
   }

   static void ay(int var0) {
      an = var0 * 1702894705;
      af = new qx[var0];
      aw = 0;
   }

   void av(float var1, float var2, float var3, float var4) {
      this.ac = var1;
      this.au = var2;
      this.ab = var3;
      this.aq = var4;
   }

   final void ak() {
      this.ab = 0.0F;
      this.au = 0.0F;
      this.ac = 0.0F;
      this.aq = 1.0F;
   }

   public static qx ai() {
      synchronized(af) {
         if (0 == 179389177 * aw) {
            return new qx();
         } else {
            af[(aw -= 1732158755) * 1638084916].ab(2003896821);
            return af[-2133937525 * aw];
         }
      }
   }

   public final void ap(qx var1) {
      this.ac(var1.au * this.ab + var1.ac * this.aq + var1.aq * this.ac - this.au * var1.ab, var1.au * this.aq + (this.au * var1.aq - this.ab * var1.ac) + this.ac * var1.ab, this.ab * var1.aq + var1.ac * this.au - var1.au * this.ac + var1.ab * this.aq, this.aq * var1.aq - var1.ac * this.ac - this.au * var1.au - this.ab * var1.ab, (byte)-80);
   }

   public void ah() {
      synchronized(af) {
         if (-2133937525 * aw < -1819670561 * an - 1) {
            af[(aw += 12111740) * 1414600250 - 1] = this;
         }

      }
   }

   public void ag() {
      synchronized(af) {
         if (-2133937525 * aw < -1819670561 * an - 1) {
            af[(aw += -1968654739) * -2133937525 - 1] = this;
         }

      }
   }

   static void aa(int var0) {
      an = var0 * -1605864417;
      af = new qx[var0];
      aw = 0;
   }

   void ar(float var1, float var2, float var3, float var4) {
      this.ac = var1;
      this.au = var2;
      this.ab = var3;
      this.aq = var4;
   }

   final void as() {
      this.ab = 0.0F;
      this.au = 0.0F;
      this.ac = 0.0F;
      this.aq = 1.0F;
   }

   final void aj() {
      this.ab = 0.0F;
      this.au = 0.0F;
      this.ac = 0.0F;
      this.aq = 1.0F;
   }

   final void ab(int var1) {
      try {
         this.ab = 0.0F;
         this.au = 0.0F;
         this.ac = 0.0F;
         this.aq = 1.0F;
      } catch (RuntimeException var2) {
         throw db.an(var2, "qx.ab(" + ')');
      }
   }

   final void az() {
      this.ab = 0.0F;
      this.au = 0.0F;
      this.ac = 0.0F;
      this.aq = 1.0F;
   }

   public final void ad(qx var1) {
      this.ac(var1.au * this.ab + var1.ac * this.aq + var1.aq * this.ac - this.au * var1.ab, var1.au * this.aq + (this.au * var1.aq - this.ab * var1.ac) + this.ac * var1.ab, this.ab * var1.aq + var1.ac * this.au - var1.au * this.ac + var1.ab * this.aq, this.aq * var1.aq - var1.ac * this.ac - this.au * var1.au - this.ab * var1.ab, (byte)95);
   }

   public final void ae(qx var1) {
      this.ac(var1.au * this.ab + var1.ac * this.aq + var1.aq * this.ac - this.au * var1.ab, var1.au * this.aq + (this.au * var1.aq - this.ab * var1.ac) + this.ac * var1.ab, this.ab * var1.aq + var1.ac * this.au - var1.au * this.ac + var1.ab * this.aq, this.aq * var1.aq - var1.ac * this.ac - this.au * var1.au - this.ab * var1.ab, (byte)-2);
   }

   public boolean equals(Object var1) {
      try {
         if (!(var1 instanceof qx)) {
            return false;
         } else {
            qx var2 = (qx)var1;
            return this.ac == var2.ac && this.au == var2.au && this.ab == var2.ab && var2.aq == this.aq;
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "qx.equals(" + ')');
      }
   }

   static float an(float[] var0, int var1, float var2, int var3) {
      try {
         float var4 = var0[var1];

         for(int var5 = var1 - 1; var5 >= 0; --var5) {
            if (var3 <= -932882365) {
               throw new IllegalStateException();
            }

            var4 = var0[var5] + var4 * var2;
         }

         return var4;
      } catch (RuntimeException var6) {
         throw db.an(var6, "qx.an(" + ')');
      }
   }
}
