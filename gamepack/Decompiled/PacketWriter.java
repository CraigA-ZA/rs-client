import java.awt.Image;
import java.io.IOException;

public class PacketWriter {
   static Image bo;
   boolean at = true;
   int aa = 0;
   int al = 0;
   int aw = 0;
   int ay = 0;
   ServerProt ai;
   ServerProt ao;
   ServerProt aq = null;
   ServerProt ax;
   IterableNodeDeque an = new IterableNodeDeque();
   AbstractSocket af;
   Packet ac = new Packet(5000);
   PacketBit ab = new PacketBit(40000);
   public Isaac au;

   PacketWriter() {
   }

   final void af() {
      this.an.clear0();
      this.aw = 0;
   }

   final void an() throws IOException {
      if (null != this.af && -1859952183 * this.aw > 0) {
         this.ac.at = 0;

         while(true) {
            PacketBitNode var2 = (PacketBitNode)this.an.last();
            if (null == var2 || 1816684323 * var2.ac > this.ac.al.length - this.ac.at * -1633313603) {
               this.af.ab(this.ac.al, 0, this.ac.at * -1633313603);
               this.ay = 0;
               break;
            }

            this.ac.cs(var2.aw.al, 0, 1816684323 * var2.ac);
            this.aw -= -56666229 * var2.ac;
            var2.remove();
            var2.aw.bg();
            var2.clearAll();
         }
      }

   }

   public final void aw(PacketBitNode var1) {
      this.an.addFirst(var1);
      var1.ac = -1120134497 * var1.aw.at;
      var1.aw.at = 0;
      this.aw += var1.ac * -56666229;
   }

   void setSocket(AbstractSocket var1) {
      this.af = var1;
   }

   void au() {
      if (this.af != null) {
         this.af.aq();
         this.af = null;
      }

   }

   void ab() {
      this.af = null;
   }

   AbstractSocket getSocket() {
      return this.af;
   }
}
