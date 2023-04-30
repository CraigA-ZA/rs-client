public class fk extends fu {
   int af;
   byte an;
   int aw;
   String ac;
   // $FF: synthetic field
   final gr this$0;
   static final int aq = 64;
   static final int bx = 14;
   public static final int as = 38;

   void aw(sg var1) {
      var1.cm((byte)7);
      this.af = var1.cl(-553048923) * -1219308877;
      this.an = var1.cf(435772489);
      this.aw = var1.cl(-1774547427) * 528201959;
      var1.cv((byte)1);
      this.ac = var1.cw((byte)0);
      var1.cm((byte)7);
   }

   void af(sg var1, int var2) {
      try {
         var1.cm((byte)7);
         this.af = var1.cl(515727020) * -1435810339;
         this.an = var1.cf(435772489);
         this.aw = var1.cl(89530974) * 528201959;
         var1.cv((byte)1);
         this.ac = var1.cw((byte)0);
         var1.cm((byte)7);
      } catch (RuntimeException var3) {
         throw db.an(var3, "fk.af(" + ')');
      }
   }

   void an(gj var1, byte var2) {
      try {
         fz var3 = (fz)var1.aw.get(this.af * 233388661);
         var3.af = this.an;
         var3.an = this.aw * -359370451;
         var3.aw = new tm(this.ac);
      } catch (RuntimeException var4) {
         throw db.an(var4, "fk.an(" + ')');
      }
   }

   void ac(sg var1) {
      var1.cm((byte)7);
      this.af = var1.cl(-316739018) * -1435810339;
      this.an = var1.cf(435772489);
      this.aw = var1.cl(-2066953748) * 528201959;
      var1.cv((byte)1);
      this.ac = var1.cw((byte)0);
      var1.cm((byte)7);
   }

   fk(gr var1) {
      try {
         this.this$0 = var1;
         super();
         this.af = 1435810339;
      } catch (RuntimeException var2) {
         throw db.an(var2, "fk.<init>(" + ')');
      }
   }

   void au(sg var1) {
      var1.cm((byte)7);
      this.af = var1.cl(-1687374595) * -1435810339;
      this.an = var1.cf(435772489);
      this.aw = var1.cl(-1425281996) * 528201959;
      var1.cv((byte)1);
      this.ac = var1.cw((byte)0);
      var1.cm((byte)7);
   }

   void ab(gj var1) {
      fz var2 = (fz)var1.aw.get(this.af * -1806391379);
      var2.af = this.an;
      var2.an = this.aw * -359370451;
      var2.aw = new tm(this.ac);
   }

   void aq(gj var1) {
      fz var2 = (fz)var1.aw.get(this.af * 233388661);
      var2.af = this.an;
      var2.an = this.aw * -2028359431;
      var2.aw = new tm(this.ac);
   }

   public static void af(nm var0, nm var1, nm var2, int var3) {
      try {
         ha.au = var0;
         ha.ab = var1;
         ha.aq = var2;
      } catch (RuntimeException var4) {
         throw db.an(var4, "fk.af(" + ')');
      }
   }
}
