import accessors.RSSoftWrapper;
import java.lang.ref.SoftReference;

public class ky extends kf implements RSSoftWrapper {
   SoftReference af;

   ky(Object var1, int var2) {
      super(var2);
      this.af = new SoftReference(var1);
   }

   Object af() {
      return this.af.get();
   }

   boolean an() {
      return true;
   }

   Object aw() {
      return this.af.get();
   }

   boolean au() {
      return true;
   }

   Object ac() {
      return this.af.get();
   }

   boolean ab() {
      return true;
   }

   boolean aq() {
      return true;
   }
}
