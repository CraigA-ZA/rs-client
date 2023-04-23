public class SoundEnvelope {
   int aa;
   int ab;
   int ac;
   int af = 2;
   int al;
   int aq;
   int at;
   int au;
   int ay;
   int[] an = new int[2];
   int[] aw = new int[2];

   SoundEnvelope() {
      this.an[0] = 0;
      this.an[1] = 65535;
      this.aw[0] = 0;
      this.aw[1] = 65535;
   }

   final void decode(Packet var1) {
      this.ab = var1.g1();
      this.ac = var1.g4s();
      this.au = var1.g4s();
      this.decodeSegments(var1);
   }

   final void decodeSegments(Packet var1) {
      this.af = var1.g1();
      this.an = new int[this.af];
      this.aw = new int[this.af];

      for(int var2 = 0; var2 < this.af; ++var2) {
         this.an[var2] = var1.cl();
         this.aw[var2] = var1.cl();
      }

   }

   final void reset() {
      this.aq = 0;
      this.al = 0;
      this.at = 0;
      this.aa = 0;
      this.ay = 0;
   }

   final int doStep(int var1) {
      if (this.ay >= this.aq) {
         this.aa = this.aw[this.al++] << 15;
         if (this.al >= this.af) {
            this.al = this.af - 1;
         }

         this.aq = (int)((double)this.an[this.al] / 65536.0 * (double)var1);
         if (this.aq > this.ay) {
            this.at = ((this.aw[this.al] << 15) - this.aa) / (this.aq - this.ay);
         }
      }

      this.aa += this.at;
      ++this.ay;
      return this.aa - this.at >> 15;
   }
}
