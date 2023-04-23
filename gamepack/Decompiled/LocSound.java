public final class LocSound extends Node {
   static byte[][] jw;
   static NodeDeque af = new NodeDeque();
   RawPcmStream stream2;
   RawPcmStream stream1;
   LocType obj;
   int aa;
   int ab;
   int ac;
   int soundEffectId;
   int an;
   int aq;
   int au;
   int aw;
   int ax;
   int ay;
   int[] soundEffectIds;

   LocSound() {
   }

   void set() {
      int var2 = 1671764667 * this.soundEffectId;
      LocType var3 = this.obj.multiLoc();
      if (null != var3) {
         this.soundEffectId = var3.ambientSoundId * -853803453;
         this.aq = -981504640 * var3.int4;
         this.aa = -1756454329 * var3.int5;
         this.ay = -1723341761 * var3.int6;
         this.soundEffectIds = var3.bc;
      } else {
         this.soundEffectId = -24779379;
         this.aq = 0;
         this.aa = 0;
         this.ay = 0;
         this.soundEffectIds = null;
      }

      if (var2 != 1671764667 * this.soundEffectId && this.stream1 != null) {
         fe.pcmStreamMixer.removeSubStream(this.stream1);
         this.stream1 = null;
      }

   }
}
