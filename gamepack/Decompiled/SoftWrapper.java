import java.lang.ref.SoftReference;

public class SoftWrapper extends Wrapper {
   SoftReference af;

   SoftWrapper(Object var1, int var2) {
      super(var2);
      this.af = new SoftReference(var1);
   }

   Object get() {
      return this.af.get();
   }

   boolean isSoft() {
      return true;
   }
}
