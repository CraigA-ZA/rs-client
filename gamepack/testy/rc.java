import accessors.RSNodeHashTable;

public final class rc implements RSNodeHashTable {
   rp ac;
   rp[] an;
   int af;
   rp aw;
   int au = 0;

   public void ao(rp var1, long var2) {
      if (var1.hg != null) {
         var1.ga();
      }

      rp var4 = this.an[(int)(var2 & (long)(this.af - 1))];
      var1.hg = var4.hg;
      var1.hc = var4;
      var1.hg.hc = var1;
      var1.hc.hg = var1;
      var1.hr = var2;
   }

   public rp af(long var1) {
      rp var3 = this.an[(int)(var1 & (long)(this.af - 1))];

      for(this.aw = var3.hc; this.aw != var3; this.aw = this.aw.hc) {
         if (this.aw.hr == var1) {
            rp var4 = this.aw;
            this.aw = this.aw.hc;
            return var4;
         }
      }

      this.aw = null;
      return null;
   }

   public void an(rp var1, long var2) {
      if (var1.hg != null) {
         var1.ga();
      }

      rp var4 = this.an[(int)(var2 & (long)(this.af - 1))];
      var1.hg = var4.hg;
      var1.hc = var4;
      var1.hg.hc = var1;
      var1.hc.hg = var1;
      var1.hr = var2;
   }

   public rp at(long var1) {
      rp var3 = this.an[(int)(var1 & (long)(this.af - 1))];

      for(this.aw = var3.hc; this.aw != var3; this.aw = this.aw.hc) {
         if (this.aw.hr == var1) {
            rp var4 = this.aw;
            this.aw = this.aw.hc;
            return var4;
         }
      }

      this.aw = null;
      return null;
   }

   public rp ac() {
      rp var1;
      if (this.au > 0 && this.ac != this.an[this.au - 1]) {
         var1 = this.ac;
         this.ac = var1.hc;
         return var1;
      } else {
         do {
            if (this.au >= this.af) {
               return null;
            }

            var1 = this.an[this.au++].hc;
         } while(var1 == this.an[this.au - 1]);

         this.ac = var1.hc;
         return var1;
      }
   }

   public rp au(long var1) {
      rp var3 = this.an[(int)(var1 & (long)(this.af - 1))];

      for(this.aw = var3.hc; this.aw != var3; this.aw = this.aw.hc) {
         if (this.aw.hr == var1) {
            rp var4 = this.aw;
            this.aw = this.aw.hc;
            return var4;
         }
      }

      this.aw = null;
      return null;
   }

   public rp ab(long var1) {
      rp var3 = this.an[(int)(var1 & (long)(this.af - 1))];

      for(this.aw = var3.hc; this.aw != var3; this.aw = this.aw.hc) {
         if (this.aw.hr == var1) {
            rp var4 = this.aw;
            this.aw = this.aw.hc;
            return var4;
         }
      }

      this.aw = null;
      return null;
   }

   public rp aw() {
      this.au = 0;
      return this.ac();
   }

   public rp aq(long var1) {
      rp var3 = this.an[(int)(var1 & (long)(this.af - 1))];

      for(this.aw = var3.hc; this.aw != var3; this.aw = this.aw.hc) {
         if (this.aw.hr == var1) {
            rp var4 = this.aw;
            this.aw = this.aw.hc;
            return var4;
         }
      }

      this.aw = null;
      return null;
   }

   public rp al(long var1) {
      rp var3 = this.an[(int)(var1 & (long)(this.af - 1))];

      for(this.aw = var3.hc; this.aw != var3; this.aw = this.aw.hc) {
         if (this.aw.hr == var1) {
            rp var4 = this.aw;
            this.aw = this.aw.hc;
            return var4;
         }
      }

      this.aw = null;
      return null;
   }

   public void aa(rp var1, long var2) {
      if (var1.hg != null) {
         var1.ga();
      }

      rp var4 = this.an[(int)(var2 & (long)(this.af - 1))];
      var1.hg = var4.hg;
      var1.hc = var4;
      var1.hg.hc = var1;
      var1.hc.hg = var1;
      var1.hr = var2;
   }

   public void ay(rp var1, long var2) {
      if (var1.hg != null) {
         var1.ga();
      }

      rp var4 = this.an[(int)(var2 & (long)(this.af - 1))];
      var1.hg = var4.hg;
      var1.hc = var4;
      var1.hg.hc = var1;
      var1.hc.hg = var1;
      var1.hr = var2;
   }

   public rp ah() {
      rp var1;
      if (this.au > 0 && this.ac != this.an[this.au - 1]) {
         var1 = this.ac;
         this.ac = var1.hc;
         return var1;
      } else {
         do {
            if (this.au >= this.af) {
               return null;
            }

            var1 = this.an[this.au++].hc;
         } while(var1 == this.an[this.au - 1]);

         this.ac = var1.hc;
         return var1;
      }
   }

   public void ax(rp var1, long var2) {
      if (var1.hg != null) {
         var1.ga();
      }

      rp var4 = this.an[(int)(var2 & (long)(this.af - 1))];
      var1.hg = var4.hg;
      var1.hc = var4;
      var1.hg.hc = var1;
      var1.hc.hg = var1;
      var1.hr = var2;
   }

   public rp ai() {
      this.au = 0;
      return this.ac();
   }

   public rp ag() {
      rp var1;
      if (this.au > 0 && this.ac != this.an[this.au - 1]) {
         var1 = this.ac;
         this.ac = var1.hc;
         return var1;
      } else {
         do {
            if (this.au >= this.af) {
               return null;
            }

            var1 = this.an[this.au++].hc;
         } while(var1 == this.an[this.au - 1]);

         this.ac = var1.hc;
         return var1;
      }
   }

   public rp av() {
      rp var1;
      if (this.au > 0 && this.ac != this.an[this.au - 1]) {
         var1 = this.ac;
         this.ac = var1.hc;
         return var1;
      } else {
         do {
            if (this.au >= this.af) {
               return null;
            }

            var1 = this.an[this.au++].hc;
         } while(var1 == this.an[this.au - 1]);

         this.ac = var1.hc;
         return var1;
      }
   }

   public rc(int var1) {
      this.af = var1;
      this.an = new rp[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         rp var3 = this.an[var2] = new rp();
         var3.hc = var3;
         var3.hg = var3;
      }

   }

   public rp ar() {
      rp var1;
      if (this.au > 0 && this.ac != this.an[this.au - 1]) {
         var1 = this.ac;
         this.ac = var1.hc;
         return var1;
      } else {
         do {
            if (this.au >= this.af) {
               return null;
            }

            var1 = this.an[this.au++].hc;
         } while(var1 == this.an[this.au - 1]);

         this.ac = var1.hc;
         return var1;
      }
   }
}
