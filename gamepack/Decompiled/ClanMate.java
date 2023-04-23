public class ClanMate extends Buddy {
   TriBool af;
   TriBool an;

   ClanMate() {
      this.af = TriBool.af;
      this.an = TriBool.af;
   }

   void af() {
      this.af = TriBool.af;
   }

   public final boolean isIgnored() {
      if (this.af == TriBool.af) {
         this.at();
      }

      return this.af == TriBool.an;
   }

   void at() {
      this.af = World.vt.au.contains(this.aw) ? TriBool.an : TriBool.aw;
   }

   void aa() {
      this.an = TriBool.af;
   }

   public final boolean isFriend() {
      if (TriBool.af == this.an) {
         this.ao();
      }

      return TriBool.an == this.an;
   }

   void ao() {
      this.an = World.vt.ab.contains(this.aw) ? TriBool.an : TriBool.aw;
   }
}
