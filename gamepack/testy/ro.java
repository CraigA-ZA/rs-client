import accessors.RSIterableNodeHashTable;
import java.util.Iterator;

public final class ro implements Iterable, RSIterableNodeHashTable {
   rp[] an;
   int af;
   rp aw;
   rp ac;
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

   public void aw() {
      for(int var1 = 0; var1 < this.af; ++var1) {
         rp var2 = this.an[var1];

         while(true) {
            rp var3 = var2.hc;
            if (var3 == var2) {
               break;
            }

            var3.ga();
         }
      }

      this.aw = null;
      this.ac = null;
   }

   public rp ac() {
      this.au = 0;
      return this.au();
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

   public Iterator iterator() {
      return new rj(this);
   }

   public Iterator br() {
      return new rj(this);
   }

   public rp au() {
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

   public ro(int var1) {
      this.af = var1;
      this.an = new rp[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         rp var3 = this.an[var2] = new rp();
         var3.hc = var3;
         var3.hg = var3;
      }

   }

   public Iterator bu() {
      return new rj(this);
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

   public rp aa(long var1) {
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

   public rp ax() {
      this.au = 0;
      return this.au();
   }

   public rp ai() {
      this.au = 0;
      return this.au();
   }

   public rp ag() {
      this.au = 0;
      return this.au();
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

   public Iterator bg() {
      return new rj(this);
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
