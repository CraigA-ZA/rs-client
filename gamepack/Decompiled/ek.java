public class ek {
   static int kh;
   boolean ab;
   boolean af;
   boolean an;
   boolean av = true;
   ev[] au;
   ex ac;
   ex aw;
   float aa;
   float ag;
   float ah;
   float ai;
   float ak;
   float al;
   float ao;
   float aq;
   float at;
   float ax;
   float ay;
   float az;
   float[] am;
   int aj;
   int ar = 0;
   int as;

   public static sz an_renamed(int var0) {
      sz var2 = (sz)sz.an.get((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = sz.af.takeFile(38, var0);
         var2 = new sz();
         if (null != var3) {
            var2.decode(new Packet(var3));
         }

         var2.ab();
         sz.an.put(var2, (long)var0);
         return var2;
      }
   }

   ek() {
   }

   int af(Packet var1, int var2) {
      int var4 = var1.cl();
      gg.ab_renamed(var1.g1());
      this.aw = dp.ab_renamed(var1.g1());
      this.ac = dp.ab_renamed(var1.g1());
      this.af = var1.g1() != 0;
      this.au = new ev[var4];
      ev var5 = null;

      for(int var6 = 0; var6 < var4; ++var6) {
         ev var7 = new ev();
         var7.af(var1, var2);
         this.au[var6] = var7;
         if (null != var5) {
            var5.aq = var7;
         }

         var5 = var7;
      }

      return var4;
   }

   void an() {
      this.as = this.au[0].af * 1112222701;
      this.aj = this.au[this.at() - 1].af * -261315509;
      this.am = new float[this.ab() + 1];

      for(int var2 = this.ac(); var2 <= this.au(); ++var2) {
         this.am[var2 - this.ac()] = GrandExchangeEvent.af_renamed(this, (float)var2);
      }

      this.au = null;
      this.ak = GrandExchangeEvent.af_renamed(this, (float)(this.ac() - 1));
      this.az = GrandExchangeEvent.af_renamed(this, (float)(this.au() + 1));
   }

   public float aw(int var1) {
      if (var1 < this.ac()) {
         return this.ak;
      } else {
         return var1 > this.au() ? this.az : this.am[var1 - this.ac()];
      }
   }

   int ac() {
      return -1357454691 * this.as;
   }

   int au() {
      return -26337941 * this.aj;
   }

   int ab() {
      return this.au() - this.ac();
   }

   int aq(float var1) {
      if (-1335067433 * this.ar < 0 || !((float)(-834721191 * this.au[this.ar * -1335067433].af) <= var1) || this.au[-1335067433 * this.ar].aq != null && !((float)(-834721191 * this.au[this.ar * -1335067433].aq.af) > var1)) {
         if (!(var1 < (float)this.ac()) && !(var1 > (float)this.au())) {
            int var3 = this.at();
            int var4 = -1335067433 * this.ar;
            if (var3 > 0) {
               int var5 = 0;
               int var6 = var3 - 1;

               do {
                  int var7 = var5 + var6 >> 1;
                  if (var1 < (float)(-834721191 * this.au[var7].af)) {
                     if (var1 > (float)(-834721191 * this.au[var7 - 1].af)) {
                        var4 = var7 - 1;
                        break;
                     }

                     var6 = var7 - 1;
                  } else {
                     if (!(var1 > (float)(-834721191 * this.au[var7].af))) {
                        var4 = var7;
                        break;
                     }

                     if (var1 < (float)(this.au[1 + var7].af * -834721191)) {
                        var4 = var7;
                        break;
                     }

                     var5 = var7 + 1;
                  }
               } while(var5 <= var6);
            }

            if (var4 != this.ar * -1335067433) {
               this.ar = -2085996825 * var4;
               this.av = true;
            }

            return -1335067433 * this.ar;
         } else {
            return -1;
         }
      } else {
         return this.ar * -1335067433;
      }
   }

   ev al(float var1) {
      int var3 = this.aq(var1);
      return var3 >= 0 && var3 < this.au.length ? this.au[var3] : null;
   }

   int at() {
      return null == this.au ? 0 : this.au.length;
   }
}
