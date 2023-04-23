public abstract class Clock {
   Clock() {
   }

   static final void np_renamed(int var0, int var1, boolean var2) {
      if (Client.so[var0] != null) {
         if (var1 >= 0 && var1 < Client.so[var0].gIsaac1()) {
            fz var4 = (fz)Client.so[var0].aw.get(var1);
            PacketBitNode var5 = mi.an_renamed(ClientProt.dg, Client.in.au);
            var5.aw.bu(4 + DynamicObject.bc_renamed(var4.aw.af()));
            var5.aw.bu(var0);
            var5.aw.p2(var1);
            var5.aw.pbool(var2);
            var5.aw.bh(var4.aw.af());
            Client.in.aw(var5);
         }
      }
   }

   public abstract int wait(int var1, int var2);

   public abstract void mark();
}
