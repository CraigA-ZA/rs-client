public class VorbisMapping {
   int submaps;
   int mappingMux;
   int[] submapResidue;
   int[] submapFloor;

   VorbisMapping() {
      VorbisSample.VorbisSample_readBits(16);
      this.submaps = VorbisSample.VorbisSample_readBit() != 0 ? VorbisSample.VorbisSample_readBits(4) + 1 : 1;
      if (VorbisSample.VorbisSample_readBit() != 0) {
         VorbisSample.VorbisSample_readBits(8);
      }

      VorbisSample.VorbisSample_readBits(2);
      if (this.submaps > 1) {
         this.mappingMux = VorbisSample.VorbisSample_readBits(4);
      }

      this.submapFloor = new int[this.submaps];
      this.submapResidue = new int[this.submaps];

      for(int var1 = 0; var1 < this.submaps; ++var1) {
         VorbisSample.VorbisSample_readBits(8);
         this.submapFloor[var1] = VorbisSample.VorbisSample_readBits(8);
         this.submapResidue[var1] = VorbisSample.VorbisSample_readBits(8);
      }

   }
}
