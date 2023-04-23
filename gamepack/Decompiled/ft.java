public class ft extends fb {
   int aw;
   String an;
   long af;
   // $FF: synthetic field
   final fa this$0;

   public static void af_renamed(Huffman var0) {
      mv.huffman = var0;
   }

   ft(fa var1) {
      this.this$0 = var1;
      this.af = -5362405580622353499L;
      this.an = null;
      this.aw = 0;
   }

   void af(Packet var1) {
      if (var1.g1() != 255) {
         var1.index -= -1516355947;
         this.af = var1.g8s() * 5362405580622353499L;
      }

      this.an = var1.cz();
      this.aw = var1.cl() * 36444545;
   }

   void an(fj var1) {
      var1.aq(this.af * -6441306749678142509L, this.an, this.aw * 251537025, -706420067);
   }
}
