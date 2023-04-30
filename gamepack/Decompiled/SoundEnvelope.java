public class SoundEnvelope {
   int amplitude;
   int form;
   int start;
   int segments = 2;
   int phaseIndex;
   int ticks;
   int step;
   int end;
   int max;
   int[] durations = new int[2];
   int[] phases = new int[2];

   SoundEnvelope() {
      this.durations[0] = 0;
      this.durations[1] = 65535;
      this.phases[0] = 0;
      this.phases[1] = 65535;
   }

   final void decode(Packet var1) {
      this.form = var1.g1();
      this.start = var1.g4s();
      this.end = var1.g4s();
      this.decodeSegments(var1);
   }

   final void decodeSegments(Packet var1) {
      this.segments = var1.g1();
      this.durations = new int[this.segments];
      this.phases = new int[this.segments];

      for(int var2 = 0; var2 < this.segments; ++var2) {
         this.durations[var2] = var1.cl();
         this.phases[var2] = var1.cl();
      }

   }

   final void reset() {
      this.ticks = 0;
      this.phaseIndex = 0;
      this.step = 0;
      this.amplitude = 0;
      this.max = 0;
   }

   final int doStep(int var1) {
      if (this.max >= this.ticks) {
         this.amplitude = this.phases[this.phaseIndex++] << 15;
         if (this.phaseIndex >= this.segments) {
            this.phaseIndex = this.segments - 1;
         }

         this.ticks = (int)((double)this.durations[this.phaseIndex] / 65536.0 * (double)var1);
         if (this.ticks > this.max) {
            this.step = ((this.phases[this.phaseIndex] << 15) - this.amplitude) / (this.ticks - this.max);
         }
      }

      this.amplitude += this.step;
      ++this.max;
      return this.amplitude - this.step >> 15;
   }
}
