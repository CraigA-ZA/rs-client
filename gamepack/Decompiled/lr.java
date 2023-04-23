import java.net.MalformedURLException;
import java.net.URL;

public class lr {
   UrlRequest af;
   Sprite an;

   lr(String var1, UrlRequester var2) {
      try {
         this.af = var2.request(new URL(var1));
      } catch (MalformedURLException var4) {
         this.af = null;
      }

   }

   lr(UrlRequest var1) {
      this.af = var1;
   }

   Sprite af() {
      if (null == this.an && this.af != null && this.af.isDone()) {
         if (this.af.getResponse() != null) {
            this.an = Strings.imageToSprite(this.af.getResponse());
         }

         this.af = null;
      }

      return this.an;
   }
}
