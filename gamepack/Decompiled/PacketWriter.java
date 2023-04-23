import java.awt.Image;
import java.io.IOException;

public class PacketWriter {
   static Image pauseImage;
   boolean at = true;
   int aa = 0;
   int al = 0;
   int serverPacket0Length = 0;
   int ay = 0;
   ServerProt ai;
   ServerProt ao;
   ServerProt serverPacket0 = null;
   ServerProt ax;
   IterableNodeDeque bitNodes = new IterableNodeDeque();
   AbstractSocket socket0;
   Packet packet = new Packet(5000);
   PacketBit bit = new PacketBit(40000);
   public Isaac au;

   PacketWriter() {
   }

   final void af() {
      this.bitNodes.clear0();
      this.serverPacket0Length = 0;
   }

   final void an() throws IOException {
      if (null != this.socket0 && -1859952183 * this.serverPacket0Length > 0) {
         this.packet.index = 0;

         while(true) {
            PacketBitNode var2 = (PacketBitNode)this.bitNodes.last();
            if (null == var2 || 1816684323 * var2.ac > this.packet.array.length - this.packet.index * -1633313603) {
               this.socket0.ab(this.packet.array, 0, this.packet.index * -1633313603);
               this.ay = 0;
               break;
            }

            this.packet.cs(var2.bit.array, 0, 1816684323 * var2.ac);
            this.serverPacket0Length -= -56666229 * var2.ac;
            var2.remove();
            var2.bit.bg();
            var2.clearAll();
         }
      }

   }

   public final void aw(PacketBitNode var1) {
      this.bitNodes.addFirst(var1);
      var1.ac = -1120134497 * var1.bit.index;
      var1.bit.index = 0;
      this.serverPacket0Length += var1.ac * -56666229;
   }

   void setSocket(AbstractSocket var1) {
      this.socket0 = var1;
   }

   void au() {
      if (this.socket0 != null) {
         this.socket0.aq();
         this.socket0 = null;
      }

   }

   void ab() {
      this.socket0 = null;
   }

   AbstractSocket getSocket() {
      return this.socket0;
   }
}
