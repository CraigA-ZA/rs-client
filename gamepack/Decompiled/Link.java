public class Link {
   public Link ac;
   public Link au;

   public void remove() {
      if (this.au != null) {
         this.au.ac = this.ac;
         this.ac.au = this.au;
         this.ac = null;
         this.au = null;
      }
   }
}
