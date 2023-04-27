public class Timer {
   int aa = 0;
   int al = 0;
   int aq = 0;
   int at = 0;
   long ab = 0L;
   long ac = 0L;
   long af = -5350971994514083981L;
   long an = -5863289074674602131L;
   long au = 0L;
   public boolean aw = false;

   public void af() {
      this.af = Formatting.currentTimeMs() * 5350971994514083981L;
   }

   public void an() {
      if (this.af * -5348577498961612219L != -1L) {
         this.au = (Formatting.currentTimeMs() - -5348577498961612219L * this.af) * 6923964062330699407L;
         this.af = -5350971994514083981L;
      }

   }

   public void aw(int var1) {
      this.an = Formatting.currentTimeMs() * 5863289074674602131L;
      this.aq = var1 * 1375078489;
   }

   public void ac() {
      if (-1L != -1205622465697215077L * this.an) {
         this.ac = (Formatting.currentTimeMs() - this.an * -1205622465697215077L) * 2956472643969238227L;
         this.an = -5863289074674602131L;
      }

      this.at += 856944459;
      this.aw = true;
   }

   public void au() {
      this.aw = false;
      this.al = 0;
   }

   public void ab() {
      this.ac();
   }

   public void write(Packet var1) {
      long var3 = -6021685739129757585L * this.au;
      var3 /= 10L;
      if (var3 < 0L) {
         var3 = 0L;
      } else if (var3 > 65535L) {
         var3 = 65535L;
      }

      var1.p2((int)var3);
      long var5 = -2218855404195630245L * this.ac;
      var5 /= 10L;
      if (var5 < 0L) {
         var5 = 0L;
      } else if (var5 > 65535L) {
         var5 = 65535L;
      }

      var1.p2((int)var5);
      long var7 = this.ab * 8532053387917432831L;
      var7 /= 10L;
      if (var7 < 0L) {
         var7 = 0L;
      } else if (var7 > 65535L) {
         var7 = 65535L;
      }

      var1.p2((int)var7);
      var1.p2(-1298612247 * this.aq);
      var1.p2(-3830165 * this.al);
      var1.p2(1920442979 * this.at);
      var1.p2(this.aa * -1000691937);
   }
}
