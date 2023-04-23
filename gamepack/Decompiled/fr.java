public class fr extends fu {
   byte an;
   int af;
   int aw;
   String ac;
   // $FF: synthetic field
   final gr this$0;

   fr(gr var1) {
      this.this$0 = var1;
      this.af = -35116265;
   }

   void write(Packet var1) {
      this.af = var1.cl() * 35116265;
      this.an = var1.g1s();
      this.aw = var1.cl() * 832186411;
      var1.g8s();
      this.ac = var1.cw();
   }

   void an(gj var1) {
      fz var3 = (fz)var1.aw.get(this.af * -1706146983);
      var3.af = this.an;
      var3.an = 905266769 * this.aw;
      var3.aw = new Username(this.ac);
   }
}
