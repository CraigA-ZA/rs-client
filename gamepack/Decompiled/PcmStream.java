public abstract class PcmStream extends Node {
   volatile boolean active = true;
   PcmStream after;
   AbstractSound sound;
   int av;

   protected abstract PcmStream aq();

   protected abstract PcmStream ab();

   protected abstract int al();

   final void update(int[] var1, int var2, int var3) {
      if (this.active) {
         this.fill(var1, var2, var3);
      } else {
         this.skip(var3);
      }

   }

   protected PcmStream() {
   }

   protected abstract void skip(int var1);

   int ba() {
      return 255;
   }

   protected abstract void fill(int[] var1, int var2, int var3);
}
