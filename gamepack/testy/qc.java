public class qc {
   static final int aj = 7;
   float an;
   float aw;
   float ac;
   float au;
   float ab;
   float aq;
   float al;
   float at;
   float aa;
   float ay;
   float ao;
   float af;
   static nd fa;

   public String toString() {
      try {
         return this.af + "," + this.ac + "," + this.aq + "," + this.aa + "\n" + this.an + "," + this.au + "," + this.al + "," + this.ay + "\n" + this.aw + "," + this.ab + "," + this.at + "," + this.ao;
      } catch (RuntimeException var1) {
         throw db.an(var1, "qc.toString(" + ')');
      }
   }

   void au(float var1, float var2, float var3, byte var4) {
      try {
         this.aa += var1;
         this.ay += var2;
         this.ao += var3;
      } catch (RuntimeException var5) {
         throw db.an(var5, "qc.au(" + ')');
      }
   }

   void an(float var1, int var2) {
      try {
         float var3 = (float)Math.cos((double)var1);
         float var4 = (float)Math.sin((double)var1);
         float var5 = this.an;
         float var6 = this.au;
         float var7 = this.al;
         float var8 = this.ay;
         this.an = var5 * var3 - this.aw * var4;
         this.aw = this.aw * var3 + var4 * var5;
         this.au = var3 * var6 - var4 * this.ab;
         this.ab = this.ab * var3 + var6 * var4;
         this.al = var7 * var3 - var4 * this.at;
         this.at = this.at * var3 + var4 * var7;
         this.ay = var3 * var8 - this.ao * var4;
         this.ao = var4 * var8 + var3 * this.ao;
      } catch (RuntimeException var9) {
         throw db.an(var9, "qc.an(" + ')');
      }
   }

   void aw(float var1, int var2) {
      try {
         float var3 = (float)Math.cos((double)var1);
         float var4 = (float)Math.sin((double)var1);
         float var5 = this.af;
         float var6 = this.ac;
         float var7 = this.aq;
         float var8 = this.aa;
         this.af = var4 * this.aw + var3 * var5;
         this.aw = var3 * this.aw - var5 * var4;
         this.ac = var4 * this.ab + var6 * var3;
         this.ab = this.ab * var3 - var6 * var4;
         this.aq = var4 * this.at + var3 * var7;
         this.at = this.at * var3 - var4 * var7;
         this.aa = var3 * var8 + var4 * this.ao;
         this.ao = var3 * this.ao - var8 * var4;
      } catch (RuntimeException var9) {
         throw db.an(var9, "qc.aw(" + ')');
      }
   }

   void ac(float var1, byte var2) {
      try {
         float var3 = (float)Math.cos((double)var1);
         float var4 = (float)Math.sin((double)var1);
         float var5 = this.af;
         float var6 = this.ac;
         float var7 = this.aq;
         float var8 = this.aa;
         this.af = var5 * var3 - this.an * var4;
         this.an = var3 * this.an + var5 * var4;
         this.ac = var6 * var3 - this.au * var4;
         this.au = var4 * var6 + var3 * this.au;
         this.aq = var3 * var7 - this.al * var4;
         this.al = var3 * this.al + var4 * var7;
         this.aa = var3 * var8 - var4 * this.ay;
         this.ay = var3 * this.ay + var4 * var8;
      } catch (RuntimeException var9) {
         throw db.an(var9, "qc.ac(" + ')');
      }
   }

   void ai(float var1) {
      float var2 = (float)Math.cos((double)var1);
      float var3 = (float)Math.sin((double)var1);
      float var4 = this.af;
      float var5 = this.ac;
      float var6 = this.aq;
      float var7 = this.aa;
      this.af = var3 * this.aw + var2 * var4;
      this.aw = var2 * this.aw - var4 * var3;
      this.ac = var3 * this.ab + var5 * var2;
      this.ab = this.ab * var2 - var5 * var3;
      this.aq = var3 * this.at + var2 * var6;
      this.at = this.at * var2 - var3 * var6;
      this.aa = var2 * var7 + var3 * this.ao;
      this.ao = var2 * this.ao - var7 * var3;
   }

   void ao(float var1) {
      float var2 = (float)Math.cos((double)var1);
      float var3 = (float)Math.sin((double)var1);
      float var4 = this.an;
      float var5 = this.au;
      float var6 = this.al;
      float var7 = this.ay;
      this.an = var4 * var2 - this.aw * var3;
      this.aw = this.aw * var2 + var3 * var4;
      this.au = var2 * var5 - var3 * this.ab;
      this.ab = this.ab * var2 + var5 * var3;
      this.al = var6 * var2 - var3 * this.at;
      this.at = this.at * var2 + var3 * var6;
      this.ay = var2 * var7 - this.ao * var3;
      this.ao = var3 * var7 + var2 * this.ao;
   }

   static {
      new qc();
   }

   public String ahm() {
      return this.af + "," + this.ac + "," + this.aq + "," + this.aa + "\n" + this.an + "," + this.au + "," + this.al + "," + this.ay + "\n" + this.aw + "," + this.ab + "," + this.at + "," + this.ao;
   }

   public String ahp() {
      return this.af + "," + this.ac + "," + this.aq + "," + this.aa + "\n" + this.an + "," + this.au + "," + this.al + "," + this.ay + "\n" + this.aw + "," + this.ab + "," + this.at + "," + this.ao;
   }

   public String ahj() {
      return this.af + "," + this.ac + "," + this.aq + "," + this.aa + "\n" + this.an + "," + this.au + "," + this.al + "," + this.ay + "\n" + this.aw + "," + this.ab + "," + this.at + "," + this.ao;
   }

   void ab() {
      this.ao = 0.0F;
      this.ay = 0.0F;
      this.aa = 0.0F;
      this.al = 0.0F;
      this.aq = 0.0F;
      this.ab = 0.0F;
      this.ac = 0.0F;
      this.aw = 0.0F;
      this.an = 0.0F;
      this.at = 1.0F;
      this.au = 1.0F;
      this.af = 1.0F;
   }

   void af(short var1) {
      try {
         this.ao = 0.0F;
         this.ay = 0.0F;
         this.aa = 0.0F;
         this.al = 0.0F;
         this.aq = 0.0F;
         this.ab = 0.0F;
         this.ac = 0.0F;
         this.aw = 0.0F;
         this.an = 0.0F;
         this.at = 1.0F;
         this.au = 1.0F;
         this.af = 1.0F;
      } catch (RuntimeException var2) {
         throw db.an(var2, "qc.af(" + ')');
      }
   }

   void ag(float var1) {
      float var2 = (float)Math.cos((double)var1);
      float var3 = (float)Math.sin((double)var1);
      float var4 = this.af;
      float var5 = this.ac;
      float var6 = this.aq;
      float var7 = this.aa;
      this.af = var3 * this.aw + var2 * var4;
      this.aw = var2 * this.aw - var4 * var3;
      this.ac = var3 * this.ab + var5 * var2;
      this.ab = this.ab * var2 - var5 * var3;
      this.aq = var3 * this.at + var2 * var6;
      this.at = this.at * var2 - var3 * var6;
      this.aa = var2 * var7 + var3 * this.ao;
      this.ao = var2 * this.ao - var7 * var3;
   }

   void at() {
      this.ao = 0.0F;
      this.ay = 0.0F;
      this.aa = 0.0F;
      this.al = 0.0F;
      this.aq = 0.0F;
      this.ab = 0.0F;
      this.ac = 0.0F;
      this.aw = 0.0F;
      this.an = 0.0F;
      this.at = 1.0F;
      this.au = 1.0F;
      this.af = 1.0F;
   }

   void ar(float var1) {
      float var2 = (float)Math.cos((double)var1);
      float var3 = (float)Math.sin((double)var1);
      float var4 = this.af;
      float var5 = this.ac;
      float var6 = this.aq;
      float var7 = this.aa;
      this.af = var4 * var2 - this.an * var3;
      this.an = var2 * this.an + var4 * var3;
      this.ac = var5 * var2 - this.au * var3;
      this.au = var3 * var5 + var2 * this.au;
      this.aq = var2 * var6 - this.al * var3;
      this.al = var2 * this.al + var3 * var6;
      this.aa = var2 * var7 - var3 * this.ay;
      this.ay = var2 * this.ay + var3 * var7;
   }

   void ay(float var1) {
      float var2 = (float)Math.cos((double)var1);
      float var3 = (float)Math.sin((double)var1);
      float var4 = this.an;
      float var5 = this.au;
      float var6 = this.al;
      float var7 = this.ay;
      this.an = var4 * var2 - this.aw * var3;
      this.aw = this.aw * var2 + var3 * var4;
      this.au = var2 * var5 - var3 * this.ab;
      this.ab = this.ab * var2 + var5 * var3;
      this.al = var6 * var2 - var3 * this.at;
      this.at = this.at * var2 + var3 * var6;
      this.ay = var2 * var7 - this.ao * var3;
      this.ao = var3 * var7 + var2 * this.ao;
   }

   void aq() {
      this.ao = 0.0F;
      this.ay = 0.0F;
      this.aa = 0.0F;
      this.al = 0.0F;
      this.aq = 0.0F;
      this.ab = 0.0F;
      this.ac = 0.0F;
      this.aw = 0.0F;
      this.an = 0.0F;
      this.at = 1.0F;
      this.au = 1.0F;
      this.af = 1.0F;
   }

   qc() {
      try {
         super();
         this.af((short)-23475);
      } catch (RuntimeException var1) {
         throw db.an(var1, "qc.<init>(" + ')');
      }
   }

   void al() {
      this.ao = 0.0F;
      this.ay = 0.0F;
      this.aa = 0.0F;
      this.al = 0.0F;
      this.aq = 0.0F;
      this.ab = 0.0F;
      this.ac = 0.0F;
      this.aw = 0.0F;
      this.an = 0.0F;
      this.at = 1.0F;
      this.au = 1.0F;
      this.af = 1.0F;
   }

   void aa(float var1) {
      float var2 = (float)Math.cos((double)var1);
      float var3 = (float)Math.sin((double)var1);
      float var4 = this.an;
      float var5 = this.au;
      float var6 = this.al;
      float var7 = this.ay;
      this.an = var4 * var2 - this.aw * var3;
      this.aw = this.aw * var2 + var3 * var4;
      this.au = var2 * var5 - var3 * this.ab;
      this.ab = this.ab * var2 + var5 * var3;
      this.al = var6 * var2 - var3 * this.at;
      this.at = this.at * var2 + var3 * var6;
      this.ay = var2 * var7 - this.ao * var3;
      this.ao = var3 * var7 + var2 * this.ao;
   }

   void ah(float var1) {
      float var2 = (float)Math.cos((double)var1);
      float var3 = (float)Math.sin((double)var1);
      float var4 = this.af;
      float var5 = this.ac;
      float var6 = this.aq;
      float var7 = this.aa;
      this.af = var3 * this.aw + var2 * var4;
      this.aw = var2 * this.aw - var4 * var3;
      this.ac = var3 * this.ab + var5 * var2;
      this.ab = this.ab * var2 - var5 * var3;
      this.aq = var3 * this.at + var2 * var6;
      this.at = this.at * var2 - var3 * var6;
      this.aa = var2 * var7 + var3 * this.ao;
      this.ao = var2 * this.ao - var7 * var3;
   }

   void av(float var1) {
      float var2 = (float)Math.cos((double)var1);
      float var3 = (float)Math.sin((double)var1);
      float var4 = this.af;
      float var5 = this.ac;
      float var6 = this.aq;
      float var7 = this.aa;
      this.af = var4 * var2 - this.an * var3;
      this.an = var2 * this.an + var4 * var3;
      this.ac = var5 * var2 - this.au * var3;
      this.au = var3 * var5 + var2 * this.au;
      this.aq = var2 * var6 - this.al * var3;
      this.al = var2 * this.al + var3 * var6;
      this.aa = var2 * var7 - var3 * this.ay;
      this.ay = var2 * this.ay + var3 * var7;
   }

   void ax(float var1) {
      float var2 = (float)Math.cos((double)var1);
      float var3 = (float)Math.sin((double)var1);
      float var4 = this.an;
      float var5 = this.au;
      float var6 = this.al;
      float var7 = this.ay;
      this.an = var4 * var2 - this.aw * var3;
      this.aw = this.aw * var2 + var3 * var4;
      this.au = var2 * var5 - var3 * this.ab;
      this.ab = this.ab * var2 + var5 * var3;
      this.al = var6 * var2 - var3 * this.at;
      this.at = this.at * var2 + var3 * var6;
      this.ay = var2 * var7 - this.ao * var3;
      this.ao = var3 * var7 + var2 * this.ao;
   }

   static final void ns(int var0, int var1, int var2, int var3, tq var4, ll var5, int var6) {
      try {
         if (var4 == null) {
            if (var6 != -1609285207) {
               throw new IllegalStateException();
            }
         } else {
            int var7 = client.kf * 704283033 & 2047;
            int var8 = var3 * var3 + var2 * var2;
            if (var8 > 6400) {
               if (var6 != -1609285207) {
                  throw new IllegalStateException();
               }
            } else {
               int var9 = in.ac[var7];
               int var10 = in.au[var7];
               int var11 = var2 * var10 + var3 * var9 >> 16;
               int var12 = var3 * var10 - var9 * var2 >> 16;
               if (var8 > 2500) {
                  if (var6 != -1609285207) {
                     throw new IllegalStateException();
                  }

                  var4.bi(var5.af * 1484188043 / 2 + var11 - var4.ab / 2, var5.an * 939947663 / 2 - var12 - var4.aq / 2, var0, var1, 1484188043 * var5.af, 939947663 * var5.an, var5.ac, var5.aw);
               } else {
                  var4.ax(var11 + var0 + var5.af * 1484188043 / 2 - var4.ab / 2, 939947663 * var5.an / 2 + var1 - var12 - var4.aq / 2);
               }

            }
         }
      } catch (RuntimeException var13) {
         throw db.an(var13, "qc.ns(" + ')');
      }
   }
}
