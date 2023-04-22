public final class cr extends Node {
   int aq;
   int an;
   int aw;
   int au;
   int ab;
   int al;
   int ax;
   RawPcmStream at;
   int aa;
   int ay;
   int[] ao;
   static NodeDeque af = new NodeDeque();
   RawPcmStream ai;
   hq ag;
   int ac;
   static byte[][] jw;

   cr() {
   }

   void aw() {
      int var2 = 1671764667 * this.al;
      hq var3 = this.ag.ao();
      if (null != var3) {
         this.al = var3.ba * -853803453;
         this.aq = -981504640 * var3.bv;
         this.aa = -1756454329 * var3.bl;
         this.ay = -1723341761 * var3.bp;
         this.ao = var3.bc;
      } else {
         this.al = -24779379;
         this.aq = 0;
         this.aa = 0;
         this.ay = 0;
         this.ao = null;
      }

      if (var2 != 1671764667 * this.al && this.at != null) {
         fe.pcmStreamMixer.removeSubStream(this.at);
         this.at = null;
      }

   }
}
