public class PacketBit extends Packet {
   static final int[] PacketBit_masks = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   int bitIndex;
   Isaac isaac0;

   public PacketBit(int var1) {
      super(var1);
   }

   public void newIsaac(int[] var1) {
      this.isaac0 = new Isaac(var1);
   }

   public void an(Isaac var1) {
      this.isaac0 = var1;
   }

   public void pIsaac1(int var1) {
      this.array[(this.index += -1516355947) * -1633313603 - 1] = (byte)(var1 + this.isaac0.af());
   }

   public int gIsaac1() {
      return this.array[(this.index += -1516355947) * -1633313603 - 1] - this.isaac0.af() & 255;
   }

   public boolean au() {
      int var2 = this.array[-1633313603 * this.index] - this.isaac0.an() & 255;
      return var2 >= 128;
   }

   public int gIsaacSmart1or2() {
      int var2 = this.array[(this.index += -1516355947) * -1633313603 - 1] - this.isaac0.af() & 255;
      return var2 < 128 ? var2 : (var2 - 128 << 8) + (this.array[(this.index += -1516355947) * -1633313603 - 1] - this.isaac0.af() & 255);
   }

   public void aq(byte[] var1, int var2, int var3) {
      for(int var5 = 0; var5 < var3; ++var5) {
         var1[var2 + var5] = (byte)(this.array[(this.index += -1516355947) * -1633313603 - 1] - this.isaac0.af());
      }

   }

   public void importIndex() {
      this.bitIndex = this.index * 818064504;
   }

   public int gBit(int var1) {
      int var3 = this.bitIndex * 2050374387 >> 3;
      int var4 = 8 - (2050374387 * this.bitIndex & 7);
      int var5 = 0;

      for(this.bitIndex += 1243901499 * var1; var1 > var4; var4 = 8) {
         var5 += (this.array[var3++] & PacketBit_masks[var4]) << var1 - var4;
         var1 -= var4;
      }

      if (var4 == var1) {
         var5 += this.array[var3] & PacketBit_masks[var4];
      } else {
         var5 += this.array[var3] >> var4 - var1 & PacketBit_masks[var1];
      }

      return var5;
   }

   public void exportIndex() {
      this.index = -1516355947 * ((this.bitIndex * 2050374387 + 7) / 8);
   }

   public int bitsRemaining(int var1) {
      return 8 * var1 - this.bitIndex * 2050374387;
   }
}
