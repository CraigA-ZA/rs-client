public abstract class PcmStream extends Node {
   PcmStream after;
   AbstractSound sound;
   int av;
   volatile boolean active = true;

   protected PcmStream() {
   }

   int ba() {
      return 255;
   }

   final void update(int[] var1, int var2, int var3) {
      if (this.active) {
         this.fill(var1, var2, var3);
      } else {
         this.skip(var3);
      }

   }

   protected abstract PcmStream nextSubStream();

   protected abstract PcmStream firstSubStream();

   protected abstract int al();

   protected abstract void skip(int var1);

   protected abstract void fill(int[] var1, int var2, int var3);
}
