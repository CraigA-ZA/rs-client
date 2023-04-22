public abstract class Wrapper extends DualNode {
   final int size;

   abstract boolean isSoft();

   Wrapper(int var1) {
      this.size = var1;
   }

   abstract Object get();
}
