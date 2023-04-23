public class DirectWrapper extends Wrapper {
   Object af;

   DirectWrapper(Object var1, int var2) {
      super(var2);
      this.af = var1;
   }

   Object get() {
      return this.af;
   }

   boolean isSoft() {
      return false;
   }
}
