public class ClanMate extends Buddy {
   TriBool isIgnored0;
   TriBool isFriend0;

   ClanMate() {
      this.isIgnored0 = TriBool.TriBool_unknown;
      this.isFriend0 = TriBool.TriBool_unknown;
   }

   void af() {
      this.isIgnored0 = TriBool.TriBool_unknown;
   }

   public final boolean isIgnored() {
      if (this.isIgnored0 == TriBool.TriBool_unknown) {
         this.at();
      }

      return this.isIgnored0 == TriBool.TriBool_true;
   }

   void at() {
      this.isIgnored0 = World.friendSystem.friendsList.contains(this.previousUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
   }

   void aa() {
      this.isFriend0 = TriBool.TriBool_unknown;
   }

   public final boolean isFriend() {
      if (TriBool.TriBool_unknown == this.isFriend0) {
         this.ao();
      }

      return TriBool.TriBool_true == this.isFriend0;
   }

   void ao() {
      this.isFriend0 = World.friendSystem.ignoreList.contains(this.previousUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
   }
}
