import java.awt.Image;
import java.io.IOException;

public class PacketWriter {
   IterableNodeDeque bitNodes = new IterableNodeDeque();
   ServerProt serverPacket0 = null;
   int serverPacket0Length = 0;
   Packet packet = new Packet(5000);
   public Isaac au;
   PacketBit bit = new PacketBit(40000);
   ServerProt ai;
   int al = 0;
   boolean at = true;
   int aa = 0;
   int ay = 0;
   ServerProt ao;
   ServerProt ax;
   AbstractSocket socket0;
   static Image pauseImage;

   public final void aw(PacketBitNode var1) {
      this.bitNodes.addFirst(var1);
      var1.ac = -1120134497 * var1.bit.at;
      var1.bit.at = 0;
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

   PacketWriter() {
   }

   AbstractSocket getSocket() {
      return this.socket0;
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

            this.packet.cs(var2.bit.al, 0, 1816684323 * var2.ac);
            this.serverPacket0Length -= -56666229 * var2.ac;
            var2.ga();
            var2.bit.bg();
            var2.ac();
         }
      }

   }
}
