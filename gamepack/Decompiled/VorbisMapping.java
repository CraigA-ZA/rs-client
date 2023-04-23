public class VorbisMapping {
   int af;
   int an;
   int[] ac;
   int[] aw;

   VorbisMapping() {
      VorbisSample.VorbisSample_readBits(16);
      this.af = VorbisSample.VorbisSample_readBit() != 0 ? VorbisSample.VorbisSample_readBits(4) + 1 : 1;
      if (VorbisSample.VorbisSample_readBit() != 0) {
         VorbisSample.VorbisSample_readBits(8);
      }

      VorbisSample.VorbisSample_readBits(2);
      if (this.af > 1) {
         this.an = VorbisSample.VorbisSample_readBits(4);
      }

      this.aw = new int[this.af];
      this.ac = new int[this.af];

      for(int var1 = 0; var1 < this.af; ++var1) {
         VorbisSample.VorbisSample_readBits(8);
         this.aw[var1] = VorbisSample.VorbisSample_readBits(8);
         this.ac[var1] = VorbisSample.VorbisSample_readBits(8);
      }

   }
}
