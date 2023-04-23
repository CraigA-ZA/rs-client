public abstract class Wrapper extends DualNode {
   final int an;

   Wrapper(int var1) {
      this.an = var1;
   }

   abstract boolean isSoft();

   abstract Object get();
}
