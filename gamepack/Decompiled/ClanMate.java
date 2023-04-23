public class ClanMate extends Buddy {
   TriBool isFriend0;
   TriBool isIgnored0;

   ClanMate() {
      this.isFriend0 = TriBool.TriBool_unknown;
      this.isIgnored0 = TriBool.TriBool_unknown;
   }

   void af() {
      this.isFriend0 = TriBool.TriBool_unknown;
   }

   public final boolean isFriend() {
      if (this.isFriend0 == TriBool.TriBool_unknown) {
         this.at();
      }

      return this.isFriend0 == TriBool.TriBool_true;
   }

   void at() {
      this.isFriend0 = World.friendSystem.friendsList.contains(this.username0) ? TriBool.TriBool_true : TriBool.TriBool_false;
   }

   void aa() {
      this.isIgnored0 = TriBool.TriBool_unknown;
   }

   public final boolean isIgnored() {
      if (TriBool.TriBool_unknown == this.isIgnored0) {
         this.ao();
      }

      return TriBool.TriBool_true == this.isIgnored0;
   }

   void ao() {
      this.isIgnored0 = World.friendSystem.ignoreList.contains(this.username0) ? TriBool.TriBool_true : TriBool.TriBool_false;
   }
}
