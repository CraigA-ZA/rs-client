import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;

public class Ignored extends User {
   int af;

   Ignored() {
   }

   int compareTo00(Ignored var1) {
      return this.af * -1260376973 - var1.af * -1260376973;
   }

   public int compareTo0(User var1) {
      return this.compareTo00((Ignored)var1);
   }

   public int compareTo(Object var1) {
      return this.compareTo00((Ignored)var1);
   }

   public static void af_renamed(String var0, boolean var1, boolean var2) {
      if (var1) {
         if (!var2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
               Desktop.getDesktop().browse(new URI(var0));
               return;
            } catch (Exception var5) {
            }
         }

         if (bx.an.startsWith("win") && !var2) {
            cf.an_renamed(var0, 0);
         } else if (bx.an.startsWith("mac")) {
            ia.aw_renamed(var0, 1, "openjs");
         } else {
            ia.aw_renamed(var0, 2, "openjs");
         }
      } else {
         ia.aw_renamed(var0, 3, "openjs");
      }

   }
}
