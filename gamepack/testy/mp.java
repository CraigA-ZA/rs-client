import accessors.RSDirectByteArrayCopier;
import java.nio.ByteBuffer;

public class mp extends mx implements RSDirectByteArrayCopier {
   ByteBuffer af;
   static int aq;

   byte[] ac(int var1) {
      try {
         byte[] var2 = new byte[this.af.capacity()];
         this.af.position(0);
         this.af.get(var2);
         return var2;
      } catch (RuntimeException var3) {
         throw db.an(var3, "mp.ac(" + ')');
      }
   }

   void ar(byte[] var1) {
      this.af = ByteBuffer.allocateDirect(var1.length);
      this.af.position(0);
      this.af.put(var1);
   }

   void au(byte[] var1, int var2) {
      try {
         this.af = ByteBuffer.allocateDirect(var1.length);
         this.af.position(0);
         this.af.put(var1);
      } catch (RuntimeException var3) {
         throw db.an(var3, "mp.au(" + ')');
      }
   }

   mp() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw db.an(var1, "mp.<init>(" + ')');
      }
   }

   byte[] av() {
      byte[] var1 = new byte[this.af.capacity()];
      this.af.position(0);
      this.af.get(var1);
      return var1;
   }
}
