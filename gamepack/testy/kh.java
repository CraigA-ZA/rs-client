import accessors.RSEvictingDualNodeHashTable;

public final class kh implements RSEvictingDualNodeHashTable {
   int aw;
   rk af = new rk();
   int an;
   ro ac;
   ox au = new ox();

   public void an(long var1) {
      rk var3 = (rk)this.ac.af(var1);
      if (var3 != null) {
         var3.ga();
         var3.fs();
         ++this.aw;
      }

   }

   public rk af(long var1) {
      rk var3 = (rk)this.ac.af(var1);
      if (var3 != null) {
         this.au.an(var3);
      }

      return var3;
   }

   public rk ab(long var1) {
      rk var3 = (rk)this.ac.af(var1);
      if (var3 != null) {
         this.au.an(var3);
      }

      return var3;
   }

   public void aw(rk var1, long var2) {
      if (this.aw == 0) {
         rk var4 = this.au.ac();
         var4.ga();
         var4.fs();
         if (var4 == this.af) {
            var4 = this.au.ac();
            var4.ga();
            var4.fs();
         }
      } else {
         --this.aw;
      }

      this.ac.an(var1, var2);
      this.au.an(var1);
   }

   public kh(int var1) {
      this.an = var1;
      this.aw = var1;

      int var2;
      for(var2 = 1; var2 + var2 < var1; var2 += var2) {
      }

      this.ac = new ro(var2);
   }

   public void at(long var1) {
      rk var3 = (rk)this.ac.af(var1);
      if (var3 != null) {
         var3.ga();
         var3.fs();
         ++this.aw;
      }

   }

   public void al(long var1) {
      rk var3 = (rk)this.ac.af(var1);
      if (var3 != null) {
         var3.ga();
         var3.fs();
         ++this.aw;
      }

   }

   public void aq(long var1) {
      rk var3 = (rk)this.ac.af(var1);
      if (var3 != null) {
         var3.ga();
         var3.fs();
         ++this.aw;
      }

   }

   public void ac() {
      this.au.af();
      this.ac.aw();
      this.af = new rk();
      this.aw = this.an;
   }

   public rk au(long var1) {
      rk var3 = (rk)this.ac.af(var1);
      if (var3 != null) {
         this.au.an(var3);
      }

      return var3;
   }

   public void aa() {
      this.au.af();
      this.ac.aw();
      this.af = new rk();
      this.aw = this.an;
   }

   public void ay() {
      this.au.af();
      this.ac.aw();
      this.af = new rk();
      this.aw = this.an;
   }
}
