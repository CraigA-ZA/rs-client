public class FriendSystem {
   int aq = 0;
   final LoginType loginType;
   public final FriendsList friendsList;
   public final IgnoreList ignoreList;

   FriendSystem(LoginType var1) {
      this.loginType = var1;
      this.friendsList = new FriendsList(var1);
      this.ignoreList = new IgnoreList(var1);
   }

   boolean af() {
      return -1736413869 * this.aq == 2;
   }

   final void an() {
      this.aq = 407527131;
   }

   final void aw(Packet var1, int var2) {
      this.friendsList.read(var1, var2);
      this.aq = 815054262;

      for(int var4 = 0; var4 < ds.ab * -2010934433; ++var4) {
         Player var5 = Client.players[ds.aq[var4]];
         var5.ac();
      }

      GameShell.al_renamed();
      if (null != UserComparator5.clanChat) {
         UserComparator5.clanChat.ai();
      }

   }

   final void ac() {
      for(FriendLoginUpdate var2 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.an(); null != var2; var2 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.aw()) {
         if ((long)(var2.time * 761297005) < Formatting.currentTimeMs() / 1000L - 5L) {
            if (var2.world > 0) {
               UserComparator5.an_renamed(5, "", var2.username + Strings.Strings_hasLoggedIn);
            }

            if (var2.world == 0) {
               UserComparator5.an_renamed(5, "", var2.username + Strings.Strings_hasLoggedOut);
            }

            var2.remove();
         }
      }

   }

   final void clear() {
      this.aq = 0;
      this.friendsList.clear();
      this.ignoreList.clear();
   }

   final boolean ab(Username var1, boolean var2) {
      if (null == var1) {
         return false;
      } else if (var1.equals(MusicPatchNode.localPlayer.username)) {
         return true;
      } else {
         return this.friendsList.aw(var1, var2);
      }
   }

   final boolean aq(Username var1) {
      if (null == var1) {
         return false;
      } else {
         return this.ignoreList.contains(var1);
      }
   }

   final void al(String var1) {
      if (var1 != null) {
         Username var3 = new Username(var1, this.loginType);
         if (var3.hasCleanName()) {
            if (this.ao()) {
               hn.at_renamed(Strings.Strings_yourFriendListIsFull);
            } else if (MusicPatchNode.localPlayer.username.equals(var3)) {
               bz.ay_renamed();
            } else if (this.ab(var3, false)) {
               hn.at_renamed(var1 + Strings.Strings_isAlreadyOnYourFriendList);
            } else if (this.aq(var3)) {
               Message.aa_renamed(var1);
            } else {
               PacketBitNode var4 = mi.an_renamed(ClientProt.dl, Client.packetWriter.au);
               var4.bit.bu(DynamicObject.bc_renamed(var1));
               var4.bit.bh(var1);
               Client.packetWriter.aw(var4);
            }
         }
      }
   }

   final boolean ao() {
      return this.friendsList.isFull() || this.friendsList.size() >= 200 && -1811511707 * Client.mo != 1;
   }

   final void ax(String var1) {
      if (var1 != null) {
         Username var3 = new Username(var1, this.loginType);
         if (var3.hasCleanName()) {
            if (this.ag()) {
               hn.at_renamed(Strings.Strings_yourIgnoreListIsFull);
            } else if (MusicPatchNode.localPlayer.username.equals(var3)) {
               OwnWorldComparator.ai_renamed();
            } else if (this.aq(var3)) {
               hn.at_renamed(var1 + Strings.hi);
            } else if (this.ab(var3, false)) {
               hn.at_renamed(Strings.Strings_pleaseRemoveFriend + var1 + Strings.Strings_fromYourFriendListFirst);
            } else {
               PacketBitNode var4 = mi.an_renamed(ClientProt.ak, Client.packetWriter.au);
               var4.bit.bu(DynamicObject.bc_renamed(var1));
               var4.bit.bh(var1);
               Client.packetWriter.aw(var4);
            }
         }
      }
   }

   final boolean ag() {
      return this.ignoreList.isFull() || this.ignoreList.size() >= 100 && Client.mo * -1811511707 != 1;
   }

   final void removeFriend(String var1) {
      if (var1 != null) {
         Username var3 = new Username(var1, this.loginType);
         if (var3.hasCleanName()) {
            if (this.friendsList.removeByUsername(var3)) {
               Client.qg = Client.qu * 1831095645;
               PacketBitNode var4 = mi.an_renamed(ClientProt.am, Client.packetWriter.au);
               var4.bit.bu(DynamicObject.bc_renamed(var1));
               var4.bit.bh(var1);
               Client.packetWriter.aw(var4);
            }

            for(int var6 = 0; var6 < -2010934433 * ds.ab; ++var6) {
               Player var5 = Client.players[ds.aq[var6]];
               var5.ac();
            }

            GameShell.al_renamed();
            if (UserComparator5.clanChat != null) {
               UserComparator5.clanChat.ai();
            }

         }
      }
   }

   public final void removeIgnore(String var1, boolean var2) {
      if (var1 != null) {
         Username var4 = new Username(var1, this.loginType);
         if (var4.hasCleanName()) {
            if (this.ignoreList.removeByUsername(var4)) {
               Client.qg = 1831095645 * Client.qu;
               if (var2) {
                  PacketBitNode var5 = mi.an_renamed(ClientProt.ag, Client.packetWriter.au);
                  var5.bit.bu(DynamicObject.bc_renamed(var1));
                  var5.bit.bh(var1);
                  Client.packetWriter.aw(var5);
               }
            }

            Login.nd_renamed();
         }
      }
   }

   final boolean am(Username var1) {
      Friend var3 = (Friend)this.friendsList.getByUsername(var1);
      return null != var3 && var3.hasWorld();
   }

   static int ce_renamed(int var0, ClientScript var1, boolean var2) {
      return 2;
   }
}
