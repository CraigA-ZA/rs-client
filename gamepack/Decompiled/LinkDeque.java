public class LinkDeque {
   Link af = new Link();
   Link an;

   public LinkDeque() {
      this.af.ac = this.af;
      this.af.au = this.af;
   }

   public void af(Link var1) {
      if (var1.au != null) {
         var1.remove();
      }

      var1.au = this.af.au;
      var1.ac = this.af;
      var1.au.ac = var1;
      var1.ac.au = var1;
   }

   public Link an() {
      Link var1 = this.af.ac;
      if (var1 == this.af) {
         this.an = null;
         return null;
      } else {
         this.an = var1.ac;
         return var1;
      }
   }

   public Link aw() {
      Link var1 = this.an;
      if (var1 == this.af) {
         this.an = null;
         return null;
      } else {
         this.an = var1.ac;
         return var1;
      }
   }
}
