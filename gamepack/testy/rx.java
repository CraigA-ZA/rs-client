import accessors.RSLink;

public class rx implements RSLink {
   public rx ac;
   public rx au;

   public void af() {
      if (this.au != null) {
         this.au.ac = this.ac;
         this.ac.au = this.au;
         this.ac = null;
         this.au = null;
      }
   }
}
