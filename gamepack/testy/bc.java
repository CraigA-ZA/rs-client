import accessors.RSVorbisMapping;

public class bc implements RSVorbisMapping {
   int[] aw;
   int an;
   int af;
   int[] ac;

   bc() {
      ce.ac(16);
      this.af = ce.aw() != 0 ? ce.ac(4) + 1 : 1;
      if (ce.aw() != 0) {
         ce.ac(8);
      }

      ce.ac(2);
      if (this.af > 1) {
         this.an = ce.ac(4);
      }

      this.aw = new int[this.af];
      this.ac = new int[this.af];

      for(int var1 = 0; var1 < this.af; ++var1) {
         ce.ac(8);
         this.aw[var1] = ce.ac(8);
         this.ac[var1] = ce.ac(8);
      }

   }
}
