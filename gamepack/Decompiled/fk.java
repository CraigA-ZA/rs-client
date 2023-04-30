public class fk extends fu {
   byte an;
   int af;
   int aw;
   String ac;
   // $FF: synthetic field
   final gr this$0;

   public static void af_renamed(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
      SeqType.SeqType_archive = var0;
      SeqType.ab = var1;
      SeqType.aq = var2;
   }

   fk(gr var1) {
      this.this$0 = var1;
      this.af = 1435810339;
   }

   void af(Packet var1) {
      var1.g1();
      this.af = var1.cl() * -1435810339;
      this.an = var1.g1s();
      this.aw = var1.cl() * 528201959;
      var1.g8s();
      this.ac = var1.cw();
      var1.g1();
   }

   void an(gj var1) {
      fz var3 = (fz)var1.aw.get(this.af * 233388661);
      var3.af = this.an;
      var3.an = this.aw * -359370451;
      var3.aw = new Username(this.ac);
   }
}
