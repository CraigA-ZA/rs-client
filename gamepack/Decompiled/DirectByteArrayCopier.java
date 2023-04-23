import java.nio.ByteBuffer;

public class DirectByteArrayCopier extends AbstractByteArrayCopier {
   static int aq;
   ByteBuffer af;

   DirectByteArrayCopier() {
   }

   byte[] get() {
      byte[] var2 = new byte[this.af.capacity()];
      this.af.position(0);
      this.af.get(var2);
      return var2;
   }

   void set(byte[] var1) {
      this.af = ByteBuffer.allocateDirect(var1.length);
      this.af.position(0);
      this.af.put(var1);
   }
}
