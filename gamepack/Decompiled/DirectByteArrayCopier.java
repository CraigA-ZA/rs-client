import java.nio.ByteBuffer;

public class DirectByteArrayCopier extends AbstractByteArrayCopier {
   static int aq;
   ByteBuffer directBuffer;

   DirectByteArrayCopier() {
   }

   byte[] get() {
      byte[] var2 = new byte[this.directBuffer.capacity()];
      this.directBuffer.position(0);
      this.directBuffer.get(var2);
      return var2;
   }

   void set(byte[] var1) {
      this.directBuffer = ByteBuffer.allocateDirect(var1.length);
      this.directBuffer.position(0);
      this.directBuffer.put(var1);
   }
}
