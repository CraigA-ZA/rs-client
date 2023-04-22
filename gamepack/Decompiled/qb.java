public class qb extends qg {
   public qb(int var1) {
   }

   static void openMenu0(int var0, int var1) {
      int var3 = fx.fontBold12.ao(Strings.Strings_chooseOption);

      int var4;
      int var5;
      for(var4 = 0; var4 < Client.menuOptionsCount * 730065501; ++var4) {
         var5 = fx.fontBold12.ao(Friend.lg_renamed(var4));
         if (var5 > var3) {
            var3 = var5;
         }
      }

      var3 += 8;
      var4 = Client.menuOptionsCount * -1933919373 + 22;
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

      hl.menuY = var5 * -945723825;
      ArchiveLoader.menuWidth = 232216885 * var6;
      DesktopPlatformInfoProvider.menuHeight = -760159457 * var3;
      fq.menuX = 1585038229 * Client.menuOptionsCount + 167124602;
   }

   void af(Packet var1, int var2) {
   }

   static int an_renamed(int var0, int var1) {
      Inventory var3 = (Inventory)Inventory.itemContainers.get((long)var0);
      if (var3 == null) {
         return 0;
      } else {
         return var1 >= 0 && var1 < var3.quantities.length ? var3.quantities[var1] : 0;
      }
   }
}
