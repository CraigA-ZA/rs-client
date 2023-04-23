public class fx extends fb {
   static Font fontBold12;
   String an;
   long af;
   // $FF: synthetic field
   final fa this$0;

   static void af_renamed() {
      Tiles.aw = -256673141;
      hu.ac = new short[4][104][104];
      Tiles.au = new short[4][104][104];
      Tiles.ab = new byte[4][104][104];
      Tiles.aq = new byte[4][104][104];
      ge.ag = new int[4][105][105];
      Tiles.al = new byte[4][105][105];
      Tiles.at = new int[105][105];
      gm.aa = new int[104];
      Tiles.ay = new int[104];
      kn.ao = new int[104];
      ej.ax = new int[104];
      bx.ai = new int[104];
   }

   fx(fa var1) {
      this.this$0 = var1;
      this.af = 8391907036145317981L;
      this.an = null;
   }

   void write(Packet var1) {
      if (var1.g1() != 255) {
         var1.index -= -1516355947;
         this.af = var1.g8s() * -8391907036145317981L;
      }

      this.an = var1.cz();
   }

   void an(fj var1) {
      var1.aq(-8453460473841490933L * this.af, this.an, 0, -706420067);
   }
}
