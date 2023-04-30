public abstract class Wrapper extends DualNode {
   final int size;

   Wrapper(int var1) {
      this.size = var1;
   }

   abstract boolean isSoft();

   abstract Object get();
}
