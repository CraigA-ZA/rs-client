public class qb extends qg {
   public qb(int var1) {
   }

   void af(Packet var1, int var2) {
   }

   static int an_renamed(int var0, int var1) {
      Inventory var3 = (Inventory)Inventory.af.get((long)var0);
      if (var3 == null) {
         return 0;
      } else {
         return var1 >= 0 && var1 < var3.aw.length ? var3.aw[var1] : 0;
      }
   }

   static void openMenu0(int var0, int var1) {
      int var3 = fx.ip.stringWidth(Strings.gd);

      int var4;
      int var5;
      for(var4 = 0; var4 < Client.ne * 730065501; ++var4) {
         var5 = fx.ip.stringWidth(Friend.lg_renamed(var4));
         if (var5 > var3) {
            var3 = var5;
         }
      }

      var3 += 8;
      var4 = Client.ne * -1933919373 + 22;
      var5 = var0 - var3 / 2;
      if (var3 + var5 > Client.aj * -1687260435) {
         var5 = -1687260435 * Client.aj - var3;
      }

      if (var5 < 0) {
         var5 = 0;
      }

      int var6 = var1;
      if (var4 + var1 > 1658005443 * kd.ak) {
         var6 = kd.ak * 1658005443 - var4;
      }

      if (var6 < 0) {
         var6 = 0;
      }

      hl.nf = var5 * -945723825;
      ArchiveLoader.nc = 232216885 * var6;
      DesktopPlatformInfoProvider.nj = -760159457 * var3;
      fq.nv = 1585038229 * Client.ne + 167124602;
   }
}
