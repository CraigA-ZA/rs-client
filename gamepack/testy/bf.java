import accessors.RSSoundEnvelope;

public class bf implements RSSoundEnvelope {
   int ab;
   int[] an = new int[2];
   int af = 2;
   int ac;
   int au;
   int at;
   int aq;
   int[] aw = new int[2];
   int al;
   int aa;
   int ay;

   final void aq(sg var1) {
      this.ab = var1.cm((byte)7);
      this.ac = var1.cx(-1284662081);
      this.au = var1.cx(-1008611028);
      this.an(var1);
   }

   final void af(sg var1) {
      this.ab = var1.cm((byte)7);
      this.ac = var1.cx(-1298878479);
      this.au = var1.cx(-1260891186);
      this.an(var1);
   }

   bf() {
      this.an[0] = 0;
      this.an[1] = 65535;
      this.aw[0] = 0;
      this.aw[1] = 65535;
   }

   final void at(sg var1) {
      this.af = var1.cm((byte)7);
      this.an = new int[this.af];
      this.aw = new int[this.af];

      for(int var2 = 0; var2 < this.af; ++var2) {
         this.an[var2] = var1.cl(-181251105);
         this.aw[var2] = var1.cl(835883809);
      }

   }

   final int ac(int var1) {
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

   final void au(sg var1) {
      this.ab = var1.cm((byte)7);
      this.ac = var1.cx(-988955935);
      this.au = var1.cx(-954445584);
      this.an(var1);
   }

   final void ab(sg var1) {
      this.ab = var1.cm((byte)7);
      this.ac = var1.cx(-1991624058);
      this.au = var1.cx(-1266373950);
      this.an(var1);
   }

   final void aw() {
      this.aq = 0;
      this.al = 0;
      this.at = 0;
      this.aa = 0;
      this.ay = 0;
   }

   final void al(sg var1) {
      this.af = var1.cm((byte)7);
      this.an = new int[this.af];
      this.aw = new int[this.af];

      for(int var2 = 0; var2 < this.af; ++var2) {
         this.an[var2] = var1.cl(-1731847894);
         this.aw[var2] = var1.cl(-1922543797);
      }

   }

   final int ao(int var1) {
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

   final void aa() {
      this.aq = 0;
      this.al = 0;
      this.at = 0;
      this.aa = 0;
      this.ay = 0;
   }

   final int ay(int var1) {
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

   final void an(sg var1) {
      this.af = var1.cm((byte)7);
      this.an = new int[this.af];
      this.aw = new int[this.af];

      for(int var2 = 0; var2 < this.af; ++var2) {
         this.an[var2] = var1.cl(101811866);
         this.aw[var2] = var1.cl(-1134388939);
      }

   }
}
