public class FriendSystem {
   int aq = 0;
   final LoginType ac;
   public final FriendsList au;
   public final IgnoreList ab;

   FriendSystem(LoginType var1) {
      this.ac = var1;
      this.au = new FriendsList(var1);
      this.ab = new IgnoreList(var1);
   }

   boolean af() {
      return -1736413869 * this.aq == 2;
   }

   final void an() {
      this.aq = 407527131;
   }

   final void aw(Packet var1, int var2) {
      this.au.read(var1, var2);
      this.aq = 815054262;

      for(int var4 = 0; var4 < ds.ab * -2010934433; ++var4) {
         Player var5 = Client.mc[ds.aq[var4]];
         var5.clearAll();
      }

      GameShell.al_renamed();
      if (null != es.sb) {
         es.sb.ai();
      }

   }

   final void ac() {
      for(FriendLoginUpdate var2 = (FriendLoginUpdate)this.au.au.an(); null != var2; var2 = (FriendLoginUpdate)this.au.au.aw()) {
         if ((long)(var2.af * 761297005) < Formatting.af_renamed() / 1000L - 5L) {
            if (var2.aw > 0) {
               es.an_renamed(5, "", var2.an + Strings.ge);
            }

            if (var2.aw == 0) {
               es.an_renamed(5, "", var2.an + Strings.ga);
            }

            var2.remove();
         }
      }

   }

   final void clear() {
      this.aq = 0;
      this.au.clear();
      this.ab.clear();
   }

   final boolean ab(Username var1, boolean var2) {
      if (null == var1) {
         return false;
      } else if (var1.equals(MusicPatchNode.mi.af)) {
         return true;
      } else {
         return this.au.aw(var1, var2);
      }
   }

   final boolean aq(Username var1) {
      if (null == var1) {
         return false;
      } else {
         return this.ab.contains(var1);
      }
   }

   final void al(String var1) {
      if (var1 != null) {
         Username var3 = new Username(var1, this.ac);
         if (var3.hasCleanName()) {
            if (this.ao()) {
               hn.at_renamed(Strings.gl);
            } else if (MusicPatchNode.mi.af.equals(var3)) {
               bz.ay_renamed();
            } else if (this.ab(var3, false)) {
               hn.at_renamed(var1 + Strings.gz);
            } else if (this.aq(var3)) {
               Message.aa_renamed(var1);
            } else {
               PacketBitNode var4 = mi.an_renamed(ClientProt.dl, Client.in.au);
               var4.aw.bu(DynamicObject.bc_renamed(var1));
               var4.aw.bh(var1);
               Client.in.aw(var4);
            }
         }
      }
   }

   final boolean ao() {
      return this.au.isFull() || this.au.size() >= 200 && -1811511707 * Client.mo != 1;
   }

   final void ax(String var1) {
      if (var1 != null) {
         Username var3 = new Username(var1, this.ac);
         if (var3.hasCleanName()) {
            if (this.ag()) {
               hn.at_renamed(Strings.hw);
            } else if (MusicPatchNode.mi.af.equals(var3)) {
               cf.ai_renamed();
            } else if (this.aq(var3)) {
               hn.at_renamed(var1 + Strings.hi);
            } else if (this.ab(var3, false)) {
               hn.at_renamed(Strings.hd + var1 + Strings.hv);
            } else {
               PacketBitNode var4 = mi.an_renamed(ClientProt.ak, Client.in.au);
               var4.aw.bu(DynamicObject.bc_renamed(var1));
               var4.aw.bh(var1);
               Client.in.aw(var4);
            }
         }
      }
   }

   final boolean ag() {
      return this.ab.isFull() || this.ab.size() >= 100 && Client.mo * -1811511707 != 1;
   }

   final void removeFriend(String var1) {
      if (var1 != null) {
         Username var3 = new Username(var1, this.ac);
         if (var3.hasCleanName()) {
            if (this.au.removeByUsername(var3)) {
               Client.qg = Client.qu * 1831095645;
               PacketBitNode var4 = mi.an_renamed(ClientProt.am, Client.in.au);
               var4.aw.bu(DynamicObject.bc_renamed(var1));
               var4.aw.bh(var1);
               Client.in.aw(var4);
            }

            for(int var6 = 0; var6 < -2010934433 * ds.ab; ++var6) {
               Player var5 = Client.mc[ds.aq[var6]];
               var5.clearAll();
            }

            GameShell.al_renamed();
            if (es.sb != null) {
               es.sb.ai();
            }

         }
      }
   }

   public final void removeIgnore(String var1, boolean var2) {
      if (var1 != null) {
         Username var4 = new Username(var1, this.ac);
         if (var4.hasCleanName()) {
            if (this.ab.removeByUsername(var4)) {
               Client.qg = 1831095645 * Client.qu;
               if (var2) {
                  PacketBitNode var5 = mi.an_renamed(ClientProt.ag, Client.in.au);
                  var5.aw.bu(DynamicObject.bc_renamed(var1));
                  var5.aw.bh(var1);
                  Client.in.aw(var5);
               }
            }

            cz.nd_renamed();
         }
      }
   }

   final boolean am(Username var1) {
      Friend var3 = (Friend)this.au.getByUsername(var1);
      return null != var3 && var3.hasWorld();
   }

   static int ce_renamed(int var0, ClientScript var1, boolean var2) {
      return 2;
   }
}
